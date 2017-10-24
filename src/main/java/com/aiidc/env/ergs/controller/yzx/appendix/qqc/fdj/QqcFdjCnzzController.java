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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjCnzz;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjBsService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjCnzzService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/storePower")
public class QqcFdjCnzzController {
	@Autowired
	private QqcFdjCnzzService qqcFdjCnzzService;
	@Autowired
	private QqcFdjBsService qqcFdjBsService;
	//添加
	@RequestMapping(value="/add",method= RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjCnzz qqcFdjCnzz,QqcFdjBs qqcFdjBs){
		int resultBs = 0;
		int resultCnzz = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjCnzz.getFlbh();
		Integer fdjbh = qqcFdjCnzz.getFdjbh();
		Integer bh = qqcFdjCnzz.getBh();
		String pzlb = qqcFdjBs.getPzlb();
		if(null != flbh && null != fdjbh && null != bh){
			//查询已存在的发动机；
			QqcFdjCnzz qqcFdjCnzzOld = qqcFdjCnzzService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
			//查询已存在的打刻内容
			QqcFdjBs qqcFdjBsOld = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, bh, pzlb);
			//将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjCnzz, qqcFdjCnzzOld);
			BeanUtil.copyProperties(qqcFdjBs, qqcFdjBsOld);
			//执行保存
			resultCnzz = qqcFdjCnzzService.add(qqcFdjCnzzOld);
			resultBs = qqcFdjBsService.add(qqcFdjBsOld);
		}else{
			resultCnzz = qqcFdjCnzzService.add(qqcFdjCnzz);
			Integer bh2 = qqcFdjCnzzService.just(qqcFdjCnzz).getBh();
			qqcFdjBs.setBh(bh2);
			resultBs = qqcFdjBsService.add(qqcFdjBs);
		}
		if(resultCnzz == resultBs){
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
		int resultCnzz = 0;
		//查询对象，然后删除实体；
		if(null != flbh && null != fdjbh && null != bh){
			Integer fdjbhs = new Integer(fdjbh);
			Integer bhs = new Integer(bh);
			QqcFdjCnzz qqcFdjCnzz = qqcFdjCnzzService.findByFlbhAndFdjbhAndBh(flbh,fdjbhs,bhs);
			if(null != qqcFdjCnzz){
				resultCnzz = qqcFdjCnzzService.delete(qqcFdjCnzz);
			}
			resultBs = qqcFdjBsService.delete(flbh, fdjbhs, bhs, pzlb);
			if(resultCnzz == resultBs){
				return new JsonMessage(true,"删除成功！");
			}
		}
		return new JsonMessage(false,"删除失败！");		
	}
	//概述
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag){
		if(null != flbh && "" != flbh && null != fdjbh && "" != fdjbh ){
			Integer fdjbhs = new Integer(fdjbh);
			//根据附录编号和发动机编号查询所有的对象
			List<QqcFdjCnzz> cnzzs = qqcFdjCnzzService.findByFlbhAndFdjbh(flbh, fdjbhs);
			//如果对象存在就放到model中
			if(null != cnzzs && cnzzs.size() > 0){
				model.addAttribute("lb","qqc");
				model.addAttribute("cnzzs",cnzzs);
				model.addAttribute("flbh",flbh);
				model.addAttribute("fdjbh",fdjbh);
				return "yzx/plan/appendix/fdj/powerTable";
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjCnzz qqcFdjCnzz1 = new QqcFdjCnzz();
				qqcFdjCnzz1.setFlbh(flbh);
				//Integer fdjbhs = new Integer(fdjbh);
				qqcFdjCnzz1.setFdjbh(fdjbhs);
				model.addAttribute("car",qqcFdjCnzz1);
				
				//打刻内容
				QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
				qqcFdjBs1.setFlbh(flbh);
				qqcFdjBs1.setFdjbh(fdjbhs);
				model.addAttribute("bs",qqcFdjBs1);
				return "yzx/plan/appendix/fdj/power";
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
			QqcFdjCnzz qqcFdjCnzz = qqcFdjCnzzService.findByFlbhAndFdjbhAndBh(flbh,fdjbhs,bhs);
			//查询打刻内容
			QqcFdjBs qqcFdjBs = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbhs, bhs, pzlb);
			if(null != qqcFdjCnzz ){
				model.addAttribute("bs",qqcFdjBs);
				model.addAttribute("car",qqcFdjCnzz);
				if(null != flag){
					model.addAttribute("flag",true);
				}
			}
		}else{
			QqcFdjCnzz qqcFdjCnzz1 = new QqcFdjCnzz();
			qqcFdjCnzz1.setFlbh(flbh);
			qqcFdjCnzz1.setFdjbh(fdjbhs);
			model.addAttribute("car",qqcFdjCnzz1);

			QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
			qqcFdjBs1.setFlbh(flbh);
			qqcFdjBs1.setFdjbh(fdjbhs);
			model.addAttribute("bs",qqcFdjBs1);
		}
	
	return "yzx/plan/appendix/fdj/power";
	}
}
