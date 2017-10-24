package com.aiidc.env.ergs.controller.yzx.appendix.qqc;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainService;
import com.aiidc.env.ergs.service.yzx.appendix.vo.AppendixQryVo;

/**
 * 附录controller
 * 
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc")
public class QqcController {
	@Resource
	private QqcMainService qqcMainService;

	// 根据计划书编号查询所有对应的附录
	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public String findAppendixByJhsbh(AppendixQryVo vo, QryPageVo qryVo, Model model) {
		model.addAttribute("page", qqcMainService.find(vo, qryVo));
		return "yzx/plan/appendix/qqc/table";

	}
}
