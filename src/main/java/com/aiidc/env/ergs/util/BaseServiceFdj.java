/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.util;

import java.util.List;

/**
 * @author jiabin fan
 * 发动机的基础service
 */
public interface BaseServiceFdj<T> {
	//增加
	public int add(T t);
	//删除
	public int delete(T t);
	//修改
	public void update(T t);
	//查询一个；
	public T findByFlbhAndFdjbhAndBh(String flbh,Integer fdjbh,Integer bh);
	//查询所有；
	public List<T> findByFlbhAndFdjbh(String flbh,Integer fdjbh);
}
