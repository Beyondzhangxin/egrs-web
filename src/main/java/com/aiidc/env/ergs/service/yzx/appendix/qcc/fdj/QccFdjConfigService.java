/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qcc.fdj;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.QccFdjConfig;

/**
 * @author jiabin fan
 *
 */
public interface QccFdjConfigService {
	//增加；
	public int add(QccFdjConfig qccFdjConfig);
	//删除；
	public int delete(String flbh,Integer fdjbh,Integer bh,String pzlb);
	//修改；
	public void update(QccFdjConfig qccFdjConfig);
	//查询一个；
	public QccFdjConfig findByFlbhAndFdjbhAndBhAndPzlb(String flbh,Integer fdjbh,Integer bh,String pzlb);
	//查询一组；
	public List<QccFdjConfig> findByFlbhAndFdjbhAndPzlb(String flbh,Integer fdjbh,String pzlb);
}
