/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainQzx;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainQzxDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("qz3QqcMainReportService")
public class QqcMainQzxServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainQzxDao qqcMainQzxDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainQzx findByJybgbh(String jybgbh) {

		return qqcMainQzxDao.findByJybgbh(jybgbh);
	}

}
