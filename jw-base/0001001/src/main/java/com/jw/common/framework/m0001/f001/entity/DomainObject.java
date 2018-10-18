/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0001.f001.entity;

import java.io.Serializable;

/**
 * ## 类说明：
 * 	基础entity接口 （ID VERSION）
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.entity
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|DomainObject.java新增
 */
public interface DomainObject {

	/**
	 * @return 主键
	 */
	public Serializable getId();

	/**
	 * @param id 主键
	 */
	public void setId(Integer id);
	
	/**
	 * @return 版本号
	 */
	public Integer getVersion();

	/**
	 * @param version 版本号
	 */
	public void setVersion(Integer version);
	
	/**
	 * @param businessStus 业务状态
	 */
	public String getBusinessStus();
	
	/**
	 * @param businessStus 业务状态
	 */
	public void setBusinessStus(String businessStus);
}
