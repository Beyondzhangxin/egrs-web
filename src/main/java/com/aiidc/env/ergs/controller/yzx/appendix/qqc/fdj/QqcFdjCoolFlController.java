/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix.qqc.fdj;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjFl;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjFlService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/cool/airCool")
public class QqcFdjCoolFlController {
	@Resource
	private QqcFdjFlService qqcFdjFlService;

	// 添加
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjFl qqcFdjFl) {
		int result = 0;
		// 获取附录编号和发动机编号；
		String flbh = qqcFdjFl.getFlbh();
		Integer fdjbh = qqcFdjFl.getFdjbh();
		Integer bh = qqcFdjFl.getBh();
		if (null != flbh && null != fdjbh && null != bh) {
			// 查询已存在的发动机；
			QqcFdjFl qqcFdjFlOld = qqcFdjFlService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
			// 将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjFl, qqcFdjFlOld);
			// 执行保存
			result = qqcFdjFlService.add(qqcFdjFlOld);
		} else {
			result = qqcFdjFlService.add(qqcFdjFl);
		}
		if (result == 1) {
			return new JsonMessage(true, "保存成功！");
		} else {
			return new JsonMessage(false, "保存失败！");
		}
	}

	// 修改
	@RequestMapping(value = "/yzx/fdjFl/update", method = RequestMethod.POST)
	public void updateCdx(String flbh, Integer bh, Integer fdjbh) {
		// 查询出附录编号和编号所对应的传动系；
		QqcFdjFl fdjFl = qqcFdjFlService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
		// 修改传动系；
		qqcFdjFlService.update(fdjFl);
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
			QqcFdjFl qqcFdjFl = qqcFdjFlService.findByFlbhAndFdjbhAndBh(flbh, fdjbhs, bhs);
			if (null != qqcFdjFl) {
				result = qqcFdjFlService.delete(qqcFdjFl);
			}
			if (result == 1) {
				return new JsonMessage(true, "删除成功！");
			}
		}
		return new JsonMessage(false, "删除失败！");
	}

	// 查询一个
	@RequestMapping(value = "/yzx/fdjFl/findone", method = RequestMethod.POST)
	@ResponseBody
	public QqcFdjFl findOne(String flbh, Integer bh, Integer fdjbh) {
		return qqcFdjFlService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
	}

	// 查询所有
	@RequestMapping(value = "/yzx/fdjFL/findAll", method = RequestMethod.POST)
	@ResponseBody
	public List<QqcFdjFl> findAll(String flbh, Integer fdjbh) {
		return qqcFdjFlService.findByFlbhAndFdjbh(flbh, fdjbh);
	}

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(String flbh, String fdjbh, String bh, Model model, String flag) {
		Integer fdjbhs = new Integer(fdjbh);
		// 根据附录编号和发动机编号查询所有的对象
		List<QqcFdjFl> airCools = qqcFdjFlService.findByFlbhAndFdjbh(flbh, fdjbhs);
		// 如果对象存在就放到model中
		if (null != airCools && airCools.size() > 0) {
			model.addAttribute("lb", "qqc");
			model.addAttribute("airCools", airCools);
			model.addAttribute("flbh", flbh);
			model.addAttribute("fdjbh", fdjbh);
			return "yzx/plan/appendix/fdj/airCoolTable";
		} else {
			return "forword:create";
		}
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(String flbh, String fdjbh, Model model, @RequestParam(defaultValue = "true") Boolean flag,
			String bh) {
		Integer fdjbhs = new Integer(fdjbh);
		if (StringUtils.isNotBlank(bh)) {
			Integer bhs = new Integer(bh);
			QqcFdjFl qqcFdjFl = qqcFdjFlService.findByFlbhAndFdjbhAndBh(flbh, fdjbhs, bhs);
			model.addAttribute("car", qqcFdjFl);
			model.addAttribute("flag", !flag);
		} else {
			QqcFdjFl qqcFdjFl1 = new QqcFdjFl();
			qqcFdjFl1.setFlbh(flbh);
			qqcFdjFl1.setFdjbh(fdjbhs);
			model.addAttribute("car", qqcFdjFl1);
		}

		return "yzx/plan/appendix/fdj/airCool";
	}
}
