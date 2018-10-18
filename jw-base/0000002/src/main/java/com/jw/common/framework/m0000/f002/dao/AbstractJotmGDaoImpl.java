/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0000.f002.dao;

import java.util.List;

import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.BeanUtil;
import com.jw.common.framework.m0000.f001.dao.JotmGDao;
import com.jw.common.framework.m0001.f001.entity.DomainObject;

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
public abstract class AbstractJotmGDaoImpl<E> implements JotmGDao<E> {

	/**
	 * ## 方法说明：
	 * 	校验版本号，主要使用hibernate乐观锁实现版本控制
	 * @param id
	 * @param version
	 * @return
	 */
	@Override
	public void validVersion(Integer id, Integer version) throws Exception {
		DomainObject domain = (DomainObject) get(id);
		if (domain.getVersion().intValue() != version.intValue()) {
			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_100000, "Current version is not the latest version", "当前已不是最新版本", BsProcessErrorCode.ERROR_LEVEL_5);
		}
	}

	/**
	 * ## 方法说明：
	 * 	以HQL的方式，根据单个属性删除对象实体
	 * @param propName 属性名称
	 * @param propValue 属性值
	 */
	@Override
	public void deleteBatchByProperties(String propName, Object propValue) {
		deleteBatchByProperties(new String[] { propName }, new Object[] { propValue });
	}
	
	/**
	 * ## 方法说明：
	 * 	根据参数对象更新数据库对象
	 * @param original 根据此对象不为空的属性更新数据库中的对象
	 * @param id 需要更新对象的id
	 * @param nullProperties 需要设置为空的属性
	 * @throws Exception
	 */
	@Override
	public void update(Object original, Integer id, Object[] nullProperties) throws Exception {
		E entity = this.get(id);
		BeanUtil.copyPropertiesExceptNull(entity, original);
		BeanUtil.setObjNullProperties(entity, nullProperties);
		// 在DAO层校验Entity中BigDecimal类型字段的小数位数
		this.update(entity);
	}
	
	/**
	 * ## 方法说明：
	 * 	根据单个属性条件更新对象实体多个属性
	 * @param conditionName WHERE子句条件的属性数组名称
	 * @param conditionValue WHERE子句条件的属性数组值
	 * @param propertyName UPDATE子句属性名称
	 * @param propertyValue UPDATE子句属性值
	 */
	@Override
	public void updateBatchByProperties(String[] conditionName, Object[] conditionValue, String propertyName, Object propertyValue) throws Exception {
		updateBatchByProperties(conditionName, conditionValue, new String[] { propertyName }, new Object[] { propertyValue });
	}

	/**
	 * ## 方法说明：
	 * 	根据多个属性条件更新对象实体单个属性
	 * @param conditionName WHERE子句条件的属性名称
	 * @param conditionValue WHERE子句条件的属性值
	 * @param propertyName UPDATE子句属性数组名称
	 * @param propertyValue UPDATE子句属性数组值
	 */
	@Override
	public void updateBatchByProperties(String conditionName, Object conditionValue, String[] propertyName, Object[] propertyValue) throws Exception {
		updateBatchByProperties(new String[] { conditionName }, new Object[] { conditionValue }, propertyName, propertyValue);
	}

	/**
	 * ## 方法说明：
	 * 	根据单个属性条件更新对象实体单个属性
	 * @param conditionName WHERE子句条件的属性名称
	 * @param conditionValue WHERE子句条件的属性值
	 * @param propertyName UPDATE子句属性名称
	 * @param propertyValue UPDATE子句属性值
	 */
	@Override
	public void updateBatchByProperties(String conditionName, Object conditionValue, String propertyName, Object propertyValue) throws Exception {
		updateBatchByProperties(new String[] { conditionName }, new Object[] { conditionValue }, new String[] { propertyName }, new Object[] { propertyValue });
	}

	/**
	 * ## 方法说明：
	 * 	先删除再插入去更新对象实体
	 * @param entity 待更新的对象实体
	 * @param oldId 已存在的对象实体主键
	 */
	@Override
	public void update(E entity, Integer oldId) throws Exception {
		deleteByPK(new Integer[] { oldId });
		// 在DAO层校验Entity中BigDecimal类型字段的小数位数
		save(entity);
	}

	/**
	 * ## 方法说明：
	 * 	根据属性数组获取单个对象实体
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @return 返回对象实体
	 */
	@Override
	public E getByProerties(String[] propName, Object[] propValue) {
		return getByProerties(propName, propValue, null);
	}
	
	/**
	 * ## 方法说明：
	 * 	根据属性获取单个对象实体
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @return 返回对象实体
	 */
	@Override
	public E getByProerties(String propName, Object propValue) {
		return getByProerties(new String[] { propName }, new Object[] { propValue });
	}

	/**
	 * ## 方法说明：
	 * 	根据属性和排序条件获取单个对象实体
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @param sortedCondition 排序条件
	 * @return 返回对象实体
	 */
	@Override
	public E getByProerties(String propName, Object propValue, List<String> sortedCondition) {
		return getByProerties(new String[] { propName }, new Object[] { propValue }, sortedCondition);
	}

	/**
	 * ## 方法说明：
	 * 	根据属性和排序条件获取对象实体列表
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @param sortedCondition 排序条件
	 * @return 返回对象实体列表
	 */
	@Override
	public List<E> queryListByProerties(String[] propName, Object[] propValue, List<String> sortedCondition) {
		return queryListByProerties(propName, propValue, sortedCondition, null);
	}
	
	/**
	 * ## 方法说明：
	 * 	根据属性和要返回的记录数目获取对象实体列表
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	@Override
	public List<E> queryListByProerties(String[] propName, Object[] propValue, Integer top) {
		return queryListByProerties(propName, propValue, null, top);
	}

	/**
	 * ## 方法说明：
	 * 	根据属性获取对象实体列表
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @return
	 */
	@Override
	public List<E> queryListByProerties(String[] propName, Object[] propValue) {
		return queryListByProerties(propName, propValue, null, null);
	}
	
	/**
	 * ## 方法说明：
	 * 	根据属性、排序条件和要返回的记录数目获取对象实体列表
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @param sortedCondition 排序条件
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	@Override
	public List<E> queryListByProerties(String propName, Object propValue, List<String> sortedCondition, Integer top) {
		return queryListByProerties(new String[] { propName }, new Object[] { propValue }, sortedCondition, top);
	}

	/**
	 * ## 方法说明：
	 * 	根据属性和排序条件获取对象实体列表
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @param sortedCondition 排序条件
	 * @return 返回对象实体列表
	 */
	@Override
	public List<E> queryListByProerties(String propName, Object propValue, List<String> sortedCondition) {
		return queryListByProerties(new String[] { propName }, new Object[] { propValue }, sortedCondition, null);
	}

	/**
	 * ## 方法说明：
	 * 	根据属性和要返回的记录数目获取对象实体列表
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	@Override
	public List<E> queryListByProerties(String propName, Object propValue, Integer top) {
		return queryListByProerties(new String[] { propName }, new Object[] { propValue }, null, top);
	}

	/**
	 * ## 方法说明：
	 * 	根据属性获取对象实体列表
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @return 返回对象实体列表
	 */
	@Override
	public List<E> queryListByProerties(String propName, Object propValue) {
		return queryListByProerties(new String[] { propName }, new Object[] { propValue }, null, null);
	}

}