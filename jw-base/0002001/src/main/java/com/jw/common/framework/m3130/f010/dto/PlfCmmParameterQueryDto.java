
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	PlfCmmParameterQUERY信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-09]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-09|jianana|新增|PlfCmmParameterQueryDto新增
 */
@DrptDto(dtonm = "PlfCmmParameterQUERY信息数据传输对象", dtodrpt = "PlfCmmParameterQUERY信息数据传输对象")
public class PlfCmmParameterQueryDto extends RequestBaseDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -4903888514689805774L;
	@DrptField(fieldnm = "orderColumn", fielddrpt = "排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	private String pageStart;
	private String pageLength;

	@DrptField(fieldnm = "id", fielddrpt = "ID字段")
	private java.lang.Integer id;

	@DrptField(fieldnm = "paramTyp", fielddrpt = "参数类型")
	private String paramTyp;

	@DrptField(fieldnm = "paramId", fielddrpt = "参数ID")
	private java.lang.Integer paramId;

	@DrptField(fieldnm = "paramCd", fielddrpt = "参数代码")
	private String paramCd;

	@DrptField(fieldnm = "paramDrpt", fielddrpt = "参数名称")
	private String paramDrpt;

	@DrptField(fieldnm = "paramGrp", fielddrpt = "参数分组")
	private String paramGrp;

	@DrptField(fieldnm = "paramSubgrp", fielddrpt = "参数子分组")
	private String paramSubgrp;

	@DrptField(fieldnm = "paramFlg", fielddrpt = "参数属性")
	private String paramFlg;

	@DrptField(fieldnm = "statusFlg", fielddrpt = "状态标识")
	private String statusFlg;

	@DrptField(fieldnm = "seq", fielddrpt = "序号")
	private java.lang.Integer seq;

	@DrptField(fieldnm = "note", fielddrpt = "注释")
	private String note;

	@DrptField(fieldnm = "paramVer", fielddrpt = "修改版本")
	private java.lang.Integer paramVer;

	@DrptField(fieldnm = "unitUid", fielddrpt = "unitUid", nullable = "true", length = "40")
	private String unitUid;

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer value) {
		this.id = value;
	}

	public String getParamTyp() {
		return this.paramTyp;
	}

	public void setParamTyp(String value) {
		this.paramTyp = value;
	}

	public java.lang.Integer getParamId() {
		return this.paramId;
	}

	public void setParamId(java.lang.Integer value) {
		this.paramId = value;
	}

	public String getParamCd() {
		return this.paramCd;
	}

	public void setParamCd(String value) {
		this.paramCd = value;
	}

	public String getParamDrpt() {
		return this.paramDrpt;
	}

	public void setParamDrpt(String value) {
		this.paramDrpt = value;
	}

	public String getParamGrp() {
		return this.paramGrp;
	}

	public void setParamGrp(String value) {
		this.paramGrp = value;
	}

	public String getParamSubgrp() {
		return this.paramSubgrp;
	}

	public void setParamSubgrp(String value) {
		this.paramSubgrp = value;
	}

	public String getParamFlg() {
		return this.paramFlg;
	}

	public void setParamFlg(String value) {
		this.paramFlg = value;
	}

	public String getStatusFlg() {
		return this.statusFlg;
	}

	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}

	public java.lang.Integer getSeq() {
		return this.seq;
	}

	public void setSeq(java.lang.Integer value) {
		this.seq = value;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String value) {
		this.note = value;
	}

	public java.lang.Integer getParamVer() {
		return this.paramVer;
	}

	public void setParamVer(java.lang.Integer value) {
		this.paramVer = value;
	}

	public String getUnitUid() {
		return this.unitUid;
	}

	public void setUnitUid(String value) {
		this.unitUid = value;
	}

	public List<CodeBean> getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(List<CodeBean> orderColumn) {
		this.orderColumn = orderColumn;
	}

	public String getPageStart() {
		return pageStart;
	}

	public void setPageStart(String pageStart) {
		this.pageStart = pageStart;
	}

	public String getPageLength() {
		return pageLength;
	}

	public void setPageLength(String pageLength) {
		this.pageLength = pageLength;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
