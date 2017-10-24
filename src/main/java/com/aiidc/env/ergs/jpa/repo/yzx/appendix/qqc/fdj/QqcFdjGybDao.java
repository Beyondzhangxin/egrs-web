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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjGyb;

/**
 * @author jiabin fan
 *
 */
public interface QqcFdjGybDao extends CrudRepository<QqcFdjGyb, Serializable>{
	//根据附录编号和发动机编号查询多个；
	public List<QqcFdjGyb> findByFlbhAndFdjbh(String flbh,Integer fdjbh);
	//查询一个；
	public QqcFdjGyb findByFlbhAndFdjbhAndBh(String flbh,Integer fdjbh,Integer bh);
	//根据计划书编号删除
	@Modifying
	@Transactional
	@Query("delete from QqcMainCdx where flbh like CONCAT('%',:flbh,'%')")
	public void deleteByFlbhLike(@Param("flbh") String flbh);
}
