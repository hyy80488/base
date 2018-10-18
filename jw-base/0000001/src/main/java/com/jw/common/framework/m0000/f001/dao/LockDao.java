/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0000.f001.dao;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.CodeBean;

/**
 * ## 类说明：
 * 	描述
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月16日]
 * @package com.jw.hms.platform.m3100.f001.dao
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月16日|jianana|新增|LockDao.java新增
*/
public interface LockDao extends Dao{
	/**
	 * 
	 * ## 方法说明：
	 * 	根据传入list与IdMap集合锁表
	 * @param tableList 
	 * @param paramMap 例如：key:BsSysUser.class.getName()  value:"1"/"1,2,3"
	 * @throws BusinessException 
	 */
	public void lockTable(List<CodeBean> tableList, Map<String, String> paramMap) throws BusinessException;
	
	/** 
	 * ## 方法说明：
	 * 	根据传入sql 锁定数据
	 * @param strSql
	 * @throws BusinessException
	*/
	public void lockSql(List<String> strSql) throws Exception;
}
