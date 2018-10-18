/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.email;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import org.junit.Before;
import org.junit.Test;

import com.jw.base.framework.core.util.email.MailSender;
import com.jw.base.framework.core.util.email.MailSenderInfo;
/**
 * 
 * ## 类说明：
 * 	简单邮件（不带附件的邮件）发送器 测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月14日]
 * @package com.jw.platform.framework.core.util.email
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月14日|jianana|新增|MailSenderTest.java新增
 */
public class MailSenderTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSendTextMail() throws MessagingException {
		MailSenderInfo info = new MailSenderInfo();
		info.setSubject("邮件标题");
		info.setContent("邮件内容");
		info.setFromAddress("oa@ccs.org.cn");
		info.setUserName("oa");
		info.setPassword("Ccsoa123456");
		info.setToAddress("xufeng@ccsit.cn");
		info.setMailServerHost("mail.ccs.org.cn");
		info.setMailServerPort("25");
		info.setValidate(true);
		new MailSender().sendTextMail(info);
	}

	@Test
	public void testSendHtmlMail() throws MessagingException {
		MailSenderInfo info = new MailSenderInfo();
		info.setSubject("邮件标题");
		info.setContent("邮件内容");
		info.setFromAddress("oa@ccs.org.cn");
		info.setUserName("oa");
		info.setPassword("Ccsoa123456");
		info.setToAddress("xufeng@ccsit.cn");
		info.setMailServerHost("mail.ccs.org.cn");
		info.setMailServerPort("25");
		info.setValidate(true);
		MailSender.sendHtmlMail(info);
	}

	@Test
	public void testSendAttachFile() throws UnsupportedEncodingException {
		MailSenderInfo info = new MailSenderInfo();
		info.setSubject("邮件标题");
		info.setContent("邮件内容");
		info.setFromAddress("oa@ccs.org.cn");
		info.setUserName("oa");
		info.setPassword("Ccsoa123456");
		info.setToAddress("xufeng@ccsit.cn");
		info.setMailServerHost("mail.ccs.org.cn");
		info.setMailServerPort("25");
		info.setValidate(true);
		new MailSender().sendAttachFile(info);
	}

}
