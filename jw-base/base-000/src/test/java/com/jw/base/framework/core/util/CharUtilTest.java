/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.UnsupportedEncodingException;

import org.junit.Assert;
import org.junit.Test;

import com.jw.base.framework.core.util.CharUtil;
/**
 * 
 * ## 类说明：
 * 	字符编码工具类测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月13日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月13日|jianana|新增|CharUtilTest.java新增
 */
public class CharUtilTest {

	@Test
	public void testISO2GB() throws UnsupportedEncodingException {
		String result = CharUtil.ISO2GB("test");
		Assert.assertEquals("test", result);
	}

	@Test
	public void testGB2ISO() throws UnsupportedEncodingException {
		String result = CharUtil.GB2ISO("test");
		Assert.assertEquals("test", result);
	}

	@Test
	public void testUtf8URLencode() {
		String result = CharUtil.Utf8URLencode("测试");
		Assert.assertEquals("%E6%B5%8B%E8%AF%95", result);
		
		String result1 = CharUtil.Utf8URLencode("test");
		Assert.assertEquals("test", result1);
	}

	@Test
	public void testUtf8URLdecode() throws UnsupportedEncodingException {
		String result = CharUtil.Utf8URLdecode("%E6%B5%8B%E8%AF%95");
		Assert.assertEquals("测试", result);
	}

	@Test
	public void testIsUtf8Url() {
		boolean b = CharUtil.isUtf8Url("测试");
		Assert.assertFalse(b);
		
		boolean b1 = CharUtil.isUtf8Url("%E6%B5%8B%E8%AF%95");
		Assert.assertTrue(b1);
	}


}
