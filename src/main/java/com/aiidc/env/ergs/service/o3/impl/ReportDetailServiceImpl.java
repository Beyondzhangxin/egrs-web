/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.service.o3.ReportDetailService;

/**
 * @author wuwenjun
 *
 */
@Service("reportDetailService")
public class ReportDetailServiceImpl extends BaseReportDetailServiceImpl implements ReportDetailService {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.service.o3.impl.BaseReportDetailServiceImpl#
	 * getTemplete()
	 */
	@Override
	protected String getTemplete() {
		return "qqc-cw";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.service.o3.impl.BaseReportDetailServiceImpl#getTables(
	 * )
	 */
	@Override
	protected String[] getTables() {
		return new String[] { "E3_REPORT", "E3_QQC_MAIN_CW", "E3_QQC_CONFIG_CW", "E3_QQC_TEST_CW" };
	}
}
