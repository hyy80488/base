/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0004.f001.provider;

import java.util.List;

/**
 * ## 类说明：
 * 	基础Provider类
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/26]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|BaseGProvider.java新增
 */
public interface BaseGProvider<E> {

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
	 * 	根据给定的Detached对象标识符更新对象实体
	 * @param entity 对象实体
	 */
	public void update(E entity) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 管控更新
	 * 	根据给定的Detached对象标识符更新对象实体
	 * @param entity 对象实体
	 * @param ctrlFields 管控字段
	 */
	public void update(E entity, List<String> ctrlFields) throws Exception;
	
	/**
	 * ## 方法说明：
	 * 	非加密持久化对象实体
	 * @param entity 对象实体
	 */
	public void unencryptedUpdate(E entity) throws Exception;
	
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
	public void updateByProperties(String[] conditionName, Object[] conditionValue, String[] propertyName, Object[] propertyValue) throws Exception;

	
	/**
	 * ## 方法说明：
	 * 	先删除再插入去更新对象实体
	 * @param entity 待更新的对象实体
	 * @param oldId 已存在的对象实体主键
	 */
	public void update(E entity, Integer oldId) throws Exception;

	/**
	 * ## 方法说明：
	 * 	合并给定的对象实体状态到当前的持久化上下文
	 * @param entity 给定的对象实体
	 * @return 返回对象实体
	 */
	public E merge(E entity) throws Exception;

	/**
	 * ## 方法说明：
	 * 	根据多个id参数删除对象
	 * 
	 * @param id 多个id，以英文逗号隔开
	 * @return 返回true或者false
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
	 * 	根据ID立即加载持久化对象实体
	 * @param id ID值
	 * @return 返回对象实体
	 */
	public E get(Integer id) throws Exception;
	
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
	 * 	根据属性数组获取单个对象实体
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @return 返回对象实体
	 */
	public E getByProerties(String[] propName, Object[] propValue) throws Exception;
	
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
	 * 	根据属性和排序条件获取对象实体列表
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @param sortedCondition 排序条件
	 * @return 返回对象实体列表
	 */
	public List<E> queryListByProerties(String[] propName, Object[] propValue, List<String> sortedCondition) throws Exception;
	
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
	
}
