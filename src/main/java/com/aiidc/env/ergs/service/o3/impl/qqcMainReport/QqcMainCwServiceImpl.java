/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainCw;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainCwDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("cw3QqcMainReportService")
public class QqcMainCwServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainCwDao qqcMainCwDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainCw findByJybgbh(String jybgbh) {

		return qqcMainCwDao.findByJybgbh(jybgbh);
	}

}
