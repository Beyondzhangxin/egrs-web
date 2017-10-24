/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.o3;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.aiidc.env.ergs.jpa.po.o3.Report;

/**
 * @author wuwenjun
 *
 */
public interface E3FlmxtDao extends PagingAndSortingRepository<Report, String>, JpaSpecificationExecutor<Report> {
	//查询计划书报告
	@Query("select flbh from E3Flmx where jybgbh=?1")
	public String findByJybgbh(String jybgbh);
}
