/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.plan;

import com.aiidc.env.ergs.jpa.po.yzx.plan.PlanFiles;

/**
 * @author jiabin fan
 *
 */
public interface PlanFilesService {
	//新增；
	public void savePlanFiles(PlanFiles planFiles);
	//修改；
	public void updatePlanFiles(PlanFiles planFiles);
	//查询一个；
	public PlanFiles findone(String jhsbh);
	/**
	 * @param jhsbh
	 * @return
	 */
	public int delete(String jhsbh);
}
