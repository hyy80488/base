/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0000.f002.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.hibernate.type.Type;

import com.jw.common.framework.m0000.f001.dao.Dao;

/**
 * ## 类说明：
 * 	DAO基础实现抽象类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.dao
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|AbstractDaoImpl.java新增
 */
public abstract class AbstractDaoImpl implements Dao {
	/** Session会话 **/
	@Override
	public abstract Session getSession();


	/**
	 * ## 方法说明：
	 * 	彻底清除会话
	 */
	@Override
	public void clear() {
		getSession().clear();
	}
	
	/**
	 * ## 方法说明：
	 * 	将会话缓存中的操作反映到数据库中
	 */
	@Override
	public void flush() {
		getSession().flush();
	}
	
	
	/**
	 * 
	 * ## 方法说明：
	 * 	锁表
	 * @param className
	 * @param id
	 */
	@Override
	public void lock(String className,Integer id){
//		Map<String, Object> hints = new HashMap<String, Object>();
//		hints.put("javax.persistence.lock.timeout", 0);
		getSession().get(className, id, LockMode.UPGRADE_NOWAIT);
	}
	
	/**
	 * ## 方法说明：
	 * 	执行insert、update等SQL语句，注意非业务必须不要使用
	 * @param sql sql语句
	 */
	@Override
	public Integer executeSql(final String sql) throws Exception {
		Query query = getSession().createSQLQuery(sql);
		return query.executeUpdate();
	}
	
	@Override
	public Integer executeSql(final String sql,Map<String, Object> param) throws Exception {
		Query query = getSession().createSQLQuery(sql);
		if(MapUtils.isNotEmpty(param)){
			param.forEach((k,v)->{
				if(v instanceof Object[]){
					query.setParameterList(k, (Object[])v);
				}
				else{
					query.setParameter(k, v);	
				}
			});
		}
		return query.executeUpdate();
	}
	
	/**
	 * ## 方法说明：
	 * 	执行insert、update等SQL语句，注意非业务必须不要使用
	 * @param sql sql语句
	 */
	@Override
	public Integer executeSqlByType(final String sql,Map<String, Map<Object, Type>> param) throws Exception {
		Query query = getSession().createSQLQuery(sql);
		if(MapUtils.isNotEmpty(param)){
			param.forEach((k,v)->{
				v.forEach((k1,v1)->{
					query.setParameter(k, k1,v1);
				});
			});
		}
		return query.executeUpdate();
	}
	
	/** 
	 * ## 方法说明：
	 * 	根据sql查询数据
	 * @param sql
	 * @return
	 * @throws Exception
	*/
	@Override
	public List<Map<String,Object>> findBySql( final String sql) throws Exception{
		Query query = getSession().createSQLQuery(sql);
		return query.list();
	}
	
	/**
	 * ## 方法说明：
	 * 	sql基础查询 
	 * @param sql sql语句
	 * @param params 条件的值,对应sql语句中的"?"
	 * @param currPage 当前页
	 * @param pageSize 每页显示条目数量
	 * @return List<Map>查询结果集合
	 */
	@Override
	public List<Map<String,Object>> findBySqlToMap(final String sql, final Object[] params, final int currPage, final int pageSize) throws Exception {
		Query query = getSession().createSQLQuery(sql);
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		if (params != null && params.length > 0) {
			for (int i = 0, j = params.length; i < j; i++) {
				query.setParameter(i, params[i]);
			}
		}
		if (currPage >= 1 && pageSize >= 1) {
			query.setFirstResult((currPage - 1) * pageSize);
			query.setMaxResults(pageSize);
		}
		List list = query.list();
		return list;
	}
	
	@Override
	public List<Map<String,Object>> findBySqlToMap2(final String sql, final Map<String, Object> param, final int currPage, final int pageSize) throws Exception {
		Query query = getSession().createSQLQuery(sql);
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		if(MapUtils.isNotEmpty(param)){
			param.forEach((k,v)->{
				if(v instanceof Object[]){
					query.setParameterList(k, (Object[])v);
				}
				else{
					query.setParameter(k, v);
				}
			});
		}
		if (currPage >= 1 && pageSize >= 1) {
			query.setFirstResult((currPage - 1) * pageSize);
			query.setMaxResults(pageSize);
		}
		List list = query.list();
		return list;
	}

	/**
	 * ## 方法说明：
	 * 	不带参数的sql全部记录查询
	 * @param sql sql语句
	 * @return List<Map>查询结果集合
	 */
	@Override
	public List<Map<String,Object>> findBySqlToMap(final String sql) throws Exception {
		return this.findBySqlToMap(sql, null, 0, 0);
	}
	
	/**
	 * ## 方法说明：
	 * 	通过SQL执行无返回结果的存储过程(仅限于存储过程)
	 * @param sql sql语句
	 * @param params
	 */
	@Override
	public void executeVoidProcedureSql(final String queryString, final Object[] params) throws Exception {
		getSession().doWork(new Work() {
			@Override
			public void execute(Connection conn) throws SQLException {
				ResultSet rs = null;
				CallableStatement call = conn.prepareCall("{" + queryString + "}");
				if (null != params) {
					for (int i = 0; i < params.length; i++) {
						call.setObject(i + 1, params[i]);
					}
				}
				rs = call.executeQuery();
				call.close();
				rs.close();
			}
		});
	}
	
	private void close(CallableStatement cs,ResultSet rs){
        try {
            if(cs!=null){
                cs.close();
            }
            if(rs!=null){
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}