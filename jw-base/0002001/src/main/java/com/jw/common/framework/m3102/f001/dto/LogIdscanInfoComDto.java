
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3102.f001.dto;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmAttribute;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * 
 * ## 类说明：
 * 	描述
 * @author    [zteng]   
 * @version   [V1.0, 2018年10月12日]
 * @package com.jw.common.framework.m3102.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年10月12日|zteng|新增|LogIdscanInfo.java新增
 */

public class LogIdscanInfoComDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -7340246071521570733L;

	/** 创建人 */
	private java.lang.String createdBy;
	/** 创建时间*/
	private java.util.Date createdDate;
	/** 创建人ID*/
	private String createdByUid;
	/** 创建人CODE */
	private String createdByCd;
	/** 创建人操作酒店编码 */
	private String createdUnitUid;
	/** 创建人操作酒店Cd */
	private String createdUnitCd;
	/** 更新人 */
	private java.lang.String modifiedBy;
	/** 更新时间 */
	private java.util.Date modifiedDate;
	/** 更新人ID */
	private String modifiedByUid;
	/** 更新人CODE */
	private String modifiedByCd;
	/** 更新人操作酒店编码 */
	private String modifiedUnitUid;
	/** 更新人操作酒店Cd */
	private String modifiedUnitCd;
	
	/** 主键 */
	private Integer id;
	
	@DrptField(fieldnm = "chainUid", fielddrpt = "集团代码 ", nullable = "false", length = "40")

	private String chainUid;
	
	
	@DrptField(fieldnm = "unitUid", fielddrpt = "单位代码 ", nullable = "false", length = "40")
	
	private String unitUid;
	
	
	@DrptField(fieldnm = "certificateNum", fielddrpt = "证件号 ", nullable = "false", length = "50")
	
	
	private String certificateNum;
	
	
	@DrptField(fieldnm = "certificatetypId", fielddrpt = "证件类型 ", nullable = "false", length = "10")
	
	private Integer certificatetypId;
	
	
	@DrptField(fieldnm = "certificatenationId", fielddrpt = "证件签发国家 ", nullable = "true", length = "10")
	private Integer certificatenationId;
	
	
	@DrptField(fieldnm = "guestNm", fielddrpt = "姓名 ", nullable = "true", length = "200")
	
	private String guestNm;
	
	
	@DrptField(fieldnm="countryDrpt", fielddrpt="国籍 ",paramtype=ConstantParm.ENUM_PARA_TYPE.COMMON_PARA,paramsubtype=ConstantParm.COUNTRY, nullable = "true", length = "100")

	private String countryDrpt;
	
	
	@DrptField(fieldnm="provinceId", fielddrpt="省 ",paramtype=ConstantParm.ENUM_PARA_TYPE.COMMON_PARA,paramsubtype=ConstantParm.PROVINCE, nullable = "true", length = "100")
	private String provinceId;
	
	
	@DrptField(fieldnm="cityId", fielddrpt="市 ",paramtype=ConstantParm.ENUM_PARA_TYPE.COMMON_PARA,paramsubtype=ConstantParm.CITY, nullable = "true", length = "100")
	private String cityId;
	
	
	@DrptField(fieldnm = "birthday", fielddrpt = "生日 ", nullable = "true", length = "13")
	private java.util.Date birthday;
	
	
	@DrptField(fieldnm="gender", fielddrpt="性别 ",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.GENDER, nullable = "true", length = "20")
	
	private String gender;
	
	
	@DrptField(fieldnm="nation", fielddrpt="民族 ",paramtype=ConstantParm.ENUM_PARA_TYPE.COMMON_PARA,paramsubtype=ConstantParm.NATION, nullable = "true", length = "100")
	private String nation;
	
	
	@DrptField(fieldnm = "address", fielddrpt = "住址 ", nullable = "true", length = "200")
	
	private String address;
	
	
	@DrptField(fieldnm = "certeffactstartDt", fielddrpt = "证件有效起期 ", nullable = "true", length = "13")
	private java.util.Date certeffactstartDt;
	
	
	@DrptField(fieldnm = "certeffactendDt", fielddrpt = "证件有效止期 ", nullable = "true", length = "13")
	private java.util.Date certeffactendDt;
	
	
	@DrptField(fieldnm = "guestId", fielddrpt = "宾客ID 不为空则表示此扫描信息已和预定宾客相关联", nullable = "true", length = "10")
	private Integer guestId;
	
	
	@DrptField(fieldnm = "certificatepicId", fielddrpt = "证件图片编号 ", nullable = "true", length = "10")
	private Integer certificatepicId;
	
	
	@DrptField(fieldnm = "memo", fielddrpt = "备注 ", nullable = "true", length = "4000")
	
	private String memo;
	
	
	@DrptField(fieldnm = "certificateBdt", fielddrpt = "证扫日期 ", nullable = "true", length = "13")
	private java.util.Date certificateBdt;
	
	
	@DrptField(fieldnm = "certificateDhms", fielddrpt = "证扫时间 ", nullable = "true", length = "29")
	private java.util.Date certificateDhms;
	
	
	@DrptField(fieldnm = "certificateUnitUid", fielddrpt = "证扫单位uid ", nullable = "true", length = "40")
	
	private String certificateUnitUid;
	
	
	@DrptField(fieldnm = "certificateUnitCd", fielddrpt = "证扫单位cd ", nullable = "true", length = "20")
	
	private String certificateUnitCd;
	
	
	@DrptField(fieldnm = "certificateUserUid", fielddrpt = "证扫操作员uid ", nullable = "true", length = "40")
	
	private String certificateUserUid;
	
	
	@DrptField(fieldnm = "certificateUserCd", fielddrpt = "证扫操作员代码 ", nullable = "true", length = "20")
	
	private String certificateUserCd;
	
	
	@DrptField(fieldnm = "certificateUserNm", fielddrpt = "证扫操作员姓名 ", nullable = "true", length = "200")
	
	private String certificateUserNm;
	
	
	@DrptField(fieldnm = "idscanId", fielddrpt = "idscanId", nullable = "false", length = "10")
	
	private Integer idscanId;
	
	
	@DrptField(fieldnm = "successFlg", fielddrpt = "successFlg",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.LOG_IDSCAN_INFO_SUCCESS_FLG, nullable = "true", length = "3")
	private String successFlg;
	
	@DrptField(fieldnm = "certificateTyp", fielddrpt = "证件类型 ", nullable = "true", length = "20")
	private String certificateTyp;
	
	@DrptField(fieldnm = "certificateNation", fielddrpt = "证件签发国家", nullable = "true", length = "20")
	private String certificateNation;
//	//图片
//	private byte[] picData;
	@DrptField(fieldnm = "picStr", fielddrpt = "图片")
	private String picStr;
	//图片的 名称
	@DrptField(fieldnm = "picUrl", fielddrpt = "图片名称")
	private String picUrl;
	@DrptField(fieldnm = "version", fielddrpt = "版本")
	private Integer version;
	

	
	public java.lang.String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}

	public java.util.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedByUid() {
		return createdByUid;
	}

	public void setCreatedByUid(String createdByUid) {
		this.createdByUid = createdByUid;
	}

	public String getCreatedByCd() {
		return createdByCd;
	}

	public void setCreatedByCd(String createdByCd) {
		this.createdByCd = createdByCd;
	}

	public String getCreatedUnitUid() {
		return createdUnitUid;
	}

	public void setCreatedUnitUid(String createdUnitUid) {
		this.createdUnitUid = createdUnitUid;
	}

	public String getCreatedUnitCd() {
		return createdUnitCd;
	}

	public void setCreatedUnitCd(String createdUnitCd) {
		this.createdUnitCd = createdUnitCd;
	}

	public java.lang.String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(java.lang.String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public java.util.Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedByUid() {
		return modifiedByUid;
	}

	public void setModifiedByUid(String modifiedByUid) {
		this.modifiedByUid = modifiedByUid;
	}

	public String getModifiedByCd() {
		return modifiedByCd;
	}

	public void setModifiedByCd(String modifiedByCd) {
		this.modifiedByCd = modifiedByCd;
	}

	public String getModifiedUnitUid() {
		return modifiedUnitUid;
	}

	public void setModifiedUnitUid(String modifiedUnitUid) {
		this.modifiedUnitUid = modifiedUnitUid;
	}

	public String getModifiedUnitCd() {
		return modifiedUnitCd;
	}

	public void setModifiedUnitCd(String modifiedUnitCd) {
		this.modifiedUnitCd = modifiedUnitCd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChainUid() {
		return chainUid;
	}

	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}

	public String getUnitUid() {
		return unitUid;
	}

	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

	public String getCertificateNum() {
		return certificateNum;
	}

	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}

	public Integer getCertificatetypId() {
		return certificatetypId;
	}

	public void setCertificatetypId(Integer certificatetypId) {
		this.certificatetypId = certificatetypId;
	}

	public Integer getCertificatenationId() {
		return certificatenationId;
	}

	public void setCertificatenationId(Integer certificatenationId) {
		this.certificatenationId = certificatenationId;
	}

	public String getGuestNm() {
		return guestNm;
	}

	public void setGuestNm(String guestNm) {
		this.guestNm = guestNm;
	}

	public String getCountryDrpt() {
		return countryDrpt;
	}

	public void setCountryDrpt(String countryDrpt) {
		this.countryDrpt = countryDrpt;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public java.util.Date getBirthday() {
		return birthday;
	}

	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public java.util.Date getCerteffactstartDt() {
		return certeffactstartDt;
	}

	public void setCerteffactstartDt(java.util.Date certeffactstartDt) {
		this.certeffactstartDt = certeffactstartDt;
	}

	public java.util.Date getCerteffactendDt() {
		return certeffactendDt;
	}

	public void setCerteffactendDt(java.util.Date certeffactendDt) {
		this.certeffactendDt = certeffactendDt;
	}

	public Integer getGuestId() {
		return guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public Integer getCertificatepicId() {
		return certificatepicId;
	}

	public void setCertificatepicId(Integer certificatepicId) {
		this.certificatepicId = certificatepicId;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public java.util.Date getCertificateBdt() {
		return certificateBdt;
	}

	public void setCertificateBdt(java.util.Date certificateBdt) {
		this.certificateBdt = certificateBdt;
	}

	public java.util.Date getCertificateDhms() {
		return certificateDhms;
	}

	public void setCertificateDhms(java.util.Date certificateDhms) {
		this.certificateDhms = certificateDhms;
	}

	public String getCertificateUnitUid() {
		return certificateUnitUid;
	}

	public void setCertificateUnitUid(String certificateUnitUid) {
		this.certificateUnitUid = certificateUnitUid;
	}

	public String getCertificateUnitCd() {
		return certificateUnitCd;
	}

	public void setCertificateUnitCd(String certificateUnitCd) {
		this.certificateUnitCd = certificateUnitCd;
	}

	public String getCertificateUserUid() {
		return certificateUserUid;
	}

	public void setCertificateUserUid(String certificateUserUid) {
		this.certificateUserUid = certificateUserUid;
	}

	public String getCertificateUserCd() {
		return certificateUserCd;
	}

	public void setCertificateUserCd(String certificateUserCd) {
		this.certificateUserCd = certificateUserCd;
	}

	public String getCertificateUserNm() {
		return certificateUserNm;
	}

	public void setCertificateUserNm(String certificateUserNm) {
		this.certificateUserNm = certificateUserNm;
	}

	public Integer getIdscanId() {
		return idscanId;
	}

	public void setIdscanId(Integer idscanId) {
		this.idscanId = idscanId;
	}

	public String getSuccessFlg() {
		return successFlg;
	}

	public void setSuccessFlg(String successFlg) {
		this.successFlg = successFlg;
	}

	public String getCertificateTyp() {
		return certificateTyp;
	}

	public void setCertificateTyp(String certificateTyp) {
		this.certificateTyp = certificateTyp;
	}

	public String getCertificateNation() {
		return certificateNation;
	}

	public void setCertificateNation(String certificateNation) {
		this.certificateNation = certificateNation;
	}

	public String getPicStr() {
		return picStr;
	}

	public void setPicStr(String picStr) {
		this.picStr = picStr;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	
	
	

}

