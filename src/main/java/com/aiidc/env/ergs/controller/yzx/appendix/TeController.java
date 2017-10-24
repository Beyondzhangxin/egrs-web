/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.jpa.po.o3.E3Tmn;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
import com.aiidc.env.ergs.service.o3.TmnService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;
import com.aiidc.env.ergs.service.yzx.appendix.TeAppendixService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/teAppendix")
public class TeController {
	@Autowired
	private TeAppendixService teAppendixService;
	// 商标
	@Resource
	private TmnService tmnService;

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	private String edit(Model model, String flbh, String bh) {
		model.addAttribute("flbh", flbh);
		model.addAttribute("bh", bh);
		return "yzx/plan/appendix/teVehicle";
	}

	// 添加
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(TeAppendix teAppendix) {
		int result = 0;
		// 获取附录编号和传动系编号
		String flbh = teAppendix.getFlbh();
		Integer bh = teAppendix.getBh();
		if (null != bh) {
			// 根据附录编号和传动系编号查找传动系
			TeAppendix teOld = teAppendixService.findByFlbhAndBh(flbh, bh);
			// 判断cdxold是否存在，存在就执行复制，不存在就创建新的；
			if (null != teOld) {
				BeanUtil.copyProperties(teAppendix, teOld);
				result = teAppendixService.add(teOld);
			}
		} else {
			result = teAppendixService.add(teAppendix);
		}
		if (result > 0) {
			return new JsonMessage(true, String.valueOf(result));
		} else {
			return new JsonMessage(false, "保存失败！");
		}
	}

	// 删除根据编号产出传动系；
	@RequestMapping(value = "/delet", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh, String bh) {
		Integer bhs = new Integer(bh);
		int result = teAppendixService.delete(flbh, bhs);
		if (result == 1) {
			return new JsonMessage(true, "删除成功！");
		} else {

			return new JsonMessage(false, "删除失败！");
		}
	}

	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(String n, @RequestParam(required = false) String device) {
		if ("0".equals(n)) {
			return "forward:main";
		} else if ("1".equals(n)) {
			return "forward:../njAppendix/main";
		}
		return null;
	}

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(String flbh, String bh, Model model, @RequestParam(required = false) String flag) {
		// 获取用户的manufid;
		User user = (User) LoginUserUtil.getLoginUser().getDetail();
		String manufid = user.getManufid();
		List<E3Tmn> tmns = tmnService.findByManufid(manufid);
		// 将商标放入到model中;
		model.addAttribute("tmns", tmns);
		// 判断
		if (null != bh && null != flbh && "" != bh && "" != flbh) {
			Integer bhs = new Integer(bh);
			TeAppendix teAppendix = teAppendixService.findByFlbhAndBh(flbh, bhs);
			if (null != teAppendix) {
				model.addAttribute("car", teAppendix);
				if (null != flag) {
					model.addAttribute("flag", true);
				}
			}
		} else {
			TeAppendix teAppendix = new TeAppendix();
			teAppendix.setFlbh(flbh);
			model.addAttribute("car", teAppendix);
		}
		return "yzx/plan/appendix/teSummary";
	}
}
