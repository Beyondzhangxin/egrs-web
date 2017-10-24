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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjWd;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjWdService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/temperature")
public class QqcFdjWdController {
	@Autowired
	private QqcFdjWdService qqcFdjWdService;
	//新增
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjWd qqcFdjWd){
		int result = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjWd.getFlbh();
		Integer fdjbh = qqcFdjWd.getFdjbh();
		if(null != flbh && null != fdjbh ){
			//查询已存在的发动机；
			QqcFdjWd qqcFdjWdOld = qqcFdjWdService.findByFlbhAndFdjbh(flbh, fdjbh);
			if(null != qqcFdjWdOld){
				//将已存在的发动机复制给新的；
				BeanUtil.copyProperties(qqcFdjWd, qqcFdjWdOld);
				//执行保存
				result = qqcFdjWdService.add(qqcFdjWdOld);
			}else{
				result = qqcFdjWdService.add(qqcFdjWd);
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
		QqcFdjWd qqcFdjWd = qqcFdjWdService.findByFlbhAndFdjbh(flbh, fdjbh);
		qqcFdjWdService.update(qqcFdjWd);
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
			result = qqcFdjWdService.delete(flbh,fdjbh);
			if(result == 1){
				return new JsonMessage(true,"删除成功！");
			}
		}
		return new JsonMessage(false,"删除失败！");		
	}
	
	//查询一个
	@RequestMapping(value = "/findOne",method=RequestMethod.POST)
	public QqcFdjWd findOne(String flbh, Integer fdjbh){
		return qqcFdjWdService.findByFlbhAndFdjbh(flbh, fdjbh);
	}
	
	//查所有
	@RequestMapping(value = "/findAll",method=RequestMethod.POST)
	public List<QqcFdjWd> findAll(String flbh){
		return qqcFdjWdService.findByFlbh(flbh);
	}
	//概述
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag){
		if(null != fdjbh && null != flbh && "" != fdjbh && "" != flbh && !"null".equals(fdjbh)){
			Integer bhs = new Integer(fdjbh);
			QqcFdjWd qqcFdjWd = qqcFdjWdService.findByFlbhAndFdjbh(flbh, bhs);
			if(null != qqcFdjWd ){
				model.addAttribute("car",qqcFdjWd);
				if(null != flag){
				model.addAttribute("flag",true);
				}
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjWd qqcFdjWd1 = new QqcFdjWd();
				qqcFdjWd1.setFlbh(flbh);
				qqcFdjWd1.setFdjbh(bhs);
				model.addAttribute("car",qqcFdjWd1);
			}
		}
		return "yzx/plan/appendix/fdj/temperature";
	}
}
