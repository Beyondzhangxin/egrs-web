/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainCdx;

/**
 * @author jiabin fan
 * 轻型车传动系
 */
public interface QqcMainCdxDao extends CrudRepository<QqcMainCdx, String> {
	//根据附录编号查询编号；
	@Query("select bh from QqcMainCdx where flbh = ?1 ")
	public List<Integer> findByFlbh(String flbh);
	//根据附录编号查询所有的传动系；
	@Query("select q from QqcMainCdx q where q.flbh = ?1")
	public List<QqcMainCdx> findQqcMainCdxByFlbh(String flbh);
	//根据附录编号和编号查询传动系
	public QqcMainCdx findByFlbhAndBh(String flbh,Integer bh);
	//根据附录编号和编号删除传动系
	@Modifying
	@Transactional
	@Query("delete from QqcMainCdx where flbh = ?1 and bh = ?2 ")
	public void deleteByFlbhAndBh(String flbh,Integer bh);
	//根据计划书编号删除
	@Modifying
	@Transactional
	@Query("delete from QqcMainCdx where flbh like CONCAT('%',:flbh,'%')")
	public void deleteByFlbhLike(@Param("flbh") String flbh);
	
}
