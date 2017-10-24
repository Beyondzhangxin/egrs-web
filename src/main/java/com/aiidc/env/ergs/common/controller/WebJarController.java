/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerMapping;
import org.webjars.WebJarAssetLocator;

import springfox.documentation.annotations.ApiIgnore;

/**
 * @author wuwenjun
 *
 */
@Controller
@RequestMapping("webjarslocator")
@ApiIgnore
public class WebJarController {
	private final WebJarAssetLocator assetLocator = new WebJarAssetLocator();

	@ResponseBody
	@RequestMapping("/{webjar}/**")
	public ResponseEntity locateWebjarAsset(@PathVariable String webjar, HttpServletRequest request) {
		try {
			String mvcPrefix = "/webjarslocator/" + webjar + "/";
			String mvcPath = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
			String fullPath = assetLocator.getFullPath(webjar, mvcPath.substring(mvcPrefix.length()));
			return new ResponseEntity(new ClassPathResource(fullPath), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
