/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.o3;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aiidc.env.ergs.jpa.po.o3.Scdwmc;

/**
 * @author jiabin fan
 *
 */
public interface ScdwmcDao extends CrudRepository<Scdwmc, Serializable>{
	//根据manufid查询生产企业名称；
	List<Scdwmc> findByManufid(String manufid);
}
