/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.o3;

import java.io.Serializable;
import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.constant.InforPub;
import com.aiidc.env.ergs.jpa.po.o3.E3Vehicles;

/**
 * @author jiabin fan
 * .cxid,A.clxh,A.clmc,A.fdjxh,A.fdjscc,A.manufid,A.cllb,A.zhrq,A.newsbbh,B.status ,A.newwjh,A.zsh
 * and A.manufid = :manufid and A.clxh like CONCAT ('%',:clxh,'%') and A.fdjxh like CONCAT ('%',:fdjxh,'%') and A.xzmc like CONCAT ('%',:xzmc,'%') 
 */
@Repository
public interface E3VehicleDao extends PagingAndSortingRepository<E3Vehicles, Serializable>, JpaSpecificationExecutor<E3Vehicles> {
	@Query(value = "select A.cxid,A.clxh,A.clmc,A.fdjxh,A.fdjscc,A.manufid,A.cllb,A.zhrq,A.newsbbh,B.status ,A.newwjh,A.zsh "
			+ "from E3Vehicles A,E3Sbb B "
			+ "where A.newsbbh = B.sbbh and A.manufid = :manufid and A.clxh like CONCAT ('%',:clxh,'%') and A.fdjxh like CONCAT ('%',:fdjxh,'%') and A.xzmc like CONCAT ('%',:xzmc,'%') ",
			countQuery = "select count(A) "
					+ "from E3Vehicles A,E3Sbb B "
					+ "where A.newsbbh = B.sbbh and A.manufid = :manufid and A.clxh like CONCAT ('%',:clxh,'%') and A.fdjxh like CONCAT ('%',:fdjxh,'%') and A.xzmc like CONCAT ('%',:xzmc,'%') ")
	public Page<InforPub> findByManufidAndClxhAndFdjxhAndXzmc(@Param("manufid") String manufid , @Param("clxh") String clxh, @Param("fdjxh") String fdjxh, @Param("xzmc") String xzmc,Pageable pageable);
	
	public E3Vehicles findByCxid(Long cxid);
}
