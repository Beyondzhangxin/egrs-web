/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.o3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.aiidc.env.ergs.jpa.po.o3.Report;

/**
 * @author wuwenjun
 *
 */
public interface ReportDao extends PagingAndSortingRepository<Report, String>, JpaSpecificationExecutor<Report> {
	//查询检验报告
	@Query("select jybgbh from Report a where cpxh=?1 and cpmc=?2 and fdjxh=?3" +
        "  and fdjscc in (?4) and cllb=?5 and sjdwid=?6 and jybgbh like '%TA%' ")
	public List<String> findJybgbh(String cpxh,String cpmc,String fdjxh,String fdjscc,String cllb,String sjdwid);
}
