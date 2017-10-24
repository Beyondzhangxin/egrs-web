/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.o3;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.jpa.po.o3.E3SbbConfigQqc;

/**
 * @author jiabin fan
 *
 */
@Repository
public interface E3SbbConfigQqcDao extends JpaSpecificationExecutor<E3SbbConfigQqc>,PagingAndSortingRepository<E3SbbConfigQqc, Serializable> {
	
}
