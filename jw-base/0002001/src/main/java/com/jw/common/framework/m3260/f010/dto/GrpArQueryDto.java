/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3260.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	应收请求DTO
 * @author    [jianana]   
 * @version   [V1.0, 2017年7月31日]
 * @package com.jw.hms.group.m3260.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年7月31日|jianana|新增|GrpArComReceivableDto.java新增
 */
@DrptDto(dtonm = "应收请求DTO", dtodrpt = "应收请求DTO")
public class GrpArQueryDto extends RequestBaseDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 1750782866891198307L;
	@DrptField(fieldnm = "arNo", fielddrpt = "应收账号", nullable = "false")
	private String arNo;
	@DrptField(fieldnm = "invctrnId", fielddrpt = "应收交易编号")
	private Integer invctrnId;
	public String getArNo() {
		return arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public Integer getInvctrnId() {
		return invctrnId;
	}
	public void setInvctrnId(Integer invctrnId) {
		this.invctrnId = invctrnId;
	}
	
}
