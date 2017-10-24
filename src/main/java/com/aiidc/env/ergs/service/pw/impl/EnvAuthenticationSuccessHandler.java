/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.service.pw.impl;

import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import com.aiidc.env.ergs.jpa.po.pw.User;
import com.aiidc.env.ergs.jpa.repo.pw.UserDao;
import com.aiidc.env.ergs.service.pw.vo.EnvUserDetails;

/**
 * @author wuwenjun
 *
 */
@Service
public class EnvAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
	@Resource
	private UserDao dao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.web.authentication.
	 * SavedRequestAwareAuthenticationSuccessHandler#onAuthenticationSuccess(
	 * javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse,
	 * org.springframework.security.core.Authentication)
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		try {
			User user = (User) ((EnvUserDetails) authentication.getPrincipal()).getDetail();
			boolean firstTimeLogin = (user.getLastLoginTime() == null);
			user.setLastLoginTime(new Date());
			dao.save(user);
			if (user.isSuperAdmin()) {
				getRedirectStrategy().sendRedirect(request, response, "/egrs/audit/index");
				return;
			} else if (firstTimeLogin) {
				getRedirectStrategy().sendRedirect(request, response, "/egrs/pw/user/password");
				return;
			} else {
				super.onAuthenticationSuccess(request, response, authentication);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
