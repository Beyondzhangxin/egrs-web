/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qqc;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainXgx;

/**
 * @author jiabin fan
 *	轻型汽油车悬挂系
 */
public interface QqcMainXgxService {
	//根据flbh查询bh并且按照bh降序
	public Integer findBhByFlbh(String flbh);
	//新增；
	public void addQqcMainXgx(QqcMainXgx qqcMainXgx);
	//修改；
	public void updateQqcMainXgx(QqcMainXgx qqcMainXgx);
	//删除；
	public void deleteQqcMainXgx(String flbh,Integer bh);
	//查询一个；
	public QqcMainXgx findByFlbhAndBh(String flbh,Integer bh);
	//根据附录编号查询所有的悬挂系；
	public List<QqcMainXgx> findByFlbh(String flbh);
}
