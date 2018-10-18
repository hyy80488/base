/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0007.f001.serviceimpl;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

import com.jw.common.framework.m0004.f001.provider.BaseGProvider;
import com.jw.common.framework.m0005.f001.service.BaseGService;

/**
 * ## 类说明：
 * 	基础Service实现类
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.serviceimpl
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|BaseServiceImpl.java新增
 */
@Transactional(rollbackFor=Exception.class)
public abstract class BaseGServiceImpl<E, PK extends Serializable> implements BaseGService<E> {
	protected abstract BaseGProvider<E> getEntityService();
	/**
	 * ## 方法说明：
	 * 	持久化对象实体
	 * @param entity 对象实体
	 */
	@Override
	public void save(E entity) throws Exception {
		getEntityService().save(entity);
	}
	/**
	 * ## 方法说明：
	 * 	根据给定的Detached对象标识符更新对象实体
	 * @param entity 对象实体
	 */
	@Override
	public void update(E entity) throws Exception {
		getEntityService().update(entity);
	}
	/**
	 * ## 方法说明：
	 * 	根据多个id参数删除对象
	 * @param id 多个id，以英文逗号隔开
	 * @return 返回true或者false
	 */
	@Override
	public boolean deleteByPK(Integer... id) throws Exception {
		return getEntityService().deleteByPK(id);
	}
	/**
	 * ## 方法说明：
	 * 	根据单个id参数删除对象
	 * @param id
	 * @return 返回true或者false
	 */
	@Override
	public boolean deleteByPK(Integer id) throws Exception {
		return getEntityService().deleteByPK(id);
	}
	/**
	 * ## 方法说明：
	 * 	根据删除单个对象
	 * @param entity 对象实体
	 */
	@Override
	public void delete(E entity) throws Exception {
		getEntityService().delete(entity);
	}
	/**
	 * ## 方法说明：
	 * 	根据ID立即加载持久化对象实体
	 * @param id ID值
	 * @return 返回对象实体
	 * @throws Exception 
	 */
	@Transactional(readOnly = true)
	@Override
	public E getById(Integer id) throws Exception {
		return getEntityService().get(id);
	}

}