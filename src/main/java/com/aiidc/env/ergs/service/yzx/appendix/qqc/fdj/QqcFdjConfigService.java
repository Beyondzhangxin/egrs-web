/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjConfig;

/**
 * @author jiabin fan
 *
 */
public interface QqcFdjConfigService {
	//增加；
	public int add(QqcFdjConfig qqcFdjConfig);
	//删除；
	public int delete(String flbh,Integer fdjbh,Integer bh,String pzlb);
	//修改；
	public void update(QqcFdjConfig qqcFdjConfig);
	//查询一个；
	public QqcFdjConfig findByFlbhAndFdjbhAndBhAndPzlb(String flbh,Integer fdjbh,Integer bh,String pzlb);
	//查询一组；
	public List<QqcFdjConfig> findByFlbhAndFdjbhAndPzlb(String flbh,Integer fdjbh,String pzlb);
	//获取最新的对象；
	public QqcFdjConfig just(QqcFdjConfig qqcFdjConfig);
}
