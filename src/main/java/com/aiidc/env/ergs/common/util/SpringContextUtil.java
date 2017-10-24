/**
 * 
 */
package com.aiidc.env.ergs.common.util;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author wuwen
 *
 */
@Component("springContextUtil")
public class SpringContextUtil implements ApplicationContextAware {
	// Spring应用上下文环境
	private static ApplicationContext applicationContext;

	/**
	 * 实现ApplicationContextAware接口的回调方法，设置上下文环境
	 * 
	 * @param applicationContext
	 */
	public void setApplicationContext(ApplicationContext applicationContext) {
		SpringContextUtil.applicationContext = applicationContext;
	}

	/**
	 * @return ApplicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 获取已注册的Bean
	 * 
	 * @param requiredType
	 * @return
	 * @throws BeansException
	 */
	public static <T> T getBean(Class<T> requiredType) throws BeansException {
		return applicationContext.getBean(requiredType);
	}

	/**
	 * 获取已注册的Bean
	 * 
	 * @param name
	 * @param requiredType
	 * @return
	 * @throws BeansException
	 */
	public static <T> T getBean(String name, Class<T> requiredType) throws BeansException {
		return applicationContext.getBean(name, requiredType);
	}

	/**
	 * 获取已注册的Bean
	 * 
	 * @param requiredType
	 * @return
	 * @throws BeansException
	 */
	public static <T> Map<String, T> getBeansOfType(Class<T> requiredType) throws BeansException {
		return applicationContext.getBeansOfType(requiredType);
	}

	/**
	 * 注册bean,只适用于单例
	 * 
	 * @param beanName
	 * @param singletonObject
	 */
	public static void registBean(String beanName, Object singletonObject) {
		// 获取BeanFactory
		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext
				.getAutowireCapableBeanFactory();
		defaultListableBeanFactory.registerSingleton(beanName, singletonObject);
	}

	/**
	 * 刷新bean定义
	 * 
	 */
	public static void refresh() {
		if (applicationContext instanceof ConfigurableApplicationContext) {
			((ConfigurableApplicationContext) applicationContext).refresh();
		}
	}

}
