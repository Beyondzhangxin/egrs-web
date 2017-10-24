/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.o3;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;

import com.aiidc.env.ergs.common.manager.QryPageVo;
import com.aiidc.env.ergs.jpa.po.o3.E3Tmn;

/**
 * @author wuwenjun
 *
 */
public interface TmnService {
	public void save(E3Tmn item);

	public E3Tmn get(BigDecimal id);

	public void delete(BigDecimal... id);

	public Page<E3Tmn> find(QryPageVo qryVo, E3Tmn item);
	
	//根据manufid查询所有的商标
	public List<E3Tmn> findByManufid(String manufid);
}
