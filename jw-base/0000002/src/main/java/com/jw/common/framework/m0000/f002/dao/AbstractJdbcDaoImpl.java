/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0000.f002.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jw.base.framework.core.util.ListUtil;
import com.jw.base.framework.core.util.page.Page;
import com.jw.common.framework.m0000.f001.dao.JdbcDao;

/**
 * ## 类说明：
 * 	Spring JdbcTemplate 检索实现封装抽象类（含分页）
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.dao
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|AbstractJdbcDaoImpl.java新增
*/
@Repository
public abstract class AbstractJdbcDaoImpl implements JdbcDao {
	@Resource(name = "jdbcTemplate")
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	/**
	 * ## 方法说明：
	 * 	检索分页实现
	 * @param sql sql语句
	 * @param params 查询参数
	 * @param currentPage 当前页
	 * @param pageSize 每页记录数量
	 * @return
	 */
	@Override
	public List<Map<String, Object>> query(String sql, Map<String,Object> params, Integer currentPage, Integer pageSize) throws Exception {
		StringBuilder pageSql = new StringBuilder();
		String dbType = getDBTypeByUser();
		if (currentPage != null && pageSize != null && pageSize.compareTo(0) != 0) {
			// postgresql 数据库
			if (dbType.contains("postgresql")) {
				pageSql.append(sql);
				if (currentPage > 0) {
					pageSql.append(" limit " + pageSize + " offset " + ((currentPage - 1) * pageSize));
				} else {
					pageSql.append(" limit " + pageSize + " offset 0 ");
				}
			}
			// MYSQL 数据库
			if (dbType.contains("mysql")) {
				pageSql.append(sql);
				if (currentPage > 0) {
					pageSql.append(" limit " + ((currentPage - 1) * pageSize) + "," + pageSize);
				} else {
					pageSql.append(" limit 0," + pageSize);
				}
			}
			// Oracle 数据库
			if (dbType.contains("oracle")) {
				if (currentPage > 0) {
					pageSql.append("SELECT * FROM (SELECT a.*, ROWNUM rn FROM (" + sql + ") a WHERE ROWNUM <= "
							+ (currentPage * pageSize) + ") WHERE rn > " + ((currentPage - 1) * pageSize));
				} else {
					pageSql.append("SELECT * FROM (SELECT a.*, ROWNUM rn FROM (" + sql + ") a WHERE ROWNUM <= "
							+ ((currentPage - 1) * pageSize) + ") WHERE rn >= 0");
				}
			}
		}else{
			pageSql.append(sql);
		}

		return this.jdbcTemplate.queryForList(pageSql.toString(), params);
	}
	
	/**
	 * ## 方法说明：
	 * 	检索分页实现
	 * @param sql sql语句
	 * @param params 查询参数
	 * @param p 分页类
	 * @return
	 */
	@Override
	public List<Map<String, Object>> query(String sql, Map<String,Object> params, Page p) throws Exception {
		if (p != null) {
			int count = this.queryCount(sql, params);
			//count为0时，直接返回空集合，不执行后面的分页语句
			if(count==0){
				return new ArrayList<Map<String, Object>>();
			}else{
				p.setListSize(count);
				return this.query(sql, params, p.getCurrentPage(), p.getPageSize());
			}
		} else {
			return this.query(sql, params, null, null);
		}
	}

	/**
	 * ## 方法说明：
	 * 	检索分页实现
	 * @param sql sql语句
	 * @param params 查询参数
	 * @return
	 */
	@Override
	public List<Map<String, Object>> query(String sql, Map<String,Object> params) throws Exception {
		return this.jdbcTemplate.queryForList(sql, params);
	}

	/**
	 * ## 方法说明：
	 * 	检索记录数
	 * @param sql sql语句
	 * @param params 查询参数
	 * @return
	 */
	@Override
	public int queryCount(String sql, Map<String,Object> params) {
		String ctSql = "select count(1) as ct from (" + sql + ") as abc ";
		List<Map<String, Object>> l = this.jdbcTemplate.queryForList(ctSql, params);
		if (ListUtil.isEmpty(l)) {
			return 0;
		}
		if (l.get(0) == null) {
			return 0;
		}
		Map<String, Object> m = l.get(0);
		return Integer.parseInt(m.get("ct").toString());
	}
	
	/**
	 * ## 方法说明：
	 * 	获取数据库类型
	 * @return
	 * @throws SQLException 
	 */
	@Override
	public String getDBTypeByUser() throws SQLException {
		Connection connection = null;
		String dbStr = "postgresql";
		try {
			JdbcTemplate jdbcTemp = (JdbcTemplate) jdbcTemplate.getJdbcOperations();
			 
			connection = jdbcTemp.getDataSource().getConnection();
			DatabaseMetaData md = connection.getMetaData();
			// System.err.println("We are using " + md.getDatabaseProductName());
			// System.err.println("Version is " + md.getDatabaseProductVersion());
			dbStr = md.getDatabaseProductName().toLowerCase();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("获取数据库类型异常!!!");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.err.println("关闭连接connection失败!!!");
				}
			}
		}
		return dbStr;
	}

}
