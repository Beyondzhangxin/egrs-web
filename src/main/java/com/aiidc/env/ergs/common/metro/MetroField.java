/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.metro;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.aiidc.env.ergs.common.metro.converter.Converter;

@Retention(RUNTIME)
@Target(FIELD)
/**
 * @author wuwenjun
 *
 */
public @interface MetroField {

	/**
	 * 中文含义
	 * 
	 * @return
	 */
	String value() default "";

	/**
	 * 编辑字段配置
	 * 
	 * @return
	 */
	MetroEditField edit() default @MetroEditField;

	/**
	 * 是否需要在列表中显示
	 * 
	 * @return
	 */
	boolean list() default true;

	/**
	 * 排序
	 * 
	 * @return
	 */
	int order() default 0;

	/**
	 * 转换器
	 * 
	 * @return
	 */
	Converter convert() default Converter.NULL;

}
