/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.plan;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.yzx.plan.PlanMX;
import com.aiidc.env.ergs.jpa.repo.yzx.plan.PlanMXDao;
import com.aiidc.env.ergs.service.yzx.plan.PlanMXService;

/**
 * @author jiabin fan
 *
 */
@Service
public class PlanMXServiceImpl implements PlanMXService {

	@Resource
	private PlanMXDao planMXDao;
	@Override
	public void saveFlbh(String jhsbh,String flbh) {
		PlanMX planMX = new PlanMX();
		planMX.setJhsbh(jhsbh);
		planMX.setFlbh(flbh);
		planMXDao.save(planMX);

	}

}
