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

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjPyb;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjPybService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("ergs")
public class QqcFdjPybController {
	@Autowired
	private QqcFdjPybService qqcFdjPybService;
	//添加
	@RequestMapping(value="/yzx/fdjPyb/add",method= RequestMethod.POST)
	public void addCdx(QqcFdjPyb qqcfdjPyb){
		qqcFdjPybService.add(qqcfdjPyb);
	}
	
	
	
	//修改
	@RequestMapping(value="/yzx/fdjPyb/update",method= RequestMethod.POST)
	public void updateCdx(String flbh,Integer bh,Integer fdjbh){
		//查询出附录编号和编号所对应的传动系；
		QqcFdjPyb fdjPyb = qqcFdjPybService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
		//修改传动系；
		qqcFdjPybService.update(fdjPyb);
	}
	
	
	//删除
	@RequestMapping(value = "/yzx/fdjPyb/delet",method = RequestMethod.POST)
	public void deleteCdx(QqcFdjPyb qqcfdjPyb){
		qqcFdjPybService.delete(qqcfdjPyb);
	}
	
	//查询一个
	@RequestMapping(value = "/yzx/fdjPyb/findone",method = RequestMethod.POST)
	@ResponseBody
	public QqcFdjPyb findOne(String flbh,Integer bh,Integer fdjbh){
		return qqcFdjPybService.findByFlbhAndFdjbhAndBh(flbh, fdjbh, bh);
	}
	
	//查询所有
	@RequestMapping(value = "/yzx/fdjPyb/findAll",method = RequestMethod.POST)
	@ResponseBody
	public List<QqcFdjPyb> findAll(String flbh,Integer fdjbh){
		return qqcFdjPybService.findByFlbhAndFdjbh(flbh,fdjbh);
	}
}
