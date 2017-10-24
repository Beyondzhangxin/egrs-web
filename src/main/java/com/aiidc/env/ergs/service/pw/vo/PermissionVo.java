/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw.vo;

import java.util.ArrayList;
import java.util.List;

import com.aiidc.env.ergs.jpa.po.pw.Permission;

/**
 * @author wuwenjun
 *
 */
public class PermissionVo {

	private Long id;

	private String name;

	private String code;

	private String url;

	private boolean operation = false;

	private boolean hasPermission = false;

	private List<PermissionVo> children = new ArrayList<PermissionVo>();

	public PermissionVo(Permission permission) {
		super();
		id = permission.getPermissionId();
		name = permission.getName();
		code = permission.getCode();
		url = permission.getUrl();
		operation = permission.isOperation();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getUrl() {
		return url;
	}

	public boolean isOperation() {
		return operation;
	}

	public List<PermissionVo> getChildren() {
		return children;
	}

	public void addChildren(PermissionVo element) {
		children.add(element);
		for (PermissionVo permissionVo : children) {
			if (permissionVo.hasPermission) {
				this.hasPermission = true;
			}
		}
	}

	public boolean isHasPermission() {
		return hasPermission;
	}

	public void setHasPermission(boolean hasPermission) {
		this.hasPermission = hasPermission;
	}

}
