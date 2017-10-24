/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.o3;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.jpa.po.o3.E3Sbb;
import com.aiidc.env.ergs.jpa.po.o3.E3Te;
import com.aiidc.env.ergs.jpa.po.o3.E3Vehicles;

/**
 * @author jiabin fan
 *
 */
@Repository
public interface E3TeDao extends JpaSpecificationExecutor<E3Te>,PagingAndSortingRepository<E3Te, Serializable> {
	@Query("select distinct jybgbh,bh,jzjybgbh from E3Te where clxh=?1 and clmc=?2 and fdjxh=?3 and fdjscc in (?5)" + 
        " and manufid=?6 and bh <> 0  and substr(jybgbh,11,1)=?7")
	public List<E3Te> findJybgbh(String clxh,String clmc,String fdjxh,String newFdjscc,String manufid,int vehicleType);
}
