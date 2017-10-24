/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjBs;

/**
 * @author jiabin fan
 *
 */
public interface QqcFdjBsService {
	//增加；
	public int add(QqcFdjBs qqcFdjBs);
	//删除；
	public int delete(String flbh,Integer fdjbh,Integer bh,String pzlb);
	//修改；
	public void update(QqcFdjBs qqcFdjBs);
	//查询一个；
	public QqcFdjBs findByFlbhAndFdjbhAndBhAndPzlb(String flbh,Integer fdjbh,Integer bh,String pzlb);
	 //查询一组
	List<QqcFdjBs> findByFlbhAndFdjbhAndPzlb(String flbh, Integer fdjbh, String pzlb);
}
