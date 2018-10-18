package com.jw.common.framework.m0002.f001.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

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
@DrptDto(dtonm = "JrQueryDto", dtodrpt = "动态生成报表数据传输对象")
public class JrReportQueryDto extends RequestBaseDto implements java.io.Serializable {

	private static final long serialVersionUID = 1728224518047769769L;

	@DrptField(fieldnm = "reportId", fielddrpt = "报表Id，非前端给值")
	private Integer reportId;
	@DrptField(fieldnm = "pageReportId", fielddrpt = "页面传入报表ID")
	private Integer pageReportId;

	@DrptField(fieldnm = "reportFileId", fielddrpt = "报表FileId")
	private Integer reportFileId;

	@DrptField(fieldnm = "reportpatternId", fielddrpt = "报表版式")
	private Integer reportpatternId;

	@DrptField(fieldnm = "languageId", fielddrpt = "语种")
	private Integer languageId;

	@DrptField(fieldnm = "exportType", fielddrpt = "报表导出类型")
	private String exportType;

	@DrptField(fieldnm = "billType", fielddrpt = "单据类型")
	private String billType;

	@DrptField(fieldnm = "funcTyp", fielddrpt = "入账方式")
	private String funcTyp;

	/***************会员账单报表用start********************/
	@DrptField(fieldnm = "consumeId", fielddrpt = "消费记录ID")
	private Integer consumeId;

	public Integer getConsumeId() {
		return consumeId;
	}

	public void setConsumeId(Integer consumeId) {
		this.consumeId = consumeId;
	}

	/***************会员账单报表用end********************/
	/**
	 * datascparacode：字段名
	 * lstscondId:报表条件ID（字段ID）
	 * datatyp:字段类型
	 * paramVlu:字段值（可以是集合）
	 */
	@DrptField(fieldnm = "queryMap", fielddrpt = "报表查询条件属性及值集合")
	private List<Map<String, Object>> queryMap;

	@DrptField(fieldnm = "customizeFlg", fielddrpt = "报表类型 0标准，1自定义")
	private String customizeFlg;

	@DrptField(fieldnm = "systemMap", fielddrpt = "系统参数")
	private Map<String, Object> systemMap;

	@DrptField(fieldnm = "reqHeadMap", fielddrpt = "请求头")
	private Map<String, String> reqHeadMap;

	@DrptField(fieldnm = "parameters", fielddrpt = "报表参数")
	private Map<String, Object> parameters;

	@DrptField(fieldnm = "outType", fielddrpt = "输出类型")
	private String outType;
	/**1、导出   2打印**/
	@DrptField(fieldnm = "reportTyp", fielddrpt = "报表类型")
	private String reportTyp;

	/**
	 * key:字段ID vlu:父参数集合
	 */
	@DrptField(fieldnm = "cascaParam", fielddrpt = "级联使用")
	private Map<String, List<Map<String, Object>>> cascaParam;

	@DrptField(fieldnm = "reportInfoMap", fielddrpt = "报表基本信息")
	private Map<String, Object> reportInfoMap;

	@DrptField(fieldnm = "otherMap", fielddrpt = "其他条件")
	private Map<String, Object> otherMap;
	@DrptField(fieldnm = "pierceParamMap", fielddrpt = "穿透参数")
	private Map<String, Object> pierceParamMap;

	/***************上传下载用start********************/
	@DrptField(fieldnm = "filePath", fielddrpt = "上传报表路径信息")
	private List<Map<String, Object>> filePath;

	@DrptField(fieldnm = "fastQuery", fielddrpt = "报表查询条件")
	private String fastQuery;

	@DrptField(fieldnm = "reportData", fielddrpt = "报表文件base64字符串")
	private String reportData;

	/***************上传下载用end********************/

	@DrptField(fieldnm = "showVlus", fielddrpt = "需要查询字段集合")
	private Set<String> showVlus;

	public Set<String> getShowVlus() {
		if (CollectionUtils.isEmpty(showVlus)) {
			showVlus = new HashSet<>();
		}
		return showVlus;
	}

	public void setShowVlus(Set<String> showVlus) {
		this.showVlus = showVlus;
	}

	public Map<String, Object> getPierceParamMap() {
		return pierceParamMap;
	}

	public void setPierceParamMap(Map<String, Object> pierceParamMap) {
		this.pierceParamMap = pierceParamMap;
	}

	public String getReportTyp() {
		return reportTyp;
	}

	public void setReportTyp(String reportTyp) {
		this.reportTyp = reportTyp;
	}

	public Map<String, Object> getReportInfoMap() {
		return reportInfoMap;
	}

	public void setReportInfoMap(Map<String, Object> reportInfoMap) {
		this.reportInfoMap = reportInfoMap;
	}

	public Map<String, Object> getOtherMap() {
		return otherMap;
	}

	public void setOtherMap(Map<String, Object> otherMap) {
		this.otherMap = otherMap;
	}

	public Map<String, List<Map<String, Object>>> getCascaParam() {
		return cascaParam;
	}

	public void setCascaParam(Map<String, List<Map<String, Object>>> cascaParam) {
		this.cascaParam = cascaParam;
	}

	public String getOutType() {
		return outType;
	}

	public void setOutType(String outType) {
		this.outType = outType;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	public Map<String, String> getReqHeadMap() {
		return reqHeadMap;
	}

	public void setReqHeadMap(Map<String, String> reqHeadMap) {
		this.reqHeadMap = reqHeadMap;
	}

	public Integer getReportId() {
		return reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}

	public Integer getReportFileId() {
		return reportFileId;
	}

	public void setReportFileId(Integer reportFileId) {
		this.reportFileId = reportFileId;
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

	public String getExportType() {
		return exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getFuncTyp() {
		return funcTyp;
	}

	public void setFuncTyp(String funcTyp) {
		this.funcTyp = funcTyp;
	}

	public List<Map<String, Object>> getQueryMap() {
		return queryMap;
	}

	public void setQueryMap(List<Map<String, Object>> queryMap) {
		this.queryMap = queryMap;
	}

	public Map<String, Object> getSystemMap() {
		return systemMap;
	}

	public void setSystemMap(Map<String, Object> systemMap) {
		this.systemMap = systemMap;
	}

	public String getCustomizeFlg() {
		return customizeFlg;
	}

	public void setCustomizeFlg(String customizeFlg) {
		this.customizeFlg = customizeFlg;
	}

	public Integer getPageReportId() {
		return pageReportId;
	}

	public void setPageReportId(Integer pageReportId) {
		this.pageReportId = pageReportId;
	}

	public List<Map<String, Object>> getFilePath() {
		return filePath;
	}

	public void setFilePath(List<Map<String, Object>> filePath) {
		this.filePath = filePath;
	}

	public String getFastQuery() {
		return fastQuery;
	}

	public void setFastQuery(String fastQuery) {
		this.fastQuery = fastQuery;
	}

	public String getReportData() {
		return reportData;
	}

	public void setReportData(String reportData) {
		this.reportData = reportData;
	}
}
