/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.jpa.repo.pw;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aiidc.env.ergs.jpa.po.pw.Permission;

/**
 * @author wuwenjun
 *
 */
@Repository
public interface PermissionDao extends CrudRepository<Permission, Long> {
	@Query("from Permission where parent is null and operation=?1")
	List<Permission> allPermission(boolean operation);

	@Query("from Permission where parent is null")
	List<Permission> allPermission();
}
