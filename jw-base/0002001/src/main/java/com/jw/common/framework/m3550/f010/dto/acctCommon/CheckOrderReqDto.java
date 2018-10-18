/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.util.Map;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
@DrptDto(dtonm = "CheckOrderReqDto",dtodrpt="验证crs订单是否可以操作")
public class CheckOrderReqDto extends RequestBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -6414438520180262247L;
	
	private Map<String, Object> paramMap;
	/**操作标识**/
	private String operFlg;
	/**CRS订单号**/
	private String crsNum;

	
	public String getCrsNum() {
		return crsNum;
	}

	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}

	public String getOperFlg() {
		return operFlg;
	}

	public void setOperFlg(String operFlg) {
		this.operFlg = operFlg;
	}

	public Map<String, Object> getParamMap() {
		return paramMap;
	}

	public void setParamMap(Map<String, Object> paramMap) {
		this.paramMap = paramMap;
	}
	

}
