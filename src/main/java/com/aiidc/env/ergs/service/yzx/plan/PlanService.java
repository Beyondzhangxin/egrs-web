package com.aiidc.env.ergs.service.yzx.plan;

import org.springframework.data.domain.Page;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.yzx.plan.Plan;

public interface PlanService {
	//根据maufId查询所有的计划书;
	Page<Plan> findAllPlan(Plan plan,QryPageVo qryVo);
	//添加计划书;
	public void addPlan(Plan plan);
	//多条件模糊查询;
	public Page<Plan> findbyCriteriPage(Plan plan,QryPageVo qryVo);
	//修改计划书；
	public void updatePlan(Plan plan);
	//查询某个计划书
	public Plan findPlan(String jhsbh);
	//审核计划书
	public int examPlan(Plan plan);
	//备案计划书
	public int recordPlan(Plan plan);
	//删除计划书
	public int delPlan(String jhsbh);
	//提交计划书
	public int referPlan(Plan plan);
}
