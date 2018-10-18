/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

/**
 * 
 * ## 类说明：
 * 	日志抽象信息DTO
 * @author    [jianana]   
 * @version   [V1.0, 2016/12/1]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/12/1|jianana|新增|LogAbstractInfo.java新增
 */
public class LogAbstractInfoDto implements java.io.Serializable {
	private static final long serialVersionUID = -6349719306578817357L;
	/** 账号 **/
	private String account;
	/** 名称 **/
	private String name;
	/** 房号 **/
	private String roomNumber;
	/** 摘要信息 **/
	private String abstractInfo;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getAbstractInfo() {
		return abstractInfo;
	}

	public void setAbstractInfo(String abstractInfo) {
		this.abstractInfo = abstractInfo;
	}

}
