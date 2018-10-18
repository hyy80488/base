/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import org.apache.commons.lang.StringUtils;

import com.jw.base.framework.core.Constant;

/**
 * ## 类说明：
 * 	共通检查方法
 * @author    [jianana]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|jianana|新增|DataCheckUtil.java新增
 */
public class DataCheckUtil {

	/** 日志对象 */
	//private static Log log = LogFactory.getLog(DataCheckUtil.class);

	public static enum MatchMode {
		Positive, Negative, All, NotNegative, NotPositive
	}

//	public static void main(String[] args) {
//		String a="http://www.baidu.com";
//		
//		System.out.println(a.matches("[a-zA-z]+://[^\\s]*"));
//		
//		 String faxNumEl = "^[0-9-()+]+$";
//	      String zipCodeEl="^[0-9]\\d*$";
//
//	  	  String intNegativeRegEl = "^-[1-9]\\d*$";
//	  	
//	      System.out.println("11+()".matches(faxNumEl));
//	      
//		/*String regel = "^<tr>(<td></td>)*</tr>";
//		log.debug("<tr><td></td><td></td><td></td></tr><tr><td>111</td><td>22</td><td></td></tr>"
//						.replaceFirst(regel, ""));
//		log.debug("-----------------");
//		testFloat();*/
//	}
//
//	protected static void testInteger() {
//		System.out.println(DataCheckUtil.checkInteger("", MatchMode.All));
//		System.out.println(DataCheckUtil.checkInteger("111", MatchMode.All));
//		System.out.println(DataCheckUtil.checkInteger("-1", MatchMode.Positive));
//		System.out.println(DataCheckUtil.checkInteger("1", MatchMode.Positive));
//		System.out.println(DataCheckUtil.checkInteger("1", MatchMode.Negative));
//		System.out.println(DataCheckUtil.checkInteger("-1", MatchMode.Negative));
//		System.out.println(DataCheckUtil.checkInteger("-1", MatchMode.NotNegative));
//		System.out.println(DataCheckUtil.checkInteger("1", MatchMode.NotNegative));
//		System.out.println(DataCheckUtil.checkInteger("-1", MatchMode.NotPositive));
//		System.out.println(DataCheckUtil.checkInteger("1", MatchMode.NotPositive));
//	}
//
//	private static void testFloat() {
//		System.out.println(DataCheckUtil.checkFloat("0.1", MatchMode.Positive, 2, 1));
//		System.out.println(DataCheckUtil.checkFloat("10", MatchMode.Positive, 2, 1));
//		System.out.println(DataCheckUtil.checkFloat("1.0", MatchMode.Positive, 2, 1));
//		System.out.println(DataCheckUtil.checkFloat("10.0", MatchMode.Positive, 2, 1));
//		System.out.println(DataCheckUtil.checkFloat("111.0", MatchMode.Positive, 2, 1));
//		System.out.println(DataCheckUtil.checkFloat("1.01", MatchMode.Positive, 2, 1));
//		System.out.println(DataCheckUtil.checkFloat("-1.0", MatchMode.Positive));
//		System.out.println(DataCheckUtil.checkFloat("1.0", MatchMode.Negative));
//		System.out.println(DataCheckUtil.checkFloat("-1.0", MatchMode.Negative));
//		System.out.println(DataCheckUtil.checkFloat("1.0", MatchMode.All));
//		System.out.println(DataCheckUtil.checkFloat("-1.0", MatchMode.All));
//		System.out.println(DataCheckUtil.checkFloat("1.0", MatchMode.NotNegative));
//		System.out.println(DataCheckUtil.checkFloat("-1.0", MatchMode.NotNegative));
//		System.out.println(DataCheckUtil.checkFloat("1.0", MatchMode.NotPositive));
//		System.out.println(DataCheckUtil.checkFloat("-1.0", MatchMode.NotPositive));
//
//		System.out.println("==========================");
//		System.out.println(DataCheckUtil.checkFloat("0.0", MatchMode.Positive, 1, 1));
//		System.out.println(DataCheckUtil.checkFloat("1.0", MatchMode.Positive, 2, 2));
//		System.out.println(DataCheckUtil.checkFloat("-11.01", MatchMode.Positive, 2, 2));
//		System.out.println(DataCheckUtil.checkFloat("11.011", MatchMode.Negative, 2, 2));
//		System.out.println(DataCheckUtil.checkFloat("-11.011", MatchMode.Negative, 2, 2));
//		System.out.println(DataCheckUtil.checkFloat("11.01", MatchMode.All, 2, 2));
//		System.out.println(DataCheckUtil.checkFloat("-11.01", MatchMode.All, 2, 2));
//		System.out.println(DataCheckUtil.checkFloat("1111.0111", MatchMode.NotNegative, 4, 4));
//		System.out.println(DataCheckUtil.checkFloat("-111.011", MatchMode.NotNegative, 4, 4));
//		System.out.println(DataCheckUtil.checkFloat("1111.1110", MatchMode.NotPositive, 4, 4));
//		System.out.println(DataCheckUtil.checkFloat("-1111.1110", MatchMode.NotPositive, 4, 4));
//	}

	/**
	 * ## 方法说明：
	 * 	验证浮点数，整数部分无位数限制
	 * @param numberStr
	 *            待验证数字字符串
	 * @param mode
	 * 			Positive, Negative, All, NotNegative, NotPositive
	 *            正、负、正+负、非负、非正 五种类型
	 * @param decimalCharCount
	 *            小数部分位数
	 * @return 不合法:true 合法:false
	 * @return
	 */
	public static boolean checkFloat(String numberStr, MatchMode mode,
			int decimalCharCount) {
		return checkFloat(numberStr, mode, 0, decimalCharCount);
	}

	/**
	 * ## 方法说明：
	 * 	验证浮点数，整数部分和小数部分分别无位数限制
	 * 
	 * 
	 * 
	 * @param numberStr
	 *            待验证数字字符串
	 * @param mode
	 *            正、负、正+负、非负、非正 五种类型
	 * @return 不合法:true 合法:false
	 * @return
	 */
	public static boolean checkFloat(String numberStr, MatchMode mode) {
		return checkFloat(numberStr, mode, 0, 0);
	}

	/**
	 * ## 方法说明：
	 * 	验证浮点数
	 * @param numberStr
	 *            待验证数字字符串
	 * @param mode
	 *            正、负、正+负、非负、非正 五种类型
	 * @param integerCharCount
	 *            整数部分位数
	 * @param decimalCharCount
	 *            小数部分位数
	 * @return 不合法:true 合法:false
	 * @return
	 */
	public static boolean checkFloat(String numberStr, MatchMode mode,
			int integerCharCount, int decimalCharCount) {
		if (StringUtils.isEmpty(numberStr)) {
			return false;
		}
		String regEl = "^";
		switch (mode) {
		case Positive:
			regEl += "";
			break;
		case Negative:
			regEl += "-";
			break;
		case All:
			regEl += "-?";
			break;
		case NotNegative:
			regEl += "";
			break;
		case NotPositive:
			regEl += "-";
			break;
		default:
			regEl += "";
			break;
		}
		regEl += "(";

		if (integerCharCount < 1) {
			regEl += "[0-9]\\d*";
		} else if (integerCharCount == 1) {
			regEl += "\\d{1}";
		} else {
			regEl += "[0-9]\\d{0," + (integerCharCount - 1) + "}";
		}

		regEl += "(\\.";

		if (decimalCharCount < 1) {
			regEl += "\\d*";
		} else {
			regEl += "\\d{0," + (decimalCharCount) + "}";
		}

		regEl += ")?)$";

		if (!(numberStr.matches(regEl))) {
			return true;
		}

		return false;
	}

	// 【数字类别校验正则表达式】
	// 匹配正整数:^[1-9]\d*$
	private static String intPositiveRegEl = "^[1-9]\\d*$";
	// 匹配负整数：^-[1-9]\d*$
	private static String intNegativeRegEl = "^-[1-9]\\d*$";

	// 匹配整数：^-?[1-9]\d*$
	private static String intAllRegEl = "^-?[1-9]\\d*$";
	// 匹配非负整数（正整数 + 0）:^[1-9]\d*|0$
	private static String intNotNegativeRegEl = "^[1-9]\\d*|0$";
	// 匹配非正整数（负整数 + 0）:^-[1-9]\d*|0$
	private static String intNotPositiveRegEl = "^-[1-9]\\d*|0$";

	// 匹配正浮点数:^[1-9]\d*\.\d*|0\.\d*[1-9]\d*$
	// 匹配负浮点数:^-([1-9]\d*\.\d*|0\.\d*[1-9]\d*)$
	// 匹配浮点数:^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$
	// 匹配非负浮点数（正浮点数 + 0）:^[1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0$
	// 匹配非正浮点数（负浮点数 + 0）:^(-([1-9]\d*\.\d*|0\.\d*[1-9]\d*))|0?\.0+|0$
	// 匹配非负数(大于0的数:包括大于0的的正整数,正浮点数):^([1-9]\d*|\d+\.\d+)$

	// 【常用字符串校验正则表达式】
	// 匹配由26个英文字母组成的字符串:^[A-Za-z]+$
	// 匹配由26个英文字母的大写组成的字符串:^[A-Z]+$
	// 匹配由26个英文字母的小写组成的字符串:^[a-z]+$
	// 匹配由数字和26个英文字母组成的字符串:^[A-Za-z0-9]+$
	private static String numAndLettersEl = "^[A-Za-z0-9]+$";
	// 匹配由数字、26个英文字母或者下划线组成的字符串:^\w+$

	// 匹配纯整数
	private static String numRegEl = "^[0-9]\\d*$";

	// 匹配正整数
	private static String intNumRegEl = "^[1-9]\\d*$";

	// 匹配国内电话号码：\d{3}-\d{8}|\d{4}-\d{7}
	private static String telNumEl = "\\d{3}-\\d{8}|\\d{4}-\\d{7}";

	// 匹配国内手机号码(前2位是13开头 或15 开头 或18 开头)：^1[358]\\d{9}$
	//private static String mobileNumEl = "^1[358]\\d{9}$";
	private static String mobileNumEl = "^[0-9-()+]+$";
	
	private static String phoneNumEl = "^[0-9-()+]+$";
	
	private static String faxNumEl = "^[0-9-()+]+$";
	
	private static String zipCodeEl="^[0-9]\\d*$";
	
	private static String idCardNoEl="^[0-9]\\d*$";
	
	
	// 匹配Email地址的正则表达式：\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*
	private static String emailEl = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";

	// 匹配网址URL的正则表达式：[a-zA-z]+://[^\s]*
	private static String urlEl = "[a-zA-z]+://[^\\s]*";

	// 匹配中国邮政编码：[0-9]\d{5}(?!\d)
	//private static String postalcodeEl = "[0-9]\\d{5}(?!\\d)";
	private static String postalcodeEl = "^[0-9]\\d*$";

	// 匹配身份证：\d{15}|\d{18}
	private static String idCardEl = "\\d{15}|\\d{18}";

	// 匹配ip地址：\d+\.\d+\.\d+\.\d+
	private static String ipEl = "\\d+\\.\\d+\\.\\d+\\.\\d+";

	// 匹配中文字符的正则表达式： [\u4e00-\u9fa5]
	private static String chinaCodeEl = "[\u4e00-\u9fa5]+";

	/**
	 * ## 方法说明：
	 * 	匹配正整数
	 * 
	 * @param numberStr
	 * @return 如果输入的字符串匹配正整数，则返回true，否则返回false
	 */
	public static boolean checkInteger(String numberStr) {
		return checkInteger(numberStr, MatchMode.Positive);
	}

	/**
	 * ## 方法说明：
	 * 	匹配正负整数
	 * 
	 * @param numberStr
	 * @param mode
	 *            匹配模式
	 * @return
	 */
	public static boolean checkInteger(String numberStr, MatchMode mode) {
		if (StringUtils.isEmpty(numberStr)) {
			return false;
		}
		switch (mode) {
		case Positive:
			return (numberStr.matches(intPositiveRegEl));
		case Negative:
			return (numberStr.matches(intNegativeRegEl));
		case All:
			return (numberStr.matches(intAllRegEl));
		case NotNegative:
			return (numberStr.matches(intNotNegativeRegEl));
		case NotPositive:
			return (numberStr.matches(intNotPositiveRegEl));
		default:
			return false;
		}
	}

	/**
	 * ## 方法说明：
	 * 	字符串非空校验
	 * 
	 * 
	 * @param str
	 *            校验字符串
	 * @return 空:true 非空:false
	 */
	public static boolean isBlankCheck(String str) {
		if (StringUtils.isBlank(str)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	数字,字母检查
	 * 
	 * @param intChar
	 *            校验字符串对象
	 * @return 不不合法:true 合法:false
	 */
	public static boolean isNumAndLettersCheck(String intChar) {
		if (!StringUtils.isEmpty(intChar) && !intChar.matches(numAndLettersEl)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	纯数字检查
	 * 
	 * 
	 * @param num
	 *            校验数字对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isNumCheck(String num) {
		if (!StringUtils.isEmpty(num) && !num.matches(numRegEl)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	正整数数字检查
	 * 
	 * 
	 * @param intNum
	 *            校验数字对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isIntNumCheck(String intNum) {
		if (!StringUtils.isEmpty(intNum) && !intNum.matches(intNumRegEl)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	正浮点数数字检查（只可输大于0的整数或精度为2位浮点数） 适用于户型面积等检查 合法格式为：999.99，或+999.99，或999，或0.99
	 * 
	 * 
	 * @param plusFolatNum
	 *            校验数字对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isPlusFolatNumCheck(String plusFolatNum) {
		// 如果为空时、直接返回
		if (StringUtils.isEmpty(plusFolatNum)) {
			return false;
		}

		java.util.regex.Matcher match = null;
		// 判断是否为数字
		java.util.regex.Pattern pattern = java.util.regex.Pattern
				.compile("[0-9]*");
		match = pattern.matcher(plusFolatNum.trim().replace("+", "")
				.replace(".", ""));
		if (!match.matches()) {
			return true;
		}

		// 判断是否为金额校验
		if (plusFolatNum.trim().indexOf(".") == -1) {
			pattern = java.util.regex.Pattern.compile("^[+]?[0-9]*");
			match = pattern.matcher(plusFolatNum.trim());
		} else {
			pattern = java.util.regex.Pattern
					.compile("^[+]?[0-9]+(\\.\\d{1,2}){1}");
			match = pattern.matcher(plusFolatNum.trim());
		}

		if (!match.matches()) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	日期开始、结束大小比较
	 * 
	 * 
	 * @param beginDate
	 *            开始日期
	 * @param endDate
	 *            结束日期
	 * @return 开始日期>结束日期时:true 结束日期>开始日期时:false
	 */
	public static boolean isBeginEndDateCheck(String beginDate, String endDate) {
		// 都不为空，且开始日期大于结束日期
		if (!StringUtils.isEmpty(beginDate) && !StringUtils.isEmpty(endDate)
				&& beginDate.compareToIgnoreCase(endDate) > 0) {
			return true;
		}
		return false;
	}

	/**
	 * ## 方法说明：
	 * 	时间开始、结束大小比较
	 * 
	 * 
	 * @param beginTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @return 开始时间>结束时间时:true 结束时间>开始时间时:false
	 */
	public static boolean isBeginEndTimeCheck(String beginTime, String endTime) {
		// 都不为空，且开始日期大于结束日期
		if (!StringUtils.isEmpty(beginTime) && !StringUtils.isEmpty(endTime)) {
			// 转化为整数进行大小比较
			int beginTimeInt = Integer.parseInt(DateUtil
					.formatDateRemoveCon(beginTime));
			int endTimeInt = Integer.parseInt(DateUtil
					.formatDateRemoveCon(endTime));
			if (beginTimeInt > endTimeInt) {
				return true;
			}
		}
		return false;
	}

	/**
	 * ## 方法说明：
	 * 	日期格式校验【YYYY-MM-DD】
	 * 
	 * 
	 * @param date
	 *            校验日期对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isDateCheck(String date) {
		if (!StringUtils.isEmpty(date)) {
			// 判断是否为数字
			java.util.regex.Pattern pattern = java.util.regex.Pattern
					.compile("[0-9]*");
			java.util.regex.Matcher match = pattern.matcher(DateUtil
					.formatDateRemoveCon(date));
			if (!match.matches()) {
				return true;
			}

			// 判断长度是否为8位
			if (date.replaceAll(Constant.CHAR_SLASH, "").length() != 8) {
				return true;
			}

		}
		return false;
	}

	/**
	 * ## 方法说明：
	 * 	日期格式校验【YYYY-MM-DD HH:MM】
	 * 
	 * 
	 * @param date
	 *            校验日期对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isDateTimeCheck(String date) {
		if (!StringUtils.isEmpty(date)) {
			String dateTime = DateUtil.formatDateRemoveCon(date);
			// 判断是否为数字
			java.util.regex.Pattern pattern = java.util.regex.Pattern
					.compile("[0-9]*");
			java.util.regex.Matcher match = pattern.matcher(dateTime);
			if (!match.matches()) {
				return true;
			}

			// 判断长度是否为11位或12位
			if (dateTime.length() != 11 && dateTime.length() != 12) {
				return true;
			}
		}
		return false;
	}

	/**
	 * ## 方法说明：
	 * 	时间格式校验【HH:MM】
	 * 
	 * 
	 * @param time
	 *            校验日期对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isTimeCheck(String time) {
		if (!StringUtils.isEmpty(time)) {
			String timeStr = DateUtil.formatDateRemoveCon(time);
			// 判断是否为数字
			java.util.regex.Pattern pattern = java.util.regex.Pattern
					.compile("[0-9]*");
			java.util.regex.Matcher match = pattern.matcher(timeStr);
			if (!match.matches()) {
				return true;
			}

			// 判断长度是否为3位或4位
			if (timeStr.length() != 3 && timeStr.length() != 4) {
				return true;
			}
		}
		return false;
	}

	/**
	 * ## 方法说明：
	 * 	国内电话号码校验
	 * 
	 * 
	 * @param telNum
	 *            校验电话号码对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isTelNumCheck(String telNum) {
		// 判断位数是否合法
		if (!StringUtils.isEmpty(telNum) && !telNum.matches(telNumEl)) {
			return true;
		}

		return false;
	}
	/**
	 * ## 方法说明：
	 * 	传真校验
	 * 
	 * @param faxNum
	 *            校验传真对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isfaxNumCheck(String faxNum) {
		// 判断位数是否合法
		if (!StringUtils.isEmpty(faxNum) && !faxNum.matches(faxNumEl)) {
			return true;
		}
		return false;
	}
	/**
	 * ## 方法说明：
	 * 	身份证号校验
	 * 
	 * 
	 * @param idCardNo
	 *            校验身份证号对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isIdCardNoCheck(String idCardNo) {
		// 判断位数是否合法
		if (!StringUtils.isEmpty(idCardNo) && !idCardNo.matches(idCardNoEl)) {
			return true;
		}
		return false;
	}
	
	/**
	 * ## 方法说明：
	 * 	邮编校验
	 * 
	 * 
	 * @param zipCode
	 *            校验邮编对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean iszipCodeCheck(String zipCode) {
		// 判断位数是否合法
		if (!StringUtils.isEmpty(zipCode) && !zipCode.matches(zipCodeEl)) {
			return true;
		}
		return false;
	}
	
	/**
	 * ## 方法说明：
	 * 	手机号码校验
	 * 
	 * 
	 * @param PhoneNum
	 *            校验手机号码对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isPhoneNumCheck(String PhoneNum) {
		// 判断位数是否合法
		if (!StringUtils.isEmpty(PhoneNum) && !PhoneNum.matches(phoneNumEl)) {
			return true;
		}
		return false;
	}
	/**
	 * ## 方法说明：
	 * 	手机号码校验
	 * 
	 * 
	 * @param mobileNum
	 *            校验手机号码对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isMobileNumCheck(String mobileNum) {
		// 判断位数是否合法
		if (!StringUtils.isEmpty(mobileNum) && !mobileNum.matches(mobileNumEl)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	Email地址校验
	 * 
	 * 
	 * @param eMail
	 *            校验Email地址对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isEmailCheck(String eMail) {
		if (!StringUtils.isEmpty(eMail) && !eMail.matches(emailEl)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	网址URL地址校验
	 * 
	 * 
	 * @param url
	 *            校验URL地址对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isUrlCheck(String url) {
		if (!StringUtils.isEmpty(url) && !url.matches(urlEl)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	中国邮政编码校验
	 * 
	 * 
	 * @param postalcode
	 *            校验邮政编码对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isPostalcodeCheck(String postalcode) {
		if (!StringUtils.isEmpty(postalcode)
				&& !postalcode.matches(postalcodeEl)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	身份证编码校验
	 * 
	 * 
	 * @param idCard
	 *            校验身份证对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isIdCardCheck(String idCard) {
		if (!StringUtils.isEmpty(idCard) && !idCard.matches(idCardEl)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	IP地址校验
	 * 
	 * 
	 * @param ip
	 *            校验IP地址对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isIPCheck(String ip) {
		if (!StringUtils.isEmpty(ip) && !ip.matches(ipEl)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	中文字符
	 * 
	 * 
	 * @param chinaCode
	 *            校验字符串对象
	 * @return 不合法:true 合法:false
	 */
	public static boolean isChinaCodeCheck(String chinaCode) {
		if (!StringUtils.isEmpty(chinaCode) && !chinaCode.matches(chinaCodeEl)) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	字符串长度校验（字节型校验） 一个汉字占2个字节，也就是说，如果都是汉字的话，DB为VarChar(256)的定义最多只能存128个汉字
	 * 
	 * 
	 * @param str
	 *            校验字符串对象
	 * @param strLengh
	 *            特定长度
	 * @return 不合法:true 合法:false
	 */
	public static boolean isStringLenghCheck(String str, int strLengh) {
		// 如果字节数大于指定字节
		if (!StringUtils.isEmpty(str) && str.length() > strLengh) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	金额校验（可输整数或精度为2位浮点数） 适用于金额等检查
	 * 
	 * 
	 * @param moneyStr
	 *            校验金额字符串对象
	 * @return 非合法金额:true,合法金额:false
	 */
	public static boolean isMoneyCheck(String moneyStr) {
		// 如果为空时、直接返回
		if (StringUtils.isEmpty(moneyStr)) {
			return false;
		}

		java.util.regex.Matcher match = null;
		// 判断是否为数字
		java.util.regex.Pattern pattern = java.util.regex.Pattern
				.compile("[0-9]*");
		match = pattern.matcher(moneyStr.trim().replace("+", "")
				.replace("-", "").replace(".", ""));
		if (!match.matches()) {
			return true;
		}

		// 判断是否为金额校验
		if (moneyStr.trim().indexOf(".") == -1) {
			pattern = java.util.regex.Pattern.compile("^[+-]?[0-9]*");
			match = pattern.matcher(moneyStr.trim());
		} else {
			pattern = java.util.regex.Pattern
					.compile("^[+-]?[0-9]+(\\.\\d{1,2}){1}");
			match = pattern.matcher(moneyStr.trim());
		}

		if (!match.matches()) {
			return true;
		}

		return false;
	}

	/**
	 * ## 方法说明：
	 * 	半角字符串检查(适合证件号码) 全角空格为12288，半角空格为32
	 * 	其他字符半角(33-126)与全角(65281-65374)的对应关系是：均相差65248
	 * 
	 * @param src
	 *            校验字符串对象
	 * @return 不不合法:true 合法:false
	 */
//	public static boolean isStrDbcCaseCheck(String src) {
//
//		char[] c = src.toCharArray();
//		for (int index = 0; index < c.length; index++) {
//			// 包含全角空格时
//			if (c[index] == 12288) {
//				return true;
//
//				// 包含其他全角字符时
//			} else if (c[index] > 65280 && c[index] < 65375) {
//				return true;
//			}
//		}
//
//		return false;
//	}
}
