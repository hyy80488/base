
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.math.BigDecimal;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.annotation.DrptEntity;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.annotation.TrimProcessNeeded;
import com.jw.base.framework.core.util.StringUtil;

/**
 * ## 类说明：
 * 	CmmUnitParam基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f010.entity
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|jianana|新增|CmmUnitParam新增
 */
@DrptEntity(ennm = "CmmUnitParam基础字段", endrpt = "CmmUnitParam基础字段")
public class CmmUnitParamDto  implements  java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 4097963080611985787L;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码")
	
	
	private String chainUid;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "unitUid", fielddrpt = "单位代码")
	
	
	private String unitUid;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramTyp", fielddrpt = "参数类型")
	
	
	private String paramTyp;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramId", fielddrpt = "参数ID")
	
	private java.lang.Integer paramId;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramCd", fielddrpt = "paramCd")
	
	private String paramCd;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDrpt", fielddrpt = "参数名称")
	
	private String paramDrpt;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "statusFlg", fielddrpt = "状态标识")

	private String statusFlg;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "seq", fielddrpt = "序号")
	private java.lang.Integer seq;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "note", fielddrpt = "注释")
	
	private String note;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr1", fielddrpt = "文字型参数1")
	
	private String paramStr1;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr2", fielddrpt = "文字型参数2")
	
	private String paramStr2;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr3", fielddrpt = "文字型参数3")
	
	private String paramStr3;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum1", fielddrpt = "数字型参数1")
	private BigDecimal paramNum1;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum2", fielddrpt = "数字型参数2")
	private BigDecimal paramNum2;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum3", fielddrpt = "数字型参数3")
	private BigDecimal paramNum3;
	@DrptField(fieldnm = "paramDt1", fielddrpt = "日期型参数1")
	private java.util.Date paramDt1;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt2", fielddrpt = "日期型参数2")
	private java.util.Date paramDt2;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt3", fielddrpt = "日期型参数3")
	private java.util.Date paramDt3;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt1", fielddrpt = "paramInt1", nullable = "true", length = "10")
	private Integer paramInt1;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt2", fielddrpt = "paramInt2", nullable = "true", length = "10")
	private Integer paramInt2;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt3", fielddrpt = "paramInt3", nullable = "true", length = "10")
	private Integer paramInt3;
	
	public Integer getParamInt1() {
		return this.paramInt1;
	}
	public void setParamInt1(Integer value) {
		this.paramInt1 = value;
	}
	public Integer getParamInt2() {
		return this.paramInt2;
	}
	public void setParamInt2(Integer value) {
		this.paramInt2 = value;
	}
	public Integer getParamInt3() {
		return this.paramInt3;
	}
	public void setParamInt3(Integer value) {
		this.paramInt3 = value;
	}
	public String getParamStr1() {
		return this.paramStr1;
	}
	
	public void setParamStr1(String value) {
		this.paramStr1 = value;
	}
	public String getParamStr2() {
		return this.paramStr2;
	}
	
	public void setParamStr2(String value) {
		this.paramStr2 = value;
	}
	public String getParamStr3() {
		return this.paramStr3;
	}
	
	public void setParamStr3(String value) {
		this.paramStr3 = value;
	}
	public BigDecimal getParamNum1() {
		return this.paramNum1;
	}
	
	public void setParamNum1(BigDecimal value) {
		this.paramNum1 = value;
	}
	public BigDecimal getParamNum2() {
		return this.paramNum2;
	}
	
	public void setParamNum2(BigDecimal value) {
		this.paramNum2 = value;
	}
	public BigDecimal getParamNum3() {
		return this.paramNum3;
	}
	
	public void setParamNum3(BigDecimal value) {
		this.paramNum3 = value;
	}
	public java.util.Date getParamDt1() {
		return this.paramDt1;
	}
	
	public void setParamDt1(java.util.Date value) {
		this.paramDt1 = value;
	}
	public java.util.Date getParamDt2() {
		return this.paramDt2;
	}
	
	public void setParamDt2(java.util.Date value) {
		this.paramDt2 = value;
	}
	public java.util.Date getParamDt3() {
		return this.paramDt3;
	}
	
	public void setParamDt3(java.util.Date value) {
		this.paramDt3 = value;
	}

	public CmmUnitParamDto(){
	}
	
	public String getChainUid() {
		return this.chainUid;
	}
	
	public void setChainUid(String value) {
		this.chainUid = value;
	}
	public String getUnitUid() {
		return this.unitUid;
	}
	
	public void setUnitUid(String value) {
		this.unitUid = value;
	}
	public String getParamTyp() {
		return this.paramTyp;
	}
	
	public void setParamTyp(String value) {
		this.paramTyp = value;
	}
	public java.lang.Integer getParamId() {
		return this.paramId;
	}
	
	public void setParamId(java.lang.Integer value) {
		this.paramId = value;
	}
	public String getParamCd() {
		return this.paramCd;
	}
	
	public void setParamCd(String value) {
		this.paramCd = value;
	}
	public String getParamDrpt() {
		return this.paramDrpt;
	}
	
	public void setParamDrpt(String value) {
		this.paramDrpt = value;
	}
	public String getStatusFlg() {
		return StringUtil.isEmpty(this.statusFlg)?Constant.ENUM_STATUS_FLG.VALID.getValue():this.statusFlg;
	}
	
	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}
	public java.lang.Integer getSeq() {
		return this.seq;
	}
	
	public void setSeq(java.lang.Integer value) {
		this.seq = value;
	}
	public String getNote() {
		return this.note;
	}
	
	public void setNote(String value) {
		this.note = value;
	}
	

	
}

