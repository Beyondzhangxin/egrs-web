/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ThemeResolver;

import springfox.documentation.annotations.ApiIgnore;

/**
 * @author wuwenjun
 *
 */
@Controller
@RequestMapping("person")
@ApiIgnore
public class PersonController {
	@Autowired
	private LocaleResolver localeResolver;

	@Autowired
	private ThemeResolver themeResolver;

	@RequestMapping(value = "locale", method = RequestMethod.GET)
	public String locale(HttpServletRequest request, HttpServletResponse response, String locale) {
		localeResolver.setLocale(request, response, new Locale(locale));
		return "redirect:/index";
	}

	@RequestMapping(value = "theme", method = RequestMethod.GET)
	public String theme(HttpServletRequest request, HttpServletResponse response, String theme) {
		themeResolver.setThemeName(request, response, theme);
		return "redirect:/index";
	}
}
