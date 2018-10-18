/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * ## 类说明：
 * 	Email权限信息
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.email
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|MailAuthenticator.java新增
 */
public class MailAuthenticator extends Authenticator{
	String userName=null;
	String password=null;
	 
	public MailAuthenticator(){
	}
	
	public MailAuthenticator(String username, String password) { 
		this.userName = username; 
		this.password = password; 
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	@Override
	protected PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication(userName, password);
	}
}
 
