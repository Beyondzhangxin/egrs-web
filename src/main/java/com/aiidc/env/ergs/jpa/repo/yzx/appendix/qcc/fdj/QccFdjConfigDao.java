/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qcc.fdj;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.fdj.QccFdjConfig;

/**
 * @author jiabin fan
 *
 */
public interface QccFdjConfigDao extends CrudRepository<QccFdjConfig, Serializable> {
	// 查询一个；
	QccFdjConfig findByFlbhAndFdjbhAndBhAndPzlb(String flbh,Integer fdjbh,Integer bh,String pzlb);
	//删除；
	@Transactional
	@Modifying
	@Query("delete from QccFdjConfig where flbh = ?1 and fdjbh = ?2 and bh = ?3 and pzlb = ?4")
	public void deletFdj(String flbh,Integer fdjbh,Integer bh,String pzlb);
	//查询一组
	List<QccFdjConfig> findByFlbhAndFdjbhAndPzlb(String flbh,Integer fdjbh,String pzlb);
}
