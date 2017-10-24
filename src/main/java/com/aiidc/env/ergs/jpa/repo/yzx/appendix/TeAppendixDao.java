package com.aiidc.env.ergs.jpa.repo.yzx.appendix;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.Appendix;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
/**
 * 附录模块
 * @author jiabin fan
 *
 */
public interface TeAppendixDao extends JpaSpecificationExecutor<TeAppendix>,PagingAndSortingRepository<TeAppendix, Serializable> {
	//查找最大的附录编号；
	@Query("select bh from TeAppendix where flbh = ?1 ")
	public List<Integer> findBhByFlbh(@Param("flbh") String jhsbh);
	
	//删除附录；
	@Transactional
	@Modifying
	@Query("delete from TeAppendix where flbh like CONCAT('%',:flbh,'%')")
	public void deleteByFlbh(@Param("flbh") String jhsbh);
	//根据附录编号查询视同附录
	@Query("select a from TeAppendix a where flbh like CONCAT('%',:flbh,'%') and rownum <=1")
	public TeAppendix findByJhsbh(@Param("flbh") String jhsbh);
	//查询一个
	TeAppendix findByFlbhAndBh(String flbh,Integer bh);
	//根据flbh查询一组
	List<TeAppendix> findByFlbh(String flbh);
	//删除视同
	@Modifying
	@Transactional
	@Query("delete from TeAppendix where flbh = ?1 and bh = ?2 ")
	public void deleteByFlbhAndBh(String flbh,Integer bh);
	//查询所有的附录编号
	@Query("select flbh from TeAppendix where status = 'E' ")
	List<String> findFlbh();
	
}
