/**
 * 
 */
package com.aiidc.env.ergs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.service.pw.PermissionService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;
import com.aiidc.env.ergs.service.pw.util.PermissionUtil;

/**
 * @author wuwen
 *
 */
@Controller
public class HomeController {

	@Autowired(required = false)
	private PermissionService permissionService;

	@RequestMapping(value = { "index" }, method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "账号不存在或用户名/密码错误");
		}
		if (logout != null) {
			model.addObject("msg", "你已经成功退出");
		}
		model.setViewName("login");
		return model;
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}

	@RequestMapping(value = "/header", method = RequestMethod.GET)
	public String header(Model model) {
		User loginUserDetail = LoginUserUtil.getLoginUserDetail();
		if (loginUserDetail.isSuperAdmin()) {
			model.addAttribute("nav", PermissionUtil.match(permissionService.findAllPermission(true), null));
		} else {
			model.addAttribute("nav",
					PermissionUtil.match(permissionService.findAllPermission(true), loginUserDetail.getPermids()));
		}
		return "common/header";
	}

}
