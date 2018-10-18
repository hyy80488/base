/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3260.f010.dto;

import java.util.List;

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
public class GrpArHedgeDto extends RequestBaseDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -8654386328953363526L;
	@DrptField(fieldnm = "arNo", fielddrpt = "应收账号", nullable = "false")
	private String arNo;
	@DrptField(fieldnm = "invcNo", fielddrpt = "应收票据编码", nullable = "false")
	private String invcNo;
	@DrptField(fieldnm = "areaId", fielddrpt = "账务发生楼区代码", nullable = "false")
	private Integer areaId;
	@DrptField(fieldnm = "arVersion", fielddrpt = "应收版本号")
	private Integer arVersion;
	@DrptField(fieldnm = "invctrnIds", fielddrpt = "应收交易编号集合")
	private List<Integer> invctrnIds;
	@DrptField(fieldnm = "invoiceVersion", fielddrpt = "发票版本号")
	private Integer invoiceVersion;
	
	public String getInvcNo() {
		return invcNo;
	}
	public void setInvcNo(String invcNo) {
		this.invcNo = invcNo;
	}
	public Integer getInvoiceVersion() {
		return invoiceVersion;
	}
	public void setInvoiceVersion(Integer invoiceVersion) {
		this.invoiceVersion = invoiceVersion;
	}
	public String getArNo() {
		return arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	
	public Integer getArVersion() {
		return arVersion;
	}
	public void setArVersion(Integer arVersion) {
		this.arVersion = arVersion;
	}
	public List<Integer> getInvctrnIds() {
		return invctrnIds;
	}
	public void setInvctrnIds(List<Integer> invctrnIds) {
		this.invctrnIds = invctrnIds;
	}
}
