/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.StringUtil;

/**
 * 
 * ## 类说明：
 * 	字符转换类测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月13日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月13日|jianana|新增|StringUtilTest.java新增
 */
public class StringUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsNumeric() {
		boolean b = StringUtil.isNumeric("2");
		Assert.assertTrue(b);
		
		boolean b1 = StringUtil.isNumeric("a");
		Assert.assertFalse(b1);
	}

	@Test
	public void testGetRandomString() {
		String s = StringUtil.getRandomString(10);
		Assert.assertEquals(10, s.length());
	}

	@Test
	public void testStringFilter() {
		String s = StringUtil.StringFilter(null);
		Assert.assertEquals("", s);
		
		String s1 = StringUtil.StringFilter("12@45");
		Assert.assertEquals("1245", s1);
	}
	

	@Test
	public void testEncryptSha256() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String s = StringUtil.encryptSha256("123456");
		Assert.assertEquals(44, s.length());
	}


	@Test
	public void testStringToUnicode() {
		String s = StringUtil.stringToUnicode("测试");
		String u = StringUtil.unicodeToString(s);
		
		Assert.assertEquals("测试", u);
	}


	@Test
	public void testHtml2Text() {
		String s = StringUtil.html2Text("<h1>标题</h1><br/><p>内容</p>");
		Assert.assertEquals("标题内容", s);
	}

	@Test
	public void testIsEmpty() {
		boolean b = StringUtil.isEmpty(null);
		Assert.assertTrue(b);
		
		boolean b1 = StringUtil.isEmpty("1");
		Assert.assertFalse(b1);
		
		boolean b2 = StringUtil.isEmpty("");
		Assert.assertTrue(b2);
	}

	@Test
	public void testIsNotEmpty() {
		boolean b = StringUtil.isNotEmpty(null);
		Assert.assertFalse(b);
		
		boolean b1 = StringUtil.isNotEmpty("1");
		Assert.assertTrue(b1);
		
		boolean b2 = StringUtil.isNotEmpty("");
		Assert.assertFalse(b2);
	}


	@Test
	public void testAddZero() throws Exception {
		String s = StringUtil.addZero(5, 6);
		Assert.assertEquals("000005", s);
		try {
			StringUtil.addZero(5999999, 6);
		} catch (BusinessException e) {
			Assert.assertEquals(e.getCode(), BsProcessErrorCode.ERROR_CODE_000001);
		}
	}


	@Test
	public void testFormatMoney() {
		String s = StringUtil.formatMoney("88888.02");
		Assert.assertEquals("88,888.02", s);
		
		String s1 = StringUtil.formatMoney(" ");
		Assert.assertEquals("0.00", s1);
	}

	@Test
	public void testFormatRate() {
		String s = StringUtil.formatRate("88888.02");
		Assert.assertEquals("88,888.0200", s);
		
		String s1 = StringUtil.formatRate(" ");
		Assert.assertEquals("0", s1);
	}


	@Test
	public void testIsChineseChar() throws UnsupportedEncodingException {
		boolean b = StringUtil.isChineseChar('测');
		Assert.assertTrue(b);
		
		boolean b1 = StringUtil.isChineseChar('a');
		Assert.assertFalse(b1);
	}

	@Test
	public void testTransformAllToUnderline() {
		String s = StringUtil.transformAllToUnderline("ceshi?txt");
		Assert.assertEquals("ceshi_txt", s);
		
		String s1 = StringUtil.transformAllToUnderline(null);
		Assert.assertEquals("", s1);
	}

	@Test
	public void testGetDateStrAndRandomString() {
		String s = StringUtil.getDateStrAndRandomString(10);
		Assert.assertNotNull(s);
	}

	@Test
	public void testGetFormatNumber() {
		String s = StringUtil.getFormatNumber(1,"5");
		Assert.assertEquals("00001", s);
	}

	@Test
	public void testPrepad() {
		String s = StringUtil.prepad("5",5);
		Assert.assertEquals("    5", s);
		
		String s1 = StringUtil.prepad("59999",5);
		Assert.assertEquals("59999", s1);
	}


	@Test
	public void testPostpad() {
		String s = StringUtil.postpad("5",5);
		Assert.assertEquals("5    ", s);
		
		String s1 = StringUtil.postpad("59999",5);
		Assert.assertEquals("59999", s1);
	}

	@Test
	public void testMidpad() {
		String s = StringUtil.midpad("597",5);
		Assert.assertEquals(" 597 ", s);
		
		String s1 = StringUtil.midpad("59999",5);
		Assert.assertEquals("59999", s1);
	}


	@Test
	public void testSplit() {
		String[] s = StringUtil.split("1,2,4,5,6", ",");
		Assert.assertEquals(5, s.length);
		
		String[] s1 = StringUtil.split("1,2,4,5,6", null);
		Assert.assertEquals(1, s1.length);
	}

	@Test
	public void testSplitIncludeDelimiters() {
		String[] s = StringUtil.splitIncludeDelimiters("1-2-3", "-");
		Assert.assertEquals(5, s.length);
		
		String[] s1 = StringUtil.splitIncludeDelimiters("1-2-3", null);
		Assert.assertEquals(1, s1.length);
	}

	@Test
	public void testJoinStringArray() {
		String s = StringUtil.join(new String[]{"1","1","1","1","1"});
		Assert.assertEquals("11111", s);
		
		String s1 = StringUtil.join(new String[]{"1"});
		Assert.assertEquals("1", s1);
		
		String s2 = StringUtil.join(new String[]{});
		Assert.assertEquals("", s2);
		
		String s3 = StringUtil.join(new String[]{" "});
		Assert.assertEquals(" ", s3);
	}

	@Test
	public void testReplace() {
		String s = StringUtil.replace("-1--2-", "-", "|");
		Assert.assertEquals("|1||2|", s);
		
		String s1 = StringUtil.replace("-1--2-", null, "|");
		Assert.assertEquals("-1--2-", s1);
		
		String s2 = StringUtil.replace("-1--2-", "-", null);
		Assert.assertEquals("12", s2);
	}

	@Test
	public void testTrim() {
		String s = StringUtil.trim("-1--2-", "-");
		Assert.assertEquals("1--2", s);
		
		String s1 = StringUtil.trim("-1--2-", "");
		Assert.assertEquals("-1--2-", s1);
		
		String s2 = StringUtil.trim("-1--2-", null);
		Assert.assertEquals("-1--2-", s2);
	}

}
