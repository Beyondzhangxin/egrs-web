/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.partReport;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.repo.o3.QqcCwDao;
import com.aiidc.env.ergs.service.o3.PartReportService;

/**
 * @author jiabin fan
 *
 */
@Service("cw3PartReportService")
public class QqcCwServiceImpl implements PartReportService {
	@Resource
	private QqcCwDao qqcCwDao;
	/* 
	 * 
	 */
	@Override
	public List findByJybgbh(String jybgbh) {

		return qqcCwDao.findByJybgbh(jybgbh);
	}

}
