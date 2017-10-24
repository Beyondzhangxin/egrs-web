/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.impl.appendix;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.OriginalCar;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMain;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.view.QccSourceVehicleType;
import com.aiidc.env.ergs.service.yzx.appendix.SearchService;

/**
 * @author jiabin fan
 *
 */
@Service("qccSearchService")
public class QccSearchServiceImpl implements SearchService {

	/* 
	 * 
	 */
	/*
	 * @Override public String search(String clxh) { System.out.println("qcc");
	 * return "yzx/plan/appendix/appendixCreate"; }
	 */

	/* 
	 * 
	 */
	@Override
	public Page<QqcMain> search(OriginalCar originalCar, QryPageVo qryVo) {

		return null;
	}

	/* 
	 * 
	 */
	@Override
	public Page<TeAppendix> searchTe(OriginalCar originalCar, QryPageVo qryVo) {

		return null;
	}

	@Override
	public Page<QccSourceVehicleType> searchAll(OriginalCar originalCar, QryPageVo qryVo) {
		// TODO Auto-generated method stub
		return null;
	}

}
