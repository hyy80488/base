/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

/**
 * ## 类说明：
 * 	生成KEY工具类
 * @author    [guochun]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|guochun|新增|GenerateKey.java新增
 */
public class GenerateKeyUtil {

	/**
	 * ## 方法说明：
	 * 	取得UUID
	 * @return UUID KEY
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * ## 方法说明：
	 * 	取得唯一业务KEY
	 * @param classType 系统类别前缀
	 * @param subClassType 子系统类别前缀
	 * @param serial 内部序号
	 * @param digits 内部序号位数
	 * @return 系统类别前缀+子系统类别前缀+内部序号+"_"+机器码+系统时间毫秒
	 * @throws UnknownHostException 
	 */
	public static String getBusinessKey(String classType, String subClassType, Integer serial, Integer digits) throws UnknownHostException {
		String hostName = null;
		String currentTime = null;
		StringBuilder businessKey = new StringBuilder();

		hostName = "";
		currentTime = "";

		if (classType == null || subClassType == null) {
			return "";
		}

		if (serial < 0 || digits < 0) {
			return "";
		}

		hostName = InetAddress.getLocalHost().getHostName().toString();

		// 设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		// new Date()为获取当前系统时间
		currentTime = df.format(new Date());
		
		businessKey.append(classType);
		businessKey.append(subClassType);
		businessKey.append(StringUtils.leftPad(serial.toString(), digits, "0"));
		businessKey.append("_");
		businessKey.append(hostName);
		businessKey.append(currentTime);

		return businessKey.toString();
	}
}
