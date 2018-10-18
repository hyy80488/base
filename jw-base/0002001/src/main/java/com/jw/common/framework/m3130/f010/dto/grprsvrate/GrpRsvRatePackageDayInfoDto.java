/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.math.BigDecimal;
import java.util.Date;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * 
 * ## 类说明：
 * 	每日房含价格信息对象
 * @author    [guoc]   
 * @version   [V1.0, 2017年4月11日]
 * @package com.jw.hms.pms.m3210.f010.dto.rsvRateQuery
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月11日|guoc|新增|GrpRsvRatePackageDayInfoDto.java新增
 */
@DrptDto(dtonm = "每日房含价格信息对象",dtodrpt="每日房含价格信息对象")
public class GrpRsvRatePackageDayInfoDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 8210832388426539454L;
	
	@DrptField(fieldnm="yymd",fielddrpt="日期")
	private Date yymd;
	@DrptField(fieldnm="price",fielddrpt="价格")
	private BigDecimal price;	
	@DrptField(fieldnm="allowanceAmt",fielddrpt="抛帐价格")
	private BigDecimal allowanceAmt;	
	@DrptField(fieldnm="frequency",fielddrpt="次数")
	private Integer frequency;	
	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getAllowanceAmt() {
		return allowanceAmt;
	}

	public void setAllowanceAmt(BigDecimal allowanceAmt) {
		this.allowanceAmt = allowanceAmt;
	}

	public Integer getFrequency() {
		return frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	public Date getYymd() {
		return yymd;
	}

	public void setYymd(Date yymd) {
		this.yymd = yymd;
	}

}
