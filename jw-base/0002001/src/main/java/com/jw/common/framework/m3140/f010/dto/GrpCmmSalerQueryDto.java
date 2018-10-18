
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	GrpCmmSalerQUERY信息数据传输对象
 * @author    [xuxiufang]   
 * @version   [V1.0, 2017-02-17]
 * @package com.jw.hms.group.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-17|xuxiufang|新增|GrpCmmSalerQueryDto新增
 */
@DrptDto(dtonm = "GrpCmmSalerQueryDto", dtodrpt = "GrpCmmSalerQUERY信息数据传输对象")
public class GrpCmmSalerQueryDto extends RequestBaseDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 2462841977172916955L;
	@DrptField(fieldnm = "orderColumn ", fielddrpt = "排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm = "currentPage", fielddrpt = "当前页")
	private Integer currentPage;
	@DrptField(fieldnm = "pageSize", fielddrpt = "每页记录数量")
	private Integer pageSize;

	@DrptField(fieldnm = "id", fielddrpt = "id")
	private java.lang.Integer id;
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码")
	private String chainUid;
	@DrptField(fieldnm = "unitUid", fielddrpt = "单位代码")
	private String unitUid;
	@DrptField(fieldnm = "employeeId", fielddrpt = "员工代码")
	private java.lang.Integer employeeId;
	@DrptField(fieldnm = "employeeNm", fielddrpt = "员工姓名")
	private String employeeNm;
	@DrptField(fieldnm = "salerId", fielddrpt = "销售员编号")
	private java.lang.Integer salerId;
	@DrptField(fieldnm = "statusFlg", fielddrpt = "有效标志")
	private String statusFlg;
	@DrptField(fieldnm = "seq", fielddrpt = "序号")
	private java.lang.Integer seq;
	@DrptField(fieldnm = "salergrpId", fielddrpt = "销售员分组")
	private java.lang.Integer salergrpId;
	@DrptField(fieldnm = "managerFlg", fielddrpt = "是否经理")
	private String managerFlg;
	@DrptField(fieldnm = "checkgrpsId", fielddrpt = "可以查看的组")
	private java.lang.Integer checkgrpsId;
	@DrptField(fieldnm = "checksalersId", fielddrpt = "可以查看的销售员")
	private java.lang.Integer checksalersId;
	@DrptField(fieldnm = "salergrp2Id", fielddrpt = "salergrp2Id")
	private java.lang.Integer salergrp2Id;
	@DrptField(fieldnm = "checkgrps2Id", fielddrpt = "checkgrps2Id")
	private java.lang.Integer checkgrps2Id;

	@DrptField(fieldnm = "salerIds", fielddrpt = "销售员编号集合")
	private List<Integer> salerIds;

	@DrptField(fieldnm = "fastquery", fielddrpt = "快速查询")
	private String fastquery;

	@DrptField(fieldnm = "ids", fielddrpt = "参数ID集合")
	private List<Integer> ids;

	@DrptField(fieldnm = "languageId", fielddrpt = "语种ID")
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

	public String getFastquery() {
		return fastquery;
	}

	public void setFastquery(String fastquery) {
		this.fastquery = fastquery;
	}

	public List<Integer> getSalerIds() {
		return salerIds;
	}

	public void setSalerIds(List<Integer> salerIds) {
		this.salerIds = salerIds;
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

	public java.lang.Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(java.lang.Integer value) {
		this.employeeId = value;
	}

	public java.lang.Integer getSalerId() {
		return this.salerId;
	}

	public void setSalerId(java.lang.Integer value) {
		this.salerId = value;
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

	public java.lang.Integer getSalergrpId() {
		return this.salergrpId;
	}

	public void setSalergrpId(java.lang.Integer value) {
		this.salergrpId = value;
	}

	public String getManagerFlg() {
		return this.managerFlg;
	}

	public void setManagerFlg(String value) {
		this.managerFlg = value;
	}

	public java.lang.Integer getCheckgrpsId() {
		return this.checkgrpsId;
	}

	public void setCheckgrpsId(java.lang.Integer value) {
		this.checkgrpsId = value;
	}

	public java.lang.Integer getChecksalersId() {
		return this.checksalersId;
	}

	public void setChecksalersId(java.lang.Integer value) {
		this.checksalersId = value;
	}

	public java.lang.Integer getSalergrp2Id() {
		return this.salergrp2Id;
	}

	public void setSalergrp2Id(java.lang.Integer value) {
		this.salergrp2Id = value;
	}

	public java.lang.Integer getCheckgrps2Id() {
		return this.checkgrps2Id;
	}

	public void setCheckgrps2Id(java.lang.Integer value) {
		this.checkgrps2Id = value;
	}

	public List<CodeBean> getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(List<CodeBean> orderColumn) {
		this.orderColumn = orderColumn;
	}

	public String getEmployeeNm() {
		return employeeNm;
	}

	public void setEmployeeNm(String employeeNm) {
		this.employeeNm = employeeNm;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
