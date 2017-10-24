/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.partReport;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcDw;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcPower;
import com.aiidc.env.ergs.jpa.repo.o3.QqcCwDao;
import com.aiidc.env.ergs.jpa.repo.o3.QqcDwDao;
import com.aiidc.env.ergs.jpa.repo.o3.QqcPowerDao;
import com.aiidc.env.ergs.service.o3.PartReportService;

/**
 * @author jiabin fan
 *
 */
@Service("dw3PartReportService")
public class QqcDwServiceImpl implements PartReportService {
	@Resource
	private QqcDwDao qqcDwDao;
	/* 
	 * 
	 */
	@Override
	public List findByJybgbh(String jybgbh) {

		return qqcDwDao.findByJybgbh(jybgbh);
	}
	

}
