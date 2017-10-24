/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw.util;

import java.util.ArrayList;
import java.util.List;

import com.aiidc.env.ergs.jpa.po.pw.Permission;
import com.aiidc.env.ergs.service.pw.vo.PermissionVo;

/**
 * @author wuwenjun
 *
 */
public class PermissionUtil {

	/**
	 * 获取用户权限信息
	 * 
	 * @param permissions
	 * @param premids
	 * @return
	 */
	public static List<PermissionVo> match(List<Permission> permissions, List<Long> premids) {
		List<PermissionVo> items = new ArrayList<PermissionVo>();
		for (Permission permission : permissions) {
			items.add(getPermissionVo(premids, permission));
		}
		return items;
	}

	private static PermissionVo getPermissionVo(List<Long> premids, Permission permission) {
		PermissionVo item = new PermissionVo(permission);
		if (premids == null) {// 特殊授权，admin等全部授权
			item.setHasPermission(true);
		} else {
			item.setHasPermission(premids.contains(item.getId()));
			if (permission.getCode().equalsIgnoreCase("logout")) {// 登出权限授权
				item.setHasPermission(true);
			}
			if (permission.getCode().equalsIgnoreCase("MODIFYPASSWORD")) {// 修改密码授权
				item.setHasPermission(true);
			}
			if (permission.getCode().equalsIgnoreCase("SELFMESSAGE")) {// 个人信息授权
				item.setHasPermission(true);
			}
		}
		List<Permission> children = permission.getChildren();
		if (children != null && !children.isEmpty()) {
			for (Permission child : children) {
				item.addChildren(getPermissionVo(premids, child));
			}
		}
		return item;
	}
}
