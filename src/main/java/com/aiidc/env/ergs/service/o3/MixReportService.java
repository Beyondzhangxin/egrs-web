/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3;

import java.util.List;
import java.util.Map;

/**
 * @author jiabin fan
 *
 */
public interface MixReportService {

	/**
	 * @param lastMap
	 * @param pf
	 * @param vehicle
	 */
	List mix(Map lastMap, String pf, String vehicle);
	
}
