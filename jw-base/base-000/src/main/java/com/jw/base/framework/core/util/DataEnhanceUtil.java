/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.base64.AESUtil;
import com.jw.base.framework.core.util.base64.SymmetricUtil;

/**
 * ## 类说明：
 * 	数据增强处理工具类
 * @author    [guoc]   
 * @version   [V1.0, 2016年12月27日]
 * @package com.jw.base.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月27日|guoc|新增|DataEnhanceUtil.java新增
 */
public class DataEnhanceUtil {

	/**
	 * 
	 * ## 方法说明： 
	 * 	根据密钥解密字符串并按照指定的正则表达式显示
	 * 	并且按照指定格式mask解密后的字符串
	 * @param inptString	输入的字符串
	 * @param cryptKey		密钥
	 * @param prefixSize	保留字符串开头位数
	 * @param suffixSzie	保留字符串结尾位数
	 * @param maskChar		mask字符（例如：*）
	 * @return
	 * @throws Exception
	 */
	public static String decryptString(String inptString, String cryptKey, String prefixSize, String suffixSzie,
			String maskChar) throws Exception {
		String outputString = "";

		if (StringUtil.isEmpty(inptString)) {
			return "";
		}
		
		if (StringUtil.isEmpty(maskChar)) {
			// 如果mask字符为空需要设置默认值*
			maskChar = Constant.CRYPT_CHAR;
		}

		if (StringUtil.isEmpty(cryptKey)) {
			// 如果密钥为空，用*隐藏原字符串
			outputString = StringUtils.repeat(maskChar, inptString.length());
			return outputString;
		}

		// 解密处理
		outputString = AESUtil.Decrypt(inptString, cryptKey);
		if (outputString == null) {
			outputString = inptString;
			return outputString;
		}

		// 按照指定格式mask解密后的字符串
		//return maskString(outputString, prefixSize, suffixSzie, maskChar); TODO jianana
		return outputString;
	}
	
	public static String decryptString(String inptString, Map<String, String> cryptKey, String prefixSize, String suffixSzie,
			String maskChar) throws Exception {
		String outputString = "";

		if (StringUtil.isEmpty(inptString)) {
			return "";
		}
		
		if (StringUtil.isEmpty(maskChar)) {
			// 如果mask字符为空需要设置默认值*
			maskChar = Constant.CRYPT_CHAR;
		}

		if (MapUtils.isEmpty(cryptKey) || cryptKey.size() != 256) {
			// 如果密钥为空，用*隐藏原字符串
			outputString = StringUtils.repeat(maskChar, inptString.length());
			return outputString;
		}

		// 解密处理
		outputString = SymmetricUtil.Decrypt(inptString, cryptKey);
		if (outputString == null) {
			outputString = inptString;
			return outputString;
		}

		// 按照指定格式mask解密后的字符串
		//return maskString(outputString, prefixSize, suffixSzie, maskChar); TODO jianana
		return outputString;
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	字符串遮罩
     * @param inptString	输入的字符串
	 * @param prefixSize	保留字符串开头位数
	 * @param suffixSzie	保留字符串结尾位数
	 * @param maskChar		mask字符（例如：*）
	 * @return
	 */
	public static String maskString(String inptString, String prefixSize, String suffixSzie, String maskChar) {
		String outputString = "";
		String prefixRegx = "([\\d\\D]{%})";	// 匹配字符串开头的正则表达式
		String middleRegx = "([\\d\\D]*)";		// 匹配字符串中间的正则表达式
		String suffixRegx = "([\\d\\D]{%})";	// 匹配字符串结尾的正则表达式
		
		Boolean prefixIsNotNull = false;
		Boolean suffixIsNotNull = false;
		
		StringBuilder strBuilderRegx = new StringBuilder();
		
		if (StringUtil.isEmpty(maskChar)) {
			// 如果mask字符为空需要设置默认值*
			maskChar = Constant.CRYPT_CHAR;
		}
		
		if (!StringUtil.isEmpty(prefixSize)) {
			// 如果开头位数不为空，添加匹配开头的正则表达式
			prefixIsNotNull = true;
			strBuilderRegx.append(prefixRegx.replace("%", prefixSize));
		} 
		
		// 添加匹配中间的正则表达式
		strBuilderRegx.append(middleRegx);
		
		if (!StringUtil.isEmpty(suffixSzie)) {
			// 如果结尾位数不为空，添加匹配结尾的正则表达式
			suffixIsNotNull = true;
			strBuilderRegx.append(suffixRegx.replace("%", suffixSzie));
		}
		
		// 根据指定的替换正则表达式和规则，返回字符串
		// 以下逻辑符合类似于“([\\d\\D]{2})([\\d\\D]*)([\\d\\D]{2})”模式的正则表达式
		// 替换逻辑解释：将联系方式的前2位/后2位显示（位数可以配置4位或其他），中间全部用*替换
		Pattern pat = Pattern.compile(strBuilderRegx.toString());
		Matcher mat = pat.matcher(inptString);
		Boolean rs = mat.find();
		if (rs) {
			
			if (prefixIsNotNull && suffixIsNotNull) {
				// 开头和结尾都显示的情况
				outputString = mat.group(1) + StringUtils.repeat(maskChar, mat.group(2).length()) + mat.group(3);
			} else if (prefixIsNotNull) {
				// 只显示开头的情况
				outputString = mat.group(1) + StringUtils.repeat(maskChar, mat.group(2).length());
			} else if (suffixIsNotNull) {
				// 只显示结尾的情况
				outputString = StringUtils.repeat(maskChar, mat.group(1).length()) + mat.group(2);
			} else {
				// 全部mask的情况
				outputString = StringUtils.repeat(maskChar, mat.group(1).length());
			}
			
		} else {
			// 如果正则不匹配则直接返回源字符串
			outputString = inptString;
		}
		
		return outputString;
	}

	/**
	 * 
	 * ## 方法说明： 
	 * 	根据密钥加密字符串并返回
	 * 
	 * @param inptString
	 *            输入字符串
	 * @param cryptKey
	 *            密钥
	 * @return 返回加密后的字符串
	 * @throws Exception
	 */
	public static String encryptString(String inptString, String cryptKey) throws Exception {
		String outputString = "";

		if (StringUtil.isEmpty(inptString)) {
			return "";
		}

		if (StringUtil.isEmpty(cryptKey)) {
			// 如果密钥为空，则返回空字符串
			return "";
		}

		// 加密处理
		outputString = AESUtil.Encrypt(inptString, cryptKey);
		if (outputString == null) {
			outputString = inptString;
		}

		return outputString;
	}
	
	public static String encryptString(String inptString, Map<String, String> cryptKey) throws Exception {
		String outputString = "";

		if (StringUtil.isEmpty(inptString)) {
			return "";
		}

		if (MapUtils.isEmpty(cryptKey) || cryptKey.size() != 256) {
			// 如果密钥为空，则返回空字符串
			throw new BusinessException("","","",BsProcessErrorCode.ERROR_LEVEL_5);
		}

		// 加密处理
		outputString = SymmetricUtil.Encrypt(inptString, cryptKey);

		return outputString;
	}

	/**
	 * 
	 * ## 方法说明： 
	 * 	根据字段名分析该字段属于哪一种敏感信息类型 以方便从ThreadLocal获取对应的显示模式
	 * 
	 * @param fieldName
	 *            字段名
	 * @return ThreadLocal中用户保存敏感信息显示模式的key
	 */
	public static String analysisCryptType(String fieldName) {
		String sName = fieldName.toLowerCase();
		if (sName.endsWith(Constant.CRYPT_FIELD_SUFFIX_TLNO)) {
			// 电话号码
			return Constant.CRYPT_TYPE_MAPKEY_TLNO;
		} else if (sName.endsWith(Constant.CRYPT_FIELD_SUFFIX_PHNO)) {
			// 手机号码
			return Constant.CRYPT_TYPE_MAPKEY_PHNO;
		} else if (sName.endsWith(Constant.CRYPT_FIELD_SUFFIX_MBNO)) {
			// 会员卡号
			return Constant.CRYPT_TYPE_MAPKEY_MBNO;
		} else if (sName.endsWith(Constant.CRYPT_FIELD_SUFFIX_CDNO)) {
			// 信用卡号
			return Constant.CRYPT_TYPE_MAPKEY_CDNO;
		} else if (sName.endsWith(Constant.CRYPT_FIELD_SUFFIX_IDCD)) {
			// 身份证号
			return Constant.CRYPT_TYPE_MAPKEY_IDCD;
		} else if (sName.endsWith(Constant.CRYPT_FIELD_SUFFIX_EMAIL)) {
			// 电子邮件
			return Constant.CRYPT_TYPE_MAPKEY_EMAIL;
		} else if (sName.endsWith(Constant.CRYPT_FIELD_SUFFIX_CONTACT_NO)) {
			// 通用联系方式号码
			return Constant.CRYPT_TYPE_MAPKEY_CONTACT_NO;
		}

		return "";
	}

	// 测试
	public static void main(String[] args) {
		try {
			String phone = "130201-0023";
			String idcard = "1521125462";
			String filled = StringUtils.repeat("*", 10);
			
			System.out.println(maskString(idcard,"","5","+"));
			
			//System.out.println(phone.replaceAll("^(\\d{2})([\\d\\D]*)(\\d{2})$", "$1**$2"));

			// // 130****0023
			// System.out.println(phone.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2"));
			// // 1521*****5468
			// System.out.println(idcard.replaceAll("(\\d{4})\\d{10}(\\w{4})","$1*****$2"));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
