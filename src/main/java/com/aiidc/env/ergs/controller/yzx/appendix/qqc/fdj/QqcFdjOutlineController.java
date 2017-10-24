/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix.qqc.fdj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdj;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/outline")
public class QqcFdjOutlineController {
	@Autowired
	private QqcFdjService qqcFdjService;
	//新增
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage addCdx(QqcFdj qqcFdj,String plus){
		int result = 0;
		if(null != qqcFdj.getYsb1() && null != plus){
			String ysb = qqcFdj.getYsb1() + "±" + plus;
			qqcFdj.setYsb1(ysb);
		}
		//获取附录编号和发动机编号；
		String flbh = qqcFdj.getFlbh();
		Integer fdjbh = qqcFdj.getFdjbh();
		if(null != flbh && null != fdjbh){
			//查询已存在的发动机；
			QqcFdj qqcFdjOld = qqcFdjService.findByFlbhAndBh(flbh, fdjbh);
			//将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdj, qqcFdjOld);
			//执行保存
			 result = qqcFdjService.add(qqcFdjOld);
		}else{
			 result = qqcFdjService.add(qqcFdj);
		}
		if(result == 1){
			return new JsonMessage(true,"保存成功！");
		}else{
			return new JsonMessage(false,"保存失败！");
		}
	}
	
	//删除
	@RequestMapping(value = "/inletAir/delete",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh, Integer fdjbh){
		//定义标识
		int result = 0;
		//查询对象，然后删除实体；
		if(null != flbh && null != fdjbh){
			Integer fdjbhs = new Integer(fdjbh);
			result = qqcFdjService.delete(flbh,fdjbh);
			if(result == 1){
				return new JsonMessage(true,"删除成功！");
			}
		}
		return new JsonMessage(false,"删除失败！");		
	}
	
	
	//跳转页面
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(String flbh,String fdjbh,String lb,Model model){
		model.addAttribute("flbh",flbh);
		model.addAttribute("lb",lb);
		model.addAttribute("fdjbh",fdjbh);
		return "yzx/plan/appendix/fdj/fdjOutline";
	}
	//详情
	@RequestMapping(value="/detail",method = RequestMethod.GET)
	public String detail(String n,String flbh,Model model,String fdjbh,String bh,String device,String pzlb){
		
		if("0".equals(n)){
			//概述
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/outline/main?flbh="+flbh+"&fdjbh="+fdjbh;
		}else if("100".equals(n)){
			//创建新的和查看
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/"+device+"/create?flbh="+flbh+"&fdjbh="+fdjbh+"&bh="+bh+"&pzlb="+pzlb;
		}else{
			//发动机打刻内容
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/mark/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
		}
	}
	//概述
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,Model model,String flag){
		//判断
		if(null != fdjbh && null != flbh && "" != fdjbh && "" != flbh){
			Integer bhs = new Integer(fdjbh);
			QqcFdj qqcFdj = qqcFdjService.findByFlbhAndBh(flbh, bhs);
			if(null != qqcFdj ){
				model.addAttribute("car",qqcFdj);
				if(null != flag)
				model.addAttribute("flag",true);
			}
		}else{
			QqcFdj qqcFdj = new QqcFdj();
			qqcFdj.setFlbh(flbh);
			model.addAttribute("car",qqcFdj);
		}
		return "yzx/plan/appendix/fdj/summary";
	}
}
