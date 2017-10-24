/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wuwenjun
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).genericModelSubstitutes(DeferredResult.class)
				.useDefaultResponseMessages(false).forCodeGeneration(true).pathMapping("/").select()
				.apis(RequestHandlerSelectors.basePackage("com.aiidc.env.ergs.controller")).build().apiInfo(apiInfo());
	}

	public ApiInfo apiInfo() {
		return new ApiInfoBuilder().contact(new Contact("吴文君", "", "wuwenjun@aiidc.com.cn")).title("机动车和非道路器械信息公开平台")
				.version("1.0.0").description("机动车和非道路器械信息公开平台接口文档").build();
	}
}
