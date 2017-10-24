/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw;

import java.util.List;

import com.aiidc.env.ergs.jpa.po.pw.Permission;

/**
 * @author wuwenjun
 *
 */
public interface PermissionService {
	List<Permission> findAllPermission(boolean operation);

	List<Permission> findAllPermission();
}
