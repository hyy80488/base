/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.channel;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class CrsDirectRoomtypInfoResDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 5746947534724785661L;
	@DrptField(fieldnm="roomtypNm",fielddrpt="房型名称")
	private String roomtypNm;
	@DrptField(fieldnm="roomtypCd",fielddrpt="房型代码")
	private String roomtypCd;
	@DrptField(fieldnm="roomtypId",fielddrpt="房型ID")
	private Integer roomtypId;
	@DrptField(fieldnm="roomtypWebnm",fielddrpt="外网名称")
	private String roomtypWebnm;
	@DrptField(fieldnm="roomtypShortnm",fielddrpt="房型简称")
	private String roomtypShortnm;
	@DrptField(fieldnm="Seq",fielddrpt="序号")
	private Integer Seq;
	@DrptField(fieldnm="roomFloors",fielddrpt="楼层")
	private String roomFloors;
	@DrptField(fieldnm="occupancy",fielddrpt="可住人数")
	private Integer occupancy;
	@DrptField(fieldnm="roomArea",fielddrpt="房型面积")
	private String roomArea;
	@DrptField(fieldnm="bedtypId",fielddrpt="床型id")
	private Integer bedtypId;
	@DrptField(fieldnm="bedtypDrpt",fielddrpt="床型描述")
	private String bedtypDrpt;
	@DrptField(fieldnm="bedtypCd",fielddrpt="床型cd")
	private String bedtypCd;
	@DrptField(fieldnm="note",fielddrpt="床型描述")
	private String note;
	@DrptField(fieldnm="rmtypDecorates",fielddrpt="床型")
	private List<CrsDirectRmtypDecorateDto> rmtypDecorates;
	@DrptField(fieldnm="rmtypTags",fielddrpt="标签")
	private List<Map<String, Object>> rmtypTags;
	@DrptField(fieldnm="rmtypProps",fielddrpt="房型附加属性")
	private List<Map<String, Object>> rmtypProps;
	@DrptField(fieldnm="rates",fielddrpt="价格")
	private List<Map> rates;
	@DrptField(fieldnm="rmtypPics",fielddrpt="房型图片")
	private List<Map<String, Object>> rmtypPics;
	
	public String getBedtypCd() {
		return bedtypCd;
	}
	public void setBedtypCd(String bedtypCd) {
		this.bedtypCd = bedtypCd;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getRoomtypNm() {
		return roomtypNm;
	}
	public void setRoomtypNm(String roomtypNm) {
		this.roomtypNm = roomtypNm;
	}
	public String getRoomtypCd() {
		return roomtypCd;
	}
	public void setRoomtypCd(String roomtypCd) {
		this.roomtypCd = roomtypCd;
	}
	public Integer getRoomtypId() {
		return roomtypId;
	}
	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}
	public String getRoomtypWebnm() {
		return roomtypWebnm;
	}
	public void setRoomtypWebnm(String roomtypWebnm) {
		this.roomtypWebnm = roomtypWebnm;
	}
	public String getRoomtypShortnm() {
		return roomtypShortnm;
	}
	public void setRoomtypShortnm(String roomtypShortnm) {
		this.roomtypShortnm = roomtypShortnm;
	}
	public Integer getSeq() {
		return Seq;
	}
	public void setSeq(Integer seq) {
		Seq = seq;
	}
	public String getRoomFloors() {
		return roomFloors;
	}
	public void setRoomFloors(String roomFloors) {
		this.roomFloors = roomFloors;
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
	public List<CrsDirectRmtypDecorateDto> getRmtypDecorates() {
		return rmtypDecorates;
	}
	public void setRmtypDecorates(List<CrsDirectRmtypDecorateDto> rmtypDecorates) {
		this.rmtypDecorates = rmtypDecorates;
	}
	public List<Map<String, Object>> getRmtypTags() {
		return rmtypTags;
	}
	public void setRmtypTags(List<Map<String, Object>> rmtypTags) {
		this.rmtypTags = rmtypTags;
	}
	public List<Map<String, Object>> getRmtypProps() {
		return rmtypProps;
	}
	public void setRmtypProps(List<Map<String, Object>> rmtypProps) {
		this.rmtypProps = rmtypProps;
	}
	public List<Map> getRates() {
		return rates;
	}
	public void setRates(List<Map> rates) {
		this.rates = rates;
	}
	public List<Map<String, Object>> getRmtypPics() {
		return rmtypPics;
	}
	public void setRmtypPics(List<Map<String, Object>> rmtypPics) {
		this.rmtypPics = rmtypPics;
	}
	
}
