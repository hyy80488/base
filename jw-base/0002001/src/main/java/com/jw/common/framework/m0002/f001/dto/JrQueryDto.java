package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
@DrptDto(dtonm = "JrQueryParamDto",dtodrpt="动态生成报表数据传输对象")
public class JrQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	private static final long serialVersionUID = 1728224518047769769L;

	/**
	 * datascparacode：字段名
	 * lstscondId:报表条件ID（字段ID）
	 * datatyp:字段类型
	 * paramVlu:字段值（可以是集合）
	 */
	@DrptField(fieldnm="queryMap",fielddrpt="报表查询条件属性及值集合")
	private List<Map<String, Object>> queryMap;
	
	@DrptField(fieldnm="reportInfoMap",fielddrpt="报表基本信息")
	private Map<String, Object> reportInfoMap;
	
	@DrptField(fieldnm = "showVlus", fielddrpt = "需要查询字段集合")
	private Set<String> showVlus;

	
	
	
	public Set<String> getShowVlus() {
		return showVlus;
	}

	public void setShowVlus(Set<String> showVlus) {
		this.showVlus = showVlus;
	}

	public List<Map<String, Object>> getQueryMap() {
		return queryMap;
	}

	public void setQueryMap(List<Map<String, Object>> queryMap) {
		this.queryMap = queryMap;
	}

	public Map<String, Object> getReportInfoMap() {
		return reportInfoMap;
	}

	public void setReportInfoMap(Map<String, Object> reportInfoMap) {
		this.reportInfoMap = reportInfoMap;
	}


	
}
