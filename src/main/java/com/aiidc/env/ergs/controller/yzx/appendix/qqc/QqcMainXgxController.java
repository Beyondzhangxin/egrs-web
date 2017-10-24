/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix.qqc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMainXgx;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.QqcMainXgxService;

/**
 * @author jiabin fan
 *	轻型汽油车悬挂系
 */
@Controller
@RequestMapping("ergs")
public class QqcMainXgxController {
	@Autowired
	private QqcMainXgxService qqcMainXgxService;
	
	//添加悬挂系；
	@RequestMapping(value = "/yzx/cgx/add",method = RequestMethod.POST)
	public void addXgx(QqcMainXgx qqcMainXgx){
		qqcMainXgxService.addQqcMainXgx(qqcMainXgx);
	}
	
	//根据附录编号查询所有悬挂系
	@RequestMapping(value = "/yzx/cgx/findAllXgx",method = RequestMethod.POST)
	@ResponseBody
	public List<QqcMainXgx> findAllXgx(String flbh){
		return qqcMainXgxService.findByFlbh(flbh);
	}
	
	//修改悬挂系
	@RequestMapping(value = "/yzx/cgx/updateXgx",method = RequestMethod.POST)
	public void updateXgx(String flbh,Integer bh){
		QqcMainXgx xgx = qqcMainXgxService.findByFlbhAndBh(flbh, bh);
		qqcMainXgxService.updateQqcMainXgx(xgx);
	}
	
	//删除悬挂系
	@RequestMapping(value = "/yzx/cgx/deleteXgx",method = RequestMethod.POST)
	public void deleteXgx(String flbh,Integer bh){
		qqcMainXgxService.deleteQqcMainXgx(flbh, bh);
	}
	
}
