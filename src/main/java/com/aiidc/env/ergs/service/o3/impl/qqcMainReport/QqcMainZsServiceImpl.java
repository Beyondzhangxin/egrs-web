/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl.qqcMainReport;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainZs;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainZsDao;
import com.aiidc.env.ergs.service.o3.QqcMainReportService;

/**
 * @author jiabin fan
 *
 */
@Service("zs3QqcMainReportService")
public class QqcMainZsServiceImpl implements QqcMainReportService {
	@Resource
	private QqcMainZsDao qqcMainZsDao;
	/* 
	 * 
	 */
	@Override
	public QqcMainZs findByJybgbh(String jybgbh) {

		return qqcMainZsDao.findByJybgbh(jybgbh);
	}

}
