/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.o3;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.jpa.po.o3.E3Tmn;

/**
 * @author wuwenjun
 *
 */
@Repository
public interface E3TmnDao extends PagingAndSortingRepository<E3Tmn, BigDecimal>, JpaSpecificationExecutor<E3Tmn> {

	/**
	 * @param manufid
	 * @return
	 */
	List<E3Tmn> findByManufid(String manufid);

}
