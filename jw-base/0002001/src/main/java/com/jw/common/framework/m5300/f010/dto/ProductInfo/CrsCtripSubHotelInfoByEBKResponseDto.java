
package com.jw.common.framework.m5300.f010.dto.ProductInfo;

import java.io.Serializable;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

public class CrsCtripSubHotelInfoByEBKResponseDto extends ResponseBaseDto implements Serializable{

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 5570677542306708849L;
	private CtripSubHotelInfoByEBKDto resultData;
	public CtripSubHotelInfoByEBKDto getResultData() {
		return resultData;
	}
	public void setResultData(CtripSubHotelInfoByEBKDto resultData) {
		this.resultData = resultData;
	}


}
