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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjPqzs;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjPqzsService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/timing")
public class QqcFdjPqzsController {
	@Autowired
	private QqcFdjPqzsService qqcFdjPqzsService;
	//新增
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjPqzs qqcFdjPqzs){
		int result = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjPqzs.getFlbh();
		Integer fdjbh = qqcFdjPqzs.getFdjbh();
		if(null != flbh && null != fdjbh){
			//查询已存在的发动机；
			QqcFdjPqzs qqcFdjPqzsOld = qqcFdjPqzsService.findByFlbhAndFdjbh(flbh, fdjbh);
			if(null != qqcFdjPqzsOld){
			//将已存在的发动机复制给新的；
				BeanUtil.copyProperties(qqcFdjPqzs, qqcFdjPqzsOld);
				//执行保存
				 result = qqcFdjPqzsService.add(qqcFdjPqzsOld);
			}else{
				 result = qqcFdjPqzsService.add(qqcFdjPqzs);
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
			int result = qqcFdjPqzsService.delete(flbh, fdjbhs);
			if(result == 1 ){
				return new JsonMessage(true,"删除成功！");
			}
		}else{
			return new JsonMessage(false,"删除失败！");
		}
		return null;
	}
	
	//查询一个
	@RequestMapping(value = "/findOne",method=RequestMethod.POST)
	public QqcFdjPqzs findOne(String flbh, Integer fdjbh){
		return qqcFdjPqzsService.findByFlbhAndFdjbh(flbh, fdjbh);
	}
	
	//查所有
	@RequestMapping(value = "/findAll",method=RequestMethod.POST)
	public List<QqcFdjPqzs> findAll(String flbh){
		return qqcFdjPqzsService.findByFlbh(flbh);
	}
	//概述
	@RequestMapping(value="",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag){
		if(null != fdjbh && null != flbh && "" != fdjbh && "" != flbh && !"null".equals(fdjbh)){
			Integer bhs = new Integer(fdjbh);
			QqcFdjPqzs qqcFdjPqzs = qqcFdjPqzsService.findByFlbhAndFdjbh(flbh, bhs);
			if(null != qqcFdjPqzs ){
				model.addAttribute("car",qqcFdjPqzs);
				if(null != flag){
				model.addAttribute("flag",true);
				}
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjPqzs qqcFdjPqzs1 = new QqcFdjPqzs();
				qqcFdjPqzs1.setFlbh(flbh);
				qqcFdjPqzs1.setFdjbh(bhs);
				model.addAttribute("car",qqcFdjPqzs1);
			}
		}
		return "yzx/plan/appendix/fdj/timing";
	}
}
