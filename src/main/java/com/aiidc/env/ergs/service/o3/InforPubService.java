/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.aiidc.env.ergs.constant.InforPub;
import com.aiidc.env.ergs.jpa.po.o3.E3Sbb;
import com.aiidc.env.ergs.jpa.po.o3.E3SbbMx;
import com.aiidc.env.ergs.jpa.po.o3.E3SbbXzmx;
import com.aiidc.env.ergs.jpa.po.o3.E3Vehicles;


/**
 * @author jiabin fan
 *
 */
public interface InforPubService {
	Page<E3Vehicles> findInfor( String manufid ,String clxh,String fdjxh,String xzmc,Pageable pageable);

	
	E3Vehicles findByCxid(Long cxid);


	/**
	 * @param e3Sbb
	 * @param inforPub
	 * @param vehicle
	 */
	void saveSbb(E3Sbb e3Sbb, InforPub inforPub, E3Vehicles vehicle);


	/**
	 * @param e3SbbXzmx
	 * @param inforPub
	 * @param vehicle
	 */
	void saveSbbXzmx(E3SbbXzmx e3SbbXzmx, InforPub inforPub, E3Vehicles vehicle);


	/**
	 * @param e3SbbMx
	 * @param inforPub
	 * @param vehicle
	 */
	void saveSbbMx(E3SbbMx e3SbbMx, InforPub inforPub, E3Vehicles vehicle,Map<String,Object> map);


	/**
	 * @param inforPub
	 * @param map
	 */
	void saveSbbConfig(InforPub inforPub, Map map);


	/**
	 * @param wz
	 * @param sbbh
	 */
	void savewz(String wz, String sbbh);
	
}
