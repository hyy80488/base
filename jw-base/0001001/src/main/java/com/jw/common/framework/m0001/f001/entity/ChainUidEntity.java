/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0001.f001.entity;

/**
 * 
 * ## 类说明：
 * 	所属集团基类接口
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月2日]
 * @package com.jw.platform.framework.core.entity
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月2日|jianana|新增|ChainUidEntity.java新增
 */
public interface ChainUidEntity {
	/**
	 * @param value 所属集团CODE
	 */
	public void setChainUid(String value);
	/**
	 * @return 所属集团CODE
	 */
	public String getChainUid();
}
