/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qcc;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.QccMain;

/**
 * @author jiabin fan
 * 附录概述
 */
public interface QccMainService {
	//添加；
	public int addQccMain(QccMain qccMain);
	//修改；
	public void updateQccMain(QccMain qccMain);
	//查询；
	public QccMain findQccMain(String flbh);
	//删除；
	public void delQccMain(String flbh);
	
	String findSccmcByFlbh(String flbh);
}
