/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix.qqc.fdj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.util.BeanUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjDczhq;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjDczhqService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/DCChange")
public class QqcFdjDczhqController {
	@Resource
	private QqcFdjDczhqService qqcFdjDczhqService;
	
	//添加
	@RequestMapping(value="/add",method= RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjDczhq qqcFdjDczhq){
		int result = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjDczhq.getFlbh();
		Integer fdjbh = qqcFdjDczhq.getFdjbh();
		Integer bh = qqcFdjDczhq.getBh();
		if(null != flbh && null != fdjbh && null != bh){
			//查询已存在的发动机；
			QqcFdjDczhq qqcFdjDczhqOld = qqcFdjDczhqService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
			//将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjDczhq, qqcFdjDczhqOld);
			//执行保存
			result = qqcFdjDczhqService.add(qqcFdjDczhqOld);
		}else{
			result = qqcFdjDczhqService.add(qqcFdjDczhq);
		}
		if(result == 1){
			return new JsonMessage(true,"保存成功！");
		}else{
			return new JsonMessage(false,"保存失败！");
		}
	}
	
	
	
	//修改
	@RequestMapping(value="/yzx/fdjDczhq/update",method= RequestMethod.POST)
	public void updateCdx(String flbh,Integer bh,Integer fdjbh){
		//查询出附录编号和编号所对应的传动系；
		QqcFdjDczhq fdjDczhq = qqcFdjDczhqService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
		//修改传动系；
		qqcFdjDczhqService.update(fdjDczhq);
	}
	
	
	//删除
	@RequestMapping(value = "/delet",method = RequestMethod.POST)
	@ResponseBody
	public JsonMessage deleteCdx(String flbh,Integer bh,Integer fdjbh){
		//定义标识
		int result = 0;
		//查询对象，然后删除实体；
		if(null != flbh && null != fdjbh && null != bh){
			Integer fdjbhs = new Integer(fdjbh);
			Integer bhs = new Integer(bh);
			QqcFdjDczhq qqcFdjDczhq = qqcFdjDczhqService.findByFlbhAndFdjbhAndBh(flbh,fdjbhs,bhs);
			if(null != qqcFdjDczhq){
				result = qqcFdjDczhqService.delete(qqcFdjDczhq);
			}
			if(result == 1){
				return new JsonMessage(true,"删除成功！");
			}
		}
		return new JsonMessage(false,"删除失败！");		
	}
	
	//查询一个
	@RequestMapping(value = "/yzx/fdjDczhq/findone",method = RequestMethod.POST)
	@ResponseBody
	public QqcFdjDczhq findOne(String flbh,Integer bh,Integer fdjbh){
		return qqcFdjDczhqService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
	}
	
	//查询所有
	@RequestMapping(value = "/yzx/fdjDczhq/findAll",method = RequestMethod.POST)
	@ResponseBody
	public List<QqcFdjDczhq> findAll(String flbh,Integer fdjbh){
		return qqcFdjDczhqService.findByFlbhAndFdjbh(flbh,fdjbh);
	}
	//概述
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag){
		if(null != flbh && "" != flbh && null != fdjbh && "" != fdjbh ){
			Integer fdjbhs = new Integer(fdjbh);
			//根据附录编号和发动机编号查询所有的对象
			List<QqcFdjDczhq> dcs = qqcFdjDczhqService.findByFlbhAndFdjbh(flbh, fdjbhs);
			//如果对象存在就放到model中
			if(null != dcs && dcs.size() > 0){
				model.addAttribute("lb","qqc");
				model.addAttribute("dcs",dcs);
				model.addAttribute("flbh",flbh);
				model.addAttribute("fdjbh",fdjbh);
				return "yzx/plan/appendix/fdj/DCchangeTable";
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjDczhq qqcFdjDczhq1 = new QqcFdjDczhq();
				qqcFdjDczhq1.setFlbh(flbh);
				//Integer fdjbhs = new Integer(fdjbh);
				qqcFdjDczhq1.setFdjbh(fdjbhs);
				model.addAttribute("car",qqcFdjDczhq1);
				return "yzx/plan/appendix/fdj/DCchange";
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
			QqcFdjDczhq qqcFdjDczhq = qqcFdjDczhqService.findByFlbhAndFdjbhAndBh(flbh,fdjbhs,bhs);
			if(null != qqcFdjDczhq ){
				model.addAttribute("car",qqcFdjDczhq);
				if(null != flag){
					model.addAttribute("flag",true);
				}
			}
		}else{
			QqcFdjDczhq qqcFdjDczhq1 = new QqcFdjDczhq();
			qqcFdjDczhq1.setFlbh(flbh);
			qqcFdjDczhq1.setFdjbh(fdjbhs);
			model.addAttribute("car",qqcFdjDczhq1);
		}
	
	return "yzx/plan/appendix/fdj/DCchange";
	}
}
