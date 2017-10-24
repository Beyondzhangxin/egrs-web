/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainRyzf;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainRyzfDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("ry3QqcMainReportService")
public class QqcMainRyzfServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainRyzfDao qqcMainRyzfDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainRyzf findByJybgbh(String jybgbh) {

		return qqcMainRyzfDao.findByJybgbh(jybgbh);
	}

}
