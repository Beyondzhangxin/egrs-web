/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.constant.Type;
import com.aiidc.env.ergs.service.o3.MixReportService;

/**
 * @author jiabin fan
 *
 */
@Service
public class MixReportServiceImpl implements MixReportService {
	  /**用哪几种报告来组合大配置的依据**/
	  public static final int[] MAP_QQC = {
	      Type.CONFIG_PW, Type.CONFIG_RY, Type.CONFIG_ZS, Type.CONFIG_QZX};
	  
	  public static final int[] MAP_QQC5 = {
	      Type.CONFIG_CW,Type.CONFIG_RY, Type.CONFIG_ZS, Type.CONFIG_QZX};
	/*  Type.CONFIG_CW,Type.CONFIG_OBD,  Type.CONFIG_RY, Type.CONFIG_ZS, Type.CONFIG_QZX};*/
	  
	  
	  public static final int[] MAP_ZCC = {
	      Type.CONFIG_ZS};
	  public static final int[] MAP_ZCJ = {
	      Type.CONFIG_PW};
	  public static final int[] MAP_CYJ = {
	      Type.CONFIG_PW};
	  public static final int[] MAP_XTJ = {
	      Type.CONFIG_PW};
	  public static final int[] MAP_QCC = {
	      Type.CONFIG_PW, Type.CONFIG_ZS};

	  public static final int[] MAP_QCC5 = {
	      Type.CONFIG_PW, Type.CONFIG_ZS};
	  

	  public static final int[] MAP_DDC = {
	      Type.CONFIG_ZS};
	  public static final int[] MAP_ZCC2 = {
	      Type.CONFIG_PW, Type.CONFIG_ZS};
	  public static final int[] MAP_RQC = {
	      Type.CONFIG_SDS, Type.CONFIG_QZX, Type.CONFIG_ZS};
	  public static final int[] MAP_RQJ = {
	      Type.CONFIG_PW};
	  public static final int[] MAP_NYJ = {
	      Type.CONFIG_PW};
	  public static final int[] MAP_NYC = {
	      Type.CONFIG_ZYJS, Type.CONFIG_ZS};
	  public static final int[] MAP_QLY = {
	      Type.CONFIG_PW, Type.CONFIG_RY, Type.CONFIG_ZS, Type.CONFIG_QZX};

	  public static final int[] MAP_QLY5 = {
	      Type.CONFIG_CW, Type.CONFIG_RY, Type.CONFIG_ZS, Type.CONFIG_QZX};
	  
	  public static final int[] MAP_QRQ = {
	      Type.CONFIG_PW, Type.CONFIG_ZS, Type.CONFIG_QZX};
	  public static final int[] MAP_MTC = {
		  Type.CONFIG_NJX,Type.CONFIG_ZS, Type.CONFIG_PW, Type.CONFIG_RY};
	  public static final int[] MAP_QMT = {
	      Type.CONFIG_PW, Type.CONFIG_ZS, Type.CONFIG_RY};
	  public static final int[] MAP_ZQC2 = {
	      Type.CONFIG_PW, Type.CONFIG_RY, Type.CONFIG_ZS, Type.CONFIG_QZX}; //, Type.CONFIG_NJX
	// Type.CONFIG_SDS, Type.CONFIG_NJX, Type.CONFIG_QZX, Type.CONFIG_ZS,
	  // Type.CONFIG_PW,Type.CONFIG_RY
	  public static final int[] MAP_ZQJ = {
	      Type.CONFIG_PW};
	  public static final int[] MAP_ZQC = {
	      Type.CONFIG_SDS, Type.CONFIG_RY, Type.CONFIG_QZX, Type.CONFIG_ZS};
	/* 
	 * 
	 */
	@Override
	public List mix(Map lastMap, String pf, String vehicle) {
	    int vehicleType = Type.strToint(vehicle);
		if (vehicleType ==Type.VEHICLE_QQ) {
	    		if ("4".equals(pf)) { 
	    	        //(O3Sbb.MAP_QQC);
	    			return mixReport(MAP_QQC,lastMap);
				} else {
	    	        return mixReport(MAP_QQC5,lastMap);
				}
		}
	      if (vehicleType == Type.VEHICLE_ZC){
	    	  
	      }
	        //(O3Sbb.MAP_ZCC);
	        
	      if (vehicleType == Type.VEHICLE_ZCJ){
	    	  
	      }
	        //(O3Sbb.MAP_ZCJ);
	       
	        
	      if (vehicleType == Type.VEHICLE_QC){
	    	  
	      }
	  		if ("4".equals(pf)) { 
	  	        //(O3Sbb.MAP_QCC);
	  	       
			} else {
	  	        //(O3Sbb.MAP_QCC5);
	  	       
			} 
	      
	    if (vehicleType == Type.VEHICLE_NY){
	    	
	    }
	      //(O3Sbb.MAP_NYC);
	     
	    
	  if (vehicleType == Type.VEHICLE_NYJ){
		  
	  }
	        //(O3Sbb.MAP_NYJ);
	       
	      
	    if (vehicleType == Type.VEHICLE_RQJ){
	    	
	    }
	      //(O3Sbb.MAP_RQJ);
	     
	      
	    if (vehicleType == Type.VEHICLE_RQC){
	    	
	    }
	      //(O3Sbb.MAP_RQC);
	     
	      
	    if (vehicleType == Type.VEHICLE_QLY){ 
	    	
	    }
			if ("4".equals(pf)) {  
			      //(O3Sbb.MAP_QLY);
			     
			} else { 
			      //(O3Sbb.MAP_QLY5);
			      
			} 
	      
	    if (vehicleType == Type.VEHICLE_QRQ){
	    	
	    }
	      //(O3Sbb.MAP_QRQ);
	     
	      
	    if (vehicleType == Type.VEHICLE_CYJ){
	    	
	    }
	      //(O3Sbb.MAP_CYJ);
	     
	      
	    if (vehicleType == Type.VEHICLE_XTJ){
	    	
	    }
	      //(O3Sbb.MAP_XTJ);
	     
	      
	    if (vehicleType == Type.VEHICLE_MT){
	    	
	    }
	      //(O3Sbb.MAP_MTC);
	     
	      
	    if (vehicleType == Type.VEHICLE_QM){
	    	
	    }
	      //(O3Sbb.MAP_QMT);
	     
	      

	    if (vehicleType == Type.VEHICLE_ZQC2){
	    	
	    }
	      //(O3Sbb.MAP_ZQC2);
	     
	      
	    if (vehicleType == Type.VEHICLE_ZQJ){
	    	
	    }
	      //(O3Sbb.MAP_ZQJ);
	     
	      
	    if (vehicleType == Type.VEHICLE_ZQ){
	    	
	    }
	      //(O3Sbb.MAP_ZQC);
	     
	      
	    if (vehicleType == Type.VEHICLE_ZCC2){
	    	
	    }
	         //(O3Sbb.MAP_ZCC2);
	        
	         
	    if (vehicleType == Type.VEHICLE_DDC){
	    	
	    }
	        //(O3Sbb.MAP_DDC);
	        
			
	 
		return null;
	}
	/**
	 * @param mapQqc
	 */
	private List mixReport(int[] mapQqc,Map lastMap) {
		Map configMap = new HashMap<String,Object>();
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		List list3 = new ArrayList();
		List list4 = new ArrayList();
		List list5 = new ArrayList();
		Set<Integer> listkey = new HashSet<Integer>();
		//用于存放组合后的配置；
		List configMapList = new ArrayList();
		 listkey.addAll((Set<Integer>) lastMap.keySet());
		for (int i = 0; i < mapQqc.length; i++) {
			listkey.remove(mapQqc[i]);
			
		 if (list1.isEmpty()) {
		        list1 = (List) lastMap.get(mapQqc[i]);
		      }
		      else if (list2.isEmpty()) {
		        list2 = (List) lastMap.get(mapQqc[i]);
		      }
		      else if (list3.isEmpty()) {
		        list3 = (List) lastMap.get(mapQqc[i]);
		      }
		      else if (list4.isEmpty()) {
		        list4 = (List) lastMap.get(mapQqc[i]);
		      }
		      else if (list5.isEmpty()) {
		        list5 = (List) lastMap.get(mapQqc[i]);
		      }
		}
		if(null != list1){
			
			for (Object obj1:list1 ) {
				
				if (!list2.isEmpty()) {
					for (Object obj2:list2  ) {
						
						if (!list3.isEmpty()) {
							for (Object obj3:list3  ) {
								
								if (!list4.isEmpty()) {
									for (Object obj4:list4  ) {
										
										if (!list5.isEmpty()) {
											for (Object obj5:list5  ) {
												configMap.put(mapQqc[0]+"", obj1);
												configMap.put(mapQqc[1]+"", obj2);
												configMap.put(mapQqc[2]+"", obj3);
												configMap.put(mapQqc[3]+"", obj4);
												configMap.put(mapQqc[4]+"", obj5);
												//遍历原map的key
												for (Integer key : listkey) {
													configMap.put(key+"", ((List) lastMap.get(key)).get(0));
												}
												configMapList.add(configMap);
											}
										}
										else {
											
											configMap.put(mapQqc[0]+"", obj1);
											configMap.put(mapQqc[1]+"", obj2);
											configMap.put(mapQqc[2]+"", obj3);
											configMap.put(mapQqc[3]+"", obj4);
											//遍历原map的key
											for (Integer key : listkey) {
												configMap.put(key+"", ((List) lastMap.get(key)).get(0));
											}
											configMapList.add(configMap);
										}
									}
								}
								else {
									
									configMap.put(mapQqc[0]+"", obj1);
									configMap.put(mapQqc[1]+"", obj2);
									configMap.put(mapQqc[2]+"", obj3);
									//遍历原map的key
									for (Integer key : listkey) {
										configMap.put(key+"", ((List) lastMap.get(key)).get(0));
									}
									configMapList.add(configMap);
								}
							}
						}
						else {
							
							configMap.put(mapQqc[0]+"", obj1);
							configMap.put(mapQqc[1]+"", obj2);
							//遍历原map的key
							for (Integer key : listkey) {
								
								configMap.put(key+"", ((List) lastMap.get(key)).get(0));
							}
							configMapList.add(configMap);
							
						}
					}
				}
				else {
					
					configMap.put(mapQqc[0]+"", obj1);
					//遍历原map的key
					for (Integer key : listkey) {
						configMap.put(key, ((List) lastMap.get(key)).get(0));
					}
					configMapList.add(configMap);
					
				}
			} 
		}
		return configMapList;
	}
}
