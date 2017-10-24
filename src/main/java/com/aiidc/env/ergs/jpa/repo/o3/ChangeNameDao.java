/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.o3;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aiidc.env.ergs.jpa.po.o3.ChangeName;

/**
 * @author jiabin fan
 *
 */
public interface ChangeNameDao extends CrudRepository<ChangeName, Long> {
	//根据旧名字获取新名字；
	@Query("select nname from ChangeName where oname= ?1 and lb='SCDWMC' AND flag='Y'")
	public String findByOname(String oldName);
}
