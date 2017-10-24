/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;

import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.service.pw.vo.EnvUserDetails;

/**
 * @author wuwenjun
 *
 */
public class LoginUserUtil {

	private static final Logger log = LoggerFactory.getLogger(LoginUserUtil.class);

	public static EnvUserDetails getLoginUser() {
		try {
			return (EnvUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			log.info("未登录系统");
		}
		return null;
	}

	public static String getLoginUserName() {
		try {
			return SecurityContextHolder.getContext().getAuthentication().getName();
		} catch (Exception e) {
			log.info("未登录系统");
		}
		return null;
	}

	public static String getLoginManufid() {
		try {
			User user = (User) getLoginUser().getDetail();
			return user.getManufid();
		} catch (Exception e) {
			log.info("登录用户不存在");
		}
		return null;
	}

	public static Long getLogiUserId() {
		try {
			User user = (User) getLoginUser().getDetail();
			return user.getUserid();
		} catch (Exception e) {
			log.info("登录用户不存在");
		}
		return null;
	}

	public static User getLoginUserDetail() {
		try {
			return (User) getLoginUser().getDetail();
		} catch (Exception e) {
			log.info("登录用户不存在");
		}
		return null;
	}

	public static User updateUser(User user) {
		try {
			User lg = (User) getLoginUser().getDetail();
			if (lg.getUserid().equals(user.getUserid())) {
				getLoginUser().setDetail(user);
			}
			return (User) getLoginUser().getDetail();
		} catch (Exception e) {
			log.info("登录用户不存在");
		}
		return null;
	}

}
