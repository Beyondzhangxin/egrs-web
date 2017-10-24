/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.yzx.appendix.qqc;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.view.QccSourceVehicleType;
import com.aiidc.env.ergs.jpa.po.yzx.appendix.qqc.view.QccSourceVehicleTypeKey;

/**
 * @author wuwenjun
 *
 */
public interface QccSourceVehicleTypeDao
		extends PagingAndSortingRepository<QccSourceVehicleType, QccSourceVehicleTypeKey>,
		JpaSpecificationExecutor<QccSourceVehicleType> {

}
