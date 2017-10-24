/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
import com.aiidc.env.ergs.util.BaseService;

/**
 * @author jiabin fan
 *
 */
public interface TeAppendixService extends BaseService<TeAppendix> {
	String findBhByFlbh(String flbh);
	
}
