
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import java.math.BigDecimal;

/**
 * ## 类说明：
 * 	单位附加信息QUERY信息数据传输对象
 * @author    [lilin]   
 * @version   [V1.0, 2018-08-08]
 * @package com.jw.hms.cmm.m3130.f011.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018-08-08|lilin|新增|PlfCisUnitPropQueryDto新增
 */
@DrptDto(dtonm = "单位附加信息QUERY信息数据传输对象",dtodrpt="单位附加信息QUERY信息数据传输对象")
public class PlfCisUnitPropQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 8295122489264632491L;
	@DrptField(fieldnm="排序 ",fielddrpt="排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm="当前页",fielddrpt="当前页")
	private  Integer currentPage;
	@DrptField(fieldnm="每页记录数量 ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	
	@DrptField(fieldnm="id", fielddrpt="id", nullable = "false", length = "10")
	private Integer id;
	
	@DrptField(fieldnm="chainUid", fielddrpt="chainUid", nullable = "false", length = "40")
	private String chainUid;
	
	@DrptField(fieldnm="unitUid", fielddrpt="unitUid", nullable = "false", length = "40")
	private String unitUid;
	
	@DrptField(fieldnm="propTyp", fielddrpt="propTyp", nullable = "false", length = "10")
	private String propTyp;
	
	@DrptField(fieldnm="propKey", fielddrpt="propKey", nullable = "false", length = "100")
	private String propKey;
	
	@DrptField(fieldnm="propKeyId", fielddrpt="propKeyId", nullable = "false", length = "10")
	private Integer propKeyId;
	
	@DrptField(fieldnm="statusFlg", fielddrpt="statusFlg", nullable = "false", length = "3")
	private String statusFlg;
	
	@DrptField(fieldnm="seq", fielddrpt="seq", nullable = "false", length = "10")
	private Integer seq;
	
	@DrptField(fieldnm="propFlg", fielddrpt="propFlg", nullable = "true", length = "20")
	private String propFlg;
	
	@DrptField(fieldnm="memo", fielddrpt="memo", nullable = "true", length = "500")
	private String memo;
	
	@DrptField(fieldnm="propStr1", fielddrpt="propStr1", nullable = "true", length = "500")
	private String propStr1;
	
	@DrptField(fieldnm="propStr2", fielddrpt="propStr2", nullable = "true", length = "501")
	private String propStr2;
	
	@DrptField(fieldnm="propStr3", fielddrpt="propStr3", nullable = "true", length = "502")
	private String propStr3;
	
	@DrptField(fieldnm="propStr4", fielddrpt="propStr4", nullable = "true", length = "503")
	private String propStr4;
	
	@DrptField(fieldnm="propStr5", fielddrpt="propStr5", nullable = "true", length = "504")
	private String propStr5;
	
	@DrptField(fieldnm="propStr6", fielddrpt="propStr6", nullable = "true", length = "505")
	private String propStr6;
	
	@DrptField(fieldnm="propStr7", fielddrpt="propStr7", nullable = "true", length = "506")
	private String propStr7;
	
	@DrptField(fieldnm="propStr8", fielddrpt="propStr8", nullable = "true", length = "507")
	private String propStr8;
	
	@DrptField(fieldnm="propStr9", fielddrpt="propStr9", nullable = "true", length = "508")
	private String propStr9;
	
	@DrptField(fieldnm="propStr10", fielddrpt="propStr10", nullable = "true", length = "509")
	private String propStr10;
	
	@DrptField(fieldnm="propInt1", fielddrpt="propInt1", nullable = "true", length = "10")
	private Integer propInt1;
	
	@DrptField(fieldnm="propInt2", fielddrpt="propInt2", nullable = "true", length = "10")
	private Integer propInt2;
	
	@DrptField(fieldnm="propInt3", fielddrpt="propInt3", nullable = "true", length = "10")
	private Integer propInt3;
	
	@DrptField(fieldnm="propInt4", fielddrpt="propInt4", nullable = "true", length = "10")
	private Integer propInt4;
	
	@DrptField(fieldnm="propInt5", fielddrpt="propInt5", nullable = "true", length = "10")
	private Integer propInt5;
	
	@DrptField(fieldnm="propInt6", fielddrpt="propInt6", nullable = "true", length = "10")
	private Integer propInt6;
	
	@DrptField(fieldnm="propInt7", fielddrpt="propInt7", nullable = "true", length = "10")
	private Integer propInt7;
	
	@DrptField(fieldnm="propInt8", fielddrpt="propInt8", nullable = "true", length = "10")
	private Integer propInt8;
	
	@DrptField(fieldnm="propInt9", fielddrpt="propInt9", nullable = "true", length = "10")
	private Integer propInt9;
	
	@DrptField(fieldnm="propInt10", fielddrpt="propInt10", nullable = "true", length = "10")
	private Integer propInt10;
	
	@DrptField(fieldnm="propNum1", fielddrpt="propNum1", nullable = "true", length = "16")
	private BigDecimal propNum1;
	
	@DrptField(fieldnm="propNum2", fielddrpt="propNum2", nullable = "true", length = "16")
	private BigDecimal propNum2;
	
	@DrptField(fieldnm="propNum3", fielddrpt="propNum3", nullable = "true", length = "16")
	private BigDecimal propNum3;
	
	@DrptField(fieldnm="propNum4", fielddrpt="propNum4", nullable = "true", length = "16")
	private BigDecimal propNum4;
	
	@DrptField(fieldnm="propNum5", fielddrpt="propNum5", nullable = "true", length = "16")
	private BigDecimal propNum5;
	
	@DrptField(fieldnm="propNum6", fielddrpt="propNum6", nullable = "true", length = "16")
	private BigDecimal propNum6;
	
	@DrptField(fieldnm="propNum7", fielddrpt="propNum7", nullable = "true", length = "16")
	private BigDecimal propNum7;
	
	@DrptField(fieldnm="propNum8", fielddrpt="propNum8", nullable = "true", length = "16")
	private BigDecimal propNum8;
	
	@DrptField(fieldnm="propNum9", fielddrpt="propNum9", nullable = "true", length = "16")
	private BigDecimal propNum9;
	
	@DrptField(fieldnm="propNum10", fielddrpt="propNum10", nullable = "true", length = "16")
	private BigDecimal propNum10;
	
	@DrptField(fieldnm="propDate1", fielddrpt="propDate1", nullable = "true", length = "26")
	private java.util.Date propDate1;
	
	@DrptField(fieldnm="propDate2", fielddrpt="propDate2", nullable = "true", length = "26")
	private java.util.Date propDate2;
	
	@DrptField(fieldnm="propDate3", fielddrpt="propDate3", nullable = "true", length = "26")
	private java.util.Date propDate3;
	
	@DrptField(fieldnm="propDate4", fielddrpt="propDate4", nullable = "true", length = "26")
	private java.util.Date propDate4;
	
	@DrptField(fieldnm="propDate5", fielddrpt="propDate5", nullable = "true", length = "26")
	private java.util.Date propDate5;
	
	@DrptField(fieldnm="propDate6", fielddrpt="propDate6", nullable = "true", length = "26")
	private java.util.Date propDate6;
	
	@DrptField(fieldnm="propDate7", fielddrpt="propDate7", nullable = "true", length = "26")
	private java.util.Date propDate7;
	
	@DrptField(fieldnm="propDate8", fielddrpt="propDate8", nullable = "true", length = "26")
	private java.util.Date propDate8;
	
	@DrptField(fieldnm="propDate9", fielddrpt="propDate9", nullable = "true", length = "26")
	private java.util.Date propDate9;
	
	@DrptField(fieldnm="propDate10", fielddrpt="propDate10", nullable = "true", length = "26")
	private java.util.Date propDate10;
	
	@DrptField(fieldnm="businessUid", fielddrpt="businessUid", nullable = "true", length = "40")
	private String businessUid;
	
	@DrptField(fieldnm="businessStus", fielddrpt="businessStus", nullable = "true", length = "3")
	private String businessStus;
	
	@DrptField(fieldnm="unitUids", fielddrpt="unitUid", nullable = "false", length = "40")
	private List<String> unitUids;
	
	@DrptField(fieldnm="propKeyIds", fielddrpt="propKeyId", nullable = "false", length = "10")
	private List<Integer> propKeyIds;
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer value) {
		this.id = value;
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
	public String getPropTyp() {
		return this.propTyp;
	}
	
	public void setPropTyp(String value) {
		this.propTyp = value;
	}
	public String getPropKey() {
		return this.propKey;
	}
	
	public void setPropKey(String value) {
		this.propKey = value;
	}
	public Integer getPropKeyId() {
		return this.propKeyId;
	}
	
	public void setPropKeyId(Integer value) {
		this.propKeyId = value;
	}
	public String getStatusFlg() {
		return this.statusFlg;
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
	public String getPropFlg() {
		return this.propFlg;
	}
	
	public void setPropFlg(String value) {
		this.propFlg = value;
	}
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String value) {
		this.memo = value;
	}
	public String getPropStr1() {
		return this.propStr1;
	}
	
	public void setPropStr1(String value) {
		this.propStr1 = value;
	}
	public String getPropStr2() {
		return this.propStr2;
	}
	
	public void setPropStr2(String value) {
		this.propStr2 = value;
	}
	public String getPropStr3() {
		return this.propStr3;
	}
	
	public void setPropStr3(String value) {
		this.propStr3 = value;
	}
	public String getPropStr4() {
		return this.propStr4;
	}
	
	public void setPropStr4(String value) {
		this.propStr4 = value;
	}
	public String getPropStr5() {
		return this.propStr5;
	}
	
	public void setPropStr5(String value) {
		this.propStr5 = value;
	}
	public String getPropStr6() {
		return this.propStr6;
	}
	
	public void setPropStr6(String value) {
		this.propStr6 = value;
	}
	public String getPropStr7() {
		return this.propStr7;
	}
	
	public void setPropStr7(String value) {
		this.propStr7 = value;
	}
	public String getPropStr8() {
		return this.propStr8;
	}
	
	public void setPropStr8(String value) {
		this.propStr8 = value;
	}
	public String getPropStr9() {
		return this.propStr9;
	}
	
	public void setPropStr9(String value) {
		this.propStr9 = value;
	}
	public String getPropStr10() {
		return this.propStr10;
	}
	
	public void setPropStr10(String value) {
		this.propStr10 = value;
	}
	public Integer getPropInt1() {
		return this.propInt1;
	}
	
	public void setPropInt1(Integer value) {
		this.propInt1 = value;
	}
	public Integer getPropInt2() {
		return this.propInt2;
	}
	
	public void setPropInt2(Integer value) {
		this.propInt2 = value;
	}
	public Integer getPropInt3() {
		return this.propInt3;
	}
	
	public void setPropInt3(Integer value) {
		this.propInt3 = value;
	}
	public Integer getPropInt4() {
		return this.propInt4;
	}
	
	public void setPropInt4(Integer value) {
		this.propInt4 = value;
	}
	public Integer getPropInt5() {
		return this.propInt5;
	}
	
	public void setPropInt5(Integer value) {
		this.propInt5 = value;
	}
	public Integer getPropInt6() {
		return this.propInt6;
	}
	
	public void setPropInt6(Integer value) {
		this.propInt6 = value;
	}
	public Integer getPropInt7() {
		return this.propInt7;
	}
	
	public void setPropInt7(Integer value) {
		this.propInt7 = value;
	}
	public Integer getPropInt8() {
		return this.propInt8;
	}
	
	public void setPropInt8(Integer value) {
		this.propInt8 = value;
	}
	public Integer getPropInt9() {
		return this.propInt9;
	}
	
	public void setPropInt9(Integer value) {
		this.propInt9 = value;
	}
	public Integer getPropInt10() {
		return this.propInt10;
	}
	
	public void setPropInt10(Integer value) {
		this.propInt10 = value;
	}
	public BigDecimal getPropNum1() {
		return this.propNum1;
	}
	
	public void setPropNum1(BigDecimal value) {
		this.propNum1 = value;
	}
	public BigDecimal getPropNum2() {
		return this.propNum2;
	}
	
	public void setPropNum2(BigDecimal value) {
		this.propNum2 = value;
	}
	public BigDecimal getPropNum3() {
		return this.propNum3;
	}
	
	public void setPropNum3(BigDecimal value) {
		this.propNum3 = value;
	}
	public BigDecimal getPropNum4() {
		return this.propNum4;
	}
	
	public void setPropNum4(BigDecimal value) {
		this.propNum4 = value;
	}
	public BigDecimal getPropNum5() {
		return this.propNum5;
	}
	
	public void setPropNum5(BigDecimal value) {
		this.propNum5 = value;
	}
	public BigDecimal getPropNum6() {
		return this.propNum6;
	}
	
	public void setPropNum6(BigDecimal value) {
		this.propNum6 = value;
	}
	public BigDecimal getPropNum7() {
		return this.propNum7;
	}
	
	public void setPropNum7(BigDecimal value) {
		this.propNum7 = value;
	}
	public BigDecimal getPropNum8() {
		return this.propNum8;
	}
	
	public void setPropNum8(BigDecimal value) {
		this.propNum8 = value;
	}
	public BigDecimal getPropNum9() {
		return this.propNum9;
	}
	
	public void setPropNum9(BigDecimal value) {
		this.propNum9 = value;
	}
	public BigDecimal getPropNum10() {
		return this.propNum10;
	}
	
	public void setPropNum10(BigDecimal value) {
		this.propNum10 = value;
	}
	public java.util.Date getPropDate1() {
		return this.propDate1;
	}
	
	public void setPropDate1(java.util.Date value) {
		this.propDate1 = value;
	}
	public java.util.Date getPropDate2() {
		return this.propDate2;
	}
	
	public void setPropDate2(java.util.Date value) {
		this.propDate2 = value;
	}
	public java.util.Date getPropDate3() {
		return this.propDate3;
	}
	
	public void setPropDate3(java.util.Date value) {
		this.propDate3 = value;
	}
	public java.util.Date getPropDate4() {
		return this.propDate4;
	}
	
	public void setPropDate4(java.util.Date value) {
		this.propDate4 = value;
	}
	public java.util.Date getPropDate5() {
		return this.propDate5;
	}
	
	public void setPropDate5(java.util.Date value) {
		this.propDate5 = value;
	}
	public java.util.Date getPropDate6() {
		return this.propDate6;
	}
	
	public void setPropDate6(java.util.Date value) {
		this.propDate6 = value;
	}
	public java.util.Date getPropDate7() {
		return this.propDate7;
	}
	
	public void setPropDate7(java.util.Date value) {
		this.propDate7 = value;
	}
	public java.util.Date getPropDate8() {
		return this.propDate8;
	}
	
	public void setPropDate8(java.util.Date value) {
		this.propDate8 = value;
	}
	public java.util.Date getPropDate9() {
		return this.propDate9;
	}
	
	public void setPropDate9(java.util.Date value) {
		this.propDate9 = value;
	}
	public java.util.Date getPropDate10() {
		return this.propDate10;
	}
	
	public void setPropDate10(java.util.Date value) {
		this.propDate10 = value;
	}
	public String getBusinessUid() {
		return this.businessUid;
	}
	
	public void setBusinessUid(String value) {
		this.businessUid = value;
	}
	public String getBusinessStus() {
		return this.businessStus;
	}
	
	public void setBusinessStus(String value) {
		this.businessStus = value;
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
	
	public List<String> getUnitUids() {
		return unitUids;
	}

	public void setUnitUids(List<String> unitUids) {
		this.unitUids = unitUids;
	}
	
	public List<Integer> getPropKeyIds() {
		return propKeyIds;
	}

	public void setPropKeyIds(List<Integer> propKeyIds) {
		this.propKeyIds = propKeyIds;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

