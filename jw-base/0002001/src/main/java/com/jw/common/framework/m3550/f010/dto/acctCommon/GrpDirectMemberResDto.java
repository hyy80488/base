/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ## 类说明：
 * 	直销会员信息信息传输对象
 * @author    [lilin]   
 * @version   [V1.0, 2018年10月17日]
 * @package com.jw.common.framework.m3550.f010.dto.acctCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年10月17日|lilin|新增|GrpDirectMemberResDto.java新增
*/
public class GrpDirectMemberResDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -7449073855844573309L;
	
	private String jwHotelCode;
	private String unitNm;
	private Integer memberbankId;
	private String memberbankNm;
	private String memberNo;
	private String memberNm;
	private Integer certificatetypId;
	private String certificateIdcd;
	private String gender;
	private Integer countryId;
	private Integer provinceId;
	private Integer cityId;
	private Integer districtId;
	private String address1;
	private String contactCtno;
	private Long birthday;
	private Long joinDate;
	private String mcardNo;
	private String realcardNum;
	private BigDecimal mctrnBal;
	private BigDecimal totalPoint;
	private BigDecimal pointBal;
	
	
	public String getJwHotelCode() {
		return jwHotelCode;
	}
	public void setJwHotelCode(String jwHotelCode) {
		this.jwHotelCode = jwHotelCode;
	}
	public String getUnitNm() {
		return unitNm;
	}
	public void setUnitNm(String unitNm) {
		this.unitNm = unitNm;
	}
	public Integer getMemberbankId() {
		return memberbankId;
	}
	public void setMemberbankId(Integer memberbankId) {
		this.memberbankId = memberbankId;
	}
	public String getMemberbankNm() {
		return memberbankNm;
	}
	public void setMemberbankNm(String memberbankNm) {
		this.memberbankNm = memberbankNm;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberNm() {
		return memberNm;
	}
	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}
	public Integer getCertificatetypId() {
		return certificatetypId;
	}
	public void setCertificatetypId(Integer certificatetypId) {
		this.certificatetypId = certificatetypId;
	}
	public String getCertificateIdcd() {
		return certificateIdcd;
	}
	public void setCertificateIdcd(String certificateIdcd) {
		this.certificateIdcd = certificateIdcd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getContactCtno() {
		return contactCtno;
	}
	public void setContactCtno(String contactCtno) {
		this.contactCtno = contactCtno;
	}
	public Long getBirthday() {
		return birthday;
	}
	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}
	public Long getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Long joinDate) {
		this.joinDate = joinDate;
	}
	public String getMcardNo() {
		return mcardNo;
	}
	public void setMcardNo(String mcardNo) {
		this.mcardNo = mcardNo;
	}
	public String getRealcardNum() {
		return realcardNum;
	}
	public void setRealcardNum(String realcardNum) {
		this.realcardNum = realcardNum;
	}
	public BigDecimal getMctrnBal() {
		return mctrnBal;
	}
	public void setMctrnBal(BigDecimal mctrnBal) {
		this.mctrnBal = mctrnBal;
	}
	public BigDecimal getTotalPoint() {
		return totalPoint;
	}
	public void setTotalPoint(BigDecimal totalPoint) {
		this.totalPoint = totalPoint;
	}
	public BigDecimal getPointBal() {
		return pointBal;
	}
	public void setPointBal(BigDecimal pointBal) {
		this.pointBal = pointBal;
	}

}
