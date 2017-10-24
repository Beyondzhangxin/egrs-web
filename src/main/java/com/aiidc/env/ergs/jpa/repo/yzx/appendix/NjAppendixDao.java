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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.NjAppendix;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
/**
 * 附录模块
 * @author jiabin fan
 *
 */
public interface NjAppendixDao extends JpaSpecificationExecutor<NjAppendix>,PagingAndSortingRepository<NjAppendix, Serializable> {
	//查找最大的附录编号；
	@Query("select njbh from NjAppendix where flbh = ?1 and bh = ?2 ")
	public List<Integer> findBhByFlbhAndBh(@Param("flbh") String jhsbh,@Param("bh") Integer bh);
	
	//删除附录；
	@Transactional
	@Modifying
	@Query("delete from NjAppendix where flbh like CONCAT('%',:flbh,'%')")
	public void deleteByFlbh(@Param("flbh") String jhsbh);
	//根据附录编号查询耐久试验
	@Query("select a from NjAppendix a where flbh like CONCAT('%',:flbh,'%') and rownum <=1")
	public NjAppendix findByJhsbh(@Param("flbh") String jhsbh);
	//查询一个
	NjAppendix findByFlbhAndBhAndNjbh(String flbh,Integer bh,Integer njbh);
	//根据flbh查询一组
	List<NjAppendix> findByFlbhAndBh(String flbh,Integer bh);
	//删除视同
	@Modifying
	@Transactional
	@Query("delete from NjAppendix where flbh = ?1 and bh = ?2 and njbh = ?3")
	public void deleteByFlbhAndBhAndNjbh(String flbh,Integer bh,Integer njbh);
	@Query("select flbh from NjAppendix where vinma = ?1")
	public String findByVinma(String vin);
}
