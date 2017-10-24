/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainDw;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainDwDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("dw3QqcMainReportService")
public class QqcMainDwServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainDwDao qqcMainDwDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainDw findByJybgbh(String jybgbh) {

		return qqcMainDwDao.findByJybgbh(jybgbh);
	}

}
