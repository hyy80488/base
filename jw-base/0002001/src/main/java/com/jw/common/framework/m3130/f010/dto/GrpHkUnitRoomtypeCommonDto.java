
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmAttribute;
import com.jw.base.framework.core.ConstantParmTran;
import com.jw.base.framework.core.annotation.DrptEntity;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	房型配置基础字段
 * @author    [zhangteng]   
 * @version   [V1.0, 2017-05-31]
 * @package com.jw.hms.cmm.m3130.f010.entity
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-05-31|zhangteng|新增|GrpHkUnitRoomtype新增
 */
@DrptEntity(ennm = "房型配置基础字段", endrpt = "房型配置基础字段")
public class GrpHkUnitRoomtypeCommonDto  implements  java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7157994901578945971L;


	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码 ", nullable = "false", length = "40",logged=ConstantParmTran.ENUM_LOGGED.YES)

	
	private String chainUid;
	

	@DrptField(fieldnm = "unitUid", fielddrpt = "单位代码 ", nullable = "false", length = "40",logged=ConstantParmTran.ENUM_LOGGED.YES)

	
	private String unitUid;
	

	@DrptField(fieldnm = "roomtypId", fielddrpt = "房型代码 ", nullable = "false", length = "10",logged=ConstantParmTran.ENUM_LOGGED.YES)

	private Integer roomtypId;
	
	// 0：物理房型，1：销售房型

	@DrptField(fieldnm = "roomtypFlg", fielddrpt = "房型属性",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_ROOMTYP_FLG, nullable = "true", length = "3",logged=ConstantParmTran.ENUM_LOGGED.YES)
	
	private String roomtypFlg;
	

	@DrptField(fieldnm = "roomtypCd", fielddrpt = "房型编码 ", nullable = "false", length = "20",logged=ConstantParmTran.ENUM_LOGGED.YES)


	private String roomtypCd;
	

	@DrptField(fieldnm = "roomtypNm", fielddrpt = "房型名称 ", nullable = "false", length = "200",logged=ConstantParmTran.ENUM_LOGGED.YES)


	private String roomtypNm;
	

	@DrptField(fieldnm = "roomtypgrpId", fielddrpt = "房型组代码 ",paramtype=ConstantParm.ENUM_PARA_TYPE.CHAIN_UNIT_PARA,paramsubtype=ConstantParm.ROOMTYPGRP,nullable = "true", length = "10",logged=ConstantParmTran.ENUM_LOGGED.YES)
	private Integer roomtypgrpId;
	

	@DrptField(fieldnm = "seq", fielddrpt = "序号 ", nullable = "true", length = "10",logged=ConstantParmTran.ENUM_LOGGED.YES)
	private Integer seq;
	

	@DrptField(fieldnm = "roomNums", fielddrpt = "房间数量 ", nullable = "true", length = "10",logged=ConstantParmTran.ENUM_LOGGED.YES)
	private Integer roomNums;
	

	@DrptField(fieldnm = "occupancyMax", fielddrpt = "最大入住人数 ", nullable = "false", length = "10",logged=ConstantParmTran.ENUM_LOGGED.YES)

	private Integer occupancyMax;
	

	@DrptField(fieldnm = "occupancyStd", fielddrpt = "标准入住人数 ", nullable = "false", length = "10",logged=ConstantParmTran.ENUM_LOGGED.YES)

	private Integer occupancyStd;
	

	@DrptField(fieldnm = "occupancyAdultMax", fielddrpt = "最大成人数 ", nullable = "true", length = "10")
	private Integer occupancyAdultMax;
	

	@DrptField(fieldnm = "occupancyChildMax", fielddrpt = "最大儿童数 ", nullable = "true", length = "10")
	private Integer occupancyChildMax;
	

	@DrptField(fieldnm = "occupancyNobedMax", fielddrpt = "不加床最大人数 ", nullable = "true", length = "10")
	private Integer occupancyNobedMax;
	

	@DrptField(fieldnm = "bedtypId", fielddrpt = "床型 ", paramtype=ConstantParm.ENUM_PARA_TYPE.CHAIN_UNIT_PARA,paramsubtype=ConstantParm.BEDTYP,nullable = "true", length = "10",logged=ConstantParmTran.ENUM_LOGGED.YES)
	private Integer bedtypId;
	
	//NML：正常，PF：普通假房，PM：团队假房，HO：Hold假房，LS：账务遗漏假房，NAR：非营收处理假房，IF：接口抛账房

	@DrptField(fieldnm = "pseudoFlg", fielddrpt = "假房标志 ",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_PSEUDO_FLG, nullable = "false", length = "3",logged=ConstantParmTran.ENUM_LOGGED.YES)

	
	private String pseudoFlg;
	
	// 0：非组合房（默认） 1：组合房

	@DrptField(fieldnm = "comboFlg", fielddrpt = "组合房标志",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_COMBO_FLG, nullable = "false", length = "3")

	
	private String comboFlg;
	
	//0：非会议室（默认） 1：会议室

	@DrptField(fieldnm = "meetingroomFlg", fielddrpt = "会议室标志 ",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_MEETINGROOM_FLG, nullable = "false", length = "3")

	
	private String meetingroomFlg;
	
	//0：非套房（默认），1：套房

	@DrptField(fieldnm = "suitFlg", fielddrpt = "套房标识 ",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_SUIT_FLG, nullable = "false", length = "3")

	
	private String suitFlg;
	
	//0普通房，1连通房

	@DrptField(fieldnm = "shareableFlg", fielddrpt = "连通房标识 ",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_SHAREABLE_FLG, nullable = "false", length = "3")

	
	private String shareableFlg;
	

	@DrptField(fieldnm = "stayoverCredit", fielddrpt = "在店打扫分值 ", nullable = "true", length = "10")
	private Integer stayoverCredit;
	

	@DrptField(fieldnm = "departureCredit", fielddrpt = "离店打扫分值 ", nullable = "true", length = "10")
	private Integer departureCredit;
	

	@DrptField(fieldnm = "touchupCredit", fielddrpt = "轻脏打扫分值 ", nullable = "true", length = "10")
	private Integer touchupCredit;
	

	@DrptField(fieldnm = "turndownCredit", fielddrpt = "夜床打扫分值 ", nullable = "true", length = "10")
	private Integer turndownCredit;
	

	@DrptField(fieldnm = "note", fielddrpt = "备注 ", nullable = "true", length = "500")
	
	private String note;
	

	@DrptField(fieldnm = "statusFlg", fielddrpt = "statusFlg",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_STATUS_FLG, nullable = "false", length = "3",logged=ConstantParmTran.ENUM_LOGGED.YES)

	
	private String statusFlg;
	

	@DrptField(fieldnm = "roomtypShortnm", fielddrpt = "房型简称", nullable = "true", length = "200")

	private String roomtypShortnm;
	//房型组名称
	@DrptField(fieldnm = "roomtypgrpDrpt", fielddrpt = "房型组名称",logged=ConstantParmTran.ENUM_LOGGED.YES)
	private String roomtypgrpDrpt;
	//床型名称
	@DrptField(fieldnm = "bedtypDrpt", fielddrpt = "床型名称",logged=ConstantParmTran.ENUM_LOGGED.YES)
	private String bedtypDrpt;
	
	
	public String getBedtypDrpt() {
		return bedtypDrpt;
	}

	public void setBedtypDrpt(String bedtypDrpt) {
		this.bedtypDrpt = bedtypDrpt;
	}

	
	public String getRoomtypgrpDrpt() {
		return roomtypgrpDrpt;
	}

	public void setRoomtypgrpDrpt(String roomtypgrpDrpt) {
		this.roomtypgrpDrpt = roomtypgrpDrpt;
	}

	public GrpHkUnitRoomtypeCommonDto(){
	}
	
	public String getChainUid() {
		return this.chainUid;
	}
	public void setChainUid(String value) {
		this.chainUid = value;
	}
	public String getUnitUid() {
		return this.unitUid;
	}
	public void setUnitUid(String value) {
		this.unitUid = value;
	}
	public Integer getRoomtypId() {
		return this.roomtypId;
	}
	public void setRoomtypId(Integer value) {
		this.roomtypId = value;
	}
	public String getRoomtypFlg() {
		return this.roomtypFlg;
	}
	public void setRoomtypFlg(String value) {
		this.roomtypFlg = value;
	}
	public String getRoomtypCd() {
		return this.roomtypCd;
	}
	public void setRoomtypCd(String value) {
		this.roomtypCd = value;
	}
	public String getRoomtypNm() {
		return this.roomtypNm;
	}
	public void setRoomtypNm(String value) {
		this.roomtypNm = value;
	}
	public Integer getRoomtypgrpId() {
		return this.roomtypgrpId;
	}
	public void setRoomtypgrpId(Integer value) {
		this.roomtypgrpId = value;
	}
	public Integer getSeq() {
		return this.seq;
	}
	public void setSeq(Integer value) {
		this.seq = value;
	}
	public Integer getRoomNums() {
		return this.roomNums;
	}
	public void setRoomNums(Integer value) {
		this.roomNums = value;
	}
	public Integer getOccupancyMax() {
		return this.occupancyMax;
	}
	public void setOccupancyMax(Integer value) {
		this.occupancyMax = value;
	}
	public Integer getOccupancyStd() {
		return this.occupancyStd;
	}
	public void setOccupancyStd(Integer value) {
		this.occupancyStd = value;
	}
	public Integer getOccupancyAdultMax() {
		return this.occupancyAdultMax;
	}
	public void setOccupancyAdultMax(Integer value) {
		this.occupancyAdultMax = value;
	}
	public Integer getOccupancyChildMax() {
		return this.occupancyChildMax;
	}
	public void setOccupancyChildMax(Integer value) {
		this.occupancyChildMax = value;
	}
	public Integer getOccupancyNobedMax() {
		return this.occupancyNobedMax;
	}
	public void setOccupancyNobedMax(Integer value) {
		this.occupancyNobedMax = value;
	}
	public Integer getBedtypId() {
		return this.bedtypId;
	}
	public void setBedtypId(Integer value) {
		this.bedtypId = value;
	}
	public String getPseudoFlg() {
		return this.pseudoFlg;
	}
	public void setPseudoFlg(String value) {
		this.pseudoFlg = value;
	}
	public String getComboFlg() {
		return this.comboFlg;
	}
	public void setComboFlg(String value) {
		this.comboFlg = value;
	}
	public String getMeetingroomFlg() {
		return this.meetingroomFlg;
	}
	public void setMeetingroomFlg(String value) {
		this.meetingroomFlg = value;
	}
	public String getSuitFlg() {
		return this.suitFlg;
	}
	public void setSuitFlg(String value) {
		this.suitFlg = value;
	}
	public String getShareableFlg() {
		return this.shareableFlg;
	}
	public void setShareableFlg(String value) {
		this.shareableFlg = value;
	}
	public Integer getStayoverCredit() {
		return this.stayoverCredit;
	}
	public void setStayoverCredit(Integer value) {
		this.stayoverCredit = value;
	}
	public Integer getDepartureCredit() {
		return this.departureCredit;
	}
	public void setDepartureCredit(Integer value) {
		this.departureCredit = value;
	}
	public Integer getTouchupCredit() {
		return this.touchupCredit;
	}
	public void setTouchupCredit(Integer value) {
		this.touchupCredit = value;
	}
	public Integer getTurndownCredit() {
		return this.turndownCredit;
	}
	public void setTurndownCredit(Integer value) {
		this.turndownCredit = value;
	}
	public String getNote() {
		return this.note;
	}
	public void setNote(String value) {
		this.note = value;
	}
	public String getStatusFlg() {
		return this.statusFlg;
	}
	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}
	public String getRoomtypShortnm() {
		return this.roomtypShortnm;
	}
	public void setRoomtypShortnm(String value) {
		this.roomtypShortnm = value;
	}
	/**GrpHkUnitRoomtype对应的子DTO**/
	private SubDto grpHkUnitRoomtypeSubDto;
	/**
	 * 
	 * ## 方法说明：
	 * 	GrpHkUnitRoomtype对应的子DTO
	 * @return
	 */
	public SubDto getGrpHkUnitRoomtypeSubDto() {
		return grpHkUnitRoomtypeSubDto;
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	GrpHkUnitRoomtype对应的子DTO
	 * @param
	 */
	public void setGrpHkUnitRoomtypeSubDto(SubDto grpHkUnitRoomtypeSubDto) {
		this.grpHkUnitRoomtypeSubDto = grpHkUnitRoomtypeSubDto;
	}
	

	

}

