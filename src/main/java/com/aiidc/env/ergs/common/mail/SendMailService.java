/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.mail;

import java.io.IOException;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import freemarker.template.TemplateException;

/**
 * @author wuwenjun
 *
 */
public interface SendMailService {

	/**
	 * 发送普通文本邮件
	 * 
	 * @param to
	 *            收件人
	 * @param subject
	 *            主题
	 * @param text
	 *            正文文本
	 * @throws MessagingException
	 */
	public void sendMail(String to, String subject, String text) throws MessagingException;

	/**
	 * 发送正文含图片且带附件的邮件
	 * 
	 * @param to
	 *            收件人
	 * @param subject
	 *            主题
	 * @param template
	 *            正文free marker模板文件路径
	 * @param model
	 *            free marker参数
	 * @param attachment
	 *            附件，key-文件名，vlaue-classpath路径或InputStreamSource;
	 * @param inline
	 *            正文中使用的资源文件，key-模板中cid:后的id，vlaue-classpath路径或Resource;
	 * @throws MessagingException
	 *             邮箱发送异常
	 * @throws IOException
	 *             模板以及资源文件读取异常
	 * @throws TemplateException
	 *             模板文件格式异常
	 */
	public void sendMail(String to, String subject, String template, Map<String, Object> model,
			Map<String, Object> attachment, Map<String, Object> inline)
			throws MessagingException, IOException, TemplateException;

	/**
	 * 发送邮件
	 * 
	 * @param message
	 *            邮件内容
	 * @throws MessagingException
	 */
	public void sendMail(MimeMessage message) throws MessagingException;

	/**
	 * 创建一个含有固定发件人的邮件内容
	 * 
	 * @return
	 * @throws MessagingException
	 */
	public MimeMessage createMimeMessage() throws MessagingException;

}
