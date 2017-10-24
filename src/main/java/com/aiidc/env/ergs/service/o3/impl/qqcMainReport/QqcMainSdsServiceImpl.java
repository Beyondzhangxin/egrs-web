/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainSds;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainSdsDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("sd3QqcMainReportService")
public class QqcMainSdsServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainSdsDao qqcMainSdsDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainSds findByJybgbh(String jybgbh) {

		return qqcMainSdsDao.findByJybgbh(jybgbh);
	}

}
