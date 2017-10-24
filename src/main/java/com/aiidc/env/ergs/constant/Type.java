package com.aiidc.env.ergs.constant;

import java.util.Date;

import com.aiidc.env.ergs.common.util.CodeUtil;
import com.aiidc.env.ergs.common.util.DateUtil;
import com.aiidc.env.ergs.common.util.StringUtil;
/**
 * <p>Title: Dr Ijava</p>
 * <p>Description: 类型类</p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: ZWK</p>
 * @author Ijava
 * @version 1.0
 */

public class Type {

  /** 定义配置种类代号 **/
  public static final int CONFIG_ZS = 1;   //噪声
  public static final int CONFIG_RY = 2;   //燃油
  public static final int CONFIG_DS = 3;   //怠速
  public static final int CONFIG_PW = 4;   //排污


  public static final int CONFIG_QZX = 5;  //曲轴箱
  public static final int CONFIG_NJX = 6;  //耐久性
  public static final int CONFIG_ZYJS = 7; //自由加速
  public static final int CONFIG_QFH = 8;  //全负荷
  public static final int CONFIG_PF = 9;   //排放怠速曲轴箱
  public static final int CONFIG_OBD=0;    //OBD
  public static final int CONFIG_SDS=10;   //双怠速
  public static final int CONFIG_YH=11;    //油耗
  public static final int CONFIG_PQYD=12;  //排气烟度
  public static final int CONFIG_PW2 = 13; //17691排放

  public static final int CONFIG_CW = 14;   //常温
  public static final int CONFIG_DW = 15;   //低温
  public static final int CONFIG_SBC = 16;   //sbc
  public static final int CONFIG_GJS = 17;   //贵金属
 	 

  public static final int CONFIG_ZHQ_YEAR = 18;   //催化转化器  年报季报使用planYearMxReport.jsp
  public static final int CONFIG_TG_YEAR = 19;   //碳罐 年报季报使用planYearMxReport.jsp
  
  /** 车辆类型需要检测的报告类别 **/
  public static final int[] ALL_MT_TA = {
      1,9}; //摩托基准
  public static final int[] ALL_QM_TA = {
      1,9}; //轻便摩托基准
  public static final int[] ALL_NY_TA = {
      7}; //农用基准
  public static final int[] ALL_QQ_TA = {
      1, 2,10, 4, 5}; //轻汽基准
  public static final int[] ALL_QC_TA = {
      1, 4, 7}; //轻柴基准
  public static final int[] ALL_QCNOFA_TA = {
      1, 4}; //轻柴基准
  public static final int[] ALL_ZQ_TA = {
      1, 2 ,5, 10}; //重汽基准
  public static final int[] ALL_ZC_TA = {
      1}; //重柴基准
  public static final int[] ALL_ZCJ_TA = {
      4, 12}; //重柴机基准
  public static final int[] ALL_ZQJ_TA = {
      4,6}; //重汽机基准
  public static final int[] ALL_RQC_TA={
      1,10};
  public static final int[] ALL_RQJ_TA={
      4};
  public static final int[] ALL_QLY_TA = {
      1, 2,10, 4, 5}; //轻两用基准
  public static final int[][] ALL_TA = {
      ALL_QM_TA, ALL_MT_TA, ALL_NY_TA, ALL_QQ_TA, ALL_QC_TA,
      ALL_ZQ_TA, ALL_ZC_TA, ALL_ZCJ_TA, ALL_ZQJ_TA,ALL_RQC_TA,ALL_RQJ_TA,ALL_QLY_TA};

  //public static final int[][] ALL_TE={ALL_MT_TE,ALL_NY_TE,ALL_QQ_TE,ALL_QC_TE,
  //  ALL_ZQ_TE,ALL_ZC_TE,ALL_ZCJ_TE,ALL_ZQJ_TE};

  /** 车辆类型代号 **/
  public static final int VEHICLE_QM = 0;
  public static final int VEHICLE_MT = 1;
  public static final int VEHICLE_NY = 2;
  public static final int VEHICLE_QQ = 3;
  public static final int VEHICLE_ZQ = 5;
  public static final int VEHICLE_QC = 4;
  public static final int VEHICLE_ZC = 6;
  public static final int VEHICLE_ZCJ = 7;
  public static final int VEHICLE_ZQJ = 8;
 //重型燃气车
  public static final int VEHICLE_RQC=9;
  //重型燃气机
  public static final int VEHICLE_RQJ='A';//65 
  //电动车
  public static final int VEHICLE_DDC='B';//66
  //轻型NG车
  public static final int VEHICLE_NG='C';//67
  //重型LPG车
  public static final int VEHICLE_LPGC='D';//68
  //重型NG车
  public static final int VEHICLE_NGC='E';//69
  //重型LPG发动机
  public static final int VEHICLE_LPGJ='F';//70
  //重型NG发动机
  public static final int VEHICLE_NGJ='G';//71
  //农用发动机
  public static final int VEHICLE_NYJ='H';//72
  //轻型两用燃料
  public static final int VEHICLE_QLY='I';//73
  //轻型燃气车
  public static final int VEHICLE_QRQ='J';//74
  //重型两用燃料车
  public static final int VEHICLE_ZLY='K';//75
 //重型柴油车按18352.3-2005
  public static final int VEHICLE_ZCC2='L';//76
  //轻型燃料
  public static final int VEHICLE_QRL='J';//74
  //重型汽油车2
  public static final int VEHICLE_ZQC2='M';//77
  //非道路
  public static final int VEHICLE_CYJ='N';//78
  //小型点燃式
  public static final int VEHICLE_XTJ='P';//80 
  
  
  /*
   * 不需要了，重新利用
   * 
  //重型柴油车(环境友好)
  public static final int VEHICLE_ZCH='Q'; 
  
//重型LPG车(环境友好)
  public static final int VEHICLE_LPGCH='R' ;
  //重型NG车(环境友好)
  public static final int VEHICLE_NGCH='S' ; 
//重型柴油机(环境友好)
  public static final int VEHICLE_ZCJH='T' ;
//重型LPG发动机(环境友好)
  public static final int VEHICLE_LPGJH='U'  ;
//重型NG发动机(环境友好)
  public static final int VEHICLE_NGJH='V'  ;

*/


  //非道路移动机械
  public static final int VEHICLE_FJX='Q'; 


  /** 基准或者视同 **/
  public static final String BGLX_TA = "TA";
  public static final String BGLX_TE = "TE";

  /***************容纳的数据*********************/
  private int vehicleType = 0;
  /*********************************************/

  public Type() {
  }

  public Type(int vehicleType) {
    this.vehicleType = vehicleType;
  }

  /** 返回该车类基准需要的配置类型 **/
  public static int[] getAllTA(int vehicleType) {
    if (vehicleType==Type.VEHICLE_RQJ)
      return ALL_RQJ_TA;
    return ALL_TA[vehicleType];
  }
  public static String backShort(String cllb){
	  if (cllb.equals("轻型汽油车")) {
	      return "qqc";
	    }
	    if (cllb.equals("重型汽油车")) {
	      return "zqc";
	    }
	    if (cllb.equals("轻型柴油车")) {
	      return "qcc";
	    }
	    if (cllb.equals("重型柴油车")) {
	      return "zcc";
	    }
	    if (cllb.equals("重型柴油机")) {
	      return "zcj";
	    }
	    if (cllb.equals("重型汽油机")) {
	      return "zqj";
	    }
	    if (cllb.equals("摩托车")) {
	      return "mtc";
	    }
	    if (cllb.equals("轻便摩托车")) {
	      return "qmc";
	    }
	    if (cllb.equals("农用运输车")) {
	      return "nyc";
	    }
	    if (cllb.equals("三轮汽车和低速货车")) {
	      return "nyc";
	    }
	    if (cllb.equals("燃气发动机(点燃式)")) {
	      return "rqj";
	    }
	    if (cllb.equals("重型燃气车(点燃式)")) {
	      return "rqc";
	    }
	    if(cllb.equals("电动车")){
	      return "ddc";
	    }
	    if (cllb.equals("轻型NG")){
	      return "ng";
	    }
	    if(cllb.equals("重型LPG车")){
	      return "lpgc";
	    }
	    if (cllb.equals("重型NG车")){
	      return "ngc";
	    }
	    if(cllb.equals("重型LPG机")){
	      return "lpgj";
	    }
	    if (cllb.equals("重型NG机")){
	      return "ngj";
	    }
	    if(cllb.equals("三轮汽车和低速货车用柴油机")){
	      return "nyj";
	    }
	    if (cllb.equals("轻型两用燃料车")){
	      return "qly";
	    }
	    if (cllb.equals("轻型燃气车")){
	      return "qrq";
	    }
	    if (cllb.equals("非道路移动机械用柴油机")){
	      return "cyj";
	    }
	    if (cllb.equals("重型汽油车(依据GB18352.3-2005型式核准)")){
	      return "zqc2";
	    }
	    if (cllb.equals("重型柴油车(依据GB18352.3-2005型式核准)")){
	      return "zcc2";
	    }
	    if (cllb.equals("非道路移动机械用小型点燃式发动机")){
	        return "xtj";
	      }
	    if (cllb.equals("非道路移动机械")){
	        return "fjx";
	      }


	    return null;
	  }
  
  /****/
  public static int strToint(String cllb) {
	
    if (cllb.equals("轻型汽油车")) {
      return Type.VEHICLE_QQ;
    }
    if (cllb.equals("重型汽油车")) {
      return Type.VEHICLE_ZQ;
    }
    if (cllb.equals("轻型柴油车")) {
      return Type.VEHICLE_QC;
    }
    if (cllb.equals("重型柴油车")) {
      return Type.VEHICLE_ZC;
    }
    if (cllb.equals("重型柴油机")) {
      return Type.VEHICLE_ZCJ;
    }
    if (cllb.equals("重型汽油机")) {
      return Type.VEHICLE_ZQJ;
    }
    if (cllb.equals("摩托车")) {
      return Type.VEHICLE_MT;
    }
    if (cllb.equals("轻便摩托车")) {
      return Type.VEHICLE_QM;
    }
    if (cllb.equals("农用运输车")) {
      return Type.VEHICLE_NY;
    }
    if (cllb.equals("三轮汽车和低速货车")) {
      return Type.VEHICLE_NY;
    }
    if (cllb.equals("燃气发动机(点燃式)")) {
      return Type.VEHICLE_RQJ;
    }
    if (cllb.equals("重型燃气车(点燃式)")) {
      return Type.VEHICLE_RQC;
    }
    if(cllb.equals("电动车")){
      return Type.VEHICLE_DDC;
    }
    if (cllb.equals("轻型NG")){
      return Type.VEHICLE_NG;
    }
    if(cllb.equals("重型LPG车")){
      return Type.VEHICLE_LPGC;
    }
    if (cllb.equals("重型NG车")){
      return Type.VEHICLE_NGC;
    }
    if(cllb.equals("重型LPG机")){
      return Type.VEHICLE_LPGJ;
    }
    if (cllb.equals("重型NG机")){
      return Type.VEHICLE_NGJ;
    }
    if(cllb.equals("三轮汽车和低速货车用柴油机")){
      return Type.VEHICLE_NYJ;
    }
    if (cllb.equals("轻型两用燃料车")){
      return Type.VEHICLE_QLY;
    }
    if (cllb.equals("轻型燃气车")){
      return Type.VEHICLE_QRQ;
    }
    if (cllb.equals("非道路移动机械用柴油机")){
      return Type.VEHICLE_CYJ;
    }
    if (cllb.equals("重型汽油车(依据GB18352.3-2005型式核准)")){
      return Type.VEHICLE_ZQC2;
    }
    if (cllb.equals("重型柴油车(依据GB18352.3-2005型式核准)")){
      return Type.VEHICLE_ZCC2;
    }
    if (cllb.equals("非道路移动机械用小型点燃式发动机")){
        return Type.VEHICLE_XTJ;
      }
    if (cllb.equals("非道路移动机械")){
        return Type.VEHICLE_FJX;
      }


    return 999;
  }

  public static String strTostr(String cllb) {
     if (cllb.equals("3")) {
       return Type.VEHICLE_QQ+"";
     }
     if (cllb.equals("5")) {
       return Type.VEHICLE_ZQ+"";
     }
     if (cllb.equals("4")) {
       return Type.VEHICLE_QC+"";
     }
     if (cllb.equals("6")) {
       return Type.VEHICLE_ZC+"";
     }
     if (cllb.equals("7")) {
       return Type.VEHICLE_ZCJ+"";
     }
     if (cllb.equals("8")) {
       return Type.VEHICLE_ZQJ+"";
     }
     if (cllb.equals("1")) {
       return Type.VEHICLE_MT+"";
     }
     if (cllb.equals("0")) {
       return Type.VEHICLE_QM+"";
     }
     if (cllb.equals("2")) {
       return Type.VEHICLE_NY+"";
     }

     if (cllb.equals("A")) {
       return Type.VEHICLE_RQJ+"";
     }
     if (cllb.equals("9")) {
       return Type.VEHICLE_RQC+"";
     }
     if(cllb.equals("B")){
       return Type.VEHICLE_DDC+"";
     }
     if (cllb.equals("C")){
       return Type.VEHICLE_NG+"";
     }
     if(cllb.equals("D")){
       return Type.VEHICLE_LPGC+"";
     }
     if (cllb.equals("E")){
       return Type.VEHICLE_NGC+"";
     }
     if(cllb.equals("F")){
       return Type.VEHICLE_LPGJ+"";
     }
     if (cllb.equals("G")){
       return Type.VEHICLE_NGJ+"";
     }
     if(cllb.equals("H")){
       return Type.VEHICLE_NYJ+"";
     }
     if (cllb.equals("I")){
       return Type.VEHICLE_QLY+"";
     }
     if (cllb.equals("J")){
       return Type.VEHICLE_QRQ+"";
     }
     if (cllb.equals("N")){
       return Type.VEHICLE_CYJ+"";
     }
     if (cllb.equals("M")){
       return Type.VEHICLE_ZQC2+"";
     }
     if (cllb.equals("P")){
         return Type.VEHICLE_XTJ+"";
       }
     if (cllb.equals("Q")){
         return Type.VEHICLE_FJX+"";
       }
     return "999";
   }

  public static String getVehicleType(int v) {
    String strReturn = null;
    switch (v) {
      case Type.VEHICLE_QQ:
        strReturn = "轻型汽油车";
        break;
      case Type.VEHICLE_QC:
        strReturn = "轻型柴油车";
        break;
      case Type.VEHICLE_ZQ:
        strReturn = "重型汽油车";
        break;
      case Type.VEHICLE_ZC:
        strReturn = "重型柴油车";
        break;
      case Type.VEHICLE_ZCJ:
        strReturn = "重型柴油机";
        break;
      case Type.VEHICLE_ZQJ:
        strReturn = "重型汽油机";
        break;
      case Type.VEHICLE_NY:
        strReturn = "三轮汽车和低速货车";
        break;
      case Type.VEHICLE_MT:
        strReturn = "摩托车";
        break;
      case Type.VEHICLE_QM:
        strReturn = "轻便摩托车";
        break;
      case Type.VEHICLE_RQC:
        strReturn="重型燃气车(点燃式)";
        break;
      case Type.VEHICLE_RQJ:
        strReturn="燃气发动机(点燃式)";
        break;
      case Type.VEHICLE_DDC:
        strReturn="电动车";
        break;
      case Type.VEHICLE_NG:
        strReturn="轻型NG";
        break;
      case Type.VEHICLE_LPGC:
        strReturn="重型LPG车";
        break;
      case Type.VEHICLE_NGC:
        strReturn="重型NG车";
        break;
      case Type.VEHICLE_LPGJ:
        strReturn="重型LPG机";
        break;
      case Type.VEHICLE_NGJ:
        strReturn="重型NG机";
        break;
      case Type.VEHICLE_NYJ:
        strReturn="三轮汽车和低速货车用柴油机";
        break;
      case Type.VEHICLE_QLY:
        strReturn="轻型两用燃料车";
        break;
      case Type.VEHICLE_QRQ:
        strReturn="轻型燃气车";
        break;
      case Type.VEHICLE_CYJ:
        strReturn="非道路移动机械用柴油机";
        break;
      case Type.VEHICLE_ZQC2:
       strReturn="重型汽油车(依据GB18352.3-2005型式核准)";
       break;
     case Type.VEHICLE_ZCC2:
       strReturn="重型柴油车(依据GB18352.3-2005型式核准)";
       break;
     case Type.VEHICLE_XTJ:
       strReturn="非道路移动机械用小型点燃式发动机";
       break;
       
       /*
       //环境友好
     case Type.VEHICLE_ZCH:
         strReturn="重型柴油车(环境友好)";
         break;
     case Type.VEHICLE_LPGCH:
         strReturn="重型LPG车(环境友好)";
         break;
     case Type.VEHICLE_NGCH:
         strReturn="重型NG车(环境友好)";
         break;
     case Type.VEHICLE_NGJH:
         strReturn="重型NG发动机(环境友好)";
         break;
     case Type.VEHICLE_ZCJH:
         strReturn="重型柴油机(环境友好)";
         break;
     case Type.VEHICLE_LPGJH:
         strReturn="重型LPG发动机(环境友好)";
         break;
         */

     case Type.VEHICLE_FJX:
         strReturn="非道路移动机械";
         break;
         
      default:
        strReturn = "未定义类别";
    }
    return strReturn;
  }
  public static String getVehicleLb(int v) {
	  String strReturn = null;
	  switch (v) {
	  case Type.VEHICLE_QQ:
		  strReturn = "qqc";
		  break;
	  case Type.VEHICLE_QC:
		  strReturn = "qcc";
		  break;
	  case Type.VEHICLE_ZQ:
		  strReturn = "zqc";
		  break;
	  case Type.VEHICLE_ZC:
		  strReturn = "zcc";
		  break;
	  case Type.VEHICLE_ZCJ:
		  strReturn = "zcj";
		  break;
	  case Type.VEHICLE_ZQJ:
		  strReturn = "zqj";
		  break;
	  case Type.VEHICLE_NY:
		  strReturn = "ny";
		  break;
	  case Type.VEHICLE_MT:
		  strReturn = "mtc";
		  break;
	  case Type.VEHICLE_QM:
		  strReturn = "qmc";
		  break;
	  case Type.VEHICLE_RQC:
		  strReturn="rqc";
		  break;
	  case Type.VEHICLE_RQJ:
		  strReturn="rqj";
		  break;
	  case Type.VEHICLE_DDC:
		  strReturn="ddc";
		  break;
	  case Type.VEHICLE_NG:
		  strReturn="qng";
		  break;
	  case Type.VEHICLE_LPGC:
		  strReturn="zlpgc";
		  break;
	  case Type.VEHICLE_NGC:
		  strReturn="zng";
		  break;
	  case Type.VEHICLE_LPGJ:
		  strReturn="zlpgj";
		  break;
	  case Type.VEHICLE_NGJ:
		  strReturn="ngj";
		  break;
	  case Type.VEHICLE_NYJ:
		  strReturn="nyj";
		  break;
	  case Type.VEHICLE_QLY:
		  strReturn="qly";
		  break;
	  case Type.VEHICLE_QRQ:
		  strReturn="qrqc";
		  break;
	  case Type.VEHICLE_CYJ:
		  strReturn="cyj";
		  break;
	  case Type.VEHICLE_ZQC2:
		  strReturn="重型汽油车(依据GB18352.3-2005型式核准)";
		  break;
	  case Type.VEHICLE_ZCC2:
		  strReturn="重型柴油车(依据GB18352.3-2005型式核准)";
		  break;
	  case Type.VEHICLE_XTJ:
		  strReturn="xtj";
		  break;
		  
		  /*
       //环境友好
     case Type.VEHICLE_ZCH:
         strReturn="重型柴油车(环境友好)";
         break;
     case Type.VEHICLE_LPGCH:
         strReturn="重型LPG车(环境友好)";
         break;
     case Type.VEHICLE_NGCH:
         strReturn="重型NG车(环境友好)";
         break;
     case Type.VEHICLE_NGJH:
         strReturn="重型NG发动机(环境友好)";
         break;
     case Type.VEHICLE_ZCJH:
         strReturn="重型柴油机(环境友好)";
         break;
     case Type.VEHICLE_LPGJH:
         strReturn="重型LPG发动机(环境友好)";
         break;
		   */
		  
	  case Type.VEHICLE_FJX:
		  strReturn="非道路移动机械";
		  break;
		  
	  default:
		  strReturn = "未定义类别";
	  }
	  return strReturn;
  }

  /**
   *  根据检验报告返回车辆类别JC00-TA_NO3-000002
   *  根据申报编号返回SEPA-TA6-00000435
   *  **/
  public static int vehicleType(String jybgbh) {

    if (jybgbh.length() == 18) {
      if (jybgbh.substring(10,11).equals("A"))
        return 'A';
      if (jybgbh.substring(10,11).equals("B"))
        return 'B';
      if (jybgbh.substring(10,11).equals("C"))
        return 'C';
      if (jybgbh.substring(10,11).equals("E"))
        return 'E';
      if (jybgbh.substring(10,11).equals("F"))
        return 'F';
      return StringUtil.strToInt(jybgbh.substring(10, 11));
    }
    else if (jybgbh.length() == 17) {
      if (jybgbh.substring(7,8).equals("A"))
        return 'A';
      if (jybgbh.substring(7,8).equals("B"))
        return 'B';
      if (jybgbh.substring(7,8).equals("C"))
        return 'C';
      if (jybgbh.substring(7,8).equals("E"))
        return 'E';
      if (jybgbh.substring(7,8).equals("F"))
        return 'F';
      return StringUtil.strToInt(jybgbh.substring(7, 8));
    }
   if (jybgbh.length() == 14) {
   if (jybgbh.substring(5,6).equals("A"))
     return 'A';
   if (jybgbh.substring(5,6).equals("B"))
     return 'B';
   if (jybgbh.substring(5,6).equals("C"))
     return 'C';
   if (jybgbh.substring(5,6).equals("E"))
     return 'E';
   if (jybgbh.substring(5,6).equals("F"))
     return 'F';
   if (jybgbh.substring(5,6).equals("N"))
     return 'N';
   if (jybgbh.substring(5,6).equals("P"))
     return 'P';
   return StringUtil.strToInt(jybgbh.substring(5, 6));
 }

    else {
      return 0;
    }
  }

  /** 根据检验报告返回配置类别 **/
  public static int configType(String jybgbh) {
    return configTypeBySx(jybgbh.substring(8, 10));
  }

  /** 根据缩写返回配置配别 **/
  public static int configTypeBySx(String sx) {
    if (sx.equals("DS")) {
      return CONFIG_DS;
    }
    if (sx.equals("PF")) {
      return CONFIG_PF;
    }
    if (sx.equals("ZS")) {
      return CONFIG_ZS;
    }
    if (sx.equals("RY")) {
      return CONFIG_RY;
    }
    if (sx.equals("PQ")) {
      return CONFIG_PW;
    }
    if (sx.equals("QZ")) {
      return CONFIG_QZX;
    }
    if (sx.equals("NJ")) {
      return CONFIG_NJX;
    }
    if (sx.equals("FA")) {
      return Type.CONFIG_ZYJS;
    }
    if (sx.equals("FL")) {
      return Type.CONFIG_QFH;
    }
    if(sx.equals("OB")){
      return Type.CONFIG_OBD;
    }
    if(sx.equals("SD")){
      return Type.CONFIG_SDS;
    }
    if(sx.equals("YH")){
      return Type.CONFIG_YH;
    }
    if(sx.equals("PD")){
      return Type.CONFIG_PQYD;
    }
    if(sx.equals("PW")){
      return Type.CONFIG_PW2;
    }
    if(sx.equals("CW")){
    	return Type.CONFIG_CW;
    }
    if(sx.equals("DW")){
    	return Type.CONFIG_DW;
    }
    if(sx.equals("JS")){
    	return Type.CONFIG_GJS;
    }
    if(sx.equals("SB")){
    	return Type.CONFIG_SBC;
    }
   

    return 999;
  }

  public int vehicleType() {
    return this.vehicleType;
  }

  public static String configName(String jybgbh) {
    return Type.configName(configType(jybgbh));
  }

  public static String configName(int configType) {
    String name;
    switch (configType) {
      case Type.CONFIG_ZS:
        name = "加速行驶车外噪声";
        break;
      case Type.CONFIG_RY:
        name = "燃油蒸发";
        break;
      case Type.CONFIG_DS:
        name = "怠速";
        break;
      case Type.CONFIG_PW:
        name = "排气污染";
        break;
      case Type.CONFIG_QZX:
        name = "曲轴箱";
        break;
      case Type.CONFIG_NJX:
        name = "耐久性";
        break;
      case Type.CONFIG_ZYJS:
        name = "自由加速烟度";
        break;
      case Type.CONFIG_QFH:
        name = "全负荷烟度";
        break;
      case Type.CONFIG_PF:
        name = "排放怠速曲轴箱";
        break;
      case Type.CONFIG_OBD:
        name = "OBD";
        break;
      case Type.CONFIG_SDS:
        name = "双怠速";
        break;
      case Type.CONFIG_YH:
        name = "油耗";
        break;
      case Type.CONFIG_PQYD:
        name="排气烟度";
        break;
      case Type.CONFIG_ZHQ_YEAR:
          name="催化器";
          break;
      case Type.CONFIG_TG_YEAR:
          name="炭罐";
          break;
      case Type.CONFIG_CW:
    	  name="常温";
    	  break;
      default:
        name = "未知类别";
    }
    return CodeUtil.unicodeToGB(name);
  }
  

  public static String getBgNameChinese(int configType) {
    String name;
    switch (configType) {
      case Type.CONFIG_ZS:
        name = "加速行驶车外噪声";
        break;
      case Type.CONFIG_RY:
        name = "燃油蒸发";
        break;
      case Type.CONFIG_DS:
        name = "怠速";
        break;
      case Type.CONFIG_PW:
        name = "排气污染";
        break;
      case Type.CONFIG_QZX:
        name = "曲轴箱";
        break;
      case Type.CONFIG_NJX:
        name = "耐久性";
        break;
      case Type.CONFIG_ZYJS:
        name = "自由加速烟度";
        break;
      case Type.CONFIG_QFH:
        name = "全负荷烟度";
        break;
      case Type.CONFIG_PF:
        name = "排放怠速曲轴箱";
        break;
      case Type.CONFIG_OBD:
        name = "OBD";
        break;
      case Type.CONFIG_SDS:
        name = "双怠速";
        break;
      case Type.CONFIG_YH:
        name = "油耗";
        break;
      case Type.CONFIG_PQYD:
          name="排气烟度";
          break; 
      case Type.CONFIG_CW:
          name="常温";
          break; 
      case Type.CONFIG_DW:
          name="低温";
          break; 
      case Type.CONFIG_SBC:
          name="SBC";
          break; 
      case Type.CONFIG_GJS:
          name="贵金属";
          break;  
      default:
        name = "未知类别";
    }
    return name;
  }
  

  public static String getBglx(int b){
    String bglx=null;
    switch(b){
      case(Type.CONFIG_PW):bglx="PQ";break;
      case(Type.CONFIG_DS):bglx="DS";break;
      case(Type.CONFIG_RY):bglx="RY";break;
      case(Type.CONFIG_QZX):bglx="QZ";break;
      case(Type.CONFIG_ZS):bglx="ZS";break;
      case(Type.CONFIG_ZYJS):bglx="FA";break;
      case(Type.CONFIG_QFH):bglx="FL";break;
      case(Type.CONFIG_PF):bglx="PF";break;
      case(Type.CONFIG_OBD):bglx="OB";break;
      case(Type.CONFIG_SDS):bglx="SD";break;
      case(Type.CONFIG_YH):bglx="YH";break;
      case(Type.CONFIG_PQYD):bglx="PD";break;
      case(Type.CONFIG_NJX):bglx="NJ";break;
    }
    return bglx;
  }

  public static int getVehicleTypeByPlan(String jhsbh){
    String tmp="J070-42-000192";
    if (jhsbh==null||jhsbh.trim().length()<14)
      return 0;
    else
      return StringUtil.strToInt(jhsbh.substring(5,6));
  }

  public static void main(String[] args) {
    Type.configName("JC03-TA_PD7-048990");
  }

  public String toDate(String strDate){
    if (strDate==null)
      return "--";
    Date date=DateUtil.strToDate(strDate);
    return ((DateUtil.getMonth(date)+1)+"-"+DateUtil.getDayOfMonth(date)+"-"+DateUtil.getYear(date));
  }

  private static void psz(int[] x) {
    for (int i = 0; i < x.length; i++) {
      System.err.print(x[i]);
    }
  }

}