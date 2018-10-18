
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3540.f010.dto;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Transient;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.annotation.TrimProcessNeeded;
import com.jw.base.framework.core.util.CodeBean;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	会员信息QUERY信息数据传输对象
 * @author    [zteng]   
 * @version   [V1.0, 2017-12-12]
 * @package com.jw.hms.crm.m3540.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-12-12|zteng|新增|LpsBnsMemberQueryDto新增
 */
@DrptDto(dtonm = "会员信息QUERY信息数据传输对象",dtodrpt="会员信息QUERY信息数据传输对象")
public class LpsBnsMemberQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -8173828304825840903L;
	@DrptField(fieldnm="排序 ",fielddrpt="排序字段 例如：{字段1,升序},{字段2,降序}")
	private List<CodeBean> orderColumn;
	@DrptField(fieldnm="当前页",fielddrpt="当前页")
	private  Integer currentPage;
	@DrptField(fieldnm="每页记录数量 ",fielddrpt="每页记录数量")
	private  Integer pageSize;
	
	@DrptField(fieldnm="ids", fielddrpt="id", nullable = "false", length = "10")
	private List<Integer> ids;
	
	@DrptField(fieldnm="fastQuery", fielddrpt="快速查询", nullable = "true", length = "40")
	private String fastQuery;
	
	@DrptField(fieldnm="id", fielddrpt="id", nullable = "false", length = "10")
	private Integer id;
	
	@DrptField(fieldnm="chainUid", fielddrpt="chainUid", nullable = "false", length = "40")
	private String chainUid;
	
	@DrptField(fieldnm="memberNo", fielddrpt="会员号", nullable = "false", length = "20")
	private String memberNo;
	
	@DrptField(fieldnm="unitUid", fielddrpt="unitUid", nullable = "true", length = "40")
	private String unitUid;
	
	@DrptField(fieldnm="profileNo", fielddrpt="客史号", nullable = "true", length = "20")
	private String profileNo;
	@DrptField(fieldnm="profileNos", fielddrpt="客史号", nullable = "true", length = "20")
	private List<String> profileNos;
	@Transient
	public List<String> getProfileNos() {
		return profileNos;
	}

	public void setProfileNos(List<String> profileNos) {
		this.profileNos = profileNos;
	}

	@DrptField(fieldnm="seq", fielddrpt="seq", nullable = "true", length = "10")
	private Integer seq;
	
	@DrptField(fieldnm="statusFlg", fielddrpt="statusFlg", nullable = "false", length = "3")
	private String statusFlg;
	
	@DrptField(fieldnm="memberRef", fielddrpt="memberRef", nullable = "true", length = "40")
	private String memberRef;
	
	@DrptField(fieldnm="memberStus", fielddrpt="memberStus", nullable = "true", length = "3")
	private String memberStus;
	
	@DrptField(fieldnm="membertypId", fielddrpt="membertypId", nullable = "true", length = "10")
	private Integer membertypId;
	
	@DrptField(fieldnm="memberrankId", fielddrpt="memberrankId", nullable = "false", length = "10")
	private Integer memberrankId;
	
	@DrptField(fieldnm="anonymousFlg", fielddrpt="anonymousFlg", nullable = "true", length = "3")
	private String anonymousFlg;
	
	@DrptField(fieldnm="firstNm", fielddrpt="firstNm", nullable = "true", length = "100")
	private String firstNm;
	
	@DrptField(fieldnm="middleNm", fielddrpt="middleNm", nullable = "true", length = "100")
	private String middleNm;
	
	@DrptField(fieldnm="lastNm", fielddrpt="lastNm", nullable = "true", length = "100")
	private String lastNm;
	
	@DrptField(fieldnm="altNm", fielddrpt="altNm", nullable = "true", length = "200")
	private String altNm;
	
	@DrptField(fieldnm="indexNm", fielddrpt="indexNm", nullable = "true", length = "200")
	private String indexNm;
	
	@DrptField(fieldnm="nationId", fielddrpt="nationId", nullable = "true", length = "10")
	private Integer nationId;
	
	@DrptField(fieldnm="birthplaceId", fielddrpt="birthplaceId", nullable = "true", length = "10")
	private Integer birthplaceId;
	
	@DrptField(fieldnm="birthday", fielddrpt="birthday", nullable = "true", length = "13")
	private java.util.Date birthday;
	
	@DrptField(fieldnm="birthdate", fielddrpt="birthdate", nullable = "true", length = "13")
	private java.util.Date birthdate;
	
	@DrptField(fieldnm="countryId", fielddrpt="countryId", nullable = "true", length = "10")
	private Integer countryId;
	
	@DrptField(fieldnm="provinceId", fielddrpt="provinceId", nullable = "true", length = "10")
	private Integer provinceId;
	
	@DrptField(fieldnm="cityId", fielddrpt="cityId", nullable = "true", length = "10")
	private Integer cityId;
	
	@DrptField(fieldnm="certificatetypId", fielddrpt="certificatetypId", nullable = "true", length = "10")
	private Integer certificatetypId;
	
	@DrptField(fieldnm="crtfContryId", fielddrpt="crtfContryId", nullable = "true", length = "10")
	private Integer crtfContryId;
	
	@DrptField(fieldnm="certificateIdcd", fielddrpt="certificateIdcd", nullable = "true", length = "50")
	private String certificateIdcd;
	
	@DrptField(fieldnm="crtfExpiryDt", fielddrpt="crtfExpiryDt", nullable = "true", length = "13")
	private java.util.Date crtfExpiryDt;
	
	@DrptField(fieldnm="loginphoneCtno", fielddrpt="loginphoneCtno", nullable = "true", length = "100")
	private String loginphoneCtno;
	
	@DrptField(fieldnm="loginemailEml", fielddrpt="loginemailEml", nullable = "true", length = "100")
	private String loginemailEml;
	
	@DrptField(fieldnm="address1", fielddrpt="address1", nullable = "true", length = "200")
	private String address1;
	
	@DrptField(fieldnm="address2", fielddrpt="address2", nullable = "true", length = "200")
	private String address2;
	
	@DrptField(fieldnm="address3", fielddrpt="address3", nullable = "true", length = "200")
	private String address3;
	
	@DrptField(fieldnm="rcountryId", fielddrpt="rcountryId", nullable = "true", length = "10")
	private Integer rcountryId;
	
	@DrptField(fieldnm="rprovinceId", fielddrpt="rprovinceId", nullable = "true", length = "10")
	private Integer rprovinceId;
	
	@DrptField(fieldnm="rcityId", fielddrpt="rcityId", nullable = "true", length = "10")
	private Integer rcityId;
	
	@DrptField(fieldnm="districtId", fielddrpt="districtId", nullable = "true", length = "10")
	private Integer districtId;
	
	@DrptField(fieldnm="postNo", fielddrpt="postNo", nullable = "true", length = "40")
	private String postNo;
	
	@DrptField(fieldnm="loginCd", fielddrpt="loginCd", nullable = "true", length = "100")
	private String loginCd;
	
	@DrptField(fieldnm="loginPwd", fielddrpt="loginPwd", nullable = "true", length = "100")
	private String loginPwd;
	
	@DrptField(fieldnm="primaryFlg", fielddrpt="primaryFlg", nullable = "true", length = "3")
	private String primaryFlg;
	
	@DrptField(fieldnm="getwayId", fielddrpt="getwayId", nullable = "true", length = "10")
	private Integer getwayId;
	
	@DrptField(fieldnm="otherWay", fielddrpt="otherWay", nullable = "true", length = "10")
	private Integer otherWay;
	
	@DrptField(fieldnm="jointypId", fielddrpt="jointypId", nullable = "true", length = "10")
	private Integer jointypId;
	
	@DrptField(fieldnm="referrer", fielddrpt="referrer", nullable = "true", length = "40")
	private String referrer;
	
	@DrptField(fieldnm="salerId", fielddrpt="salerId", nullable = "true", length = "10")
	private Integer salerId;
	
	@DrptField(fieldnm="referorg", fielddrpt="referorg", nullable = "true", length = "3")
	private String referorg;
	
	@DrptField(fieldnm="referunitUid", fielddrpt="referunitUid", nullable = "true", length = "10")
	private Integer referunitUid;
	
	@DrptField(fieldnm="referdeptId", fielddrpt="referdeptId", nullable = "true", length = "10")
	private Integer referdeptId;
	
	@DrptField(fieldnm="referemployeeId", fielddrpt="referemployeeId", nullable = "true", length = "10")
	private Integer referemployeeId;
	
	@DrptField(fieldnm="refermemberNo", fielddrpt="refermemberNo", nullable = "true", length = "20")
	private String refermemberNo;
	
	@DrptField(fieldnm="referprofileNo", fielddrpt="referprofileNo", nullable = "true", length = "20")
	private String referprofileNo;
	
	@DrptField(fieldnm="joinDate", fielddrpt="joinDate", nullable = "true", length = "13")
	private java.util.Date joinDate;
	
	@DrptField(fieldnm="validstDate", fielddrpt="validstDate", nullable = "true", length = "13")
	private java.util.Date validstDate;
	
	@DrptField(fieldnm="validedDate", fielddrpt="validedDate", nullable = "true", length = "13")
	private java.util.Date validedDate;
	
	@DrptField(fieldnm="quitDate", fielddrpt="quitDate", nullable = "true", length = "13")
	private java.util.Date quitDate;
	
	@DrptField(fieldnm="quitreasonId", fielddrpt="quitreasonId", nullable = "true", length = "10")
	private Integer quitreasonId;
	
	@DrptField(fieldnm="note", fielddrpt="note", nullable = "true", length = "500")
	private String note;
	
	@DrptField(fieldnm="lastconsumeDate", fielddrpt="lastconsumeDate", nullable = "true", length = "13")
	private java.util.Date lastconsumeDate;
	
	@DrptField(fieldnm="consumeAmount", fielddrpt="consumeAmount", nullable = "true", length = "16")
	private BigDecimal consumeAmount;
	
	@DrptField(fieldnm="consumeTimes", fielddrpt="consumeTimes", nullable = "true", length = "16")
	private BigDecimal consumeTimes;
	
	@DrptField(fieldnm="consumeNights", fielddrpt="consumeNights", nullable = "true", length = "16")
	private BigDecimal consumeNights;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "totalCharge", fielddrpt = "totalCharge", nullable = "true", length = "16")
	private BigDecimal totalCharge;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "mctrnBal", fielddrpt = "mctrnBal", nullable = "true", length = "16")
	private BigDecimal mctrnBal;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "authAmt", fielddrpt = "authAmt", nullable = "true", length = "16")
	private BigDecimal authAmt;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "totalPoint", fielddrpt = "总积分", nullable = "true", length = "16",logged = ENUM_LOGGED.YES)
	private BigDecimal totalPoint;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "pointBal", fielddrpt = "可用积分余额", nullable = "true", length = "16")
	private BigDecimal pointBal;
	
	@DrptField(fieldnm="totalExp", fielddrpt="totalExp", nullable = "true", length = "10")
	private Integer totalExp;
	
	@DrptField(fieldnm="memo", fielddrpt="memo", nullable = "true", length = "1000")
	private String memo;
	
	@DrptField(fieldnm="upgradeFlg", fielddrpt="upgradeFlg", nullable = "true", length = "3")
	private String upgradeFlg;
	
	@DrptField(fieldnm="upMemberrankId", fielddrpt="upMemberrankId", nullable = "true", length = "10")
	private Integer upMemberrankId;
	
	@DrptField(fieldnm="downMemberrankId", fielddrpt="downMemberrankId", nullable = "true", length = "10")
	private Integer downMemberrankId;
	
	@DrptField(fieldnm="registBdt", fielddrpt="registBdt", nullable = "true", length = "13")
	private java.util.Date registBdt;
	
	@DrptField(fieldnm="registDhms", fielddrpt="registDhms", nullable = "true", length = "29")
	private java.util.Date registDhms;
	
	@DrptField(fieldnm="registUnitUid", fielddrpt="registUnitUid", nullable = "true", length = "40")
	private String registUnitUid;
	
	@DrptField(fieldnm="registUnitCd", fielddrpt="registUnitCd", nullable = "true", length = "20")
	private String registUnitCd;
	
	@DrptField(fieldnm="registUserUid", fielddrpt="registUserUid", nullable = "true", length = "40")
	private String registUserUid;
	
	@DrptField(fieldnm="registUserCd", fielddrpt="registUserCd", nullable = "true", length = "20")
	private String registUserCd;
	
	@DrptField(fieldnm="registUserNm", fielddrpt="registUserNm", nullable = "true", length = "200")
	private String registUserNm;
	
	@DrptField(fieldnm="upUpgradepolicyId", fielddrpt="upUpgradepolicyId", nullable = "true", length = "10")
	private Integer upUpgradepolicyId;
	
	@DrptField(fieldnm="downUpgradepolicyId", fielddrpt="downUpgradepolicyId", nullable = "true", length = "10")
	private Integer downUpgradepolicyId;
	
	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public String getFastQuery() {
		return fastQuery;
	}

	public void setFastQuery(String fastQuery) {
		this.fastQuery = fastQuery;
	}

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
	public String getMemberNo() {
		return this.memberNo;
	}
	
	public void setMemberNo(String value) {
		this.memberNo = value;
	}
	public String getUnitUid() {
		return this.unitUid;
	}
	
	public void setUnitUid(String value) {
		this.unitUid = value;
	}
	public String getProfileNo() {
		return this.profileNo;
	}
	
	public void setProfileNo(String value) {
		this.profileNo = value;
	}
	public Integer getSeq() {
		return this.seq;
	}
	
	public void setSeq(Integer value) {
		this.seq = value;
	}
	public String getStatusFlg() {
		return this.statusFlg;
	}
	
	public void setStatusFlg(String value) {
		this.statusFlg = value;
	}
	public String getMemberRef() {
		return this.memberRef;
	}
	
	public void setMemberRef(String value) {
		this.memberRef = value;
	}
	public String getMemberStus() {
		return this.memberStus;
	}
	
	public void setMemberStus(String value) {
		this.memberStus = value;
	}
	public Integer getMembertypId() {
		return this.membertypId;
	}
	
	public void setMembertypId(Integer value) {
		this.membertypId = value;
	}
	public Integer getMemberrankId() {
		return this.memberrankId;
	}
	
	public void setMemberrankId(Integer value) {
		this.memberrankId = value;
	}
	public String getAnonymousFlg() {
		return this.anonymousFlg;
	}
	
	public void setAnonymousFlg(String value) {
		this.anonymousFlg = value;
	}
	public String getFirstNm() {
		return this.firstNm;
	}
	
	public void setFirstNm(String value) {
		this.firstNm = value;
	}
	public String getMiddleNm() {
		return this.middleNm;
	}
	
	public void setMiddleNm(String value) {
		this.middleNm = value;
	}
	public String getLastNm() {
		return this.lastNm;
	}
	
	public void setLastNm(String value) {
		this.lastNm = value;
	}
	public String getAltNm() {
		return this.altNm;
	}
	
	public void setAltNm(String value) {
		this.altNm = value;
	}
	public String getIndexNm() {
		return this.indexNm;
	}
	
	public void setIndexNm(String value) {
		this.indexNm = value;
	}
	public Integer getNationId() {
		return this.nationId;
	}
	
	public void setNationId(Integer value) {
		this.nationId = value;
	}
	public Integer getBirthplaceId() {
		return this.birthplaceId;
	}
	
	public void setBirthplaceId(Integer value) {
		this.birthplaceId = value;
	}
	public java.util.Date getBirthday() {
		return this.birthday;
	}
	
	public void setBirthday(java.util.Date value) {
		this.birthday = value;
	}
	public java.util.Date getBirthdate() {
		return this.birthdate;
	}
	
	public void setBirthdate(java.util.Date value) {
		this.birthdate = value;
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
	public Integer getCertificatetypId() {
		return this.certificatetypId;
	}
	
	public void setCertificatetypId(Integer value) {
		this.certificatetypId = value;
	}
	public Integer getCrtfContryId() {
		return this.crtfContryId;
	}
	
	public void setCrtfContryId(Integer value) {
		this.crtfContryId = value;
	}
	public String getCertificateIdcd() {
		return this.certificateIdcd;
	}
	
	public void setCertificateIdcd(String value) {
		this.certificateIdcd = value;
	}
	public java.util.Date getCrtfExpiryDt() {
		return this.crtfExpiryDt;
	}
	
	public void setCrtfExpiryDt(java.util.Date value) {
		this.crtfExpiryDt = value;
	}
	public String getLoginphoneCtno() {
		return this.loginphoneCtno;
	}
	
	public void setLoginphoneCtno(String value) {
		this.loginphoneCtno = value;
	}
	public String getLoginemailEml() {
		return this.loginemailEml;
	}
	
	public void setLoginemailEml(String value) {
		this.loginemailEml = value;
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
	public Integer getRcountryId() {
		return this.rcountryId;
	}
	
	public void setRcountryId(Integer value) {
		this.rcountryId = value;
	}
	public Integer getRprovinceId() {
		return this.rprovinceId;
	}
	
	public void setRprovinceId(Integer value) {
		this.rprovinceId = value;
	}
	public Integer getRcityId() {
		return this.rcityId;
	}
	
	public void setRcityId(Integer value) {
		this.rcityId = value;
	}
	public Integer getDistrictId() {
		return this.districtId;
	}
	
	public void setDistrictId(Integer value) {
		this.districtId = value;
	}
	public String getPostNo() {
		return this.postNo;
	}
	
	public void setPostNo(String value) {
		this.postNo = value;
	}
	public String getLoginCd() {
		return this.loginCd;
	}
	
	public void setLoginCd(String value) {
		this.loginCd = value;
	}
	public String getLoginPwd() {
		return this.loginPwd;
	}
	
	public void setLoginPwd(String value) {
		this.loginPwd = value;
	}
	public String getPrimaryFlg() {
		return this.primaryFlg;
	}
	
	public void setPrimaryFlg(String value) {
		this.primaryFlg = value;
	}
	public Integer getGetwayId() {
		return this.getwayId;
	}
	
	public void setGetwayId(Integer value) {
		this.getwayId = value;
	}
	public Integer getOtherWay() {
		return this.otherWay;
	}
	
	public void setOtherWay(Integer value) {
		this.otherWay = value;
	}
	public Integer getJointypId() {
		return this.jointypId;
	}
	
	public void setJointypId(Integer value) {
		this.jointypId = value;
	}
	public String getReferrer() {
		return this.referrer;
	}
	
	public void setReferrer(String value) {
		this.referrer = value;
	}
	public Integer getSalerId() {
		return this.salerId;
	}
	
	public void setSalerId(Integer value) {
		this.salerId = value;
	}
	public String getReferorg() {
		return this.referorg;
	}
	
	public void setReferorg(String value) {
		this.referorg = value;
	}
	public Integer getReferunitUid() {
		return this.referunitUid;
	}
	
	public void setReferunitUid(Integer value) {
		this.referunitUid = value;
	}
	public Integer getReferdeptId() {
		return this.referdeptId;
	}
	
	public void setReferdeptId(Integer value) {
		this.referdeptId = value;
	}
	public Integer getReferemployeeId() {
		return this.referemployeeId;
	}
	
	public void setReferemployeeId(Integer value) {
		this.referemployeeId = value;
	}
	public String getRefermemberNo() {
		return this.refermemberNo;
	}
	
	public void setRefermemberNo(String value) {
		this.refermemberNo = value;
	}
	public String getReferprofileNo() {
		return this.referprofileNo;
	}
	
	public void setReferprofileNo(String value) {
		this.referprofileNo = value;
	}
	public java.util.Date getJoinDate() {
		return this.joinDate;
	}
	
	public void setJoinDate(java.util.Date value) {
		this.joinDate = value;
	}
	public java.util.Date getValidstDate() {
		return this.validstDate;
	}
	
	public void setValidstDate(java.util.Date value) {
		this.validstDate = value;
	}
	public java.util.Date getValidedDate() {
		return this.validedDate;
	}
	
	public void setValidedDate(java.util.Date value) {
		this.validedDate = value;
	}
	public java.util.Date getQuitDate() {
		return this.quitDate;
	}
	
	public void setQuitDate(java.util.Date value) {
		this.quitDate = value;
	}
	public Integer getQuitreasonId() {
		return this.quitreasonId;
	}
	
	public void setQuitreasonId(Integer value) {
		this.quitreasonId = value;
	}
	public String getNote() {
		return this.note;
	}
	
	public void setNote(String value) {
		this.note = value;
	}
	public java.util.Date getLastconsumeDate() {
		return this.lastconsumeDate;
	}
	
	public void setLastconsumeDate(java.util.Date value) {
		this.lastconsumeDate = value;
	}
	public BigDecimal getConsumeAmount() {
		return this.consumeAmount;
	}
	
	public void setConsumeAmount(BigDecimal value) {
		this.consumeAmount = value;
	}
	public BigDecimal getConsumeTimes() {
		return this.consumeTimes;
	}
	
	public void setConsumeTimes(BigDecimal value) {
		this.consumeTimes = value;
	}
	public BigDecimal getConsumeNights() {
		return this.consumeNights;
	}
	
	public void setConsumeNights(BigDecimal value) {
		this.consumeNights = value;
	}
	public BigDecimal getTotalPoint() {
		return this.totalPoint;
	}
	
	public void setTotalPoint(BigDecimal value) {
		this.totalPoint = value;
	}
	public Integer getTotalExp() {
		return this.totalExp;
	}
	
	public void setTotalExp(Integer value) {
		this.totalExp = value;
	}
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String value) {
		this.memo = value;
	}
	public String getUpgradeFlg() {
		return this.upgradeFlg;
	}
	
	public void setUpgradeFlg(String value) {
		this.upgradeFlg = value;
	}
	public Integer getUpMemberrankId() {
		return this.upMemberrankId;
	}
	
	public void setUpMemberrankId(Integer value) {
		this.upMemberrankId = value;
	}
	public Integer getDownMemberrankId() {
		return this.downMemberrankId;
	}
	
	public void setDownMemberrankId(Integer value) {
		this.downMemberrankId = value;
	}
	public java.util.Date getRegistBdt() {
		return this.registBdt;
	}
	
	public void setRegistBdt(java.util.Date value) {
		this.registBdt = value;
	}
	public java.util.Date getRegistDhms() {
		return this.registDhms;
	}
	
	public void setRegistDhms(java.util.Date value) {
		this.registDhms = value;
	}
	public String getRegistUnitUid() {
		return this.registUnitUid;
	}
	
	public void setRegistUnitUid(String value) {
		this.registUnitUid = value;
	}
	public String getRegistUnitCd() {
		return this.registUnitCd;
	}
	
	public void setRegistUnitCd(String value) {
		this.registUnitCd = value;
	}
	public String getRegistUserUid() {
		return this.registUserUid;
	}
	
	public void setRegistUserUid(String value) {
		this.registUserUid = value;
	}
	public String getRegistUserCd() {
		return this.registUserCd;
	}
	
	public void setRegistUserCd(String value) {
		this.registUserCd = value;
	}
	public String getRegistUserNm() {
		return this.registUserNm;
	}
	
	public void setRegistUserNm(String value) {
		this.registUserNm = value;
	}
	public Integer getUpUpgradepolicyId() {
		return this.upUpgradepolicyId;
	}
	
	public void setUpUpgradepolicyId(Integer value) {
		this.upUpgradepolicyId = value;
	}
	public Integer getDownUpgradepolicyId() {
		return this.downUpgradepolicyId;
	}
	
	public void setDownUpgradepolicyId(Integer value) {
		this.downUpgradepolicyId = value;
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
	

	public BigDecimal getTotalCharge() {
		return totalCharge;
	}
	public void setTotalCharge(BigDecimal totalCharge) {
		this.totalCharge = totalCharge;
	}
	
	public BigDecimal getMctrnBal() {
		return mctrnBal;
	}
	public void setMctrnBal(BigDecimal mctrnBal) {
		this.mctrnBal = mctrnBal;
	}


	public BigDecimal getAuthAmt() {
		return authAmt;
	}
	public void setAuthAmt(BigDecimal authAmt) {
		this.authAmt = authAmt;
	}

	public BigDecimal getPointBal() {
		return pointBal;
	}
	public void setPointBal(BigDecimal pointBal) {
		this.pointBal = pointBal;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

