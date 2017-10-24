/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.yzx.appendix.qqc.fdj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.fdj.QqcFdjZhqDy;
import com.aiidc.env.ergs.service.yzx.appendix.qqc.fdj.QqcFdjZhqDyService;

/**
 * @author jiabin fan
 *
 */
@Controller
@RequestMapping("egrs/yzx/qqc/fdj")
public class QqcFdjZhqDyController {
	@Resource
	private QqcFdjZhqDyService qqcFdjZhqDyService;
	
	//添加
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public void add(QqcFdjZhqDy qqcFdjZhqDy){
		qqcFdjZhqDyService.add(qqcFdjZhqDy);
	}
	//修改
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public void update(String flbh, Integer fdjbh, Integer bh, Integer zhqbh){
		QqcFdjZhqDy qqcFdjZhqDy = qqcFdjZhqDyService.findByFlbhAndFdjbhAndBhAndZhqbh(flbh, fdjbh, bh, zhqbh);
		qqcFdjZhqDyService.update(qqcFdjZhqDy);
	}
	//删除
	@RequestMapping(value = "/del",method = RequestMethod.POST)
	public void delete(QqcFdjZhqDy qqcFdjZhqDy){
		qqcFdjZhqDyService.delete(qqcFdjZhqDy);
	}
	//查询一个
	@RequestMapping(value = "/findone",method = RequestMethod.POST)
	public QqcFdjZhqDy findone(String flbh, Integer fdjbh, Integer bh, Integer zhqbh){
		return qqcFdjZhqDyService.findByFlbhAndFdjbhAndBhAndZhqbh(flbh, fdjbh, bh, zhqbh);
	}
	//查询多个
	@RequestMapping(value = "/findAll",method = RequestMethod.POST)
	public List<QqcFdjZhqDy> findAll(String flbh, Integer fdjbh, Integer zhqbh){
		return qqcFdjZhqDyService.findByFlbhAndFdjbhAndZhqbh(flbh, fdjbh, zhqbh);
	}
}
