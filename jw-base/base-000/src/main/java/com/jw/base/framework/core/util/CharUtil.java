/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.UnsupportedEncodingException;

/**
 * ## 类说明：
 * 	字符编码工具类
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月27日]
 * @package com.jw.base.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月27日|jianana|新增|CharUtil.java新增
 */
public class CharUtil {

	/**
	 * ## 方法说明： 
	 * 	转换编码 ISO-8859-1到GB2312
	 * 
	 * @param text
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static final String ISO2GB(String text) throws UnsupportedEncodingException {
		return new String(text.getBytes("ISO-8859-1"), "GB2312");
	}

	/**
	 * ## 方法说明：
	 * 	 转换编码 GB2312到ISO-8859-1
	 * 
	 * @param text
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static final String GB2ISO(String text) throws UnsupportedEncodingException {
		return new String(text.getBytes("GB2312"), "ISO-8859-1");
	}

	/**
	 * ## 方法说明：
	 * 	 Utf8URL编码
	 * 
	 * @param s
	 * @return
	 */
	public static final String Utf8URLencode(String text) {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < text.length(); i++) {

			char c = text.charAt(i);
			if (c >= 0 && c <= 255) {
				result.append(c);
			} else {

				byte[] b = new byte[0];
				try {
					b = Character.toString(c).getBytes("UTF-8");
				} catch (Exception ex) {
				}

				for (int j = 0; j < b.length; j++) {
					int k = b[j];
					if (k < 0){
						k += 256;
					}
					result.append("%" + Integer.toHexString(k).toUpperCase());
				}

			}
		}

		return result.toString();
	}

	/**
	 * ## 方法说明： 
	 * 	Utf8URL解码
	 * 
	 * @param text
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static final String Utf8URLdecode(String text) throws UnsupportedEncodingException {
		String result = "";
		int p = 0;

		if (text != null && text.length() > 0) {
			text = text.toLowerCase();
			p = text.indexOf("%e");
			if (p == -1){
				return text;
			}

			while (p != -1) {
				result += text.substring(0, p);
				text = text.substring(p, text.length());
				if (text == "" || text.length() < 9){
					return result;
				}

				result += CodeToWord(text.substring(0, 9));
				text = text.substring(9, text.length());
				p = text.indexOf("%e");
			}

		}

		return result + text;
	}

	/**
	 * ## 方法说明： 
	 * 	utf8URL编码转字符
	 * 
	 * @param text
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private static final String CodeToWord(String text) throws UnsupportedEncodingException {
		String result;

		if (Utf8codeCheck(text)) {
			byte[] code = new byte[3];
			code[0] = (byte) (Integer.parseInt(text.substring(1, 3), 16) - 256);
			code[1] = (byte) (Integer.parseInt(text.substring(4, 6), 16) - 256);
			code[2] = (byte) (Integer.parseInt(text.substring(7, 9), 16) - 256);
			result = new String(code, "UTF-8");
		} else {
			result = text;
		}

		return result;
	}

	/**
	 * ## 方法说明：
	 * 	 编码是否有效
	 * 
	 * @param text
	 * @return
	 */
	private static final boolean Utf8codeCheck(String text) {
		String sign = "";
		if (text.startsWith("%e")){
			for (int i = 0, p = 0; p != -1; i++) {
				p = text.indexOf("%", p);
				if (p != -1){
					p++;
				}
				sign += p;
			}
		}
		return sign.equals("147-1");
	}

	/**
	 * ## 方法说明： 
	 * 	判断是否Utf8Url编码
	 * 
	 * @param text
	 * @return
	 */
	public static final boolean isUtf8Url(String text) {
		text = text.toLowerCase();
		int p = text.indexOf("%");
		if (p != -1 && text.length() - p > 9) {
			text = text.substring(p, p + 9);
		}
		return Utf8codeCheck(text);
	}

	/**
	 * 测试
	 * 
	 * @param args
	 */
	// public static void main(String[] args) {
	//
	// //CharTools charTools = new CharTools();
	//
	// String url;
	//
	// url =
	// "http://www.google.com/search?hl=zh-CN&newwindow=1&q=%E4%B8%AD%E5%9B%BD%E5%A4%A7%E7%99%BE%E7%A7%91%E5%9C%A8%E7%BA%BF%E5%85%A8%E6%96%87%E6%A3%80%E7%B4%A2&btnG=%E6%90%9C%E7%B4%A2&lr=";
	// if(CharUtil.isUtf8Url(url)){
	// System.out.println(CharUtil.Utf8URLdecode(url));
	// }else{
	// //System.out.println(URLDecoder.decode(url));
	// }
	//
	// url =
	// "http://www.baidu.com/baidu?word=%D6%D0%B9%FA%B4%F3%B0%D9%BF%C6%D4%DA%CF%DF%C8%AB%CE%C4%BC%EC%CB%F7&tn=myie2dg";
	// if(CharUtil.isUtf8Url(url)){
	// System.out.println(CharUtil.Utf8URLdecode(url));
	// }else{
	// //System.out.println(URLDecoder.decode(url));
	// }
	//
	// }

}
