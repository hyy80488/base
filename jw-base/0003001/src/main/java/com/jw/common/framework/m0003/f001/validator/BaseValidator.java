/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0003.f001.validator;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.jw.base.framework.core.util.BeanUtil;
import com.jw.base.framework.core.util.DataCheckUtil;

/**
 * ## 类说明：
 * 	基础校验抽象类
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.validator
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|BaseValidator.java新增
 */
public abstract class BaseValidator implements Validator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public abstract boolean supports(Class<?> clazz);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#validate(java.lang.Object,
	 * org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object target, Errors errors) {
		try {
			BeanUtil.trimProperties(target);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		doValidate(target, errors);
	}

	public abstract void doValidate(Object target, Errors errors);

	/**
	 * ## 方法说明：
	 * 	验证数字类型
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param numberStr
	 *            需要验证的数据
	 * @param mode
	 *            Positive 正, Negative 负, All正+负, NotNegative 非负, NotPositive 非正
	 * @param decimalCharCount
	 *            小数位
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateFloat(String fieldName, String numberStr, DataCheckUtil.MatchMode mode, int decimalCharCount,
			Errors errors, String messageKey) {
		if (DataCheckUtil.checkFloat(numberStr, mode, decimalCharCount)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证URL
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param urlStr
	 *            需要验证的URL
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateUrl(String fieldName, String urlStr, Errors errors, String messageKey) {
		if (DataCheckUtil.isUrlCheck(urlStr)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证IP
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param IPStr
	 *            需要验证的ip
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateIPCheck(String fieldName, String IPStr, Errors errors, String messageKey) {
		if (DataCheckUtil.isUrlCheck(IPStr)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证不可超过N字符
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param lenStr
	 *            需要验证的数据
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 * @param len
	 *            长度
	 */
	public void validateGreaterLength(String fieldName, String lenStr, Errors errors, String messageKey, Integer len) {
		if (null!=lenStr && lenStr.length() > len) {
			errors.rejectValue(fieldName, messageKey + ":" + len);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证不可小于N字符
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param lenStr
	 *            需要验证的数据
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 * @param len
	 *            长度
	 */
	public void validateLessLength(String fieldName, String lenStr, Errors errors, String messageKey, Integer len) {
		if (null!=lenStr && lenStr.length() < len) {
			errors.rejectValue(fieldName, messageKey + ":" + len);
		}
	}

	/**
	 * ## 方法说明：
	 * 	非空验证
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateEmpty(String fieldName, Errors errors, String messageKey) {
		ValidationUtils.rejectIfEmpty(errors, fieldName, messageKey);
	}

	/**
	 * ## 方法说明：
	 * 	开始日期小于结束日期
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param beginDate
	 *            开始日期
	 * @param endDate
	 *            结束日期
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateIsBeginEndDateCheck(String fieldName, String beginDate, String endDate, Errors errors,
			String messageKey) {
		if (DataCheckUtil.isBeginEndDateCheck(beginDate, endDate)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	开始日期小于结束日期
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param beginTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateIsBeginEndTimeCheck(String fieldName, String beginTime, String endTime, Errors errors,
			String messageKey) {
		if (DataCheckUtil.isBeginEndTimeCheck(beginTime, endTime)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证数字类型
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param numberStr
	 *            需要验证的数据
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateNumberCheck(String fieldName, String numberStr, Errors errors, String messageKey) {
		if (DataCheckUtil.isNumCheck(numberStr)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证整数类型
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param numberStr
	 *            需要验证的数据
	 * @param mode
	 *            Positive 正, Negative 负, All正+负, NotNegative 非负, NotPositive 非正
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateIntegerCheck(String fieldName, String numberStr, DataCheckUtil.MatchMode mode, Errors errors,
			String messageKey) {
		if (!DataCheckUtil.checkInteger(numberStr, mode)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证长度
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param numberStr
	 *            需要验证的数据
	 * @param len
	 *            长度
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateStringLenCheck(String fieldName, String numberStr, Integer len, Errors errors,
			String messageKey) {
		if (DataCheckUtil.isStringLenghCheck(numberStr, len)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证Email
	 * 
	 * @param fieldName
	 * @param eMail
	 * @param errors
	 * @param messageKey
	 */
	public void validateEmailCheck(String fieldName, String eMail, Errors errors, String messageKey) {
		if (DataCheckUtil.isEmailCheck(eMail)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证身份证号
	 * 
	 * @param fieldName
	 * @param idCardNo
	 * @param errors
	 * @param messageKey
	 */
	public void validateIdCardNoCheck(String fieldName, String idCardNo, Errors errors, String messageKey) {
		if (DataCheckUtil.isIdCardNoCheck(idCardNo)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证国内电话号码
	 * 
	 * @param fieldName
	 * @param telNum
	 * @param errors
	 * @param messageKey
	 */
	public void validateTelCheck(String fieldName, String telNum, Errors errors, String messageKey) {
		if (DataCheckUtil.isTelNumCheck(telNum)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证手机号码
	 * 
	 * @param fieldName
	 * @param mobileNum
	 * @param errors
	 * @param messageKey
	 */
	public void validateMobileCheck(String fieldName, String mobileNum, Errors errors, String messageKey) {
		if (DataCheckUtil.isMobileNumCheck(mobileNum)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证手机号码
	 * 
	 * @param fieldName
	 * @param mobileNum
	 * @param errors
	 * @param messageKey
	 */
	public void validatePhoneCheck(String fieldName, String phoneNum, Errors errors, String messageKey) {
		if (DataCheckUtil.isPhoneNumCheck(phoneNum)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证邮编
	 * 
	 * @param fieldName
	 * @param zipCode
	 * @param errors
	 * @param messageKey
	 */
	public void validateZipCodeCheck(String fieldName, String zipCode, Errors errors, String messageKey) {
		if (DataCheckUtil.iszipCodeCheck(zipCode)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证中国邮编
	 * 
	 * @param fieldName
	 * @param postalcode
	 * @param errors
	 * @param messageKey
	 */
	public void validatePostalcodeCheck(String fieldName, String postalcode, Errors errors, String messageKey) {
		if (DataCheckUtil.isPostalcodeCheck(postalcode)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证传真
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param telNum
	 *            需要验证的数据
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateFaxNumCheck(String fieldName, String faxNum, Errors errors, String messageKey) {
		if (!DataCheckUtil.isfaxNumCheck(faxNum)) {
			errors.rejectValue(fieldName, messageKey);
		}
	}

	/**
	 * ## 方法说明：
	 * 	验证最大不可超过多少
	 * 
	 * @param fieldName
	 *            属性名称
	 * @param value
	 *            值
	 * @param maxNumber
	 *            最大值
	 * @param errors
	 * @param messageKey
	 *            国际化属性名称
	 */
	public void validateMaxNumberValue(String fieldName, Integer value, Integer maxNumber, Errors errors,
			String messageKey) {
		if (null!=value && maxNumber < value) {
			errors.rejectValue(fieldName, messageKey);
		}
	}
	/**
	 * 
	 * ## 方法说明：
	 * 	验证 BigDecimal长度
	 * @param fieldName
	 * @param value
	 * @param precision  总长度
	 * @param scale	小数点最大位数
	 * @param errors
	 * @param messageKey
	 */
	public void validateBigDecimalValue(String fieldName, BigDecimal value, Errors errors,String messageKey,Integer precision, Integer scale) {
		if (null!=value ) {
			int scale2 = value.scale();
			int precision2 = value.precision();
			int intValue2 = precision2 - scale2;
			int intValue = precision-scale;
			if(precision2>=precision||scale2>scale||intValue2>intValue){
//				errors.rejectValue(fieldName, messageKey);
				errors.rejectValue(fieldName, messageKey + ":(" + precision+","+scale+")");
			}
		}
	}
}
