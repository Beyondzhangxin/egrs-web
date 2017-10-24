package com.aiidc.env.ergs.controller.yzx.plan;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.aspect.LogAnnotation;
import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.common.util.StringUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.constant.AppendixStatus;
import com.aiidc.env.ergs.constant.Type;
import com.aiidc.env.ergs.jpa.po.pw.SJDW;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.Appendix;
import com.aiidc.env.ergs.jpa.po.yzx.plan.Plan;
import com.aiidc.env.ergs.jpa.po.yzx.plan.PlanFiles;
import com.aiidc.env.ergs.jpa.repo.pw.UserDao;
import com.aiidc.env.ergs.service.pw.PubKeyService;
import com.aiidc.env.ergs.service.pw.SJDWService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;
import com.aiidc.env.ergs.service.yzx.appendix.AppendixService;
import com.aiidc.env.ergs.service.yzx.plan.PlanFilesService;
import com.aiidc.env.ergs.service.yzx.plan.PlanService;

/**
 * 计划书
 * 
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan")
public class PlansController {
	// 注入planService
	@Resource
	private PlanService planService;
	// 注入受检单位
	@Resource
	private SJDWService SJDWservice;
	// 注入流水号
	@Resource
	private PubKeyService pubKeyService;
	// 用户信息
	@Resource
	private UserDao userDao;

	@Resource
	private PlanFilesService planFilesService;

	// 附录
	@Resource
	private AppendixService appendixService;
	public String ymanufid;
	public SJDW sjdw;
	public User user;

	/**
	 * 查询信息;
	 */
	public void findObj() {
		// 获取认证信息中的用户名;
		Authentication auth = (Authentication) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (auth != null) {
			String[] loginUser = auth.getName().split("-");
			// 根据用户信息查询企业的ymanuid
			String smanuid = loginUser[0];
			long manuid = Long.parseLong(smanuid);
			String username = loginUser[1];
			// 根据manuid查询ymanuid;
			sjdw = SJDWservice.findByManufid(manuid);
		}
	}

	/**
	 * 查出所有的计划书并且分页
	 */
	@RequestMapping(value = "/table", method = RequestMethod.GET)
	/* @ResponseBody */
	public String findAllPlan(Plan plan, QryPageVo qryVo, Model model) {
		Page<Plan> page = planService.findAllPlan(plan, qryVo);
		model.addAttribute("page", page);

		return "yzx/plan/table";
	}

	/**
	 * 创建计划书
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@LogAnnotation("创建计划书")
	public String addPlan(Plan plan, String pf, HttpSession session) {
		// 获取车辆类别
		String cllb = plan.getCllb();
		// 根据车辆类别换成类型标识；
		int vehicle = Type.strToint(cllb);
		// 获得计划书标号;
		String jhsbh = getNewJhsbh(vehicle, pf);
		// 从spring 安全框架中获取user对象；
		user = (User) LoginUserUtil.getLoginUser().getDetail();
		// 设置计划书标号;
		plan.setJhsbh(jhsbh);
		plan.setManufid(user.getManufid());
		plan.setCjr(user.getName());
		plan.setCjrid(user.getUserid().toString());
		plan.setXgr(user.getName());
		plan.setXgrid((user.getUserid().toString()));
		plan.setVersion((short) 1);
		plan.setFlag("XXGK");
		plan.setStatus("0");
		plan.setManuf(sjdw.getGroupmanuf());
		plan.setGroupid(sjdw.getGroupid());
		plan.setCjsj(new Date());
		// 设置车辆类别；
		plan.setCllb(cllb);
		// 添加计划书;
		planService.addPlan(plan);
		session.setAttribute("plan", plan);
		session.setAttribute("pf", pf);
		session.removeAttribute("planFiles");
		return "redirect:/ergs/yzx/plan/planFile/checkGB?jhsbh=" + plan.getJhsbh();
	}

	/**
	 * 多条件模糊分页查询
	 */
	@RequestMapping(value = "/criteriapage", method = RequestMethod.POST)
	@ResponseBody
	public Page<Plan> findbyCriteriPage(Plan plan, QryPageVo qryVo) {
		return planService.findbyCriteriPage(plan, qryVo);
	}

	/**
	 * 生成计划书编号;
	 */
	private String getNewJhsbh(int newCllb, String jd) {
		user = (User) LoginUserUtil.getLoginUser().getDetail();
		sjdw = SJDWservice.findByManufid(Long.parseLong(user.getManufid()));
		if (sjdw != null) {
			// 获得ymanuid;
			ymanufid = sjdw.getYmanufid();
		}
		String cjdh = "J" + ymanufid;
		String cllb = null;
		if (newCllb > 10) {
			cllb = StringUtil.Chr(newCllb) + jd;
		} else {
			cllb = newCllb + jd;
		}
		Integer keyvalue = pubKeyService.findByKeyValue("jhsbh") + 1;
		String pid = keyvalue.toString();
		String b6 = StringUtil.getNo(pid, 6);
		for (int i = 0; i < 3; i++) {
			if (!"000000".equals(b6)) {

				return cjdh + "-" + cllb + "-" + b6;
			}
		}

		return null;
	}

	/**
	 * 查询某个计划书
	 */
	@RequestMapping(value = "/findone", method = RequestMethod.POST)
	@ResponseBody
	public Plan findPlan(String jhsbh) {
		return planService.findPlan(jhsbh);
	}

	/**
	 * 修改计划书
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@LogAnnotation("修改计划书")
	public void updatePlan(String jhsbh) {
		user = (User) LoginUserUtil.getLoginUser().getDetail();
		// 查询该计划书标号所对应的计划书；
		Plan plan = planService.findPlan(jhsbh);
		// 设置修改人；
		plan.setXgr(user.getName());
		plan.setXgrid(user.getUserid().toString());
		plan.setEdittime(new Date());
		planService.updatePlan(plan);
	}

	/**
	 * 审核跳转页面
	 */
	@RequestMapping(value = "/shjump", method = RequestMethod.GET)
	public String jumpSh(String jhsbh, Model model) {
		model.addAttribute("jhsbh", jhsbh);
		return "yzx/plan/shJump";
	}

	/**
	 * 备案计划书
	 */
	@RequestMapping(value = "/record", method = RequestMethod.GET)
	@ResponseBody
	// @Secured("ROLE_12")
	@LogAnnotation("备案计划书")
	public JsonMessage record(String jhsbh, String balog, String status) {
		Plan plan = planService.findPlan(jhsbh);
		plan.setBalog(balog);
		plan.setStatus(status);
		int result = planService.recordPlan(plan);
		;
		if (result == 1) {
			return new JsonMessage(true, "操作成功!");
		} else {
			return new JsonMessage(false, "操作失败！");
		}

	}

	/**
	 * 审核计划书
	 */

	@RequestMapping(value = "/exam", method = RequestMethod.GET)
	@ResponseBody
	// @Secured("ROLE_13")
	@LogAnnotation("审核计划书")
	public JsonMessage exam(String jhsbh, String shlog, String status) {
		Plan plan = planService.findPlan(jhsbh);
		plan.setShlog(shlog);
		plan.setStatus(status);
		int result = planService.examPlan(plan);
		;
		if (result == 1) {
			return new JsonMessage(true, "操作成功!");
		} else {
			return new JsonMessage(false, "操作失败！");
		}

	}

	/**
	 * 删除计划书
	 */

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("删除计划书")
	public JsonMessage deletePlan(String jhsbh) {
		int planResult = planService.delPlan(jhsbh);
		// 删除计划书所对应的附录；
		int appendexResult = appendixService.deleteAppendix(jhsbh);
		// 删除计划书文件；
		int fileResult = planFilesService.delete(jhsbh);
		if (planResult == 1 && appendexResult == 1 && fileResult == 1) {

			return new JsonMessage(true, "删除成功!");
		} else {
			return new JsonMessage(false, "删除失败！");
		}
	}

	/**
	 * 页面跳转
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Plan plan, QryPageVo qryVo, Model model) {
		// findAllPlan( plan,qryVo,model);
		return "yzx/plan/plan";
	}

	/**
	 * 创建计划书跳转
	 */
	@RequestMapping(value = "/plancj", method = RequestMethod.GET)
	public String cj() {
		return "yzx/plan/plancreate";
	}

	/**
	 * 查看计划书页面跳转
	 */
	@RequestMapping(value = "/checkPlan", method = RequestMethod.GET)
	public String checkPlan(String jhsbh, Model model, HttpSession session) {
		Plan plan = planService.findPlan(jhsbh);
		session.setAttribute("plan", plan);
		return "redirect:/ergs/yzx/plan/planFile/checkGB?jhsbh=" + jhsbh;
	}

	/**
	 * 查看附录
	 */
	@RequestMapping(value = "/checkAppendix", method = RequestMethod.GET)
	public String checkAppendix(String jhsbh, Model model, HttpSession session) {
		model.addAttribute("jhsbh", jhsbh);
		Plan plan = planService.findPlan(jhsbh);
		PlanFiles planFiles = planFilesService.findone(jhsbh);
		Appendix appendix = appendixService.findApp(jhsbh);
		session.setAttribute("plan", plan);
		session.setAttribute("planFiles", planFiles);
		session.setAttribute("jhsbh", jhsbh);
		session.setAttribute("appendix", appendix);
		model.addAttribute("statuses", AppendixStatus.data());
		return "/yzx/plan/appendix/checkAppendix";
	}

	/**
	 * 计划书提交
	 */
	@RequestMapping(value = "/refer", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation("提交计划书")
	public JsonMessage refer(String jhsbh) {
		Plan plan = planService.findPlan(jhsbh);
		int result = planService.referPlan(plan);
		;
		if (result == 1) {
			return new JsonMessage(true, "提交成功!");
		} else {
			return new JsonMessage(false, "提交失败！");
		}
	}

	/**
	 * 查看计划书状态
	 */
	@RequestMapping(value = "/checkStatus", method = RequestMethod.GET)
	@ResponseBody
	public String checkStatus(String jhsbh) {
		Plan plan = planService.findPlan(jhsbh);
		return plan.getStatus();
	}

}