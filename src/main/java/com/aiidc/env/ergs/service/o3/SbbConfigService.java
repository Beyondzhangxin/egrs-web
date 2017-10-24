/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3;

import java.util.Map;

import com.aiidc.env.ergs.constant.InforPub;
import com.aiidc.env.ergs.jpa.po.o3.E3SbbMx;
import com.aiidc.env.ergs.jpa.po.o3.E3Vehicles;

/**
 * @author wuwenjun
 *
 */
public interface SbbConfigService {
	void save(InforPub inforPub,E3Vehicles vehicle,Map map);

}
