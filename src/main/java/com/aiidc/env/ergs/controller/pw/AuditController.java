/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.pw;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.aspect.LogAnnotation;
import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.constant.CarType;
import com.aiidc.env.ergs.constant.CompanyType;
import com.aiidc.env.ergs.constant.ProductType;
import com.aiidc.env.ergs.jpa.po.pw.Register;
import com.aiidc.env.ergs.service.pw.RegisterService;
import com.aiidc.env.ergs.service.pw.vo.RegistQryVo;

/**
 * 审核相关
 * 
 * @author wuwenjun
 *
 */
@Controller
@RequestMapping("egrs/audit")
public class AuditController {
	@Autowired
	private RegisterService service;

	@RequestMapping(value = { "/", "index" }, method = RequestMethod.GET)
	public String index() {
		return "pw/audit/index";
	}

	@RequestMapping(value = "table", method = RequestMethod.GET)
	public String table(QryPageVo qryVo, RegistQryVo item, Model model) {
		model.addAttribute("page", find(qryVo, item));
		return "pw/audit/table";
	}

	@RequestMapping(value = "find", method = RequestMethod.GET)
	@ResponseBody
	public Page<Register> find(QryPageVo qryVo, RegistQryVo item) {
		return service.find(qryVo, item);
	}

	@RequestMapping(value = "regist", method = RequestMethod.GET)
	public String regist(Model model) {
		model.addAttribute("carTypes", CarType.values());
		model.addAttribute("productTypes", ProductType.values());
		model.addAttribute("companyTypes", CompanyType.values());
		return "pw/audit/regist";
	}

	@RequestMapping(value = "regist", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("注册")
	public JsonMessage regist(Register item) {
		service.regist(item);
		item.setRegistTime(new Date());
		return new JsonMessage(true);
	}

	@RequestMapping(value = "auditSucess", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("审核通过")
	public JsonMessage auditSucess(Long registerId, String view) throws Exception {
		service.audit(registerId, true, view);
		return new JsonMessage(true, "审核通过");

	}

	@RequestMapping(value = "auditFail", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("审核不通过")
	public JsonMessage auditFail(Long registerId, String view) throws Exception {
		service.audit(registerId, false, view);
		return new JsonMessage(true, "审核不通过");
	}

	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(Model model, Long id) {
		model.addAttribute("carTypes", CarType.values());
		model.addAttribute("productTypes", ProductType.values());
		model.addAttribute("companyTypes", CompanyType.values());
		model.addAttribute("item", service.get(id));
		return "pw/audit/view";
	}
}
