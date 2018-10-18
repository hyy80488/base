/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.apache.commons.codec.binary.Base64;

import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;

/**
 * ## 类说明：
 * 	字符转换类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|StringUtil.java新增
 */
public class StringUtil {
	
	public static final String numberChar = "0123456789";
	
	/**
	 * ## 方法说明：
	 * 	将Object类型转换String类型
	 * @param o
	 * @param nullDefault
	 * @return
	 */
    public static String toString(Object o, String nullDefault) {
        return (o != null) ? o.toString() : nullDefault;
    }
    /**
     * ## 方法说明：
     * 	对比字符串
     * @param obj1
     * @param obj2
     * @return 0 相等   1不等
     */
	public static int compareStr(String obj1, String obj2) {
		if (isEmpty(obj1) && isEmpty(obj2)) {
			return 0;
		}else if(isEmpty(obj1) && isNotEmpty(obj2)){
			return 1;
		} else if (isNotEmpty(obj1) && obj1.equals(obj2)) {
			return 0;
		} else {
			return 1;
		}
	}
	
	/**
	 * ## 方法说明：
	 * 	判断某个字符串是否为数字
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str) {
		for (int i = str.length(); --i >= 0;) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * ## 方法说明：
	 * 	生成定长的随机数
	 * @param length 指定随机数长度
	 * @return
	 */
	public static String getRandomString(int length) {		 
		StringBuffer sb = new StringBuffer(); 
		Random random = new Random(); 
		for (int i = 0; i < length; i++) { 
			sb.append(numberChar.charAt(random.nextInt(numberChar.length()))); 
		} 
		return sb.toString(); 
	} 

	/**
	 * ## 方法说明：
	 * 	过滤特殊字符
	 * @param str
	 * @return
	 */
	public static String StringFilter(String str) throws PatternSyntaxException {
		// 只允许字母和数字
		// String regEx = "[^a-zA-Z0-9]";
		// 清除掉所有特殊字符
		if (str == null){
			return "";
		}
		String regEx = "[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("").trim();
	}


	


	/**
	 * ## 方法说明：
	 * 	字符串SHA-256加密
	 * @param orgStr
	 * @return
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 */
	public static String encryptSha256(String inputStr) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte digest[] = md.digest(inputStr.getBytes("UTF-8"));
		return new String(Base64.encodeBase64(digest));
	}

	/**
	 * ## 方法说明：
	 * 	iso to 其他格式
	 * @param str
	 * @param charSet 格式
	 * @return
	 */
//	public static String iso2xxx(String str, String charSet) {
//		String value = "";
//		if (str == null || str.length() == 0) {
//			return "";
//		}
//		try {
//			value = new String(str.getBytes("ISO8859_1"), charSet);
//		} catch (Exception e) {
//			return null;
//		}
//		return value;
//	}


	/**
	 * ## 方法说明：
	 * 	字符串 转unicode
	 * @param s
	 * @return
	 */
	public static String stringToUnicode(String s) {
		String unicode = "";
		char[] charAry = new char[s.length()];
		for (int i = 0; i < charAry.length; i++) {
			charAry[i] = (char) s.charAt(i);
			unicode += "\\u" + Integer.toString(charAry[i], 16);
		}
		return unicode;
	}

	/**
	 * ## 方法说明：
	 * 	unicode转字符串
	 * @param unicodeStr
	 * @return
	 */
	public static String unicodeToString(String unicodeStr) {
		StringBuffer sb = new StringBuffer();
		String str[] = unicodeStr.toUpperCase().split("\\\\U");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("")){
				continue;
			}
			char c = (char) Integer.parseInt(str[i].trim(), 16);
			sb.append(c);
		}
		return sb.toString();
	}

	/**
	 * ## 方法说明：
	 * 	转换html
	 * @param inputString
	 * @return
	 */
	public static String html2Text(String inputString) {
		String htmlStr = inputString; // 含html标签的字符串
		String textStr = "";
		java.util.regex.Pattern p_script;
		java.util.regex.Matcher m_script;
		java.util.regex.Pattern p_style;
		java.util.regex.Matcher m_style;
		java.util.regex.Pattern p_html;
		java.util.regex.Matcher m_html;

		String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>"; // 定义script的正则表达式{或<script>]*?>[\s\S]*?<\/script>
		// }
		String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>"; // 定义style的正则表达式{或<style>]*?>[\s\S]*?<\/style>
		// }
		String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式

		p_script = java.util.regex.Pattern.compile(regEx_script, java.util.regex.Pattern.CASE_INSENSITIVE);
		m_script = p_script.matcher(htmlStr);
		htmlStr = m_script.replaceAll(""); // 过滤script标签

		p_style = java.util.regex.Pattern.compile(regEx_style, java.util.regex.Pattern.CASE_INSENSITIVE);
		m_style = p_style.matcher(htmlStr);
		htmlStr = m_style.replaceAll(""); // 过滤style标签

		p_html = java.util.regex.Pattern.compile(regEx_html, java.util.regex.Pattern.CASE_INSENSITIVE);
		m_html = p_html.matcher(htmlStr);
		htmlStr = m_html.replaceAll(""); // 过滤html标签

		textStr = htmlStr;

		return textStr;// 返回文本字符串
	}

	/**
	 * ## 方法说明：
	 * 	字符串是否空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return (str == null || str.trim().equals(""));
	}

	/**
	 * ## 方法说明：
	 * 	字符串是否不空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		return (str != null && !str.trim().equals(""));
	}

	/**
	 * ## 方法说明：
	 * 	字符判断转换
	 * @param Object
	 * @return
	 */
	public static String nullToEmpty(Object str) {
		return str==null ? "" : str.toString();
	}
	
	/**
	 * ## 方法说明：
	 * 	左补零
	 * @param num 数字
	 * @param len 长度
	 * @return
	 */
	public static String addZero(int num, int len) throws Exception {
		String ls = Integer.toString(num);
		if (("" + num).length() > len) {
			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_000001, "数字长度大于传入的长度", "数字长度大于传入的长度", BsProcessErrorCode.ERROR_LEVEL_5);
		} else {
			for (int i = ls.length(); i < len; i++) {
				ls = "0" + ls;
			}
		}
		return ls;
	}
	
	/**
	 * ## 方法说明：
	 * 	替换乱码
	 * @param str
	 * @return
	 */
//	public static String handleMessyCode(String str) {
//		str = str.replaceAll("\r", "").replaceAll("\n", "");
//		// 去掉目录乱码。
//		while (str.indexOf("HYPERLINK \\l \"_Toc") != -1) {
//			str = str.substring(str.indexOf((char) 20) + 1);
//			str = str.replaceFirst((char) 19 + " PAGEREF _Toc.*", "");
//		}
//		// 这个可以去掉图片，超链接等，前部分乱码。
//		while (str.matches(".*" + (char) 19 + ".*" + (char) 20 + ".*")) {
//			// str[j] = str[j].replaceAll(".*", "");为什么不用这种方式，因为有的一行又多个超链接。
//			String temp = str;
//			str = temp.substring(0, temp.indexOf((char) 19));
//			str = str + temp.substring(temp.indexOf((char) 20) + 1);
//			temp = null;
//		}
//		// 去掉图片，超链接剩余乱码。
//		while (str.indexOf((char) 21) != -1) {
//			str = str.replaceAll((char) 21 + "", "");
//		}
//		// 去掉图片剩余乱码。
//		while (str.indexOf((char) 8) != -1) {
//			str = str.replaceAll((char) 8 + "", "");
//		}
//		return str;
//	}
	
	/**
	 * ## 方法说明：
	 * 	格式化货币 ##,##0.00
	 * @param money
	 * @return
	 */
	public static String formatMoney(String money){
		if(StringUtil.isEmpty(money)){
			return "0.00";
		}
		DecimalFormat myformat = new DecimalFormat();
		myformat.applyPattern("##,##0.00");
		return myformat.format(new Double(money));
	}
	
	/**
	 * ## 方法说明：
	 * 	格式化汇率 ##,##0.0000
	 * @param money
	 * @return
	 */
	public static String formatRate(String money){
		if(StringUtil.isEmpty(money)){
			return "0";
		}
		DecimalFormat myformat = new DecimalFormat();
		myformat.applyPattern("##,##0.0000");
		return myformat.format(new Double(money));
	}
	
	 /**  
	 * ## 方法说明：
     * 	按字节截取字符串  
     * @param orignal 原始字符串  
     * @param count 截取位数  
     * @return 截取后的字符串  
     * @throws UnsupportedEncodingException 使用了JAVA不支持的编码格式  
     */  
//    public static String substring(String orignal, int count) throws UnsupportedEncodingException  {   
//        // 原始字符不为null，也不是空字符串   
//        if (orignal != null && !"".equals(orignal)) {   
//            // 将原始字符串转换为GBK编码格式   
//            orignal = new String(orignal.getBytes(), "utf-8");   
//            // 要截取的字节数大于0，且小于原始字符串的字节数   
//            if (count > 0 && count < orignal.getBytes("utf-8").length) {   
//                StringBuffer buff = new StringBuffer();   
//                char c;   
//               for (int i = 0; i < count; i++) {   
//                   c = orignal.charAt(i);   
//                    buff.append(c); 
//                    
//                    if (StringUtil.isChineseChar(c)) {   
//                        // 遇到中文汉字，截取字节总数减1   
//                        count--;
//                        count--;
//                    }   
//                }   
//                return buff.toString();   
//            }   
//        }   
//        return orignal;   
//    }
    
    /**
     * ## 方法说明：
     * 	判断是否是一个中文汉字  
     * @param c 字符  
     * @return true表示是中文汉字，false表示是英文字母  
     * @throws UnsupportedEncodingException 使用了JAVA不支持的编码格式  
     */  
    public static boolean isChineseChar(char c) throws UnsupportedEncodingException  {   
        // 如果字节数大于1，是汉字   
        // 以这种方式区别英文字母和中文汉字并不是十分严谨，但在这个题目中，这样判断已经足够了   
        return String.valueOf(c).getBytes("utf-8").length > 1;   
    }   
    
	/**
	 * ## 方法说明：
	 * 	将/:"<>|*?\这些windows文件系统文件名不符合的字符转化为_
	 * @param target  目标字符串
	 * @return 
	 */
	public static String transformAllToUnderline(String target){
		if(target == null) {
			return "";
		} else {
			target = target.trim();
			target = target.replaceAll("/", "_").replaceAll(":", "_").replaceAll("\"", "_").replaceAll("<", "_").replaceAll(">", "_")
				.replaceAll("[|]", "_").replaceAll("[*]", "_").replaceAll("[?]", "_").replaceAll("\\\\", "_");
			return target;
		}
	}
	
	/**
	 * ## 方法说明：
	 * 	生成时间戳+指定长度的随机数
	 * @param fileName
	 * @param length 随机数长度
	 * @return
	 */
	public static String getDateStrAndRandomString(int length){
		Date date = new Date();
		String dateStr = DateUtil.formatDate(date, "ddHHmmss");
		String randomStr = getRandomString(length);
		String newFileName = dateStr + randomStr;
		return newFileName;
	}
	
	/**
	 * ## 方法说明：
	 * 	获得左边补零后的字符串
	 * @param id
	 * @param length 长度
	 * @return
	 */
	public static String getFormatNumber(long id, String length) {
		// 0 代表前面补充0     
	    // 4 代表长度为4     
	    // d 代表参数为正数型 
		return String.format("%0"+length+"d", id);
	}
	
	/**
	 * ## 方法说明：
	 * 	获得左边补零后的字符串
	 * @param id
	 * @param length 长度
	 * @param covr 补位符
	 * @return
	 */
	public static String getFormatNumber(long id, String length, String covr) {
	    // d 代表参数为正数型 
		return String.format("%" + covr + length + "d", id);
	}
	
	/**
	 * ## 方法说明：
	 * 	用空格把字符串补足长度（前补）
	 * 	Pad the beginning of the given String with spaces until the String is of the given length.
	 * @param s String to be padded.
	 * @param length desired length of result.
	 * @return padded String.
	 * @throws NullPointerException if s is null.
	 */
	public static String prepad(String s, int length){
		return prepad(s, length, ' ');
	}

	/**
	 * ## 方法说明：
	 * 	用某个字符把字符串补足长度（前补）
	 * 	Pre-pend the given character to the String until the result is the desired length.
	 * @param s String to be padded.
	 * @param length desired length of result.
	 * @param c padding character.
	 * @return padded String.
	 * @throws NullPointerException if s is null.
	 */
	public static String prepad(String s, int length, char c){
		int needed = length - s.length();
		if (needed <= 0){
			return s;
		}
		char padding[] = new char[needed];
		java.util.Arrays.fill(padding, c);
		StringBuffer sb = new StringBuffer(length);
		sb.append(padding);
		sb.append(s);
		return sb.toString();
	}

	/**
	 * ## 方法说明：
	 * 	用空格把字符串补足长度（后补）
	 * 	Pad the end of the given String with spaces until the String is of the given length.
	 * @param s String to be padded.
	 * @param length desired length of result.
	 * @return padded String.
	 * @throws NullPointerException if s is null.
	 */
	public static String postpad(String s, int length){
		return postpad(s, length, ' ');
	}

	/**
	 * ## 方法说明：
	 * 	用某个字符把字符串补足长度（后补）
	 * 	Append the given character to the String until the result is the desired length.
	 * @param s String to be padded.
	 * @param length desired length of result.
	 * @param c padding character.
	 * @return padded String.
	 * @throws NullPointerException if s is null.
	 */
	public static String postpad(String s, int length, char c){
		int needed = length - s.length();
		if (needed <= 0){
			return s;
		}
		char padding[] = new char[needed];
		java.util.Arrays.fill(padding, c);
		StringBuffer sb = new StringBuffer(length);
		sb.append(s);
		sb.append(padding);
		return sb.toString();
	}

	/**
	 * ## 方法说明：
	 * 	用空格把字符串补足长度（中补）
	 * 	Pad the beginning and end of the given String with spaces until the String is of the given length.  The result is that the original String is centered in the middle of the new string.
	 * @param s String to be padded.
	 * @param length desired length of result.
	 * @return padded String.
	 * @throws NullPointerException if s is null.
	 */
	public static String midpad(String s, int length){
		return midpad(s, length, ' ');
	}

	/**
	 * ## 方法说明：
	 * 	用某个字符把字符串补足长度（中补）
	 * 	Pad the beginning and end of the given String with the given character until the result is  the desired length.  The result is that the original String is centered in the middle of the new string.
	 * @param s String to be padded.
	 * @param length desired length of result.
	 * @param c padding character.
	 * @return padded String.
	 * @throws NullPointerException if s is null.
	 */
	public static String midpad(String s, int length, char c){
		int needed = length - s.length();
		if (needed <= 0){
			return s;
		}
		int beginning = needed / 2;
		int end = beginning + needed % 2;
		char prepadding[] = new char[beginning];
		java.util.Arrays.fill(prepadding, c);
		char postpadding[] = new char[end];
		java.util.Arrays.fill(postpadding, c);
		StringBuffer sb = new StringBuffer(length);
		sb.append(prepadding);
		sb.append(s);
		sb.append(postpadding);
		return sb.toString();
	}

	/**
	 * ## 方法说明：
	 * 	分割字串
	 * 	Split the given String into tokens.
	 * <P>
	 * StringUtil.split("1-2-3", "-");<br>
	 * result: {"1","2","3"}<br>
	 * StringUtil.split("-1--2-", "-");<br>
	 * result: {"","1","","2",""}<br>
	 * StringUtil.split("123", "");<br>
	 * result: {"123"}<br>
	 * StringUtil.split("1-2---3----4", "--");<br>
	 * result: {"1-2","-3","","4"}<br>
	 *
	 * @param s String to be split.
	 * @param delimiter String literal on which to split.
	 * @return an array of tokens.
	 * @throws NullPointerException if s is null.
	 */
	public static String[] split(String s, String delimiter){
		int delimiterLength;
		// the next statement has the side effect of throwing a null pointer
		// exception if s is null.
		int stringLength = s.length();
		if (delimiter == null || (delimiterLength = delimiter.length()) == 0){
			// it is not inherently clear what to do if there is no delimiter
			// On one hand it would make sense to return each character because
			// the null String can be found between each pair of characters in
			// a String.  However, it can be found many times there and we don'
			// want to be returning multiple null tokens.
			// returning the whole String will be defined as the correct behavior
			// in this instance.
			return new String[] {s};
		}

		// a two pass solution is used because a one pass solution would
		// require the possible resizing and copying of memory structures
		// In the worst case it would have to be resized n times with each
		// resize having a O(n) copy leading to an O(n^2) algorithm.

		int count;
		int start;
		int end;

		// Scan s and count the tokens.
		count = 0;
		start = 0;
		while((end = s.indexOf(delimiter, start)) != -1){
			count++;
			start = end + delimiterLength;
		}
		count++;

		// allocate an array to return the tokens,
		// we now know how big it should be
		String[] result = new String[count];

		// Scan s again, but this time pick out the tokens
		count = 0;
		start = 0;
		while((end = s.indexOf(delimiter, start)) != -1){
			result[count] = (s.substring(start, end));
			count++;
			start = end + delimiterLength;
		}
		end = stringLength;
		result[count] = s.substring(start, end);

		return (result);
	}

	/**
	 * ## 方法说明：
	 * 	分割字串，包括分隔符
	 * 	Split the given String into tokens.  Delimiters will be returned as tokens.
	 * <P>
	 * StringHelper.split("1-2-3", "-");<br>
	 * result: {"1","-","2","-","3"}<br>
	 * StringHelper.split("-1--2-", "-");<br>
	 * result: {"","-","1","-","","-","2","-",""}<br>
	 * StringHelper.split("123", "");<br>
	 * result: {"123"}<br>
	 * StringHelper.split("1-2--3---4----5", "--");<br>
	 * result: {"1-2","--","3","--","-4","--","","--","5"}<br>
	 *
	 * @param s String to be split.
	 * @param delimiter String literal on which to split.
	 * @return an array of tokens.
	 * @throws NullPointerException if s is null.
	 */
	public static String[] splitIncludeDelimiters(String s, String delimiter){
		int delimiterLength;
		// the next statement has the side effect of throwing a null pointer
		// exception if s is null.
		int stringLength = s.length();
		if (delimiter == null || (delimiterLength = delimiter.length()) == 0){
			// it is not inherently clear what to do if there is no delimiter
			// On one hand it would make sense to return each character because
			// the null String can be found between each pair of characters in
			// a String.  However, it can be found many times there and we don'
			// want to be returning multiple null tokens.
			// returning the whole String will be defined as the correct behavior
			// in this instance.
			return new String[] {s};
		}

		// a two pass solution is used because a one pass solution would
		// require the possible resizing and copying of memory structures
		// In the worst case it would have to be resized n times with each
		// resize having a O(n) copy leading to an O(n^2) algorithm.

		int count;
		int start;
		int end;

		// Scan s and count the tokens.
		count = 0;
		start = 0;
		while((end = s.indexOf(delimiter, start)) != -1){
			count+=2;
			start = end + delimiterLength;
		}
		count++;

		// allocate an array to return the tokens,
		// we now know how big it should be
		String[] result = new String[count];

		// Scan s again, but this time pick out the tokens
		count = 0;
		start = 0;
		while((end = s.indexOf(delimiter, start)) != -1){
			result[count] = (s.substring(start, end));
			count++;
			result[count] = delimiter;
			count++;
			start = end + delimiterLength;
		}
		end = stringLength;
		result[count] = s.substring(start, end);

		return (result);
	}

	/**
	 * ## 方法说明：
	 * 	数组链接成一个字符串
	 * 	Join all the elements of a string array into a single String.
	 * @param array Array to be joined into a string.
	 * @return Concatenation of all the elements of the given array.
	 * @throws NullPointerException if array is null.
	 */
	public static String join(String[] array){
		return join(array, "");
	}

	/**
	 * ## 方法说明：
	 * 	用某个分隔符数组链接成一个字符串
	 * 	Join all the elements of a string array into a single String.
	 * @param array Array to be joined into a string.
	 * @param delimiter String to place between array elements.
	 * @return Concatenation of all the elements of the given array with the the delimiter in between.
	 * @throws NullPointerException if array or delimiter is null.
	 */
	public static String join(String[] array, String delimiter){
		// Cache the length of the delimiter
		// has the side effect of throwing a NullPointerException if
		// the delimiter is null.
		int delimiterLength = delimiter.length();

		// Nothing in the array return empty string
		// has the side effect of throwing a NullPointerException if
		// the array is null.
		if (array.length == 0) {
			return "";
		}

		// Only one thing in the array, return it.
		if (array.length == 1){
			if (array[0] == null) {
				return "";
			}
			return array[0];
		}

		// Make a pass through and determine the size
		// of the resulting string.
		int length = 0;
		for (int i=0; i<array.length; i++){
			if (array[i] != null) {
				length+=array[i].length();
			}
			if (i<array.length-1) {
				length+=delimiterLength;
			}
		}

		// Make a second pass through and concatenate everything
		// into a string buffer.
		StringBuffer result = new StringBuffer(length);
		for (int i=0; i<array.length; i++){
			if (array[i] != null) {
				result.append(array[i]);
			}
			if (i<array.length-1) {
				result.append(delimiter);
			}
		}

		return result.toString();
	}

	/**
	 * ## 方法说明：
	 * 	字符串，查找并替换
	 * 	Replace occurrences of a substring.
	 *
	 * StringHelper.replace("1-2-3", "-", "|");<br>
	 * result: "1|2|3"<br>
	 * StringHelper.replace("-1--2-", "-", "|");<br>
	 * result: "|1||2|"<br>
	 * StringHelper.replace("123", "", "|");<br>
	 * result: "123"<br>
	 * StringHelper.replace("1-2---3----4", "--", "|");<br>
	 * result: "1-2|-3||4"<br>
	 * StringHelper.replace("1-2---3----4", "--", "---");<br>
	 * result: "1-2----3------4"<br>
	 *
	 * @param s String to be modified.
	 * @param find String to find.
	 * @param replace String to replace.
	 * @return a string with all the occurrences of the string to find replaced.
	 * @throws NullPointerException if s is null.
	 */
	public static String replace(String s, String find, String replace){
		int findLength;
		// the next statement has the side effect of throwing a null pointer
		// exception if s is null.
		int stringLength = s.length();
		if (find == null || (findLength = find.length()) == 0){
			// If there is nothing to find, we won't try and find it.
			return s;
		}
		if (replace == null){
			// a null string and an empty string are the same
			// for replacement purposes.
			replace = "";
		}
		int replaceLength = replace.length();

		// We need to figure out how long our resulting string will be.
		// This is required because without it, the possible resizing
		// and copying of memory structures could lead to an unacceptable runtime.
		// In the worst case it would have to be resized n times with each
		// resize having a O(n) copy leading to an O(n^2) algorithm.
		int length;
		if (findLength == replaceLength){
			// special case in which we don't need to count the replacements
			// because the count falls out of the length formula.
			length = stringLength;
		} else {
			int count;
			int start;
			int end;

			// Scan s and count the number of times we find our target.
			count = 0;
			start = 0;
			while((end = s.indexOf(find, start)) != -1){
				count++;
				start = end + findLength;
			}
			if (count == 0){
				// special case in which on first pass, we find there is nothing
				// to be replaced.  No need to do a second pass or create a string buffer.
				return s;
			}
			length = stringLength - (count * (findLength - replaceLength));
		}

		int start = 0;
		int end = s.indexOf(find, start);
		if (end == -1){
			// nothing was found in the string to replace.
			// we can get this if the find and replace strings
			// are the same length because we didn't check before.
			// in this case, we will return the original string
			return s;
		}
		// it looks like we actually have something to replace
		// *sigh* allocate memory for it.
		StringBuffer sb = new StringBuffer(length);

		// Scan s and do the replacements
		while (end != -1){
			sb.append(s.substring(start, end));
			sb.append(replace);
			start = end + findLength;
			end = s.indexOf(find, start);
		}
		end = stringLength;
		sb.append(s.substring(start, end));

		return (sb.toString());
	}




	/**
	 * ## 方法说明：
	 * 	替换字符串前后字符
	 * 	Trim any of the characters contained in the second string from the beginning and end of the first.
	 * @param s String to be trimmed.
	 * @param c list of characters to trim from s.
	 * @return trimmed String.
	 * @throws NullPointerException if s is null.
	 */
	public static String trim(String s, String c){
		int length = s.length();
		if (c == null){
			return s;
		}
		int cLength = c.length();
		if (c.length() == 0){
			return s;
		}
		int start = 0;
		int end = length;
		boolean found; // trim-able character found.
		int i;
		// Start from the beginning and find the
		// first non-trim-able character.
		found = false;
		for (i=0; !found && i<length; i++){
			char ch = s.charAt(i);
			found = true;
			for (int j=0; found && j<cLength; j++){
				if (c.charAt(j) == ch) {
					found = false;
				}
			}
		}
		// if all characters are trim-able.
		if (!found) {
			return "";
		}
		start = i-1;
		// Start from the end and find the
		// last non-trim-able character.
		found = false;
		for (i=length-1; !found && i>=0; i--){
			char ch = s.charAt(i);
			found = true;
			for (int j=0; found && j<cLength; j++){
				if (c.charAt(j) == ch) {
					found = false;
				}
			}
		}
		end = i+2;
		return s.substring(start, end);
	}

	/*
	 * String编码
	 */
	public static String escape(String src) {
		int i;
		char j;
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length() * 6);
		for (i = 0; i < src.length(); i++) {
			j = src.charAt(i);
			if (Character.isDigit(j) || Character.isLowerCase(j) || Character.isUpperCase(j)){
				tmp.append(j);
			}
			else if (j < 256) {
				tmp.append("%");
				if (j < 16){
					tmp.append("0");
				}
				tmp.append(Integer.toString(j, 16));
			} else {
				tmp.append("%u");
				tmp.append(Integer.toString(j, 16));
			}
		}
		return tmp.toString();
	}
	
	private static HashMap<String,Integer> htmlEntities = new HashMap<String,Integer>();
	static {
		htmlEntities.put("nbsp", new Integer(160));
		htmlEntities.put("iexcl", new Integer(161));
		htmlEntities.put("cent", new Integer(162));
		htmlEntities.put("pound", new Integer(163));
		htmlEntities.put("curren", new Integer(164));
		htmlEntities.put("yen", new Integer(165));
		htmlEntities.put("brvbar", new Integer(166));
		htmlEntities.put("sect", new Integer(167));
		htmlEntities.put("uml", new Integer(168));
		htmlEntities.put("copy", new Integer(169));
		htmlEntities.put("ordf", new Integer(170));
		htmlEntities.put("laquo", new Integer(171));
		htmlEntities.put("not", new Integer(172));
		htmlEntities.put("shy", new Integer(173));
		htmlEntities.put("reg", new Integer(174));
		htmlEntities.put("macr", new Integer(175));
		htmlEntities.put("deg", new Integer(176));
		htmlEntities.put("plusmn", new Integer(177));
		htmlEntities.put("sup2", new Integer(178));
		htmlEntities.put("sup3", new Integer(179));
		htmlEntities.put("acute", new Integer(180));
		htmlEntities.put("micro", new Integer(181));
		htmlEntities.put("para", new Integer(182));
		htmlEntities.put("middot", new Integer(183));
		htmlEntities.put("cedil", new Integer(184));
		htmlEntities.put("sup1", new Integer(185));
		htmlEntities.put("ordm", new Integer(186));
		htmlEntities.put("raquo", new Integer(187));
		htmlEntities.put("frac14", new Integer(188));
		htmlEntities.put("frac12", new Integer(189));
		htmlEntities.put("frac34", new Integer(190));
		htmlEntities.put("iquest", new Integer(191));
		htmlEntities.put("Agrave", new Integer(192));
		htmlEntities.put("Aacute", new Integer(193));
		htmlEntities.put("Acirc", new Integer(194));
		htmlEntities.put("Atilde", new Integer(195));
		htmlEntities.put("Auml", new Integer(196));
		htmlEntities.put("Aring", new Integer(197));
		htmlEntities.put("AElig", new Integer(198));
		htmlEntities.put("Ccedil", new Integer(199));
		htmlEntities.put("Egrave", new Integer(200));
		htmlEntities.put("Eacute", new Integer(201));
		htmlEntities.put("Ecirc", new Integer(202));
		htmlEntities.put("Euml", new Integer(203));
		htmlEntities.put("Igrave", new Integer(204));
		htmlEntities.put("Iacute", new Integer(205));
		htmlEntities.put("Icirc", new Integer(206));
		htmlEntities.put("Iuml", new Integer(207));
		htmlEntities.put("ETH", new Integer(208));
		htmlEntities.put("Ntilde", new Integer(209));
		htmlEntities.put("Ograve", new Integer(210));
		htmlEntities.put("Oacute", new Integer(211));
		htmlEntities.put("Ocirc", new Integer(212));
		htmlEntities.put("Otilde", new Integer(213));
		htmlEntities.put("Ouml", new Integer(214));
		htmlEntities.put("times", new Integer(215));
		htmlEntities.put("Oslash", new Integer(216));
		htmlEntities.put("Ugrave", new Integer(217));
		htmlEntities.put("Uacute", new Integer(218));
		htmlEntities.put("Ucirc", new Integer(219));
		htmlEntities.put("Uuml", new Integer(220));
		htmlEntities.put("Yacute", new Integer(221));
		htmlEntities.put("THORN", new Integer(222));
		htmlEntities.put("szlig", new Integer(223));
		htmlEntities.put("agrave", new Integer(224));
		htmlEntities.put("aacute", new Integer(225));
		htmlEntities.put("acirc", new Integer(226));
		htmlEntities.put("atilde", new Integer(227));
		htmlEntities.put("auml", new Integer(228));
		htmlEntities.put("aring", new Integer(229));
		htmlEntities.put("aelig", new Integer(230));
		htmlEntities.put("ccedil", new Integer(231));
		htmlEntities.put("egrave", new Integer(232));
		htmlEntities.put("eacute", new Integer(233));
		htmlEntities.put("ecirc", new Integer(234));
		htmlEntities.put("euml", new Integer(235));
		htmlEntities.put("igrave", new Integer(236));
		htmlEntities.put("iacute", new Integer(237));
		htmlEntities.put("icirc", new Integer(238));
		htmlEntities.put("iuml", new Integer(239));
		htmlEntities.put("eth", new Integer(240));
		htmlEntities.put("ntilde", new Integer(241));
		htmlEntities.put("ograve", new Integer(242));
		htmlEntities.put("oacute", new Integer(243));
		htmlEntities.put("ocirc", new Integer(244));
		htmlEntities.put("otilde", new Integer(245));
		htmlEntities.put("ouml", new Integer(246));
		htmlEntities.put("divide", new Integer(247));
		htmlEntities.put("oslash", new Integer(248));
		htmlEntities.put("ugrave", new Integer(249));
		htmlEntities.put("uacute", new Integer(250));
		htmlEntities.put("ucirc", new Integer(251));
		htmlEntities.put("uuml", new Integer(252));
		htmlEntities.put("yacute", new Integer(253));
		htmlEntities.put("thorn", new Integer(254));
		htmlEntities.put("yuml", new Integer(255));
		htmlEntities.put("fnof", new Integer(402));
		htmlEntities.put("Alpha", new Integer(913));
		htmlEntities.put("Beta", new Integer(914));
		htmlEntities.put("Gamma", new Integer(915));
		htmlEntities.put("Delta", new Integer(916));
		htmlEntities.put("Epsilon", new Integer(917));
		htmlEntities.put("Zeta", new Integer(918));
		htmlEntities.put("Eta", new Integer(919));
		htmlEntities.put("Theta", new Integer(920));
		htmlEntities.put("Iota", new Integer(921));
		htmlEntities.put("Kappa", new Integer(922));
		htmlEntities.put("Lambda", new Integer(923));
		htmlEntities.put("Mu", new Integer(924));
		htmlEntities.put("Nu", new Integer(925));
		htmlEntities.put("Xi", new Integer(926));
		htmlEntities.put("Omicron", new Integer(927));
		htmlEntities.put("Pi", new Integer(928));
		htmlEntities.put("Rho", new Integer(929));
		htmlEntities.put("Sigma", new Integer(931));
		htmlEntities.put("Tau", new Integer(932));
		htmlEntities.put("Upsilon", new Integer(933));
		htmlEntities.put("Phi", new Integer(934));
		htmlEntities.put("Chi", new Integer(935));
		htmlEntities.put("Psi", new Integer(936));
		htmlEntities.put("Omega", new Integer(937));
		htmlEntities.put("alpha", new Integer(945));
		htmlEntities.put("beta", new Integer(946));
		htmlEntities.put("gamma", new Integer(947));
		htmlEntities.put("delta", new Integer(948));
		htmlEntities.put("epsilon", new Integer(949));
		htmlEntities.put("zeta", new Integer(950));
		htmlEntities.put("eta", new Integer(951));
		htmlEntities.put("theta", new Integer(952));
		htmlEntities.put("iota", new Integer(953));
		htmlEntities.put("kappa", new Integer(954));
		htmlEntities.put("lambda", new Integer(955));
		htmlEntities.put("mu", new Integer(956));
		htmlEntities.put("nu", new Integer(957));
		htmlEntities.put("xi", new Integer(958));
		htmlEntities.put("omicron", new Integer(959));
		htmlEntities.put("pi", new Integer(960));
		htmlEntities.put("rho", new Integer(961));
		htmlEntities.put("sigmaf", new Integer(962));
		htmlEntities.put("sigma", new Integer(963));
		htmlEntities.put("tau", new Integer(964));
		htmlEntities.put("upsilon", new Integer(965));
		htmlEntities.put("phi", new Integer(966));
		htmlEntities.put("chi", new Integer(967));
		htmlEntities.put("psi", new Integer(968));
		htmlEntities.put("omega", new Integer(969));
		htmlEntities.put("thetasym", new Integer(977));
		htmlEntities.put("upsih", new Integer(978));
		htmlEntities.put("piv", new Integer(982));
		htmlEntities.put("bull", new Integer(8226));
		htmlEntities.put("hellip", new Integer(8230));
		htmlEntities.put("prime", new Integer(8242));
		htmlEntities.put("Prime", new Integer(8243));
		htmlEntities.put("oline", new Integer(8254));
		htmlEntities.put("frasl", new Integer(8260));
		htmlEntities.put("weierp", new Integer(8472));
		htmlEntities.put("image", new Integer(8465));
		htmlEntities.put("real", new Integer(8476));
		htmlEntities.put("trade", new Integer(8482));
		htmlEntities.put("alefsym", new Integer(8501));
		htmlEntities.put("larr", new Integer(8592));
		htmlEntities.put("uarr", new Integer(8593));
		htmlEntities.put("rarr", new Integer(8594));
		htmlEntities.put("darr", new Integer(8595));
		htmlEntities.put("harr", new Integer(8596));
		htmlEntities.put("crarr", new Integer(8629));
		htmlEntities.put("lArr", new Integer(8656));
		htmlEntities.put("uArr", new Integer(8657));
		htmlEntities.put("rArr", new Integer(8658));
		htmlEntities.put("dArr", new Integer(8659));
		htmlEntities.put("hArr", new Integer(8660));
		htmlEntities.put("forall", new Integer(8704));
		htmlEntities.put("part", new Integer(8706));
		htmlEntities.put("exist", new Integer(8707));
		htmlEntities.put("empty", new Integer(8709));
		htmlEntities.put("nabla", new Integer(8711));
		htmlEntities.put("isin", new Integer(8712));
		htmlEntities.put("notin", new Integer(8713));
		htmlEntities.put("ni", new Integer(8715));
		htmlEntities.put("prod", new Integer(8719));
		htmlEntities.put("sum", new Integer(8721));
		htmlEntities.put("minus", new Integer(8722));
		htmlEntities.put("lowast", new Integer(8727));
		htmlEntities.put("radic", new Integer(8730));
		htmlEntities.put("prop", new Integer(8733));
		htmlEntities.put("infin", new Integer(8734));
		htmlEntities.put("ang", new Integer(8736));
		htmlEntities.put("and", new Integer(8743));
		htmlEntities.put("or", new Integer(8744));
		htmlEntities.put("cap", new Integer(8745));
		htmlEntities.put("cup", new Integer(8746));
		htmlEntities.put("int", new Integer(8747));
		htmlEntities.put("there4", new Integer(8756));
		htmlEntities.put("sim", new Integer(8764));
		htmlEntities.put("cong", new Integer(8773));
		htmlEntities.put("asymp", new Integer(8776));
		htmlEntities.put("ne", new Integer(8800));
		htmlEntities.put("equiv", new Integer(8801));
		htmlEntities.put("le", new Integer(8804));
		htmlEntities.put("ge", new Integer(8805));
		htmlEntities.put("sub", new Integer(8834));
		htmlEntities.put("sup", new Integer(8835));
		htmlEntities.put("nsub", new Integer(8836));
		htmlEntities.put("sube", new Integer(8838));
		htmlEntities.put("supe", new Integer(8839));
		htmlEntities.put("oplus", new Integer(8853));
		htmlEntities.put("otimes", new Integer(8855));
		htmlEntities.put("perp", new Integer(8869));
		htmlEntities.put("sdot", new Integer(8901));
		htmlEntities.put("lceil", new Integer(8968));
		htmlEntities.put("rceil", new Integer(8969));
		htmlEntities.put("lfloor", new Integer(8970));
		htmlEntities.put("rfloor", new Integer(8971));
		htmlEntities.put("lang", new Integer(9001));
		htmlEntities.put("rang", new Integer(9002));
		htmlEntities.put("loz", new Integer(9674));
		htmlEntities.put("spades", new Integer(9824));
		htmlEntities.put("clubs", new Integer(9827));
		htmlEntities.put("hearts", new Integer(9829));
		htmlEntities.put("diams", new Integer(9830));
		htmlEntities.put("quot", new Integer(34));
		htmlEntities.put("amp", new Integer(38));
		htmlEntities.put("lt", new Integer(60));
		htmlEntities.put("gt", new Integer(62));
		htmlEntities.put("OElig", new Integer(338));
		htmlEntities.put("oelig", new Integer(339));
		htmlEntities.put("Scaron", new Integer(352));
		htmlEntities.put("scaron", new Integer(353));
		htmlEntities.put("Yuml", new Integer(376));
		htmlEntities.put("circ", new Integer(710));
		htmlEntities.put("tilde", new Integer(732));
		htmlEntities.put("ensp", new Integer(8194));
		htmlEntities.put("emsp", new Integer(8195));
		htmlEntities.put("thinsp", new Integer(8201));
		htmlEntities.put("zwnj", new Integer(8204));
		htmlEntities.put("zwj", new Integer(8205));
		htmlEntities.put("lrm", new Integer(8206));
		htmlEntities.put("rlm", new Integer(8207));
		htmlEntities.put("ndash", new Integer(8211));
		htmlEntities.put("mdash", new Integer(8212));
		htmlEntities.put("lsquo", new Integer(8216));
		htmlEntities.put("rsquo", new Integer(8217));
		htmlEntities.put("sbquo", new Integer(8218));
		htmlEntities.put("ldquo", new Integer(8220));
		htmlEntities.put("rdquo", new Integer(8221));
		htmlEntities.put("bdquo", new Integer(8222));
		htmlEntities.put("dagger", new Integer(8224));
		htmlEntities.put("Dagger", new Integer(8225));
		htmlEntities.put("permil", new Integer(8240));
		htmlEntities.put("lsaquo", new Integer(8249));
		htmlEntities.put("rsaquo", new Integer(8250));
		htmlEntities.put("euro", new Integer(8364));
	}

//
//
//	/**
//	 * ## 方法说明：
//	 * 	按照规则转移字符串
//	 * 	Escapes characters that have special meaning to regular expressions
//	 *
//	 * @param s String to be escaped
//	 * @return escaped String
//	 * @throws NullPointerException if s is null.
//	 */
//	public static String escapeRegularExpressionLiteral(String s){
//		// According to the documentation in the Pattern class:
//		//
//		// The backslash character ('\') serves to introduce escaped constructs,
//		// as defined in the table above, as well as to quote characters that
//		// otherwise would be interpreted as unescaped constructs. Thus the
//		// expression \\ matches a single backslash and \{ matches a left brace.
//		//
//		// It is an error to use a backslash prior to any alphabetic character
//		// that does not denote an escaped construct; these are reserved for future
//		// extensions to the regular-expression language. A backslash may be used
//		// prior to a non-alphabetic character regardless of whether that character
//		// is part of an unescaped construct.
//		//
//		// As a result, escape everything except [0-9a-zA-Z]
//
//		int length = s.length();
//		int newLength = length;
//		// first check for characters that might
//		// be dangerous and calculate a length
//		// of the string that has escapes.
//		for (int i=0; i<length; i++){
//			char c = s.charAt(i);
//			if (!((c>='0' && c<='9') || (c>='A' && c<='Z') || (c>='a' && c<='z'))){
//				newLength += 1;
//			}
//		}
//		if (length == newLength){
//			// nothing to escape in the string
//			return s;
//		}
//		StringBuffer sb = new StringBuffer(newLength);
//		for (int i=0; i<length; i++){
//			char c = s.charAt(i);
//			if (!((c>='0' && c<='9') || (c>='A' && c<='Z') || (c>='a' && c<='z'))){
//				sb.append('\\');
//			}
//			sb.append(c);
//		}
//		return sb.toString();
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	生成一个有规则的表达式
//	 * 	Build a regular expression that is each of the terms or'd together.
//	 * 
//	 * String[] a = {"a","b","c"};
//	 * StringBuffer s = new StringBuffer();
//	 * s.append("123");
//	 * StringUtil.buildFindAnyPattern(a,s);
//	 * result ： 123(?:(?:a)|(?:b)|(?:c))
//	 *
//	 * @param terms a list of search terms.
//	 * @param sb place to build the regular expression.
//	 * @throws IllegalArgumentException if the length of terms is zero.
//	 */
//	private static void buildFindAnyPattern(String[] terms, StringBuffer sb){
//		if (terms.length == 0) throw new IllegalArgumentException("There must be at least one term to find.");
//		sb.append("(?:");
//		for (int i=0; i<terms.length; i++){
//			if (i>0) sb.append("|");
//			sb.append("(?:");
//			sb.append(escapeRegularExpressionLiteral(terms[i]));
//			sb.append(")");
//		}
//		sb.append(")");
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Compile a pattern that can will match a string if the string contains any of the given terms.
//	 * <p>
//	 * Usage:<br>
//	 * <code>boolean b = getContainsAnyPattern(terms).matcher(s).matches();</code>
//	 * <p>
//	 * If multiple strings are matched against the same set of terms, it is more efficient to reuse the pattern returned by this function.
//	 *
//	 * @param terms Array of search strings.
//	 * @return Compiled pattern that can be used to match a string to see if it contains any of the terms.
//	 */
//	public static Pattern getContainsAnyPattern(String[] terms){
//		StringBuffer sb = new StringBuffer();
//		sb.append("(?s).*");
//		buildFindAnyPattern(terms, sb);
//		sb.append(".*");
//		return Pattern.compile(sb.toString());
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Compile a pattern that can will match a string if the string equals any of the given terms.
//	 * <p>
//	 * Usage:<br>
//	 * <code>boolean b = getEqualsAnyPattern(terms).matcher(s).matches();</code>
//	 * <p>
//	 * If multiple strings are matched against the same set of terms,
//	 * it is more efficient to reuse the pattern returned by this function.
//	 *
//	 * @param terms Array of search strings.
//	 * @return Compiled pattern that can be used to match a string to see if it equals any of the terms.
//	 */
//	 public static Pattern getEqualsAnyPattern(String[] terms){
//		StringBuffer sb = new StringBuffer();
//		sb.append("(?s)\\A");
//		buildFindAnyPattern(terms, sb);
//		sb.append("\\z");
//		return Pattern.compile(sb.toString());
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Compile a pattern that can will match a string if the string starts with any of the given terms.
//	 * <p>
//	 * Usage:<br>
//	 * <code>boolean b = getStartsWithAnyPattern(terms).matcher(s).matches();</code>
//	 * <p>
//	 * If multiple strings are matched against the same set of terms,
//	 * it is more efficient to reuse the pattern returned by this function.
//	 *
//	 * @param terms Array of search strings.
//	 * @return Compiled pattern that can be used to match a string to see if it starts with any of the terms.
//	 */
//	 public static Pattern getStartsWithAnyPattern(String[] terms){
//		StringBuffer sb = new StringBuffer();
//		sb.append("(?s)\\A");
//		buildFindAnyPattern(terms, sb);
//		sb.append(".*");
//		return Pattern.compile(sb.toString());
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Compile a pattern that can will match a string if the string ends with any of the given terms.
//	 * <p>
//	 * Usage:<br>
//	 * <code>boolean b = getEndsWithAnyPattern(terms).matcher(s).matches();</code>
//	 * <p>
//	 * If multiple strings are matched against the same set of terms,
//	 * it is more efficient to reuse the pattern returned by this function.
//	 *
//	 * @param terms Array of search strings.
//	 * @return Compiled pattern that can be used to match a string to see if it ends with any of the terms.
//	 */
//	public static Pattern getEndsWithAnyPattern(String[] terms){
//		StringBuffer sb = new StringBuffer();
//		sb.append("(?s).*");
//		buildFindAnyPattern(terms, sb);
//		sb.append("\\z");
//		return Pattern.compile(sb.toString());
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Compile a pattern that can will match a string if the string contains any of the given terms.
//	 * <p>
//	 * Case is ignored when matching using Unicode case rules.
//	 * <p>
//	 * Usage:<br>
//	 * <code>boolean b = getContainsAnyPattern(terms).matcher(s).matches();</code>
//	 * <p>
//	 * If multiple strings are matched against the same set of terms,
//	 * it is more efficient to reuse the pattern returned by this function.
//	 *
//	 * @param terms Array of search strings.
//	 * @return Compiled pattern that can be used to match a string to see if it contains any of the terms.
//	 */
//	public static Pattern getContainsAnyIgnoreCasePattern(String[] terms){
//		StringBuffer sb = new StringBuffer();
//		sb.append("(?i)(?u)(?s).*");
//		buildFindAnyPattern(terms, sb);
//		sb.append(".*");
//		return Pattern.compile(sb.toString());
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Compile a pattern that can will match a string if the string equals any of the given terms.
//	 * <p>
//	 * Case is ignored when matching using Unicode case rules.
//	 * <p>
//	 * Usage:<br>
//	 * <code>boolean b = getEqualsAnyPattern(terms).matcher(s).matches();</code>
//	 * <p>
//	 * If multiple strings are matched against the same set of terms,
//	 * it is more efficient to reuse the pattern returned by this function.
//	 *
//	 * @param terms Array of search strings.
//	 * @return Compiled pattern that can be used to match a string to see if it equals any of the terms.
//	 */
//	 public static Pattern getEqualsAnyIgnoreCasePattern(String[] terms){
//		StringBuffer sb = new StringBuffer();
//		sb.append("(?i)(?u)(?s)\\A");
//		buildFindAnyPattern(terms, sb);
//		sb.append("\\z");
//		return Pattern.compile(sb.toString());
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Compile a pattern that can will match a string if the string starts with any of the given terms.
//	 * <p>
//	 * Case is ignored when matching using Unicode case rules.
//	 * <p>
//	 * Usage:<br>
//	 * <code>boolean b = getStartsWithAnyPattern(terms).matcher(s).matches();</code>
//	 * <p>
//	 * If multiple strings are matched against the same set of terms,
//	 * it is more efficient to reuse the pattern returned by this function.
//	 *
//	 * @param terms Array of search strings.
//	 * @return Compiled pattern that can be used to match a string to see if it starts with any of the terms.
//	 */
//	 public static Pattern getStartsWithAnyIgnoreCasePattern(String[] terms){
//		StringBuffer sb = new StringBuffer();
//		sb.append("(?i)(?u)(?s)\\A");
//		buildFindAnyPattern(terms, sb);
//		sb.append(".*");
//		return Pattern.compile(sb.toString());
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Compile a pattern that can will match a string if the string ends with any of the given terms.
//	 * <p>
//	 * Case is ignored when matching using Unicode case rules.
//	 * <p>
//	 * Usage:<br>
//	 * <code>boolean b = getEndsWithAnyPattern(terms).matcher(s).matches();</code>
//	 * <p>
//	 * If multiple strings are matched against the same set of terms,
//	 * it is more efficient to reuse the pattern returned by this function.
//	 *
//	 * @param terms Array of search strings.
//	 * @return Compiled pattern that can be used to match a string to see if it ends with any of the terms.
//	 */
//	public static Pattern getEndsWithAnyIgnoreCasePattern(String[] terms){
//		StringBuffer sb = new StringBuffer();
//		sb.append("(?i)(?u)(?s).*");
//		buildFindAnyPattern(terms, sb);
//		sb.append("\\z");
//		return Pattern.compile(sb.toString());
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Tests to see if the given string contains any of the given terms.
//	 * @param s String that may contain any of the given terms.
//	 * @param terms list of substrings that may be contained in the given string.
//	 * @return true iff one of the terms is a substring of the given string.
//	 */
//	public static boolean containsAny(String s, String[] terms){
//		return getContainsAnyPattern(terms).matcher(s).matches();
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Tests to see if the given string equals any of the given terms.
//	 * @param s String that may equal any of the given terms.
//	 * @param terms list of strings that may equal the given string.
//	 * @return true iff one of the terms is equal to the given string.
//	 */
//	public static boolean equalsAny(String s, String[] terms){
//		return getEqualsAnyPattern(terms).matcher(s).matches();
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Tests to see if the given string starts with any of the given terms.
//	 * @param s String that may start with any of the given terms.
//	 * @param terms list of strings that may start with the given string.
//	 * @return true iff the given string starts with one of the given terms.
//	 */
//	public static boolean startsWithAny(String s, String[] terms){
//		return getStartsWithAnyPattern(terms).matcher(s).matches();
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Tests to see if the given string ends with any of the given terms.
//	 * @param s String that may end with any of the given terms.
//	 * @param terms list of strings that may end with the given string.
//	 * @return true iff the given string ends with one of the given terms.
//	 */
//	public static boolean endsWithAny(String s, String[] terms){
//		return getEndsWithAnyPattern(terms).matcher(s).matches();
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Tests to see if the given string contains any of the given terms.
//	 * @param s String that may contain any of the given terms.
//	 * @param terms list of substrings that may be contained in the given string.
//	 * @return true iff one of the terms is a substring of the given string.
//	 */
//	public static boolean containsAnyIgnoreCase(String s, String[] terms){
//		return getContainsAnyIgnoreCasePattern(terms).matcher(s).matches();
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Tests to see if the given string equals any of the given terms.
//	 * @param s String that may equal any of the given terms.
//	 * @param terms list of strings that may equal the given string.
//	 * @return true iff one of the terms is equal to the given string.
//	 */
//	public static boolean equalsAnyIgnoreCase(String s, String[] terms){
//		return getEqualsAnyIgnoreCasePattern(terms).matcher(s).matches();
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Tests to see if the given string starts with any of the given terms.
//	 * @param s String that may start with any of the given terms.
//	 * @param terms list of strings that may start with the given string.
//	 * @return true iff the given string starts with one of the given terms.
//	 */
//	public static boolean startsWithAnyIgnoreCase(String s, String[] terms){
//		return getStartsWithAnyIgnoreCasePattern(terms).matcher(s).matches();
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	Tests to see if the given string ends with any of the given terms.
//	 * @param s String that may end with any of the given terms.
//	 * @param terms list of strings that may end with the given string.
//	 * @return true iff the given string ends with one of the given terms.
//	 */
//	public static boolean endsWithAnyIgnoreCase(String s, String[] terms){
//		return getEndsWithAnyIgnoreCasePattern(terms).matcher(s).matches();
//	}
//	
//	/**
//	 * ## 方法说明：
//	 * 	要求大小写都匹配正则表达式
//	 * @param pattern 正则表达式模式
//	 * @param str 要匹配的字串
//	 * @return boolean值
//	 */
//	public static final boolean ereg(String pattern, String str) throws PatternSyntaxException {
//		try {
//			Pattern p = Pattern.compile(pattern);
//			Matcher m = p.matcher(str);
//			return m.find();
//		} catch (PatternSyntaxException e) {
//			throw e;
//		}
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	匹配且替换字串
//	 * @param pattern 正则表达式模式
//	 * @param newstr 要替换匹配到的新字串
//	 * @param str 原始字串
//	 * @return 匹配后的字符串
//	 */
//	public static final String ereg_replace(String pattern, String newstr, String str) throws PatternSyntaxException {
//		try {
//			Pattern p = Pattern.compile(pattern);
//			Matcher m = p.matcher(str);
//			return m.replaceAll(newstr);
//		} catch (PatternSyntaxException e) {
//			throw e;
//		}
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	主要用于模板中模块标记分析函数 把查找到的元素加到vector中
//	 * @param pattern 为正则表达式模式
//	 * @param str 原始字串
//	 * @return vector
//	 */
//	public static final Vector splitTags2Vector(String pattern, String str) throws PatternSyntaxException {
//		Vector vector = new Vector();
//		try {
//			Pattern p = Pattern.compile(pattern);
//			Matcher m = p.matcher(str);
//			while (m.find()) {
//				vector.add(ereg_replace("(\\[\\#)|(\\#\\])", "", m.group()));
//			}
//			return vector;
//		} catch (PatternSyntaxException e) {
//			throw e;
//		}
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	模块标记分析函数 功能主要是把查找到的元素加到vector中
//	 * @param pattern 为正则表达式模式
//	 * @param str 原始字串
//	 */
//	public static final String[] splitTags(String pattern, String str) {
//		try {
//			Pattern p = Pattern.compile(pattern);
//			Matcher m = p.matcher(str);
//			String[] array = new String[m.groupCount()];
//			int i = 0;
//			while (m.find()) {
//				array[i] = ereg_replace("(\\[\\#)|(\\#\\])", "", m.group());
//				i++;
//			}
//			return array;
//		} catch (PatternSyntaxException e) {
//			throw e;
//		}
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	匹配所有符合模式要求的字串并加到矢量vector数组中
//	 * @param pattern 为正则表达式模式
//	 * @param str 原始字串
//	 * @return vector
//	 */
//	public static final Vector regMatchAll2Vector(String pattern, String str) throws PatternSyntaxException {
//		Vector vector = new Vector();
//		try {
//			Pattern p = Pattern.compile(pattern);
//			Matcher m = p.matcher(str);
//			while (m.find()) {
//				vector.add(m.group());
//			}
//			return vector;
//		} catch (PatternSyntaxException e) {
//			throw e;
//		}
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	匹配所有符合模式要求的字串并加到字符串数组中
//	 * @param pattern 为正则表达式模式
//	 * @param str 原始字串
//	 * @return array
//	 */
//	public static final String[] regMatchAll2Array(String pattern, String str) throws PatternSyntaxException {
//		try {
//			Pattern p = Pattern.compile(pattern);
//			Matcher m = p.matcher(str);
//			String[] array = new String[m.groupCount()];
//			int i = 0;
//			while (m.find()) {
//				array[i] = m.group();
//				i++;
//			}
//			return array;
//		} catch (PatternSyntaxException e) {
//			throw e;
//		}
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	转义正则表达式字符(之所以需要将\和$字符用escapeDollarBackslash方法的方式是因为用repalceAll是不行的，
//	 * 	简单的试试"$".repalceAll("\\$","\\\\$")你会发现这个调用会导致数组越界错误)
//	 * @param pattern 为正则表达式模式
//	 * @param str 原始字串
//	 * @return array
//	 */
//	public static String escapeDollarBackslash(String original) {
//		StringBuffer buffer = new StringBuffer(original.length());
//		for (int i = 0; i < original.length(); i++) {
//			char c = original.charAt(i);
//			if (c == '\\' || c == '$') {
//				buffer.append("\\").append(c);
//			} else {
//				buffer.append(c);
//			}
//		}
//		return buffer.toString();
//	}
//
//	/**
//	 * ## 方法说明：
//	 * 	提取指定字串的函数 功能主要是把查找到的元素
//	 * @param pattern 为正则表达式模式
//	 * @param str 原始字串
//	 */
//	public static final String fetchStr(String pattern, String str) {
//		String returnValue = null;
//		try {
//			Pattern p = Pattern.compile(pattern);
//			Matcher m = p.matcher(str);
//			while (m.find()) {
//				returnValue = m.group();
//			}
//			return returnValue;
//		} catch (PatternSyntaxException e) {
//			return returnValue;
//		}
//	}
	
	public static void main(String[] args) {
		try {
			System.out.println("encryptSha256================="+StringUtil.encryptSha256(""));
			System.out.println("encryptSha256================="+StringUtil.encryptSha256("1"));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
