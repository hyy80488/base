
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

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
public class UnitPropVlsDto  implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1729798543001226618L;
	@DrptField(fieldnm="propVluId", fielddrpt="酒店设施id")
	public Integer propVluId;
	@DrptField(fieldnm="propVluCd", fielddrpt="酒店设施CD")
	public String propVluCd;
	@DrptField(fieldnm="propVluDrpt", fielddrpt="酒店设施")
	public String propVluDrpt;
	public Integer getPropVluId() {
		return propVluId;
	}
	public void setPropVluId(Integer propVluId) {
		this.propVluId = propVluId;
	}
	public String getPropVluCd() {
		return propVluCd;
	}
	public void setPropVluCd(String propVluCd) {
		this.propVluCd = propVluCd;
	}
	public String getPropVluDrpt() {
		return propVluDrpt;
	}
	public void setPropVluDrpt(String propVluDrpt) {
		this.propVluDrpt = propVluDrpt;
	}
	
}
