/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

/**
 * @author wuwenjun
 *
 */
@ControllerAdvice
public class ControllerConfig {
	@Autowired
	ResourceUrlProvider resourceUrlProvider;

	@ModelAttribute("urls")
	public ResourceUrlProvider urls() {
		return this.resourceUrlProvider;
	}

}
