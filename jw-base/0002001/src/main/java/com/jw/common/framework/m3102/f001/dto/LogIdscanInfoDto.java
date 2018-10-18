/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3102.f001.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
/**
 * ## 类说明：
 * 	更新证扫日志DTO
 * @author    [jianana]   
 * @version   [V1.0, 2017年8月25日]
 * @package com.jw.hms.cmm.m3102.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年8月25日|jianana|新增|LogIdscanInfoDto.java新增
 */
public class LogIdscanInfoDto extends RequestBaseDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -8297799414445129097L;
	@DrptField(fieldnm="guestId", fielddrpt="宾客ID", nullable = "false")
	private Integer guestId;
	
	@DrptField(fieldnm="idscanId", fielddrpt="证扫ID", nullable = "false")
	private Integer idscanId;
	
	@DrptField(fieldnm="idscanInfoDtos", fielddrpt="证扫集合", nullable = "false")
	private List<LogIdscanInfoDto> idscanInfoDtos = null;
	
	public LogIdscanInfoDto() {
		
	}
	public LogIdscanInfoDto(Integer guestId,Integer idscanId){
		this.guestId = guestId;
		this.idscanId = idscanId;
	}
	public Integer getGuestId() {
		return guestId;
	}
	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}
	public Integer getIdscanId() {
		return idscanId;
	}
	public void setIdscanId(Integer idscanId) {
		this.idscanId = idscanId;
	}
	public List<LogIdscanInfoDto> getIdscanInfoDtos() {
		return idscanInfoDtos;
	}
	public void setIdscanInfoDtos(List<LogIdscanInfoDto> idscanInfoDtos) {
		this.idscanInfoDtos = idscanInfoDtos;
	}

}
