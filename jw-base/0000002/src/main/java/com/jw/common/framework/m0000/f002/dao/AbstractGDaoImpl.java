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
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.jdbc.Work;
import org.hibernate.type.Type;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.Constant.ENUM_NULL_OR_NOT;
import com.jw.base.framework.core.HsqlCompare;
import com.jw.base.framework.core.HsqlUpperOrLower;
import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.BeanUtil;
import com.jw.base.framework.core.util.page.BaseParameter;
import com.jw.common.framework.m0000.f001.dao.GDao;
import com.jw.common.framework.m0001.f001.entity.DomainObject;
import com.jw.common.framework.m0001.f001.entity.LockEntity;

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
public abstract class AbstractGDaoImpl<E> implements GDao<E> {

	//private static Map<String, Method> MAP_METHOD = new HashMap<String, Method>();

	/** 泛型类 **/
	protected Class<E> entityClass;

	/** Session会话 **/
	@Override
	public abstract Session getSession();

	/**
	 * ## 方法说明： 
	 * 	构造器
	 * @param entityClass 泛型类
	 */
	public AbstractGDaoImpl(Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	/**
	 * ## 方法说明：
	 * 	更新版本号，主要使用hibernate乐观锁实现版本控制
	 * @param id
	 * @param version
	 * @return
	 */
	@Override
	public E updateVersion(Integer id, Integer version) throws Exception {
		DomainObject domain = (DomainObject) get(id);
		if (domain.getVersion().intValue() == version.intValue()) {
			getSession().update(domain);
		} else {
			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_100000, "Current version is not the latest version", "当前已不是最新版本", BsProcessErrorCode.ERROR_LEVEL_5);
		}
		return (E) domain;
	}

	/**
	 * ## 方法说明：
	 * 	校验版本号，主要使用hibernate乐观锁实现版本控制
	 * @param id
	 * @param version
	 * @return
	 */
	@Override
	public void validVersion(Integer id, Integer version) throws Exception {
		//根据ID获取信息
		DomainObject domain = (DomainObject) get(id);
		//判断版本是否与数据库版本一致
		if (domain.getVersion().intValue() != version.intValue()) {
			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_100000, "Current version is not the latest version", "当前已不是最新版本", BsProcessErrorCode.ERROR_LEVEL_5);
		}
	}

	
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
	@Override
	public void lock(E entity) {
		if(entity instanceof LockEntity){
			LockEntity lockEntity = (LockEntity) entity;
			//获取模型类中getParentEntityLock()方法返回值是否为空
			E obj = (E)lockEntity.getParentEntityLock();
			//否：继续迭代直到结果为空
			if(obj != null){
				lock(obj);
			}else{
				//是：锁本表
				if(entity instanceof DomainObject){
					getSession().get(entity.getClass(), ((DomainObject) entity).getId(), LockOptions.UPGRADE);
				}
			}
		}
	}
	
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
	@Override
	public void lockEntity(E entity){
		if(entity instanceof DomainObject){
			getSession().get(entity.getClass(), ((DomainObject) entity).getId(),new LockOptions(LockMode.UPGRADE_NOWAIT));
		}
	}
	/**
	 * ## 方法说明：
	 * 	持久化对象实体
	 * @param entity 对象实体
	 */
	@Override
	public void save(E entity) throws Exception {
		// 在DAO层校验Entity中BigDecimal类型字段的小数位数
		getSession().save(entity);
	}

	/**
	 * ## 方法说明：
	 * 	根据多个id参数删除对象
	 * @param id 多个id，以英文逗号隔开
	 * @return 返回true或者false
	 * @throws Exception 
	 */
	@Override
	public boolean deleteByPK(Integer[] id) throws Exception {
		boolean result = false;
		if ((id != null) && (id.length > 0)) {
			for (int i = 0; i < id.length; i++) {
				Object entity = get(id[i]);
				if (entity != null) {
					getSession().delete(entity);
					result = true;
				}
			}
		}
		return result;
	}

	/**
	 * ## 方法说明：
	 * 	删除对象实体
	 * @param entity 对象实体
	 */
	@Override
	public void delete(E entity)throws Exception {
		getSession().delete(entity);
	}
	
	/**
	 * ## 方法说明：
	 * 	以HQL的方式，根据单个属性删除对象实体
	 * @param propName 属性名称
	 * @param propValue 属性值
	 */
	@Override
	public void deleteBatchByProperties(String propName, Object propValue) throws Exception {
		deleteBatchByProperties(new String[] { propName }, new Object[] { propValue });
	}
	
	/**
	 * ## 方法说明：
	 * 以HQL的方式，根据多个属性删除对象实体
	 * @param propName 属性名称
	 * @param propValue 属性值
	 */
	@Override
	public void deleteBatchByProperties(String[] propName, Object[] propValue) throws Exception {
		if ((propName != null) && (propName.length > 0) && (propValue != null) && (propValue.length > 0)
				&& (propValue.length == propName.length)) {
			StringBuffer sb = new StringBuffer("delete  " + this.entityClass.getName() + " o where 1=1 ");
			appendQL(sb, propName, propValue);
			Query query = getSession().createQuery(sb.toString());
			setParameter(query, propName, propValue);
			query.executeUpdate();
		}
	}
	
	/**
	 * ## 方法说明：
	 * 	根据给定的Detached对象标识符更新对象实体
	 * @param entity 对象实体
	 */
	@Override
	public void update(E entity) throws Exception {
		// 在DAO层校验Entity中BigDecimal类型字段的小数位数
		getSession().merge(entity);
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
		this.flush();
	}
	
	/**
	 * ## 方法说明：
	 * 	根据多个属性条件更新对象实体多个属性
	 * @param conditionName WHERE子句条件的属性数组名称
	 * @param conditionValue WHERE子句条件的属性数组值
	 * @param propertyName UPDATE子句属性数组名称
	 * @param propertyValue UPDATE子句属性数组值
	 */
	@Override
	public void updateBatchByProperties(String[] conditionName, Object[] conditionValue, String[] propertyName,
			Object[] propertyValue) throws Exception {
		if ((propertyName != null) && (propertyName.length > 0) && (propertyValue != null) && (propertyValue.length > 0)
				&& (propertyName.length == propertyValue.length) && (conditionValue != null)
				&& (conditionValue.length > 0)) {
			StringBuffer sb = new StringBuffer();
			sb.append("update " + this.entityClass.getName() + " o set ");
			for (int i = 0; i < propertyName.length; i++) {
				sb.append(propertyName[i] + " = :p_" + propertyName[i] + ",");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append(" where 1=1 ");
			appendQL(sb, conditionName, conditionValue);
			Query query = getSession().createQuery(sb.toString());
			for (int i = 0; i < propertyName.length; i++) {
				query.setParameter("p_" + propertyName[i], propertyValue[i]);
			}
			setParameter(query, conditionName, conditionValue);
			query.executeUpdate();
		} else {
			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_000053,
					"Method updateByProperties in BaseDao argument is illegal!",
					"Method updateByProperties in BaseDao argument is illegal!", BsProcessErrorCode.ERROR_LEVEL_5);
		}
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
	 * 	合并给定的对象实体状态到当前的持久化上下文，使用merge的时候，执行完成，我们提供的对象A还是脱管状态，hibernate或者new了一个B，或者检索到 一个持久对象B，并把我们提供的对象A的所有的值拷贝到这个B，执行完成后B是持久状态，而我们提供的A还是托管状态。
	 * 	1、数据库记录存在，更新属性值为一个新值，则先select再update
	 * 	2、数据库记录存在，更新属性值同当前值是一样的值，则只select，不update
	 * 	3、数据库记录不存在，merge会把该记录当作新的记录来插入
	 * @param entity 给定的对象实体
	 * @return 返回对象实体
	 */
	@Override
	public E merge(E entity) throws Exception {
		getSession().merge(entity);
		return entity;
	}

	/**
	 * ## 方法说明：
	 * 	根据ID立即加载持久化对象实体
	 * @param id ID值
	 * @return 返回对象实体
	 */
	@Override
	public E get(Integer id) throws Exception {
		return (E) getSession().get(this.entityClass, id);
	}
	
	/**
	 * ## 方法说明：
	 * 	根据ID延迟加载持久化对象实体
	 * @param id ID值
	 * @return 返回对象实体
	 */
//	@Override
//	public E load(Serializable id) {
//		return (E) getSession().load(this.entityClass, id);
//	}
	
	/**
	 * ## 方法说明：
	 * 	根据属性数组获取单个对象实体
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @return 返回对象实体
	 */
	@Override
	public E getByProerties(String[] propName, Object[] propValue) throws Exception {
		return getByProerties(propName, propValue, null);
	}
	
	/**
	 * ## 方法说明：
	 * 	根据属性数组和排序条件获取单个对象实体
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @param sortedCondition 排序条件
	 * @return 返回对象实体
	 */
	@Override
	public E getByProerties(String[] propName, Object[] propValue, List<String> sortedCondition) throws Exception {
		if (propName.length > 0 && propValue.length > 0 && (propValue.length == propName.length)) {
			StringBuffer sb = new StringBuffer("select o from " + this.entityClass.getName() + " o where 1=1 ");
			appendQL(sb, propName, propValue);
			if ((sortedCondition != null) && (sortedCondition.size() > 0)) {
				sb.append(" order by ");
				for (String order : sortedCondition) {
					sb.append(order + ",");
				}
				sb.deleteCharAt(sb.length() - 1);
			}
			Query query = getSession().createQuery(sb.toString());
			setParameter(query, propName, propValue);
			List list = query.list();
			if ((list != null) && (list.size() > 0)){
				return (E) list.get(0);
			}
		}
		return null;
	}

	/**
	 * ## 方法说明：
	 * 	根据属性获取单个对象实体
	 * @param propName 属性名称
	 * @param propValue 属性值
	 * @return 返回对象实体
	 */
	@Override
	public E getByProerties(String propName, Object propValue) throws Exception {
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
	public E getByProerties(String propName, Object propValue, List<String> sortedCondition) throws Exception {
		return getByProerties(new String[] { propName }, new Object[] { propValue }, sortedCondition);
	}

	/**
	 * ## 方法说明：
	 * 	根据属性、排序条件和要返回的记录数目获取对象实体列表
	 * @param propName 属性数组名称
	 * @param propValue 属性数组值
	 * @param sortedCondition 排序条件
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
	@Override
	public List<E> queryListByProerties(String[] propName, Object[] propValue, List<String> sortedCondition, Integer top) throws Exception {
		if ((propName != null) && (propValue != null) && (propValue.length == propName.length)) {
			StringBuffer sb = new StringBuffer("select o from " + this.entityClass.getName() + " o where 1=1 ");
			appendQL(sb, propName, propValue);
			if ((sortedCondition != null) && (sortedCondition.size() > 0)) {
				sb.append(" order by ");
				for (String order : sortedCondition) {
					sb.append(order + ",");
				}
				sb.deleteCharAt(sb.length() - 1);
			}
			Query query = getSession().createQuery(sb.toString());
			setParameter(query, propName, propValue);
			if (top != null) {
				query.setFirstResult(0);
				query.setMaxResults(top.intValue());
			}
			return query.list();
		}
		return null;
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
	public List<E> queryListByProerties(String[] propName, Object[] propValue, List<String> sortedCondition) throws Exception {
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
	public List<E> queryListByProerties(String[] propName, Object[] propValue, Integer top) throws Exception {
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
	public List<E> queryListByProerties(String[] propName, Object[] propValue) throws Exception {
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
	public List<E> queryListByProerties(String propName, Object propValue, List<String> sortedCondition, Integer top) throws Exception {
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
	public List<E> queryListByProerties(String propName, Object propValue, List<String> sortedCondition) throws Exception {
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
	public List<E> queryListByProerties(String propName, Object propValue, Integer top) throws Exception {
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
	public List<E> queryListByProerties(String propName, Object propValue) throws Exception {
		return queryListByProerties(new String[] { propName }, new Object[] { propValue }, null, null);
	}

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
	 * 	从会话缓存中删除此对象实体
	 * @param entity 待删除的对象实体
	 */
	@Override
	public void evict(E entity) {
		getSession().evict(entity);
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
	 * ## 方法说明：
	 * 	查询出对象实体的所有数目
	 * @return 返回对象实体所有数目
	 */
//	@Override
//	public Long countAll() {
//		return (Long) getSession().createQuery("select count(1) from " + this.entityClass.getName()).uniqueResult();
//	}

	/**
	 * ## 方法说明：
	 * 	查询出所有的对象实体列表
	 * @return 返回对象实体列表
	 */
//	@Override
//	public List<E> doQueryAll() {
//		return doQueryAll(null, null);
//	}
	
	/**
	 * ## 方法说明：
	 * 	根据要返回的记录数目查询出对象实体列表
	 * @param top 要返回的记录数目
	 * @return 返回对象实体列表
	 */
//	@Override
//	public List<E> doQueryAll(Integer top) {
//		return doQueryAll(null, top);
//	}

	/**
	 * ## 方法说明：
	 * 	根据各种查询条件返回对象实体数目
	 * @param parameter 各种查询条件
	 * @return 返回对象实体数目
	 */
//	@Override
//	public Long doCount(BaseParameter param) {
//		if (param == null)
//			return null;
//		Criteria criteria = getSession().createCriteria(this.entityClass);
//		processQuery(criteria, param);
//		try {
//			criteria.setProjection(Projections.rowCount());
//			return Long.valueOf(((Number) criteria.uniqueResult()).longValue());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}


	/**
	 * 根据各种查询条件返回对象实体列表List
	 */
	@Override
	public List<E> doQuery(BaseParameter param) throws Exception {
		if (param == null){
			return null;
		}
		Criteria criteria = getSession().createCriteria(this.entityClass);
	
		// 设置Where条件
		Map<String, Object> mapWhere = param.getQueryDynamicConditions();
		for (Map.Entry<String, Object> entry : mapWhere.entrySet()){
			String pm = entry.getKey();
			criteria.add(Restrictions.eq(pm, entry.getValue()));
		}
				
		// 设置Order条件
		List<String> orders = param.getSortedList();
		for (String order : orders) {
			String[] sortInfoArray = order.split(" ");
			
			if (sortInfoArray.length > 0) {
				if (sortInfoArray.length > 1
						&& Constant.SORT_ASC.equalsIgnoreCase(sortInfoArray[1])) {
					criteria.addOrder(Order.asc(sortInfoArray[0]));
				} else {
					criteria.addOrder(Order.desc(sortInfoArray[0]));
				}
			}
		}
		
		return criteria.list();
	}
	
	/**
	 * ## 方法说明：
	 * 	根据各种查询条件返回分页列表
	 * @param parameter 各种查询条件
	 * @return 返回分页列表
	 */
//	@Override
//	public QueryResult<E> doPaginationQuery(BaseParameter param) {
//		return doPaginationQuery(param, true);
//	}

	private void appendQL(StringBuffer sb, String[] propName, Object[] propValue) {
		for (int i = 0; i < propName.length; i++) {
			String name = propName[i];
			Object value = propValue[i];
			if (value instanceof Object[]) {
				Object[] arraySerializable = (Object[]) value;
				if ((arraySerializable != null) && (arraySerializable.length > 0)) {
					sb.append(" and o." + name + " in (:" + name.replace(".", "") + ")");
				}
			} else if (value == null || value.equals(ENUM_NULL_OR_NOT.NULL)) {
				sb.append(" and o." + name + " is null ");
			} else if (value.equals(ENUM_NULL_OR_NOT.NOTNULL)) {
				sb.append(" and o." + name + " is not null ");
			}else if(value instanceof HsqlCompare){
				sb.append(" and o." + name + String.format("%s :",( (HsqlCompare)value).getCompare().getValue())  + name.replace(".", ""));
			}else if(value instanceof HsqlUpperOrLower){
				String upOrLw = ((HsqlUpperOrLower)value).getUporlw().getValue();
				sb.append(String.format(" and %s(o.%s)" , upOrLw ,name) + String.format("= %s(:%s)" , upOrLw , name.replace(".", "")));
			}else {
				sb.append(" and o." + name + "=:" + name.replace(".", ""));
			}
		}
	}

	private void setParameter(Query query, String[] propName, Object[] propValue) {
		for (int i = 0; i < propName.length; i++) {
			String name = propName[i];
			Object value = propValue[i];
			if (value != null && (!value.equals(ENUM_NULL_OR_NOT.NULL)) && (!value.equals(ENUM_NULL_OR_NOT.NOTNULL))){
				if ((value instanceof Object[])){
					query.setParameterList(name.replace(".", ""), (Object[]) value);
				}else if(value instanceof HsqlCompare){
					query.setParameter(name.replace(".", ""), ((HsqlCompare)value).getValue());
				}else if(value instanceof HsqlUpperOrLower){
					query.setParameter(name.replace(".", ""), ((HsqlUpperOrLower)value).getValue());
				}else{
					query.setParameter(name.replace(".", ""), value);
				}
			}
		}
	}

//	private String transferColumn(String queryCondition) {
//		return queryCondition.substring(queryCondition.indexOf('_', 1) + 1);
//	}


//	private Method getMethod(String name) {
//		if (!MAP_METHOD.containsKey(name)) {
//			Class clazz = Restrictions.class;
//			Class[] paramType = { String.class, Object.class };
//			Class[] likeParamType = { String.class, String.class, MatchMode.class };
//			Class[] isNullType = { String.class };
//			try {
//				Method method = null;
//				if ("like".equals(name))
//					method = clazz.getMethod(name, likeParamType);
//				else if ("isNull".equals(name))
//					method = clazz.getMethod(name, isNullType);
//				else {
//					method = clazz.getMethod(name, paramType);
//				}
//				MAP_METHOD.put(name, method);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return (Method) MAP_METHOD.get(name);
//	}
//
//	private Method getExtendMethod(String name) {
//		if (!MAP_METHOD.containsKey(name)) {
//			Class clazz = Restrictions.class;
//			Class[] paramType = { String.class, Object.class };
//			Class[] likeParamType = { String.class, String.class, MatchMode.class };
//			Class[] isNullType = { String.class };
//			try {
//				Method method = null;
//				if ("like".equals(name))
//					method = clazz.getMethod(name, likeParamType);
//				else if ("isNull".equals(name))
//					method = clazz.getMethod(name, isNullType);
//				else if (!"IN".equals(name.toUpperCase())) {
//					method = clazz.getMethod(name, paramType);
//				}
//				MAP_METHOD.put(name, method);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return (Method) MAP_METHOD.get(name);
//	}

	/**
	 * ## 方法说明：
	 * 	根据sql查询
	 * @param sql  sql语句
	 * @return 结果集合
	 */
//	@Override
//	public List findBySql(final String sql) {
//		Query query = getSession().createSQLQuery(sql);
//		return (List) query.list();
//	}

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
	 * 	带参数的sql全部记录查询
	 * @param sql
	 * @param params
	 * @return List<Map>查询结果集合
	 */
	@Override
	public List<Map<String,Object>> findBySqlToMap(final String sql, final Object[] params) throws Exception {
		return this.findBySqlToMap(sql, params, 0, 0);
	}

	/**
	 * ## 方法说明：
	 * 	不带参数的sql分页查询
	 * @param sql sql语句
	 * @param currPage 当前页
	 * @param pageSize 每页显示条目数量
	 * @return List<Map>查询结果集合
	 */
	@Override
	public List<Map<String,Object>> findBySqlToMap(final String sql, int currPage, int pageSize) throws Exception {
		return this.findBySqlToMap(sql, null, currPage, pageSize);
	}

//	private String getOpt(String value) {
//		return value.substring(0, value.indexOf('_', 1)).substring(1);
//	}
//
//	private String getPropName(String value) {
//		return value.substring(value.indexOf('_', 1) + 1);
//	}
//
//	private void processQuery(Criteria criteria, BaseParameter param) {
//		try {
//			Map staticConditionMap = BeanUtil.describeAvailableParameter(param);
//			Map dynamicConditionMap = param.getQueryDynamicConditions();
//			Disjunction disjunction = Restrictions.disjunction();
//			if ((staticConditionMap != null) && (staticConditionMap.size() > 0)) {
//				Iterator<Map.Entry> it = staticConditionMap.entrySet().iterator();
//				while (it.hasNext()) {
//					// for (Map.Entry e : staticConditionMap.entrySet()) {
//					Map.Entry e = it.next();
//					Object value = e.getValue();
//					if ((value != null) && ((!(value instanceof String)) || (!"".equals((String) value)))) {
//						String prop = getPropName((String) e.getKey());
//						String methodName = getOpt((String) e.getKey());
//						Method m = getMethod(methodName);
//						if ("like".equals(methodName)) {
//							if (param.getFlag().equals("OR"))
//								criteria.add(disjunction.add((Criterion) m.invoke(Restrictions.class,
//										new Object[] { prop, value, MatchMode.ANYWHERE })));
//							else
//								criteria.add((Criterion) m.invoke(Restrictions.class,
//										new Object[] { prop, value, MatchMode.ANYWHERE }));
//						} else if (("isNull".equals(methodName)) && ((value instanceof Boolean))) {
//							if (((Boolean) value).booleanValue()) {
//								if (param.getFlag().equals("OR"))
//									criteria.add(disjunction.add(Restrictions.isNull(prop)));
//								else {
//									criteria.add(Restrictions.isNull(prop));
//								}
//							} else if (param.getFlag().equals("OR"))
//								criteria.add(disjunction.add(Restrictions.isNotNull(prop)));
//							else {
//								criteria.add(Restrictions.isNotNull(prop));
//							}
//
//						} else if (param.getFlag().equals("OR"))
//							criteria.add(disjunction
//									.add((Criterion) m.invoke(Restrictions.class, new Object[] { prop, value })));
//						else {
//							criteria.add((Criterion) m.invoke(Restrictions.class, new Object[] { prop, value }));
//						}
//					}
//				}
//			}
//
//			if ((dynamicConditionMap != null) && (dynamicConditionMap.size() > 0)) {
//				Object bean = this.entityClass.newInstance();
//				Object map = new HashMap();
//				Iterator<Map.Entry> it = dynamicConditionMap.entrySet().iterator();
//				while (it.hasNext()) {
//					// for (Map.Entry e : dynamicConditionMap.entrySet()) {
//					Map.Entry e = it.next();
//					((Map) map).put(getPropName((String) e.getKey()), e.getValue());
//				}
//				org.apache.commons.beanutils.BeanUtils.populate(bean, (Map) map);
//				Iterator<Map.Entry> it2 = dynamicConditionMap.entrySet().iterator();
//				while (it2.hasNext()) {
//					// for (Map.Entry e : dynamicConditionMap.entrySet()) {
//					Map.Entry e = it2.next();
//					String pn = (String) e.getKey();
//					String prop = getPropName(pn);
//					String methodName = getOpt(pn);
//					Method m = getMethod(methodName);
//					Object value = PropertyUtils.getNestedProperty(bean, prop);
//
//					if ((value != null) && ((!(value instanceof String)) || (!"".equals((String) value)))) {
//						if ("like".equals(methodName)) {
//							if (param.getFlag().equals("OR"))
//								criteria.add(disjunction.add((Criterion) m.invoke(Restrictions.class,
//										new Object[] { prop, value, MatchMode.ANYWHERE })));
//							else
//								criteria.add((Criterion) m.invoke(Restrictions.class,
//										new Object[] { prop, value, MatchMode.ANYWHERE }));
//						} else if (("isNull".equals(methodName)) && ((value instanceof Boolean))) {
//							if (((Boolean) value).booleanValue()) {
//								if (param.getFlag().equals("OR"))
//									criteria.add(disjunction.add(Restrictions.isNull(prop)));
//								else {
//									criteria.add(Restrictions.isNull(prop));
//								}
//							} else if (param.getFlag().equals("OR"))
//								criteria.add(disjunction.add(Restrictions.isNotNull(prop)));
//							else {
//								criteria.add(Restrictions.isNotNull(prop));
//							}
//
//						} else if (param.getFlag().equals("OR"))
//							criteria.add(disjunction
//									.add((Criterion) m.invoke(Restrictions.class, new Object[] { prop, value })));
//						else
//							criteria.add((Criterion) m.invoke(Restrictions.class, new Object[] { prop, value }));
//					}
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	private void extendprocessQuery(Criteria criteria, BaseParameter param) {
//		try {
//			Map staticConditionMap = BeanUtil.describeAvailableParameter(param);
//			Map dynamicConditionMap = param.getQueryDynamicConditions();
//			if ((staticConditionMap != null) && (staticConditionMap.size() > 0)) {
//				Iterator<Map.Entry> it = staticConditionMap.entrySet().iterator();
//				// for (Map.Entry e : staticConditionMap.entrySet()) {
//				while (it.hasNext()) {
//					Map.Entry e = it.next();
//					Object value = e.getValue();
//					if ((value != null) && ((!(value instanceof String)) || (!"".equals((String) value)))) {
//						String prop = getPropName((String) e.getKey());
//						String methodName = getOpt((String) e.getKey());
//						Method m = getExtendMethod(methodName);
//						if ("like".equals(methodName)) {
//							criteria.add((Criterion) m.invoke(Restrictions.class,
//									new Object[] { prop, value, MatchMode.ANYWHERE }));
//						} else if (("isNull".equals(methodName)) && ((value instanceof Boolean))) {
//							if (((Boolean) value).booleanValue())
//								criteria.add(Restrictions.isNull(prop));
//							else {
//								criteria.add(Restrictions.isNotNull(prop));
//							}
//						} else if ((value != null) && ((value instanceof Object[]))
//								&& ("IN".equals(methodName.toUpperCase()))) {
//							Object[] obj = (Object[]) value;
//							criteria.add(Restrictions.in(prop, obj));
//						} else {
//							criteria.add((Criterion) m.invoke(Restrictions.class, new Object[] { prop, value }));
//						}
//					}
//				}
//
//			}
//
//			if ((dynamicConditionMap != null) && (dynamicConditionMap.size() > 0)) {
//				Object bean = this.entityClass.newInstance();
//				Object map = new HashMap();
//				Iterator<Map.Entry> it = dynamicConditionMap.entrySet().iterator();
//				// for (Map.Entry e : dynamicConditionMap.entrySet()) {
//				while (it.hasNext()) {
//					Map.Entry e = it.next();
//					((Map) map).put(getPropName((String) e.getKey()), e.getValue());
//				}
//				org.apache.commons.beanutils.BeanUtils.populate(bean, (Map) map);
//				Iterator<Map.Entry> it2 = dynamicConditionMap.entrySet().iterator();
//				// for (Map.Entry e : dynamicConditionMap.entrySet()) {
//				while (it2.hasNext()) {
//					Map.Entry e = it2.next();
//					String pn = (String) e.getKey();
//					String prop = getPropName(pn);
//					String methodName = getOpt(pn);
//					Method m = getMethod(methodName);
//					Object value = PropertyUtils.getNestedProperty(bean, prop);
//
//					if ((value != null) && ((!(value instanceof String)) || (!"".equals((String) value))))
//						if ("like".equals(methodName))
//							criteria.add((Criterion) m.invoke(Restrictions.class,
//									new Object[] { prop, value, MatchMode.ANYWHERE }));
//						else if (("isNull".equals(methodName)) && ((value instanceof Boolean))) {
//							if (((Boolean) value).booleanValue())
//								criteria.add(Restrictions.isNull(prop));
//							else
//								criteria.add(Restrictions.isNotNull(prop));
//						} else
//							criteria.add((Criterion) m.invoke(Restrictions.class, new Object[] { prop, value }));
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
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
	
	/**
	 * ## 方法说明：
	 * 	执行insert、update等SQL语句，注意非业务必须不要使用
	 * @param sql sql语句
	 */
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