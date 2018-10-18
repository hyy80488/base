
package com.jw.common.framework.m5300.f010.dto.ProductInfo;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class CrSGetHotelInfoResponseDto extends ResponseBaseDto{

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7723906808501482732L;
	
	private CrsGetHotelInfoDto resultData;

	public CrsGetHotelInfoDto getResultData() {
		return resultData;
	}

	public void setResultData(CrsGetHotelInfoDto resultData) {
		this.resultData = resultData;
	}



}
