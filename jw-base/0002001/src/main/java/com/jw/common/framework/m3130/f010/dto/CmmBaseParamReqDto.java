/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
/**
 * ## 类说明：
 * 	参数
 * @author    [jianana]   
 * @version   [V1.0, 2017年4月21日]
 * @package com.jw.hms.cmm.m3130.f010.dto.grpFinBaseTrncode
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月21日|jianana|新增|FinBaseTrncodeParamDto.java新增
 */
@DrptDto(dtonm = "CmmBaseParamReqDto",dtodrpt="参数")
public class CmmBaseParamReqDto  extends RequestBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 4097979436433762164L;
	@DrptField(fieldnm="paramStr1",fielddrpt="paramStr1")
	private String paramStr1;
	@DrptField(fieldnm="unitUid",fielddrpt="unitUid")
	private String unitUid;
	public String getParamStr1() {
		return paramStr1;
	}
	public void setParamStr1(String paramStr1) {
		this.paramStr1 = paramStr1;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	
	
}
