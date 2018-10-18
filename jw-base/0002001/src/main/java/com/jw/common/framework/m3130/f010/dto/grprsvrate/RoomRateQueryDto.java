/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * 
 * ## 类说明：
 * 	房价查询
 * @author    [guoc]   
 * @version   [V1.0, 2017年4月11日]
 * @package com.jw.hms.pms.m3210.f010.dto.rsvRateQuery
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月11日|guoc|新增|RoomRateQueryDto.java新增
 */
@DrptDto(dtonm = "房价查询",dtodrpt="房价查询")
public class RoomRateQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -813964401710960358L;
	@DrptField(fieldnm="chainUid",fielddrpt="集团uid")
	private String chainUid;
	@DrptField(fieldnm="unitUid",fielddrpt="单位uid")
	private String unitUid;
	@DrptField(fieldnm="roomtypIds",fielddrpt="房型id")
	private List<Integer> roomtypIds;
	@DrptField(fieldnm="frDt",fielddrpt="日期")
	private String frDt;
	@DrptField(fieldnm="toDt",fielddrpt="日期")
	private String toDt;
	public String getChainUid() {
		return chainUid;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public List<Integer> getRoomtypIds() {
		return roomtypIds;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public void setRoomtypIds(List<Integer> roomtypIds) {
		this.roomtypIds = roomtypIds;
	}
	public String getFrDt() {
		return frDt;
	}
	public String getToDt() {
		return toDt;
	}
	public void setFrDt(String frDt) {
		this.frDt = frDt;
	}
	public void setToDt(String toDt) {
		this.toDt = toDt;
	}
}
