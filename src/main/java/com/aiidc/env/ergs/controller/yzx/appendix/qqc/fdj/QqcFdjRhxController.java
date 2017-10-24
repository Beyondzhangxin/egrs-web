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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjRhx;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjRhxService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/lubricate")
public class QqcFdjRhxController {
	@Autowired
	private QqcFdjRhxService qqcFdjRhxService;
	//新增
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjRhx qqcFdjRhx){
		int result = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjRhx.getFlbh();
		Integer fdjbh = qqcFdjRhx.getFdjbh();
		if(null != flbh && null != fdjbh ){
			//查询已存在的发动机；
			QqcFdjRhx qqcFdjRhxOld = qqcFdjRhxService.findByFlbhAndFdjbh(flbh, fdjbh);
			if(null != qqcFdjRhxOld){
				//将已存在的发动机复制给新的；
				BeanUtil.copyProperties(qqcFdjRhx, qqcFdjRhxOld);
				//执行保存
				result = qqcFdjRhxService.add(qqcFdjRhxOld);
			}else{
				result = qqcFdjRhxService.add(qqcFdjRhx);
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
		QqcFdjRhx qqcFdjRhx = qqcFdjRhxService.findByFlbhAndFdjbh(flbh, fdjbh);
		qqcFdjRhxService.update(qqcFdjRhx);
	}
	
	//删除
	@RequestMapping(value = "/delete",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh, Integer fdjbh){
		//定义标识
		int result = 0;
		//查询对象，然后删除实体；
		if(null != flbh && null != fdjbh){
			Integer fdjbhs = new Integer(fdjbh);
			result = qqcFdjRhxService.delete(flbh,fdjbh);
			if(result == 1){
				return new JsonMessage(true,"删除成功！");
			}
		}
		return new JsonMessage(false,"删除失败！");		
	}
	
	//查询一个
	@RequestMapping(value = "/findOne",method=RequestMethod.POST)
	public QqcFdjRhx findOne(String flbh, Integer fdjbh){
		return qqcFdjRhxService.findByFlbhAndFdjbh(flbh, fdjbh);
	}
	
	//查所有
	@RequestMapping(value = "/findAll",method=RequestMethod.POST)
	public List<QqcFdjRhx> findAll(String flbh){
		return qqcFdjRhxService.findByFlbh(flbh);
	}
	//跳转页面
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(String flbh,String fdjbh,String lb,Model model){
		model.addAttribute("flbh",flbh);
		model.addAttribute("lb",lb);
		model.addAttribute("fdjbh",fdjbh);
		return "yzx/plan/appendix/fdj/fdjLubricate";
	}
	//详情
	@RequestMapping(value="/detail",method = RequestMethod.GET)
	public String detail(String n,String flbh,Model model,String fdjbh,String bh,String device,String pzlb){
		
		if("2".equals(n)){
			//润滑油
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/lubricate/main?flbh="+flbh+"&fdjbh="+fdjbh;
		}else if("100".equals(n)){
			//创建新的和查看
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/"+device+"/create?flbh="+flbh+"&fdjbh="+fdjbh+"&bh="+bh+"&pzlb="+pzlb;
		}else{
			//发动机配置fdj-config
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/config/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
		}
	}
	//概述
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,Model model,String flag){
		if(null != fdjbh && null != flbh && "" != fdjbh && "" != flbh && !"null".equals(fdjbh)){
			Integer bhs = new Integer(fdjbh);
			QqcFdjRhx qqcFdjRhx = qqcFdjRhxService.findByFlbhAndFdjbh(flbh, bhs);
			if(null != qqcFdjRhx ){
				model.addAttribute("car",qqcFdjRhx);
				if(null != flag){
				model.addAttribute("flag",true);
				}
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjRhx qqcFdjRhx1 = new QqcFdjRhx();
				qqcFdjRhx1.setFlbh(flbh);
				qqcFdjRhx1.setFdjbh(bhs);
				model.addAttribute("car",qqcFdjRhx1);
			}
		}
		return "yzx/plan/appendix/fdj/lube";
	}
	//跳转到创建新的装置页面
	@RequestMapping(value="/inlet/create",method=RequestMethod.GET)
	public String create(String flbh,String fdjbh,Model model,String flag){
		Integer fdjbhs = new Integer(fdjbh);
		if("" != fdjbh && null != fdjbh && !"null".equals(fdjbh)){
			Integer bhs = new Integer(fdjbh);
			QqcFdjRhx qqcFdjRhx = qqcFdjRhxService.findByFlbhAndFdjbh(flbh,fdjbhs);
			if(null != qqcFdjRhx ){
				model.addAttribute("car",qqcFdjRhx);
				if(null != flag){
					model.addAttribute("flag",true);
				}
			}
		}else{
			QqcFdjRhx qqcFdjRhx1 = new QqcFdjRhx();
			qqcFdjRhx1.setFlbh(flbh);
			model.addAttribute("car",qqcFdjRhx1);
		}
		
		return "yzx/plan/appendix/fdj/lube";
	}
}
