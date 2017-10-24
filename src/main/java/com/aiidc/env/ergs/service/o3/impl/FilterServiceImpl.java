/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.constant.InforPub;
import com.aiidc.env.ergs.constant.Type;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcNj;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcObd;
import com.aiidc.env.ergs.jpa.po.o3.qqcReport.QqcSbc;
import com.aiidc.env.ergs.jpa.repo.o3.qqcMain.QqcMainGjsDao;
import com.aiidc.env.ergs.jpa.repo.yzx.appendix.NjAppendixDao;
import com.aiidc.env.ergs.service.o3.FilterService;

/**
 * @author jiabin fan
 *
 */
@Service
public class FilterServiceImpl implements FilterService {
	@Resource
	private NjAppendixDao njAppendixDao;
	@Resource
	private QqcMainGjsDao qqcMainGjsDao;
	private boolean isExistSBC = false;// LQS 是否保存SBC报告 QQC G5需要 
	private boolean isNeedGJS = false;
	 String StrR=""; //用于存放缺失配置的类别；
	 String flbh ="";
	/** 正常情况下需要有这么多种配置 **/

	int[] lbsWarn = null;
	
	int[] lbs = null;
	int[] lbs1 = { Type.CONFIG_PW, Type.CONFIG_QZX, Type.CONFIG_RY,
			Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH };
	int[] lbs2 = { Type.CONFIG_PW, Type.CONFIG_QZX, Type.CONFIG_RY,
			Type.CONFIG_NJX, Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH };
	int[] lbs3 = { Type.CONFIG_PW, Type.CONFIG_QZX, Type.CONFIG_RY,
			Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH, Type.CONFIG_OBD };//
	int[] lbsall = { Type.CONFIG_PW, Type.CONFIG_QZX, Type.CONFIG_RY,
			Type.CONFIG_NJX, Type.CONFIG_OBD, Type.CONFIG_ZS, Type.CONFIG_SDS,
			Type.CONFIG_YH };//

	int[] lbs5all = { Type.CONFIG_QZX, Type.CONFIG_RY, Type.CONFIG_OBD,
			Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH, Type.CONFIG_CW,
			Type.CONFIG_DW, Type.CONFIG_SBC, Type.CONFIG_GJS, Type.CONFIG_NJX };//

	// /有sbc 报告 可以不需要耐久性报告 是否需要贵金属报告需要判断
	int[] lbs5_sbc_gjs= { Type.CONFIG_QZX, Type.CONFIG_RY, Type.CONFIG_OBD,
			Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH, Type.CONFIG_CW,
			Type.CONFIG_DW, Type.CONFIG_SBC, Type.CONFIG_GJS };//
	
	int[] lbs5_sbc_notgjs = { Type.CONFIG_QZX, Type.CONFIG_RY, Type.CONFIG_OBD,
			Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH, Type.CONFIG_CW,
			Type.CONFIG_DW, Type.CONFIG_SBC };//

	// 有耐久性基准报告 可以不需要SBC  是否需要贵金属报告需要判断
	int[] lbs5_njxTA_gjs = { Type.CONFIG_QZX, Type.CONFIG_RY, Type.CONFIG_NJX,
			Type.CONFIG_OBD, Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH,
			Type.CONFIG_CW, Type.CONFIG_DW, Type.CONFIG_GJS };//

	int[] lbs5_njxTA_notgjs = { Type.CONFIG_QZX, Type.CONFIG_RY, Type.CONFIG_NJX,
			Type.CONFIG_OBD, Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH,
			Type.CONFIG_CW, Type.CONFIG_DW };//

	// 有耐久性视同报告 可以不需要SBC 可以没有贵金属报告
	int[] lbs5_njxTE = { Type.CONFIG_QZX, Type.CONFIG_RY, Type.CONFIG_NJX,
			Type.CONFIG_OBD, Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH,
			Type.CONFIG_CW, Type.CONFIG_DW, };// 
	
	
	int[] lbs5_XPL_nj = { Type.CONFIG_QZX, Type.CONFIG_RY, Type.CONFIG_OBD,
			Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH, Type.CONFIG_CW,
			Type.CONFIG_DW, Type.CONFIG_NJX };//小批量申报可以没有 贵金属
	

	int[] lbs5_XPL_sbc = { Type.CONFIG_QZX, Type.CONFIG_RY, Type.CONFIG_OBD,
			Type.CONFIG_ZS, Type.CONFIG_SDS, Type.CONFIG_YH, Type.CONFIG_CW,
			Type.CONFIG_DW, Type.CONFIG_SBC };//小批量申报可以没有 贵金属
	
	
  

	int[] lbs_xxgk4 = { Type.CONFIG_PW,Type.CONFIG_QZX, Type.CONFIG_RY, Type.CONFIG_OBD,Type.CONFIG_ZS };
	
	

	int[] lbs_xxgk5 = { Type.CONFIG_CW,Type.CONFIG_QZX, Type.CONFIG_RY, Type.CONFIG_OBD,Type.CONFIG_ZS };
	/* 
	 * 
	 */
	@Override
	public JsonMessage filter(Map<String,List> map,String pf,String vehicle,List jybgbhList) {
		//获取车辆类别；
		
		//获取车辆类别int;
		int cllb = Type.strToint(vehicle);
		switch (cllb) { 
		case Type.VEHICLE_QQ:
			/*String jybgbh = getJybgbh("3",jybgbhList);
				if (jybgbh.indexOf("TE") != -1) {
					//从QqcMainStc中查询对象；
				} else {
					//根据不同的配置名称差对象；
					String k = jybgbh.substring(8, 11).toLowerCase();
					PartReportService service = SpringContextUtil.getBean(k + "PartReportService",PartReportService.class);
					Object mainReport = service.findByJybgbh(jybgbh);
				}
			} */
			qqcFileter(map, pf,vehicle,jybgbhList);
			break;
		case Type.VEHICLE_ZC:
			
			break;
		case Type.VEHICLE_DDC:
			break;
		case Type.VEHICLE_ZCJ:
			break;
		case Type.VEHICLE_QC:
			break;
		case Type.VEHICLE_RQJ:
			break;
		case Type.VEHICLE_RQC:
			break;
		case Type.VEHICLE_NY:
			break;
		case Type.VEHICLE_NYJ:
			break;
		case Type.VEHICLE_QLY:
			break;
		case Type.VEHICLE_QRQ:
			break;
		case Type.VEHICLE_CYJ:
			break;
		case Type.VEHICLE_XTJ:
			break;
		case Type.VEHICLE_MT:
			break;
		case Type.VEHICLE_QM:
			break;

		case Type.VEHICLE_ZQC2:
			break;
		case Type.VEHICLE_ZQ:
			break;
		case Type.VEHICLE_ZQJ:
			break;
		case Type.VEHICLE_ZCC2:
			break;

		}
		return new JsonMessage(true,"");// 过滤配置 cp 第一次为所有的配置
		
	}

	/**
	 * @param map
	 * @param inforPub
	 * @param jybgbhList
	 * @return 
	 */
	private JsonMessage qqcFileter(Map<String,List> map, String pf,String vehicle ,List<String> jybgbhList) {
		//获取排放阶段
		//获取车辆类别
		int type = Type.strToint(vehicle);
		boolean abort = false;
		boolean obd = false;// 是否需要OBD
		boolean njx = false;// 是否需要NJX
		String xpl = "N";
		if (type == 1)// 正常申报类型
			njx = true;
		if (obd && njx)
			lbs = lbsall;
		if (!obd && njx)
			lbs = lbs2;
		if (obd && !njx)
			lbs = lbs3;
		if (!obd && !njx)
			lbs = lbs1;
		if ("5".equals(pf)) {
			// 国5 判断下 是否需要NJX SBC 有NJX就不需要SBC 有SBC 就不需要NJX
			if (getJybgbh("_BC3-",jybgbhList)) {
				// 有SBC报告
				if(isNeedGJS(Type.CONFIG_SBC,map)){
					isExistSBC = true;
					lbs = lbs5_sbc_gjs;
				}else
				{
					isExistSBC = false;
					lbs = lbs5_sbc_notgjs;
				}
			} else {
				if (getJybgbh("TA_NJ3",jybgbhList)) {
					// 有NJX基准报告
					if(isNeedGJS(Type.CONFIG_NJX,map)){  //判断是否需要贵金属报告  // 载体材料如果为金属的话 不需要贵金属报告
						lbs = lbs5_njxTA_gjs ;
					}else
					{
						lbs = lbs5_njxTA_notgjs;
					}
				} else {
					if (getJybgbh("TE_NJ3",jybgbhList)) {
						// 有NJX视同报告
						lbs = lbs5_njxTE;
					} else {
						lbs = lbs5_njxTA_notgjs;
					}
				}
			}

			if ("Y".equals(xpl)) {
				//如果是小批量报告，就可以不需要贵金属 报告  可以允许小批量申报不带这些报告 
				// 国5 判断下 是否需要NJX SBC 有NJX就不需要SBC 有SBC 就不需要NJX
				if (getJybgbh("_BC3-",jybgbhList)) { 
					isExistSBC = true;
					lbs = lbs5_XPL_sbc; 
				} 
				else{
					isExistSBC = false;
					lbs = lbs5_XPL_nj;
				}
			}  
		}
		 

		lbsWarn=lbs;
		  
		if ("5".equals(pf)) {
			lbs=lbs_xxgk5;
		}else
		{
			lbs=lbs_xxgk4;
		} 

		if (!isAll(lbs,map)) {
			return new JsonMessage(false,"当前车型的报告不全！缺失的报告有"+ StrR);
		} 

		
		for (String configkey:map.keySet()) {
			int configType  = new Integer(configkey);
		     if(!isCon(lbsWarn,configType))
		     {
				 int[] arrTmp = new int[lbsWarn.length+1]; 
			     for (int i = 0; i < lbsWarn.length; i++) {
			        	arrTmp[i] = lbsWarn[i];
			     }
		    	 arrTmp[lbsWarn.length]=configType;
		    	 lbsWarn=arrTmp;
		     } 
		}

		if (!isAll(lbsWarn,map)) { 
	        
			return new JsonMessage(false,"当前所选择的检验项目不全！\\n\\r需要的检验项目请核对【国环规大气[2016]3号】文件！\\n\\r当前缺少的检验项目有："+ StrR);
		}
		

		/** 如果不能满足最基本的规则，直接排除 **/
		/*if (abort) {
			result.setSucceed(false);
			result.setMsg(sb.toString());
			for (Iterator it = this.cp.iterator(); it.hasNext();) {
				O3Config config = (O3Config) it.next();
				result.setWrongConfig(config);
			}
			return result;
		} */
		for (String jybgbh:jybgbhList) {
		      if (jybgbh.indexOf("_JS3-") != -1) {////如果有贵金属的报告的话， 附录的催化转化器状态必须为8  
		    		
		    		if(!IsGJSVinCorrect(jybgbh)){ 
		    			//贵金属报告中的 VIN 号必须存在于Y_APPENDIX_NJ表中
		    			return new JsonMessage(false,"报告中的VIN号与"+flbh+"此附录中的VIN号不一致,无法进行申报!");
		    		}
		    		
		      
		      /*
		      */
				if ("5".equals(pf)) {
				      if (jybgbh.indexOf("_OB3-") != -1) {//OBD 报告校验，不带IUPR  OBD 监控的不允许申报 				    	   
				    	  List<QqcObd> Obds = (List<QqcObd>) map.get(Type.CONFIG_OBD);
				    	  for (QqcObd qqcObd : Obds) {
							
				    		  if (qqcObd.getIupr()==null || qqcObd.getIupr().equals("否")
				    				  ||qqcObd.getIupr().equals("")) {
				    			  
				    			  return new JsonMessage(false,"不带IUPR或NOX监控的车型不允许申报!");
				    		  } 
						}
				      }
				}
				//校验检验报告是否是同一功率
	 
		      }
		}

		/** 再检测所包含的配置是否合法**/
		/*if ("4".equals(pf)) {
			filter(lbsall);
		} else {
			filter(lbs);
		}*/
		
				return new JsonMessage(true,"");
		
	}



	/**
	 * @param jybgbh
	 * 获取贵金属VIN
	 */
	private boolean IsGJSVinCorrect(String jybgbh) {
		Integer cllb = new Integer(jybgbh.substring(10,11));
		String vin = "";
		if(cllb == 3){
		  vin = qqcMainGjsDao.findByJybgbh(jybgbh).getNjvin();
		}
		 flbh = njAppendixDao.findByVinma(vin);
		if(null != flbh){
			return true;
		}
			return false;
		
	}

	/**
	 * @param lbs4
	 * 判断是否都有这些配置的报告；
	 */
	private boolean isAll(int[] lbs,Map map) {
		for (int i : lbs) {
			if(map.get(i+"") == null){
				StringBuffer sb = new StringBuffer();
				  sb.append(Type.getBgNameChinese(lbs[i])+"、");
				 
			      StrR=sb.toString();
			      StrR = StrR.substring(0,StrR.length()-1); 
				return false;
			}
		}
		return true;
	}

	/**
	 * @param configSbc
	 * @return
	 */
	private boolean isNeedGJS(int configType,Map map) {
		//根据configType获取报告
		if(configType == Type.CONFIG_SBC){
			List<QqcSbc> sbcs =  (List<QqcSbc>) map.get(configType+"");
			for (QqcSbc sbc : sbcs) {
				
				// 载体材料如果为陶瓷的话  不需要贵金属报告
				if(sbc.getZtcl().indexOf("陶瓷")>=0) {
					return true;
				}
			}
		}else if(configType == Type.CONFIG_NJX ){
			List<QqcNj> sbcs = (List<QqcNj>) map.get(configType+"");
			for (QqcNj sbc : sbcs) {
				
				// 载体材料如果为陶瓷的话  不需要贵金属报告
				if(sbc.getZtcl().indexOf("陶瓷")>=0) {
					return true;
				}
			}
		}
		return false;
		
	}

	/**
	 * @param string
	 * 判断编号是否含有key
	 */
	private Boolean getJybgbh(String key,List<String> jybgbhList) {
		for (String jybgbh : jybgbhList) {
			if (jybgbh.indexOf(key) != -1) {
		        return true;
		}
	}
		return false;
		
	}
	/**
	 * 
	 * 判断项目是否和国标规定的数目相等
	 */
	public  static boolean isCon(int[] arr, int targetValue) {
	    for (int s : arr) {
	        if (s==targetValue) {
	            return true;
	        }
	    }
	    return false;
}
}
