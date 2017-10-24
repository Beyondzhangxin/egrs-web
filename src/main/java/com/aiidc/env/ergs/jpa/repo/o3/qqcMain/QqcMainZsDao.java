/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.o3.qqcMain;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.jpa.po.o3.qqcMainReport.QqcMainZs;

/**
 * @author wuwenjun
 *
 */
@Repository
public interface QqcMainZsDao extends PagingAndSortingRepository<QqcMainZs, Serializable>, JpaSpecificationExecutor<QqcMainZs> {
	
	QqcMainZs findByJybgbh(String jybgbh);
	
	
}
