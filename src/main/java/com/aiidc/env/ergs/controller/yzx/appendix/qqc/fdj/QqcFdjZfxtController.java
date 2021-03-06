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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjBs;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjZfxt;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjBsService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjZfxtService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/evaporate")
public class QqcFdjZfxtController {
	@Autowired
	private QqcFdjZfxtService qqcFdjZfxtService;
	@Autowired
	private QqcFdjBsService qqcFdjBsService;
	//添加
	@RequestMapping(value="/add",method= RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjZfxt qqcFdjZfxt,QqcFdjBs qqcFdjBs){
		int resultZfxt = 0;
		int resultBs = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjZfxt.getFlbh();
		Integer fdjbh = qqcFdjZfxt.getFdjbh();
		Integer bh = qqcFdjZfxt.getBh();
		String pzlb = qqcFdjBs.getPzlb();
		if(null != flbh && null != fdjbh && null != bh){
			//查询已存在的发动机；
			QqcFdjZfxt qqcFdjZfxtOld = qqcFdjZfxtService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
			//查询已存在的打刻内容
			QqcFdjBs qqcFdjBsOld = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, bh, pzlb);
			//将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjZfxt, qqcFdjZfxtOld);
			BeanUtil.copyProperties(qqcFdjBs, qqcFdjBsOld);
			//执行保存
			resultZfxt = qqcFdjZfxtService.add(qqcFdjZfxtOld);
			resultBs = qqcFdjBsService.add(qqcFdjBsOld);
		}else{
			resultZfxt = qqcFdjZfxtService.add(qqcFdjZfxt);
			Integer bh2 = qqcFdjZfxtService.just(qqcFdjZfxt).getBh();
			qqcFdjBs.setBh(bh2);
			resultBs = qqcFdjBsService.add(qqcFdjBs);
		}
		if(resultZfxt == resultBs){
			return new JsonMessage(true,"保存成功！");
		}else{
			return new JsonMessage(false,"保存失败！");
		}
	}
	
	//删除
	@RequestMapping(value = "/delet",method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh,String fdjbh,String bh,String pzlb){
		//定义标识
		int resultBs = 0;
		int resultZfxt = 0;
		//查询对象，然后删除实体；
		if(null != flbh && null != fdjbh && null != bh){
			Integer fdjbhs = new Integer(fdjbh);
			Integer bhs = new Integer(bh);
			QqcFdjZfxt qqcFdjZfxt = qqcFdjZfxtService.findByFlbhAndFdjbhAndBh(flbh,fdjbhs,bhs);
			if(null != qqcFdjZfxt){
				resultZfxt = qqcFdjZfxtService.delete(qqcFdjZfxt);
			}
			resultBs = qqcFdjBsService.delete(flbh, fdjbhs, bhs, pzlb);
			if(resultZfxt == resultBs){
				return new JsonMessage(true,"删除成功！");
			}
		}
		return new JsonMessage(false,"删除失败！");		
	}
	
	
	//跳转页面
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(String flbh,String fdjbh,String lb,Model model){
		model.addAttribute("flbh",flbh);
		model.addAttribute("fdjbh",fdjbh);
		model.addAttribute("lb",lb);
		return "yzx/plan/appendix/fdj/fdjEvaporate";
	}
	//详情
	@RequestMapping(value="/detail",method = RequestMethod.GET)
	public String detail(String n,String flbh,Model model,String fdjbh,String bh,String device,String pzlb){
		
		if("0".equals(n)){
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/evaporate/main?flbh="+flbh+"&fdjbh="+fdjbh;
		}else if("100".equals(n)){
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/"+device+"/create?flbh="+flbh+"&fdjbh="+fdjbh+"&bh="+bh+"&pzlb="+pzlb;
		}else if("3".equals(n)){
			return "yzx/plan/appendix/fdj/ECUUpload";
		}else{
			return "redirect:/ergs/yzx/plan/appendix/qqc/fdj/mark/main?flbh="+flbh+"&fdjbh="+fdjbh+"&pzlb="+pzlb;
		}
	}
	//概述
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag){
		if(null != flbh && "" != flbh && null != fdjbh && "" != fdjbh ){
			Integer fdjbhs = new Integer(fdjbh);
			//根据附录编号和发动机编号查询所有的对象
			List<QqcFdjZfxt> evaporates = qqcFdjZfxtService.findByFlbhAndFdjbh(flbh, fdjbhs);
			//如果对象存在就放到model中
			if(null != evaporates && evaporates.size() > 0){
				model.addAttribute("lb","qqc");
				model.addAttribute("evaporates",evaporates);
				model.addAttribute("flbh",flbh);
				model.addAttribute("fdjbh",fdjbh);
				return "yzx/plan/appendix/fdj/evaEmissionTable";
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjZfxt qqcFdjZfxt1 = new QqcFdjZfxt();
				qqcFdjZfxt1.setFlbh(flbh);
				//Integer fdjbhs = new Integer(fdjbh);
				qqcFdjZfxt1.setFdjbh(fdjbhs);
				model.addAttribute("car",qqcFdjZfxt1);
				
				//打刻内容
				QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
				qqcFdjBs1.setFlbh(flbh);
				qqcFdjBs1.setFdjbh(fdjbhs);
				model.addAttribute("mark",qqcFdjBs1);
				return "yzx/plan/appendix/fdj/evaEmission";
			}
		}
		return null;
	}
	//跳转到创建新的页面
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String create(String flbh,String fdjbh,Model model,String flag,String bh,String pzlb){
		Integer fdjbhs = new Integer(fdjbh);
		if("" != bh && null != bh && !"null".equals(bh)){
			Integer bhs = new Integer(bh);
			QqcFdjZfxt qqcFdjZfxt = qqcFdjZfxtService.findByFlbhAndFdjbhAndBh(flbh,fdjbhs,bhs);
			//查询打刻内容
			QqcFdjBs qqcFdjBs = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbhs, bhs, pzlb);
			if(null != qqcFdjZfxt ){
				model.addAttribute("car",qqcFdjZfxt);
				model.addAttribute("mark",qqcFdjBs);
				if(null != flag){
					model.addAttribute("flag",true);
				}
			}
		}else{
			QqcFdjZfxt qqcFdjZfxt1 = new QqcFdjZfxt();
			qqcFdjZfxt1.setFlbh(flbh);
			qqcFdjZfxt1.setFdjbh(fdjbhs);
			model.addAttribute("car",qqcFdjZfxt1);
			
			QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
			qqcFdjBs1.setFlbh(flbh);
			qqcFdjBs1.setFdjbh(fdjbhs);
			model.addAttribute("mark",qqcFdjBs1);
		}
	
	return "yzx/plan/appendix/fdj/evaEmission";
	}
}
