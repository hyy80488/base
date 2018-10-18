/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.math.BigDecimal;
import java.text.MessageFormat;

/**
 * ## 类说明：
 * 	日志工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|LogUtil.java新增
 */
public class LogUtil {

	private static final String LOG_TYPE_RUNTRAIL = "执行日志";
	private static final String LOG_TYPE_BUSINESSTRAIL = "业务日志";
	private static final String LOG_TYPE_MQ = "MQ日志";
	private static final String LOG_TYPE_DATABASE = "数据库操作";
	private static final String LOG_TYPE_EXCEPTION = "执行异常";
	private static final String LOG_TYPE_DEBUG = "调试信息";

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param business
	 * @param pattern
	 * @param arguments
	 * @return
	 */
	public static String runTrail(String business, String pattern, Object... arguments) {
		MessageFormat mf = new MessageFormat(LOG_TYPE_RUNTRAIL + "  " + business + "  " + pattern); 
		return mf.format(new Object[]{arguments});
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param business
	 * @param pattern
	 * @param arguments
	 * @return
	 */
	public static String businessTrail(String business, String pattern, Object... arguments) {
		MessageFormat mf = new MessageFormat(LOG_TYPE_BUSINESSTRAIL + "  " + business + "  " + pattern); 
		return mf.format(arguments);
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param business
	 * @param pattern
	 * @param arguments
	 * @return
	 */
	public static String mqTrail(String business, String pattern, Object... arguments) {
		MessageFormat mf = new MessageFormat(LOG_TYPE_MQ + "  " + business + "  " + pattern); 
		return mf.format(arguments);
	}
	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param business
	 * @param pattern
	 * @param arguments
	 * @return
	 */
	public static String dataBaseTrail(String business, String pattern, Object... arguments) {
		MessageFormat mf = new MessageFormat(LOG_TYPE_DATABASE + "  " + business + "  " + pattern); 
		return mf.format(arguments);
	}
	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param business
	 * @param pattern
	 * @param arguments
	 * @return
	 */
	public static String debugInfo(String business, String pattern, Object... arguments) {
		MessageFormat mf = new MessageFormat(LOG_TYPE_DEBUG + "  " + business + "  " + pattern); 
		return mf.format(arguments);
	}
	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param business
	 * @param pattern
	 * @param arguments
	 * @return
	 */
	public static String exception(String business, String pattern, Object... arguments) {
		MessageFormat mf = new MessageFormat(LOG_TYPE_EXCEPTION + "  " + business + "  " + pattern); 
		return mf.format(arguments);
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	方法调用时间输出
	 * @param invokerStart
	 * @param invokerEnd
	 * @param isOut
	 * @param tracerId
	 * @param des
	 * @param classAndMethod
	 */
	public static void invokerTimeInfo(long invokerStart, long invokerEnd, String isOut, String tracerId, String des, String classAndMethod){
		long invokerElapsed = invokerEnd - invokerStart;
		if ("true".equals(isOut)){
			BigDecimal b1 = BigDecimal.valueOf(invokerElapsed);
			System.out.println("TracerId:"+tracerId+"======"+des+"======"+classAndMethod+"============"+b1.divide(BigDecimal.valueOf(1000*1000))+"ms");
		}
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	方法调用时间输出
	 * @param invokerStart
	 * @param invokerEnd
	 * @param isOut
	 * @param tracerId
	 * @param des
	 * @param classAndMethod
	 */
	public static void invokerTimeError(long invokerStart, long invokerEnd, String isOut, String tracerId, String des, String classAndMethod){
		long invokerElapsed = invokerEnd - invokerStart;
		if ("true".equals(isOut)){
			BigDecimal b1 = BigDecimal.valueOf(invokerElapsed);
			System.err.println("TracerId:"+tracerId+"======"+des+"======"+classAndMethod+"============"+b1.divide(BigDecimal.valueOf(1000*1000))+"ms");
		}
	}
}