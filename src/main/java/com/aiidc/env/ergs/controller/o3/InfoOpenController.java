/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.controller.o3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.common.util.SpringContextUtil;
import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.constant.InforPub;
import com.aiidc.env.ergs.constant.Type;
import com.aiidc.env.ergs.jpa.po.o3.E3Sbb;
import com.aiidc.env.ergs.jpa.po.o3.E3SbbMx;
import com.aiidc.env.ergs.jpa.po.o3.E3SbbXzmx;
import com.aiidc.env.ergs.jpa.po.o3.E3Vehicles;
import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.service.o3.FilterService;
import com.aiidc.env.ergs.service.o3.InforPubService;
import com.aiidc.env.ergs.service.o3.MixReportService;
import com.aiidc.env.ergs.service.o3.ReportDetailService;
import com.aiidc.env.ergs.service.o3.ReportService;
import com.aiidc.env.ergs.service.o3.SbbConfigService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;

/**
 * @author wuwenjun
 *
 */
@Controller
@RequestMapping("ergs/o3/infoOpen")
public class InfoOpenController {
	@Resource
	private InforPubService inforPubService;
	@Resource
	private ReportService reportService;
	private Map<Integer,List> map;
	private Map<Integer,List> lastMap ;
	@Resource
	private FilterService filterService;
	@Resource 
	private MixReportService mixReportService;
	private List vehicleList;
	private List reportList;
	
	//信息公开初始页；
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		
		return "o3/infoOpen/index";
	}
	//分页显示；
	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public String find( String clxh, String fdjxh, String xzmc,QryPageVo qryVo,Model model) {
		//获取manufid
		User user = (User) LoginUserUtil.getLoginUser().getDetail();
		String manufid = user.getManufid();
		PageRequest pageRequest = qryVo.pageRequest();
		Page<E3Vehicles> page = inforPubService.findInfor(manufid,clxh,fdjxh,xzmc,pageRequest);
		List<E3Vehicles> content = page.getContent();
		model.addAttribute("page",page);
		return "o3/infoOpen/table";
	}

	@RequestMapping(value = "{path}", method = RequestMethod.GET)
	public String value(@PathVariable String path) {
		return "o3/infoOpen/" + path;
	}
	//创建信息公开
	@RequestMapping(value="/infoCreate",method=RequestMethod.GET)
	public String create(Long cxid,Model model){
		//根据xcid获取值；
		E3Vehicles e3Vehicles = inforPubService.findByCxid(cxid);
		model.addAttribute("e3Vehicles",e3Vehicles);
		
		return "o3/infoOpen/infoCreate";
	}
	//搜索报告
	@RequestMapping(value="/infoNext",method = RequestMethod.GET)
	public String next(InforPub inforPub,Model model){
		map = new HashMap<Integer,List>();
		//存放infoPub 和 vehicle;
		vehicleList = new ArrayList();
		//根据车辆类别获取配置列表
		String cllb = inforPub.getCllb();
		//查询车辆信息；
		E3Vehicles vehicle = inforPubService.findByCxid(inforPub.getCxid());
		vehicleList.add(inforPub);
		vehicleList.add(vehicle);
		 map = reportService.getReport(cllb,vehicle,inforPub.getPf());
		model.addAttribute("map",map);
		model.addAttribute("info",inforPub);
		return "o3/infoOpen/infoNext";
	}
	//企业信息填写
	@RequestMapping(value="/infoMessage",method=RequestMethod.GET)
	public String message(String id,Model model){
		//保存vehicle信息E3_SBB
		InforPub inforPub = (InforPub) vehicleList.get(0);
		E3Vehicles vehicle = (E3Vehicles) vehicleList.get(1);
		//保存Sbb
		E3Sbb e3Sbb = new E3Sbb();
		inforPubService.saveSbb(e3Sbb,inforPub,vehicle);
		//保存CXMX
		E3SbbXzmx e3SbbXzmx = new E3SbbXzmx();
		inforPubService.saveSbbXzmx(e3SbbXzmx,inforPub,vehicle);
		//保存SbbMx
		E3SbbMx e3SbbMx = new E3SbbMx();
		inforPubService.saveSbbMx(e3SbbMx,inforPub,vehicle,(Map)reportList.get(new Integer(id)));
		//保存e3SbbConfig
		String cltype = Type.backShort(inforPub.getCllb());
		SbbConfigService sbbConfigService = getSbbConfigService(cltype);
		sbbConfigService.save(inforPub, vehicle,(Map)reportList.get(new Integer(id)));
		model.addAttribute("sbbh",vehicle.getNewsbbh());
		return "o3/infoOpen/infoMessage";
	}
	//校验
	@RequestMapping(value="/filter",method = RequestMethod.GET)
	@ResponseBody
	public JsonMessage filter(String[] ids,String pf,String vehicle){
		 lastMap = new HashMap<Integer,List>();
		//创建一个list存放jybgbh
		List jybgList = new ArrayList<String>();
		//用于存放只需要单个报告的配置；
		List keyList = new ArrayList<Integer>();
		//根据ids获取用户选择的后的配置；
		for (String id : ids) {
			String[] nums = id.split(":");
			String jybgbh = nums[0];
			Integer key = new Integer(nums[2]);
			Integer pzbh = new Integer(nums[1]);
			int index = new Integer(nums[3]);
			keyList.add(key);
			//遍历map赋值给lastMap;
			List configList = (List) map.get(key);
			//按照jybgbh和pzbh获得单个配置
			for (int i = 0; i < configList.size(); i++) {
				if(index != i){
					configList.remove(i);
				}
			}
			lastMap.put(key, configList);
			jybgList.add(jybgbh);
		}
		//遍历原始map
		for (Integer key : map.keySet()) {
			if(!keyList.contains(key)){
				lastMap.put(key,map.get(key));
			}
		}
		//校验
		
		//return filterService.filter(lastMap,pf,vehicle,jybgList);
		return new JsonMessage(true,"");
	}
	//企业信息填写
	@RequestMapping(value="/infoSuccess",method=RequestMethod.GET)
	public String success(String wz,String sbbh){
		//根据sbbh查询E3_Sbb
		inforPubService.savewz(wz,sbbh);
		return "o3/infoOpen/infoSuccess";
	}
	//确认配置
	@RequestMapping(value="/infoMakeSure",method=RequestMethod.GET)
	public String sure(String[] ids,String pf,String vehicle,Model model){
		reportList = new ArrayList();
		//混合报告；
		 reportList = mixReportService.mix(lastMap,pf,vehicle);
		//
		model.addAttribute("configList",reportList);
		return "o3/infoOpen/infoMakeSure";
	}
	
	/**
	 * 返回具体的Service
	 * @param cltype
	 * @return
	 */
	public SbbConfigService getSbbConfigService(String cltype) {
		SbbConfigService sbbConfigService;
		try {
			sbbConfigService = SpringContextUtil.getBean(cltype + "SbbConfigService",
					SbbConfigService.class);
		} catch (BeansException e) {
			sbbConfigService = SpringContextUtil.getBean("sbbConfigService", SbbConfigService.class);
		}
		return sbbConfigService;
	}
}
