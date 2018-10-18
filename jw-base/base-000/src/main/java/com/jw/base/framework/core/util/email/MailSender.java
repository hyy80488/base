/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.email;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

/**
 * ## 类说明：
 * 	简单邮件（不带附件的邮件）发送器 
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.email
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|MailSender.java新增
 */
public class MailSender {
	/**
	 * ## 方法说明：
	 * 	以文本格式发送邮件
	 * @param mailInfo 待发送的邮件的信息
	 */
	public boolean sendTextMail(MailSenderInfo mailInfo) {
		// 判断是否需要身份认证
		MailAuthenticator authenticator = null;
		Properties pro = mailInfo.getProperties();
		if (mailInfo.isValidate()) {
			// 如果需要身份认证，则创建一个密码验证器
			authenticator = new MailAuthenticator(mailInfo.getUserName(), mailInfo.getPassword());
		}
		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
		Session sendMailSession = Session.getInstance(pro, authenticator);
		try {
			// 根据session创建一个邮件消息
			Message mailMessage = new MimeMessage(sendMailSession);
			// 创建邮件发送者地址
			Address from = new InternetAddress(mailInfo.getFromAddress());
			// 设置邮件消息的发送者
			mailMessage.setFrom(from);
			// 创建邮件的接收者地址，并设置到邮件消息中
			Address to = new InternetAddress(mailInfo.getToAddress());
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			// 设置邮件消息的主题
			mailMessage.setSubject(mailInfo.getSubject());
			// 设置邮件消息发送的时间
			mailMessage.setSentDate(new Date());
			// 设置邮件消息的主要内容
			String mailContent = mailInfo.getContent();
			mailMessage.setText(mailContent);
			// 发送邮件
			Transport.send(mailMessage);
			return true;
		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	/**
	 * ## 方法说明：
	 * 	以HTML格式发送邮件
	 * @param mailInfo 待发送的邮件信息
	 */
	public static boolean sendHtmlMail(MailSenderInfo mailInfo) throws MessagingException {
		// 判断是否需要身份认证
		MailAuthenticator authenticator = null;
		Properties pro = mailInfo.getProperties();
		// 如果需要身份认证，则创建一个密码验证器
		if (mailInfo.isValidate()) {
			authenticator = new MailAuthenticator(mailInfo.getUserName(), mailInfo.getPassword());
		}
		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
		Session sendMailSession = Session.getInstance(pro, authenticator);

		// 根据session创建一个邮件消息
		Message mailMessage = new MimeMessage(sendMailSession);
		// 创建邮件发送者地址
		Address from = new InternetAddress(mailInfo.getFromAddress());
		// 设置邮件消息的发送者
		mailMessage.setFrom(from);
		// 创建邮件的接收者地址，并设置到邮件消息中
		// Address to = new InternetAddress(mailInfo.getToAddress());
		// Message.RecipientType.TO属性表示接收者的类型为TO
		// mailMessage.setRecipient(Message.RecipientType.TO, to);
		mailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailInfo.getToAddress()));
		// 设置邮件消息的主题
		mailMessage.setSubject(mailInfo.getSubject());
		// 设置邮件消息发送的时间
		mailMessage.setSentDate(new Date());
		// MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象
		Multipart mainPart = new MimeMultipart();
		// 创建一个包含HTML内容的MimeBodyPart
		BodyPart html = new MimeBodyPart();
		// 设置HTML内容
		html.setContent(mailInfo.getContent(), "text/html; charset=utf-8");
		mainPart.addBodyPart(html);
		// 将MiniMultipart对象设置为邮件内容
		mailMessage.setContent(mainPart);
		// 发送邮件
		Transport.send(mailMessage);
		return true;
	}

	/**
	 * ## 方法说明：
	 * 	发送邮件带附件
	 * @param mailInfo
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public boolean sendAttachFile(MailSenderInfo mailInfo) throws UnsupportedEncodingException {
		// 判断是否需要身份认证
		MailAuthenticator authenticator = null;
		Properties pro = mailInfo.getProperties();
		if (mailInfo.isValidate()) {
			// 如果需要身份认证，则创建一个密码验证器
			authenticator = new MailAuthenticator(mailInfo.getUserName(), mailInfo.getPassword());
		}
		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
		Session sendMailSession = Session.getInstance(pro, authenticator);
		try {
			// 根据session创建一个邮件消息
			Message mailMessage = new MimeMessage(sendMailSession);
			// 创建邮件发送者地址
			Address from = new InternetAddress(mailInfo.getFromAddress());
			// 设置邮件消息的发送者
			mailMessage.setFrom(from);
			// 创建邮件的接收者地址，并设置到邮件消息中
			String[] addr = dupAddrFilter(mailInfo.getToAddress(), mailInfo.getToCopyAddress());
			Address[] to = InternetAddress.parse(addr[0]);
			// Address to = new InternetAddress(mailInfo.getToAddress());
			mailMessage.setRecipients(Message.RecipientType.TO, to);
			// 抄送
			Address[] toCopy = InternetAddress.parse(addr[1]);
			mailMessage.setRecipients(Message.RecipientType.CC, toCopy);
			// 设置邮件消息的主题
			mailMessage.setSubject(mailInfo.getSubject());
			// 设置邮件消息发送的时间
			mailMessage.setSentDate(new Date());
			// 设置邮件消息的主要内容
			String mailContent = mailInfo.getContent();

			// 添加正文内容
			MimeMultipart multipart = new MimeMultipart();
			BodyPart msgBodyPart = new MimeBodyPart();// 用来放置文本内容
			msgBodyPart.setContent(mailContent, "text/html; charset=utf-8");
			multipart.addBodyPart(msgBodyPart);

			// 挂附件
			BodyPart attBodyPart;
			DataSource ds;
			if (mailInfo.getAttachFileNames() != null && mailInfo.getAttachFileNames().length > 0) {
				for (int i = 0; i < mailInfo.getAttachFileNames().length; i++) {
					attBodyPart = new MimeBodyPart();// 用来放置附件
					ds = new FileDataSource(new File(mailInfo.getAttachFileUrl()[i]));
					attBodyPart.setDataHandler(new DataHandler(ds));// 设置DataHandler
					attBodyPart.setFileName(MimeUtility.encodeText(mailInfo.getAttachFileNames()[i]));// 附件的显示名字
					multipart.addBodyPart(attBodyPart);
				}
			}

			mailMessage.setContent(multipart);

			// 发送邮件
			Transport.send(mailMessage);
			System.out.println("发送成功");
			return true;
		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	/**
	 * ## 方法说明：
	 * 	重复地址过滤
	 * @return
	 */
	private String[] dupAddrFilter(String to, String cc) {
		Set<String> setTo = getAddrSet(to);
		Set<String> setCc = getAddrSet(cc);
		if (setTo != null && setTo.size() > 0 && setCc != null && setCc.size() > 0) {
			for (String addr : setTo) {
				setCc.remove(addr);
			}
		}
		String[] addr = new String[2];
		addr[0] = getAddrStr(setTo);
		addr[1] = getAddrStr(setCc);
		return addr;
	}

	/**
	 * ## 方法说明：
	 * 	将字符串地址xx,ccc,ccc 转换为Set集合
	 * @param address
	 * @return
	 */
	private Set<String> getAddrSet(String address) {
		Set<String> setTo = new HashSet<String>();
		if (address != null && !address.equals("")) {
			String[] addrs = address.split(",");
			for (String addr : addrs) {
				if (addr != null && !addr.equals("")) {
					setTo.add(addr.trim());
				}
			}
		}
		return setTo;
	}

	/**
	 * ## 方法说明：
	 * 	将地址集合转换为String字符串
	 * @param adds
	 * @return
	 */
	private String getAddrStr(Set<String> adds) {
		StringBuffer buff = new StringBuffer("");
		if (adds.size() > 0) {
			Iterator<String> it = adds.iterator();
			while (it.hasNext()) {
				buff.append(it.next() + ",");
			}
			buff.deleteCharAt(buff.length() - 1);
		}
		return buff.toString();
	}

	// public static void main(String args[]){
	// String [] names = {"dfs_65_development.pdf"};
	// String p =
	// System.getProperty("web.root")+"attachFiles/dfs_65_development.pdf";
	// String [] url = {p};
	// MailSenderInfo info = new MailSenderInfo();
	// info.setSubject("邮件标题");
	// info.setContent("邮件内容");
	// info.setFromAddress("oa@ccs.org.cn");
	// info.setUserName("oa");
	// info.setPassword("Ccsoa123456");
	// info.setToAddress("xufeng@ccsit.cn");
	// info.setMailServerHost("mail.ccs.org.cn");
	// info.setMailServerPort("25");
	// info.setValidate(true);
	// info.setAttachFileNames(names);
	// info.setAttachFileUrl(url);
	// MailSender sender = new MailSender();
	// try {
	// sender.sendAttachFile(info);
	// } catch (UnsupportedEncodingException e) {
	// e.printStackTrace();
	// }
	// }

}
