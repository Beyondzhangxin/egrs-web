/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.RandomStringUtils;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;
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
import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.jpa.repo.pw.UserDao;
import com.aiidc.env.ergs.service.pw.UserService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;
import com.aiidc.env.ergs.service.pw.vo.UserUpdateVo;

/**
 * @author wuwenjun
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao dao;
	@Autowired
	private SendMailService mailService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.service.pw.UserService#save(com.aiidc.env.ergs.jpa.po.
	 * pw.User)
	 */
	@Override
	public void save(User vo) {
		vo.setManufid(LoginUserUtil.getLoginManufid());
		if (vo.getUserid() != null) {
			User item = dao.findOne(vo.getUserid());
			vo.setModifydate(new Date());
			BeanUtil.copyProperties(vo, item);
			dao.save(item);
		} else {
			Integer emailNum = dao.countByEmail(vo.getEmail());
			if (emailNum == 0) {
				Integer userNameNum = dao.countByManufidAndUsername(vo.getManufid(), vo.getUsername());
				if (userNameNum == 0) {
					vo.setCreatedate(new Date());
					vo.setModifydate(new Date());
					vo.setFlag('Y');
					String pwd = RandomStringUtils.randomAlphanumeric(6);
					vo.setPassword(new EnvPasswordEncoder().encode(pwd));
					dao.save(vo);
					try {
						Map<String, Object> model = new HashMap<String, Object>();
						model.put("pwd", pwd);
						model.put("user", vo);
						model.put("time", new Date());
						HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
								.getRequestAttributes()).getRequest();
						model.put("context", request.getScheme() + "://" + request.getServerName() + ":"
								+ request.getServerPort() + request.getContextPath());
						mailService.sendMail(vo.getEmail(), "用户开通通知", "userAdd.ftl", model, null, null);
					} catch (Exception e) {
						throw new RuntimeException("注册邮件发送失败");
					}
				} else {
					throw new RuntimeException("用户名已被注册");
				}
			} else {
				throw new RuntimeException("邮件地址已被注册");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.service.pw.UserService#update(com.aiidc.env.ergs.
	 * service.pw.vo.UserUpdateVo)
	 */
	@Override
	public void update(UserUpdateVo vo) {
		User item = dao.findOne(vo.getUserid());
		BeanUtils.copyProperties(vo, item);
		dao.save(item);
		LoginUserUtil.updateUser(item);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.service.pw.UserService#delete(java.lang.Long)
	 */
	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.service.pw.UserService#changePassword(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public int changePassword(String oldPwd, String newPwd) {
		User user = LoginUserUtil.getLoginUserDetail();
		EnvPasswordEncoder encoder = new EnvPasswordEncoder();
		boolean match = encoder.matches(oldPwd, user.getPassword());
		if (match) {
			user.setPassword(encoder.encode(newPwd));
			dao.save(user);
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public Page<User> find(QryPageVo qryVo, User user) {
		Specification<User> spec = new Specification<User>() {
			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				list.add(cb.equal(root.get("manufid"), LoginUserUtil.getLoginManufid()));
				if (StringUtils.hasText(user.getUsername())) {
					list.add(cb.like(root.get("username"), "%" + user.getUsername() + "%"));
				}
				if (StringUtils.hasText(user.getName())) {
					list.add(cb.like(root.get("name"), "%" + user.getName() + "%"));
				}
				Restrictions.in("", new Integer[] { 1, 23, 3 });
				list.add(cb.notEqual(root.get("username"), "Admin"));
				return cb.and(list.toArray(new Predicate[list.size()]));
			}
		};
		return dao.findAll(spec, qryVo.pageRequest());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.service.pw.UserService#get(java.lang.Long)
	 */
	@Override
	public User get(Long id) {
		return dao.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.service.pw.UserService#changAuth(java.lang.Long,
	 * java.lang.Long[])
	 */
	@Override
	public void changAuth(Long id, Long[] permids) {
		User item = dao.findOne(id);
		item.setPermids(Arrays.asList(permids));
	}

}
