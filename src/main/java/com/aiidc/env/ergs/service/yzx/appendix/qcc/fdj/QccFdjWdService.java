/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qcc.fdj;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.QccFdjWd;

/**
 * @author jiabin fan
 *	轻型柴油车发动机
 */
public interface QccFdjWdService{
	//增加；
	public int add(QccFdjWd qccFdjWd);
	//删除；
	public int delete(String flbh,Integer bh);
	//修改；
	public void update(QccFdjWd qccFdjWd);
	//查询一个；
	public QccFdjWd findByFlbhAndFdjbh(String flbh,Integer fdjbh);
	//根据附录编号查询所有的；
	public List<QccFdjWd> findByFlbh(String flbh);
}
