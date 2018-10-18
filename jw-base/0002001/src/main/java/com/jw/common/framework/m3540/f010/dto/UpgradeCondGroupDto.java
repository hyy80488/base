package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;
import java.util.Map;


/**
 * ## 类说明：
 * 	升级策略条件分组dto
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年10月15日]
 * @package com.jw.common.framework.m3540.f010.dto
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年10月15日|MiaoDaZhuang|新增|UpgradeGroupDto.java新增
*/
public class UpgradeCondGroupDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5611465940537264979L;
	//主条件
	private Integer mainCondId;
	//主条件类型
	private String mainCondTyp;
	//条件的过滤
	private String condFilter;
	//条件的过滤参数
	private Map<String, Object> condFilterParam;
	public Integer getMainCondId() {
		return mainCondId;
	}
	public String getCondFilter() {
		return condFilter;
	}
	public Map<String, Object> getCondFilterParam() {
		return condFilterParam;
	}
	public void setMainCondId(Integer mainCondId) {
		this.mainCondId = mainCondId;
	}
	public void setCondFilter(String condFilter) {
		this.condFilter = condFilter;
	}
	public void setCondFilterParam(Map<String, Object> condFilterParam) {
		this.condFilterParam = condFilterParam;
	}
	public String getMainCondTyp() {
		return mainCondTyp;
	}
	public void setMainCondTyp(String mainCondTyp) {
		this.mainCondTyp = mainCondTyp;
	}
	
}
