/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.o3;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.jpa.po.o3.E3Tmn;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcCw;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcPower;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcSd;

/**
 * @author wuwenjun
 *
 */
@Repository
public interface QqcSdDao extends PagingAndSortingRepository<QqcSd, Serializable>, JpaSpecificationExecutor<QqcSd> {
	
	List<QqcSd> findByJybgbh(String jybgbh);

}
