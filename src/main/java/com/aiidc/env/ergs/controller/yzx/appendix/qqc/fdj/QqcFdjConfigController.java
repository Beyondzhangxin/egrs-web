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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjConfig;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjBsService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjConfigService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/config")
public class QqcFdjConfigController {
	@Autowired
	private QqcFdjConfigService qqcFdjConfigService;
	@Autowired
	private QqcFdjBsService qqcFdjBsService;
	
	//添加
	@RequestMapping(value="/add",method= RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjConfig qqcFdjConfig,QqcFdjBs qqcFdjBs,String sytConfig){
		int resultBs = 0;
		int resultConfig = 0;
		//获取附录编号和发动机编号；
		String flbh = qqcFdjConfig.getFlbh();
		Integer fdjbh = qqcFdjConfig.getFdjbh();
		Integer bh = qqcFdjConfig.getBh();
		String pzlb = qqcFdjConfig.getPzlb();
		//两个对象有都用相同的字段，syt；分别进行赋值
		//给config赋值
		qqcFdjConfig.setSyt(sytConfig);
		
		if(null != flbh && null != fdjbh && null != bh){
			//查询已存在的发动机；
			QqcFdjConfig qqcFdjConfigOld = qqcFdjConfigService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, bh,pzlb);
			//查询已存在的打刻内容
			QqcFdjBs qqcFdjBsOld = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbh, bh, pzlb);
			//将已存在的发动机复制给新的；
			BeanUtil.copyProperties(qqcFdjConfig, qqcFdjConfigOld);
			BeanUtil.copyProperties(qqcFdjBs, qqcFdjBsOld);
			//执行保存
			resultConfig = qqcFdjConfigService.add(qqcFdjConfigOld);
			resultBs = qqcFdjBsService.add(qqcFdjBsOld);
		}else{
			resultConfig = qqcFdjConfigService.add(qqcFdjConfig);
			Integer bh2 = qqcFdjConfigService.just(qqcFdjConfig).getBh();
			qqcFdjBs.setBh(bh2);
			resultBs = qqcFdjBsService.add(qqcFdjBs);
		}
		if(resultConfig == resultBs){
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
		int resultConfig = 0;
		//查询对象，然后删除实体；
		if(null != flbh && null != fdjbh && null != bh){
			Integer fdjbhs = new Integer(fdjbh);
			Integer bhs = new Integer(bh);
			resultConfig = qqcFdjConfigService.delete(flbh, fdjbh, bh, pzlb);
			resultBs = qqcFdjBsService.delete(flbh, fdjbhs, bhs, pzlb);
			if(resultConfig == resultBs){
				return new JsonMessage(true,"删除成功！");
			}
		}
		return new JsonMessage(false,"删除失败！");		
	}
	
	//概述
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(String flbh,String fdjbh,String bh,Model model,String flag,String pzlb){
		if(null != flbh && "" != flbh && null != fdjbh && "" != fdjbh ){
			Integer fdjbhs = new Integer(fdjbh);
			//根据附录编号和发动机编号查询所有的对象
			List<QqcFdjConfig> configs = qqcFdjConfigService.findByFlbhAndFdjbhAndPzlb(flbh, fdjbhs,pzlb);
			//如果对象存在就放到model中
			if(null != configs && configs.size() > 0){
				model.addAttribute("lb","qqc");
				model.addAttribute("configs",configs);
				model.addAttribute("flbh",flbh);
				model.addAttribute("fdjbh",fdjbh);
				//火花塞
				if("HHS".equals(pzlb)){
					return "yzx/plan/appendix/fdj/sparkPlugTable";
				}
				//点火线圈
				if("DHXQXH".equals(pzlb)){
					return "yzx/plan/appendix/fdj/loopTable";
				}
				//电火电容器
				if("DHDRQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/capacityTable";
				}
				//增压器
				if("ZYQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/pressTable";
				}
				//空气滤清器
				if("KQLQQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/airCleanTable";
				}
				//中冷器
				if("ZLQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/interCoolTable";
				}
				//进气消音设备
				if("JQXSQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/silencerTable";
				}
				//曲轴箱
				if("QZX".equals(pzlb)){
					return "yzx/plan/appendix/fdj/crankTable";
				}
				//空气喷射系统
				if("KQPSXT".equals(pzlb)){
					return "yzx/plan/appendix/fdj/airJetTable";
				}
				//碳罐
				if("ZFPF".equals(pzlb)){
					return "yzx/plan/appendix/fdj/carbonTable";
				}
				//空气再循环
				if("EGR".equals(pzlb)){
					return "yzx/plan/appendix/fdj/airRecycleTable";
				}
				//OBD
				if("OBD".equals(pzlb)){
					return "yzx/plan/appendix/fdj/obdVersionTable";
				}
				//其他排放控制
				if("QTXT".equals(pzlb)){
					return "yzx/plan/appendix/fdj/otherTable";
				}
				//润滑油
				if("RHJ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/lubOilTable";
				}
				//润滑油泵
				if("RHYB".equals(pzlb)){
					return "yzx/plan/appendix/fdj/lubPumpTable";
				}
				//机油冷却器
				if("JYLQQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/oilCoolTable";
				}
				//隔音材料
				if("GYCL".equals(pzlb)){
					return "yzx/plan/appendix/fdj/soundTable";
				}
				//动力控制器
				if("HCU".equals(pzlb)){
					return "yzx/plan/appendix/fdj/elecPowerTable";
				}
				//电机控制器
				if("DJKZQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/motorContorlTable";
				}
				//高压空调
				if("GYKT".equals(pzlb)){
					return "yzx/plan/appendix/fdj/airConditionTable";
				}
				//电子真空泵
				if("DZZKB".equals(pzlb)){
					return "yzx/plan/appendix/fdj/elecPumpTable";
				}
				//电子助力转向系统
				if("DZZLZXZZ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/elecSteerTable";
				}
				//专用制动能量回收系统
				if("HSXT".equals(pzlb)){
					return "yzx/plan/appendix/fdj/stopTable";
				}
				//车载能源管理系统
				if("NYGLXT".equals(pzlb)){
					return "yzx/plan/appendix/fdj/vehiclePowerTable";
				}
			}else{
			//如果喷射集合不存在创建一个新的；
				QqcFdjConfig qqcFdjConfig1 = new QqcFdjConfig();
				qqcFdjConfig1.setFlbh(flbh);
				//Integer fdjbhs = new Integer(fdjbh);
				qqcFdjConfig1.setFdjbh(fdjbhs);
				model.addAttribute("car",qqcFdjConfig1);
				
				//打刻内容
				QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
				qqcFdjBs1.setFlbh(flbh);
				qqcFdjBs1.setFdjbh(fdjbhs);
				model.addAttribute("bs",qqcFdjBs1);
				//火花塞
				if("HHS".equals(pzlb)){
					return "yzx/plan/appendix/fdj/sparkPlug";
				}
				//点火线圈
				if("DHXQXH".equals(pzlb)){
					return "yzx/plan/appendix/fdj/loop";
				}
				//电火电容器
				if("DHDRQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/capacity";
				}
				//增压器
				if("ZYQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/press";
				}
				//空气滤清器
				if("KQLQQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/airClean";
				}
				//中冷器
				if("ZLQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/interCool";
				}
				//进气消音设备
				if("JQXSQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/silencer";
				}
				//曲轴箱
				if("QZX".equals(pzlb)){
					return "yzx/plan/appendix/fdj/crank";
				}
				//空气喷射系统
				if("KQPSXT".equals(pzlb)){
					return "yzx/plan/appendix/fdj/airJet";
				}
				//碳罐
				if("ZFPF".equals(pzlb)){
					return "yzx/plan/appendix/fdj/carbon";
				}
				//空气再循环
				if("EGR".equals(pzlb)){
					return "yzx/plan/appendix/fdj/airRecycle";
				}
				//OBD
				if("OBD".equals(pzlb)){
					return "yzx/plan/appendix/fdj/obdVersion";
				}
				//其他排放控制
				if("QTXT".equals(pzlb)){
					return "yzx/plan/appendix/fdj/other";
				}
				//润滑油
				if("RHJ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/lubOil";
				}
				//润滑油泵
				if("RHYB".equals(pzlb)){
					return "yzx/plan/appendix/fdj/lubPump";
				}
				//机油冷却器
				if("JYLQQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/oilCool";
				}
				//隔音材料
				if("GYCL".equals(pzlb)){
					return "yzx/plan/appendix/fdj/sound";
				}
				//动力控制器
				if("HCU".equals(pzlb)){
					return "yzx/plan/appendix/fdj/elecPower";
				}
				//电机控制器
				if("DJKZQ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/motorContorl";
				}
				//高压空调
				if("GYKT".equals(pzlb)){
					return "yzx/plan/appendix/fdj/airCondition";
				}
				//电子真空泵
				if("DZZKB".equals(pzlb)){
					return "yzx/plan/appendix/fdj/elecPump";
				}
				//电子助力转向系统
				if("DZZLZXZZ".equals(pzlb)){
					return "yzx/plan/appendix/fdj/elecSteer";
				}
				//专用制动能量回收系统
				if("HSXT".equals(pzlb)){
					return "yzx/plan/appendix/fdj/stop";
				}
				//车载能源管理系统
				if("NYGLXT".equals(pzlb)){
					return "yzx/plan/appendix/fdj/vehiclePower";
				}
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
			QqcFdjConfig qqcFdjConfig = qqcFdjConfigService.findByFlbhAndFdjbhAndBhAndPzlb(flbh,fdjbhs,bhs,pzlb);
			QqcFdjBs qqcFdjBs = qqcFdjBsService.findByFlbhAndFdjbhAndBhAndPzlb(flbh, fdjbhs, bhs, pzlb);
			if(null != qqcFdjConfig ){
				model.addAttribute("car",qqcFdjConfig);
				model.addAttribute("bs",qqcFdjBs);
				if(null != flag){
					model.addAttribute("flag",true);
				}
			}
		}else{
			QqcFdjConfig qqcFdjConfig1 = new QqcFdjConfig();
			qqcFdjConfig1.setFlbh(flbh);
			qqcFdjConfig1.setFdjbh(fdjbhs);
			
			QqcFdjBs qqcFdjBs1 = new QqcFdjBs();
			qqcFdjBs1.setFlbh(flbh);
			qqcFdjBs1.setFdjbh(fdjbhs);
			model.addAttribute("bs",qqcFdjBs1);
			model.addAttribute("car",qqcFdjConfig1);
		}
		//火花塞
		if("HHS".equals(pzlb)){
			return "yzx/plan/appendix/fdj/sparkPlug";
		}
		//点火线圈
		if("DHXQXH".equals(pzlb)){
			return "yzx/plan/appendix/fdj/loop";
		}
		//电火电容器
		if("DHDRQ".equals(pzlb)){
			return "yzx/plan/appendix/fdj/capacity";
		}
		//增压器
		if("ZYQ".equals(pzlb)){
			return "yzx/plan/appendix/fdj/press";
		}
		//空气滤清器
		if("KQLQQ".equals(pzlb)){
			return "yzx/plan/appendix/fdj/airClean";
		}
		//中冷器
		if("ZLQ".equals(pzlb)){
			return "yzx/plan/appendix/fdj/interCool";
		}
		//进气消音设备
		if("JQXSQ".equals(pzlb)){
			return "yzx/plan/appendix/fdj/silencer";
		}
		//曲轴箱
		if("QZX".equals(pzlb)){
			return "yzx/plan/appendix/fdj/crank";
		}
		//空气喷射系统
		if("KQPSXT".equals(pzlb)){
			return "yzx/plan/appendix/fdj/airJet";
		}
		//碳罐
		if("ZFPF".equals(pzlb)){
			return "yzx/plan/appendix/fdj/carbon";
		}
		//空气再循环
		if("EGR".equals(pzlb)){
			return "yzx/plan/appendix/fdj/airRecycle";
		}
		//OBD
		if("OBD".equals(pzlb)){
			return "yzx/plan/appendix/fdj/obdVersion";
		}
		//其他排放控制
		if("QTXT".equals(pzlb)){
			return "yzx/plan/appendix/fdj/other";
		}
		//润滑油
		if("RHJ".equals(pzlb)){
			return "yzx/plan/appendix/fdj/lubOil";
		}
		//润滑油泵
		if("RHYB".equals(pzlb)){
			return "yzx/plan/appendix/fdj/lubPump";
		}
		//机油冷却器
		if("JYLQQ".equals(pzlb)){
			return "yzx/plan/appendix/fdj/oilCool";
		}
		//隔音材料
		if("GYCL".equals(pzlb)){
			return "yzx/plan/appendix/fdj/sound";
		}
		//动力控制器
		if("HCU".equals(pzlb)){
			return "yzx/plan/appendix/fdj/elecPower";
		}
		//电机控制器
		if("DJKZQ".equals(pzlb)){
			return "yzx/plan/appendix/fdj/motorContorl";
		}
		//高压空调
		if("GYKT".equals(pzlb)){
			return "yzx/plan/appendix/fdj/airCondition";
		}
		//电子真空泵
		if("DZZKB".equals(pzlb)){
			return "yzx/plan/appendix/fdj/elecPump";
		}
		//电子助力转向系统
		if("DZZLZXZZ".equals(pzlb)){
			return "yzx/plan/appendix/fdj/elecSteer";
		}
		//专用制动能量回收系统
		if("HSXT".equals(pzlb)){
			return "yzx/plan/appendix/fdj/stop";
		}
		//车载能源管理系统
		if("NYGLXT".equals(pzlb)){
			return "yzx/plan/appendix/fdj/vehiclePower";
		}
		return null;
	}
	
}
