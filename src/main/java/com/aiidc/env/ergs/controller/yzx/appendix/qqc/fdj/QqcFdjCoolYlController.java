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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjYl;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjYlService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/cool/liquidCool")
public class QqcFdjCoolYlController {
	@Autowired
	private QqcFdjYlService qqcFdjYlService;

	// 添加
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjYl qqcFdjYl) {
		int result = 0;
		// 获取附录编号和发动机编号；
		String flbh = qqcFdjYl.getFlbh();
		Integer fdjbh = qqcFdjYl.getFdjbh();
		Integer bh = qqcFdjYl.getBh();
		if (null != flbh && null != fdjbh && null != bh) {
			// 查询已存在的发动机；
			QqcFdjYl qqcFdjYlOld = qqcFdjYlService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
			// 将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjYl, qqcFdjYlOld);
			// 执行保存
			result = qqcFdjYlService.add(qqcFdjYlOld);
		} else {
			result = qqcFdjYlService.add(qqcFdjYl);
		}
		if (result == 1) {
			return new JsonMessage(true, "保存成功！");
		} else {
			return new JsonMessage(false, "保存失败！");
		}
	}

	// 删除
	@RequestMapping(value = "/delet", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh, String fdjbh, String bh) {
		// 定义标识
		int result = 0;
		// 查询对象，然后删除实体；
		if (null != flbh && null != fdjbh && null != bh) {
			Integer fdjbhs = new Integer(fdjbh);
			Integer bhs = new Integer(bh);
			QqcFdjYl qqcFdjYl = qqcFdjYlService.findByFlbhAndFdjbhAndBh(flbh, fdjbhs, bhs);
			if (null != qqcFdjYl) {
				result = qqcFdjYlService.delete(qqcFdjYl);
			}
			if (result == 1) {
				return new JsonMessage(true, "删除成功！");
			}
		}
		return new JsonMessage(false, "删除失败！");
	}

	// 跳转页面
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(String flbh, String fdjbh, String bh, Model model, String flag) {
		if (null != flbh && "" != flbh && null != fdjbh && "" != fdjbh) {
			Integer fdjbhs = new Integer(fdjbh);
			// 根据附录编号和发动机编号查询所有的对象
			List<QqcFdjYl> liquidCools = qqcFdjYlService.findByFlbhAndFdjbh(flbh, fdjbhs);
			// 如果对象存在就放到model中
			if (null != liquidCools && liquidCools.size() > 0) {
				model.addAttribute("lb", "qqc");
				model.addAttribute("liquidCools", liquidCools);
				model.addAttribute("flbh", flbh);
				model.addAttribute("fdjbh", fdjbh);
				return "yzx/plan/appendix/fdj/liquidCoolTable";
			} else {
				return "forward:create";
			}
		}
		return null;
	}

	// 创建新的
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(String flbh, String fdjbh, Model model, @RequestParam(defaultValue = "true") Boolean flag,
			String bh) {
		Integer fdjbhs = new Integer(fdjbh);
		if ("" != bh && null != bh && !"null".equals(bh)) {
			Integer bhs = new Integer(bh);
			QqcFdjYl qqcFdjYl = qqcFdjYlService.findByFlbhAndFdjbhAndBh(flbh, fdjbhs, bhs);
			if (null != qqcFdjYl) {
				model.addAttribute("car", qqcFdjYl);
				model.addAttribute("flag", !flag);
			}
		} else {
			QqcFdjYl qqcFdjYl1 = new QqcFdjYl();
			qqcFdjYl1.setFlbh(flbh);
			qqcFdjYl1.setFdjbh(fdjbhs);
			model.addAttribute("car", qqcFdjYl1);
		}

		return "yzx/plan/appendix/fdj/liquidCool";
	}
}
