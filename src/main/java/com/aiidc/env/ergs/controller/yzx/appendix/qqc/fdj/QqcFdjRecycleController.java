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
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/recycle")
public class QqcFdjRecycleController {
	//跳转再循环系统
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(String flbh,String fdjbh,String lb,Model model){
		model.addAttribute("flbh",flbh);
		model.addAttribute("fdjbh",fdjbh);
		model.addAttribute("lb",lb);
		return "yzx/plan/appendix/fdj/fdjRecycle";
	}
	//发动机详情
	@RequestMapping(value="/detail",method = RequestMethod.GET)
	public String detail(String n,String flbh,Model model,String fdjbh,String bh,String device,String pzlb){
		
		if("0".equals(n)){
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/temperature/main?flbh="+flbh+"&fdjbh="+fdjbh;
		}else if("1".equals(n)){
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/config/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
		}else if("2".equals(n)){
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/mark/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
		}else if("100".equals(n)){
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/"+device+"/create?flbh="+flbh+"&fdjbh="+fdjbh+"&bh="+bh+"&pzlb="+pzlb;
		}else{
			return null;
		}
	}

}
