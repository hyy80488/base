/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0000.f001.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.util.page.Page;

/**
 * ## 类说明：
 * 	Spring JdbcTemplate 检索接口封装（含分页）
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.dao
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|JdbcDao.java新增
*/
public interface JdbcDao {

	/**
	 * ## 方法说明：
	 * 	检索分页实现
	 * @param sql sql语句
	 * @param params 查询参数
	 * @param currentPage 当前页
	 * @param pageSize 每页记录数量
	 * @return
	 */
	public List<Map<String, Object>> query(String sql, Map<String,Object> params, Integer currentPage, Integer pageSize) throws Exception;
	public List<Map<String, Object>> query(String sql, Map<String,Object> params, Integer currentPage, Integer pageSize, boolean isCrypto) throws Exception;

	public List<Map<String,Object>> query(String sql, Map<String,Object> params) throws Exception;
	public List<Map<String,Object>> query(String sql, Map<String,Object> params, boolean isCrypto) throws Exception;
	
	public List<Map<String,Object>> query(String sql, Map<String,Object> params,Page p) throws Exception;
	public List<Map<String,Object>> query(String sql, Map<String,Object> params,Page p, boolean isCrypto) throws Exception;
	
	
	public List<Map<String,Object>> checkQuery(String sql, Map<String,Object> params, Integer existCount, Integer limitCount) throws Exception;
	public List<Map<String,Object>> checkQuery(String sql, Map<String,Object> params, Integer existCount, Integer limitCount, boolean isCrypto) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	检索记录数
	 * @param sql sql语句
	 * @param params 查询参数
	 * @return
	 */
	public int queryCount(String sql, Map<String,Object> params);
	
	/**
	 * ## 方法说明：
	 * 	获取数据库类型
	 * @return
	 * @throws SQLException 
	 */
	public String getDBTypeByUser() throws SQLException;
	
}
