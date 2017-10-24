/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.util;

import java.util.List;

/**
 * @author jiabin fan
 *
 */
public interface BaseService<T> {
	//增加；
	public int add(T t);
	//删除；
	public int delete(String flbh,Integer bh);
	//修改；
	public void update(T t);
	//查询一个；
	public T findByFlbhAndBh(String flbh,Integer bh);
	//根据附录编号查询所有的；
	public List<T> findByFlbh(String flbh);
}
