/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

public class CrsCancelDto extends RequestBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 8492364015046754668L;
	
	private String crsNum;

	public String getCrsNum() {
		return crsNum;
	}

	public void setCrsNum(String crsNum) {
		this.crsNum = crsNum;
	}

}
