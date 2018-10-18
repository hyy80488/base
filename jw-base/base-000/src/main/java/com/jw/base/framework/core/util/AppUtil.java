/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.jw.base.framework.core.Constant;

/**
 * ## 类说明：
 * 	应用程序工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|AppUtil.java新增
 */
public class AppUtil implements ApplicationContextAware {
	
	protected static final Logger logger = Logger.getLogger(AppUtil.class);

	public static final String MANAGEROPTOR_SESSION = "LOGIN_MANAGEROPTOR";

	/**
	 * 存放应用程序的配置,如邮件服务器等
	 */
	private static Map configMap = new HashMap();
	
	/**
	 * 应用程序全局对象
	 */
	private static ServletContext servletContext = null;

	private static ApplicationContext appContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		setAppContext(applicationContext);
	}

	/**
	 * ## 方法说明：
	 * 	取得Bean
	 * @param beanId
	 * @return
	 */
	public static Object getBean(String beanId) {
		return appContext.getBean(beanId);
	}

	public static Object getBean(Class<?> requiredType) {
		return appContext.getBean(requiredType);
	}
	
	/**
	 * ## 方法说明：
	 * 	取得应用程序的绝对路径
	 * @return
	 */
	public static String getAppAbsolutePath() {
		return servletContext.getRealPath("/");
	}

	/**
	 * ## 方法说明：
	 * 	应用程序启动时调用
	 * @param servletContext
	 */
	public static void init(ServletContext in_servletContext) {
		servletContext = in_servletContext;
	}

	/**
	 * ## 方法说明：
	 * 	获取系统配置MAP
	 */
	public static Map<?, ?> getSysConfig() {
		return configMap;
	}

	/**
	 * ## 方法说明：
	 * 	判断操作员是否在线
	 * @param session HttpSession
	 * @return true or false
	 */
	public static boolean isOnline(HttpSession session) {
		if (null != session.getAttribute(MANAGEROPTOR_SESSION)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @return
	 */
	public static ApplicationContext getAppContext() {
		return appContext;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param appContext
	 */
	public static void setAppContext(ApplicationContext appContext) {
		AppUtil.appContext = appContext;
	}
	
	/**
	 * ## 方法说明：
	 * 	取得clientIP，请求IP
	 * @param request
	 * @return
	 */
	public static String getClientIP(HttpServletRequest request) {
		return null==request.getHeader(Constant.X_REAL_IP)?request.getRemoteAddr():request.getHeader(Constant.X_REAL_IP);
	}
}
