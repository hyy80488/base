/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 	报表展示DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016年12月27日]
 * @package com.jw.hms.cmm.m3104.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月27日|liubowen|新增|JasperReportResponseDto.java新增
 */
@DrptDto(dtonm = "JasperReportResponseDto", dtodrpt = "报表展示DTO")
public class JrResponseDto extends ResponseBaseDto implements java.io.Serializable {

	private static final long serialVersionUID = 704723294433128262L;

	@DrptField(fieldnm = "reportURL", fielddrpt = "生成报表的URL")
	private String reportURL;

	@DrptField(fieldnm = "reportName", fielddrpt = "报表名字")
	private String reportName;
	
	@DrptField(fieldnm = "reportMemo", fielddrpt = "报表备注描述")
	private String reportMemo;
	
	@DrptField(fieldnm = "exportType", fielddrpt = "报表导出类型")
	private String exportType;

	@DrptField(fieldnm = "data", fielddrpt = "报表查询条件")
	private List<Object> data;

	@DrptField(fieldnm = "chainUid", fielddrpt = "日志：报表生成人集团代码")
	private String chainUid;
	
	@DrptField(fieldnm = "unitUid", fielddrpt = "日志：报表生成人酒店代码")
	private String unitUid;
	
	@DrptField(fieldnm = "userUid", fielddrpt = "日志：报表生成人代码")
	private String userUid;
	
	@DrptField(fieldnm = "clientUid", fielddrpt = "日志：工作站代码")
	private String clientUid;
	
	@DrptField(fieldnm = "fromIp", fielddrpt = "日志：请求IP")
	private String fromIp;
	
	@DrptField(fieldnm = "reportpatternId", fielddrpt = "日志：报表明细代码")
	private Integer reportpatternId;
	
	@DrptField(fieldnm = "exportInfo", fielddrpt = "日志：导出信息")
	private String exportInfo;

	@DrptField(fieldnm = "createdBy", fielddrpt = "创建人")
	private java.lang.String createdBy;
	@DrptField(fieldnm = "createdDate", fielddrpt = "创建时间")
	private java.util.Date createdDate;
	@DrptField(fieldnm = "createdByUid", fielddrpt = "创建人ID")
	private String createdByUid;
	@DrptField(fieldnm = "createdByCd", fielddrpt = "创建人CODE")
	private String createdByCd;
	@DrptField(fieldnm = "createdUnitUid", fielddrpt = "创建人操作酒店编码")
	private String createdUnitUid;
	@DrptField(fieldnm = "createdUnitCd", fielddrpt = "创建人操作酒店Cd")
	private String createdUnitCd;
	@DrptField(fieldnm = "modifiedBy", fielddrpt = "更新人")
	private java.lang.String modifiedBy;
	@DrptField(fieldnm = "modifiedDate", fielddrpt = "更新时间")
	private java.util.Date modifiedDate;
	@DrptField(fieldnm = "modifiedByUid", fielddrpt = "更新人ID")
	private String modifiedByUid;
	@DrptField(fieldnm = "modifiedByCd", fielddrpt = "更新人CODE")
	private String modifiedByCd;
	@DrptField(fieldnm = "modifiedUnitUid", fielddrpt = "更新人操作酒店编码")
	private String modifiedUnitUid;
	@DrptField(fieldnm = "modifiedUnitCd", fielddrpt = "更新人操作酒店Cd")
	private String modifiedUnitCd;
	@DrptField(fieldnm = "dbName", fielddrpt = "日志数据源名称")
	private String dbName;

	public String getReportURL() {
		return reportURL;
	}

	public void setReportURL(String reportURL) {
		this.reportURL = reportURL;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getReportMemo() {
		return reportMemo;
	}

	public void setReportMemo(String reportMemo) {
		this.reportMemo = reportMemo;
	}

	public String getExportType() {
		return exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	public String getChainUid() {
		return chainUid;
	}

	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}

	public String getUnitUid() {
		return unitUid;
	}

	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

	public String getUserUid() {
		return userUid;
	}

	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}

	public String getClientUid() {
		return clientUid;
	}

	public void setClientUid(String clientUid) {
		this.clientUid = clientUid;
	}

	public String getFromIp() {
		return fromIp;
	}

	public void setFromIp(String fromIp) {
		this.fromIp = fromIp;
	}

	public Integer getReportpatternId() {
		return reportpatternId;
	}

	public void setReportpatternId(Integer reportpatternId) {
		this.reportpatternId = reportpatternId;
	}

	public String getExportInfo() {
		return exportInfo;
	}

	public void setExportInfo(String exportInfo) {
		this.exportInfo = exportInfo;
	}

	public java.lang.String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}

	public java.util.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedByUid() {
		return createdByUid;
	}

	public void setCreatedByUid(String createdByUid) {
		this.createdByUid = createdByUid;
	}

	public String getCreatedByCd() {
		return createdByCd;
	}

	public void setCreatedByCd(String createdByCd) {
		this.createdByCd = createdByCd;
	}

	public String getCreatedUnitUid() {
		return createdUnitUid;
	}

	public void setCreatedUnitUid(String createdUnitUid) {
		this.createdUnitUid = createdUnitUid;
	}

	public String getCreatedUnitCd() {
		return createdUnitCd;
	}

	public void setCreatedUnitCd(String createdUnitCd) {
		this.createdUnitCd = createdUnitCd;
	}

	public java.lang.String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(java.lang.String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public java.util.Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedByUid() {
		return modifiedByUid;
	}

	public void setModifiedByUid(String modifiedByUid) {
		this.modifiedByUid = modifiedByUid;
	}

	public String getModifiedByCd() {
		return modifiedByCd;
	}

	public void setModifiedByCd(String modifiedByCd) {
		this.modifiedByCd = modifiedByCd;
	}

	public String getModifiedUnitUid() {
		return modifiedUnitUid;
	}

	public void setModifiedUnitUid(String modifiedUnitUid) {
		this.modifiedUnitUid = modifiedUnitUid;
	}

	public String getModifiedUnitCd() {
		return modifiedUnitCd;
	}

	public void setModifiedUnitCd(String modifiedUnitCd) {
		this.modifiedUnitCd = modifiedUnitCd;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

}
