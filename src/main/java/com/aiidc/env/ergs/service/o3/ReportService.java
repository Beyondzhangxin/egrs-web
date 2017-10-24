/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3;

import java.util.Map;

import org.springframework.data.domain.Page;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.o3.E3Vehicles;
import com.aiidc.env.ergs.jpa.po.o3.Report;

/**
 * @author wuwenjun
 *
 */
public interface ReportService {
	public Page<Report> find(QryPageVo qryVo, Report item);

	public ReportDetailService getDetailService(String jybgbh);

	public Map getReport(String cllb,E3Vehicles vehicle,String pf);

}
