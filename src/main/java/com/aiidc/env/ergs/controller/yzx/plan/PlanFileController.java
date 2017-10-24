/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.plan;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aiidc.env.ergs.common.aspect.LogAnnotation;
import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.jpa.po.yzx.plan.Plan;
import com.aiidc.env.ergs.jpa.po.yzx.plan.PlanFiles;
import com.aiidc.env.ergs.service.yzx.plan.PlanFilesService;
import com.aiidc.env.ergs.service.yzx.plan.PlanService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/planFile")
public class PlanFileController {
	@Resource
	private PlanFilesService planFilesService;
	// 注入planService
	@Resource
	private PlanService planService;

	// 页面跳转
	@RequestMapping("/index")
	public String index() {
		return "yzx/plan/planFiles";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	// @LogAnnotation("增加计划书文件")
	// 增加
	public String add(PlanFiles planFilesOld, String jhsbh) {
		// 从数据库中查询planFile对象，如果为空就保存页面的信息，保存新的对象；
		PlanFiles planFilesNew = planFilesService.findone(jhsbh);
		if (null != planFilesNew) {
			// 页面中的数据复制给新的planFile中；
			BeanUtil.copyProperties(planFilesOld, planFilesNew);
			planFilesService.savePlanFiles(planFilesNew);
		} else {
			planFilesService.savePlanFiles(planFilesOld);
		}
		return "redirect:control?jhsbh=" + jhsbh;
	}

	// 执行标准跳转；
	@RequestMapping(value = "/planFile", method = RequestMethod.GET)
	public String planFile(String jhsbh, Model model) {
		PlanFiles planFiles = planFilesService.findone(jhsbh);
		model.addAttribute("planFiles", planFiles);
		return "yzx/plan/planGb";
	}

	// 查看国家标准
	@RequestMapping(value = "/checkGB", method = RequestMethod.GET)
	public String planGB(String jhsbh, Model model) {
		PlanFiles planFiles = planFilesService.findone(jhsbh);
		model.addAttribute("planFiles", planFiles);
		String[] standards = new String[] { "GB 18176-2016", "GB 14622-2016", "GB 17691-2005第四阶段", "GB 3847-2005",
				"GB 18285-2005", "GB 1495-2002第二阶段", "GB 18352.3-2005第四阶段", "GB 18352.5-2013", "GB 18352.6-2016",
				"GB11340-2005", "GB/T 19233-2003", "HJ 437-2008", "HJ 438-2008", "HJ 439-2008", "GB14763-2005",
				"GB14762-2008第四阶段", "GB20890-2007", "GB 17691-2005第五阶段", "HJ689-2014", "GB16169-2005" };
		model.addAttribute("standards", standards);
		return "yzx/plan/planGb";
	}

	// 跳转控制文件
	@RequestMapping(value = "/control", method = RequestMethod.GET)
	public String planControl(String jhsbh, Model model) {
		PlanFiles planFiles = planFilesService.findone(jhsbh);
		model.addAttribute("planFiles", planFiles);
		return "yzx/plan/planFiles";
	}

	// 保存控制文件
	@RequestMapping(value = "/addControl", method = RequestMethod.GET)
	@LogAnnotation("保存控制文件")
	public String addControl(PlanFiles planFilesOld, String jhsbh) {
		// 从数据库中查询planFile对象，如果为空就保存页面的信息，保存新的对象；
		PlanFiles planFilesNew = planFilesService.findone(jhsbh);
		if (null != planFilesNew) {
			// 页面中的数据复制给新的planFile中；
			BeanUtil.copyProperties(planFilesOld, planFilesNew);
			planFilesService.savePlanFiles(planFilesNew);
		} else {
			planFilesService.savePlanFiles(planFilesOld);
		}
		return "redirect:device?jhsbh=" + jhsbh;
	}

	// 跳转检测设备
	@RequestMapping(value = "/device", method = RequestMethod.GET)
	public String planDevice(String jhsbh, Model model) {
		PlanFiles planFiles = planFilesService.findone(jhsbh);
		model.addAttribute("planFiles", planFiles);
		return "yzx/plan/planDevice";
	}

	// 保存检测设备
	@RequestMapping(value = "/addDevice", method = RequestMethod.GET)
	@LogAnnotation("保存检测设备")
	public String addDevice(PlanFiles planFilesOld, String jhsbh) {
		// 从数据库中查询planFile对象，如果为空就保存页面的信息，保存新的对象；
		PlanFiles planFilesNew = planFilesService.findone(jhsbh);
		if (null != planFilesNew) {
			// 页面中的数据复制给新的planFile中；
			BeanUtil.copyProperties(planFilesOld, planFilesNew);
			planFilesService.savePlanFiles(planFilesNew);
		} else {
			planFilesService.savePlanFiles(planFilesOld);
		}
		return "redirect:exhaust?jhsbh=" + jhsbh;
	}

	// 跳转检测设备
	@RequestMapping(value = "/exhaust", method = RequestMethod.GET)
	public String planExhaust(String jhsbh, Model model) {
		PlanFiles planFiles = planFilesService.findone(jhsbh);
		model.addAttribute("planFiles", planFiles);
		return "yzx/plan/planExhaust";
	}

	// 保存排放设备
	@RequestMapping(value = "/addExhaust", method = RequestMethod.GET)
	@LogAnnotation("保存排放设备")
	public String addExhaust(PlanFiles planFilesOld, String jhsbh) {
		// 从数据库中查询planFile对象，如果为空就保存页面的信息，保存新的对象；
		PlanFiles planFilesNew = planFilesService.findone(jhsbh);
		if (null != planFilesNew) {
			// 页面中的数据复制给新的planFile中；
			BeanUtil.copyProperties(planFilesOld, planFilesNew);
			planFilesService.savePlanFiles(planFilesNew);
		} else {
			planFilesService.savePlanFiles(planFilesOld);
		}
		return "redirect:correct?jhsbh=" + jhsbh;
	}

	// 跳转纠错文件
	@RequestMapping(value = "/correct", method = RequestMethod.GET)
	public String planCorrect(String jhsbh, Model model) {
		PlanFiles planFiles = planFilesService.findone(jhsbh);
		model.addAttribute("planFiles", planFiles);
		return "yzx/plan/planCorrect";
	}

	// 保存纠错文件
	@RequestMapping(value = "/addCorrect", method = RequestMethod.GET)
	@LogAnnotation("保存纠错文件")
	public String addCorrect(PlanFiles planFilesOld, String jhsbh, String memo) {
		// 从数据库中查询planFile对象，如果为空就保存页面的信息，保存新的对象；
		PlanFiles planFilesNew = planFilesService.findone(jhsbh);
		if (null != planFilesNew) {
			// 页面中的数据复制给新的planFile中；
			BeanUtil.copyProperties(planFilesOld, planFilesNew);
			planFilesService.savePlanFiles(planFilesNew);
		} else {
			planFilesService.savePlanFiles(planFilesOld);
		}
		Plan plan = planService.findPlan(jhsbh);
		plan.setMemo(memo);
		planService.addPlan(plan);
		return "redirect:/ergs/yzx/plan/index";
	}

	// 查询planFile
	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public String find(String jhsbh, Model model) {
		PlanFiles planFiles = planFilesService.findone(jhsbh);
		model.addAttribute("planFiles", planFiles);
		return "";
	}
	/*
	 * //删除planFile
	 * 
	 * @RequestMapping(value = "/delete",method=RequestMethod.GET) public int
	 * delete(String jhsbh){ int fileResult = planFilesService.delete(jhsbh); }
	 */
}
