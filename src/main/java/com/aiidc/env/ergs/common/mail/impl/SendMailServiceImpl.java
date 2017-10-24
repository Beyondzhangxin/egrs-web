/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.mail.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.aiidc.env.ergs.common.mail.SendMailService;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * @author wuwenjun
 *
 */
@Service
public class SendMailServiceImpl implements SendMailService {
	@Autowired
	private JavaMailSender mailSender; // 自动注入的Bean

	@Value("${spring.mail.username}")
	private String username; // 读取配置文件中的参数

	@Value("${spring.mail.subject.prefix:}")
	String subjectPrefix = "";

	@Autowired(required = false)
	private Configuration configuration;

	@Override
	public void sendMail(String to, String subject, String text) throws MessagingException {
		MimeMessage message = createMimeMessage();
		message.setRecipients(RecipientType.TO, to);
		message.setSubject(subjectPrefix + subject);
		message.setText(text);
		mailSender.send(message);
	}

	@Override
	public void sendMail(MimeMessage message) throws MessagingException {
		mailSender.send(message);
	}

	@Override
	public MimeMessage createMimeMessage() throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		message.setSubject(subjectPrefix + message.getSubject());
		message.setFrom(username);
		return message;
	}

	@Override
	public void sendMail(String to, String subject, String template, Map<String, Object> model,
			Map<String, Object> attachment, Map<String, Object> inline)
			throws MessagingException, IOException, TemplateException {
		MimeMessage msg = createMimeMessage();
		msg.addRecipients(RecipientType.TO, to);
		msg.setSubject(subjectPrefix + subject);
		MimeMessageHelper helper = new MimeMessageHelper(msg, true);
		if (model == null) {
			model = new HashMap<String, Object>();
		}
		Template t = configuration.getTemplate("email/" + template);
		String text = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);
		helper.setText(text, true);
		if (inline != null && !inline.isEmpty()) {
			for (Map.Entry<String, Object> entry : inline.entrySet()) {
				if (entry.getValue() instanceof String) {
					helper.addInline(entry.getKey(), new ClassPathResource((String) entry.getValue()));
				} else if (entry.getValue() instanceof Resource) {
					helper.addInline(entry.getKey(), (Resource) entry.getValue());
				}
			}
		}
		if (attachment != null && !attachment.isEmpty()) {
			for (Map.Entry<String, Object> entry : attachment.entrySet()) {
				if (entry.getValue() instanceof String) {
					helper.addAttachment(entry.getKey(), new ClassPathResource((String) entry.getValue()));
				} else if (entry.getValue() instanceof InputStreamSource) {
					helper.addAttachment(entry.getKey(), (InputStreamSource) entry.getValue());
				}
			}
		}
		mailSender.send(msg);
	}
}
