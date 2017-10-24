/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainGjs;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainGjsDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("js3QqcMainReportService")
public class QqcMainGjsServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainGjsDao qqcMainGjsDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainGjs findByJybgbh(String jybgbh) {

		return qqcMainGjsDao.findByJybgbh(jybgbh);
	}

}
