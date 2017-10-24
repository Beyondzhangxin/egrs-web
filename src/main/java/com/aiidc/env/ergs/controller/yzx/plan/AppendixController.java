package com.aiidc.env.ergs.controller.yzx.plan;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.common.util.SpringContextUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.constant.Type;
import com.aiidc.env.ergs.constant.Vehicle;
import com.aiidc.env.ergs.jpa.po.OriginalCar;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.Appendix;
import com.aiidc.env.ergs.service.o3.ChangeNameService;
import com.aiidc.env.ergs.service.o3.ScdwmcService;
import com.aiidc.env.ergs.service.o3.TmnService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;
import com.aiidc.env.ergs.service.yzx.appendix.AppendixService;
import com.aiidc.env.ergs.service.yzx.appendix.SearchService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainCdxService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainService;
import com.aiidc.env.ergs.service.yzx.appendix.vo.AppendixQryVo;

/**
 * 附录controller
 * 
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix")
public class AppendixController {
	@Resource
	private AppendixService appendixService;
	@Resource
	private QqcMainService qqcMainService;
	@Resource
	private QqcMainCdxService qqcMainCdxService;
	@Resource
	private TmnService tmnService;

	@RequestMapping(value = "query", method = RequestMethod.GET)
	public String search(Model model, AppendixQryVo vo) {
		model.addAttribute("vehicles", Vehicle.data());
		model.addAttribute("command", vo);
		return "yzx/plan/appendix/query";
	}

	// 根据计划书编号查询所有对应的附录
	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public String findAppendixByJhsbh(String jhsbh, QryPageVo qryVo, Model model, Appendix appendix) {
		Page<Appendix> page = appendixService.findAllAppendix(jhsbh, qryVo, appendix);
		model.addAttribute("page", page);
		return "yzx/plan/appendix/table";

	}

	// 创建计划书下的附录
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addAppendix(Appendix appendix, String jhsbh, Model model) {
		appendixService.addAppendix(appendix, jhsbh);
		model.addAttribute("appendix", appendix);
		// 取到车类别
		String cllb = appendix.getFllb();
		String lb = Type.backShort(cllb);
		model.addAttribute("lb", lb);
		return "yzx/plan/appendix/appendixVehicle";
	}

	/**
	 * 返回生产厂名称的集合；
	 */
	@Resource
	private ScdwmcService scdwmcService;
	@Resource
	private ChangeNameService changeNameService;

	@RequestMapping(value = "/yzx/scmc", method = RequestMethod.POST)
	@ResponseBody
	public List<String> findScmc() {
		// 从认证中获取manufid；
		String manufid = LoginUserUtil.getLoginManufid();
		// 用于存放名字，包括更改过的名字；
		List<String> names = new ArrayList<>();
		// 根据manufid查询所有的生产厂名称
		List<String> list = scdwmcService.selectScdwmc(manufid);
		if (null != list && list.size() > 0) {
			for (String name : list) {
				// 获取更改后的名字
				String newName = changeNameService.getNewName(name);
				if (newName != null) {
					names.add(newName);
				} else {
					names.add(name);
				}
			}
		}
		return names;
	}

	/**
	 * 删除计划书
	 */
	@RequestMapping(value = "/deleteAppendix", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage deleteAppendix(String flbh) {
		int appendexResult = appendixService.deleteAppendix(flbh);
		if (appendexResult == 1) {
			return new JsonMessage(true, "删除成功!");
		} else {
			return new JsonMessage(false, "删除失败！");
		}
	}

	/**
	 * 提交附录
	 */
	@RequestMapping(value = "/refer", method = RequestMethod.GET)
	@ResponseBody
	public JsonMessage refer(String flbh) {
		Appendix appendix = appendixService.findAppendix(flbh);
		int result = appendixService.referAppendix(appendix);
		;
		if (result == 1) {
			return new JsonMessage(true, "提交成功!");
		} else {
			return new JsonMessage(false, "提交失败！");
		}
	}

	/**
	 * 审核附录
	 */
	@RequestMapping(value = "/exam", method = RequestMethod.GET)
	@ResponseBody
	// @Secured("ROLE_13")
	public JsonMessage exam(String flbh, String shlog, String status) {
		Appendix appendix = appendixService.findAppendix(flbh);
		appendix.setShlog(shlog);
		appendix.setStatus(status);
		int result = appendixService.examAppendix(appendix);
		;
		if (result == 1) {
			return new JsonMessage(true, "操作成功!");
		} else {
			return new JsonMessage(false, "操作失败！");
		}
	}

	/**
	 * 查询附录状态
	 */
	@RequestMapping(value = "/checkStatus", method = RequestMethod.GET)
	@ResponseBody
	public String checkStatus(String flbh) {
		Appendix appendix = appendixService.findAppendix(flbh);
		return appendix.getStatus();
	}

	/**
	 * 备案附录
	 */
	@RequestMapping(value = "/record", method = RequestMethod.GET)
	@ResponseBody
	// @Secured("ROLE_13")
	public JsonMessage record(String flbh, String balog, String status) {
		Appendix appendix = appendixService.findAppendix(flbh);
		appendix.setShlog(balog);
		appendix.setStatus(status);
		int result = appendixService.recordAppendix(appendix);

		if (result == 1) {
			return new JsonMessage(true, "操作成功!");
		} else {
			return new JsonMessage(false, "操作失败！");
		}
	}

	/**
	 * 附录车型描述
	 */
	@RequestMapping(value = "/describe", method = RequestMethod.GET)
	public String describe(String flbh, Model model) {
		// m用于标识用动力系转回来的
		Appendix appendix = appendixService.findAppendix(flbh);
		model.addAttribute("appendix", appendix);
		// 取到车类别
		String cllb = appendix.getFllb();
		String lb = Type.backShort(cllb);
		model.addAttribute("lb", lb);
		return "yzx/plan/appendix/appendixVehicle";
	}

	/**
	 * 车型选择页面
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(String jhsbh, Model model) {
		model.addAttribute("jhsbh", jhsbh);
		return "yzx/plan/appendix/appendixCreate";
	}

	/**
	 * 搜索原车型
	 * 
	 * @param type
	 */
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String index(OriginalCar originalCar, Model model, String type, QryPageVo qryVo) {
		String sub = Type.backShort(type);
		SearchService searchService = SpringContextUtil.getBean(sub + "SearchService", SearchService.class);
		model.addAttribute("page", searchService.searchAll(originalCar, qryVo));
		return "yzx/plan/appendix/motherVehicleTable";
	}
}
