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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainCt;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainCtService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/ct")
public class QqcMainCtController {
	@Resource
	private QqcMainCtService qqcMainCtService;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(String flbh, Model model, Boolean edit, String type) {
		// 获取所有qqcMainCdx对象
		List<QqcMainCt> cts = qqcMainCtService.findByFlbh(flbh);
		if (null != cts && cts.size() > 0) {
			model.addAttribute("cts", cts);
			model.addAttribute("flbh", flbh);
			return "yzx/plan/appendix/qqc/carTable";
		} else {
			return "forward:toSave";
		}
	}

	@RequestMapping(value = "toSave", method = RequestMethod.GET)
	public String toSave(String flbh, @RequestParam(required = false) Integer bh,
			@RequestParam(defaultValue = "true") Boolean edit, Model model) {
		if (null != bh) {
			QqcMainCt qqcMainCt = qqcMainCtService.findByFlbhAndBh(flbh, bh);
			model.addAttribute("car", qqcMainCt);
			if (null == edit || !edit) {
				model.addAttribute("flag", true);
			}
		} else {
			QqcMainCt qqcMainCt = new QqcMainCt();
			qqcMainCt.setFlbh(flbh);
			model.addAttribute("car", qqcMainCt);
		}
		return "yzx/plan/appendix/car";
	}

	// 增加车体；
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage addCt(QqcMainCt qqcMainCt) {
		int result = 0;
		// 获取附录编号和传动系编号
		String flbh = qqcMainCt.getFlbh();
		Integer bh = qqcMainCt.getBh();
		if (null != bh) {
			// 根据附录编号和传动系编号查找传动系
			QqcMainCt ctOld = qqcMainCtService.findByFlbhAndBh(flbh, bh);
			// 判断cdxold是否存在，存在就执行复制，不存在就创建新的；
			if (null != ctOld) {
				BeanUtil.copyProperties(qqcMainCt, ctOld);
				result = qqcMainCtService.add(ctOld);
			}
		} else {

			result = qqcMainCtService.add(qqcMainCt);
		}
		if (result == 1) {
			return new JsonMessage(true, "保存成功！");
		} else {

			return new JsonMessage(false, "保存失败！");
		}
	}

	// 修改车体信息；
	@RequestMapping(value = "/yzx/ct/update", method = RequestMethod.POST)
	public void updateCt(String flbh, Integer bh) {
		// 查询单个的车体；
		QqcMainCt ct = qqcMainCtService.findByFlbhAndBh(flbh, bh);
		qqcMainCtService.update(ct);
	}

	// 查询所有的车体；
	@RequestMapping(value = "/yzx/ct/findct", method = RequestMethod.POST)
	@ResponseBody
	public List<QqcMainCt> findCt(String flbh) {
		return qqcMainCtService.findByFlbh(flbh);
	}

	// 删除单个车体；
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage deleteCt(String flbh, Integer bh) {
		int result = qqcMainCtService.delete(flbh, bh);
		if (result == 1) {
			return new JsonMessage(true, "删除成功！");
		} else {

			return new JsonMessage(false, "删除失败！");
		}
	}

}
