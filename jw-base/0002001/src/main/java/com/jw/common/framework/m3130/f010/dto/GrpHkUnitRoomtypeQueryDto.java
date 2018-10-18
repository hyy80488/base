
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmAttribute;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	房型配置QUERY信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-03-21]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-03-21|jianana|新增|GrpHkUnitRoomtypeQueryDto新增
 */
@DrptDto(dtonm = "房型配置QUERY信息数据传输对象", dtodrpt = "房型配置QUERY信息数据传输对象")
public class GrpHkUnitRoomtypeQueryDto extends RequestBaseDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -40259775681746362L;
	// 例如：{字段1,升序},{字段2,降序}
	@DrptField(fieldnm = "orderColumn", fielddrpt = "排序字段")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm = "currentPage", fielddrpt = "当前页")
	private Integer currentPage;
	@DrptField(fieldnm = "pageSize", fielddrpt = "每页记录数量")
	private Integer pageSize;
	@DrptField(fieldnm = "ids", fielddrpt = "ID in查询", nullable = "true")
	private List<Integer> ids;
	@DrptField(fieldnm = "rateId", fielddrpt = "价格id")
	private Integer rateId;

	public Integer getRateId() {
		return rateId;
	}

	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}

	/** 多语种ID */
	@DrptField(fieldnm = "languageId", fielddrpt = "语种", paramtype = ConstantParm.ENUM_PARA_TYPE.COMMON_PARA, paramsubtype = ConstantParm.LANGUAGE)
	private Integer languageId;

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	@DrptField(fieldnm = "id", fielddrpt = "ID ID字段", nullable = "false", length = "10")
	private Integer id;
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码 ", nullable = "false", length = "40")
	private String chainUid;
	@DrptField(fieldnm = "unitUid", fielddrpt = "单位代码 ", nullable = "false", length = "40")
	private String unitUid;
	@DrptField(fieldnm = "roomtypId", fielddrpt = "房型代码 ", nullable = "false", length = "10")
	private Integer roomtypId;
	@DrptField(fieldnm = "roomtypIds", fielddrpt = "房型代码集合 ", nullable = "false")
	private List<Integer> roomtypIds;
	// 0：物理房型，1：销售房型
	@DrptField(fieldnm = "roomtypFlg", fielddrpt = "房型属性 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_ROOMTYP_FLG, nullable = "true", length = "3")
	private List<String> roomtypFlg;
	@DrptField(fieldnm = "roomtypCd", fielddrpt = "房型编码 ", nullable = "false", length = "20")
	private String roomtypCd;
	@DrptField(fieldnm = "roomtypNm", fielddrpt = "房型名称 ", nullable = "false", length = "200")
	private String roomtypNm;
	@DrptField(fieldnm = "roomtypgrpId", fielddrpt = "房型组代码 ", paramtype = ConstantParm.ENUM_PARA_TYPE.CHAIN_UNIT_PARA, paramsubtype = ConstantParm.ROOMTYPGRP, nullable = "true", length = "10")
	private Integer roomtypgrpId;
	@DrptField(fieldnm = "seq", fielddrpt = "序号 ", nullable = "true", length = "10")
	private Integer seq;
	@DrptField(fieldnm = "roomNums", fielddrpt = "房间数量 ", nullable = "true", length = "10")
	private Integer roomNums;
	@DrptField(fieldnm = "occupancyMax", fielddrpt = "最大入住人数 ", nullable = "false", length = "10")
	private Integer occupancyMax;
	@DrptField(fieldnm = "occupancyStd", fielddrpt = "标准入住人数 ", nullable = "false", length = "10")
	private Integer occupancyStd;
	@DrptField(fieldnm = "occupancyAdultMax", fielddrpt = "最大成人数 ", nullable = "true", length = "10")
	private Integer occupancyAdultMax;
	@DrptField(fieldnm = "occupancyChildMax", fielddrpt = "最大儿童数 ", nullable = "true", length = "10")
	private Integer occupancyChildMax;
	@DrptField(fieldnm = "occupancyNobedMax", fielddrpt = "不加床最大人数 ", nullable = "true", length = "10")
	private Integer occupancyNobedMax;
	@DrptField(fieldnm = "bedtypId", fielddrpt = "床型 ", paramtype = ConstantParm.ENUM_PARA_TYPE.CHAIN_UNIT_PARA, paramsubtype = ConstantParm.BEDTYP, nullable = "false", length = "10")
	private Integer bedtypId;
	// 0：真房（默认） 1：假房
	@DrptField(fieldnm = "pseudoFlg", fielddrpt = "假房标志", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_PSEUDO_FLG, nullable = "false", length = "3")
	private String pseudoFlg;
	// 0：非组合房（默认） 1：组合房
	@DrptField(fieldnm = "comboFlg", fielddrpt = "组合房标志", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_COMBO_FLG, nullable = "false", length = "3")
	private String comboFlg;
	// 0：非会议室（默认） 1：会议室
	@DrptField(fieldnm = "meetingroomFlg", fielddrpt = "会议室标志 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_MEETINGROOM_FLG, nullable = "false", length = "3")
	private String meetingroomFlg;
	// 0：非套房（默认），1：套房
	@DrptField(fieldnm = "suitFlg", fielddrpt = "套房标识 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_SUIT_FLG, nullable = "false", length = "3")
	private String suitFlg;
	// 0普通房，1连通房
	@DrptField(fieldnm = "shareableFlg", fielddrpt = "连通房标识 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_SHAREABLE_FLG, nullable = "false", length = "3")
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
	@DrptField(fieldnm = "statusFlg", fielddrpt = "有效无效 ", paramtype = ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype = ConstantParmAttribute.GRP_HK_UNIT_ROOMTYPE_STATUS_FLG, nullable = "true", length = "3")
	private String statusFlg;
	@DrptField(fieldnm = "fastSearch", fielddrpt = "快速查找条件 ", nullable = "true", length = "500")
	private String fastSearch;
	// 用来获取假房
	@DrptField(fieldnm = "pseudoFlgs", fielddrpt = "假房标志集合", nullable = "false", length = "3")
	private List<String> pseudoFlgs;
	@DrptField(fieldnm = "useFlgs", fielddrpt = "导入、自用标识", nullable = "false", length = "3")
	private List<String> useFlgs;
	@DrptField(fieldnm = "flg", fielddrpt = "管理标识  可用1 不可用0 全部空或不传此参数   空值传2（酒店查询的时候有空值条件）", nullable = "false", length = "3")
	private String flg;
	@DrptField(fieldnm = "use_flg", fielddrpt = "", nullable = "false", length = "3")
	private String use_flg;
	@DrptField(fieldnm = "fastquery", fielddrpt = "", nullable = "false", length = "3")
	private String fastquery;
	@DrptField(fieldnm = "status_flg", fielddrpt = "", nullable = "false", length = "3")
	private String status_flg;
	@DrptField(fieldnm = "containParamId", fielddrpt = "需要包含的id")
	private List<Integer> containParamId;
	@DrptField(fieldnm = "dicFlg", fielddrpt = " 获取的字典数据标记")
	private Boolean dicFlg = true;
	@DrptField(fieldnm = "ctrlFlg", fielddrpt = "管控属性")
	private String ctrlFlg;
	
	public String getFastquery() {
		return fastquery;
	}

	public void setFastquery(String fastquery) {
		this.fastquery = fastquery;
	}

	public String getStatus_flg() {
		return status_flg;
	}

	public void setStatus_flg(String status_flg) {
		this.status_flg = status_flg;
	}

	public String getUse_flg() {
		return use_flg;
	}

	public void setUse_flg(String use_flg) {
		this.use_flg = use_flg;
	}

	public String getFlg() {
		return flg;
	}

	public void setFlg(String flg) {
		this.flg = flg;
	}

	public List<String> getUseFlgs() {
		return useFlgs;
	}

	public void setUseFlgs(List<String> useFlgs) {
		this.useFlgs = useFlgs;
	}

	public List<String> getPseudoFlgs() {
		return pseudoFlgs;
	}

	public void setPseudoFlgs(List<String> pseudoFlgs) {
		this.pseudoFlgs = pseudoFlgs;
	}

	public String getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}

	public String getFastSearch() {
		return fastSearch;
	}

	public void setFastSearch(String fastSearch) {
		this.fastSearch = fastSearch;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer value) {
		this.id = value;
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

	public List<String> getRoomtypFlg() {
		return this.roomtypFlg;
	}

	public void setRoomtypFlg(List<String> value) {
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

	public List<CodeBean> getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(List<CodeBean> orderColumn) {
		this.orderColumn = orderColumn;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Integer> getRoomtypIds() {
		return roomtypIds;
	}

	public void setRoomtypIds(List<Integer> roomtypIds) {
		this.roomtypIds = roomtypIds;
	}

	public List<Integer> getContainParamId() {
		return containParamId;
	}

	public void setContainParamId(List<Integer> containParamId) {
		this.containParamId = containParamId;
	}

	public Boolean getDicFlg() {
		return dicFlg;
	}

	public void setDicFlg(Boolean dicFlg) {
		this.dicFlg = dicFlg;
	}
	
	public String getCtrlFlg() {
		return ctrlFlg;
	}

	public void setCtrlFlg(String ctrlFlg) {
		this.ctrlFlg = ctrlFlg;
	}
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
