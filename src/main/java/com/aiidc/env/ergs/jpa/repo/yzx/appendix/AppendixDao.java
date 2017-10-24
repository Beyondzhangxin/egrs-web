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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMain;
/**
 * 附录模块
 * @author jiabin fan
 *
 */
public interface AppendixDao extends JpaSpecificationExecutor<Appendix>,PagingAndSortingRepository<Appendix, Serializable> {
	//查找最大的附录编号；
	@Query("select flbh from Appendix where flbh like CONCAT('%',:flbh,'%')")
	public List<String> findByFlbh(@Param("flbh") String jhsbh);
	
	//删除附录；
	@Transactional
	@Modifying
	@Query("delete from Appendix where flbh like CONCAT('%',:flbh,'%')")
	public void deleteByFlbh(@Param("flbh") String jhsbh);
	//根据附录编号查询附录
	@Query("select a from Appendix a where flbh like CONCAT('%',:flbh,'%') and rownum <=1")
	public Appendix findByJhsbh(@Param("flbh") String jhsbh);
	@Query("select flbh from Appendix ")
	List<String> findFlbh();
}
