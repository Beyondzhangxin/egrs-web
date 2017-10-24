/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.demo;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aiidc.env.ergs.common.mail.SendMailService;

import freemarker.template.TemplateException;

/**
 * @author wuwenjun
 *
 */
@Controller
@RequestMapping("demo")
public class DemoController {
	@Autowired
	private SendMailService service;

	@RequestMapping(value = "demo", method = RequestMethod.POST)
	public void select() throws MessagingException, IOException, TemplateException {
		String to = "wuwenjun@aiidc.com.cn";
		String subject = "【测试】发送模板邮件";
		String template = "welcome.ftl";
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("time", new Date());
		model.put("message", "这是测试的内容。。。");
		model.put("toUserName", "张三");
		model.put("fromUserName", "老许");
		Map<String, Object> attachment = new HashMap<String, Object>();
		attachment.put("favicon.ico", "static/favicon.ico");
		Map<String, Object> inline = new HashMap<String, Object>();
		attachment.put("favicon", "static/favicon.ico");
		service.sendMail(to, subject, template, model, attachment, inline);
	}
}
