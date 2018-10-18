
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
 * ## 类说明：com.jw.common.framework.m1410.f010.dto
 * 	GrpCmmEmployeeQUERY信息数据传输对象
 * @author    [xuxiufang]   
 * @version   [V1.0, 2017-02-17]
 * @package com.jw.hms.group.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-17|xuxiufang|新增|GrpCmmEmployeeQueryDto新增
 */
@DrptDto(dtonm = "GrpCmmEmployeeQueryDto", dtodrpt = "GrpCmmEmployeeQUERY信息数据传输对象")
public class GrpCmmEmployeeQueryDto extends RequestBaseDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -8716429217873128655L;
	@DrptField(fieldnm = "orderColumn", fielddrpt = "排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm = "pageStart", fielddrpt = "当前页")
	private String pageStart;
	@DrptField(fieldnm = "pageLength", fielddrpt = "每页记录数量")
	private String pageLength;

	@DrptField(fieldnm = "currentPage", fielddrpt = "当前页")
	private Integer currentPage;
	@DrptField(fieldnm = "pageSize", fielddrpt = "每页记录数量")
	private Integer pageSize;
	
	@DrptField(fieldnm = "paramTyp", fielddrpt = "参数类型")
	private String paramTyp;
	@DrptField(fieldnm = "paramTypList", fielddrpt = "参数类型")
	private List<String> paramTypList;
	

	@DrptField(fieldnm = "id", fielddrpt = "id")
	private java.lang.Integer id;
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码")
	private String chainUid;
	@DrptField(fieldnm = "unitUid", fielddrpt = "单位代码")
	private String unitUid;
	@DrptField(fieldnm = "deptId", fielddrpt = "部门代码")
	private java.lang.Integer deptId;
	@DrptField(fieldnm = "profileNo", fielddrpt = "客史编号")
	private String profileNo;
	@DrptField(fieldnm = "employeeId", fielddrpt = "员工编号")
	private java.lang.Integer employeeId;
	@DrptField(fieldnm = "employeeIds", fielddrpt = "员工id集合")
	private List<Integer> employeeIds;
	@DrptField(fieldnm = "employeeCd", fielddrpt = "员工工号")
	private String employeeCd;
	@DrptField(fieldnm = "employeeNm", fielddrpt = "员工姓名")
	private String employeeNm;
	@DrptField(fieldnm = "employeeAltnm", fielddrpt = "员工中文名")
	private String employeeAltnm;
	@DrptField(fieldnm = "employeeTyp", fielddrpt = "聘用类型")
	private String employeeTyp;
	@DrptField(fieldnm = "employeeWorktitleId", fielddrpt = "职位")
	private java.lang.Integer employeeWorktitleId;
	@DrptField(fieldnm = "employeePositionId", fielddrpt = "职位")
	private java.lang.Integer employeePositionId;
	@DrptField(fieldnm = "userUid", fielddrpt = "操作员代码")
	private String userUid;
	@DrptField(fieldnm = "onjobFlg", fielddrpt = "在职标志")
	private String onjobFlg;
	@DrptField(fieldnm = "statusFlg", fielddrpt = "有效标志")
	private String statusFlg;
	@DrptField(fieldnm = "seq", fielddrpt = "序号")
	private java.lang.Integer seq;

	@DrptField(fieldnm = "fastquery", fielddrpt = "快速查询", nullable = "true", length = "100")
	private String fastquery;

	@DrptField(fieldnm = "ids", fielddrpt = "参数ID集合")
	private List<Integer> ids;

	@DrptField(fieldnm = "languageId", fielddrpt = "多语种ID")
	private Integer languageId;

	public List<String> getParamTypList() {
		return paramTypList;
	}

	public void setParamTypList(List<String> paramTypList) {
		this.paramTypList = paramTypList;
	}

	public String getParamTyp() {
		return paramTyp;
	}

	public void setParamTyp(String paramTyp) {
		this.paramTyp = paramTyp;
	}

	public List<Integer> getEmployeeIds() {
		return employeeIds;
	}

	public void setEmployeeIds(List<Integer> employeeIds) {
		this.employeeIds = employeeIds;
	}

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

	public java.lang.Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(java.lang.Integer value) {
		this.deptId = value;
	}

	public String getProfileNo() {
		return this.profileNo;
	}

	public void setProfileNo(String value) {
		this.profileNo = value;
	}

	public java.lang.Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(java.lang.Integer value) {
		this.employeeId = value;
	}

	public String getEmployeeCd() {
		return this.employeeCd;
	}

	public void setEmployeeCd(String value) {
		this.employeeCd = value;
	}

	public String getEmployeeNm() {
		return this.employeeNm;
	}

	public void setEmployeeNm(String value) {
		this.employeeNm = value;
	}

	public String getEmployeeAltnm() {
		return this.employeeAltnm;
	}

	public void setEmployeeAltnm(String value) {
		this.employeeAltnm = value;
	}

	public String getEmployeeTyp() {
		return this.employeeTyp;
	}

	public void setEmployeeTyp(String value) {
		this.employeeTyp = value;
	}

	public java.lang.Integer getEmployeeWorktitleId() {
		return this.employeeWorktitleId;
	}

	public void setEmployeeWorktitleId(java.lang.Integer value) {
		this.employeeWorktitleId = value;
	}

	public java.lang.Integer getEmployeePositionId() {
		return this.employeePositionId;
	}

	public void setEmployeePositionId(java.lang.Integer value) {
		this.employeePositionId = value;
	}

	public String getUserUid() {
		return this.userUid;
	}

	public void setUserUid(String value) {
		this.userUid = value;
	}

	public String getOnjobFlg() {
		return this.onjobFlg;
	}

	public void setOnjobFlg(String value) {
		this.onjobFlg = value;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
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
}
