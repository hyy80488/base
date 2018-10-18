/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.base64;

import java.security.GeneralSecurityException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * ## 类说明：
 * 	DES工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.base64
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|DESedeUtil.java新增
 */
public class DESedeUtil {

	public static final String DESede = "DESede";

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param secretKey
	 * @param cipherText
	 * @return
	 * @throws GeneralSecurityException
	 */
	public static String decode(String secretKey, String cipherText) throws GeneralSecurityException {
		byte[] kb = secretKey.getBytes();
		SecretKeySpec k = new SecretKeySpec(kb, DESede);
		Cipher cp = Cipher.getInstance(DESede);
		cp.init(Cipher.DECRYPT_MODE, k);
		byte[] srcByte = cp.doFinal(cipherText.getBytes());
		return new String(srcByte);
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param secretKey
	 * @param cipherByte
	 * @return
	 * @throws GeneralSecurityException
	 */
	public static String decode(String secretKey, byte[] cipherByte) throws GeneralSecurityException {
		byte[] kb = secretKey.getBytes();
		SecretKeySpec k = new SecretKeySpec(kb, DESede);
		Cipher cipher = Cipher.getInstance(DESede);
		cipher.init(Cipher.DECRYPT_MODE, k);
		byte[] srcByte = cipher.doFinal(cipherByte);
		return new String(srcByte);
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param secretKey
	 * @param srcText
	 * @return
	 * @throws GeneralSecurityException
	 */
	public static String encode(String secretKey, String srcText) throws GeneralSecurityException {
		byte[] kb = secretKey.getBytes();
		SecretKeySpec secretKeySpec = new SecretKeySpec(kb, DESede);
		Cipher cipher = Cipher.getInstance(DESede);
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		byte[] cipherByte = cipher.doFinal(srcText.getBytes());
		return new String(cipherByte);
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param secretKey
	 * @param srcByte
	 * @return
	 * @throws GeneralSecurityException
	 */
	public static String encode(String secretKey, byte[] srcByte) throws GeneralSecurityException {
		byte[] kb = secretKey.getBytes();
		SecretKeySpec secretKeySpec = new SecretKeySpec(kb, DESede);
		Cipher cipher = Cipher.getInstance(DESede);
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		byte[] cipherByte = cipher.doFinal(srcByte);
		return new String(cipherByte);
	}

}
