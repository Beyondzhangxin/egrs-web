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
 * @author wuwenjun
 *
 */
public @interface MetroEditField {
	/**
	 * 输入框类型
	 * 
	 * @return
	 */
	String value() default "input";

	/**
	 * 提示文本
	 * 
	 * @return
	 */
	String placeholder() default "";

	/**
	 * 下拉框数据请求地址
	 * 
	 * @return
	 */
	String date() default "";

	/**
	 * 验证
	 * 
	 * @return
	 */
	MetroValidator validate() default @MetroValidator;

}
