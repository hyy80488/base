
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
 * 	CmmBaseParam基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f010.entity
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|jianana|新增|CmmBaseParam新增
 */
@DrptEntity(ennm = "CmmBaseParam基础字段", endrpt = "CmmBaseParam基础字段")
public class CmmBaseParamDto implements  java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 2433424842237688590L;
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码", nullable = "false", length = "40")
	
	private String chainUid;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramTyp", fielddrpt = "参数类型", nullable = "false", length = "20")
	

	private String paramTyp;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramId", fielddrpt = "paramId", nullable = "false", length = "10")
	
	private Integer paramId;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramCd", fielddrpt = "参数代码", nullable = "true", length = "20")

	private String paramCd;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDrpt", fielddrpt = "参数名称", nullable = "true", length = "200")
	
	private String paramDrpt;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramgrpId", fielddrpt = "参数分组", nullable = "true", length = "10")
	private Integer paramgrpId;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramsubgrpId", fielddrpt = "参数子分组", nullable = "true", length = "10")
	private Integer paramsubgrpId;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramFlg", fielddrpt = "参数属性", nullable = "true", length = "3")
	
	private String paramFlg;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "statusFlg", fielddrpt = "状态标识", nullable = "false", length = "3")
	
	
	private String statusFlg;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "seq", fielddrpt = "序号", nullable = "true", length = "10")
	private Integer seq;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "note", fielddrpt = "注释", nullable = "true", length = "500")
	
	private String note;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr1", fielddrpt = "文字型参数1", nullable = "true", length = "200")
	
	private String paramStr1;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr2", fielddrpt = "文字型参数2", nullable = "true", length = "200")
	
	private String paramStr2;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr3", fielddrpt = "文字型参数3", nullable = "true", length = "200")
	
	private String paramStr3;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr4", fielddrpt = "文字型参数4", nullable = "true", length = "200")
	
	private String paramStr4;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr5", fielddrpt = "文字型参数5", nullable = "true", length = "200")
	
	private String paramStr5;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr6", fielddrpt = "文字型参数6", nullable = "true", length = "200")
	
	private String paramStr6;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr7", fielddrpt = "文字型参数7", nullable = "true", length = "200")
	
	private String paramStr7;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr8", fielddrpt = "文字型参数8", nullable = "true", length = "200")
	
	private String paramStr8;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr9", fielddrpt = "文字型参数9", nullable = "true", length = "200")
	
	private String paramStr9;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr10", fielddrpt = "文字型参数10", nullable = "true", length = "200")
	
	private String paramStr10;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum1", fielddrpt = "数字型参数1", nullable = "true", length = "16")
	private BigDecimal paramNum1;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum2", fielddrpt = "数字型参数2", nullable = "true", length = "16")
	private BigDecimal paramNum2;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum3", fielddrpt = "数字型参数3", nullable = "true", length = "16")
	private BigDecimal paramNum3;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum4", fielddrpt = "数字型参数4", nullable = "true", length = "16")
	private BigDecimal paramNum4;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum5", fielddrpt = "数字型参数5", nullable = "true", length = "16")
	private BigDecimal paramNum5;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum6", fielddrpt = "数字型参数6", nullable = "true", length = "16")
	private BigDecimal paramNum6;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum7", fielddrpt = "数字型参数7", nullable = "true", length = "16")
	private BigDecimal paramNum7;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum8", fielddrpt = "数字型参数8", nullable = "true", length = "16")
	private BigDecimal paramNum8;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum9", fielddrpt = "数字型参数9", nullable = "true", length = "16")
	private BigDecimal paramNum9;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum10", fielddrpt = "数字型参数10", nullable = "true", length = "16")
	private BigDecimal paramNum10;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt1", fielddrpt = "日期型参数1", nullable = "true", length = "29")
	private java.util.Date paramDt1;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt2", fielddrpt = "日期型参数2", nullable = "true", length = "29")
	private java.util.Date paramDt2;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt3", fielddrpt = "日期型参数3", nullable = "true", length = "29")
	private java.util.Date paramDt3;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt4", fielddrpt = "日期型参数4", nullable = "true", length = "29")
	private java.util.Date paramDt4;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt5", fielddrpt = "日期型参数5", nullable = "true", length = "29")
	private java.util.Date paramDt5;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt6", fielddrpt = "日期型参数6", nullable = "true", length = "29")
	private java.util.Date paramDt6;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt7", fielddrpt = "日期型参数7", nullable = "true", length = "29")
	private java.util.Date paramDt7;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt8", fielddrpt = "日期型参数8", nullable = "true", length = "29")
	private java.util.Date paramDt8;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt9", fielddrpt = "日期型参数9", nullable = "true", length = "29")
	private java.util.Date paramDt9;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt10", fielddrpt = "日期型参数10", nullable = "true", length = "29")
	private java.util.Date paramDt10;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr11", fielddrpt = "paramStr11", nullable = "true", length = "200")
	
	private String paramStr11;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr12", fielddrpt = "paramStr12", nullable = "true", length = "200")
	
	private String paramStr12;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr13", fielddrpt = "paramStr13", nullable = "true", length = "200")
	
	private String paramStr13;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr14", fielddrpt = "paramStr14", nullable = "true", length = "200")
	
	private String paramStr14;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr15", fielddrpt = "paramStr15", nullable = "true", length = "200")
	
	private String paramStr15;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr16", fielddrpt = "paramStr16", nullable = "true", length = "200")
	
	private String paramStr16;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr17", fielddrpt = "paramStr17", nullable = "true", length = "200")
	
	private String paramStr17;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr18", fielddrpt = "paramStr18", nullable = "true", length = "200")
	
	private String paramStr18;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr19", fielddrpt = "paramStr19", nullable = "true", length = "200")
	
	private String paramStr19;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr20", fielddrpt = "paramStr20", nullable = "true", length = "200")
	
	private String paramStr20;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr21", fielddrpt = "paramStr21", nullable = "true", length = "200")
	
	private String paramStr21;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr22", fielddrpt = "paramStr22", nullable = "true", length = "200")
	
	private String paramStr22;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr23", fielddrpt = "paramStr23", nullable = "true", length = "200")
	
	private String paramStr23;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr24", fielddrpt = "paramStr24", nullable = "true", length = "200")
	
	private String paramStr24;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr25", fielddrpt = "paramStr25", nullable = "true", length = "200")
	
	private String paramStr25;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr26", fielddrpt = "paramStr26", nullable = "true", length = "200")
	
	private String paramStr26;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr27", fielddrpt = "paramStr27", nullable = "true", length = "200")
	
	private String paramStr27;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr28", fielddrpt = "paramStr28", nullable = "true", length = "200")
	
	private String paramStr28;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr29", fielddrpt = "paramStr29", nullable = "true", length = "200")
	
	private String paramStr29;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramStr30", fielddrpt = "paramStr30", nullable = "true", length = "200")
	
	private String paramStr30;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum11", fielddrpt = "paramNum11", nullable = "true", length = "16")
	private BigDecimal paramNum11;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum12", fielddrpt = "paramNum12", nullable = "true", length = "16")
	private BigDecimal paramNum12;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum13", fielddrpt = "paramNum13", nullable = "true", length = "16")
	private BigDecimal paramNum13;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum14", fielddrpt = "paramNum14", nullable = "true", length = "16")
	private BigDecimal paramNum14;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum15", fielddrpt = "paramNum15", nullable = "true", length = "16")
	private BigDecimal paramNum15;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum16", fielddrpt = "paramNum16", nullable = "true", length = "16")
	private BigDecimal paramNum16;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum17", fielddrpt = "paramNum17", nullable = "true", length = "16")
	private BigDecimal paramNum17;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum18", fielddrpt = "paramNum18", nullable = "true", length = "16")
	private BigDecimal paramNum18;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum19", fielddrpt = "paramNum19", nullable = "true", length = "16")
	private BigDecimal paramNum19;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramNum20", fielddrpt = "paramNum20", nullable = "true", length = "16")
	private BigDecimal paramNum20;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt11", fielddrpt = "paramDt11", nullable = "true", length = "29")
	private java.util.Date paramDt11;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt12", fielddrpt = "paramDt12", nullable = "true", length = "29")
	private java.util.Date paramDt12;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt13", fielddrpt = "paramDt13", nullable = "true", length = "29")
	private java.util.Date paramDt13;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt14", fielddrpt = "paramDt14", nullable = "true", length = "29")
	private java.util.Date paramDt14;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt15", fielddrpt = "paramDt15", nullable = "true", length = "29")
	private java.util.Date paramDt15;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt16", fielddrpt = "paramDt16", nullable = "true", length = "29")
	private java.util.Date paramDt16;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt17", fielddrpt = "paramDt17", nullable = "true", length = "29")
	private java.util.Date paramDt17;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt18", fielddrpt = "paramDt18", nullable = "true", length = "29")
	private java.util.Date paramDt18;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt19", fielddrpt = "paramDt19", nullable = "true", length = "29")
	private java.util.Date paramDt19;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramDt20", fielddrpt = "paramDt20", nullable = "true", length = "29")
	private java.util.Date paramDt20;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt1", fielddrpt = "paramInt1", nullable = "true", length = "10")
	private Integer paramInt1;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt2", fielddrpt = "paramInt2", nullable = "true", length = "10")
	private Integer paramInt2;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt3", fielddrpt = "paramInt3", nullable = "true", length = "10")
	private Integer paramInt3;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt4", fielddrpt = "paramInt4", nullable = "true", length = "10")
	private Integer paramInt4;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt5", fielddrpt = "paramInt5", nullable = "true", length = "10")
	private Integer paramInt5;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt6", fielddrpt = "paramInt6", nullable = "true", length = "10")
	private Integer paramInt6;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt7", fielddrpt = "paramInt7", nullable = "true", length = "10")
	private Integer paramInt7;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt8", fielddrpt = "paramInt8", nullable = "true", length = "10")
	private Integer paramInt8;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt9", fielddrpt = "paramInt9", nullable = "true", length = "10")
	private Integer paramInt9;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt10", fielddrpt = "paramInt10", nullable = "true", length = "10")
	private Integer paramInt10;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt11", fielddrpt = "paramInt11", nullable = "true", length = "10")
	private Integer paramInt11;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt12", fielddrpt = "paramInt12", nullable = "true", length = "10")
	private Integer paramInt12;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt13", fielddrpt = "paramInt13", nullable = "true", length = "10")
	private Integer paramInt13;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt14", fielddrpt = "paramInt14", nullable = "true", length = "10")
	private Integer paramInt14;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt15", fielddrpt = "paramInt15", nullable = "true", length = "10")
	private Integer paramInt15;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt16", fielddrpt = "paramInt16", nullable = "true", length = "10")
	private Integer paramInt16;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt17", fielddrpt = "paramInt17", nullable = "true", length = "10")
	private Integer paramInt17;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt18", fielddrpt = "paramInt18", nullable = "true", length = "10")
	private Integer paramInt18;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt19", fielddrpt = "paramInt19", nullable = "true", length = "10")
	private Integer paramInt19;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "paramInt20", fielddrpt = "paramInt20", nullable = "true", length = "10")
	private Integer paramInt20;
	


	public CmmBaseParamDto(){
	}
	
	public String getChainUid() {
		return this.chainUid;
	}
	public void setChainUid(String value) {
		this.chainUid = value;
	}
	public String getParamTyp() {
		return this.paramTyp;
	}
	public void setParamTyp(String value) {
		this.paramTyp = value;
	}
	public Integer getParamId() {
		return this.paramId;
	}
	public void setParamId(Integer value) {
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
	public Integer getParamgrpId() {
		return this.paramgrpId;
	}
	public void setParamgrpId(Integer value) {
		this.paramgrpId = value;
	}
	public Integer getParamsubgrpId() {
		return this.paramsubgrpId;
	}
	public void setParamsubgrpId(Integer value) {
		this.paramsubgrpId = value;
	}
	public String getParamFlg() {
		return this.paramFlg;
	}
	public void setParamFlg(String value) {
		this.paramFlg = value;
	}
	public String getStatusFlg() {
		return StringUtil.isEmpty(this.statusFlg)?Constant.ENUM_STATUS_FLG.VALID.getValue():this.statusFlg;
	}
	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}
	public Integer getSeq() {
		return this.seq;
	}
	public void setSeq(Integer value) {
		this.seq = value;
	}
	public String getNote() {
		return this.note;
	}
	public void setNote(String value) {
		this.note = value;
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
	public String getParamStr4() {
		return this.paramStr4;
	}
	public void setParamStr4(String value) {
		this.paramStr4 = value;
	}
	public String getParamStr5() {
		return this.paramStr5;
	}
	public void setParamStr5(String value) {
		this.paramStr5 = value;
	}
	public String getParamStr6() {
		return this.paramStr6;
	}
	public void setParamStr6(String value) {
		this.paramStr6 = value;
	}
	public String getParamStr7() {
		return this.paramStr7;
	}
	public void setParamStr7(String value) {
		this.paramStr7 = value;
	}
	public String getParamStr8() {
		return this.paramStr8;
	}
	public void setParamStr8(String value) {
		this.paramStr8 = value;
	}
	public String getParamStr9() {
		return this.paramStr9;
	}
	public void setParamStr9(String value) {
		this.paramStr9 = value;
	}
	public String getParamStr10() {
		return this.paramStr10;
	}
	public void setParamStr10(String value) {
		this.paramStr10 = value;
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
	public BigDecimal getParamNum4() {
		return this.paramNum4;
	}
	public void setParamNum4(BigDecimal value) {
		this.paramNum4 = value;
	}
	public BigDecimal getParamNum5() {
		return this.paramNum5;
	}
	public void setParamNum5(BigDecimal value) {
		this.paramNum5 = value;
	}
	public BigDecimal getParamNum6() {
		return this.paramNum6;
	}
	public void setParamNum6(BigDecimal value) {
		this.paramNum6 = value;
	}
	public BigDecimal getParamNum7() {
		return this.paramNum7;
	}
	public void setParamNum7(BigDecimal value) {
		this.paramNum7 = value;
	}
	public BigDecimal getParamNum8() {
		return this.paramNum8;
	}
	public void setParamNum8(BigDecimal value) {
		this.paramNum8 = value;
	}
	public BigDecimal getParamNum9() {
		return this.paramNum9;
	}
	public void setParamNum9(BigDecimal value) {
		this.paramNum9 = value;
	}
	public BigDecimal getParamNum10() {
		return this.paramNum10;
	}
	public void setParamNum10(BigDecimal value) {
		this.paramNum10 = value;
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
	public java.util.Date getParamDt4() {
		return this.paramDt4;
	}
	public void setParamDt4(java.util.Date value) {
		this.paramDt4 = value;
	}
	public java.util.Date getParamDt5() {
		return this.paramDt5;
	}
	public void setParamDt5(java.util.Date value) {
		this.paramDt5 = value;
	}
	public java.util.Date getParamDt6() {
		return this.paramDt6;
	}
	public void setParamDt6(java.util.Date value) {
		this.paramDt6 = value;
	}
	public java.util.Date getParamDt7() {
		return this.paramDt7;
	}
	public void setParamDt7(java.util.Date value) {
		this.paramDt7 = value;
	}
	public java.util.Date getParamDt8() {
		return this.paramDt8;
	}
	public void setParamDt8(java.util.Date value) {
		this.paramDt8 = value;
	}
	public java.util.Date getParamDt9() {
		return this.paramDt9;
	}
	public void setParamDt9(java.util.Date value) {
		this.paramDt9 = value;
	}
	public java.util.Date getParamDt10() {
		return this.paramDt10;
	}
	public void setParamDt10(java.util.Date value) {
		this.paramDt10 = value;
	}
	public String getParamStr11() {
		return this.paramStr11;
	}
	public void setParamStr11(String value) {
		this.paramStr11 = value;
	}
	public String getParamStr12() {
		return this.paramStr12;
	}
	public void setParamStr12(String value) {
		this.paramStr12 = value;
	}
	public String getParamStr13() {
		return this.paramStr13;
	}
	public void setParamStr13(String value) {
		this.paramStr13 = value;
	}
	public String getParamStr14() {
		return this.paramStr14;
	}
	public void setParamStr14(String value) {
		this.paramStr14 = value;
	}
	public String getParamStr15() {
		return this.paramStr15;
	}
	public void setParamStr15(String value) {
		this.paramStr15 = value;
	}
	public String getParamStr16() {
		return this.paramStr16;
	}
	public void setParamStr16(String value) {
		this.paramStr16 = value;
	}
	public String getParamStr17() {
		return this.paramStr17;
	}
	public void setParamStr17(String value) {
		this.paramStr17 = value;
	}
	public String getParamStr18() {
		return this.paramStr18;
	}
	public void setParamStr18(String value) {
		this.paramStr18 = value;
	}
	public String getParamStr19() {
		return this.paramStr19;
	}
	public void setParamStr19(String value) {
		this.paramStr19 = value;
	}
	public String getParamStr20() {
		return this.paramStr20;
	}
	public void setParamStr20(String value) {
		this.paramStr20 = value;
	}
	public String getParamStr21() {
		return this.paramStr21;
	}
	public void setParamStr21(String value) {
		this.paramStr21 = value;
	}
	public String getParamStr22() {
		return this.paramStr22;
	}
	public void setParamStr22(String value) {
		this.paramStr22 = value;
	}
	public String getParamStr23() {
		return this.paramStr23;
	}
	public void setParamStr23(String value) {
		this.paramStr23 = value;
	}
	public String getParamStr24() {
		return this.paramStr24;
	}
	public void setParamStr24(String value) {
		this.paramStr24 = value;
	}
	public String getParamStr25() {
		return this.paramStr25;
	}
	public void setParamStr25(String value) {
		this.paramStr25 = value;
	}
	public String getParamStr26() {
		return this.paramStr26;
	}
	public void setParamStr26(String value) {
		this.paramStr26 = value;
	}
	public String getParamStr27() {
		return this.paramStr27;
	}
	public void setParamStr27(String value) {
		this.paramStr27 = value;
	}
	public String getParamStr28() {
		return this.paramStr28;
	}
	public void setParamStr28(String value) {
		this.paramStr28 = value;
	}
	public String getParamStr29() {
		return this.paramStr29;
	}
	public void setParamStr29(String value) {
		this.paramStr29 = value;
	}
	public String getParamStr30() {
		return this.paramStr30;
	}
	public void setParamStr30(String value) {
		this.paramStr30 = value;
	}
	public BigDecimal getParamNum11() {
		return this.paramNum11;
	}
	public void setParamNum11(BigDecimal value) {
		this.paramNum11 = value;
	}
	public BigDecimal getParamNum12() {
		return this.paramNum12;
	}
	public void setParamNum12(BigDecimal value) {
		this.paramNum12 = value;
	}
	public BigDecimal getParamNum13() {
		return this.paramNum13;
	}
	public void setParamNum13(BigDecimal value) {
		this.paramNum13 = value;
	}
	public BigDecimal getParamNum14() {
		return this.paramNum14;
	}
	public void setParamNum14(BigDecimal value) {
		this.paramNum14 = value;
	}
	public BigDecimal getParamNum15() {
		return this.paramNum15;
	}
	public void setParamNum15(BigDecimal value) {
		this.paramNum15 = value;
	}
	public BigDecimal getParamNum16() {
		return this.paramNum16;
	}
	public void setParamNum16(BigDecimal value) {
		this.paramNum16 = value;
	}
	public BigDecimal getParamNum17() {
		return this.paramNum17;
	}
	public void setParamNum17(BigDecimal value) {
		this.paramNum17 = value;
	}
	public BigDecimal getParamNum18() {
		return this.paramNum18;
	}
	public void setParamNum18(BigDecimal value) {
		this.paramNum18 = value;
	}
	public BigDecimal getParamNum19() {
		return this.paramNum19;
	}
	public void setParamNum19(BigDecimal value) {
		this.paramNum19 = value;
	}
	public BigDecimal getParamNum20() {
		return this.paramNum20;
	}
	public void setParamNum20(BigDecimal value) {
		this.paramNum20 = value;
	}
	public java.util.Date getParamDt11() {
		return this.paramDt11;
	}
	public void setParamDt11(java.util.Date value) {
		this.paramDt11 = value;
	}
	public java.util.Date getParamDt12() {
		return this.paramDt12;
	}
	public void setParamDt12(java.util.Date value) {
		this.paramDt12 = value;
	}
	public java.util.Date getParamDt13() {
		return this.paramDt13;
	}
	public void setParamDt13(java.util.Date value) {
		this.paramDt13 = value;
	}
	public java.util.Date getParamDt14() {
		return this.paramDt14;
	}
	public void setParamDt14(java.util.Date value) {
		this.paramDt14 = value;
	}
	public java.util.Date getParamDt15() {
		return this.paramDt15;
	}
	public void setParamDt15(java.util.Date value) {
		this.paramDt15 = value;
	}
	public java.util.Date getParamDt16() {
		return this.paramDt16;
	}
	public void setParamDt16(java.util.Date value) {
		this.paramDt16 = value;
	}
	public java.util.Date getParamDt17() {
		return this.paramDt17;
	}
	public void setParamDt17(java.util.Date value) {
		this.paramDt17 = value;
	}
	public java.util.Date getParamDt18() {
		return this.paramDt18;
	}
	public void setParamDt18(java.util.Date value) {
		this.paramDt18 = value;
	}
	public java.util.Date getParamDt19() {
		return this.paramDt19;
	}
	public void setParamDt19(java.util.Date value) {
		this.paramDt19 = value;
	}
	public java.util.Date getParamDt20() {
		return this.paramDt20;
	}
	public void setParamDt20(java.util.Date value) {
		this.paramDt20 = value;
	}
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
	public Integer getParamInt4() {
		return this.paramInt4;
	}
	public void setParamInt4(Integer value) {
		this.paramInt4 = value;
	}
	public Integer getParamInt5() {
		return this.paramInt5;
	}
	public void setParamInt5(Integer value) {
		this.paramInt5 = value;
	}
	public Integer getParamInt6() {
		return this.paramInt6;
	}
	public void setParamInt6(Integer value) {
		this.paramInt6 = value;
	}
	public Integer getParamInt7() {
		return this.paramInt7;
	}
	public void setParamInt7(Integer value) {
		this.paramInt7 = value;
	}
	public Integer getParamInt8() {
		return this.paramInt8;
	}
	public void setParamInt8(Integer value) {
		this.paramInt8 = value;
	}
	public Integer getParamInt9() {
		return this.paramInt9;
	}
	public void setParamInt9(Integer value) {
		this.paramInt9 = value;
	}
	public Integer getParamInt10() {
		return this.paramInt10;
	}
	public void setParamInt10(Integer value) {
		this.paramInt10 = value;
	}
	public Integer getParamInt11() {
		return this.paramInt11;
	}
	public void setParamInt11(Integer value) {
		this.paramInt11 = value;
	}
	public Integer getParamInt12() {
		return this.paramInt12;
	}
	public void setParamInt12(Integer value) {
		this.paramInt12 = value;
	}
	public Integer getParamInt13() {
		return this.paramInt13;
	}
	public void setParamInt13(Integer value) {
		this.paramInt13 = value;
	}
	public Integer getParamInt14() {
		return this.paramInt14;
	}
	public void setParamInt14(Integer value) {
		this.paramInt14 = value;
	}
	public Integer getParamInt15() {
		return this.paramInt15;
	}
	public void setParamInt15(Integer value) {
		this.paramInt15 = value;
	}
	public Integer getParamInt16() {
		return this.paramInt16;
	}
	public void setParamInt16(Integer value) {
		this.paramInt16 = value;
	}
	public Integer getParamInt17() {
		return this.paramInt17;
	}
	public void setParamInt17(Integer value) {
		this.paramInt17 = value;
	}
	public Integer getParamInt18() {
		return this.paramInt18;
	}
	public void setParamInt18(Integer value) {
		this.paramInt18 = value;
	}
	public Integer getParamInt19() {
		return this.paramInt19;
	}
	public void setParamInt19(Integer value) {
		this.paramInt19 = value;
	}
	public Integer getParamInt20() {
		return this.paramInt20;
	}
	public void setParamInt20(Integer value) {
		this.paramInt20 = value;
	}
	

	
}

