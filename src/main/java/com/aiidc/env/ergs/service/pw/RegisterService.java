/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.data.domain.Page;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.pw.Register;
import com.aiidc.env.ergs.service.pw.vo.RegistQryVo;

import freemarker.template.TemplateException;

/**
 * @author wuwenjun
 *
 */
public interface RegisterService {
	public void regist(Register register);

	/**
	 * 获取注册信息
	 * 
	 * @param registerId
	 * @return
	 */
	public Register get(Long registerId);

	/**
	 * 分页
	 * 
	 * @param qryVo
	 * @param item
	 * @return
	 */
	public Page<Register> find(QryPageVo qryVo, RegistQryVo registQryVo);

	/**
	 * 审核
	 * 
	 * @param registerId
	 * @param sucess
	 * @param view
	 */
	public void audit(Long registerId, boolean sucess, String view)
			throws MessagingException, IOException, TemplateException;
}
