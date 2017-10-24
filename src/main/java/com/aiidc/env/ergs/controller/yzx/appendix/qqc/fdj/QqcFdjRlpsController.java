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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjRlps;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjRlpsService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj")
public class QqcFdjRlpsController {
	@Autowired
	private QqcFdjRlpsService qqcFdjRlpsService;

	// 添加
	@RequestMapping(value = "/rlps/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage addCdx(QqcFdjRlps qqcFdjRlps) {
		int result = 0;
		// 获取附录编号和发动机编号；
		String flbh = qqcFdjRlps.getFlbh();
		Integer fdjbh = qqcFdjRlps.getFdjbh();
		Integer bh = qqcFdjRlps.getBh();
		if (null != flbh && null != fdjbh && null != bh) {
			// 查询已存在的发动机；
			QqcFdjRlps qqcFdjRlpsOld = qqcFdjRlpsService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
			// 将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjRlps, qqcFdjRlpsOld);
			// 执行保存
			result = qqcFdjRlpsService.add(qqcFdjRlpsOld);
		} else {
			result = qqcFdjRlpsService.add(qqcFdjRlps);
		}
		if (result == 1) {
			return new JsonMessage(true, "保存成功！");
		} else {
			return new JsonMessage(false, "保存失败！");
		}

	}

	// 修改
	@RequestMapping(value = "/yzx/fdjRlps/update", method = RequestMethod.POST)
	public void updateCdx(String flbh, Integer bh, Integer fdjbh) {
		// 查询出附录编号和编号所对应的传动系；
		QqcFdjRlps fdjRlps = qqcFdjRlpsService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
		// 修改传动系；
		qqcFdjRlpsService.update(fdjRlps);
	}

	// 删除
	@RequestMapping(value = "/rlps/delet", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh, String fdjbh, String bh) {
		// 定义标识
		int result = 0;
		// 查询对象，然后删除实体；
		if (null != flbh && null != fdjbh && null != bh) {
			Integer fdjbhs = new Integer(fdjbh);
			Integer bhs = new Integer(bh);
			QqcFdjRlps qqcFdjRlps = qqcFdjRlpsService.findByFlbhAndFdjbhAndBh(flbh, fdjbhs, bhs);
			if (null != qqcFdjRlps) {
				result = qqcFdjRlpsService.delete(qqcFdjRlps);
			}
			if (result == 1) {
				return new JsonMessage(true, "删除成功！");
			}
		}
		return new JsonMessage(false, "删除失败！");
	}

	// 查询一个
	@RequestMapping(value = "/yzx/fdjRlps/findone", method = RequestMethod.POST)
	@ResponseBody
	public QqcFdjRlps findOne(String flbh, Integer bh, Integer fdjbh) {
		return qqcFdjRlpsService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
	}

	// 查询所有
	@RequestMapping(value = "/yzx/fdjRlps/findAll", method = RequestMethod.POST)
	@ResponseBody
	public List<QqcFdjRlps> findAll(String flbh, Integer fdjbh) {
		return qqcFdjRlpsService.findByFlbhAndFdjbh(flbh, fdjbh);
	}

	// 燃油喷射
	@RequestMapping(value = "/rlps", method = RequestMethod.GET)
	public String main(String flbh, String fdjbh, String bh, Model model, String flag) {
		// 判断
		if (null != flbh && "" != flbh && null != fdjbh && "" != fdjbh) {
			Integer fdjbhs = new Integer(fdjbh);
			// 根据附录编号和发动机编号查询所有的对象
			List<QqcFdjRlps> rlpss = qqcFdjRlpsService.findByFlbhAndFdjbh(flbh, fdjbhs);
			// 如果对象存在就放到model中
			if (null != rlpss && rlpss.size() > 0) {
				model.addAttribute("lb", "qqc");
				model.addAttribute("rlpss", rlpss);
				model.addAttribute("flbh", flbh);
				model.addAttribute("fdjbh", fdjbh);
				return "yzx/plan/appendix/fdj/injectionTable";
			} else {
				return "forward:rlps/create";
			}
		}
		return null;
	}

	// 跳转到创建新的燃料喷射页面
	@RequestMapping(value = "/rlps/create", method = RequestMethod.GET)
	public String create(String flbh, String fdjbh, Model model, @RequestParam(defaultValue = "true") Boolean flag,
			String bh) {
		Integer fdjbhs = new Integer(fdjbh);
		if ("" != bh && null != bh && !"null".equals(bh)) {
			Integer bhs = new Integer(bh);
			QqcFdjRlps qqcFdjRlps = qqcFdjRlpsService.findByFlbhAndFdjbhAndBh(flbh, fdjbhs, bhs);
			if (null != qqcFdjRlps) {
				model.addAttribute("car", qqcFdjRlps);
				model.addAttribute("flag", !flag);
			}
		} else {
			QqcFdjRlps qqcFdjRlps = new QqcFdjRlps();
			qqcFdjRlps.setFlbh(flbh);
			qqcFdjRlps.setFdjbh(fdjbhs);
			model.addAttribute("car", qqcFdjRlps);
		}
		return "yzx/plan/appendix/fdj/injection";
	}
}
