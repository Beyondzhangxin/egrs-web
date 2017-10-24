package com.aiidc.env.ergs.jpa.repo.yzx.plan;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.aiidc.env.ergs.jpa.po.yzx.plan.Plan;

public interface PlanDao extends PagingAndSortingRepository<Plan, String>, JpaSpecificationExecutor<Plan>{
	//根据计划书编号查询计划书；
	Plan findByjhsbh(String jhsbh);
	//根据manufid查询所有的计划书；
	List<Plan> findByManufid(String manufid);
}
