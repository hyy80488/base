package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.io.Serializable;
import java.util.Collection;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


/**
 * ## 类说明：
 * 	TAXRATE 税率查询dto
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年3月19日]
 * @package com.jw.hms.cmm.m3130.f010.dto.grpRsvRate
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年3月19日|MiaoDaZhuang|新增|TaxRateQueryDto.java新增
*/
public class TaxRateQueryDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5657556717762865694L;
	//税率id
	private Collection<Integer> paramIds;

	public Collection<Integer> getParamIds() {
		return paramIds;
	}

	public void setParamIds(Collection<Integer> paramIds) {
		this.paramIds = paramIds;
	}
	
}
