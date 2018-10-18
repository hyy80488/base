/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0001.f001.entity;

/**
 * 
 * ## 类说明：
 * 	悲观锁基类接口
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月2日]
 * @package com.jw.platform.framework.core.entity
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月2日|jianana|新增|LockEntity.java新增
 */
public interface LockEntity {
	
	/**
	 * 
	 * ## 方法说明：
	 * 	悲观锁时使用此方法做迭代查询父类
	 * @return 父类对象
	 */
	public Object getParentEntityLock();
}
