/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.base.framework.core.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jw.base.framework.core.util.DataCheckUtil;
import com.jw.base.framework.core.util.DataCheckUtil.MatchMode;

/**
 * 
 * ## 类说明：
 * 	共通检查方法测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月13日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月13日|jianana|新增|DataCheckUtilTest.java新增
 */
public class DataCheckUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheckFloat() {
		boolean b = DataCheckUtil.checkFloat("145", MatchMode.Positive);
		//Assert.assertTrue(b);
		boolean b1 = DataCheckUtil.checkFloat("145.52", MatchMode.Positive,2);
		//Assert.assertTrue(b1);
		boolean b2 = DataCheckUtil.checkFloat("145.52", MatchMode.Positive, 3, 2);
		//Assert.assertTrue(b2);
	}


	@Test
	public void testCheckIntegerString() {
		boolean b = DataCheckUtil.checkInteger("10");
		Assert.assertTrue(b);
		
		boolean b1 = DataCheckUtil.checkInteger("10", MatchMode.Positive);
		Assert.assertTrue(b1);
		
		boolean b2 = DataCheckUtil.checkInteger("");
		Assert.assertFalse(b2);
		
		boolean b3 = DataCheckUtil.checkInteger("-10", MatchMode.Negative);
		Assert.assertTrue(b3);
		
		boolean b4 = DataCheckUtil.checkInteger("10", MatchMode.All);
		Assert.assertTrue(b4);
		
		boolean b5 = DataCheckUtil.checkInteger("10", MatchMode.NotNegative);
		Assert.assertTrue(b5);
		
		boolean b6 = DataCheckUtil.checkInteger("-10", MatchMode.NotPositive);
		Assert.assertTrue(b6);
		
	}


	@Test
	public void testIsBlankCheck() {
		boolean b = DataCheckUtil.isBlankCheck("");
		Assert.assertTrue(b);
		
		boolean b1 = DataCheckUtil.isBlankCheck("1");
		Assert.assertFalse(b1);
	}

	@Test
	public void testIsNumAndLettersCheck() {
		boolean b = DataCheckUtil.isNumAndLettersCheck("测试");
		Assert.assertTrue(b);
		
		boolean b2 = DataCheckUtil.isNumAndLettersCheck("");
		Assert.assertFalse(b2);
		
		boolean b1 = DataCheckUtil.isNumAndLettersCheck("abc");
		Assert.assertFalse(b1);
	}

	@Test
	public void testIsNumCheck() {
		boolean b = DataCheckUtil.isNumCheck("测试");
		Assert.assertTrue(b);
		
		boolean b2 = DataCheckUtil.isNumCheck("");
		Assert.assertFalse(b2);
		
		boolean b1 = DataCheckUtil.isNumCheck("789");
		Assert.assertFalse(b1);
	}

	@Test
	public void testIsIntNumCheck() {
		boolean b = DataCheckUtil.isIntNumCheck("测试");
		Assert.assertTrue(b);
		
		boolean b2 = DataCheckUtil.isIntNumCheck("");
		Assert.assertFalse(b2);
		
		boolean b1 = DataCheckUtil.isIntNumCheck("789");
		Assert.assertFalse(b1);
	}

	@Test
	public void testIsPlusFolatNumCheck() {
		boolean b = DataCheckUtil.isPlusFolatNumCheck("测试");
		Assert.assertTrue(b);
		
		boolean b3 = DataCheckUtil.isPlusFolatNumCheck("789.123");
		Assert.assertTrue(b3);
		
		boolean b2 = DataCheckUtil.isPlusFolatNumCheck("");
		Assert.assertFalse(b2);
		
		boolean b1 = DataCheckUtil.isPlusFolatNumCheck("789");
		Assert.assertFalse(b1);
	}

	@Test
	public void testIsBeginEndDateCheck() {
		boolean b = DataCheckUtil.isBeginEndDateCheck("2016-12-12", "2016-12-01");
		Assert.assertTrue(b);
		
		boolean b1 = DataCheckUtil.isBeginEndDateCheck("2016-12-12", "2016-12-15");
		Assert.assertFalse(b1);
		
		boolean b2 = DataCheckUtil.isBeginEndDateCheck("2016-12-12", " ");
		Assert.assertTrue(b2);
		
		boolean b3 = DataCheckUtil.isBeginEndDateCheck(" ", "2016-12-12");
		Assert.assertFalse(b3);
	}

	@Test
	public void testIsBeginEndTimeCheck() {
		boolean b = DataCheckUtil.isBeginEndTimeCheck("24:59:59", "00:01:01");
		Assert.assertTrue(b);
		
		boolean b1 = DataCheckUtil.isBeginEndTimeCheck("00:01:01", "24:59:59");
		Assert.assertFalse(b1);
		
	}

	@Test
	public void testIsDateCheck() {
		boolean b = DataCheckUtil.isDateCheck("2016-12-12");
		Assert.assertFalse(b);
		

		boolean b1 = DataCheckUtil.isDateCheck(" ");
		Assert.assertTrue(b1);
		
		boolean b2 = DataCheckUtil.isDateCheck("ceshi");
		Assert.assertTrue(b2);
	}

	@Test
	public void testIsDateTimeCheck() {
		boolean b = DataCheckUtil.isDateTimeCheck("2016-12-12 12:20");
		Assert.assertFalse(b);
		

		boolean b1 = DataCheckUtil.isDateTimeCheck(" ");
		Assert.assertTrue(b1);
		
		boolean b2 = DataCheckUtil.isDateTimeCheck("ceshi");
		Assert.assertTrue(b2);
	}

	@Test
	public void testIsTimeCheck() {
		boolean b = DataCheckUtil.isTimeCheck("12:20");
		Assert.assertFalse(b);		

		boolean b1 = DataCheckUtil.isTimeCheck(" ");
		Assert.assertTrue(b1);
		
		boolean b2 = DataCheckUtil.isTimeCheck("ceshi");
		Assert.assertTrue(b2);
	}

	@Test
	public void testIsTelNumCheck() {
		boolean b = DataCheckUtil.isTelNumCheck("023-88211816");
		Assert.assertFalse(b);		

		boolean b1 = DataCheckUtil.isTelNumCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsfaxNumCheck() {
		boolean b = DataCheckUtil.isfaxNumCheck("62236601");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isfaxNumCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsIdCardNoCheck() {
		boolean b = DataCheckUtil.isIdCardNoCheck("142635190101010024");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isIdCardNoCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIszipCodeCheck() {
		boolean b = DataCheckUtil.iszipCodeCheck("041300");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.iszipCodeCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsPhoneNumCheck() {
		boolean b = DataCheckUtil.isPhoneNumCheck("18301041254");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isPhoneNumCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsMobileNumCheck() {
		boolean b = DataCheckUtil.isMobileNumCheck("18301041254");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isMobileNumCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsEmailCheck() {
		boolean b = DataCheckUtil.isEmailCheck("5914352@a.c");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isEmailCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsUrlCheck() {
		boolean b = DataCheckUtil.isUrlCheck("http://localhost/a/b.com");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isUrlCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsPostalcodeCheck() {
		boolean b = DataCheckUtil.isPostalcodeCheck("041300");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isPostalcodeCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsIdCardCheck() {
		boolean b = DataCheckUtil.isIdCardCheck("142635190101010024");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isIdCardCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsIPCheck() {
		boolean b = DataCheckUtil.isIPCheck("192.168.1.1");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isIPCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsChinaCodeCheck() {
		boolean b = DataCheckUtil.isChinaCodeCheck("中文");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isChinaCodeCheck(" ");
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsStringLenghCheck() {
		boolean b = DataCheckUtil.isStringLenghCheck("中文",2);
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isStringLenghCheck("中文",1);
		Assert.assertTrue(b1);
	}

	@Test
	public void testIsMoneyCheck() {
		boolean b = DataCheckUtil.isMoneyCheck("5.01");
		Assert.assertFalse(b);		
		
		boolean b1 = DataCheckUtil.isMoneyCheck("中文");
		Assert.assertTrue(b1);
		
		boolean b2 = DataCheckUtil.isMoneyCheck("5");
		Assert.assertFalse(b2);	
		
		boolean b3 = DataCheckUtil.isMoneyCheck("");
		Assert.assertFalse(b3);
	}

}
