/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0001.f001.entity;

import java.util.Date;

/**
 * ## 类说明：
 * 	基础entity（创建人、创建时间、创建人操作酒店）
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.entity
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|BaseEntity.java新增
 */
public interface BaseEntityWithUnit{
	
	/**
	 * @return 创建人
	 */
	public String getCreatedBy();
	
	/**
	 * @param value 创建人
	 */
	public void setCreatedBy(String value);
	
	/**
	 * @return 创建人ID
	 */
	public String getCreatedByUid();
	
	/**
	 * @param value 创建人ID
	 */
	public void setCreatedByUid(String createdByUid);
	/**
	 * @return 创建人CODE
	 */
	public String getCreatedByCd();
	
	/**
	 * @param value 创建人CODE
	 */
	public void setCreatedByCd(String createdByCode);
	
	/**
	 * @return 创建时间
	 */
	public Date getCreatedDate();
	
	/**
	 * @param value 创建时间
	 */
	public void setCreatedDate(Date value);
	
	/**
	 * @param value 创建人所属酒店编码
	 */
	public void setCreatedUnitUid(String value);
	/**
	 * @return 创建人所属酒店编码
	 */
	public String getCreatedUnitUid();
	
	/**
	 * @param value 创建人所属酒店CODE
	 */
	public void setCreatedUnitCd(String value);
	/**
	 * @return 创建人所属酒店CODE
	 */
	public String getCreatedUnitCd();
	
}
