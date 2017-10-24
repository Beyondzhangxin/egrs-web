/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.plan;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.plan.PlanFiles;
import com.aiidc.env.ergs.jpa.repo.yzx.plan.PlanFilesDao;
import com.aiidc.env.ergs.service.yzx.plan.PlanFilesService;

/**
 * @author jiabin fan
 *
 */

@Service
public class PlanFilesServiceImpl implements PlanFilesService {
 @Resource
 private PlanFilesDao planFilesDao;
	/* 
	 * 增加计划书文件
	 */
	@Override
	public void savePlanFiles(PlanFiles planFiles) {
		planFilesDao.save(planFiles);
	}

	/* 
	 * 修改计划书文件
	 */
	@Override
	public void updatePlanFiles(PlanFiles planFiles) {
		planFilesDao.save(planFiles);
	}

	/* 
	 * 查询一个
	 */
	@Override
	public PlanFiles findone(String jhsbh) {
		PlanFiles planFiles = planFilesDao.findOne(jhsbh);
		if(null != planFiles){
			return planFiles;
		}
		return null;
	}

	/* 
	 * 删除计划书文件
	 */
	@Override
	public int delete(String jhsbh) {
		planFilesDao.delete(jhsbh);
		return 1;
	}

}
