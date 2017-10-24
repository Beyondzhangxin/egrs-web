/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix.qqc.fdj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdj;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/cool")
public class QqcFdjCoolController {

	@Autowired
	private QqcFdjService qqcFdjService;

	// 跳转冷却系统
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(String flbh, String fdjbh, Model model) {
		model.addAttribute("flbh", flbh);
		model.addAttribute("fdjbh", fdjbh);
		model.addAttribute("lb", "qqc");
		return "yzx/plan/appendix/fdj/fdjCool";
	}

	// 发动机详情
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(String n) {
		if ("0".equals(n)) {
			return "forward:main";
		} else if ("1".equals(n)) {
			return "forward:airCool/main";
		} else if ("2".equals(n)) {
			return "forward:liquidCool/main";
		} else {
			return null;
		}
	}

	// 冷却系统页面
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String coolmain(String flbh, String fdjbh, Model model, String flag) {
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
		return "yzx/plan/appendix/fdj/cooling";
	}

	// 保存冷却
	@RequestMapping(value = "add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdj qqcFdj) {
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
