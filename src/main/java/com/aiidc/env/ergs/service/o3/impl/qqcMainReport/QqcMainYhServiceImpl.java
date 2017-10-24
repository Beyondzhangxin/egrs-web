/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainYh;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainYhDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("yh3QqcMainReportService")
public class QqcMainYhServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainYhDao qqcMainYhDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainYh findByJybgbh(String jybgbh) {

		return qqcMainYhDao.findByJybgbh(jybgbh);
	}

}
