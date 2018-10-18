/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.net.UnknownHostException;

import org.junit.Assert;
import org.junit.Test;

import com.jw.base.framework.core.util.GenerateKeyUtil;
/**
 * ## 类说明：
 * 	生成KEY工具类测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月14日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月14日|jianana|新增|GenerateKeyUtilTest.java新增
 */
public class GenerateKeyUtilTest {

	@Test
	public void testGetUUID() {
		String s = GenerateKeyUtil.getUUID();
		Assert.assertNotNull(s);
	}

	@Test
	public void testGetBusinessKey() throws UnknownHostException {
		String s = GenerateKeyUtil.getBusinessKey("PMS", "SUB_PMS", 88, 12);
		Assert.assertNotNull(s);
		String s1 = GenerateKeyUtil.getBusinessKey(null, "SUB_PMS", 88, 12);
		Assert.assertEquals("", s1);
		String s2 = GenerateKeyUtil.getBusinessKey("PMS", null, 88, 12);
		Assert.assertEquals("", s2);
		String s3 = GenerateKeyUtil.getBusinessKey("PMS", "SUB_PMS", -1, 12);
		Assert.assertEquals("", s3);
		String s4 = GenerateKeyUtil.getBusinessKey("PMS", "SUB_PMS", 88, -1);
		Assert.assertEquals("", s4);
	}

}
