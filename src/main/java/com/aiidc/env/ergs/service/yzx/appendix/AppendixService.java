package com.aiidc.env.ergs.service.yzx.appendix;

import org.springframework.data.domain.Page;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.Appendix;

/**
 * 附录的service层
 * 
 * @author jiabin fan
 *
 */
public interface AppendixService {
	// 根据计划书标号查询其所对应所有的计划书;
	Page<Appendix> findAllAppendix(String jhsbh, QryPageVo qryVo, Appendix appendix);

	// 添加计划书;
	public void addAppendix(Appendix appendix, String jhsbh);

	// 查询某个计划书
	public Appendix findAppendix(String flbh);

	// 生成附录编号；
	public String generatFlbh(String jhsbh);

	// 删除附录；
	public int deleteAppendix(String flbh);

	// 提交附录
	public int referAppendix(Appendix appendix);

	// 审核附录
	public int examAppendix(Appendix appendix);

	// 备案
	int recordAppendix(Appendix appendix);

	// 根据计划书编号查询附录
	Appendix findApp(String jhsbh);

}
