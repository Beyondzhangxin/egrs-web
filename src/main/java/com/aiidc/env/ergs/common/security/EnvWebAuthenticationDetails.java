/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.security;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import com.google.code.kaptcha.Constants;

/**
 * @author wuwenjun
 *
 */
public class EnvWebAuthenticationDetails extends WebAuthenticationDetails {

	private String code;

	/**
	 * 
	 */
	private static final long serialVersionUID = 217235679215801028L;

	public EnvWebAuthenticationDetails(HttpServletRequest request) {
		super(request);
		String kaptcha = request.getParameter("kaptcha");
		String kaptchaExpected = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
		if (kaptcha != null && !kaptcha.equalsIgnoreCase(kaptchaExpected)) {
			throw new BadCredentialsException("验证码错误");
		}
		code = request.getParameter("code");
	}

	public String getCode() {
		return code;
	}

}
