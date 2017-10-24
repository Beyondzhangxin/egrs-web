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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainLt;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainLtService;

/**
 * 悬挂系数
 * 
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/lt")
public class QqcMainLtController {
	@Resource
	private QqcMainLtService qqcMainLtService;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(String flbh, Model model, Boolean edit, String type) {
		// 悬挂
		// 获取所有qqcMainCdx对象
		List<QqcMainLt> lts = qqcMainLtService.findByFlbh(flbh);
		if (null != lts && lts.size() > 0) {
			model.addAttribute("lts", lts);
			model.addAttribute("flbh", flbh);
			return "yzx/plan/appendix/qqc/suspensionTable";
		} else {
			return "forward:toSave";
		}
	}

	@RequestMapping(value = "toSave", method = RequestMethod.GET)
	public String toSave(String flbh, @RequestParam(required = false) Integer bh,
			@RequestParam(defaultValue = "true") Boolean edit, Model model) {
		// 悬挂新增
		if (null != bh) {
			QqcMainLt qqcMainLt = qqcMainLtService.findByFlbhAndBh(flbh, bh);
			model.addAttribute("car", qqcMainLt);
			if (qqcMainLt != null) {
				model.addAttribute("flag", !edit);
			}
		} else {
			QqcMainLt qqcMainLt = new QqcMainLt();
			qqcMainLt.setFlbh(flbh);
			model.addAttribute("car", qqcMainLt);
		}
		return "yzx/plan/appendix/suspension";
	}

	// 增加车体；
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage addLt(QqcMainLt qqcMainLt) {
		int result = 0;
		// 获取附录编号和传动系编号
		String flbh = qqcMainLt.getFlbh();
		Integer bh = qqcMainLt.getBh();
		if (null != bh) {
			// 根据附录编号和传动系编号查找传动系
			QqcMainLt ltOld = qqcMainLtService.findByFlbhAndBh(flbh, bh);
			// 判断cdxold是否存在，存在就执行复制，不存在就创建新的；
			if (null != ltOld) {
				BeanUtil.copyProperties(qqcMainLt, ltOld);
				result = qqcMainLtService.add(ltOld);
			}
		} else {
			result = qqcMainLtService.add(qqcMainLt);
		}
		if (result == 1) {
			return new JsonMessage(true, "保存成功！");
		} else {

			return new JsonMessage(false, "保存失败！");
		}
	}

	// 修改车体信息；
	@RequestMapping(value = "/yzx/Lt/update", method = RequestMethod.POST)
	public void updateLt(String flbh, Integer bh) {
		// 查询单个的车体；
		QqcMainLt Lt = qqcMainLtService.findByFlbhAndBh(flbh, bh);
		qqcMainLtService.update(Lt);
	}

	// 查询所有的车体；
	@RequestMapping(value = "/yzx/Lt/findLt", method = RequestMethod.POST)
	@ResponseBody
	public List<QqcMainLt> findLt(String flbh) {
		return qqcMainLtService.findByFlbh(flbh);
	}

	// 删除单个车体；
	@RequestMapping(value = "/delet", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage deleteLt(String flbh, Integer bh) {
		int result = qqcMainLtService.delete(flbh, bh);
		if (result == 1) {
			return new JsonMessage(true, "删除成功！");
		} else {

			return new JsonMessage(false, "删除失败！");
		}
	}

}
