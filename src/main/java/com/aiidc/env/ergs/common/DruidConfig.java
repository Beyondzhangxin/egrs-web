/**
 * 
 */
package com.aiidc.env.ergs.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;

@Configuration
@EnableTransactionManagement
@ConditionalOnProperty(name = "env.druid.path")
/**
 * Druid的DataResource配置类 凡是被Spring管理的类，实现接口 EnvironmentAware 重写方法 setEnvironment
 * 可以在工程启动时， 获取到系统环境变量和application配置文件中的变量。
 * 还有一种方式是采用注解的方式获取 @value("${变量的key值}") 获取application配置文件中的变量。 这里采用第一种要方便些
 */
public class DruidConfig {
	@Value("${env.druid.path}")
	private String path;
	@Value("${env.druid.login-username:druid}")
	private String loginUsername;
	@Value("${env.druid.login-username:druid}")
	private String loginPassword;
	@Value("${env.druid.reset-enable:false}")
	private String resetEnable;
	@Value("${env.druid.allow:}")
	private String allow;
	@Value("${env.druid.deny:}")
	private String deny;

	@Bean
	public ServletRegistrationBean druidServlet() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
		servletRegistrationBean.setServlet(new StatViewServlet());
		servletRegistrationBean.addUrlMappings(path);
		Map<String, String> initParameters = new HashMap<String, String>();
		initParameters.put("loginUsername", loginUsername);// 用户名
		initParameters.put("loginPassword", loginPassword);// 密码
		// 禁用HTML页面上的“Reset All”功能
		initParameters.put("resetEnable", resetEnable);
		// IP白名单 (没有配置或者为空，则允许所有访问)
		initParameters.put("allow", allow);
		// IP黑名单 (存在共同时，deny优先于allow)
		initParameters.put("deny", deny);
		servletRegistrationBean.setInitParameters(initParameters);
		return servletRegistrationBean;
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
		return filterRegistrationBean;
	}

	// 按照BeanId来拦截配置 用来bean的监控
	@Bean(value = "druid-stat-interceptor")
	public DruidStatInterceptor DruidStatInterceptor() {
		DruidStatInterceptor druidStatInterceptor = new DruidStatInterceptor();
		return druidStatInterceptor;
	}

	@Bean
	public BeanNameAutoProxyCreator beanNameAutoProxyCreator() {
		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
		beanNameAutoProxyCreator.setProxyTargetClass(true);
		// 设置要监控的bean的id
		// beanNameAutoProxyCreator.setBeanNames("sysRoleMapper","loginController");
		beanNameAutoProxyCreator.setInterceptorNames("druid-stat-interceptor");
		return beanNameAutoProxyCreator;
	}
}
