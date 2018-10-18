/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.math.BigDecimal;

import org.apache.commons.lang3.ArrayUtils;

import com.jw.base.framework.core.RoundModeEnum;

/**
 * ## 类说明：
 * 	标准计算工具类(Caculator_Util)
 * @author    [guochun]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|guochun|新增|CalcUtil.java新增
 */
public class CalcUtil {
	
	/**
	 * 默认除法运算精度
	 */
    private static final int DEF_DIV_SCALE = 15;

    
    /**
     * 提供精确的加法运算。
     * @param v1 被加数
     * @param v2 加数
     * @return 两个参数的和
     */
    public static double add(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }
    
    /**
     * 提供精确的减法运算。
     * @param v1 被减数
     * @param v2 减数
     * @return 两个参数的差
     */
    public static double sub(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    } 
    
    /**
     * 提供精确的乘法运算。
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static double mul(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }
    
    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到
     * 小数点以后15位，以后的数字截断。
     * @param v1 被除数
     * @param v2 除数
     * @return 两个参数的商
     */
    public static double div(double v1,double v2){
        return div(v1,v2,DEF_DIV_SCALE);
    }
    
    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字截断。
     * @param v1 被除数
     * @param v2 除数
     * @param scale 表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static double div(double v1,double v2,int scale){
        if(scale<0){
            throw new IllegalArgumentException(
                "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2,scale,BigDecimal.ROUND_DOWN).doubleValue();
    }
    
    private static final Integer[] ROUNDINGMODES = {
    		BigDecimal.ROUND_UP,
    		BigDecimal.ROUND_DOWN,
    		BigDecimal.ROUND_CEILING,
    		BigDecimal.ROUND_FLOOR,
    		BigDecimal.ROUND_HALF_UP,
    		BigDecimal.ROUND_HALF_DOWN,
    		BigDecimal.ROUND_HALF_EVEN,
    		BigDecimal.ROUND_UNNECESSARY}; 
    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字截断。
     * @param v1 被除数
     * @param v2 除数
     * @param roundingMode 进位规则
     * @param scale 表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static double div(double v1,double v2,Integer roundingMode, int scale){
        if(scale<0){
            throw new IllegalArgumentException(
                "The scale must be a positive integer or zero");
        }
        //不存在对应数据  设置四舍五入
        if(!ArrayUtils.contains(ROUNDINGMODES, roundingMode)){
        	roundingMode = BigDecimal.ROUND_HALF_UP;
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2,scale,roundingMode).doubleValue();
    }
    
    /**
     * 提供精确的小数位处理。
     * @param v 需要处理的数字
     * @param roundMode 小数处理方式
     * @param scale 小数点后保留几位
     * @return 
     */
    public static double round(double v, RoundModeEnum roundMode, int scale){
        if(scale<0){
            throw new IllegalArgumentException(
                "The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        if (roundMode == RoundModeEnum.roundHalfUp) {
			// 四舍五入
			return b.divide(one,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
        } else if (roundMode == RoundModeEnum.roundHalfEven) {
        	// 四舍六入五成双
        	return b.divide(one,scale,BigDecimal.ROUND_HALF_EVEN).doubleValue();
		} else if (roundMode == RoundModeEnum.intValue) {
			// 取整
			return b.intValue();
		} else if (roundMode == RoundModeEnum.roundUp) {
			// 向上取整
			return b.divide(one,scale,BigDecimal.ROUND_UP).doubleValue();
		} else if (roundMode == RoundModeEnum.roundDown) {
			// 向下取整
			return b.divide(one,scale,BigDecimal.ROUND_DOWN).doubleValue();
		} else {
	        return b.divide(one,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
		}
    }
    
    
    public static BigDecimal round(BigDecimal b, RoundModeEnum roundMode, int scale){
        if(scale<0){
            throw new IllegalArgumentException(
                "The scale must be a positive integer or zero");
        }
        BigDecimal one = new BigDecimal("1");
        if (roundMode == RoundModeEnum.roundHalfUp) {
			// 四舍五入
			return b.divide(one,scale,BigDecimal.ROUND_HALF_UP);
        } else if (roundMode == RoundModeEnum.roundHalfEven) {
        	// 四舍六入五成双
        	return b.divide(one,scale,BigDecimal.ROUND_HALF_EVEN);
		} else if (roundMode == RoundModeEnum.intValue) {
			// 取整
			return b;
		} else if (roundMode == RoundModeEnum.roundUp) {
			// 向上取整
			return b.divide(one,scale,BigDecimal.ROUND_UP);
		} else if (roundMode == RoundModeEnum.roundDown) {
			// 向下取整
			return b.divide(one,scale,BigDecimal.ROUND_DOWN);
		} else {
	        return b.divide(one,scale,BigDecimal.ROUND_HALF_UP);
		}
    }
    
    /**
     * 
     * ## 方法说明：
     * 	double 转 BigDecimal
     * @param v
     * @return
     */
    public static BigDecimal toDecimal(double v){
    	return new BigDecimal(Double.toString(v));
    }
    
    /**
     * 
     * ## 方法说明：
     * 	BigDecimal 转   double
     * @param v
     * @return
     */
    public static double toDouble(BigDecimal v){
    	if (null == v) {
    		return 0;
    	}
    	return v.doubleValue();
    }
    
	/**
	 * ## 方法说明：
	 * 	通过指定货币币种处理数值
	 * 
	 * @param price
	 * @param currencyId
	 * @return BigDecimal 注：通常处理外币时使用
	 */
	public static BigDecimal getDecimal(BigDecimal amount, RoundModeEnum roundMode, int scale) {
		if (amount == null) {
			return null;
		}

		if (roundMode == RoundModeEnum.roundHalfUp) {
			// 四舍五入
			amount = amount.setScale(scale, BigDecimal.ROUND_HALF_UP);
		} else if (roundMode == RoundModeEnum.roundHalfEven) {
			// 四舍六入五成双
			amount = amount.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
		} else if (roundMode == RoundModeEnum.intValue) {
			// 取整
			amount = new BigDecimal(amount.intValue());
		} else if (roundMode == RoundModeEnum.roundUp) {
			// 向上取整
			amount = amount.setScale(scale, BigDecimal.ROUND_UP);
		} else if (roundMode == RoundModeEnum.roundDown) {
			// 向下取整
			amount = amount.setScale(scale, BigDecimal.ROUND_DOWN);
		} else {
			amount = amount.setScale(scale, BigDecimal.ROUND_HALF_UP);
		}

		return amount;
	}
	
}
