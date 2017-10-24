/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix.qqc;

import org.springframework.data.domain.Page;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMain;
import com.aiidc.env.ergs.service.yzx.appendix.vo.AppendixQryVo;

/**
 * @author jiabin fan 附录概述
 */
public interface QqcMainService {
	// 添加；
	public int addQqcMain(QqcMain qqcMain);

	// 修改；
	public void updateQqcMain(QqcMain qqcMain);

	// 查询；
	public QqcMain findQqcMain(String flbh);

	// 删除；
	public void delQqcMain(String flbh);

	/**
	 * @param vo
	 * @param qryVo
	 */
	public Page<QqcMain> find(AppendixQryVo vo, QryPageVo qryVo);
}
