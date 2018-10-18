
package com.jw.common.framework.m5300.f010.dto.ProductInfo;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class CrsCtripSubHotelInfoResponseDto extends ResponseBaseDto{

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -700753761031580426L;
    private CrsCtripSubHotelInfoDto resultData;
	public CrsCtripSubHotelInfoDto getResultData() {
		return resultData;
	}
	public void setResultData(CrsCtripSubHotelInfoDto resultData) {
		this.resultData = resultData;
	}



}
