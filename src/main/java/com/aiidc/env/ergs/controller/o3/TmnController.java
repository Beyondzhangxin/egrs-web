/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.o3;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.aspect.LogAnnotation;
import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.jpa.po.o3.E3Tmn;
import com.aiidc.env.ergs.service.o3.TmnService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;

/**
 * @author wuwenjun
 *
 */
@Controller
@RequestMapping("egrs/o3/tmn")
public class TmnController {
	@ModelAttribute("itemClass")
	public Class<?> itemClass() {
		return E3Tmn.class;
	}

	@Autowired
	private TmnService service;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		return "o3/tmn/index";
	}

	@RequestMapping(value = "table", method = RequestMethod.GET)
	public String table(QryPageVo qryVo, E3Tmn item, Model model) {
		model.addAttribute("page", find(qryVo, item));
		return "common/table";
	}

	@RequestMapping(value = "find", method = RequestMethod.GET)
	@ResponseBody
	public Page<E3Tmn> find(QryPageVo qryVo, E3Tmn item) {
		return service.find(qryVo, item);
	}

	@RequestMapping(value = "save", method = RequestMethod.GET)
	public String toSave(E3Tmn command, Model model) {
		if (command.getTmid() != null) {
			command = service.get(command.getTmid());
		}
		model.addAttribute("command", command);
		return "common/form";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	@LogAnnotation("新增/编辑商标")
	public String save(E3Tmn item) {
		item.setManufid(LoginUserUtil.getLoginManufid());
		service.save(item);
		return "redirect:index";
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("删除商标")
	public JsonMessage delete(BigDecimal[] id) {
		service.delete(id);
		return new JsonMessage(true);
	}

}
