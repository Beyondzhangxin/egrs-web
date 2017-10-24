package com.aiidc.env.ergs.common.db;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;

@Retention(RUNTIME)
@Target({ TYPE, METHOD })
public @interface TargetDataSource {
	@AliasFor("value")
	String name() default "";

	@AliasFor("name")
	String value() default "";
}
