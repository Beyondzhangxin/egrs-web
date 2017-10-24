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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjDj;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjBsService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjDjService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/elecMotor")
public class QqcFdjDjController {
	@Autowired
	private QqcFdjDjService qqcFdjDjService;
	@Autowired
	private QqcFdjBsService qqcFdjBsService;
	//添加
	@RequestMapping(value="/add",method= RequestMethod.POST)
	@ResponseBody
	public JsonMessage addCdx(QqcFdjDj qqcFdjDj,QqcFdjBs qqcFdjBs){
		int resultBs = 0;
		int resultDj = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjDj.getFlbh();
		Integer fdjbh = qqcFdjDj.getFdjbh();
		Integer bh = qqcFdjDj.getBh();
		String pzlb = qqcFdjBs.getPzlb();
		if(null != flbh && null != fdjbh && null != bh){
			//查询已存在的发动机；
			QqcFdjDj qqcFdjDjOld = qqcFdjDjService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
			//查询已存在的打刻内容
			QqcFdjBs qqcFdjBsOld = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, bh, pzlb);
			//将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjDj, qqcFdjDjOld);
			BeanUtil.copyProperties(qqcFdjBs, qqcFdjBsOld);
			//执行保存
			resultDj = qqcFdjDjService.add(qqcFdjDjOld);
			resultBs = qqcFdjBsService.add(qqcFdjBsOld);
		}else{
			resultDj = qqcFdjDjService.add(qqcFdjDj);
			//获取进气系统对象编号；赋值给打刻内容对象；
			Integer bh2 = qqcFdjDjService.just(qqcFdjDj).getBh();
			qqcFdjBs.setBh(bh2);
			resultBs = qqcFdjBsService.add(qqcFdjBs);
		}
		if(resultDj == resultBs){
			return new JsonMessage(true,"保存成功！");
		}else{
			return new JsonMessage(false,"保存失败！");
		}
	}
	
	
	//删除
	@RequestMapping(value = "/delet",method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh,Integer bh,Integer fdjbh,String pzlb){
		//定义标识
		int resultBs = 0;
		int resultDj = 0;
		//查询对象，然后删除实体；
		if(null != flbh && null != fdjbh && null != bh){
			Integer fdjbhs = new Integer(fdjbh);
			Integer bhs = new Integer(bh);
			QqcFdjDj qqcFdjDj = qqcFdjDjService.findByFlbhAndFdjbhAndBh(flbh,fdjbhs,bhs);
			if(null != qqcFdjDj){
				resultDj = qqcFdjDjService.delete(qqcFdjDj);
			}
			resultBs = qqcFdjBsService.delete(flbh, fdjbhs, bhs, pzlb);
			if(resultDj == resultBs){
				return new JsonMessage(true,"删除成功！");
			}
		}
		return new JsonMessage(false,"删除失败！");		
	}
	
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag){
		if(null != flbh && "" != flbh && null != fdjbh && "" != fdjbh ){
			Integer fdjbhs = new Integer(fdjbh);
			//根据附录编号和发动机编号查询所有的对象
			List<QqcFdjDj> motors = qqcFdjDjService.findByFlbhAndFdjbh(flbh, fdjbhs);
			//如果对象存在就放到model中
			if(null != motors && motors.size() > 0){
				model.addAttribute("lb","qqc");
				model.addAttribute("motors",motors);
				model.addAttribute("flbh",flbh);
				model.addAttribute("fdjbh",fdjbh);
				return "yzx/plan/appendix/fdj/elecMotorTable";
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjDj qqcFdjDj1 = new QqcFdjDj();
				qqcFdjDj1.setFlbh(flbh);
				qqcFdjDj1.setFdjbh(fdjbhs);
				model.addAttribute("car",qqcFdjDj1);
				
				//打刻内容
				QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
				qqcFdjBs1.setFlbh(flbh);
				qqcFdjBs1.setFdjbh(fdjbhs);
				model.addAttribute("bs",qqcFdjBs1);
				return "yzx/plan/appendix/fdj/elecMotor";
			}
		}
		return null;
	}
	//跳转到创建新的点火装置页面
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String create(String flbh,String fdjbh,Model model,String flag,String bh,String pzlb){
		Integer fdjbhs = new Integer(fdjbh);
		if("" != bh && null != bh && !"null".equals(bh)){
			Integer bhs = new Integer(bh);
			QqcFdjDj qqcFdjDj = qqcFdjDjService.findByFlbhAndFdjbhAndBh(flbh,fdjbhs,bhs);
			//查询打刻内容
			QqcFdjBs qqcFdjBs = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbhs, bhs, pzlb);
			if(null != qqcFdjDj ){
				model.addAttribute("car",qqcFdjDj);
				model.addAttribute("bs",qqcFdjBs);
				if(null != flag){
					model.addAttribute("flag",true);
				}
			}
		}else{
			QqcFdjDj qqcFdjDj1 = new QqcFdjDj();
			qqcFdjDj1.setFlbh(flbh);
			qqcFdjDj1.setFdjbh(fdjbhs);
			model.addAttribute("car",qqcFdjDj1);
			
			QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
			qqcFdjBs1.setFlbh(flbh);
			qqcFdjBs1.setFdjbh(fdjbhs);
			model.addAttribute("bs",qqcFdjBs1);
		}
	
	return "yzx/plan/appendix/fdj/elecMotor";
	}
}
