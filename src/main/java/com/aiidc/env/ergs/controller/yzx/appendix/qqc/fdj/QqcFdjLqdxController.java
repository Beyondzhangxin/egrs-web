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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjLqdx;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjLqdxService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/coolBoot")
public class QqcFdjLqdxController {
	@Autowired
	private QqcFdjLqdxService qqcFdjLqdxService;
	//新增
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjLqdx qqcFdjLqdx){
		int result = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjLqdx.getFlbh();
		Integer fdjbh = qqcFdjLqdx.getFdjbh();
		if(null != flbh && null != fdjbh){
			//查询已存在的发动机；
			QqcFdjLqdx qqcFdjLqdxOld = qqcFdjLqdxService.findByFlbhAndFdjbh(flbh, fdjbh);
			if(null != qqcFdjLqdxOld){
			//将已存在的发动机复制给新的；
				BeanUtil.copyProperties(qqcFdjLqdx, qqcFdjLqdxOld);
				//执行保存
				 result = qqcFdjLqdxService.add(qqcFdjLqdxOld);
			}else{
				 result = qqcFdjLqdxService.add(qqcFdjLqdx);
			}
		}
		if(result == 1){
			return new JsonMessage(true,"保存成功！");
		}else{
			return new JsonMessage(false,"保存失败！");
		}
	}
	
	
	//删除
	@RequestMapping(value = "/delete",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh, Integer fdjbh){
		if(null != flbh && null != fdjbh){
			Integer fdjbhs = new Integer(fdjbh);
			int result = qqcFdjLqdxService.delete(flbh, fdjbhs);
			if(result == 1 ){
				return new JsonMessage(true,"删除成功！");
			}
		}else{
			return new JsonMessage(false,"删除失败！");
		}
		return null;
	}
	
	//概述
	@RequestMapping(value="",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag){
		if(null != fdjbh && null != flbh && "" != fdjbh && "" != flbh && !"null".equals(fdjbh)){
			Integer bhs = new Integer(fdjbh);
			QqcFdjLqdx qqcFdjLqdx = qqcFdjLqdxService.findByFlbhAndFdjbh(flbh, bhs);
			if(null != qqcFdjLqdx ){
				model.addAttribute("car",qqcFdjLqdx);
				if(null != flag){
				model.addAttribute("flag",true);
				}
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjLqdx qqcFdjLqdx1 = new QqcFdjLqdx();
				qqcFdjLqdx1.setFlbh(flbh);
				qqcFdjLqdx1.setFdjbh(bhs);
				model.addAttribute("car",qqcFdjLqdx1);
			}
		}
		return "yzx/plan/appendix/fdj/coolBoot";
	}
}
