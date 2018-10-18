/**
 *@ProjectName: base-000
 *@FileName: LogUtilTest.java
 *@Date: 2016年12月13日-下午3:49:27
 *@Copyright: 2016 www.jointwisdom.com Inc. All rights reserved.
 
 * Copyright (c) 2016 jointwisdom Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
*/
package com.jw.base.framework.core.util;

import org.junit.Assert;
import org.junit.Test;

import com.jw.base.framework.core.util.LogUtil;

public class LogUtilTest {

	@Test
	public void testRunTrail() {
		String s = LogUtil.runTrail("ceshi", "pattern", new Object[]{"1"});
		Assert.assertNotNull(s);
	}

	@Test
	public void testBusinessTrail() {
		String s = LogUtil.businessTrail("ceshi", "pattern", new Object[]{"1"});
		Assert.assertNotNull(s);
	}

	@Test
	public void testMqTrail() {
		String s = LogUtil.mqTrail("ceshi", "pattern", new Object[]{"1"});
		Assert.assertNotNull(s);
	}

	@Test
	public void testDataBaseTrail() {
		String s = LogUtil.dataBaseTrail("ceshi", "pattern", new Object[]{"1"});
		Assert.assertNotNull(s);
	}

	@Test
	public void testDebugInfo() {
		String s = LogUtil.debugInfo("ceshi", "pattern", new Object[]{"1"});
		Assert.assertNotNull(s);
	}

	@Test
	public void testException() {
		String s = LogUtil.exception("ceshi", "pattern", new Object[]{"1"});
		Assert.assertNotNull(s);
	}
	
}
