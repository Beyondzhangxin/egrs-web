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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjDhzz;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjDhzzService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/dhzz")
public class QqcFdjDhzzController {
	@Autowired
	private QqcFdjDhzzService qqcFdjDhzzService;
	//添加
	@RequestMapping(value="/add",method= RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjDhzz qqcFdjDhzz){
		int result = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjDhzz.getFlbh();
		Integer fdjbh = qqcFdjDhzz.getFdjbh();
		Integer bh = qqcFdjDhzz.getBh();
		if(null != flbh && null != fdjbh && null != bh){
			//查询已存在的发动机；
			QqcFdjDhzz qqcFdjDhzzOld = qqcFdjDhzzService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
			//将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjDhzz, qqcFdjDhzzOld);
			//执行保存
			result = qqcFdjDhzzService.add(qqcFdjDhzzOld);
		}else{
			result = qqcFdjDhzzService.add(qqcFdjDhzz);
		}
		if(result == 1){
			return new JsonMessage(true,"保存成功！");
		}else{
			return new JsonMessage(false,"保存失败！");
		}
	}
	
	
	//修改
	@RequestMapping(value="/yzx/fdjDhzz/update",method= RequestMethod.POST)
	public void updateCdx(String flbh,Integer bh,Integer fdjbh){
		//查询出附录编号和编号所对应的传动系；
		QqcFdjDhzz fdjDhzz = qqcFdjDhzzService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
		//修改传动系；
		qqcFdjDhzzService.update(fdjDhzz);
	}
	
	
	//删除
	@RequestMapping(value = "/delet",method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage deleteCdx(String flbh,String fdjbh,String bh){
		//定义标识
		int result = 0;
		//查询对象，然后删除实体；
		if(null != flbh && null != fdjbh && null != bh){
			Integer fdjbhs = new Integer(fdjbh);
			Integer bhs = new Integer(bh);
			QqcFdjDhzz qqcFdjDhzz = qqcFdjDhzzService.findByFlbhAndFdjbhAndBh(flbh,fdjbhs,bhs);
			if(null != qqcFdjDhzz){
				result = qqcFdjDhzzService.delete(qqcFdjDhzz);
			}
			if(result == 1){
				return new JsonMessage(true,"删除成功！");
			}
		}
		return new JsonMessage(false,"删除失败！");		
	}
	
	//查询一个
	@RequestMapping(value = "/yzx/fdjDhzz/findone",method = RequestMethod.POST)
	@ResponseBody
	public QqcFdjDhzz findOne(String flbh,Integer bh,Integer fdjbh){
		return qqcFdjDhzzService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
	}
	
	//查询所有
	@RequestMapping(value = "/yzx/fdjDhzz/findAll",method = RequestMethod.POST)
	@ResponseBody
	public List<QqcFdjDhzz> findAll(String flbh,Integer fdjbh){
		return qqcFdjDhzzService.findByFlbhAndFdjbh(flbh,fdjbh);
	}
	//跳转点火线圈页面
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(String flbh,String fdjbh,String lb,Model model){
		model.addAttribute("flbh",flbh);
		model.addAttribute("fdjbh",fdjbh);
		model.addAttribute("lb",lb);
		return "yzx/plan/appendix/fdj/fdjFire";
	}
	//详情
	@RequestMapping(value="/detail",method = RequestMethod.GET)
	public String detail(String n,String flbh,Model model,String fdjbh,String bh,String device,String pzlb){
		
		if("0".equals(n)){
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/dhzz/main?flbh="+flbh+"&fdjbh="+fdjbh;
		}else if("4".equals(n)){
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/"+device+"/create?flbh="+flbh+"&fdjbh="+fdjbh+"&bh="+bh+"&pzlb="+pzlb;
		}else{
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/config/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
		}
	}
	//概述
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag){
		if(null != flbh && "" != flbh && null != fdjbh && "" != fdjbh ){
			Integer fdjbhs = new Integer(fdjbh);
			//根据附录编号和发动机编号查询所有的对象
			List<QqcFdjDhzz> dhzzs = qqcFdjDhzzService.findByFlbhAndFdjbh(flbh, fdjbhs);
			//如果对象存在就放到model中
			if(null != dhzzs && dhzzs.size() > 0){
				model.addAttribute("lb","qqc");
				model.addAttribute("dhzzs",dhzzs);
				model.addAttribute("flbh",flbh);
				model.addAttribute("fdjbh",fdjbh);
				return "yzx/plan/appendix/fdj/ignitorTable";
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjDhzz qqcFdjDhzz1 = new QqcFdjDhzz();
				qqcFdjDhzz1.setFlbh(flbh);
				//Integer fdjbhs = new Integer(fdjbh);
				qqcFdjDhzz1.setFdjbh(fdjbhs);
				model.addAttribute("car",qqcFdjDhzz1);
				return "yzx/plan/appendix/fdj/ignitor";
			}
		}
		return null;
	}
	//跳转到创建新的点火装置页面
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String create(String flbh,String fdjbh,Model model,String flag,String bh){
		Integer fdjbhs = new Integer(fdjbh);
		if("" != bh && null != bh && !"null".equals(bh)){
			Integer bhs = new Integer(bh);
			QqcFdjDhzz qqcFdjDhzz = qqcFdjDhzzService.findByFlbhAndFdjbhAndBh(flbh,fdjbhs,bhs);
			if(null != qqcFdjDhzz ){
				model.addAttribute("car",qqcFdjDhzz);
				if(null != flag){
					model.addAttribute("flag",true);
				}
			}
		}else{
			QqcFdjDhzz qqcFdjDhzz1 = new QqcFdjDhzz();
			qqcFdjDhzz1.setFlbh(flbh);
			qqcFdjDhzz1.setFdjbh(fdjbhs);
			model.addAttribute("car",qqcFdjDhzz1);
		}
	
	return "yzx/plan/appendix/fdj/ignitor";
	}
}
