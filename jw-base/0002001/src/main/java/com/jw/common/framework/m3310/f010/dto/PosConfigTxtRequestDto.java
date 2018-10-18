
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	PosConfigTxtRequestDto获取点菜宝配置
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-21]
 * @package com.jw.common.framework.m3310.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-21|gaofei|新增|PosConfigTxtRequestDto新增
 */
@DrptDto(dtonm = "PosConfigTxtRequestDto",dtodrpt="PosConfigTxtRequestDto获取点菜宝配置")
public class PosConfigTxtRequestDto extends RequestBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1684264808621790448L;
	@DrptField(fieldnm="salesId",fielddrpt="销售点标识")
	private java.lang.Integer salesId;
	@DrptField(fieldnm="periodId",fielddrpt="当前餐点")
	private java.lang.Integer periodId;
	@DrptField(fieldnm="cookbook_id",fielddrpt="菜谱标识")
	private java.lang.Integer cookbook_id;
	public java.lang.Integer getSalesId() {
		return salesId;
	}
	public void setSalesId(java.lang.Integer salesId) {
		this.salesId = salesId;
	}
	public java.lang.Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(java.lang.Integer periodId) {
		this.periodId = periodId;
	}
	public java.lang.Integer getCookbook_id() {
		return cookbook_id;
	}
	public void setCookbook_id(java.lang.Integer cookbook_id) {
		this.cookbook_id = cookbook_id;
	}

	
	
	
	
	
}

