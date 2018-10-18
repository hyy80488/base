/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.jw.base.framework.core.Constant;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * ## 类说明：
 * 	AES工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util.base64
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|AESUtil.java新增
 */
public class AESUtil {
	
	/**
	 * 加密文件infilename,输出加密后的文件outfilename 返回AES加密密钥
	 * @param infilename
	 * @param outfilename
	 */
//	public static byte[] AesEnCrypt(String infilename, String outfilename) throws Exception {
//		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
//		keyGen.init(128);
//		SecretKey key = keyGen.generateKey();
//
//		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//
//		InputStream in = new FileInputStream(infilename);
//		DataOutputStream out = new DataOutputStream(new FileOutputStream(outfilename));
//
//		cipher.init(Cipher.ENCRYPT_MODE, key);
//		crypt(in, out, cipher);
//
//		in.close();
//		out.close();
//		return key.getEncoded();
//	}

	/**
	 * 用密钥k解密文件infilename,输出明文文件outfilename
	 * @param infilename
	 * @param outfilename
	 * @param k
	 */
//	public static void AesDeCrypt(String infilename, String outfilename, byte[] k) {
//		try {
//			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//
//			SecretKey key = new javax.crypto.spec.SecretKeySpec(k, "AES");
//			OutputStream out = new FileOutputStream(outfilename);
//			DataInputStream in = new DataInputStream(new FileInputStream(infilename));
//
//			cipher.init(Cipher.DECRYPT_MODE, key);
//			crypt(in, out, cipher);
//
//			in.close();
//			out.close();
//
//		} catch (GeneralSecurityException exception) {
//			exception.printStackTrace();
//		} catch (IOException exception) {
//			exception.printStackTrace();
//		}
//	}

//	/**
//	 * ## 方法说明：
//	 * 	加密
//	 * @param sSrc 需要加密的字串
//	 * @param sKey 加密用的Key
//	 */
//	public static String EncryptX(String sSrc, String sKey) throws Exception {
//		if (sKey == null) {
//			System.out.print("Key为空null");
//			return null;
//		}
//		// 判断Key是否为16位
//		if (sKey.length() != 16) {
//			System.out.print("Key长度不是16位");
//			return null;
//		}
//		byte[] raw = sKey.getBytes();
//		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
//		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");// "算法/模式/补码方式"
//		IvParameterSpec iv = new IvParameterSpec("0102030405060708".getBytes());// 使用CBC模式，需要一个向量iv，可增加加密算法的强度
//		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
//		byte[] encrypted = cipher.doFinal(sSrc.getBytes());
//
//		return new BASE64Encoder().encode(encrypted);// 此处使用BASE64做转码功能，同时能起到2次加密的作用。
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	解密
//	 * @param sSrc 需要解密的字串
//	 * @param sKey 解密用的Key
//	 */
//	public static String DecryptX(String sSrc, String sKey) throws Exception {
//		// 判断Key是否正确
//		if (sKey == null) {
//			System.out.print("Key为空null");
//			return null;
//		}
//		// 判断Key是否为16位
//		if (sKey.length() != 16) {
//			System.out.print("Key长度不是16位");
//			return null;
//		}
//		byte[] raw = sKey.getBytes("ASCII");
//		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
//		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//		IvParameterSpec iv = new IvParameterSpec("0102030405060708".getBytes());
//		cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
//		byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);// 先用base64解密
//		byte[] original = cipher.doFinal(encrypted1);
//		String originalString = new String(original);
//		return originalString;
//	}

	/**
	 * ## 方法说明：
	 * 	加密
	 * @param sSrc 需要加密的字串
	 * @param sKey 加密用的Key
	 */
	public static String Encrypt(String sSrc, String sKey) throws Exception {
		// 判断Key是否正确
		if (sKey == null) {
			System.out.print("Key为空null");
			return null;
		}
		// 判断Key是否为16位
		if (sKey.length() != 16) {
			System.out.print("Key长度不是16位");
			return null;
		}
		byte[] raw = sKey.getBytes();
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		// "算法/模式/补码方式"
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
		byte[] encrypted = cipher.doFinal(sSrc.getBytes());
		// 此处使用BASE64做转码功能，同时能起到2次加密的作用。
		return new BASE64Encoder().encode(encrypted);
	}
	
	/**
	 * ## 方法说明：
	 * 	解密
	 * @param sSrc 需要解密的字串
	 * @param sKey 解密用的Key
	 */
	public static String Decrypt(String sSrc, String sKey) throws Exception {
		// 判断Key是否正确
		if (sKey == null) {
			System.out.print("Key为空null");
			return null;
		}
		// 判断Key是否为16位
		if (sKey.length() != 16) {
			System.out.print("Key长度不是16位");
			return null;
		}
		byte[] raw = sKey.getBytes("ASCII");
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, skeySpec);
		// 先用base64解密
		byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);
		byte[] original = cipher.doFinal(encrypted1);
		String originalString = new String(original);
		return originalString;
	}

	/**
	 * ## 方法说明：
	 * 	自己定义的加 密函数
	 * @param in
	 * @param out
	 * @param cipher
	 * @throws IOException
	 * @throws GeneralSecurityException
	 */
//	public static void crypt(InputStream in, OutputStream out, Cipher cipher) throws IOException, GeneralSecurityException {
//		int blockSize = cipher.getBlockSize();
//		int outputSize = cipher.getOutputSize(blockSize);
//		byte[] inBytes = new byte[blockSize];
//		byte[] outBytes = new byte[outputSize];
//		int inLength = 0;
//		boolean more = true;
//		while (more) {
//			inLength = in.read(inBytes);
//			if (inLength == blockSize) {
//				int outLength = cipher.update(inBytes, 0, blockSize, outBytes);
//				out.write(outBytes, 0, outLength);
//			} else {
//				more = false;
//			}
//		}
//		if (inLength > 0)
//			outBytes = cipher.doFinal(inBytes, 0, inLength);
//		else
//			outBytes = cipher.doFinal();
//		out.write(outBytes);
//	}
	
	public static void main(String[] args) throws Exception {
		/*
		 * 加密用的Key 可以用26个字母和数字组成，最好不要用保留字符，虽然不会错，至于怎么裁决，个人看情况而定
		 * 此处使用AES-128-CBC加密模式，key需要为16位。
		 */
		// 需要加密的字串
		String cSrc = "ZDKJJT_k3y_00001";
		// 加密
		long lStart = System.currentTimeMillis();
		String enString = AESUtil.Encrypt(cSrc, Constant.CHAIN_SECKEY);
		System.out.println("加密后的字串是：" + enString);

		long lUseTime = System.currentTimeMillis() - lStart;
		System.out.println("加密耗时：" + lUseTime + "毫秒");
		// 解密
		lStart = System.currentTimeMillis();
		String DeString = AESUtil.Decrypt(enString, Constant.CHAIN_SECKEY);
		System.out.println("解密后的字串是：" + DeString);
		lUseTime = System.currentTimeMillis() - lStart;
		System.out.println("解密耗时：" + lUseTime + "毫秒");
		
	}
	
}
