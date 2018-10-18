/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq.common;

/**
 * ## 类说明：
 * 	MQ线程静态变量类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq.common
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|Constants.java新增
*/
public class Constants {

	/** 消息分隔符 **/
	public static final String KEY_SEPARATOR = " ";

	/** 线程数 **/
	public final static int THREAD_COUNT = 5;
	
	public final static int THREAD_COUNT_SINGLE = 1;
	
	/** 处理间隔时间 **/
	/** mils **/
	public final static int INTERVAL_MILS = 0;

	/** consumer失败后等待时间(mils) **/
	public static final int ONE_SECOND = 1 * 1000;

	/** 异常sleep时间(mils)，从1分钟改为10秒 **/
	public static final int ONE_MINUTE = 1 * 10 * 1000;

	/** MQ消息retry时间 **/
	public static final int RETRY_TIME_INTERVAL = ONE_MINUTE;

	/** MQ消息有效时间 **/
	public static final int VALID_TIME = ONE_MINUTE;

	/** 重试次数 **/
	public static final int RETRYTIMES = 3;
}
