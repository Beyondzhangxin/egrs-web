/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3;

import java.util.Map;

/**
 * @author wuwenjun
 *
 */
public interface ReportDetailService {

	public String createWord(String jybgbh);

	public boolean hasCreated(String jybgbh);

	public String wordPath(String jybgbh);

	/**
	 * 查看或者导出数据
	 * 
	 * @param jybgbh
	 * @return
	 */
	Map<String, Object> getDataMap(String jybgbh);

}
