
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
 * 	CmmPosParamQUERY信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|jianana|新增|CmmPosParamQueryDto新增
 */
@DrptDto(dtonm = "CmmPosParamQUERY信息数据传输对象",dtodrpt="CmmPosParamQUERY信息数据传输对象")
public class CmmPosParamQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 771941694220664185L;
	@DrptField(fieldnm="排序 ",fielddrpt="排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	private String pageStart;
	private String pageLength;
	
	@DrptField(fieldnm="ID字段",fielddrpt="ID字段")
	private Integer id;
	@DrptField(fieldnm="chainUid",fielddrpt="chainUid")
	private String chainUid;
	@DrptField(fieldnm="unitUid",fielddrpt="unitUid")
	private String unitUid;
	@DrptField(fieldnm="销售点编号",fielddrpt="销售点编号")
	private Integer salesId;
	@DrptField(fieldnm="paramTyp",fielddrpt="paramTyp")
	private String paramTyp;
	@DrptField(fieldnm="paramId",fielddrpt="paramId")
	private Integer paramId;
	@DrptField(fieldnm="paramIds",fielddrpt="paramIds")
	private List<Integer> paramIds;
	@DrptField(fieldnm="有权限酒店可自定定义",fielddrpt="有权限酒店可自定定义")
	private String paramDrpt;
	@DrptField(fieldnm="1：有效（默认） 0：无效",fielddrpt="1：有效（默认） 0：无效")
	private String statusFlg;
	@DrptField(fieldnm="酒店可自定定义",fielddrpt="酒店可自定定义")
	private Integer seq;
	@DrptField(fieldnm="酒店可自定定义",fielddrpt="酒店可自定定义")
	private String note;
	@DrptField(fieldnm="模糊查询条件（代码或名称或别名模糊查询） ",fielddrpt="模糊查询条件（代码或名称或别名模糊查询）")
	private String filter;
	@DrptField(fieldnm="paramgrpIds",fielddrpt="paramgrpIds")
	private List<Integer> paramgrpIds;
	
	/*
	 * 日期|作者|类型|内容
	 * :----|:-----|:-----|:-----
	 * 2017-06-22|linan|新增|增加cmm_base_param联查字段
	 */
	@DrptField(fieldnm="参数属性",fielddrpt="参数属性")
	private String paramFlg;
	
	public String getParamFlg() {
		return this.paramFlg;
	}
	
	public void setParamFlg(String value) {
		this.paramFlg = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
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
	public java.lang.Integer getSalesId() {
		return this.salesId;
	}
	
	public void setSalesId(java.lang.Integer value) {
		this.salesId = value;
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
	
	public List<Integer> getParamIds() {
		return this.paramIds;
	}
	
	public void setParamIds(List<Integer> paramIds) {
		this.paramIds = paramIds;
	}
	
	public String getParamDrpt() {
		return this.paramDrpt;
	}
	
	public void setParamDrpt(String value) {
		this.paramDrpt = value;
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
	
	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public List<Integer> getParamgrpIds() {
		return paramgrpIds;
	}

	public void setParamgrpIds(List<Integer> paramgrpIds) {
		this.paramgrpIds = paramgrpIds;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

