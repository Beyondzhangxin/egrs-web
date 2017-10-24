/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aiidc.env.ergs.common.vo.JsonMessage;
import com.aiidc.env.ergs.constant.InforPub;

/**
 * @author jiabin fan
 *
 */
public interface FilterService {
	JsonMessage filter(Map<String,List> map ,String pf,String vehicle,List jybgbhList);
}
