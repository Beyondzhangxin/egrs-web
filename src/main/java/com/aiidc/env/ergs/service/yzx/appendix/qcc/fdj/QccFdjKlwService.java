/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qcc.fdj;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.QccFdjJqxt;

/**
 * @author jiabin fan
 *	轻型柴油车发动机
 */
public interface QccFdjKlwService{
	//增加；
	public int add(QccFdjJqxt qccFdjJqxt);
	//删除；
	public int delete(String flbh,Integer bh);
	//修改；
	public void update(QccFdjJqxt qccFdjJqxt);
	//查询一个；
	public QccFdjJqxt findByFlbhAndFdjbh(String flbh,Integer fdjbh);
	//根据附录编号查询所有的；
	public List<QccFdjJqxt> findByFlbh(String flbh);
}
