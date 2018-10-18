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

import com.jw.base.framework.core.util.page.BaseParameter;

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
public interface GDao<E> {
	public Session getSession();
	
	/**
	 * ## 方法说明：
	 * 	更新版本号，主要使用hibernate乐观锁实现版本控制
	 * @param id
	 * @param version
	 * @return
	 */
	public E updateVersion(Integer id, Integer version) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	校验版本号，主要使用hibernate乐观锁实现版本控制
	 * @param id
	 * @param version
	 * @return
	 */
	public void validVersion(Integer id, Integer version) throws Exception;
	
	
	/**
	 * ## 方法说明：
	 * 	悲观锁
	 * LockMode.NONE ：有缓存用缓存，没缓存则从数据库读 LockMode.READ ：直接从数据库读，不使用缓存数据
	 * LockMode.WRITE ：在insert update数据的时候，HIBERNATE内部使用的。
	 * 以上3种均为HIBERNATE级别的锁，也就是缓存级别的锁。
	 * 
	 * LockMode.UPGRADE：相当于SQL语句select for update，被select的数据都被数据库锁住了，不能被其他事务修改。
	 * LockMode. UPGRADE_NOWAIT ：是ORACLE数据库特有的select for update nowait
	 */
	public void lock(E entity);
	/**
	 * ## 方法说明：
	 * 	悲观锁
	 * LockMode.NONE ：有缓存用缓存，没缓存则从数据库读 LockMode.READ ：直接从数据库读，不使用缓存数据
	 * LockMode.WRITE ：在insert update数据的时候，HIBERNATE内部使用的。
	 * 以上3种均为HIBERNATE级别的锁，也就是缓存级别的锁。
	 * 
	 * LockMode.UPGRADE：相当于SQL语句select for update，被select的数据都被数据库锁住了，不能被其他事务修改。
	 * LockMode. UPGRADE_NOWAIT ：是ORACLE数据库特有的select for update nowait
	 */
	public void lockEntity(E entity);
	
	/**
	 * ## 方法说明：
	 * 	持久化对象实体
	 * @param entity 对象实体
	 */
	public void save(E entity) throws Exception;
	/**
	 * ## 方法说明：
	 * 	非加密持久化对象实体
	 * @param entity 对象实体
	 */
	public void unencryptedSave(E entity) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据多个id参数删除对象
	 * @param id 多个id，以英文逗号隔开
	 * @return 返回true或者false
	 * @throws Exception 
	 */
	public boolean deleteByPK(Integer... id) throws Exception;

	/**
	 * ## 方法说明：
	 * 	删除对象实体
	 * @param entity 对象实体
	 */
	public void delete(E entity) throws Exception;

	/**
	 * ## 方法说明：
	 * 	以HQL的方式，根据单个属性删除对象实体
	 * @param propName 属性名称
	 * @param propValue 属性值
	 */
	public void deleteBatchByProperties(String propName, Object propValue) throws Exception;

	/**
	 * ## 方法说明：
	 * 以HQL的方式，根据多个属性删除对象实体
	 * @param propName 属性名称
	 * @param propValue 属性值
	 */
	public void deleteBatchByProperties(String[] propName, Object[] propValue) throws Exception;

	/**
	 * ## 方法说明：
	 * 	非加密持久化对象实体
	 * @param entity 对象实体
	 */
	public void unencryptedUpdate(E entity) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	根据给定的Detached对象标识符更新对象实体
	 * @param entity 对象实体
	 */
	public void update(E entity) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	根据给定的Detached对象标识符更新对象实体
	 * @param entity 对象实体
	 * @param ctrlFields 管控字段
	 */
	public void update(E entity, List<String> ctrlFields) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	根据给定的Detached对象标识符更新对象实体(只用于登录)
	 * @param entity 对象实体
	 */
	public void updateForLogin(E entity) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	根据参数对象更新数据库对象
	 * @param original 根据此对象不为空的属性更新数据库中的对象
	 * @param id 需要更新对象的id
	 * @param nullProperties 需要设置为空的属性
	 * @throws Exception
	 */
	public void update(Object original,Integer id,Object[] nullProperties) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据多个属性条件更新对象实体多个属性
	 * @param conditionName WHERE子句条件的属性数组名称
	 * @param conditionValue WHERE子句条件的属性数组值
	 * @param propertyName UPDATE子句属性数组名称
	 * @param propertyValue UPDATE子句属性数组值
	 */
	public void updateBatchByProperties(String[] conditionName, Object[] conditionValue, String[] propertyName, Object[] propertyValue) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	根据多个属性条件更新对象实体多个属性(架构强壮处理方法)
	 * @param conditionName WHERE子句条件的属性数组名称
	 * @param conditionValue WHERE子句条件的属性数组值
	 * @param propertyName UPDATE子句属性数组名称
	 * @param propertyValue UPDATE子句属性数组值
	 */
	public void enhanceUpdateBatchByProperties(String[] conditionName, Object[] conditionValue, String[] propertyName, Object[] propertyValue) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据单个属性条件更新对象实体多个属性
	 * @param conditionName WHERE子句条件的属性数组名称
	 * @param conditionValue WHERE子句条件的属性数组值
	 * @param propertyName UPDATE子句属性名称
	 * @param propertyValue UPDATE子句属性值
	 */
	public void updateBatchByProperties(String[] conditionName, Object[] conditionValue, String propertyName, Object propertyValue) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据多个属性条件更新对象实体单个属性
	 * @param conditionName WHERE子句条件的属性名称
	 * @param conditionValue WHERE子句条件的属性值
	 * @param propertyName UPDATE子句属性数组名称
	 * @param propertyValue UPDATE子句属性数组值
	 */
	public void updateBatchByProperties(String conditionName, Object conditionValue, String[] propertyName, Object[] propertyValue) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据单个属性条件更新对象实体单个属性
	 * @param conditionName WHERE子句条件的属性名称
	 * @param conditionValue WHERE子句条件的属性值
	 * @param propertyName UPDATE子句属性名称
	 * @param propertyValue UPDATE子句属性值
	 */
	public void updateBatchByProperties(String conditionName, Object conditionValue, String propertyName, Object propertyValue) throws Exception;

	/**
	 * ## 方法说明：
	 * 	先删除再插入去更新对象实体
	 * @param entity 待更新的对象实体
	 * @param oldId 已存在的对象实体主键
	 */
	public void update(E entity, Integer oldId) throws Exception;

	/**
	 * ## 方法说明：
	 * 	合并给定的对象实体状态到当前的持久化上下文，使用merge的时候，执行完成，我们提供的对象A还是脱管状态，hibernate或者new了一个B，或者检索到 一个持久对象B，并把我们提供的对象A的所有的值拷贝到这个B，执行完成后B是持久状态，而我们提供的A还是托管状态。
	 * 	1、数据库记录存在，更新属性值为一个新值，则先select再update
	 * 	2、数据库记录存在，更新属性值同当前值是一样的值，则只select，不update
	 * 	3、数据库记录不存在，merge会把该记录当作新的记录来插入
	 * @param entity 给定的对象实体
	 * @return 返回对象实体
	 */
	public E merge(E entity) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据ID立即加载持久化对象实体
	 * @param id ID值
	 * @return 返回对象实体
	 */
	public E get(Integer id) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	根据ID立即加载持久化对象实体(带有增强处理)
	 * @param id ID值
	 * @return 返回对象实体
	 */
	public E enhanceGet(Integer id) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据ID延迟加载持久化对象实体
	 * @param id ID值
	 * @return 返回对象实体
	 */
	//public E load(Serializable id);

	/**
	 * ## 方法说明：
	 * 	根据属性数组获取单个对象实体
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @return 返回对象实体
	 */
	public E getByProerties(String[] propName, Object[] propValue) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性数组和排序条件获取单个对象实体
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @param sortedCondition 排序条件
	 * @return 返回对象实体
	 */
	public E getByProerties(String[] propName, Object[] propValue, List<String> sortedCondition) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性获取单个对象实体
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @return 返回对象实体
	 */
	public E getByProerties(String propName, Object propValue) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性和排序条件获取单个对象实体
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @param sortedCondition 排序条件
	 * @return 返回对象实体
	 */
	public E getByProerties(String propName, Object propValue, List<String> sortedCondition) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性、排序条件和要返回的记录数目获取对象实体列表
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @param sortedCondition 排序条件
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	public List<E> queryListByProerties(String[] propName, Object[] propValue, List<String> sortedCondition, Integer top) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	根据属性、排序条件和要返回的记录数目获取对象实体列表(架构强壮处理方法)
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @param sortedCondition 排序条件
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	public List<E> enhanceQueryListByProerties(String[] propName, Object[] propValue, List<String> sortedCondition, Integer top) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性和排序条件获取对象实体列表
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @param sortedCondition 排序条件
	 * @return 返回对象实体列表
	 */
	public List<E> queryListByProerties(String[] propName, Object[] propValue, List<String> sortedCondition) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性和要返回的记录数目获取对象实体列表
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	public List<E> queryListByProerties(String[] propName, Object[] propValue, Integer top) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性获取对象实体列表
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @return
	 */
	public List<E> queryListByProerties(String[] propName, Object[] propValue) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性、排序条件和要返回的记录数目获取对象实体列表
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @param sortedCondition 排序条件
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	public List<E> queryListByProerties(String propName, Object propValue, List<String> sortedCondition, Integer top) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性和排序条件获取对象实体列表
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @param sortedCondition 排序条件
	 * @return 返回对象实体列表
	 */
	public List<E> queryListByProerties(String propName, Object propValue, List<String> sortedCondition) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性和要返回的记录数目获取对象实体列表
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	public List<E> queryListByProerties(String propName, Object propValue, Integer top) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据属性获取对象实体列表
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @return 返回对象实体列表
	 */
	public List<E> queryListByProerties(String propName, Object propValue) throws Exception;

	/**
	 * ## 方法说明：
	 * 	彻底清除会话
	 */
	public void clear();

	/**
	 * ## 方法说明：
	 * 	从会话缓存中删除此对象实体
	 * @param entity 待删除的对象实体
	 */
	public void evict(E entity);

	/**
	 * ## 方法说明：
	 *	将会话缓存中的操作反映到数据库中
	 */
	public void flush();
	
	/**
	 * ## 方法说明：
	 * 	查询出对象实体的所有数目
	 * @return 返回对象实体所有数目
	 */
	//public Long countAll();

	/**
	 * ## 方法说明：
	 * 	查询出所有的对象实体列表
	 * @return 返回对象实体列表
	 */
	//public List<E> doQueryAll();

	/**
	 * ## 方法说明：
	 * 	根据排序条件和要返回的记录数目查询出对象实体列表
	 * @param sortedCondition 排序条件
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	//public List<E> doQueryAll(Map<String, String> sortedCondition, Integer top);

	/**
	 * ## 方法说明：
	 * 	根据要返回的记录数目查询出对象实体列表
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	//public List<E> doQueryAll(Integer top);

	/**
	 * ## 方法说明：
	 * 	根据各种查询条件返回对象实体数目
	 * @param parameter 各种查询条件
	 * @return 返回对象实体数目
	 */
	//public Long doCount(BaseParameter parameter);

	/**
	 * ## 方法说明：
	 * 	根据各种查询条件返回对象实体列表
	 * @param parameter 各种查询条件
	 * @return 返回对象实体列表
	 */
	public List<E> doQuery(BaseParameter parameter) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据各种查询条件返回分页列表
	 * @param parameter 各种查询条件
	 * @return 返回分页列表
	 */
	//public QueryResult<E> doPaginationQuery(BaseParameter parameter);

	/**
	 * ## 方法说明：
	 * 	根据各种查询条件返回分页列表
	 * @param parameter 各种查询条件
	 * @param bool 默认为true；如果为false，增加属性是否为空等查询条件
	 * @return 返回分页列表
	 */
	//public QueryResult<E> doPaginationQuery(BaseParameter parameter, boolean bool);
	
	/**
	 * ## 方法说明：
	 * 	根据sql查询
	 * @param sql  sql语句
	 * @return 结果集合
	 */
	//public List<E> findBySql(final String sql);
	
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
	 * 	带参数的sql全部记录查询
	 * @param sql
	 * @param params
	 * @return List<Map>查询结果集合
	 */
	public List<Map<String,Object>> findBySqlToMap(final String sql, final Object[] params) throws Exception;

	/**
	 * ## 方法说明：
	 * 	不带参数的sql分页查询
	 * @param sql sql语句
	 * @param currPage 当前页
	 * @param pageSize 每页显示条目数量
	 * @return List<Map>查询结果集合
	 */
	public List<Map<String,Object>> findBySqlToMap(final String sql, int currPage, int pageSize) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	执行insert、update等SQL语句，注意非业务必须不要使用
	 * @param sql sql语句
	 */
	public Integer executeSql(final String sql) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	执行insert、update等SQL语句，注意非业务必须不要使用
	 * @param sql sql语句
	 */
	
	public Integer executeSql(final String sql,Map<String, Object> param) throws Exception;
	/**
	 * ## 方法说明：
	 * 	执行insert、update等SQL语句，注意非业务必须不要使用
	 * @param sql sql语句
	 */
	public Integer executeSqlByType(final String sql,Map<String, Map<Object, Type>> param) throws Exception;
	
	
	/**
	 * ## 方法说明：
	 * 	通过SQL执行无返回结果的存储过程(仅限于存储过程)
	 * @param sql sql语句
	 * @param params
	 */
	public void executeVoidProcedureSql(final String queryString,final Object[] params) throws Exception;
}
