/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3260.f010.dto;

import java.math.BigDecimal;
import java.util.Date;

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
public class GrpArComReceivableDto extends RequestBaseDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -8489848274053058346L;
	@DrptField(fieldnm = "folioNo", fielddrpt = "单据号", nullable = "false")
	private String folioNo;
	@DrptField(fieldnm = "arNo", fielddrpt = "应收账号", nullable = "false")
	private String arNo;
	@DrptField(fieldnm = "invcNo", fielddrpt = "应收票据编码", nullable = "false")
	private String invcNo;
	@DrptField(fieldnm = "trncdId", fielddrpt = "科目代码", nullable = "false")
	private Integer trncdId;
	@DrptField(fieldnm = "frttrnId", fielddrpt = "前台客账明细代码", nullable = "false")
	private Integer frttrnId;
	@DrptField(fieldnm = "invctrnMemo", fielddrpt = "应收系统备注", nullable = "false")
	private String invctrnMemo;
	@DrptField(fieldnm = "inputAmt", fielddrpt = "应收金额", nullable = "false")
	private BigDecimal inputAmt;
	@DrptField(fieldnm = "busDt", fielddrpt = "业务日期", nullable = "false")
	private Date busDt;
	@DrptField(fieldnm = "funcTyp", fielddrpt = "入账方式", nullable = "false")
	private String funcTyp;
	@DrptField(fieldnm = "jrnlTyp", fielddrpt = "账务明细类型", nullable = "false")
	private String jrnlTyp;
	@DrptField(fieldnm = "roomNum", fielddrpt = "发生房号", nullable = "false")
	private String roomNum;
	@DrptField(fieldnm = "areaId", fielddrpt = "账务发生楼区代码", nullable = "false")
	private Integer areaId;
	@DrptField(fieldnm = "roomtypId", fielddrpt = "发生房间房型编码", nullable = "false")
	private Integer roomtypId;
	@DrptField(fieldnm = "printTrnDrpt", fielddrpt = "打印名称", nullable = "false")
	private String printTrnDrpt;
	@DrptField(fieldnm = "printTrnDt", fielddrpt = "打印日期", nullable = "false")
	private Date printTrnDt;
	@DrptField(fieldnm = "adultCnt", fielddrpt = "成人数", nullable = "false")
	private Integer adultCnt;
	@DrptField(fieldnm = "childrenCnt", fielddrpt = "儿童数", nullable = "false")
	private Integer childrenCnt;
	@DrptField(fieldnm = "ccardtypId", fielddrpt = "信用卡类型", nullable = "false")
	private Integer ccardtypId;
	@DrptField(fieldnm = "mcardNo", fielddrpt = "会员卡内码", nullable = "false")
	private String mcardNo;
	@DrptField(fieldnm = "trnRef", fielddrpt = "参考号", nullable = "false")
	private String trnRef;
	@DrptField(fieldnm = "trnCmnt", fielddrpt = "交易注释", nullable = "false")
	private String trnCmnt;
	@DrptField(fieldnm = "staFlg", fielddrpt = "状态标识   0：不修改发票金额	1：修改发票金额", nullable = "false")
	private String staFlg;
	@DrptField(fieldnm = "invctrnId", fielddrpt = "应收交易编号", nullable = "false")
	private Integer invctrnId;
	@DrptField(fieldnm = "relInvctrnId", fielddrpt = "关联兑现交易", nullable = "false")
	private Integer relInvctrnId;
	@DrptField(fieldnm = "trnStus", fielddrpt = "交易状态", nullable = "false")
	private String trnStus;
	private String invcJrnlSeq;
	@DrptField(fieldnm = "arMemo", fielddrpt = "备注")
	private String arMemo;
	
	
	public String getArMemo() {
		return arMemo;
	}
	public void setArMemo(String arMemo) {
		this.arMemo = arMemo;
	}

	
	public String getInvcJrnlSeq() {
		return invcJrnlSeq;
	}

	public void setInvcJrnlSeq(String invcJrnlSeq) {
		this.invcJrnlSeq = invcJrnlSeq;
	}

	public Integer getRelInvctrnId() {
		return relInvctrnId;
	}

	public void setRelInvctrnId(Integer relInvctrnId) {
		this.relInvctrnId = relInvctrnId;
	}

	public String getTrnStus() {
		return trnStus;
	}

	public void setTrnStus(String trnStus) {
		this.trnStus = trnStus;
	}

	public Integer getInvctrnId() {
		return invctrnId;
	}

	public void setInvctrnId(Integer invctrnId) {
		this.invctrnId = invctrnId;
	}

	public String getJrnlTyp() {
		return jrnlTyp;
	}

	public void setJrnlTyp(String jrnlTyp) {
		this.jrnlTyp = jrnlTyp;
	}

	public String getStaFlg() {
		return staFlg;
	}

	public void setStaFlg(String staFlg) {
		this.staFlg = staFlg;
	}

	public String getFuncTyp() {
		return funcTyp;
	}

	public void setFuncTyp(String funcTyp) {
		this.funcTyp = funcTyp;
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

	public Integer getRoomtypId() {
		return roomtypId;
	}

	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}

	public String getPrintTrnDrpt() {
		return printTrnDrpt;
	}

	public void setPrintTrnDrpt(String printTrnDrpt) {
		this.printTrnDrpt = printTrnDrpt;
	}

	public Date getPrintTrnDt() {
		return printTrnDt;
	}

	public void setPrintTrnDt(Date printTrnDt) {
		this.printTrnDt = printTrnDt;
	}

	public Integer getAdultCnt() {
		return adultCnt;
	}

	public void setAdultCnt(Integer adultCnt) {
		this.adultCnt = adultCnt;
	}

	public Integer getChildrenCnt() {
		return childrenCnt;
	}

	public void setChildrenCnt(Integer childrenCnt) {
		this.childrenCnt = childrenCnt;
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

	public Date getBusDt() {
		return busDt;
	}

	public void setBusDt(Date busDt) {
		this.busDt = busDt;
	}

	public BigDecimal getInputAmt() {
		return inputAmt;
	}

	public void setInputAmt(BigDecimal inputAmt) {
		this.inputAmt = inputAmt;
	}

	public String getFolioNo() {
		return folioNo;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
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

	public Integer getFrttrnId() {
		return frttrnId;
	}

	public void setFrttrnId(Integer frttrnId) {
		this.frttrnId = frttrnId;
	}

	public String getInvctrnMemo() {
		return invctrnMemo;
	}

	public void setInvctrnMemo(String invctrnMemo) {
		this.invctrnMemo = invctrnMemo;
	}
	
	private String invcTyp;
	public String getInvcTyp() {
		return invcTyp;
	}
	public void setInvcTyp(String invcTyp) {
		this.invcTyp = invcTyp;
	}
	
}
