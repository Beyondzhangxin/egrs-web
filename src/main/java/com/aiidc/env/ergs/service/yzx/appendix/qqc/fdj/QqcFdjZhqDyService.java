/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjZhqDy;

/**
 * @author jiabin fan
 *
 */
public interface QqcFdjZhqDyService {
	//增加
	public void add(QqcFdjZhqDy qqcFdjZhqDy);
	//删除
	public void delete(QqcFdjZhqDy qqcFdjZhqDy);
	//修改
	public void update(QqcFdjZhqDy qqcFdjZhqDy);
	//查询一个；
	public QqcFdjZhqDy findByFlbhAndFdjbhAndBhAndZhqbh(String flbh,Integer fdjbh,Integer bh,Integer zhqbh);
	//查询所有；
	public List<QqcFdjZhqDy> findByFlbhAndFdjbhAndZhqbh(String flbh,Integer fdjbh,Integer zhqbh);
}
