/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.o3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.jpa.po.o3.Jcdw;
import com.aiidc.env.ergs.service.o3.JcdwService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;

/**
 * @author wuwenjun
 *
 */
@Controller
@RequestMapping("egrs/o3/jcdw")
public class JcdwController {
	@ModelAttribute("itemClass")
	public Class<?> itemClass() {
		return Jcdw.class;
	}

	@Autowired
	private JcdwService service;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		return "o3/jcdw/index";
	}

	@RequestMapping(value = "table", method = RequestMethod.GET)
	public String table(QryPageVo qryVo, Model model) {
		model.addAttribute("page", find(qryVo));
		model.addAttribute("manufid", LoginUserUtil.getLoginManufid());
		return "o3/jcdw/table";
	}

	@RequestMapping(value = "find", method = RequestMethod.GET)
	@ResponseBody
	public Page<Jcdw> find(QryPageVo qryVo) {
		return service.find(qryVo);
	}

	@RequestMapping(value = "addAuth", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage addAuth(String jcdwId) {
		service.addAuth(jcdwId);
		return new JsonMessage(true, "操作成功");
	}

	@RequestMapping(value = "removeAuth", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage removeAuth(String jcdwId) {
		service.removeAuth(jcdwId);
		return new JsonMessage(true, "操作成功");
	}

}
