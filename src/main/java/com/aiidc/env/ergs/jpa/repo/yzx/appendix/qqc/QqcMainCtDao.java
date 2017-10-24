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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainCt;

/**
 * @author jiabin fan
 *
 */
public interface QqcMainCtDao extends CrudRepository<QqcMainCt, String> {
	//根据附录编号获取编号
	public List<QqcMainCt> findByFlbh(String flbh);
	//根据附录编号和编号删除车体；
	@Transactional
	@Modifying
	@Query("delete from QqcMainCt where flbh = ?1 and bh = ?2")
	public void deleteCt(String flbh,Integer bh);
	//根据附录编号和编号查询某个车体；
	public QqcMainCt findByFlbhAndBh(String flbh,Integer bh);
	//根据计划书编号删除
	@Modifying
	@Transactional
	@Query("delete from QqcMainCdx where flbh like CONCAT('%',:flbh,'%')")
	public void deleteByFlbhLike(@Param("flbh") String flbh);
}
