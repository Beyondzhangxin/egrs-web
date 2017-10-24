/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainPqwr;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainPqwrDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("pq3QqcMainReportService")
public class QqcMainPqServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainPqwrDao qqcMainPqwrDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainPqwr findByJybgbh(String jybgbh) {

		return qqcMainPqwrDao.findByJybgbh(jybgbh);
	}

}
