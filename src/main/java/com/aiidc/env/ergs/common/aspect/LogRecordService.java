/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.aspect;

import com.aiidc.env.ergs.jpa.po.pw.LogRecord;

/**
 * @author wuwenjun
 *
 */
public interface LogRecordService {

	/**
	 * 保存记录
	 * 
	 * @param entity
	 */
	void save(LogRecord entity);

}
