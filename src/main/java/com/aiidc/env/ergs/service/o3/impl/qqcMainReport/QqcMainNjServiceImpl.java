/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainNj;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainNjDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("nj3QqcMainReportService")
public class QqcMainNjServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainNjDao qqcMainNjDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainNj findByJybgbh(String jybgbh) {

		return qqcMainNjDao.findByJybgbh(jybgbh);
	}

}
