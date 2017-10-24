/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainXgx;

/**
 * @author jiabin fan
 *
 */
public interface QqcMainXgxDao extends CrudRepository<QqcMainXgx, String> {
	//根据附录编号查询编号；
	@Query("select bh from QqcMainXgx where flbh = ?1 ")
	public List<Integer> findByFlbh(String flbh);
	//查询单个；
	public QqcMainXgx findByFlbhAndBh(String flbh,Integer bh);
	//根据附录编号查询素有的悬挂系；
	@Query("select q from QqcMainXgx q where q.flbh = ?1")
	public List<QqcMainXgx> findAll(String flbh);
	//删除悬挂系；
	@Modifying
	@Transactional
	@Query("delete from QqcMainXgx where flbh = ?1 and bh = ?2")
	public void deleteByFlbhAndBh(String flbh,Integer bh);
	//根据计划书编号删除
	@Modifying
	@Transactional
	@Query("delete from QqcMainCdx where flbh like CONCAT('%',:flbh,'%')")
	public void deleteByFlbhLike(@Param("flbh") String flbh);
}
