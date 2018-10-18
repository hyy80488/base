/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0000.f001.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.type.Type;

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
public interface Dao {
	public Session getSession();
	
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
	
	/**
	 * ## 方法说明：
	 * 	执行insert、update等SQL语句，注意非业务必须不要使用
	 * @param sql sql语句
	 */
	public Integer executeSql(final String sql) throws Exception;
	
	public Integer executeSql(final String sql,Map<String, Object> param) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	执行insert、update等SQL语句，注意非业务必须不要使用
	 * @param sql sql语句
	 */
	public Integer executeSqlByType(final String sql,Map<String, Map<Object, Type>> param) throws Exception;
	
	/** 
	 * ## 方法说明：
	 * 	根据sql查询数据
	 * @param sql
	 * @return
	 * @throws Exception
	*/
	public List<Map<String,Object>> findBySql( final String sql) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	sql基础查询 
	 * @param sql sql语句
	 * @param params 条件的值,对应sql语句中的"?"
	 * @param currPage 当前页
	 * @param pageSize 每页显示条目数量
	 * @return List<Map>查询结果集合
	 */
	public List<Map<String,Object>> findBySqlToMap( final String sql,final Object[] params,final int currPage, final int pageSize) throws Exception;
	
	public List<Map<String,Object>> findBySqlToMap2(final String sql, final Map<String, Object> param, final int currPage, final int pageSize) throws Exception;
	/**
	 * ## 方法说明：
	 * 	不带参数的sql全部记录查询
	 * @param sql sql语句
	 * @return List<Map>查询结果集合
	 */
	public List<Map<String,Object>> findBySqlToMap(final String sql) throws Exception;
	
	
	/**
	 * ## 方法说明：
	 * 	通过SQL执行无返回结果的存储过程(仅限于存储过程)
	 * @param sql sql语句
	 * @param params
	 */
	public void executeVoidProcedureSql(final String queryString,final Object[] params) throws Exception;
}
