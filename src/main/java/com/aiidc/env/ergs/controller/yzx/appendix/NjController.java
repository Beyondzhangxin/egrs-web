/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.controller.yzx.plan.AppendixController;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.NjAppendix;
import com.aiidc.env.ergs.service.o3.TmnService;
import com.aiidc.env.ergs.service.yzx.appendix.NjAppendixService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/njAppendix")
public class NjController {
	@Autowired
	private NjAppendixService njAppendixService;
	// 商标
	@Resource
	private TmnService tmnService;
	// 附录
	@Resource
	private AppendixController appendixContrller;

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy.MM.dd"), true));

	}

	// 添加
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(NjAppendix njAppendix) {
		int result = 0;
		// 获取附录编号和传动系编号
		String flbh = njAppendix.getFlbh();
		Integer bh = njAppendix.getBh();
		Integer njbh = njAppendix.getNjbh();
		if (null != njbh) {
			// 根据附录编号和传动系编号查找传动系
			NjAppendix njOld = njAppendixService.findByFlbhAndBhAndNjbh(flbh, bh, njbh);
			// 判断cdxold是否存在，存在就执行复制，不存在就创建新的；
			if (null != njOld) {
				BeanUtil.copyProperties(njAppendix, njOld);
				result = njAppendixService.add(njOld);
			}
		} else {

			result = njAppendixService.add(njAppendix);
		}
		if (result == 1) {
			return new JsonMessage(true, "保存成功！");
		} else {

			return new JsonMessage(false, "保存失败！");
		}
	}

	// 删除根据编号
	@RequestMapping(value = "/delet", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh, String bh, String njbh) {
		Integer bhs = new Integer(bh);
		Integer njbhs = new Integer(njbh);
		int result = njAppendixService.deleteNj(flbh, bhs, njbhs);
		if (result == 1) {
			return new JsonMessage(true, "删除成功！");
		} else {

			return new JsonMessage(false, "删除失败！");
		}
	}

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(String flbh, String bh, Model model, String flag) {
		// 初始化生产厂
		List<String> scmcs = appendixContrller.findScmc();
		model.addAttribute("scmcs", scmcs);
		// 判断
		if (null != flbh && "" != flbh && null != bh && "" != bh) {
			// 根据附录编号和发动机编号查询所有的对象
			List<NjAppendix> njs = njAppendixService.findByFlbhAndBh(flbh, new Integer(bh));
			// 如果对象存在就放到model中
			if (null != njs && njs.size() > 0) {
				model.addAttribute("njs", njs);
				model.addAttribute("bh", bh);
				model.addAttribute("flbh", flbh);
				return "yzx/plan/appendix/endureTable";
			} else {
				return "forward:create";
			}
		}
		return null;

	}

	// 跳转到创建新的页面
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(String flbh, Model model, @RequestParam(defaultValue = "true") Boolean flag, String bh,
			@RequestParam(required = false) String njbh) {
		// 初始化生产厂
		List<String> scmcs = appendixContrller.findScmc();
		model.addAttribute("scmcs", scmcs);
		Integer bhs = new Integer(bh);
		if (null != njbh) {
			Integer njbhs = new Integer(njbh);
			NjAppendix njAppendix = njAppendixService.findByFlbhAndBhAndNjbh(flbh, bhs, njbhs);
			if (null != njAppendix) {
				model.addAttribute("car", njAppendix);
				model.addAttribute("flag", !flag);
			}
		} else {
			NjAppendix njAppendix1 = new NjAppendix();
			njAppendix1.setFlbh(flbh);
			njAppendix1.setBh(bhs);
			model.addAttribute("car", njAppendix1);
		}
		return "yzx/plan/appendix/endure";
	}
}
