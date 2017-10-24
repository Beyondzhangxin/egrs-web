/**
 * 
 */
package com.aiidc.env.ergs.common.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.alibaba.druid.util.StringUtils;

@Configuration
// @EnableWebSecurity: 禁用Boot的默认Security配置，配合@Configuration启用自定义配置
// （需要扩展WebSecurityConfigurerAdapter）
@EnableWebSecurity
// @EnableGlobalMethodSecurity(prePostEnabled = true): 启用Security注解，
// 例如最常用的@PreAuthorize
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Value("${env.druid.path:}")
	private String druidPath;

	@Autowired
	private EnvAuthenticationDetailsSource authenticationDetailsSource;

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired(required = false)
	private AuthenticationSuccessHandler successHandler;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(new EnvPasswordEncoder());
	}

	@Override
	// configure(HttpSecurity): Request层面的配置，对应XML Configuration中的<http>元素
	// 定义URL路径应该受到保护，哪些不应该
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/", "/index", "/favicon.ico", "/theme/**", "/webjarslocator/**", "/js/**", "/images/**",
						"/css/**", "/kaptcha/kaptcha.jpg", "/egrs/audit/regist")
				.permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login")
				.defaultSuccessUrl("/hello").authenticationDetailsSource(authenticationDetailsSource).permitAll().and()
				.logout().permitAll();
		// 登录成功操作
		if (successHandler != null) {
			http.formLogin().successHandler(successHandler);
		}
		// 数据库监控界面无需权限控制
		if (!StringUtils.isEmpty(druidPath)) {
			http.authorizeRequests().antMatchers(druidPath).permitAll();
		}
		// 开启cookie保存用户数据， 设置cookie有效期7天
		http.authorizeRequests().and().rememberMe().tokenValiditySeconds(60 * 60 * 24 * 7);
		http.sessionManagement().invalidSessionUrl("/login").maximumSessions(1);
		// 关闭csrf 防止循环定向
		http.csrf().disable();
	}

}
