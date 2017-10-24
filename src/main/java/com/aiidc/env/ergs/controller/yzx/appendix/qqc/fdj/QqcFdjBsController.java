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
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjBsService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/mark")
public class QqcFdjBsController {
	@Autowired
	private QqcFdjBsService qqcFdjBsService;
	
	//添加
	@RequestMapping(value="/add",method= RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjBs qqcFdjBs){
		int result = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjBs.getFlbh();
		Integer fdjbh = qqcFdjBs.getFdjbh();
		Integer bh = qqcFdjBs.getBh();
		String pzlb = qqcFdjBs.getPzlb();
		if(null != flbh && null != fdjbh && null != bh){
			//查询已存在的发动机；
			QqcFdjBs qqcFdjBsOld = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, bh,pzlb);
			//将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjBs, qqcFdjBsOld);
			//执行保存
			result = qqcFdjBsService.add(qqcFdjBsOld);
		}else{
			result = qqcFdjBsService.add(qqcFdjBs);
		}
		if(result == 1){
			return new JsonMessage(true,"保存成功！");
		}else{
			return new JsonMessage(false,"保存失败！");
		}		
	}
	
	
	
	//修改根据附录编号修改
	@RequestMapping(value="/yzx/fdjbs/update",method= RequestMethod.POST)
	public void updateCdx(String flbh,Integer bh,Integer fdjbh,String pzlb){
		//查询出附录编号和编号所对应的传动系；
		QqcFdjBs fdjBs = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, bh, pzlb);
		//修改传动系；
		qqcFdjBsService.update(fdjBs);
	}
	
	
	//删除
	@RequestMapping(value = "/delet",method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh,Integer bh,Integer fdjbh,String pzlb){
		//定义标识
		int result = 0;
		//查询对象，然后删除实体；
		if(null != flbh && null != fdjbh && null != bh){
			Integer fdjbhs = new Integer(fdjbh);
			Integer bhs = new Integer(bh);
			result = qqcFdjBsService.delete(flbh, fdjbh, bh, pzlb);
			if(result == 1){
				return new JsonMessage(true,"删除成功！");
			}
		}
		return new JsonMessage(false,"删除失败！");
	}
	
	//查询一个
	@RequestMapping(value = "/yzx/fdjbs/findone",method = RequestMethod.POST)
	@ResponseBody
	public QqcFdjBs findOne(String flbh,Integer bh,Integer fdjbh,String pzlb){
		return qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, bh, pzlb);
	}
	//概述
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag,String pzlb){
		if(null != flbh && "" != flbh && null != fdjbh && "" != fdjbh  ){
			Integer fdjbhs = new Integer(fdjbh);
			//根据附录编号和发动机编号查询所有的对象
			List<QqcFdjBs> bss = qqcFdjBsService.findByFlbhAndFdjbhAndPzlb(flbh, fdjbhs,pzlb);
			//如果对象存在就放到model中
			if(null != bss && bss.size() > 0){
				model.addAttribute("lb","qqc");
				model.addAttribute("bss",bss);
				model.addAttribute("flbh",flbh);
				model.addAttribute("fdjbh",fdjbh);
				model.addAttribute("pzlb",pzlb);
				return "yzx/plan/appendix/fdj/markTable";
				
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
				qqcFdjBs1.setFlbh(flbh);
				qqcFdjBs1.setFdjbh(fdjbhs);
				model.addAttribute("car",qqcFdjBs1);
				model.addAttribute("pzlb",pzlb);
				/*if("ZYQ".equals(pzlb)){*/
					return "yzx/plan/appendix/fdj/mark";
				//}
			}
		}
		return null;
	}
	//跳转到创建新的配置页面
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String create(String flbh,String fdjbh,Model model,String flag,String bh,String pzlb){
		Integer fdjbhs = new Integer(fdjbh);
		if("" != bh && null != bh && !"null".equals(bh)){
			Integer bhs = new Integer(bh);
			QqcFdjBs qqcFdjBs = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh,fdjbhs,bhs,pzlb);
			if(null != qqcFdjBs ){
				model.addAttribute("car",qqcFdjBs);
				model.addAttribute("pzlb",pzlb);
				if(null != flag){
					model.addAttribute("flag",true);
				}
			}
		}else{
			QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
			qqcFdjBs1.setFlbh(flbh);
			qqcFdjBs1.setFdjbh(fdjbhs);
			model.addAttribute("car",qqcFdjBs1);
			model.addAttribute("pzlb",pzlb);
		}
		//if("ZYQ".equals(pzlb)){
			return "yzx/plan/appendix/fdj/mark";
		//}
	}
}
