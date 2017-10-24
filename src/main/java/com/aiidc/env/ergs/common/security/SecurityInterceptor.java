/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wuwenjun
 *
 */
public class SecurityInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		if ("anonymousUser".equals(SecurityContextHolder.getContext().getAuthentication())
				|| SecurityContextHolder.getContext().getAuthentication() == null
				|| !SecurityContextHolder.getContext().getAuthentication().isAuthenticated()) {// 判断session里是否有用户信息
			if (request.getHeader("x-requested-with") != null
					&& request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
				// 如果是ajax请求响应头会有，x-requested-with；
				response.setHeader("sessionstatus", "timeout");// 在响应头设置session状态
				return false;
			}
		}
		return true;
	}

}
