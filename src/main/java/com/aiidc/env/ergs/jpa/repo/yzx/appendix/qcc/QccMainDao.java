/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qcc;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qcc.QccMain;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMain;
import com.aiidc.env.ergs.jpa.po.yzx.plan.Plan;

/**
 * @author jiabin fan
 *
 */
public interface QccMainDao extends PagingAndSortingRepository<QccMain, Serializable> ,JpaSpecificationExecutor<QccMain>{
	//查询原车型
	/*@Query("Select A from QccMain A, Appendix b where A.flbh=b.flbh  and "
			+ "zclxh like CONCAT('%',:clxh,'%') and"
			+ "zclmc like CONCAT('%',:clmc,'%') and"
			+ "zclscc like CONCAT('%',:clscc,'%') ")
	public Page<QccMain> searchMother( @Param("clxh") String clxh,@Param("clmc") String clmc,@Param("clscc") String clscc); */
	
	//车扩展车型中查询原车型
	/*@Query("select b from QccMain a,TeAppendix b ,Appendix c WHERE A.FLBH = B.FLBH   AND A.FLBH=C.FLBH AND STATUS='E' and clxh like like CONCAT('%',:clxh,'%')")
	public List<TeAppendix> findMother(@Param("clxh") String clxh);*/
	@Query("select flbh from QccMain")
	List<String> findFlbh();
	
	String findSccmcByFlbh(String flbh);
}
