/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.aiidc.env.ergs.common.mail.SendMailService;
import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.common.security.EnvPasswordEncoder;
import com.aiidc.env.ergs.constant.ProductType;
import com.aiidc.env.ergs.jpa.po.pw.Register;
import com.aiidc.env.ergs.jpa.po.pw.SJDW;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.jpa.repo.pw.RegisterDao;
import com.aiidc.env.ergs.jpa.repo.pw.SJDWDao;
import com.aiidc.env.ergs.jpa.repo.pw.UserDao;
import com.aiidc.env.ergs.service.pw.RegisterService;
import com.aiidc.env.ergs.service.pw.vo.RegistQryVo;

import freemarker.template.TemplateException;

/**
 * @author wuwenjun
 *
 */
@Service
public class RegisterServiceImpl implements RegisterService {
	@Resource
	private RegisterDao dao;

	@Resource
	private UserDao userDao;
	@Resource
	private SJDWDao sjdwDao;

	@Autowired(required = false)
	private SendMailService mailService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.service.o3.RegisterService#regist(com.aiidc.env.ergs.
	 * jpa.po.pw.Register)
	 */
	@Override
	public void regist(Register register) {
		dao.save(register);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.service.pw.RegisterService#get(java.lang.Long)
	 */
	@Override
	public Register get(Long registerId) {
		return dao.findOne(registerId);
	}

	@Override
	public Page<Register> find(QryPageVo qryVo, RegistQryVo registQryVo) {
		Specification<Register> spec = new Specification<Register>() {
			@Override
			public Predicate toPredicate(Root<Register> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				if (StringUtils.hasText(registQryVo.getCompanyName())) {
					list.add(cb.like(root.get("companyName"), "%" + registQryVo.getCompanyName() + "%"));
				}
				if (StringUtils.hasText(registQryVo.getCreditCode())) {
					list.add(cb.like(root.get("creditCode"), "%" + registQryVo.getCreditCode() + "%"));
				}
				if (StringUtils.hasText(registQryVo.getRegistTime())) {
					list.add(cb.between(root.get("registTime"), registQryVo.getRegistStartTime(),
							registQryVo.getRegistEndTime()));
				}
				return cb.and(list.toArray(new Predicate[list.size()]));
			}
		};
		return dao.findAll(spec, qryVo.pageRequest());
	}

	@Override
	public void audit(Long registerId, boolean sucess, String view)
			throws MessagingException, IOException, TemplateException {
		Register item = dao.findOne(registerId);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("companyName", item.getCompanyName());
		model.put("registTime", item.getRegistTime());
		model.put("reason", view);
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		model.put("context", request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath());
		model.put("registId", item.getId());
		model.put("time", new Date());
		if (sucess) {
			SJDW sjdw = new SJDW();
			sjdw.setCode(item.getZipCode());
			SJDW groupSjwd = sjdwDao.findOne(new Specification<SJDW>() {
				@Override
				public Predicate toPredicate(Root<SJDW> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					List<Predicate> list = new ArrayList<Predicate>();
					list.add(cb.equal(root.get("manuf"), item.getGroupName()));
					list.add(cb.equal(root.get("manufshort"), item.getGroupName()));
					return cb.or(list.toArray(new Predicate[list.size()]));
				}
			});
			sjdw.setConfig(null);
			sjdw.setCreatedate(new Date());
			sjdw.setDll(null);
			sjdw.setEmail(item.getEmail());
			sjdw.setFax(item.getFax());
			sjdw.setFddbr(item.getLegalPerson());
			sjdw.setFrtel(null);
			if (groupSjwd != null) {
				sjdw.setGroupid(String.valueOf(groupSjwd.getManufid()));
				sjdw.setGroupmanuf(groupSjwd.getManuf());
			} else {
				sjdw.setGroupid("0");
				sjdw.setGroupmanuf(item.getCompanyName());
			}
			sjdw.setJb("C");
			sjdw.setJfrq(new Date());
			sjdw.setLxr(item.getLinkman());
			sjdw.setManuf(item.getCompanyName());
			sjdw.setManufshort(item.getCompanyName());
			List<ProductType> pts = item.getProductTypes();
			StringBuffer mtype = new StringBuffer();
			for (ProductType productType : pts) {
				mtype.append(productType.getValue()).append(";");
			}
			sjdw.setMtype(mtype.toString());
			sjdw.setProvince(item.getProvince());
			sjdw.setQydz(item.getCompanyAddress());
			sjdw.setQytel(item.getTel());
			sjdw.setSbfzr(item.getHeader());
			sjdw.setScqydz(item.getCompanyAddress());
			sjdw.setScqymc(item.getCompanyName());
			sjdw.setTel(item.getTel());
			sjdw.setCode("");
			sjdw.setConfig("");
			sjdw.setDll("");
			sjdw.setFrtel("");
			sjdw.setJylb("");
			sjdw.setType("000000");
			sjdw.setVersion("");
			sjdw.setJzrq(new Date());
			sjdw.setYwqc("");
			sjdw.setYwsx("");
			sjdw.setYxrq(new Date());
			sjdwDao.save(sjdw);
			User user = new User();
			user.setUsername("Admin");
			user.setCreatedate(new Date());
			user.setDepart("");
			user.setDuty("本企业在系统中得管理人员");
			user.setEmail(item.getEmail());
			user.setFax(item.getFax());
			user.setFlag(new Character('Y'));
			user.setManufid(String.valueOf(sjdw.getManufid()));
			user.setMobile(item.getTel());
			user.setName("管理员");
			String pwd = RandomStringUtils.randomAlphanumeric(6);
			user.setPassword(new EnvPasswordEncoder().encode(pwd));
			user.setSfzbh("");
			user.setSuperAdmin(false);
			user.setTel(item.getTel());
			user.setUaddress(item.getCompanyAddress());
			List<Long> permids = new ArrayList<Long>();
			permids.add(26L);
			permids.add(27L);
			permids.add(28L);
			permids.add(29L);
			permids.add(30L);
			user.setPermids(permids);
			userDao.save(user);
			model.put("manufid", user.getManufid());
			model.put("username", user.getUsername());
			model.put("pwd", pwd);
			mailService.sendMail(item.getEmail(), "注册成功", "auditSuccess.ftl", model, null, null);
			item.setAudited(true);
			item.setManufId(String.valueOf(sjdw.getManufid()));
			dao.save(item);
		} else {

			mailService.sendMail(item.getEmail(), "注册审核不通过", "auditFail.ftl", model, null, null);
			item.setAudited(false);
			dao.save(item);
		}
	}

}
