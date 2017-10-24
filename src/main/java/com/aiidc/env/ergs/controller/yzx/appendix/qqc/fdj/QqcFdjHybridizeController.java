/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix.qqc.fdj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/hybridize")
public class QqcFdjHybridizeController {
	//跳转再循环系统
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(String flbh,String fdjbh,String lb,Model model){
		model.addAttribute("flbh",flbh);
		model.addAttribute("fdjbh",fdjbh);
		model.addAttribute("lb",lb);
		return "yzx/plan/appendix/fdj/fdjHybridize";
	}
	//发动机详情
	@RequestMapping(value="/detail",method = RequestMethod.GET)
	public String detail(String n,String flbh,Model model,String fdjbh,String bh,String device,String pzlb){
		
		if("0".equals(n)){
			//电机
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/elecMotor/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
		}else if("1".equals(n) || "3".equals(n) || "6".equals(n) || "8".equals(n)){
			//打刻内容
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/mark/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
		}else if("5".equals(n) || "7".equals(n) || "9".equals(n) || "10".equals(n) || "11".equals(n) || "12".equals(n) || "13".equals(n)){
			//动力控制，电机控制，高压空调，电子泵
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/config/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
		}else if("2".equals(n)){
			//储能装置
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/storePower/main?flbh="+flbh+"&fdjbh="+fdjbh;
		}else if("4".equals(n)){
			//DC转化器
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/DCChange/main?flbh="+flbh+"&fdjbh="+fdjbh;
		}else {
			//新增
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/"+device+"/create?flbh="+flbh+"&fdjbh="+fdjbh+"&bh="+bh+"&pzlb="+pzlb;
		}
	}

}
