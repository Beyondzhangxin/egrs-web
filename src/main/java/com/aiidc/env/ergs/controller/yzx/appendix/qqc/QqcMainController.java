/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix.qqc;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.controller.yzx.plan.AppendixController;
import com.aiidc.env.ergs.jpa.po.o3.E3Tmn;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMain;
import com.aiidc.env.ergs.service.o3.TmnService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;
import com.aiidc.env.ergs.service.yzx.appendix.TeAppendixService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainCdxService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainCtService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainLtService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjService;

/**
 * @author jiabin fan 轻型汽油车概述
 */
@Controller
@RequestMapping(value = "ergs/yzx/plan/appendix/qqc/main")
public class QqcMainController {
	@Resource
	private QqcMainService qqcMainService;
	// 传动系
	@Resource
	private QqcMainCdxService qqcMainCdxService;
	// 轮胎
	@Resource
	private QqcMainLtService qqcMainLtService;
	// 车体
	@Resource
	private QqcMainCtService qqcMainCtService;
	// 商标
	@Resource
	private TmnService tmnService;
	// 发动机
	@Resource
	private QqcFdjService qqcFdjService;
	// 附录
	@Resource
	private AppendixController appendixContrller;
	// 视同附录
	@Resource
	private TeAppendixService teAppendixService;

	// 新增
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage addQqcMain(QqcMain qqcMain, String flbh) {
		// 获取qqcMain对象
		QqcMain qqcMainOld = qqcMainService.findQqcMain(flbh);
		// 判断对象是否存在
		if (null != qqcMainOld) {
			// 将原有的复制给新的；
			BeanUtil.copyProperties(qqcMain, qqcMainOld);
			int result = qqcMainService.addQqcMain(qqcMainOld);
			if (result == 1) {
				return new JsonMessage(true, "保存成功！");
			}
		} else {
			int result = qqcMainService.addQqcMain(qqcMain);
			if (result == 1) {
				return new JsonMessage(true, "保存成功！");
			}
		}
		return null;
	}

	/**
	 * 附录详情
	 */
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(String n, String flbh, Model model, String bh, Boolean edit, String type) {
		if ("0".equals(n)) {
			// 概述
			// 获取用户的manufid;
			User user = (User) LoginUserUtil.getLoginUser().getDetail();
			String manufid = user.getManufid();
			List<E3Tmn> tmns = tmnService.findByManufid(manufid);
			// 将商标放入到model中;
			model.addAttribute("tmns", tmns);

			// 初始化生产厂
			List<String> scmcs = appendixContrller.findScmc();
			model.addAttribute("scmcs", scmcs);
			// 获取qqcmain对象
			QqcMain qqcMain = qqcMainService.findQqcMain(flbh);
			// 如果为空就new一个，保证model中有qqcmain对象，springmvc form 使用；
			if (null != qqcMain) {
				model.addAttribute("car", qqcMain);
			} else {
				QqcMain qqcMain2 = new QqcMain();
				qqcMain2.setFlbh(flbh);
				model.addAttribute("car", qqcMain2);
			}
			return "yzx/plan/appendix/summary";
		} else if ("1".equals(n)) {
			// 特征
			// 获取qqcmain对象
			QqcMain qqcMain = qqcMainService.findQqcMain(flbh);
			// 如果为空就new一个，保证model中有qqcmain对象，springmvc form 使用；
			if (null != qqcMain) {
				model.addAttribute("car", qqcMain);
			} else {
				QqcMain qqcMain2 = new QqcMain();
				qqcMain2.setFlbh(flbh);
				model.addAttribute("car", qqcMain2);
			}
			String lb = "qqc";
			model.addAttribute("lb", lb);
			return "yzx/plan/appendix/feature";
		} else if ("2".equals(n)) {
			return "forward:../fdj/index";
		} else if ("3".equals(n)) {
			return "forward:../cdx/index";
		} else if ("4".equals(n)) {
			// 悬挂系
			return "forward:../lt/index";
		} else if ("5".equals(n)) {
			// 车体
			return "forward:../ct/index";
		} else if ("9".equals(n)) {
			// 视同车型
			// 获取所有teAppendix对象
			List<TeAppendix> tes = teAppendixService.findByFlbh(flbh);
			if (null != tes && tes.size() > 0) {
				model.addAttribute("tes", tes);
			}
			model.addAttribute("flbh", flbh);
			return "yzx/plan/appendix/teAppendixTable";
		} else if ("10".equals(n)) {
			// 原车型
			model.addAttribute("type", type);
			model.addAttribute("flbh", flbh);
			return "yzx/plan/appendix/motherVehicle";
		} else {
			return null;
		}
	}
}
