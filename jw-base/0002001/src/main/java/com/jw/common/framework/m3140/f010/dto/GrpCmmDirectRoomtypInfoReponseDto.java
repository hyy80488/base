
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseApiDto;

/**
 * 
 * ## 类说明：
 * 	直销查询房型详细信息
 * @author    [zteng]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|zteng|新增|GrpCmmDirectRoomtypInfoReponseDto.java新增
 */
@DrptDto(dtonm = "直销查询房型详细信息数据传输对象", dtodrpt = "直销查询房型详细信息数据传输对象")
public class GrpCmmDirectRoomtypInfoReponseDto extends ResponseBaseApiDto implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -9184065524445618464L;
	@DrptField(fieldnm = "roomtypCd", fielddrpt = "房型编号")
	private String roomtypCd;
	@DrptField(fieldnm = "roomtypNm", fielddrpt = "房型名称")
	private String roomtypNm;
	@DrptField(fieldnm = "roomtypShortnm", fielddrpt = "房型简称")
	private String roomtypShortnm;
	@DrptField(fieldnm = "roomtypWebnm", fielddrpt = "房型web名称")
	private String roomtypWebnm;
	@DrptField(fieldnm = "Seq", fielddrpt = "序号")
	private Integer Seq;
	@DrptField(fieldnm = "occupancy", fielddrpt = "入住人数")
	private Integer occupancy;
	@DrptField(fieldnm = "roomArea", fielddrpt = "面积")
	private String roomArea;
	@DrptField(fieldnm = "roomFloors", fielddrpt = "楼层")
	private String roomFloors;
	@DrptField(fieldnm = "bedtypId", fielddrpt = "床型id")
	private Integer bedtypId;
	@DrptField(fieldnm = "bedtypDrpt", fielddrpt = "床型描述")
	private String bedtypDrpt;
	@DrptField(fieldnm = "note", fielddrpt = "备注")
	private String note;
	@DrptField(fieldnm = "rmtypDecorates", fielddrpt = "房型摆设")
	private List<Map<String,Object>> rmtypDecorates;
	@DrptField(fieldnm = "rates", fielddrpt = "价格")
	private List<Map<String,Object>> rates;
	@DrptField(fieldnm = "rmtypTags", fielddrpt = "房型标签")
	private List<UnitTagsDto> rmtypTags;
	@DrptField(fieldnm = "unitProps", fielddrpt = "房型附加属性")
	private List<UnitPropsDto> rmtypProps;
	@DrptField(fieldnm = "unitPics", fielddrpt = "酒店图片")
	private List<UnitPicsDto> unitPics;
	
	
	public String getRoomtypCd() {
		return roomtypCd;
	}
	public void setRoomtypCd(String roomtypCd) {
		this.roomtypCd = roomtypCd;
	}
	public String getRoomtypNm() {
		return roomtypNm;
	}
	public void setRoomtypNm(String roomtypNm) {
		this.roomtypNm = roomtypNm;
	}
	public String getRoomtypShortnm() {
		return roomtypShortnm;
	}
	public void setRoomtypShortnm(String roomtypShortnm) {
		this.roomtypShortnm = roomtypShortnm;
	}
	public String getRoomtypWebnm() {
		return roomtypWebnm;
	}
	public void setRoomtypWebnm(String roomtypWebnm) {
		this.roomtypWebnm = roomtypWebnm;
	}
	public Integer getSeq() {
		return Seq;
	}
	public void setSeq(Integer seq) {
		Seq = seq;
	}
	public Integer getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(Integer occupancy) {
		this.occupancy = occupancy;
	}
	public String getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}
	public String getRoomFloors() {
		return roomFloors;
	}
	public void setRoomFloors(String roomFloors) {
		this.roomFloors = roomFloors;
	}
	public Integer getBedtypId() {
		return bedtypId;
	}
	public void setBedtypId(Integer bedtypId) {
		this.bedtypId = bedtypId;
	}
	public String getBedtypDrpt() {
		return bedtypDrpt;
	}
	public void setBedtypDrpt(String bedtypDrpt) {
		this.bedtypDrpt = bedtypDrpt;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<Map<String, Object>> getRmtypDecorates() {
		return rmtypDecorates;
	}
	public void setRmtypDecorates(List<Map<String, Object>> rmtypDecorates) {
		this.rmtypDecorates = rmtypDecorates;
	}
	public List<Map<String, Object>> getRates() {
		return rates;
	}
	public void setRates(List<Map<String, Object>> rates) {
		this.rates = rates;
	}
	public List<UnitTagsDto> getRmtypTags() {
		return rmtypTags;
	}
	public void setRmtypTags(List<UnitTagsDto> rmtypTags) {
		this.rmtypTags = rmtypTags;
	}
	public List<UnitPropsDto> getRmtypProps() {
		return rmtypProps;
	}
	public void setRmtypProps(List<UnitPropsDto> rmtypProps) {
		this.rmtypProps = rmtypProps;
	}
	public List<UnitPicsDto> getUnitPics() {
		return unitPics;
	}
	public void setUnitPics(List<UnitPicsDto> unitPics) {
		this.unitPics = unitPics;
	}
	
	
}
