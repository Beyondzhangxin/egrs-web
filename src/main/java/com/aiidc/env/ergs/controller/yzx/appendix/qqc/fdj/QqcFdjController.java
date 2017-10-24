/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix.qqc.fdj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdj;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjBs;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjBsService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjService;

/**
 * @author jiabin fan 轻型汽油车发动机
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj")
public class QqcFdjController {

	@Autowired
	private QqcFdjService qqcFdjService;
	@Autowired
	private QqcFdjBsService qqcFdjBsService;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	private String index(Model model, String flbh) {
		// 动力
		List<QqcFdj> fdjs = qqcFdjService.findByFlbh(flbh);
		model.addAttribute("fdjs", fdjs);
		model.addAttribute("flbh", flbh);
		model.addAttribute("lb", "qqc");
		return "yzx/plan/appendix/fdjTable";
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	private String edit(Model model, String flbh, String lb, @RequestParam(defaultValue = "true") Boolean flag,
			String fdjbh) {
		model.addAttribute("lb", lb);
		model.addAttribute("flbh", flbh);
		model.addAttribute("fdjbh", fdjbh);
		model.addAttribute("flag", flag);
		return "yzx/plan/appendix/appendixFdj";
	}

	@RequestMapping(value = "edit/{fdjbh}", method = RequestMethod.GET)
	private String edit(Model model, String flbh, int fdjbh) {
		return "yzx/plan/appendix/summery";
	}

	// 添加
	@RequestMapping(value = "/main/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdj qqcFdj, String ysb1_1, String ysb1_2, QqcFdjBs qqcFdjBs) {
		int resultBs = 0;
		int resultFdj = 0;
		if (null != ysb1_1 && null != ysb1_2) {
			String ysb1 = ysb1_1 + "±" + ysb1_2;
			qqcFdj.setYsb1(ysb1);
		}
		// 获取附录编号和发动机编号；
		String flbh = qqcFdj.getFlbh();
		Integer fdjbh = qqcFdj.getFdjbh();
		String pzlb = qqcFdjBs.getPzlb();
		qqcFdjBs.setBh(1);
		if (null != flbh && null != fdjbh) {
			// 查询已存在的发动机；
			QqcFdj qqcFdjOld = qqcFdjService.findByFlbhAndBh(flbh, fdjbh);
			// 查询已存在的打刻内容
			QqcFdjBs qqcFdjBsOld = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, 1, pzlb);
			// 将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdj, qqcFdjOld);
			BeanUtil.copyProperties(qqcFdjBs, qqcFdjBsOld);
			// 执行保存
			resultFdj = qqcFdjService.add(qqcFdjOld);
			resultBs = qqcFdjBsService.add(qqcFdjBsOld);
		} else {
			resultFdj = qqcFdjService.add(qqcFdj);
			Integer fdjbh2 = qqcFdjService.just(qqcFdj).getFdjbh();
			qqcFdjBs.setFdjbh(fdjbh2);
			resultBs = qqcFdjBsService.add(qqcFdjBs);
		}
		if (resultFdj == resultBs) {
			return new JsonMessage(true, "保存成功！");
		} else {
			return new JsonMessage(false, "保存失败！");
		}
	}

	// 删除根据编号查出传动系；
	@RequestMapping(value = "/delet", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh, String bh) {
		int resultBs = 0;
		int resultFdj = 0;
		if (null != flbh && null != bh) {
			Integer fdjbh = new Integer(bh);
			resultFdj = qqcFdjService.delete(flbh, fdjbh);
			resultBs = qqcFdjBsService.delete(flbh, fdjbh, 1, "FDJ");
			if (resultFdj == resultBs) {
				return new JsonMessage(true, "删除成功！");
			}
		} else {
			return new JsonMessage(false, "删除失败！");
		}
		return null;
	}

	// 发动机详情
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(String n, String flbh, Model model, String fdjbh, String flag, String bh, String device,
			String pzlb) {

		if ("0".equals(n)) {
			return "forward:main";
		} else if ("1".equals(n)) {
			// 燃料喷射
			return "forward:rlps";
		} else if ("2".equals(n)) {
			// 供油泵
			return "forward:gyb";
		} else if ("5".equals(n)) {
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/outlet/main?flbh=" + flbh + "&fdjbh=" + fdjbh
					+ "&pzlb=PQXSQ";
		} else if ("6".equals(n)) {
			// 气阀正时
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/timing?flbh=" + flbh + "&fdjbh=" + fdjbh;
		} else if ("7".equals(n)) {
			// 氧传感器
			model.addAttribute("flbh", flbh);
			model.addAttribute("fdjbh", fdjbh);
			model.addAttribute("lb", "qqc");
			return "yzx/plan/appendix/fdj/oxygen";
		} else if ("8".equals(n)) {
			// 氧传感器
			model.addAttribute("flbh", flbh);
			model.addAttribute("fdjbh", fdjbh);
			model.addAttribute("lb", "qqc");
			return "yzx/plan/appendix/fdj/evaporate";
		} else if ("9".equals(n)) {
			// 排气再循环
			model.addAttribute("flbh", flbh);
			model.addAttribute("fdjbh", fdjbh);
			model.addAttribute("lb", "qqc");
			return "yzx/plan/appendix/fdj/recycle";
		} else if ("10".equals(n)) {
			// obd
			model.addAttribute("flbh", flbh);
			model.addAttribute("fdjbh", fdjbh);
			model.addAttribute("lb", "qqc");
			return "yzx/plan/appendix/fdj/obd";
		} else if ("11".equals(n)) {
			// 润滑系
			model.addAttribute("flbh", flbh);
			model.addAttribute("fdjbh", fdjbh);
			model.addAttribute("lb", "qqc");
			return "yzx/plan/appendix/fdj/lubricate";
		} else if ("12".equals(n)) {
			// 混合动力
			model.addAttribute("flbh", flbh);
			model.addAttribute("fdjbh", fdjbh);
			model.addAttribute("lb", "qqc");
			return "yzx/plan/appendix/fdj/hybridize";
		} else if ("13".equals(n)) {
			// 新增
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/" + device + "/create?flbh=" + flbh + "&fdjbh=" + fdjbh
					+ "&bh=" + bh + "&pzlb=" + pzlb;
		} else if ("14".equals(n)) {
			// 点火装置
			model.addAttribute("flbh", flbh);
			model.addAttribute("fdjbh", fdjbh);
			model.addAttribute("lb", "qqc");
			return "yzx/plan/appendix/fdj/fire";
		} else if ("15".equals(n)) {
			// 污染控制装置
			model.addAttribute("flbh", flbh);
			model.addAttribute("fdjbh", fdjbh);
			model.addAttribute("lb", "qqc");
			return "yzx/plan/appendix/fdj/crankCase";
		} else if ("16".equals(n)) {
			// 空气喷射系统
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/config/main?flbh=" + flbh + "&fdjbh=" + fdjbh + "&pzlb="
					+ pzlb;
		} else if ("17".equals(n)) {
			// 发动机打刻内容
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/mark/main?flbh=" + flbh + "&fdjbh=" + fdjbh + "&pzlb="
					+ pzlb;
		} else if ("18".equals(n)) {
			// 冷启动

			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/coolBoot?flbh=" + flbh + "&fdjbh=" + fdjbh;
		}
		return null;

	}

	// 概述
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(String flbh, String fdjbh, Model model, @RequestParam(defaultValue = "true") boolean flag) {
		// 判断
		if (null != fdjbh && null != flbh && "" != fdjbh && "" != flbh) {
			Integer bhs = new Integer(fdjbh);
			QqcFdj qqcFdj = qqcFdjService.findByFlbhAndBh(flbh, bhs);
			// 查询打刻内容
			QqcFdjBs qqcFdjBs = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, bhs, 1, "FDJ");
			if (null != qqcFdj) {
				model.addAttribute("car", qqcFdj);
				model.addAttribute("bs", qqcFdjBs);
				// 获取压缩比的数据；
				String ysb1 = qqcFdj.getYsb1();
				// 如果ysb1不为空用±分割
				if (null != ysb1 && !"".equals(ysb1)) {
					String ysb1_1 = ysb1.split("±")[0];
					String ysb1_2 = ysb1.split("±")[1];
					// 将两个数值放入model在页面回显；
					model.addAttribute("ysb1_1", ysb1_1);
					model.addAttribute("ysb1_2", ysb1_2);
				}
				model.addAttribute("flag", !flag);
			}
		} else {
			QqcFdj qqcFdj = new QqcFdj();
			qqcFdj.setFlbh(flbh);
			model.addAttribute("car", qqcFdj);

			QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
			qqcFdjBs1.setFlbh(flbh);
			model.addAttribute("bs", qqcFdjBs1);
		}
		return "yzx/plan/appendix/fdj/summary";
	}

	// IUPR页面
	@RequestMapping(value = "/obd/main", method = RequestMethod.GET)
	public String obdmain(String flbh, String fdjbh, Model model, String flag) {
		// 判断
		if (null != fdjbh && null != flbh && "" != fdjbh && "" != flbh) {
			Integer bhs = new Integer(fdjbh);
			QqcFdj qqcFdj = qqcFdjService.findByFlbhAndBh(flbh, bhs);
			if (null != qqcFdj) {
				model.addAttribute("car", qqcFdj);
				if (null != flag)
					model.addAttribute("flag", true);
			}
		} else {
			QqcFdj qqcFdj = new QqcFdj();
			qqcFdj.setFlbh(flbh);
			model.addAttribute("car", qqcFdj);
		}
		return "yzx/plan/appendix/fdj/iupr";
	}

	// 保存冷却
	@RequestMapping(value = "/obd/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage addCdx(QqcFdj qqcFdj) {
		int result = 0;
		// 获取附录编号和发动机编号；
		String flbh = qqcFdj.getFlbh();
		Integer fdjbh = qqcFdj.getFdjbh();
		if (null != flbh && null != fdjbh) {
			// 查询已存在的发动机；
			QqcFdj qqcFdjOld = qqcFdjService.findByFlbhAndBh(flbh, fdjbh);
			// 将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdj, qqcFdjOld);
			// 执行保存
			result = qqcFdjService.add(qqcFdjOld);
		} else {
			result = qqcFdjService.add(qqcFdj);
		}
		if (result == 1) {
			return new JsonMessage(true, "保存成功！");
		} else {
			return new JsonMessage(false, "保存失败！");
		}
	}
}
