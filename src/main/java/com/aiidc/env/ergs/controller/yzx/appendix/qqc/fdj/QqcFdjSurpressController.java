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
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjBs;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjConfig;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjJqxt;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjBsService;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjConfigService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs/yzx/plan/appendix/qqc/fdj/surpress")
public class QqcFdjSurpressController {
	@Autowired
	private QqcFdjConfigService qqcFdjConfigService;
	@Autowired
	private QqcFdjBsService qqcFdjBsService;
	//新增
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage add(QqcFdjConfig qqcFdjConfig,QqcFdjBs qqcFdjBs){
		//保存发动机配置；
		int resultConfig = qqcFdjConfigService.add(qqcFdjConfig);
		//获取保存过的qqcFdjConfig
		QqcFdjConfig qqcFdjConfig2 = qqcFdjConfigService.just(qqcFdjConfig);
		//获取编号；
		Integer bh = qqcFdjConfig2.getBh();
		qqcFdjBs.setBh(bh);
		//保存打刻内容
		int resultBs = qqcFdjBsService.add(qqcFdjBs);
		if(resultConfig == resultBs){
			return new JsonMessage(true,"保存成功！");
		}else{
			return new JsonMessage(false,"保存失败！");
		}
	}
	//删除
	@RequestMapping(value = "/delet",method=RequestMethod.POST)
	@ResponseBody
	public JsonMessage delete(String flbh, Integer fdjbh,Integer bh,String pzlb){
		int resultBs = qqcFdjBsService.delete(flbh, fdjbh, bh, pzlb);
		int resultConfig = qqcFdjConfigService.delete(flbh, fdjbh, bh, pzlb);
		if(resultConfig == resultBs){
			return new JsonMessage(true,"保存成功！");
		}else{
			return new JsonMessage(false,"保存失败！");
		}
	}

}
