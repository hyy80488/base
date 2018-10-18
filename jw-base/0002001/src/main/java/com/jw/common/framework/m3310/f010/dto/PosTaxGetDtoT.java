
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
import com.jw.common.framework.m0002.f001.dto.RequestCommonDto;

/** 
 * ## 类说明：
 * 	税率配置DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f030.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|gaofei|新增|PosTaxResultDto新增
 */
public class PosTaxGetDtoT extends RequestBaseDto implements java.io.Serializable {
	/** ID  **/
	private Integer salesId;
	/** ID  **/
	private Integer statsTypId;
	public Integer getSalesId() {
		return salesId;
	}
	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}
	public Integer getStatsTypId() {
		return statsTypId;
	}
	public void setStatsTypId(Integer statsTypId) {
		this.statsTypId = statsTypId;
	}
	
}