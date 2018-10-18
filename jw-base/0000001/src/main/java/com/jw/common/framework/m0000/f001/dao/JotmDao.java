/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0000.f001.dao;

/**
 * ## 类说明：
 * 	DAO基础接口
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.dao
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|Dao.java新增
 */
public interface JotmDao {
	
	/**
	 * ## 方法说明：
	 * 	彻底清除会话
	 */
	public void clear();

	/**
	 * ## 方法说明：
	 *	将会话缓存中的操作反映到数据库中
	 */
	public void flush();
	
	/**
	 * 
	 * ## 方法说明：
	 * 	锁表
	 * @param className
	 * @param id
	 */
	public void lock(String className,Integer id);
	
}
