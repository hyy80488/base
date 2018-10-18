/**   
* @Title: CrsAccountGuestDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月17日 下午6:29:05 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	描述
 * @author    [yingw]   
 * @version   [V1.0, 2018年8月17日]
 * @package com.jw.common.framework.m3550.f010.dto.acctCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月17日|yingw|新增|CrsAccountGuestDto.java新增
*/
public class CrsAccountGuestDto implements java.io.Serializable {
    
    private static final long serialVersionUID = -514843858190282337L;
    
    @DrptField(fieldnm = "guestId", fielddrpt = "宾客ID")
    private Integer guestId;
    
    @DrptField(fieldnm="crsAcctNo",fielddrpt="预订账号")
    private String crsAcctNo;
    
    @DrptField(fieldnm="crsOrderNo",fielddrpt="预订号")
    private String crsOrderNo;
    
    @DrptField(fieldnm = "firstNm", fielddrpt = "姓氏")
    private String firstNm;
    
    @DrptField(fieldnm = "middleNm", fielddrpt = "中间名 ")
    private String middleNm;
    
    @DrptField(fieldnm = "lastNm", fielddrpt = "名字 ")
    private String lastNm;
    
    @DrptField(fieldnm = "altNm", fielddrpt = "姓名/别名")
    private String altNm;
    
    @DrptField(fieldnm = "guestNm", fielddrpt = "客人姓名")
    private String guestNm;
    
    @DrptField(fieldnm = "soundNm", fielddrpt = "姓名读音")
    private String soundNm;
    
    @DrptField(fieldnm = "indexNm", fielddrpt = "姓名关键字")
    private String indexNm;
    
    @DrptField(fieldnm = "titleId", fielddrpt = "称谓")
    private Integer titleId;
    
    @DrptField(fieldnm = "gender", fielddrpt = "性别")
    private String gender;
    
    @DrptField(fieldnm = "vipId", fielddrpt = "VIP等级")
    private Integer vipId;
    
    @DrptField(fieldnm = "nationId", fielddrpt = "民族")
    private Integer nationId;
    
    @DrptField(fieldnm = "birthday", fielddrpt = "生日")
    private java.util.Date birthday;
    
    /**（年无效）  **/
    @DrptField(fieldnm = "birthdate", fielddrpt = "生日")
    private java.util.Date birthdate;
    
    @DrptField(fieldnm = "countryId", fielddrpt = "国籍")
    private Integer countryId;
    
    @DrptField(fieldnm = "languageId", fielddrpt = "客人语种")
    private Integer languageId;
    
    @DrptField(fieldnm = "certificatetypId", fielddrpt = "证件种类")
    private Integer certificatetypId;
    
    @DrptField(fieldnm = "certificateIdcd", fielddrpt = "证件号码")
    private String certificateIdcd;
    
    @DrptField(fieldnm = "rcountryId", fielddrpt = "常驻国籍")
    private Integer rcountryId;
    
    @DrptField(fieldnm = "rprovinceId", fielddrpt = "常驻省")
    private Integer rprovinceId;
    
    @DrptField(fieldnm = "rcityId", fielddrpt = "常驻市")
    private Integer rcityId;
    
    @DrptField(fieldnm = "districtId", fielddrpt = "城区")
    private Integer districtId;
    
    @DrptField(fieldnm = "address1", fielddrpt = "地址")
    private String address1;
    
    @DrptField(fieldnm = "postNo", fielddrpt = "邮编")
    private String postNo;
    
    @DrptField(fieldnm = "teleCtno", fielddrpt = "电话号码")
    private String teleCtno;
    
    @DrptField(fieldnm = "emailEml", fielddrpt = "电子邮件地址")
    private String emailEml;

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public String getCrsAcctNo() {
        return crsAcctNo;
    }

    public void setCrsAcctNo(String crsAcctNo) {
        this.crsAcctNo = crsAcctNo;
    }

    public String getCrsOrderNo() {
        return crsOrderNo;
    }

    public void setCrsOrderNo(String crsOrderNo) {
        this.crsOrderNo = crsOrderNo;
    }

    public String getFirstNm() {
        return firstNm;
    }

    public void setFirstNm(String firstNm) {
        this.firstNm = firstNm;
    }

    public String getMiddleNm() {
        return middleNm;
    }

    public void setMiddleNm(String middleNm) {
        this.middleNm = middleNm;
    }

    public String getLastNm() {
        return lastNm;
    }

    public void setLastNm(String lastNm) {
        this.lastNm = lastNm;
    }

    public String getAltNm() {
        return altNm;
    }

    public void setAltNm(String altNm) {
        this.altNm = altNm;
    }

    public String getGuestNm() {
        return guestNm;
    }

    public void setGuestNm(String guestNm) {
        this.guestNm = guestNm;
    }

    public String getSoundNm() {
        return soundNm;
    }

    public void setSoundNm(String soundNm) {
        this.soundNm = soundNm;
    }

    public String getIndexNm() {
        return indexNm;
    }

    public void setIndexNm(String indexNm) {
        this.indexNm = indexNm;
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public java.util.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

    public java.util.Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(java.util.Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
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

    public Integer getRcountryId() {
        return rcountryId;
    }

    public void setRcountryId(Integer rcountryId) {
        this.rcountryId = rcountryId;
    }

    public Integer getRprovinceId() {
        return rprovinceId;
    }

    public void setRprovinceId(Integer rprovinceId) {
        this.rprovinceId = rprovinceId;
    }

    public Integer getRcityId() {
        return rcityId;
    }

    public void setRcityId(Integer rcityId) {
        this.rcityId = rcityId;
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

    public String getPostNo() {
        return postNo;
    }

    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }

    public String getTeleCtno() {
        return teleCtno;
    }

    public void setTeleCtno(String teleCtno) {
        this.teleCtno = teleCtno;
    }

    public String getEmailEml() {
        return emailEml;
    }

    public void setEmailEml(String emailEml) {
        this.emailEml = emailEml;
    }
    
    
    
}
