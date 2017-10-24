/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qcc.fdj;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.QccFdjZhqDy;

/**
 * @author jiabin fan
 *
 */
public interface QccFdjZhqDyService {
	//增加
	public void add(QccFdjZhqDy qccFdjZhqDy);
	//删除
	public void delete(QccFdjZhqDy qccFdjZhqDy);
	//修改
	public void update(QccFdjZhqDy qccFdjZhqDy);
	//查询一个；
	public QccFdjZhqDy findByFlbhAndFdjbhAndBhAndZhqbh(String flbh,Integer fdjbh,Integer bh,Integer zhqbh);
	//查询所有；
	public List<QccFdjZhqDy> findByFlbhAndFdjbhAndZhqbh(String flbh,Integer fdjbh,Integer zhqbh);
}
