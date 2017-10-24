/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.partReport;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcPower;
import com.aiidc.env.ergs.jpa.repo.o3.QqcPowerDao;
import com.aiidc.env.ergs.service.o3.PartReportService;

/**
 * @author jiabin fan
 *
 */
@Service("pq3PartReportService")
public class QqcPowerServiceImpl implements PartReportService {
	@Resource
	private QqcPowerDao qqcPowerDao;
	/* 
	 * 
	 */
	@Override
	public List findByJybgbh(String jybgbh) {

		return qqcPowerDao.findByJybgbh(jybgbh);
	}

}
