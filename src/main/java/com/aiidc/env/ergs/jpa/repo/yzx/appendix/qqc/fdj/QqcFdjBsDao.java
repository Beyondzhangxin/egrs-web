/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc.fdj;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjBs;

/**
 * @author jiabin fan
 *
 */
public interface QqcFdjBsDao extends CrudRepository<QqcFdjBs, Serializable> {
	// 查询一个；
	QqcFdjBs findByFlbhAndFdjbhAndBhAndPzlb(String flbh,Integer fdjbh,Integer bh,String pzlb);
	//删除；
	@Transactional
	@Modifying
	@Query("delete from QqcFdjBs where flbh = ?1 and fdjbh = ?2 and bh = ?3 and pzlb = ?4")
	public void deletFdj(String flbh,Integer fdjbh,Integer bh,String pzlb);
	//查询一组
	List<QqcFdjBs> findByFlbhAndFdjbhAndPzlb(String flbh,Integer fdjbh,String pzlb);
	//根据计划书编号删除
	@Modifying
	@Transactional
	@Query("delete from QqcMainCdx where flbh like CONCAT('%',:flbh,'%')")
	public void deleteByFlbhLike(@Param("flbh") String flbh);
}
