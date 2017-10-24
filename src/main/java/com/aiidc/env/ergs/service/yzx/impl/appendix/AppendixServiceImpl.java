package com.aiidc.env.ergs.service.yzx.impl.appendix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.common.util.SpringContextUtil;
import com.aiidc.env.ergs.common.util.StringUtil;
import com.aiidc.env.ergs.constant.PlanStatus;
import com.aiidc.env.ergs.constant.Type;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.Appendix;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.AppendixDao;
import com.aiidc.env.ergs.jpa.repo.yzx.plan.PlanDao;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;
import com.aiidc.env.ergs.service.yzx.appendix.AppendixService;
import com.aiidc.env.ergs.service.yzx.appendix.DeleteService;
import com.aiidc.env.ergs.service.yzx.plan.PlanMXService;

/**
 * 附录
 * 
 * @author jiabin fan
 *
 */
@Service
public class AppendixServiceImpl implements AppendixService {
	private Logger logger = LoggerFactory.getLogger(AppendixServiceImpl.class);
	// 注入附录dao
	@Resource
	private AppendixDao appendixDao;
	@Resource
	private PlanDao planDao;
	@Resource
	private PlanMXService planMXService;

	// 获取所有的附录
	@Override
	public Page<Appendix> findAllAppendix(String jhsbh, QryPageVo qryVo, Appendix appendix) {

		Page<Appendix> page = appendixDao.findAll(new Specification<Appendix>() {
			@Override
			public Predicate toPredicate(Root<Appendix> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();

				if (StringUtils.isNotBlank(jhsbh)) {
					list.add(cb.like(root.get("flbh").as(String.class), "%" + jhsbh + "%"));
				}
				if (StringUtils.isNotBlank(appendix.getFlbh())) {
					list.add(cb.like(root.get("flbh"), "%" + appendix.getFlbh() + "%"));
				}
				if (StringUtils.isNotBlank(appendix.getStatus())) {
					list.add(cb.equal(root.get("status"), appendix.getStatus()));
				}
				if (StringUtils.isNotBlank(appendix.getNbbh())) {
					list.add(cb.like(root.get("nbbh"), "%" + appendix.getNbbh() + "%"));
				}

				Predicate[] p = new Predicate[list.size()];
				return cb.and(list.toArray(p));
			}

		}, qryVo.pageRequest());

		return page;
	}

	// 创建附录；
	@Override
	public void addAppendix(Appendix appendix, String jhsbh) {

		// 获取User;
		User user = (User) LoginUserUtil.getLoginUser().getDetail();
		appendix.setCjr(user.getName());
		appendix.setCjrid(user.getUserid() + "");
		appendix.setCjsj(new Date());

		// 根据计划书编号生成附录编号；
		String flbh = generatFlbh(jhsbh);
		appendix.setFlbh(flbh);

		// 获取附录类别；
		Integer vehicleType = new Integer(flbh.substring(5, 6));
		// 设置附录类别；
		appendix.setFllb(Type.getVehicleType(vehicleType));

		// 设置version
		appendix.setVersion(1);
		// 设置status
		appendix.setStatus("0");
		// 设置flag
		appendix.setFlag("XXGK");
		// 查询内部编号；
		String nbbh = planDao.findByjhsbh(jhsbh).getNbbh();
		appendix.setNbbh(nbbh);

		// 更新PlanMX;
		planMXService.saveFlbh(jhsbh, flbh);

		appendixDao.save(appendix);
	}

	// 查找单个附录标号；
	@Override
	public Appendix findAppendix(String flbh) {

		return appendixDao.findOne(flbh);
	}

	// 生成附录编号
	public String generatFlbh(String jhsbh) {
		// 创建一个list用于存放流水号
		List<Integer> flbhEnds = new ArrayList<>();
		// 获取计划书对应的所有的附录编号
		List<String> flbhs = appendixDao.findByFlbh(jhsbh);
		// 对flbhs进行判断
		if (flbhs != null && flbhs.size() > 0) {
			for (String flbh : flbhs) {
				// 获取附录号的最后两位
				Integer flbhEnd = new Integer(flbh.substring(15, 17));
				flbhEnds.add(flbhEnd);
			}

			Collections.sort(flbhEnds, Collections.reverseOrder());
		} else {
			flbhEnds.add(0);
		}
		Integer bh = flbhEnds.get(0);
		if (bh > 99) {
			throw new RuntimeException("只能创建99个附录！");
		}
		String nbh = flbhEnds.get(0) + 1 + "";

		if (nbh.length() < 2) {
			nbh = StringUtil.getNo(nbh, 2);
		}
		return jhsbh + "-" + nbh;
	}

	/*
	 * 删除附录
	 */
	@Override
	public int deleteAppendix(String flbh) {
		appendixDao.deleteByFlbh(flbh);
		// 获取车辆类别号；
		Integer vehicleNum = (int) flbh.charAt(5);
		// 获取车辆类别；
		String vehicleLb = Type.getVehicleLb(vehicleNum);
		try {
			// 根据类别到不同的删除的service;
			DeleteService deleteService = SpringContextUtil.getBean(vehicleLb + "DeleteService", DeleteService.class);
			// 执行删除操作；
			deleteService.delete(flbh);
		} catch (BeansException e) {
			e.printStackTrace();
		}
		return 1;
	}

	/*
	 * 提交附录
	 */
	@Override
	public int referAppendix(Appendix appendix) {
		appendix.setStatus(PlanStatus.PLAN_SQZ + "");
		appendixDao.save(appendix);
		return 1;
	}

	/*
	 * 审核附录
	 */
	@Override
	public int examAppendix(Appendix appendix) {
		// 获取当前的用户
		User user = (User) LoginUserUtil.getLoginUser().getDetail();
		// 设置审核人和审核时间；
		appendix.setSpr(user.getName());
		appendix.setShsj(new Date());
		appendixDao.save(appendix);
		return 1;
	}

	/*
	 * 备案附录
	 */
	@Override
	public int recordAppendix(Appendix appendix) {
		// 获取当前的用户
		User user = (User) LoginUserUtil.getLoginUser().getDetail();
		// 设置审核人和审核时间；
		appendix.setSpr(user.getName());
		appendix.setShsj(new Date());
		appendixDao.save(appendix);
		return 1;
	}

	/*
	 * 根据计划书编号查询附录
	 */
	@Override
	public Appendix findApp(String jhsbh) {

		return appendixDao.findByJhsbh(jhsbh);
	}
}
