package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	动态生成报表数据传输对象
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.hms.cmm.m3104.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|JrQueryDto.java新增
 */
@DrptDto(dtonm = "ReportQueryDto", dtodrpt = "动态生成报表数据传输对象")
public class ReportQueryDto extends RequestBaseDto implements java.io.Serializable {

	private static final long serialVersionUID = 1728224518047769769L;

	@DrptField(fieldnm = "reportId", fielddrpt = "报表ID")
	private Integer reportId;

	@DrptField(fieldnm = "reportpatternId", fielddrpt = "报表版式")
	private Integer reportpatternId;

	@DrptField(fieldnm = "languageId", fielddrpt = "语种")
	private Integer languageId;
	@DrptField(fieldnm = "exportType", fielddrpt = "报表导出类型")
	private String exportType;

	@DrptField(fieldnm = "billType", fielddrpt = "单据类型")
	private String billType;

	/**
	 * datascparacode：字段名
	 * lstscondId:报表条件ID（字段ID）
	 * datatyp:字段类型
	 * paramVlu:字段值（可以是集合）
	 */
	@DrptField(fieldnm = "queryMap", fielddrpt = "报表查询条件属性及值集合")
	private List<Map<String, Object>> queryMap;
	/**
	 * key:字段ID vlu:父参数集合
	 */
	@DrptField(fieldnm = "cascaParam", fielddrpt = "级联使用")
	private Map<String, List<Map<String, Object>>> cascaParam;

	@DrptField(fieldnm = "fixedParamMap", fielddrpt = "固定参数")
	private Map<String, Object> fixedParamMap;
	
	@DrptField(fieldnm = "pierceParamMap", fielddrpt = "穿透参数")
	private Map<String, Object> pierceParamMap;

	
	
	public Map<String, Object> getPierceParamMap() {
		return pierceParamMap;
	}

	public void setPierceParamMap(Map<String, Object> pierceParamMap) {
		this.pierceParamMap = pierceParamMap;
	}

	public Map<String, Object> getFixedParamMap() {
		return fixedParamMap;
	}

	public void setFixedParamMap(Map<String, Object> fixedParamMap) {
		this.fixedParamMap = fixedParamMap;
	}

	public String getExportType() {
		return exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
	}

	public Map<String, List<Map<String, Object>>> getCascaParam() {
		return cascaParam;
	}

	public void setCascaParam(Map<String, List<Map<String, Object>>> cascaParam) {
		this.cascaParam = cascaParam;
	}

	public Integer getReportId() {
		return reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}

	public Integer getReportpatternId() {
		return reportpatternId;
	}

	public void setReportpatternId(Integer reportpatternId) {
		this.reportpatternId = reportpatternId;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public List<Map<String, Object>> getQueryMap() {
		return queryMap;
	}

	public void setQueryMap(List<Map<String, Object>> queryMap) {
		this.queryMap = queryMap;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

}
