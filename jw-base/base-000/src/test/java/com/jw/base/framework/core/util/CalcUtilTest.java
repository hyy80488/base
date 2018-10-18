/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.jw.base.framework.core.RoundModeEnum;
import com.jw.base.framework.core.util.CalcUtil;
/**
 * 
 * ## 类说明：
 * 	测试标准计算工具类
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月13日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月13日|jianana|新增|CalcUtilTest.java新增
 */
public class CalcUtilTest {


	@Test
	public void testGetDecimal() {
		Double a = 100.25;
		Double b = 33.458;
		Double c = 53.99;
		Double d = 67.111;
		// 加减乘除
		Double result = ((c + b) - d) * a / b;
		BigDecimal r1 = CalcUtil.getDecimal(new BigDecimal(result.toString()), RoundModeEnum.roundHalfUp, 2);
		Assert.assertEquals(r1, new BigDecimal("60.94"));
		BigDecimal r3 = CalcUtil.getDecimal(new BigDecimal(result.toString()), RoundModeEnum.intValue, 2);
		Assert.assertEquals(r3, new BigDecimal("60"));
		BigDecimal r4 = CalcUtil.getDecimal(new BigDecimal(result.toString()), RoundModeEnum.roundUp, 2);
		Assert.assertEquals(r4, new BigDecimal("60.94"));
		BigDecimal r5 = CalcUtil.getDecimal(new BigDecimal(result.toString()), RoundModeEnum.roundDown, 2);
		Assert.assertEquals(r5, new BigDecimal("60.93"));
		BigDecimal r6 = CalcUtil.getDecimal(new BigDecimal(result.toString()), null, 2);
		Assert.assertEquals(r6, new BigDecimal("60.94"));
		BigDecimal r7 = CalcUtil.getDecimal(null, RoundModeEnum.roundDown, 2);
		Assert.assertNull(r7);
	}

}
