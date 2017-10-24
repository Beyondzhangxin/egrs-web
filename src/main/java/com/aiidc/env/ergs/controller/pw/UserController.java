/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.pw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.aspect.LogAnnotation;
import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.constant.SJDWType;
import com.aiidc.env.ergs.jpa.po.pw.Permission;
import com.aiidc.env.ergs.jpa.po.pw.SJDW;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.service.pw.PermissionService;
import com.aiidc.env.ergs.service.pw.SJDWService;
import com.aiidc.env.ergs.service.pw.UserService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;
import com.aiidc.env.ergs.service.pw.util.PermissionUtil;
import com.aiidc.env.ergs.service.pw.vo.UserUpdateVo;

/**
 * @author wuwenjun
 *
 */
@Controller
@RequestMapping("egrs/pw/user")
public class UserController {

	@Autowired
	private UserService service;
	@Autowired
	private SJDWService sjdwService;
	@Autowired(required = false)
	private PermissionService permissionService;

	@RequestMapping(value = { "/", "index" }, method = RequestMethod.GET)
	public String index() {
		return "pw/user/index";
	}

	@RequestMapping(value = "table", method = RequestMethod.GET)
	public String table(QryPageVo qryVo, User user, Model model) {
		model.addAttribute("page", find(qryVo, user));
		return "pw/user/table";
	}

	@RequestMapping(value = "find", method = RequestMethod.GET)
	@ResponseBody
	public Page<User> find(QryPageVo qryVo, User user) {
		return service.find(qryVo, user);
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("新增/编辑用户")
	public JsonMessage saveUser(User vo) {
		try {
			service.save(vo);
			return new JsonMessage(true);
		} catch (Exception e) {
			return new JsonMessage(false, e.getMessage());
		}
	}

	@RequestMapping(value = "form", method = RequestMethod.GET)
	public String editUser(@RequestParam(required = false) Long id, Model model) {
		if (id != null) {
			model.addAttribute("command", service.get(id));
		} else {
			model.addAttribute("command", new User());
		}
		return "pw/user/form";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("修改个人信息")
	public JsonMessage updateUser(UserUpdateVo vo) {
		service.update(vo);
		return new JsonMessage(true, "个人信息修改成功");
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("删除用户")
	public void delelteUser(Long id) {
		service.delete(id);
	}

	@RequestMapping(value = "self", method = RequestMethod.GET)
	public String self(Model model) {
		model.addAttribute("user", LoginUserUtil.getLoginUserDetail());
		return "pw/user/self";
	}

	@RequestMapping(value = "password", method = RequestMethod.GET)
	public String password() {
		return "pw/user/password";
	}

	@RequestMapping(value = "changePassword", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("修改用户密码")
	public JsonMessage changePassword(String oldPwd, String newPwd) {
		try {
			int result = service.changePassword(oldPwd, newPwd);
			if (result == 0) {
				return new JsonMessage(true, "密码更新成功");
			} else if (result == 1) {
				return new JsonMessage(false, "原密码错误");
			} else {
				return null;
			}
		} catch (Exception e) {
			return new JsonMessage(false, "密码更新失败");
		}
	}

	@RequestMapping(value = "sjdw", method = RequestMethod.GET)
	public String company(Model model) {
		model.addAttribute("command", sjdwService.findByManufid(Long.valueOf(LoginUserUtil.getLoginManufid())));
		model.addAttribute("types", SJDWType.values());
		return "pw/user/sjdw";
	}

	@RequestMapping(value = "sjdw", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("修改企业信息")
	public JsonMessage sjdw(SJDW sjdw) {
		sjdwService.update(sjdw);
		return new JsonMessage(true, "企业信息更新成功");
	}

	@RequestMapping(value = "auth", method = RequestMethod.GET)
	public String auth(Model model, Long id) {
		List<Permission> allPermissions = permissionService.findAllPermission();
		User user = service.get(id);
		model.addAttribute("allPermissions", PermissionUtil.match(allPermissions, user.getPermids()));
		model.addAttribute("user", user);
		return "pw/user/auth";
	}

	@RequestMapping(value = "changAuth", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("修改用户授权")
	public JsonMessage changAuth(Long id, @RequestParam("auth") Long[] permids) {
		service.changAuth(id, permids);
		return new JsonMessage(true, "企业信息更新成功");
	}

}
