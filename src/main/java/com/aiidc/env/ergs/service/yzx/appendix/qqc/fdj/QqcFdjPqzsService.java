/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjPqzs;

/**
 * @author jiabin fan
 *	轻型汽油车发动机
 */
public interface QqcFdjPqzsService{
	//增加；
	public int add(QqcFdjPqzs qqcFdjPqzs);
	//删除；
	public int delete(String flbh,Integer bh);
	//修改；
	public void update(QqcFdjPqzs qqcFdjPqzs);
	//查询一个；
	public QqcFdjPqzs findByFlbhAndFdjbh(String flbh,Integer fdjbh);
	//根据附录编号查询所有的；
	public List<QqcFdjPqzs> findByFlbh(String flbh);
}
