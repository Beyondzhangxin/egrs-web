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
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjGyb;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjGybService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj")
public class QqcFdjGybController {
	@Autowired
	private QqcFdjGybService qqcFdjGybService;

	// 添加
	@RequestMapping(value = "/gyb/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage addCdx(QqcFdjGyb qqcFdjGyb) {
		int result = 0;
		// 获取附录编号和发动机编号；
		String flbh = qqcFdjGyb.getFlbh();
		Integer fdjbh = qqcFdjGyb.getFdjbh();
		Integer bh = qqcFdjGyb.getBh();
		if (null != flbh && null != fdjbh && null != bh) {
			// 查询已存在的发动机；
			QqcFdjGyb qqcFdjGybOld = qqcFdjGybService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
			// 将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjGyb, qqcFdjGybOld);
			// 执行保存
			result = qqcFdjGybService.add(qqcFdjGybOld);
		} else {
			result = qqcFdjGybService.add(qqcFdjGyb);
		}
		if (result == 1) {
			return new JsonMessage(true, "保存成功！");
		} else {
			return new JsonMessage(false, "保存失败！");
		}
	}

	// 修改
	@RequestMapping(value = "/yzx/fdjGyb/update", method = RequestMethod.POST)
	public void updateCdx(String flbh, Integer bh, Integer fdjbh) {
		// 查询出附录编号和编号所对应的传动系；
		QqcFdjGyb fdjGyb = qqcFdjGybService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
		// 修改传动系；
		qqcFdjGybService.update(fdjGyb);
	}

	// 删除
	@RequestMapping(value = "/gyb/delet", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh, String fdjbh, String bh) {
		// 定义标识
		int result = 0;
		// 查询对象，然后删除实体；
		if (null != flbh && null != fdjbh && null != bh) {
			Integer fdjbhs = new Integer(fdjbh);
			Integer bhs = new Integer(bh);
			QqcFdjGyb qqcFdjGyb = qqcFdjGybService.findByFlbhAndFdjbhAndBh(flbh, fdjbhs, bhs);
			if (null != qqcFdjGyb) {
				result = qqcFdjGybService.delete(qqcFdjGyb);
			}
			if (result == 1) {
				return new JsonMessage(true, "删除成功！");
			}
		}
		return new JsonMessage(false, "删除失败！");
	}

	// 查询一个
	@RequestMapping(value = "/yzx/fdjGyb/findone", method = RequestMethod.POST)
	@ResponseBody
	public QqcFdjGyb findOne(String flbh, Integer bh, Integer fdjbh) {
		return qqcFdjGybService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
	}

	// 查询所有
	@RequestMapping(value = "/yzx/fdjGyb/findAll", method = RequestMethod.POST)
	@ResponseBody
	public List<QqcFdjGyb> findAll(String flbh, Integer fdjbh) {
		return qqcFdjGybService.findByFlbhAndFdjbh(flbh, fdjbh);
	}

	// 供油泵
	@RequestMapping(value = "/gyb", method = RequestMethod.GET)
	public String main(String flbh, Integer fdjbh, String bh, Model model, String flag) {
		// 根据附录编号和发动机编号查询所有的对象
		List<QqcFdjGyb> gybs = qqcFdjGybService.findByFlbhAndFdjbh(flbh, fdjbh);
		// 如果对象存在就放到model中
		if (null != gybs && gybs.size() > 0) {
			model.addAttribute("lb", "qqc");
			model.addAttribute("gybs", gybs);
			model.addAttribute("flbh", flbh);
			model.addAttribute("fdjbh", fdjbh);
			return "yzx/plan/appendix/fdj/oilTable";
		} else {
			return "forward:gyb/create";
		}
	}

	// 跳转到创建新的燃料喷射页面
	@RequestMapping(value = "/gyb/create", method = RequestMethod.GET)
	public String create(String flbh, String fdjbh, Model model, String flag, String bh) {
		Integer fdjbhs = new Integer(fdjbh);
		if ("" != bh && null != bh && !"null".equals(bh)) {
			Integer bhs = new Integer(bh);
			QqcFdjGyb qqcFdjGyb = qqcFdjGybService.findByFlbhAndFdjbhAndBh(flbh, fdjbhs, bhs);
			if (null != qqcFdjGyb) {
				model.addAttribute("car", qqcFdjGyb);
				if (null != flag) {
					model.addAttribute("flag", true);
				}
			}
		} else {
			QqcFdjGyb qqcFdjGyb = new QqcFdjGyb();
			qqcFdjGyb.setFlbh(flbh);
			qqcFdjGyb.setFdjbh(fdjbhs);
			model.addAttribute("car", qqcFdjGyb);
		}

		return "yzx/plan/appendix/fdj/oil";
	}
}
