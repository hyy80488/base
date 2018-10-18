/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;

/**
 * ## 类说明：
 * 	MD5工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.base64
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|MD5Util.java新增
 */
public class MD5Util {

	/**
	 * ## 方法说明：
	 * 	Encodes a string
	 * @param str
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws BusinessException
	 */
	public static String crypt(String str) throws NoSuchAlgorithmException, BusinessException {
		if (str == null || str.length() == 0) {
			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_000002, "String to encript cannot be null or zero length", "String to encript cannot be null or zero length", BsProcessErrorCode.ERROR_LEVEL_5);
		}
		StringBuffer hexString = new StringBuffer();
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(str.getBytes());
		byte[] hash = md.digest();
		for (int i = 0; i < hash.length; i++) {
			if ((0xff & hash[i]) < 0x10) {
				hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
			} else {
				hexString.append(Integer.toHexString(0xFF & hash[i]));
			}
		}
		return hexString.toString();
	}

	public static void main(String[] args) {
		try {
			System.out.println("=============21218CCA77804D2BA1922C33E0151105");
			System.out.println("============="+MD5Util.crypt("888888"));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
}
