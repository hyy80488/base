/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util.base64;

import java.security.NoSuchAlgorithmException;

import org.junit.Assert;
import org.junit.Test;

import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.base64.MD5Util;

/**
 * 
 * ## 类说明：
 * 	MD5工具类测试类
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月14日]
 * @package com.jw.platform.framework.core.util.base64
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月14日|jianana|新增|MD5UtilTest.java新增
 */
public class MD5UtilTest {

	@Test
	public void testCrypt() throws NoSuchAlgorithmException, BusinessException {
		String s = MD5Util.crypt("789456123");
		Assert.assertNotNull(s);
		Assert.assertEquals("9fab6755cd2e8817d3e73b0978ca54a6", s);
		try {
			MD5Util.crypt(null);
		} catch (BusinessException e) {
			Assert.assertEquals(BsProcessErrorCode.ERROR_CODE_000002, e.getCode());
		}
		
		try {
			MD5Util.crypt("");
		} catch (BusinessException e) {
			Assert.assertEquals(BsProcessErrorCode.ERROR_CODE_000002, e.getCode());
		}
	}

}
