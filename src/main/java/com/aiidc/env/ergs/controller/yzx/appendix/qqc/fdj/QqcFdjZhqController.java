/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix.qqc.fdj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjZhq;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjZhqService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs")
public class QqcFdjZhqController {
	@Autowired
	private QqcFdjZhqService qqcFdjZhqService;
	//添加
	@RequestMapping(value="/yzx/fdjZhq/add",method= RequestMethod.POST)
	public void addCdx(QqcFdjZhq qqcfdjZhq){
		qqcFdjZhqService.add(qqcfdjZhq);
	}
	
	
	
	//修改
	@RequestMapping(value="/yzx/fdjZhq/update",method= RequestMethod.POST)
	public void updateCdx(String flbh,Integer bh,Integer fdjbh){
		//查询出附录编号和编号所对应的传动系；
		QqcFdjZhq fdjZhq = qqcFdjZhqService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
		//修改传动系；
		qqcFdjZhqService.update(fdjZhq);
	}
	
	
	//删除
	@RequestMapping(value = "/yzx/fdjZhq/delet",method = RequestMethod.POST)
	public void deleteCdx(QqcFdjZhq qqcfdjZhq){
		qqcFdjZhqService.delete(qqcfdjZhq);
	}
	
	//查询一个
	@RequestMapping(value = "/yzx/fdjZhq/findone",method = RequestMethod.POST)
	@ResponseBody
	public QqcFdjZhq findOne(String flbh,Integer bh,Integer fdjbh){
		return qqcFdjZhqService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
	}
	
	//查询所有
	@RequestMapping(value = "/yzx/fdjZhq/findAll",method = RequestMethod.POST)
	@ResponseBody
	public List<QqcFdjZhq> findAll(String flbh,Integer fdjbh){
		return qqcFdjZhqService.findByFlbhAndFdjbh(flbh,fdjbh);
	}
}
