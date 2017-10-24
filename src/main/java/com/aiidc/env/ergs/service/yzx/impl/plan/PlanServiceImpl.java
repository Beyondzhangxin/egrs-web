package com.aiidc.env.ergs.service.yzx.impl.plan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.constant.PlanStatus;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.jpa.po.yzx.plan.Plan;
import com.aiidc.env.ergs.jpa.repo.yzx.plan.PlanDao;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;
import com.aiidc.env.ergs.service.yzx.plan.PlanService;

/**
 * 计划书
 * 
 * @author jiabin fan
 *
 */
@Service
public class PlanServiceImpl implements PlanService {
	@Resource
	private PlanDao planDao;

	// 根据manufid查询所有的计划书
	@Override
	public Page<Plan> findAllPlan(Plan plan, QryPageVo qryVo) {

		return findbyCriteriPage(plan, qryVo);
	}

	// 添加计划书;
	@Override
	public void addPlan(Plan plan) {
		planDao.save(plan);

	}

	// 模糊多条件查询
	public Page<Plan> findbyCriteriPage(Plan plan, QryPageVo qryVo) {
		plan.setManufid(LoginUserUtil.getLoginManufid());
		Page<Plan> page = planDao.findAll(new Specification<Plan>() {
			@Override
			public Predicate toPredicate(Root<Plan> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();

				if (StringUtils.isNotBlank(plan.getJhsbh())) {
					list.add(cb.like(root.get("jhsbh").as(String.class), "%" + plan.getJhsbh() + "%"));
				}

				if (StringUtils.isNotBlank(plan.getNbbh())) {
					list.add(cb.like(root.get("nbbh").as(String.class), "%" + plan.getNbbh() + "%"));
				}

				if (StringUtils.isNotBlank(plan.getCjr())) {
					list.add(cb.like(root.get("cjr").as(String.class), "%" + plan.getCjr() + "%"));
				}
				if (StringUtils.isNotBlank(plan.getManufid())) {
					list.add(cb.like(root.get("manufid").as(String.class), "%" + plan.getManufid() + "%"));
				}

				Predicate[] p = new Predicate[list.size()];
				return cb.and(list.toArray(p));
			}

		}, qryVo.pageRequest());
		return page;
	}

	/**
	 * 修改计划书
	 */
	@Override
	public void updatePlan(Plan plan) {
		planDao.save(plan);
	}

	/**
	 * 根据计划书编号查询计划书
	 */
	@Override
	public Plan findPlan(String jhsbh) {
		// 查询出plan；
		return planDao.findByjhsbh(jhsbh);
	}

	/*
	 * 审核计划书
	 */
	@Override
	public int examPlan(Plan plan) {
		// 获取当前的用户
		User user = (User) LoginUserUtil.getLoginUser().getDetail();
		// 设置审核人和审核时间；
		plan.setSpr(user.getName());
		plan.setShsj(new Date());
		/*plan.setStatus(PlanStatus.PLAN_SQZ + "");*/

		// 执行保存；
		planDao.save(plan);
		return 1;
	}

	/*
	 * 计划书备案
	 */
	@Override
	public int recordPlan(Plan plan) {
		// 获取当前的用户
		User user = (User) LoginUserUtil.getLoginUser().getDetail();
		// 设置审核人和审核时间；
		plan.setBar(user.getName());
		plan.setBasj(new Date());
		//plan.setStatus(PlanStatus.PLAN_YBA + "");

		// 执行保存；
		planDao.save(plan);
		
		return 1;
	}

	/*
	 * 删除计划书
	 */
	@Override
	public int delPlan(String jhsbh) {
		planDao.delete(jhsbh);
		return 1;
	}

	/* 
	 * 提交计划书
	 */
	@Override
	public int referPlan(Plan plan) {
		
		plan.setStatus(PlanStatus.PLAN_SQZ + "");

		// 执行保存；
		planDao.save(plan);
		
		return 1;
	}
}
