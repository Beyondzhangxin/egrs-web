/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMain;

/**
 * @author jiabin fan
 *
 */
public interface QqcMainDao
		extends PagingAndSortingRepository<QqcMain, Serializable>, JpaSpecificationExecutor<QqcMain> {
	// 查询原车型
	/*
	 * @Query("Select A from QqcMain A, Appendix b where A.flbh=b.flbh  and " +
	 * "zclxh like CONCAT('%',:clxh,'%') and" +
	 * "zclmc like CONCAT('%',:clmc,'%') and" +
	 * "zclscc like CONCAT('%',:clscc,'%') ") public Page<QqcMain>
	 * searchMother( @Param("clxh") String clxh,@Param("clmc") String
	 * clmc,@Param("clscc") String clscc);
	 */

	// 车扩展车型中查询原车型
	/*
	 * @Query("select b from QqcMain a,TeAppendix b ,Appendix c WHERE A.FLBH = B.FLBH   AND A.FLBH=C.FLBH AND STATUS='E' and clxh like like CONCAT('%',:clxh,'%')"
	 * ) public List<TeAppendix> findMother(@Param("clxh") String clxh);
	 */
	@Query("select flbh from QqcMain")
	List<String> findFlbh();

	// 根据计划书编号删除
	@Modifying
	@Transactional
	@Query("delete from QqcMainCdx where flbh like CONCAT('%',:flbh,'%')")
	public void deleteByFlbhLike(@Param("flbh") String flbh);

}
