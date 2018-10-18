/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3260.f010.dto;

import java.math.BigDecimal;

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
public class GrpArComDto extends RequestBaseDto implements java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 1611109293753552152L;
	@DrptField(fieldnm = "arNo", fielddrpt = "应收账号", nullable = "false")
	private String arNo;
	@DrptField(fieldnm = "invcNo", fielddrpt = "应收票据编码", nullable = "false")
	private String invcNo;
	@DrptField(fieldnm = "trncdId", fielddrpt = "科目代码", nullable = "false")
	private Integer trncdId;
	@DrptField(fieldnm = "invctrnMemo", fielddrpt = "应收系统备注", nullable = "false")
	private String invctrnMemo;
	@DrptField(fieldnm = "inputAmt", fielddrpt = "应收金额", nullable = "false")
	private BigDecimal inputAmt;
	@DrptField(fieldnm = "roomNum", fielddrpt = "发生房号", nullable = "false")
	private String roomNum;
	@DrptField(fieldnm = "areaId", fielddrpt = "账务发生楼区代码", nullable = "false")
	private Integer areaId;
	@DrptField(fieldnm = "ccardtypId", fielddrpt = "信用卡类型", nullable = "false")
	private Integer ccardtypId;
	@DrptField(fieldnm = "mcardNo", fielddrpt = "会员卡内码", nullable = "false")
	private String mcardNo;
	@DrptField(fieldnm = "trnRef", fielddrpt = "参考号", nullable = "false")
	private String trnRef;
	@DrptField(fieldnm = "trnCmnt", fielddrpt = "交易注释", nullable = "false")
	private String trnCmnt;
	@DrptField(fieldnm = "arVersion", fielddrpt = "应收版本号")
	private Integer arVersion;
	@DrptField(fieldnm = "invoiceVersion", fielddrpt = "发票版本号")
	private Integer invoiceVersion;
	@DrptField(fieldnm = "arMemo", fielddrpt = "备注")
	private String arMemo;
	
	
	public String getArMemo() {
		return arMemo;
	}
	public void setArMemo(String arMemo) {
		this.arMemo = arMemo;
	}
	public String getArNo() {
		return arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getInvcNo() {
		return invcNo;
	}
	public void setInvcNo(String invcNo) {
		this.invcNo = invcNo;
	}
	public Integer getTrncdId() {
		return trncdId;
	}
	public void setTrncdId(Integer trncdId) {
		this.trncdId = trncdId;
	}
	public String getInvctrnMemo() {
		return invctrnMemo;
	}
	public void setInvctrnMemo(String invctrnMemo) {
		this.invctrnMemo = invctrnMemo;
	}
	public BigDecimal getInputAmt() {
		return inputAmt;
	}
	public void setInputAmt(BigDecimal inputAmt) {
		this.inputAmt = inputAmt;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public Integer getCcardtypId() {
		return ccardtypId;
	}
	public void setCcardtypId(Integer ccardtypId) {
		this.ccardtypId = ccardtypId;
	}
	public String getMcardNo() {
		return mcardNo;
	}
	public void setMcardNo(String mcardNo) {
		this.mcardNo = mcardNo;
	}
	public String getTrnRef() {
		return trnRef;
	}
	public void setTrnRef(String trnRef) {
		this.trnRef = trnRef;
	}
	public String getTrnCmnt() {
		return trnCmnt;
	}
	public void setTrnCmnt(String trnCmnt) {
		this.trnCmnt = trnCmnt;
	}
	public Integer getArVersion() {
		return arVersion;
	}
	public void setArVersion(Integer arVersion) {
		this.arVersion = arVersion;
	}
	public Integer getInvoiceVersion() {
		return invoiceVersion;
	}
	public void setInvoiceVersion(Integer invoiceVersion) {
		this.invoiceVersion = invoiceVersion;
	}
	
}
