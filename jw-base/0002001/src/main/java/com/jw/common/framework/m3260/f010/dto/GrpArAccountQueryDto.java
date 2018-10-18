
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3260.f010.dto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	应收账户QUERY信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-07-19]
 * @package com.jw.hms.group.m3260.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-07-19|jianana|新增|GrpArAccountQueryDto新增
 */
@DrptDto(dtonm = "应收账户QUERY信息数据传输对象",dtodrpt="应收账户QUERY信息数据传输对象")
public class GrpArAccountQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 945694953531169947L;
	@DrptField(fieldnm="orderColumn ",fielddrpt="排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm="currentPage",fielddrpt="当前页")
	private  Integer currentPage;
	@DrptField(fieldnm="pageSize ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	
	@DrptField(fieldnm="id", fielddrpt="ID ID字段", nullable = "false", length = "10")
	private Integer id;
	@DrptField(fieldnm="arTypeId", fielddrpt="帐户类型", nullable = "false", length = "4")
	private Integer arTypeId;
	@DrptField(fieldnm="chainUid", fielddrpt="集团代码 ", nullable = "false", length = "40")
	private String chainUid;
	//挂账酒店只能选择和管理酒店国籍一致的应收账户。应收账户的本位币种为管理单位所使用的本位币
	@DrptField(fieldnm="mngUnitUid", fielddrpt="所属单位代码 ", nullable = "false", length = "40")
	private String mngUnitUid;
	
	@DrptField(fieldnm="arNo", fielddrpt="应收账户编码", nullable = "false", length = "20")
	private String arNo;
	
	@DrptField(fieldnm="arNos", fielddrpt="应收账户编码 ", nullable = "true", length = "20")
	private List<String> arNos;
	
	@DrptField(fieldnm="arRef", fielddrpt="应收账户参考号 ", nullable = "true", length = "40")
	private String arRef;
	
	@DrptField(fieldnm="arNm", fielddrpt="应收账户名称 ", nullable = "false", length = "200")
	private String arNm;
	
	@DrptField(fieldnm="arNmRef", fielddrpt="简称 参考号", nullable = "true", length = "100")
	private String arNmRef;
	
	@DrptField(fieldnm="arNmEn", fielddrpt="英文名称 ", nullable = "true", length = "100")
	private String arNmEn;
	
	@DrptField(fieldnm="indexNm", fielddrpt="名称关键字 为名称查询进行冗余 英文名/拼音/中文名/简称", nullable = "false", length = "200")
	private String indexNm;
	
	@DrptField(fieldnm="arStus", fielddrpt="状态标识 NML：正常，PER：永久账户，CXL：作废", nullable = "false", length = "3")
	private String arStus;
	@DrptField(fieldnm="mutiArStus",fielddrpt="mutiArStus")
	private List<String> mutiArStus;
	
	public List<String> getArNos() {
		return arNos;
	}

	public void setArNos(List<String> arNos) {
		this.arNos = arNos;
	}

	public List<String> getMutiArStus() {
		return mutiArStus;
	}

	public void setMutiArStus(List<String> mutiArStus) {
		this.mutiArStus = mutiArStus;
	}

	@DrptField(fieldnm="arFlg", fielddrpt="账户属性 N：Normal AR Account B：Bank Account for Credit card O：Owner Account  T：Trust Account or Revenue Pool Account F： Reserve Account 默认N", nullable = "false", length = "3")
	private String arFlg;
	
	@DrptField(fieldnm="primaryFlg", fielddrpt="主账户标志 1：主账户；0：非主账户", nullable = "false", length = "3")
	private String primaryFlg;
	
	@DrptField(fieldnm="balanceFlg", fielddrpt="余额是否为零标志 1：为零；0：不为零", nullable = "false", length = "3")
	private String balanceFlg;
	
	@DrptField(fieldnm="yestodayInvc", fielddrpt="昨日新发票标志 1：是；0：否", nullable = "false", length = "3")
	private String yestodayInvc;
	
	public Integer getArTypeId() {
		return arTypeId;
	}

	public void setArTypeId(Integer arTypeId) {
		this.arTypeId = arTypeId;
	}

	public String getBalanceFlg() {
		return balanceFlg;
	}

	public void setBalanceFlg(String balanceFlg) {
		this.balanceFlg = balanceFlg;
	}

	public String getYestodayInvc() {
		return yestodayInvc;
	}

	public void setYestodayInvc(String yestodayInvc) {
		this.yestodayInvc = yestodayInvc;
	}

	public String getTodayTrnAcct() {
		return todayTrnAcct;
	}

	public void setTodayTrnAcct(String todayTrnAcct) {
		this.todayTrnAcct = todayTrnAcct;
	}

	public String getLimtAcct() {
		return limtAcct;
	}

	public void setLimtAcct(String limtAcct) {
		this.limtAcct = limtAcct;
	}


	@DrptField(fieldnm="todayTrnAcct", fielddrpt="当日有交易帐户标志 1：是；0：否", nullable = "false", length = "3")
	private String todayTrnAcct;
	

	@DrptField(fieldnm="limtAcct", fielddrpt="超限标志 1：是；0：否", nullable = "false", length = "3")
	private String limtAcct;
	
	@DrptField(fieldnm="parentArNo", fielddrpt="主账户账号 ", nullable = "true", length = "20")
	private String parentArNo;
	
	@DrptField(fieldnm="profileNo", fielddrpt="关联客史编号 ", nullable = "true", length = "20")
	private String profileNo;
	
	@DrptField(fieldnm="corpNo", fielddrpt="关联法人客户编码 ", nullable = "true", length = "20")
	private String corpNo;
	
	@DrptField(fieldnm="artypeId", fielddrpt="应收账户类型 ", nullable = "false", length = "10")
	private Integer artypeId;
	
	@DrptField(fieldnm="arpaycycleId", fielddrpt="应收账户付款周期 ", nullable = "false", length = "10")
	private Integer arpaycycleId;
	
	@DrptField(fieldnm="arstatcycleId", fielddrpt="应收账户对账周期 ", nullable = "false", length = "10")
	private Integer arstatcycleId;
	
	@DrptField(fieldnm="countryId", fielddrpt="国籍 statement默认地址信息", nullable = "true", length = "10")
	private Integer countryId;
	
	@DrptField(fieldnm="provinceId", fielddrpt="省 同上", nullable = "true", length = "10")
	private Integer provinceId;
	
	@DrptField(fieldnm="cityId", fielddrpt="市 同上", nullable = "true", length = "10")
	private Integer cityId;
	
	@DrptField(fieldnm="districtId", fielddrpt="城区 同上", nullable = "true", length = "10")
	private Integer districtId;
	
	@DrptField(fieldnm="address1", fielddrpt="地址1 同上", nullable = "true", length = "200")
	private String address1;
	
	@DrptField(fieldnm="address2", fielddrpt="地址2 同上", nullable = "true", length = "200")
	private String address2;
	
	@DrptField(fieldnm="address3", fielddrpt="地址3 同上", nullable = "true", length = "200")
	private String address3;
	
	@DrptField(fieldnm="postNo", fielddrpt="邮编 同上", nullable = "true", length = "40")
	private String postNo;
	
	@DrptField(fieldnm="teleCtno", fielddrpt="电话号码 ", nullable = "true", length = "100")
	private String teleCtno;
	
	@DrptField(fieldnm="emailEml", fielddrpt="电子邮件地址  ", nullable = "true", length = "100")
	private String emailEml;
	
	@DrptField(fieldnm="contacttypId", fielddrpt="联系方式 ", nullable = "true", length = "10")
	private Integer contacttypId;
	
	public String getContactNm() {
		return contactNm;
	}

	public void setContactNm(String contactNm) {
		this.contactNm = contactNm;
	}

	@DrptField(fieldnm="contactCtno", fielddrpt="联系号码 敏感信息", nullable = "true", length = "100")
	private String contactCtno;
	@DrptField(fieldnm="contactNm", fielddrpt="联系人", nullable = "true", length = "200")
	private String contactNm;
	
	@DrptField(fieldnm="guarantorNo", fielddrpt="担保人 ", nullable = "true", length = "20")
	private String guarantorNo;
	
	@DrptField(fieldnm="salerId", fielddrpt="销售员编号 ", nullable = "true", length = "10")
	private Integer salerId;
	
	@DrptField(fieldnm="languageId", fielddrpt="语言 statement默认语种", nullable = "true", length = "10")
	private Integer languageId;
	
	@DrptField(fieldnm="trustStartdt", fielddrpt="信任账户开始日期 ", nullable = "true", length = "13")
	private java.util.Date trustStartdt;
	
	@DrptField(fieldnm="trustEnddt", fielddrpt="信任账户结束日期 ", nullable = "true", length = "13")
	private java.util.Date trustEnddt;
	
	@DrptField(fieldnm="postFlg", fielddrpt="挂账受限 1：挂账无限制，2：禁止挂账", nullable = "false", length = "3")
	private String postFlg;
	
	@DrptField(fieldnm="creditLimit", fielddrpt="应收欠款限额 ", nullable = "true", length = "12")
	private BigDecimal creditLimit;
	
	@DrptField(fieldnm="arBal", fielddrpt="账户余额 ", nullable = "true", length = "12")
	private BigDecimal arBal;
	
	@DrptField(fieldnm="invcBal", fielddrpt="发票余额 ", nullable = "true", length = "12")
	private BigDecimal invcBal;
	
	@DrptField(fieldnm="recpBal", fielddrpt="收据余额 ", nullable = "true", length = "12")
	private BigDecimal recpBal;
	
	@DrptField(fieldnm="securAmt", fielddrpt="保证金 ", nullable = "true", length = "12")
	private BigDecimal securAmt;
	
	@DrptField(fieldnm="disputeAmt", fielddrpt="争议金额 ", nullable = "true", length = "12")
	private BigDecimal disputeAmt;
	
	@DrptField(fieldnm="arStusMsg", fielddrpt="账户状态消息 账户被设置为受限时的提示信息", nullable = "true", length = "500")
	private String arStusMsg;
	
	@DrptField(fieldnm="memo", fielddrpt="备注 ", nullable = "true", length = "2000")
	private String memo;
	
	
	@DrptField(fieldnm="exceptArNo", fielddrpt="忽略的账户 ")
	private String exceptArNo;
	
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
	public String getMngUnitUid() {
		return this.mngUnitUid;
	}
	
	public void setMngUnitUid(String value) {
		this.mngUnitUid = value;
	}
	public String getArNo() {
		return this.arNo;
	}
	
	public void setArNo(String value) {
		this.arNo = value;
	}
	public String getArRef() {
		return this.arRef;
	}
	
	public void setArRef(String value) {
		this.arRef = value;
	}
	public String getArNm() {
		return this.arNm;
	}
	
	public void setArNm(String value) {
		this.arNm = value;
	}
	public String getArNmRef() {
		return this.arNmRef;
	}
	
	public void setArNmRef(String value) {
		this.arNmRef = value;
	}
	public String getArNmEn() {
		return this.arNmEn;
	}
	
	public void setArNmEn(String value) {
		this.arNmEn = value;
	}
	public String getIndexNm() {
		return this.indexNm;
	}
	
	public void setIndexNm(String value) {
		this.indexNm = value;
	}
	public String getArStus() {
		return this.arStus;
	}
	
	public void setArStus(String value) {
		this.arStus = value;
	}
	public String getArFlg() {
		return this.arFlg;
	}
	
	public void setArFlg(String value) {
		this.arFlg = value;
	}
	public String getPrimaryFlg() {
		return this.primaryFlg;
	}
	
	public void setPrimaryFlg(String value) {
		this.primaryFlg = value;
	}
	public String getParentArNo() {
		return this.parentArNo;
	}
	
	public void setParentArNo(String value) {
		this.parentArNo = value;
	}
	public String getProfileNo() {
		return this.profileNo;
	}
	
	public void setProfileNo(String value) {
		this.profileNo = value;
	}
	public String getCorpNo() {
		return this.corpNo;
	}
	
	public void setCorpNo(String value) {
		this.corpNo = value;
	}
	public Integer getArtypeId() {
		return this.artypeId;
	}
	
	public void setArtypeId(Integer value) {
		this.artypeId = value;
	}
	public Integer getArpaycycleId() {
		return this.arpaycycleId;
	}
	
	public void setArpaycycleId(Integer value) {
		this.arpaycycleId = value;
	}
	public Integer getArstatcycleId() {
		return this.arstatcycleId;
	}
	
	public void setArstatcycleId(Integer value) {
		this.arstatcycleId = value;
	}
	public Integer getCountryId() {
		return this.countryId;
	}
	
	public void setCountryId(Integer value) {
		this.countryId = value;
	}
	public Integer getProvinceId() {
		return this.provinceId;
	}
	
	public void setProvinceId(Integer value) {
		this.provinceId = value;
	}
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	public Integer getDistrictId() {
		return this.districtId;
	}
	
	public void setDistrictId(Integer value) {
		this.districtId = value;
	}
	public String getAddress1() {
		return this.address1;
	}
	
	public void setAddress1(String value) {
		this.address1 = value;
	}
	public String getAddress2() {
		return this.address2;
	}
	
	public void setAddress2(String value) {
		this.address2 = value;
	}
	public String getAddress3() {
		return this.address3;
	}
	
	public void setAddress3(String value) {
		this.address3 = value;
	}
	public String getPostNo() {
		return this.postNo;
	}
	
	public void setPostNo(String value) {
		this.postNo = value;
	}
	public String getTeleCtno() {
		return this.teleCtno;
	}
	
	public void setTeleCtno(String value) {
		this.teleCtno = value;
	}
	public String getEmailEml() {
		return this.emailEml;
	}
	
	public void setEmailEml(String value) {
		this.emailEml = value;
	}
	public Integer getContacttypId() {
		return this.contacttypId;
	}
	
	public void setContacttypId(Integer value) {
		this.contacttypId = value;
	}
	public String getContactCtno() {
		return this.contactCtno;
	}
	
	public void setContactCtno(String value) {
		this.contactCtno = value;
	}
	public String getGuarantorNo() {
		return this.guarantorNo;
	}
	
	public void setGuarantorNo(String value) {
		this.guarantorNo = value;
	}
	public Integer getSalerId() {
		return this.salerId;
	}
	
	public void setSalerId(Integer value) {
		this.salerId = value;
	}
	public Integer getLanguageId() {
		return this.languageId;
	}
	
	public void setLanguageId(Integer value) {
		this.languageId = value;
	}
	public java.util.Date getTrustStartdt() {
		return this.trustStartdt;
	}
	
	public void setTrustStartdt(java.util.Date value) {
		this.trustStartdt = value;
	}
	public java.util.Date getTrustEnddt() {
		return this.trustEnddt;
	}
	
	public void setTrustEnddt(java.util.Date value) {
		this.trustEnddt = value;
	}
	public String getPostFlg() {
		return this.postFlg;
	}
	
	public void setPostFlg(String value) {
		this.postFlg = value;
	}
	public BigDecimal getCreditLimit() {
		return this.creditLimit;
	}
	
	public void setCreditLimit(BigDecimal value) {
		this.creditLimit = value;
	}
	public BigDecimal getArBal() {
		return this.arBal;
	}
	
	public void setArBal(BigDecimal value) {
		this.arBal = value;
	}
	public BigDecimal getInvcBal() {
		return this.invcBal;
	}
	
	public void setInvcBal(BigDecimal value) {
		this.invcBal = value;
	}
	public BigDecimal getRecpBal() {
		return this.recpBal;
	}
	
	public void setRecpBal(BigDecimal value) {
		this.recpBal = value;
	}
	public BigDecimal getSecurAmt() {
		return this.securAmt;
	}
	
	public void setSecurAmt(BigDecimal value) {
		this.securAmt = value;
	}
	public BigDecimal getDisputeAmt() {
		return this.disputeAmt;
	}
	
	public void setDisputeAmt(BigDecimal value) {
		this.disputeAmt = value;
	}
	public String getArStusMsg() {
		return this.arStusMsg;
	}
	
	public void setArStusMsg(String value) {
		this.arStusMsg = value;
	}
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String value) {
		this.memo = value;
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
	
	public String getExceptArNo() {
		return exceptArNo;
	}

	public void setExceptArNo(String exceptArNo) {
		this.exceptArNo = exceptArNo;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

