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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjZhqs;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjZhqsService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs")
public class QqcFdjZhqsController {
	@Autowired
	private QqcFdjZhqsService qqcFdjZhqsService;
	//添加
	@RequestMapping(value="/yzx/fdjZhqs/add",method= RequestMethod.POST)
	public void addCdx(QqcFdjZhqs qqcfdjZhqs){
		qqcFdjZhqsService.add(qqcfdjZhqs);
	}
	
	
	
	//修改
	@RequestMapping(value="/yzx/fdjZhqs/update",method= RequestMethod.POST)
	public void updateCdx(String flbh,Integer bh,Integer fdjbh){
		//查询出附录编号和编号所对应的传动系；
		QqcFdjZhqs fdjZhqs = qqcFdjZhqsService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
		//修改传动系；
		qqcFdjZhqsService.update(fdjZhqs);
	}
	
	
	//删除
	@RequestMapping(value = "/yzx/fdjZhqs/delet",method = RequestMethod.POST)
	public void deleteCdx(QqcFdjZhqs qqcfdjZhqs){
		qqcFdjZhqsService.delete(qqcfdjZhqs);
	}
	
	//查询一个
	@RequestMapping(value = "/yzx/fdjZhqs/findone",method = RequestMethod.POST)
	@ResponseBody
	public QqcFdjZhqs findOne(String flbh,Integer bh,Integer fdjbh){
		return qqcFdjZhqsService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
	}
	
	//查询所有
	@RequestMapping(value = "/yzx/fdjZhqs/findAll",method = RequestMethod.POST)
	@ResponseBody
	public List<QqcFdjZhqs> findAll(String flbh,Integer fdjbh){
		return qqcFdjZhqsService.findByFlbhAndFdjbh(flbh,fdjbh);
	}
}
