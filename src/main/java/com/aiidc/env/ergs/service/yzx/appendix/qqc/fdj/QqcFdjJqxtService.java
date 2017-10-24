/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjJqxt;

/**
 * @author jiabin fan
 *	轻型汽油车发动机
 */
public interface QqcFdjJqxtService{
	//增加；
	public int add(QqcFdjJqxt qqcFdjJqxt);
	//删除；
	public int delete(String flbh,Integer bh);
	//修改；
	public void update(QqcFdjJqxt qqcFdjJqxt);
	//查询一个；
	public QqcFdjJqxt findByFlbhAndFdjbh(String flbh,Integer fdjbh);
	//根据附录编号查询所有的；
	public List<QqcFdjJqxt> findByFlbh(String flbh);
}
