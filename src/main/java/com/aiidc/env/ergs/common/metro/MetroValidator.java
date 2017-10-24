/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.metro;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
/**
 * 
 * @author wuwenjun
 *
 */
public @interface MetroValidator {
	/**
	 * 方法
	 * 
	 * @return
	 */
	String func() default "";

	/**
	 * 参数
	 * 
	 * @return
	 */
	String arg() default "";

	/**
	 * 提示文本
	 * 
	 * @return
	 */
	String hint() default "";
}
