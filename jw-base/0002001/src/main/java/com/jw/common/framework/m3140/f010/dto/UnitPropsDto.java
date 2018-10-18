
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * 
 * ## 类说明：
 * 	直销查询酒店列表
 * @author    [zteng]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|zteng|新增|unitTagsDto.java新增
 */
@DrptDto(dtonm = "酒店设施信息数据传输对象", dtodrpt ="酒店设施信息数据传输对象")
public class UnitPropsDto  implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1553348809931130219L;
	@DrptField(fieldnm="propId", fielddrpt="酒店设施id")
	public Integer propId;
	@DrptField(fieldnm="propCd", fielddrpt="酒店设施CD")
	public String propCd;
	@DrptField(fieldnm="propDrpt", fielddrpt="酒店设施")
	public String propDrpt;
	@DrptField(fieldnm="propVlus", fielddrpt="酒店设施的值")
	public List<UnitPropVlsDto> propVlus;
	
	public String getPropCd() {
		return propCd;
	}
	public void setPropCd(String propCd) {
		this.propCd = propCd;
	}
	public Integer getPropId() {
		return propId;
	}
	public void setPropId(Integer propId) {
		this.propId = propId;
	}
	public String getPropDrpt() {
		return propDrpt;
	}
	public void setPropDrpt(String propDrpt) {
		this.propDrpt = propDrpt;
	}

	public List<UnitPropVlsDto> getPropVlus() {
		return propVlus;
	}
	public void setPropVlus(List<UnitPropVlsDto> propVlus) {
		this.propVlus = propVlus;
	}
	public void copyMapToDto(Map<String,Object> map){
		
	}
}
