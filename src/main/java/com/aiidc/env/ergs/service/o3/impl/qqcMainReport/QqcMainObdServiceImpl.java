/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainObd;
import com.aiidc.env.ergs.jpa.repo.o3.QqcObdDao;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainObdDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("ob3QqcMainReportService")
public class QqcMainObdServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainObdDao qqcMainObdDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainObd findByJybgbh(String jybgbh) {

		return qqcMainObdDao.findByJybgbh(jybgbh);
	}

}
