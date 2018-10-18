
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.base.framework.core.util.StringUtil;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	CmmBaseParamQUERY信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-17]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-17|jianana|新增|CmmBaseParamQueryDto新增
 */
@DrptDto(dtonm = "CmmBaseParamQueryDto",dtodrpt="CmmBaseParamQUERY信息数据传输对象")
public class CmmBaseParamQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 5975136672781421109L;
	/** 排序字段 例如：{字段1,升序},{字段2,降序} **/
	@DrptField(fieldnm="orderColumn",fielddrpt="排序字段")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm="currentPage",fielddrpt="当前页")
	private  Integer currentPage;
	@DrptField(fieldnm="pageSize ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	
	@DrptField(fieldnm="id",fielddrpt="ID字段")
	private java.lang.Integer id;
	@DrptField(fieldnm="chainUid",fielddrpt="集团代码")
	private String chainUid;
	@DrptField(fieldnm="paramTyp",fielddrpt="参数类型")
	private String paramTyp;
	@DrptField(fieldnm="paramId",fielddrpt="参数ID")
	private java.lang.Integer paramId;
	@DrptField(fieldnm="paramCd",fielddrpt="参数代码")
	private String paramCd;
	@DrptField(fieldnm="paramDrpt",fielddrpt="参数名称")
	private String paramDrpt;
	@DrptField(fieldnm="paramGrp",fielddrpt="参数分组")
	private String paramGrp;
	@DrptField(fieldnm="paramSubgrp",fielddrpt="参数子分组")
	private String paramSubgrp;
	@DrptField(fieldnm="paramFlg",fielddrpt="参数属性")
	private String paramFlg;
	@DrptField(fieldnm="statusFlg",fielddrpt="状态标识")
	private String statusFlg;
	@DrptField(fieldnm="seq",fielddrpt="序号")
	private java.lang.Integer seq;
	@DrptField(fieldnm="note",fielddrpt="注释")
	private String note;
	@DrptField(fieldnm="paramStr1",fielddrpt="文字型参数1")
	private String paramStr1;
	@DrptField(fieldnm="paramStr2",fielddrpt="文字型参数2")
	private String paramStr2;
	@DrptField(fieldnm="paramStr3",fielddrpt="文字型参数3")
	private String paramStr3;
	@DrptField(fieldnm="paramStr4",fielddrpt="文字型参数4")
	private String paramStr4;
	@DrptField(fieldnm="paramStr5",fielddrpt="文字型参数5")
	private String paramStr5;
	@DrptField(fieldnm="paramStr6",fielddrpt="文字型参数6")
	private String paramStr6;
	@DrptField(fieldnm="paramStr7",fielddrpt="文字型参数7")
	private String paramStr7;
	@DrptField(fieldnm="paramStr8",fielddrpt="文字型参数8")
	private String paramStr8;
	@DrptField(fieldnm="paramStr9",fielddrpt="文字型参数9")
	private String paramStr9;
	@DrptField(fieldnm="paramStr10",fielddrpt="文字型参数10")
	private String paramStr10;
	@DrptField(fieldnm="paramNum1",fielddrpt="数字型参数1")
	private Long paramNum1;
	@DrptField(fieldnm="paramNum2",fielddrpt="数字型参数2")
	private Long paramNum2;
	@DrptField(fieldnm="paramNum3",fielddrpt="数字型参数3")
	private Long paramNum3;
	@DrptField(fieldnm="paramNum4",fielddrpt="数字型参数4")
	private Long paramNum4;
	@DrptField(fieldnm="paramNum5",fielddrpt="数字型参数5")
	private Long paramNum5;
	@DrptField(fieldnm="paramNum7",fielddrpt="数字型参数6")
	private Long paramNum6;
	@DrptField(fieldnm="paramNum7",fielddrpt="数字型参数7")
	private Long paramNum7;
	@DrptField(fieldnm="paramNum8",fielddrpt="数字型参数8")
	private Long paramNum8;
	@DrptField(fieldnm="paramNum9",fielddrpt="数字型参数9")
	private Long paramNum9;
	@DrptField(fieldnm="paramNum10",fielddrpt="数字型参数10")
	private Long paramNum10;
	@DrptField(fieldnm="paramDt1",fielddrpt="日期型参数1")
	private java.util.Date paramDt1;
	@DrptField(fieldnm="paramDt2",fielddrpt="日期型参数2")
	private java.util.Date paramDt2;
	@DrptField(fieldnm="paramDt3",fielddrpt="日期型参数3")
	private java.util.Date paramDt3;
	@DrptField(fieldnm="paramDt4",fielddrpt="日期型参数4")
	private java.util.Date paramDt4;
	@DrptField(fieldnm="paramDt5",fielddrpt="日期型参数5")
	private java.util.Date paramDt5;
	@DrptField(fieldnm="paramDt6",fielddrpt="日期型参数6")
	private java.util.Date paramDt6;
	@DrptField(fieldnm="paramDt7",fielddrpt="日期型参数7")
	private java.util.Date paramDt7;
	@DrptField(fieldnm="paramDt8",fielddrpt="日期型参数8")
	private java.util.Date paramDt8;
	@DrptField(fieldnm="paramDt9",fielddrpt="日期型参数9")
	private java.util.Date paramDt9;
	@DrptField(fieldnm="paramDt10",fielddrpt="日期型参数10")
	private java.util.Date paramDt10;
	@DrptField(fieldnm="paramIds",fielddrpt="参数ID集合")
	private List<Integer> paramIds;
	@DrptField(fieldnm="paramsettingTyp",fielddrpt="参数配置类型")
	private String paramsettingTyp;
	@DrptField(fieldnm="paramTyps",fielddrpt="参数类型集合")
	private List<String> paramTyps;
	@DrptField(fieldnm="paramCds",fielddrpt="参数代码集合")
	private List<String> paramCds;
	@DrptField(fieldnm="fastquery", fielddrpt="快速查询", nullable = "true", length = "100")
	private String fastquery;
	/**操作表标识（防止集团/酒店分开操作） 0 全部    1 集团    2酒店**/
	@DrptField(fieldnm = "staFlg", fielddrpt = "操作表标识")
	private String staFlg;
	@DrptField(fieldnm = "unitUid", fielddrpt = "unitUid")
	private String unitUid;

	
	
	public String getUnitUid() {
		return unitUid;
	}

	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

	/**操作表标识（防止集团/酒店分开操作） 0 全部    1 集团    2酒店**/
	public String getStaFlg() {
		return StringUtil.isNotEmpty(staFlg) ? staFlg : ConstantParm.ENUM_PARAM_OPERA_FLG.GROUP.getValue();
	}

	public void setStaFlg(String staFlg) {
		this.staFlg = staFlg;
	}
	
	public String getFastquery() {
		return fastquery;
	}

	public void setFastquery(String fastquery) {
		this.fastquery = fastquery;
	}

	public List<String> getParamTyps() {
		return paramTyps;
	}

	public void setParamTyps(List<String> paramTyps) {
		this.paramTyps = paramTyps;
	}

	public List<String> getParamCds() {
		return paramCds;
	}

	public void setParamCds(List<String> paramCds) {
		this.paramCds = paramCds;
	}

	public String getParamsettingTyp() {
		return paramsettingTyp;
	}

	public void setParamsettingTyp(String paramsettingTyp) {
		this.paramsettingTyp = paramsettingTyp;
	}

	public List<Integer> getParamIds() {
		return paramIds;
	}

	public void setParamIds(List<Integer> paramIds) {
		this.paramIds = paramIds;
	}

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
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
	public String getParamGrp() {
		return this.paramGrp;
	}
	
	public void setParamGrp(String value) {
		this.paramGrp = value;
	}
	public String getParamSubgrp() {
		return this.paramSubgrp;
	}
	
	public void setParamSubgrp(String value) {
		this.paramSubgrp = value;
	}
	public String getParamFlg() {
		return this.paramFlg;
	}
	
	public void setParamFlg(String value) {
		this.paramFlg = value;
	}
	public String getStatusFlg() {
		return this.statusFlg;
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
	public Long getParamNum1() {
		return this.paramNum1;
	}
	
	public void setParamNum1(Long value) {
		this.paramNum1 = value;
	}
	public Long getParamNum2() {
		return this.paramNum2;
	}
	
	public void setParamNum2(Long value) {
		this.paramNum2 = value;
	}
	public Long getParamNum3() {
		return this.paramNum3;
	}
	
	public void setParamNum3(Long value) {
		this.paramNum3 = value;
	}
	public Long getParamNum4() {
		return this.paramNum4;
	}
	
	public void setParamNum4(Long value) {
		this.paramNum4 = value;
	}
	public Long getParamNum5() {
		return this.paramNum5;
	}
	
	public void setParamNum5(Long value) {
		this.paramNum5 = value;
	}
	public Long getParamNum6() {
		return this.paramNum6;
	}
	
	public void setParamNum6(Long value) {
		this.paramNum6 = value;
	}
	public Long getParamNum7() {
		return this.paramNum7;
	}
	
	public void setParamNum7(Long value) {
		this.paramNum7 = value;
	}
	public Long getParamNum8() {
		return this.paramNum8;
	}
	
	public void setParamNum8(Long value) {
		this.paramNum8 = value;
	}
	public Long getParamNum9() {
		return this.paramNum9;
	}
	
	public void setParamNum9(Long value) {
		this.paramNum9 = value;
	}
	public Long getParamNum10() {
		return this.paramNum10;
	}
	
	public void setParamNum10(Long value) {
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
	public List<CodeBean> getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(List<CodeBean> orderColumn) {
		this.orderColumn = orderColumn;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

