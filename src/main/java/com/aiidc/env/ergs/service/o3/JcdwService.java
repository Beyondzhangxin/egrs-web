/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3;

import org.springframework.data.domain.Page;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.o3.Jcdw;

/**
 * @author wuwenjun
 *
 */
public interface JcdwService {

	public void addAuth(String jcwdId);

	public void removeAuth(String jcwdId);

	public Page<Jcdw> find(QryPageVo qryVo);
}
