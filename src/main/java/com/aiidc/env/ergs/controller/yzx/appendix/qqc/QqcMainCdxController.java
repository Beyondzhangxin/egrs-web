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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainCdx;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainCdxService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/cdx")
public class QqcMainCdxController {
	@Resource
	private QqcMainCdxService qqcMainCdxService;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index(String flbh, Model model, Boolean edit, String type) {
		// 传动
		// 获取所有qqcMainCdx对象
		List<QqcMainCdx> cdxs = qqcMainCdxService.findAllCdxByFlbh(flbh);
		if (null != cdxs && cdxs.size() > 0) {
			model.addAttribute("cdxs", cdxs);
			model.addAttribute("flbh", flbh);
			return "yzx/plan/appendix/qqc/trainTable";
		} else {
			return "forward:toSave";
		}
	}

	@RequestMapping(value = "toSave", method = RequestMethod.GET)
	public String toSave(String flbh, @RequestParam(required = false) String bh,
			@RequestParam(defaultValue = "true") Boolean edit, Model model) {
		if (null != bh) {
			QqcMainCdx qqcMainCdx = qqcMainCdxService.findByFlbhAndBh(flbh, bh);
			if (qqcMainCdx != null) {
				model.addAttribute("car", qqcMainCdx);
				if (null == edit || !edit) {
					model.addAttribute("flag", true);
				}
			}
		} else {
			QqcMainCdx qqcMainCdx = new QqcMainCdx();
			qqcMainCdx.setFlbh(flbh);
			model.addAttribute("car", qqcMainCdx);
		}
		return "yzx/plan/appendix/train";
	}

	// 增加车

	// 添加
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage addCdx(QqcMainCdx qqcMainCdx) {
		int result = 0;
		// 获取附录编号和传动系编号
		String flbh = qqcMainCdx.getFlbh();
		Integer bh = qqcMainCdx.getBh();
		if (null != bh) {
			// 根据附录编号和传动系编号查找传动系
			QqcMainCdx cdxOld = qqcMainCdxService.findByFlbhAndBh(flbh, bh + "");
			// 判断cdxold是否存在，存在就执行复制，不存在就创建新的；
			if (null != cdxOld) {
				BeanUtil.copyProperties(qqcMainCdx, cdxOld);
				result = qqcMainCdxService.addQqcMainCdx(cdxOld);
			}
		} else {

			result = qqcMainCdxService.addQqcMainCdx(qqcMainCdx);
		}
		if (result == 1) {
			return new JsonMessage(true, "保存成功！");
		} else {

			return new JsonMessage(false, "保存失败！");
		}
	}

	// 根据附录号查询出所有的传动系
	@RequestMapping(value = "/yzx/cdx/findAllCdx", method = RequestMethod.POST)
	@ResponseBody
	public List<QqcMainCdx> findAllQqcMainCdxByFlbh(String flbh) {
		return qqcMainCdxService.findAllCdxByFlbh(flbh);
	}

	// 修改根据附录编号修改传动系
	@RequestMapping(value = "/yzx/cdx/update", method = RequestMethod.POST)
	@ResponseBody
	public void updateCdx(String flbh, String bh) {
		// 查询出附录编号和编号所对应的传动系；
		QqcMainCdx cdx = qqcMainCdxService.findByFlbhAndBh(flbh, bh);
		// 修改传动系；
		qqcMainCdxService.updateQqcMainCdx(cdx);
	}

	// 删除根据编号产出传动系；
	@RequestMapping(value = "/delet", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage deleteCdx(String flbh, String bh) {
		int result = qqcMainCdxService.deleteQqcMainCdx(flbh, bh);
		if (result == 1) {
			return new JsonMessage(true, "删除成功！");
		} else {

			return new JsonMessage(false, "删除失败！");
		}
	}

}
