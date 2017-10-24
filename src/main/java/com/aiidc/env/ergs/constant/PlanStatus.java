/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.constant;

/**
 * @author jiabin fan
 *
 */
public class PlanStatus {
	 /**未备案**/
	  public final static int PLAN_WBA=0;
	  
	  /**已备案**/
	  public final static int PLAN_YBA=1;
	  
	  /**申请修改中**/
	  public final static int PLAN_XGZ=2;
	  
	  /**申请中**/
	  public final static int PLAN_SQZ=3;
	  
	  /**被打回**/
	  public final static int PLAN_BDH=4;
	  
	  /**子公司申请**/
	  public final static int PLAN_ZGS=5;
	  
	  /**已备案申请修改**/
	  public final static int PLAN_BAXG=6;
	  
	  /**转化器申请中**/
	  public final static int PLAN_ZHQ_SQZ=7;
	  
	  /**转化器已备案**/
	  public final static int PLAN_ZHQ_YBA=8;
	  
	  /**转化器等待总公司申请中**/
	  public final static int PLAN_ZHQ_ZGS=9;
	  
	  /**催化转化器已封样**/
	  public final static int PLAN_ZHQ_YFY='A';
	  
	  /**催化转化器已解封**/
	  public final static int PLAN_ZHQ_YJF='B';
	  
	  /**催化转化器贵金属已通过**/
	  public final static int PLAN_ZHQ_GJSYTG='C';  

	  /**已审核待备案**/
	  public final static int PLAN_YSHDBA='D';
	  

	  /**已公开**/
	  public final static int PLAN_YGK='E';

	  public final static int PLAN_YRK='F';
}
