/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdj;
import com.aiidc.env.ergs.util.BaseService;

/**
 * @author jiabin fan
 *	轻型汽油车发动机
 */
public interface QqcFdjService extends BaseService<QqcFdj>{

	/**
	 * @param qqcFdj
	 * @return
	 */
	QqcFdj just(QqcFdj qqcFdj);
	
}
