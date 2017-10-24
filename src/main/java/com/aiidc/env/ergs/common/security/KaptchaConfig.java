/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.security;

import javax.servlet.ServletException;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.code.kaptcha.servlet.KaptchaServlet;

/**
 * @author wuwenjun
 *
 */
@Configuration
public class KaptchaConfig {

	@Bean
	public ServletRegistrationBean kaptchaServlet() throws ServletException {
		return new ServletRegistrationBean(new KaptchaServlet(), "/kaptcha/kaptcha.jpg");
	}
}
