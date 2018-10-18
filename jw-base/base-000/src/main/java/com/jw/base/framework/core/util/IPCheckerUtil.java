/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

/**
 * ## 类说明：
 * 	IP检查工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|IPCheckerUtil.java新增
 */
public class IPCheckerUtil {

	/**
	 * ## 方法说明：
	 * 	判断目标IP是否在指定范围内
	 * @param ipCheck 目标IP
	 * @param ipStart 指定I范围开始
	 * @param ipEnd 指定I范围结束
	 * @return
	 */
	public static boolean ipRangCheck(String ipCheck, String ipStart, String ipEnd) {
		boolean result = false;
		long ipStartL = getIpNum(ipStart);
		long ipEndL = getIpNum(ipEnd);
		long ipCheckL = getIpNum(ipCheck);
		if (isInner(Long.valueOf(ipCheckL), Long.valueOf(ipStartL), Long.valueOf(ipEndL))) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	/**
	 * ## 方法说明：
	 * 	获取IP数
	 * @param ipAddress IP地址
	 * @return
	 */
	private static long getIpNum(String ipAddress) {
		String[] ip = ipAddress.split("\\.");
		long a = Integer.parseInt(ip[0]);
		long b = Integer.parseInt(ip[1]);
		long c = Integer.parseInt(ip[2]);
		long d = Integer.parseInt(ip[3]);
		long ipNum = a * 256 * 256 * 256 + b * 256 * 256 + c * 256 + d;
		return ipNum;
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param userIp
	 * @param begin
	 * @param end
	 * @return
	 */
	private static boolean isInner(long userIp, long begin, long end) {
		return (userIp >= begin) && (userIp <= end);
	}

}