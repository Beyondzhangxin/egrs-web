/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.BeansException;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.common.util.SpringContextUtil;
import com.aiidc.env.ergs.common.util.StringUtil;
import com.aiidc.env.ergs.constant.Type;
import com.aiidc.env.ergs.jpa.po.o3.E3Te;
import com.aiidc.env.ergs.jpa.po.o3.E3Vehicles;
import com.aiidc.env.ergs.jpa.po.o3.Report;
import com.aiidc.env.ergs.jpa.repo.o3.E3FlmxtDao;
import com.aiidc.env.ergs.jpa.repo.o3.E3RenameDao;
import com.aiidc.env.ergs.jpa.repo.o3.E3TeDao;
import com.aiidc.env.ergs.jpa.repo.o3.ReportDao;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainCwDao;
import com.aiidc.env.ergs.service.o3.PartReportService;
import com.aiidc.env.ergs.service.o3.ReportDetailService;
import com.aiidc.env.ergs.service.o3.ReportService;
import com.aiidc.env.ergs.service.pw.util.LoginUserUtil;

/**
 * @author wuwenjun
 *
 */
@Service
public class ReportServiceImpl implements ReportService {
	//基准报告
	@Resource
	private ReportDao dao;
	//视同报告
	@Resource
	private E3TeDao e3TeDao;
	//发动机新名字
	@Resource
	private E3RenameDao e3RenameDao;
	//附录明细
	@Resource
	private E3FlmxtDao e3FlmxDao;
	@Resource
	private QqcMainCwDao qqcMainCwDao;
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.service.o3.ReportService#find(com.aiidc.env.ergs.
	 * common.manager.QryPageVo, com.aiidc.env.ergs.jpa.po.o3.Report)
	 */
	@Override
	public Page<Report> find(QryPageVo qryVo, Report item) {
		Specification<Report> spec = new Specification<Report>() {
			@Override
			public Predicate toPredicate(Root<Report> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				if (StringUtils.hasText(item.getJybgbh())) {
					list.add(cb.like(root.get("jybgbh"), "%" + item.getJybgbh() + "%"));
				}
				if (StringUtils.hasText(item.getCpxh())) {
					list.add(cb.like(root.get("cpxh"), "%" + item.getCpxh() + "%"));
				}
				if (StringUtils.hasText(item.getFdjxh())) {
					list.add(cb.like(root.get("fdjxh"), "%" + item.getFdjxh() + "%"));
				}
				return cb.and(list.toArray(new Predicate[list.size()]));
			}
		};

		return dao.findAll(spec, qryVo.pageRequest());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aiidc.env.ergs.service.o3.ReportService#getDetailService(java.lang.
	 * String)
	 */
	@Override
	public ReportDetailService getDetailService(String jybgbh) {
		ReportDetailService service;
		try {
			service = SpringContextUtil.getBean(jybgbh.substring(8, 11).toLowerCase() + "ReportDetailService",
					ReportDetailService.class);
		} catch (BeansException e) {
			service = SpringContextUtil.getBean("reportDetailService", ReportDetailService.class);
		}
		return service;
	}

	/* 
	 * 获取报告
	 */
	@Override
	public Map getReport(String cllb,E3Vehicles vehicle,String pf) {
    	String fdjcs = "";
		//用于存放配置列表
    	Map mapjz = new HashMap<String,List<Object>>();
		//根据cllb获取车辆代号；
		int vehicleType = Type.strToint(cllb);
		if (vehicleType == Type.VEHICLE_ZCJ ||
	        vehicleType == Type.VEHICLE_ZQJ ||
	        vehicleType == Type.VEHICLE_NGJ ||
	        vehicleType == Type.VEHICLE_LPGJ ||
	        vehicleType == Type.VEHICLE_RQJ ||
	        vehicleType == Type.VEHICLE_NYJ  ) {
				 //发动机基准报告
			     // loadFdjConfigTA();
			     //发动机视同报告
			      //loadFdjConfigTE();
		}else{
	        if (vehicleType == Type.VEHICLE_CYJ || vehicleType == Type.VEHICLE_XTJ) {
	        	//发动机报告
	        	//loadFdjConfigFDL(); 
	        }else {
	          //车辆基准报告；
	          //根据发动机生产厂获取最新的发动机生产厂名称；
	        	String newFdjscc = e3RenameDao.findByOnameOrNname(vehicle.getFdjscc());
	        	if(null != newFdjscc){
	        		fdjcs = newFdjscc;
	        	}else{
	        		fdjcs = vehicle.getFdjscc();
	        	}
	        	//用于存放检验报告
	        	ArrayList<String> jybgs = new ArrayList<String>();
	          //获取检验报告编号
	        	 loadTa(cllb, vehicle, pf, vehicleType, fdjcs,mapjz,jybgs);
	          //载入视同报告；
				  /**使用的视同报告编号,主键是基准检验报告编号**/
				  // HashMap jybgbhhm=new HashMap();
				  //视同编号编号-基准检验报告标号
				  // HashMap stjz=new HashMap();
				  //视同报告编号－视同车型编号
				   //HashMap stbh=new HashMap();
				   //loadTe(vehicle.getClmc(),vehicle.getClxh(),vehicle.getFdjxh(),vehicleType,pf,newFdjscc,mapjz,jybgs,jybgbhhm,stjz,stbh);
	        }
	    }
		return mapjz;
	}

	/**
	 * @param cllb
	 * @param vehicle
	 * @param pf
	 * @param vehicleType
	 * @param newFdjscc
	 */
	public Map loadTa(String cllb, E3Vehicles vehicle, String pf, int vehicleType, String newFdjscc,Map mapjz,List jybgs) {
		String manufid = LoginUserUtil.getLoginUserDetail().getManufid();
		List<String> jybgbhs = dao.findJybgbh(vehicle.getClxh(),vehicle.getClmc(),vehicle.getFdjxh(),newFdjscc,cllb,manufid);
		
		//载入基准报告；
		for (String jybgbh : jybgbhs) {
			//判断报告是否可以载入；
			if(canload(jybgbh,vehicleType,pf)){
				if(!jybgs.contains(jybgbh)){
					jybgs.add(jybgbh);
				}
				String k = jybgbh.substring(8, 11).toLowerCase();
				PartReportService service = SpringContextUtil.getBean(k + "PartReportService",PartReportService.class);
				List reportList = service.findByJybgbh(jybgbh);
				int configType = Type.configType(jybgbh);
				//String name = Type.configName(configType);
				mapjz.put(configType, reportList);
				
			}
		}
		return mapjz;
	}
	/**
	 * @param cllb
	 * @param vehicle
	 * @param pf
	 * @param vehicleType
	 * @param newFdjscc
	 */
	/*public void loadTe(String clmc, String clxh, String fdjxh, int vehicleType, String pf,String newFdjscc,Map map,List jybgs,HashMap jybgbhhm,HashMap stjz,HashMap stbh) {
		String manufid = LoginUserUtil.getLoginUserDetail().getManufid();
		int newVehicleType = 0;
		if(vehicleType > 10){
			newVehicleType = StringUtil.Chr(vehicleType);
		}else{
			newVehicleType = vehicleType;
		}
		List<E3Te> e3tes = e3TeDao.findJybgbh(clxh,clmc,fdjxh,newFdjscc,manufid,newVehicleType);
		
		//载入视同报告；
		for (E3Te e3te : e3tes) {
			//判断报告是否可以载入；
			String jybgbh = e3te.getJybgbh();
			String jzjybgbh = e3te.getJzjybgbh();
			Integer bh = e3te.getBh();
			if(canload(jybgbh,newVehicleType,pf)){
		          jybgbhhm.put(jzjybgbh, jybgbh + bh);
		          stbh.put(jybgbh, bh);
		          stjz.put(jybgbh, jzjybgbh);
		          if (!jybgs.contains(jybgbh)){
		        	  jybgs.add(jybgbh);
		        	  String k = jybgbh.substring(8, 11);
		        	  PartReportService service = SpringContextUtil.getBean(k + "PartReportService",PartReportService.class);
		        	  List<Object> reportList = service.findByJybgbh(jybgbh);
		        	  int configType = Type.configType(jybgbh);
		        	  mapjz.put(configType, reportList);
		          }
			}
		}
	}*/

	/**
	 * @param jybgbh
	 */
	private boolean canload(String jybgbh, int type,String pf) {

	    if (jybgbh.substring(0,1).equals("W")) {
	    	//小批量报告暂时不允许  因为现在不人工审核
	        return false;
	    }
	    
	    if (jybgbh.substring(10,11).equals("3"))//如果是轻型汽油车才考虑  因为轻型汽油车用国5附录出过国4报告，所以需要特殊处理过滤下
	    {
		    if (jybgbh.equals("G403-TA_NJ3-069382")|| jybgbh.equals("G403-TA_NJ3-071812")|| jybgbh.equals("G403-TA_NJ3-072255")||
		    	jybgbh.equals("G403-TA_NJ3-073859")|| jybgbh.equals("G403-TA_OB3-069383")|| jybgbh.equals("G403-TA_OB3-071817")||
		    	jybgbh.equals("G403-TA_OB3-072258")|| jybgbh.equals("G403-TA_PQ3-069377")|| jybgbh.equals("G403-TA_PQ3-071810")||
		    	jybgbh.equals("G403-TA_PQ3-072233")|| jybgbh.equals("G403-TA_PQ3-072451")|| jybgbh.equals("G403-TA_PQ3-072463")||
		    	jybgbh.equals("G403-TA_PQ3-073814")|| jybgbh.equals("G403-TA_PQ3-073818")|| jybgbh.equals("G403-TA_PQ3-075987")||
		    	jybgbh.equals("G403-TA_QZ3-069378")|| jybgbh.equals("G403-TA_QZ3-071819")|| jybgbh.equals("G403-TA_QZ3-072243")|| jybgbh.equals("G403-TA_QZ3-072455")|| jybgbh.equals("G403-TA_QZ3-072466")||
		    	jybgbh.equals("G403-TA_QZ3-073841")|| jybgbh.equals("G403-TA_QZ3-073844")|| jybgbh.equals("G403-TA_QZ3-075992")||
		    	jybgbh.equals("G403-TA_QZ3-077470")|| jybgbh.equals("G403-TA_RY3-069386")|| jybgbh.equals("G403-TA_RY3-071820")||
	    		jybgbh.equals("G403-TA_RY3-072245")|| jybgbh.equals("G403-TA_RY3-073825")|| jybgbh.equals("G403-TA_RY3-073846")||
		    	jybgbh.equals("G403-TA_RY3-075995")|| jybgbh.equals("G403-TA_SD3-069379")||jybgbh.equals("G403-TA_SD3-071821")||
		    	jybgbh.equals("G403-TA_SD3-072251")|| jybgbh.equals("G403-TA_SD3-072459")||jybgbh.equals("G403-TA_SD3-072468")||
		    	jybgbh.equals("G403-TA_SD3-073833")|| jybgbh.equals("G403-TA_SD3-073835")||jybgbh.equals("G403-TA_SD3-073836")||
		    	jybgbh.equals("G403-TA_SD3-073838")|| jybgbh.equals("G403-TA_SD3-073848")||jybgbh.equals("G403-TA_SD3-075998")||
		    	jybgbh.equals("G403-TA_YH3-069384")|| jybgbh.equals("G403-TA_YH3-071823")||jybgbh.equals("G403-TA_YH3-072253")||
	    		jybgbh.equals("G403-TA_YH3-072462")|| jybgbh.equals("G403-TA_YH3-072470")||jybgbh.equals("G403-TA_YH3-073839")||
	    		jybgbh.equals("G403-TA_YH3-073856")|| jybgbh.equals("G403-TA_YH3-076000")||jybgbh.equals("G403-TE_NJ3-069388")||
	    		jybgbh.equals("G403-TE_NJ3-069397")|| jybgbh.equals("G403-TE_NJ3-072364")||jybgbh.equals("G403-TE_NJ3-072452")||
	    		jybgbh.equals("G403-TE_NJ3-072464")|| jybgbh.equals("G403-TE_NJ3-073878")||jybgbh.equals("G403-TE_NJ3-073883")||
	    		jybgbh.equals("G403-TE_NJ3-073886")|| jybgbh.equals("G403-TE_NJ3-075989")||jybgbh.equals("G403-TE_NJ3-085048")||
	    		jybgbh.equals("G403-TE_OB3-069389")|| jybgbh.equals("G403-TE_OB3-069398")||jybgbh.equals("G403-TE_OB3-072365")||
	    		jybgbh.equals("G403-TE_OB3-072454")|| jybgbh.equals("G403-TE_OB3-072465")||jybgbh.equals("G403-TE_OB3-073863")||
	    		jybgbh.equals("G403-TE_OB3-073880")|| jybgbh.equals("G403-TE_OB3-075991")||jybgbh.equals("G403-TE_OB3-085049")||
	    		jybgbh.equals("G403-TE_PQ3-069387")|| jybgbh.equals("G403-TE_PQ3-069396")||jybgbh.equals("G403-TE_PQ3-072278")||
	    		jybgbh.equals("G403-TE_PQ3-085047")|| jybgbh.equals("G403-TE_QZ3-069390")||jybgbh.equals("G403-TE_QZ3-069399")||
	    		jybgbh.equals("G403-TE_QZ3-072286")|| jybgbh.equals("G403-TE_QZ3-072456")||jybgbh.equals("G403-TE_QZ3-085050")||
	    		jybgbh.equals("G403-TE_RY3-069380")|| jybgbh.equals("G403-TE_RY3-069391")||jybgbh.equals("G403-TE_RY3-069401")||
	    		jybgbh.equals("G403-TE_RY3-072362")|| jybgbh.equals("G403-TE_RY3-072458")||jybgbh.equals("G403-TE_RY3-072467")||
	    		jybgbh.equals("G403-TE_RY3-085051")|| jybgbh.equals("G403-TE_SD3-069392")||jybgbh.equals("G403-TE_SD3-069400")||
	    		jybgbh.equals("G403-TE_SD3-072297")|| jybgbh.equals("G403-TE_SD3-072460")||jybgbh.equals("G403-TE_SD3-085053")||
	    		jybgbh.equals("G403-TE_YH3-069394")|| jybgbh.equals("G403-TE_YH3-069395")||jybgbh.equals("G403-TE_YH3-072363")||
	    		jybgbh.equals("G403-TE_YH3-085055")|| jybgbh.equals("G403-TE_YH3-085834")||jybgbh.equals("G403-TE_YH3-085868")||
	    		jybgbh.equals("G403-TE_YH3-086624")|| jybgbh.equals("G403-TE_YH3-086625")||jybgbh.equals("G403-TE_YH3-086626")||
	    		jybgbh.equals("G403-TE_YH3-086627")|| jybgbh.equals("G403-TE_YH3-086628")||jybgbh.equals("G403-TE_YH3-086629")||
	    		jybgbh.equals("G403-TE_YH3-086631")|| jybgbh.equals("G403-TE_YH3-086632")||jybgbh.equals("G403-TE_YH3-086633")||
	    		jybgbh.equals("G403-TE_YH3-086634")|| jybgbh.equals("G405-TA_NJ3-056626")||jybgbh.equals("G405-TA_NJ3-058389")||
	    		jybgbh.equals("G405-TA_OB3-058390")|| jybgbh.equals("G405-TA_OB3-058409")||jybgbh.equals("G405-TA_PQ3-056611")||
	    		jybgbh.equals("G405-TA_PQ3-058090")|| jybgbh.equals("G405-TA_PQ3-058091")||jybgbh.equals("G405-TA_PQ3-058300")||
	    		jybgbh.equals("G405-TA_PQ3-058391")|| jybgbh.equals("G405-TA_PQ3-058412")||jybgbh.equals("G405-TA_PQ3-058458")||
	    		jybgbh.equals("G405-TA_QZ3-056751")|| jybgbh.equals("G405-TA_QZ3-058092")||jybgbh.equals("G405-TA_QZ3-058333")||
	    		jybgbh.equals("G405-TA_RY3-058387")|| jybgbh.equals("G405-TA_RY3-058406")||jybgbh.equals("G405-TA_SD3-056620")||
	    		jybgbh.equals("G405-TA_SD3-058384")|| jybgbh.equals("G405-TA_SD3-058401")||jybgbh.equals("G405-TA_SD3-058422")||
	    		jybgbh.equals("G405-TA_SD3-058460")|| jybgbh.equals("G405-TA_YH3-056760")||jybgbh.equals("G405-TA_YH3-058310")||
	    		jybgbh.equals("G405-TA_YH3-058400")|| jybgbh.equals("G405-TA_YH3-058416")||jybgbh.equals("G405-TA_YH3-058447")||
	    		jybgbh.equals("G405-TA_YH3-058459")|| jybgbh.equals("G405-TA_YH3-058476")||jybgbh.equals("G405-TA_YH3-061652")||
	    		jybgbh.equals("G405-TA_YH3-061656")|| jybgbh.equals("G405-TA_YH3-061670")||jybgbh.equals("G405-TA_YH3-061677")||
	    		jybgbh.equals("G405-TA_YH3-061682")|| jybgbh.equals("G405-TA_YH3-061686")||jybgbh.equals("G405-TA_YH3-061688")||
	    		jybgbh.equals("G405-TA_YH3-061690")|| jybgbh.equals("G405-TA_YH3-061691")||jybgbh.equals("G405-TA_YH3-061694")||
	    		jybgbh.equals("G405-TA_YH3-061698")|| jybgbh.equals("G405-TA_YH3-061701")||jybgbh.equals("G405-TA_YH3-061711")||
	    		jybgbh.equals("G405-TA_YH3-061713")||jybgbh.equals("G405-TA_YH3-061718")||jybgbh.equals("G405-TE_NJ3-058438")||
	    		jybgbh.equals("G405-TE_NJ3-058454")||jybgbh.equals("G405-TE_NJ3-058463")||jybgbh.equals("G405-TE_NJ3-058480")||
	    		jybgbh.equals("G405-TE_NJ3-058494")||jybgbh.equals("G405-TE_NJ3-058703")||jybgbh.equals("G405-TE_NJ3-061532")||
	    		jybgbh.equals("G405-TE_NJ3-061553")||jybgbh.equals("G405-TE_NJ3-061567")||jybgbh.equals("G405-TE_NJ3-061606")||
	    		jybgbh.equals("G405-TE_NJ3-061627")||jybgbh.equals("G405-TE_OB3-056744")||jybgbh.equals("G405-TE_OB3-058443")||
	    		jybgbh.equals("G405-TE_OB3-058455")||jybgbh.equals("G405-TE_OB3-058464")||jybgbh.equals("G405-TE_OB3-058481")||
jybgbh.equals("G405-TE_OB3-058495")||
jybgbh.equals("G405-TE_OB3-061546")||
jybgbh.equals("G405-TE_OB3-061554")||
jybgbh.equals("G405-TE_OB3-061568")||
jybgbh.equals("G405-TE_OB3-061608")||
jybgbh.equals("G405-TE_OB3-061629")||
jybgbh.equals("G405-TE_PQ3-058449")||
jybgbh.equals("G405-TE_PQ3-058478")||
jybgbh.equals("G405-TE_PQ3-058490")||
jybgbh.equals("G405-TE_PQ3-061521")||
jybgbh.equals("G405-TE_PQ3-061551")||
jybgbh.equals("G405-TE_PQ3-061564")||
jybgbh.equals("G405-TE_PQ3-061601")||
jybgbh.equals("G405-TE_PQ3-061622")||
jybgbh.equals("G405-TE_QZ3-058423")||
jybgbh.equals("G405-TE_QZ3-058450")||
jybgbh.equals("G405-TE_QZ3-058461")||
jybgbh.equals("G405-TE_QZ3-058483")||
jybgbh.equals("G405-TE_QZ3-058497")||
jybgbh.equals("G405-TE_QZ3-061547")||
jybgbh.equals("G405-TE_QZ3-061548")||
jybgbh.equals("G405-TE_QZ3-061556")||
jybgbh.equals("G405-TE_QZ3-061559")||
jybgbh.equals("G405-TE_QZ3-061569")||
jybgbh.equals("G405-TE_QZ3-061570")||
jybgbh.equals("G405-TE_QZ3-061610")||
jybgbh.equals("G405-TE_QZ3-061612")||
jybgbh.equals("G405-TE_QZ3-061634")||
jybgbh.equals("G405-TE_QZ3-061637")||
jybgbh.equals("G405-TE_RY3-056756")||
jybgbh.equals("G405-TE_RY3-058435")||
jybgbh.equals("G405-TE_RY3-058453")||
jybgbh.equals("G405-TE_RY3-058466")||
jybgbh.equals("G405-TE_RY3-058467")||
jybgbh.equals("G405-TE_RY3-058469")||
jybgbh.equals("G405-TE_RY3-058471")||
jybgbh.equals("G405-TE_RY3-058484")||
jybgbh.equals("G405-TE_RY3-058486")||
jybgbh.equals("G405-TE_RY3-058499")||
jybgbh.equals("G405-TE_RY3-058500")||
jybgbh.equals("G405-TE_RY3-061550")||
jybgbh.equals("G405-TE_RY3-061562")||
jybgbh.equals("G405-TE_RY3-061572")||
jybgbh.equals("G405-TE_RY3-061614")||
jybgbh.equals("G405-TE_RY3-061642")||
jybgbh.equals("G405-TE_SD3-058451")||
jybgbh.equals("G405-TE_SD3-058479")||
jybgbh.equals("G405-TE_SD3-058492")||
jybgbh.equals("G405-TE_SD3-061527")||
jybgbh.equals("G405-TE_SD3-061552")||
jybgbh.equals("G405-TE_SD3-061566")||
jybgbh.equals("G405-TE_SD3-061604")||
jybgbh.equals("G405-TE_SD3-061626")||
jybgbh.equals("G405-TE_YH3-058491")||
jybgbh.equals("G408-TA_NJ3-070212")||
jybgbh.equals("G408-TA_NJ3-070893")||
jybgbh.equals("G408-TA_OB3-070931")||
jybgbh.equals("G408-TA_PQ3-070214")||
jybgbh.equals("G408-TA_PQ3-070215")||
jybgbh.equals("G408-TA_PQ3-070869")||
jybgbh.equals("G408-TA_QZ3-070229")||
jybgbh.equals("G408-TA_QZ3-070912")||
jybgbh.equals("G408-TA_QZ3-080115")||
jybgbh.equals("G408-TA_RY3-070918")||
jybgbh.equals("G408-TA_SD3-070210")||
jybgbh.equals("G408-TA_SD3-070211")||
jybgbh.equals("G408-TA_SD3-070908")||
jybgbh.equals("G408-TA_YH3-070198")||
jybgbh.equals("G408-TA_YH3-070199")||
jybgbh.equals("G408-TA_YH3-070200")||
jybgbh.equals("G408-TA_YH3-070201")||
jybgbh.equals("G408-TA_YH3-070203")||
jybgbh.equals("G408-TA_YH3-070231")||
jybgbh.equals("G408-TA_YH3-070276")||
jybgbh.equals("G408-TA_YH3-070921")||
jybgbh.equals("G408-TA_YH3-081129")||
jybgbh.equals("G408-TA_YH3-081252")||
jybgbh.equals("G408-TE_NJ3-070300")||
jybgbh.equals("G408-TE_NJ3-070301")||
jybgbh.equals("G408-TE_NJ3-070305")||
jybgbh.equals("G408-TE_NJ3-070306")||
jybgbh.equals("G408-TE_NJ3-070318")||
jybgbh.equals("G408-TE_NJ3-070319")||
jybgbh.equals("G408-TE_NJ3-070330")||
jybgbh.equals("G408-TE_NJ3-070331")||
jybgbh.equals("G408-TE_NJ3-070347")||
jybgbh.equals("G408-TE_NJ3-070348")||
jybgbh.equals("G408-TE_NJ3-070565")||
jybgbh.equals("G408-TE_NJ3-070976")||
jybgbh.equals("G408-TE_NJ3-070993")||
jybgbh.equals("G408-TE_NJ3-078320")||
jybgbh.equals("G408-TE_NJ3-080216")||
jybgbh.equals("G408-TE_OB3-070240")||
jybgbh.equals("G408-TE_OB3-070241")||
jybgbh.equals("G408-TE_OB3-070265")||
jybgbh.equals("G408-TE_OB3-070267")||
jybgbh.equals("G408-TE_OB3-070271")||
jybgbh.equals("G408-TE_OB3-070272")||
jybgbh.equals("G408-TE_OB3-070332")||
jybgbh.equals("G408-TE_OB3-070333")||
jybgbh.equals("G408-TE_OB3-070349")||
jybgbh.equals("G408-TE_OB3-070350")||
jybgbh.equals("G408-TE_OB3-070596")||
jybgbh.equals("G408-TE_OB3-070598")||
jybgbh.equals("G408-TE_OB3-070600")||
jybgbh.equals("G408-TE_OB3-070603")||
jybgbh.equals("G408-TE_OB3-070604")||
jybgbh.equals("G408-TE_OB3-070607")||
jybgbh.equals("G408-TE_OB3-070609")||
jybgbh.equals("G408-TE_OB3-070611")||
jybgbh.equals("G408-TE_OB3-070614")||
jybgbh.equals("G408-TE_OB3-070616")||
jybgbh.equals("G408-TE_OB3-070977")||
jybgbh.equals("G408-TE_OB3-071027")||
jybgbh.equals("G408-TE_OB3-080218")||
jybgbh.equals("G408-TE_PQ3-070302")||
jybgbh.equals("G408-TE_PQ3-070303")||
jybgbh.equals("G408-TE_PQ3-070311")||
jybgbh.equals("G408-TE_PQ3-070312")||
jybgbh.equals("G408-TE_PQ3-070323")||
jybgbh.equals("G408-TE_PQ3-070324")||
jybgbh.equals("G408-TE_PQ3-070337")||
jybgbh.equals("G408-TE_PQ3-070338")||
jybgbh.equals("G408-TE_PQ3-070966")||
jybgbh.equals("G408-TE_PQ3-070981")||
jybgbh.equals("G408-TE_PQ3-079755")||
jybgbh.equals("G408-TE_QZ3-070304")||
jybgbh.equals("G408-TE_QZ3-070313")||
jybgbh.equals("G408-TE_QZ3-070325")||
jybgbh.equals("G408-TE_QZ3-070339")||
jybgbh.equals("G408-TE_QZ3-070983")||
jybgbh.equals("G408-TE_QZ3-071046")||
jybgbh.equals("G408-TE_RY3-070237")||
jybgbh.equals("G408-TE_RY3-070239")||
jybgbh.equals("G408-TE_RY3-070256")||
jybgbh.equals("G408-TE_RY3-070260")||
jybgbh.equals("G408-TE_RY3-070268")||
jybgbh.equals("G408-TE_RY3-070269")||
jybgbh.equals("G408-TE_RY3-070273")||
jybgbh.equals("G408-TE_RY3-070326")||
jybgbh.equals("G408-TE_RY3-070340")||
jybgbh.equals("G408-TE_RY3-070341")||
jybgbh.equals("G408-TE_RY3-070986")||
jybgbh.equals("G408-TE_RY3-071043")||
jybgbh.equals("G408-TE_SD3-070307")||
jybgbh.equals("G408-TE_SD3-070308")||
jybgbh.equals("G408-TE_SD3-070314")||
jybgbh.equals("G408-TE_SD3-070315")||
jybgbh.equals("G408-TE_SD3-070327")||
jybgbh.equals("G408-TE_SD3-070328")||
jybgbh.equals("G408-TE_SD3-070342")||
jybgbh.equals("G408-TE_SD3-070343")||
jybgbh.equals("G408-TE_SD3-070973")||
jybgbh.equals("G408-TE_SD3-070988")||
jybgbh.equals("G408-TE_YH3-070309")||
jybgbh.equals("G408-TE_YH3-070310")||
jybgbh.equals("G408-TE_YH3-070316")||
jybgbh.equals("G408-TE_YH3-070317")||
jybgbh.equals("G408-TE_YH3-070334")||
jybgbh.equals("G408-TE_YH3-070335")||
jybgbh.equals("G408-TE_YH3-070336")||
jybgbh.equals("G408-TE_YH3-070345")||
jybgbh.equals("G408-TE_YH3-070346")||
jybgbh.equals("G408-TE_YH3-070617")||
jybgbh.equals("G408-TE_YH3-070975")||
jybgbh.equals("G408-TE_YH3-070990")||
jybgbh.equals("G408-TE_YH3-074913")||
jybgbh.equals("G408-TE_YH3-074914")||
jybgbh.equals("G408-TE_YH3-074915")||
jybgbh.equals("G408-TE_YH3-074921")||
jybgbh.equals("G408-TE_YH3-075904")||
jybgbh.equals("G408-TE_YH3-075905")||
jybgbh.equals("G408-TE_YH3-075911")||
jybgbh.equals("G408-TE_YH3-075924")||
jybgbh.equals("G408-TE_YH3-077331")||
jybgbh.equals("G408-TE_YH3-077337")||
jybgbh.equals("G408-TE_YH3-077339")||
jybgbh.equals("G408-TE_YH3-077344")||
jybgbh.equals("G408-TE_YH3-077376")||
jybgbh.equals("G408-TE_YH3-077378")||
jybgbh.equals("G408-TE_YH3-077393")||
jybgbh.equals("G408-TE_YH3-077396")||
jybgbh.equals("G408-TE_YH3-077398")||
jybgbh.equals("G408-TE_YH3-077400")||
jybgbh.equals("G408-TE_YH3-077406")||
jybgbh.equals("G408-TE_YH3-077411")||
jybgbh.equals("G408-TE_YH3-077416")||
jybgbh.equals("G408-TE_YH3-077418")||
jybgbh.equals("G408-TE_YH3-077455")||
jybgbh.equals("G408-TE_YH3-077461")||
jybgbh.equals("G408-TE_YH3-077467")||
jybgbh.equals("G408-TE_YH3-077471")||
jybgbh.equals("G408-TE_YH3-077478")||
jybgbh.equals("G408-TE_YH3-077484")||
jybgbh.equals("G408-TE_YH3-077490")||
jybgbh.equals("G408-TE_YH3-079117")||
jybgbh.equals("G408-TE_YH3-079130")||
jybgbh.equals("G408-TE_YH3-080981")||
jybgbh.equals("G408-TE_YH3-080990")||
jybgbh.equals("G408-TE_YH3-081105")||
jybgbh.equals("G408-TE_YH3-081106")||
jybgbh.equals("G408-TE_YH3-081118")||
jybgbh.equals("G408-TE_YH3-081128")||
jybgbh.equals("G408-TE_YH3-081142")||
jybgbh.equals("G408-TE_YH3-081150")||
jybgbh.equals("G408-TE_YH3-081159")||
jybgbh.equals("G408-TE_YH3-081168")||
jybgbh.equals("G408-TE_YH3-081177")||
jybgbh.equals("G408-TE_YH3-081178")||
jybgbh.equals("G408-TE_YH3-081179")||
jybgbh.equals("G408-TE_YH3-081180")||
jybgbh.equals("G408-TE_YH3-081245")||
jybgbh.equals("G408-TE_YH3-081247")||
jybgbh.equals("G408-TE_YH3-081615")||
jybgbh.equals("G408-TE_YH3-081616")||
jybgbh.equals("G415-TA_NJ3-046117")||
jybgbh.equals("G415-TA_OB3-046113")||
jybgbh.equals("G415-TA_PQ3-046105")||
jybgbh.equals("G415-TA_QZ3-046107")||
jybgbh.equals("G415-TA_RY3-046109")||
jybgbh.equals("G415-TA_SD3-046111")||
jybgbh.equals("G415-TA_YH3-046115")||
jybgbh.equals("G415-TE_NJ3-046118")||
jybgbh.equals("G415-TE_OB3-046114")||
jybgbh.equals("G415-TE_PQ3-046106")||
jybgbh.equals("G415-TE_QZ3-046108")||
jybgbh.equals("G415-TE_RY3-046110")||
jybgbh.equals("G415-TE_SD3-046112")||
jybgbh.equals("G415-TE_YH3-046116")||
jybgbh.equals("G415-TE_YH3-049880")||
jybgbh.equals("G415-TE_YH3-049883")||
jybgbh.equals("G423-TA_NJ3-039573")||
jybgbh.equals("G423-TE_NJ3-039577")||
jybgbh.equals("G423-TE_OB3-039578")||
jybgbh.equals("G423-TE_YH3-044397")||
jybgbh.equals("G423-TE_YH3-044398")||
jybgbh.equals("G423-TE_YH3-044402")||
jybgbh.equals("G423-TE_YH3-044403")||
jybgbh.equals("G423-TE_YH3-044406")||
jybgbh.equals("G423-TE_YH3-044408")||
jybgbh.equals("G423-TE_YH3-044409")||
jybgbh.equals("G423-TE_YH3-044411")||
jybgbh.equals("G423-TE_YH3-044428")||
jybgbh.equals("G423-TE_YH3-044431")||
jybgbh.equals("G423-TE_YH3-044438")||
jybgbh.equals("G423-TE_YH3-044443")||
jybgbh.equals("G423-TE_YH3-044444")||
jybgbh.equals("G424-TA_NJ3-012299")||
jybgbh.equals("G424-TA_OB3-012300")||
jybgbh.equals("G424-TA_PQ3-012294")||
jybgbh.equals("G424-TA_QZ3-012297")||
jybgbh.equals("G424-TA_RY3-012298")||
jybgbh.equals("G424-TA_SD3-012296")||
jybgbh.equals("G424-TA_YH3-012301")||
jybgbh.equals("G403-TA_RY3-073825")){
		        return false;
		    }
	    }
	  String flbh = e3FlmxDao.findByJybgbh(jybgbh);
	  if (flbh == "" ) {
        return false;
     }
    if (flbh != "" && flbh.substring(6, 7).equals(pf)) {
      return true;
    }else {
     	if(pf.equals("5")&&jybgbh.substring(8,11).equals("ZS3"))//轻型汽油车国5 的时候   允许国4的噪声报告
     		{
         	if(flbh.substring(5,7).equals("34")||flbh.substring(5,7).equals("44")||flbh.substring(5,7).equals("I4"))//允许 国4的附录 噪声 申报国5
        	{
        		return true;
        	}
    	}
      return false;
    }
	}

	

}
