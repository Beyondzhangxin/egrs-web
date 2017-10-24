/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.pw.Permission;
import com.aiidc.env.ergs.jpa.repo.pw.PermissionDao;
import com.aiidc.env.ergs.service.pw.PermissionService;

/**
 * @author wuwenjun
 *
 */
@Service
@CacheConfig(cacheNames = "permissions")
public class PermissionServiceImpl implements PermissionService {

	@Resource
	private PermissionDao dao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.service.pw.PermissionService#findAllPermission(
	 * boolean)
	 */
	@Override
	@Cacheable(value = "permissiones", key = "#operation")
	public List<Permission> findAllPermission(boolean operation) {
		return dao.allPermission(operation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aiidc.env.ergs.service.pw.PermissionService#findAllPermission()
	 */
	@Override
	public List<Permission> findAllPermission() {
		return dao.allPermission();
	}

}
