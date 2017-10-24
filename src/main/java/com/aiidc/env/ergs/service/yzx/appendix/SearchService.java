/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.yzx.appendix;

import org.springframework.data.domain.Page;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.OriginalCar;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.TeAppendix;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.QqcMain;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.view.QccSourceVehicleType;

/**
 * @author jiabin fan
 *
 */
public interface SearchService {
	public Page<QqcMain> search(OriginalCar originalCar, QryPageVo qryVo);

	public Page<TeAppendix> searchTe(OriginalCar originalCar, QryPageVo qryVo);

	public Page<QccSourceVehicleType> searchAll(OriginalCar originalCar, QryPageVo qryVo);

}
