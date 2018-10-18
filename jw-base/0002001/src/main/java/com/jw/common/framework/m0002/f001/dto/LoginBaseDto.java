/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;

import com.jw.common.framework.m0002.f001.dto.api.LogDiffer;

/**
 * 
 * ## 类说明：
 * 	登录BaseDto
 * @author    [guoc]   
 * @version   [V1.0, 2017年3月2日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年3月2日|guoc|新增|LoginBaseDto.java新增
 */
public class LoginBaseDto implements LogDiffer, java.io.Serializable {
	
	private static final long serialVersionUID = 8348642030380197744L;

	/** 追踪ID **/
	private String tracerId;

	/** 系统类型，用于切换数据库判断 **/
	private String sysTypeName;
	
	/** 登录使用的数据源信息（集团gre_dev） **/
	private String dbName;
	
	/** 登录使用的数据源信息（酒店pms_dev） **/
	private String dbNameUnit;

	public String getTracerId() {
		return tracerId;
	}

	public void setTracerId(String tracerId) {
		this.tracerId = tracerId;
	}

	public String getSysTypeName() {
		return sysTypeName;
	}

	public void setSysTypeName(String sysTypeName) {
		this.sysTypeName = sysTypeName;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
	public String getDbNameUnit() {
		return dbNameUnit;
	}

	public void setDbNameUnit(String dbNameUnit) {
		this.dbNameUnit = dbNameUnit;
	}

	@Override
	public List<LogDifferInfoDto> getLogDiffer() {
		return null;
	}

}
