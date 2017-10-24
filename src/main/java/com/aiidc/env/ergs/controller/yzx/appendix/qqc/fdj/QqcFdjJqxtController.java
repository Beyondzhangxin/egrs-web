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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjJqxt;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjJqxtService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/inlet")
public class QqcFdjJqxtController {
	@Autowired
	private QqcFdjJqxtService qqcFdjJqxtService;
	//新增
	@RequestMapping(value = "/inletAir/add",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjJqxt qqcFdjJqxt){
		int result = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjJqxt.getFlbh();
		Integer fdjbh = qqcFdjJqxt.getFdjbh();
		if(null != flbh && null != fdjbh ){
			//查询已存在的发动机；
			QqcFdjJqxt qqcFdjJqxtOld = qqcFdjJqxtService.findByFlbhAndFdjbh(flbh, fdjbh);
			if(null != qqcFdjJqxtOld){
				//将已存在的发动机复制给新的；
				BeanUtil.copyProperties(qqcFdjJqxt, qqcFdjJqxtOld);
				//执行保存
				result = qqcFdjJqxtService.add(qqcFdjJqxtOld);
			}else{
				result = qqcFdjJqxtService.add(qqcFdjJqxt);
			}
		}
		if(result == 1){
			return new JsonMessage(true,"保存成功！");
		}else{
			return new JsonMessage(false,"保存失败！");
		}
	}
	
	//修改
	@RequestMapping(value = "/update",method=RequestMethod.POST)
	public void update(String flbh,Integer fdjbh){
		QqcFdjJqxt qqcFdjJqxt = qqcFdjJqxtService.findByFlbhAndFdjbh(flbh, fdjbh);
		qqcFdjJqxtService.update(qqcFdjJqxt);
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
			result = qqcFdjJqxtService.delete(flbh,fdjbh);
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
		return "yzx/plan/appendix/fdj/fdjInlet";
	}
	//详情
	@RequestMapping(value="/detail",method = RequestMethod.GET)
	public String detail(String n,String flbh,Model model,String fdjbh,String bh,String device,String pzlb){
		
		if("0".equals(n)){
			//进气系统
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/inlet/main?flbh="+flbh+"&fdjbh="+fdjbh;
		}/*if("1".equals(n)){
			//增压装置

			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/surpress/main?flbh="+flbh+"&fdjbh="+fdjbh;
		}*/else if("100".equals(n)){
			//创建新的和查看
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/"+device+"/create?flbh="+flbh+"&fdjbh="+fdjbh+"&bh="+bh+"&pzlb="+pzlb;
		}else if("6".equals(n)){
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/mark/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
			
		}else{
			//发动机配置fdj-config
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/config/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
		}
	}
	//概述
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag){
		if(null != fdjbh && null != flbh && "" != fdjbh && "" != flbh && !"null".equals(fdjbh)){
			Integer bhs = new Integer(fdjbh);
			QqcFdjJqxt qqcFdjJqxt = qqcFdjJqxtService.findByFlbhAndFdjbh(flbh, bhs);
			if(null != qqcFdjJqxt ){
				model.addAttribute("car",qqcFdjJqxt);
				if(null != flag){
				model.addAttribute("flag",true);
				}
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjJqxt qqcFdjJqxt1 = new QqcFdjJqxt();
				qqcFdjJqxt1.setFlbh(flbh);
				qqcFdjJqxt1.setFdjbh(bhs);
				model.addAttribute("car",qqcFdjJqxt1);
			}
		}
		return "yzx/plan/appendix/fdj/inletAir";
	}
	//跳转到创建新的装置页面
	@RequestMapping(value="/inlet/create",method=RequestMethod.GET)
	public String create(String flbh,String fdjbh,Model model,String flag){
		Integer fdjbhs = new Integer(fdjbh);
		if("" != fdjbh && null != fdjbh && !"null".equals(fdjbh)){
			Integer bhs = new Integer(fdjbh);
			QqcFdjJqxt qqcFdjJqxt = qqcFdjJqxtService.findByFlbhAndFdjbh(flbh,fdjbhs);
			if(null != qqcFdjJqxt ){
				model.addAttribute("car",qqcFdjJqxt);
				if(null != flag){
					model.addAttribute("flag",true);
				}
			}
		}else{
			QqcFdjJqxt qqcFdjJqxt1 = new QqcFdjJqxt();
			qqcFdjJqxt1.setFlbh(flbh);
			model.addAttribute("car",qqcFdjJqxt1);
		}
		
		return "yzx/plan/appendix/fdj/inletAir";
	}
}
