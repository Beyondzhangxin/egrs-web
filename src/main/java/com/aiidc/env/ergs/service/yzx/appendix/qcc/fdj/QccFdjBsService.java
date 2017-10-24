/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qcc.fdj;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.QccFdjBs;

/**
 * @author jiabin fan
 *
 */
public interface QccFdjBsService {
	//增加；
	public int add(QccFdjBs qccFdjBs);
	//删除；
	public int delete(String flbh,Integer fdjbh,Integer bh,String pzlb);
	//修改；
	public void update(QccFdjBs qccFdjBs);
	//查询一个；
	public QccFdjBs findByFlbhAndFdjbhAndBhAndPzlb(String flbh,Integer fdjbh,Integer bh,String pzlb);
	 //查询一组
	List<QccFdjBs> findByFlbhAndFdjbhAndPzlb(String flbh, Integer fdjbh, String pzlb);
}
