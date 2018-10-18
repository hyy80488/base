/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.base.framework.core.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


/**
 * 
 * ## 类说明：
 * 	拼接排序语句测试
 * @author    [jianana]   
 * @version   [V1.0, 2017年2月9日]
 * @package com.jw.base.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年2月9日|jianana|新增|OrderColumnUtilTest.java新增
 */
public class OrderColumnUtilTest {

	/**
	 * 
	 * ## 方法说明：
	 * 	根据前端传入的排序条件拼接成sql语句
	 */
	@Test
	public void testGetOrderColumn() {
		List<CodeBean> orderColumn = new ArrayList<>();
		CodeBean cb = new CodeBean();
		cb.setCode("user_nm");
		cb.setName("desc");
		orderColumn.add(cb);
		CodeBean cb1 = new CodeBean();
		cb1.setCode("user_cd");
		cb1.setName("asc");
		orderColumn.add(cb1);
		CodeBean cb2 = new CodeBean();
		cb2.setCode("age");
		cb2.setName("");
		orderColumn.add(cb2);
		String order = OrderColumnUtil.getOrderColumn(orderColumn);
		Assert.assertEquals(" order by user_nm desc,user_cd asc,age desc", order);
		
		String order1 = OrderColumnUtil.getOrderColumn(null);
		Assert.assertEquals(" order by id desc", order1);
	}

}
