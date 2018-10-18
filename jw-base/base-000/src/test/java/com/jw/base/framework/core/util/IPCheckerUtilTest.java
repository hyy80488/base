/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import org.junit.Assert;
import org.junit.Test;

import com.jw.base.framework.core.util.IPCheckerUtil;
/**
 * 
 * ## 类说明：
 * 	IP检查工具类测试
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月14日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月14日|jianana|新增|IPCheckerUtilTest.java新增
 */
public class IPCheckerUtilTest {

	@Test
	public void testIpRangCheck() {
		boolean b = IPCheckerUtil.ipRangCheck("192.168.2.11", "192.168.2.1", "192.168.2.99");
		Assert.assertTrue(b);
		boolean b1 = IPCheckerUtil.ipRangCheck("192.168.2.100", "192.168.2.1", "192.168.2.99");
		Assert.assertFalse(b1);
		boolean b2 = IPCheckerUtil.ipRangCheck("192.168.2.0", "192.168.2.1", "192.168.2.99");
		Assert.assertFalse(b2);
	}

}
