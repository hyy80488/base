
package com.jw.common.framework.m5100.f010.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;



public class UserInfoCommom implements Serializable{

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4455988870762913996L;
	@XmlElement(name = "Ic_num")
    protected String icNum;
    @XmlElement(name = "Ic_typ")
    protected String icTyp;
    @XmlElement(name = "Ic_ref")
    protected String icRef;
    @XmlElement(name = "Ic_pwd")
    protected String icPwd;
    @XmlElement(name = "ic_stus")
    protected String icStus;
    @XmlElement(name = "gh_num")
    protected String ghNum;
    @XmlElement(name = "Company_num")
    protected String companyNum;
    @XmlElement(name = "send_oper")
    protected String sendOper;
    @XmlElement(name = "tot_rvu")
    protected double totRvu;
    @XmlElement(name = "gh_typ")
    protected String ghTyp;
    @XmlElement(name = "gh_nm")
    protected String ghNm;
    protected String addr;
    protected String postal;
    protected String mobile;
    protected String email;
    protected String officefax;
    protected String geo1;
    protected String geo2;
    protected String geo3;
    @XmlElement(name = "crtf_typ")
    protected String crtfTyp;
    @XmlElement(name = "crtf_num")
    protected String crtfNum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "sex_cd")
    protected String sexCd;
    protected String nation;
    protected String notice;
    @XmlElement(name = "tot_score")
    protected double totScore;
    protected String phone;
    @XmlElement(name = "lang_cd")
    protected String langCd;
    protected String officephone;
    @XmlElement(name = "crd_num")
    protected String crdNum;
    @XmlElement(name = "crd_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar crdDt;
    @XmlElement(name = "crtf_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar crtfDt;
    @XmlElement(name = "org_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgDt;
    @XmlElement(name = "org_oper")
    protected String orgOper;
    @XmlElement(name = "htl_cd")
    protected String htlCd;
    @XmlElement(name = "crtf_nm")
    protected String crtfNm;
    @XmlElement(name = "geo1_nm")
    protected String geo1Nm;
    @XmlElement(name = "geo2_nm")
    protected String geo2Nm;
    @XmlElement(name = "geo3_nm")
    protected String geo3Nm;
    protected String degree;
    protected String vip;
    protected String interest;
    @XmlElement(name = "hskp_notice")
    protected String hskpNotice;
    @XmlElement(name = "pos_notice")
    protected String posNotice;
    @XmlElement(name = "bind_dt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bindDt;
    @XmlElement(name = "chg_oper")
    protected String chgOper;
    @XmlElement(name = "org_cd")
    protected String orgCd;
    @XmlElement(required = true)
    protected BigDecimal hissumscore;
    @XmlElement(name = "ic_bal", required = true)
    protected BigDecimal icBal;
    protected String other;
    protected String trnflg;
    protected String typdrpt;
    protected String flgdrpt;
    @XmlElement(name = "s_score")
    protected String sScore;
    protected String staffname;
    protected String staffhtlcd;
    @XmlElement(name = "ed_dt")
    protected String edDt;
    @XmlElement(name = "ic_score")
    protected double icScore;
    @XmlElement(name = "is_notlogin")
    protected boolean isNotlogin;
    @XmlElement(name = "UniteParam")
    protected String uniteParam;
    protected String track2;
    protected String track3;
    @XmlElement(name = "reco_person")
    protected String recoPerson;
    @XmlElement(name = "to_dt")
    protected String toDt;
    @XmlElement(name = "quad_rt")
    protected String quadRt;
    @XmlElement(name = "tot_vst")
    protected int totVst;
    protected String introducer;
    @XmlElement(name = "masteric_num")
    protected String mastericNum;
    @XmlElement(name = "trn_pwd")
    protected String trnPwd;
    @XmlElement(name = "wx_id")
    protected String wxId;
    protected String htlcdlist;
    protected String fnumber;
    protected String fcardno;
    protected String ftime;
    protected String htlcdmapping;

    /**
     * 获取icNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcNum() {
        return icNum;
    }

    /**
     * 设置icNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcNum(String value) {
        this.icNum = value;
    }

    /**
     * 获取icTyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcTyp() {
        return icTyp;
    }

    /**
     * 设置icTyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcTyp(String value) {
        this.icTyp = value;
    }

    /**
     * 获取icRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcRef() {
        return icRef;
    }

    /**
     * 设置icRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcRef(String value) {
        this.icRef = value;
    }

    /**
     * 获取icPwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcPwd() {
        return icPwd;
    }

    /**
     * 设置icPwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcPwd(String value) {
        this.icPwd = value;
    }

    /**
     * 获取icStus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcStus() {
        return icStus;
    }

    /**
     * 设置icStus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcStus(String value) {
        this.icStus = value;
    }

    /**
     * 获取ghNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhNum() {
        return ghNum;
    }

    /**
     * 设置ghNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhNum(String value) {
        this.ghNum = value;
    }

    /**
     * 获取companyNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNum() {
        return companyNum;
    }

    /**
     * 设置companyNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNum(String value) {
        this.companyNum = value;
    }

    /**
     * 获取sendOper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendOper() {
        return sendOper;
    }

    /**
     * 设置sendOper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendOper(String value) {
        this.sendOper = value;
    }

    /**
     * 获取totRvu属性的值。
     * 
     */
    public double getTotRvu() {
        return totRvu;
    }

    /**
     * 设置totRvu属性的值。
     * 
     */
    public void setTotRvu(double value) {
        this.totRvu = value;
    }

    /**
     * 获取ghTyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhTyp() {
        return ghTyp;
    }

    /**
     * 设置ghTyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhTyp(String value) {
        this.ghTyp = value;
    }

    /**
     * 获取ghNm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhNm() {
        return ghNm;
    }

    /**
     * 设置ghNm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhNm(String value) {
        this.ghNm = value;
    }

    /**
     * 获取addr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置addr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

    /**
     * 获取postal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostal() {
        return postal;
    }

    /**
     * 设置postal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostal(String value) {
        this.postal = value;
    }

    /**
     * 获取mobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置mobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取officefax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficefax() {
        return officefax;
    }

    /**
     * 设置officefax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficefax(String value) {
        this.officefax = value;
    }

    /**
     * 获取geo1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeo1() {
        return geo1;
    }

    /**
     * 设置geo1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeo1(String value) {
        this.geo1 = value;
    }

    /**
     * 获取geo2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeo2() {
        return geo2;
    }

    /**
     * 设置geo2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeo2(String value) {
        this.geo2 = value;
    }

    /**
     * 获取geo3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeo3() {
        return geo3;
    }

    /**
     * 设置geo3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeo3(String value) {
        this.geo3 = value;
    }

    /**
     * 获取crtfTyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrtfTyp() {
        return crtfTyp;
    }

    /**
     * 设置crtfTyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrtfTyp(String value) {
        this.crtfTyp = value;
    }

    /**
     * 获取crtfNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrtfNum() {
        return crtfNum;
    }

    /**
     * 设置crtfNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrtfNum(String value) {
        this.crtfNum = value;
    }

    /**
     * 获取birthday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * 获取sexCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexCd() {
        return sexCd;
    }

    /**
     * 设置sexCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexCd(String value) {
        this.sexCd = value;
    }

    /**
     * 获取nation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设置nation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNation(String value) {
        this.nation = value;
    }

    /**
     * 获取notice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotice() {
        return notice;
    }

    /**
     * 设置notice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotice(String value) {
        this.notice = value;
    }

    /**
     * 获取totScore属性的值。
     * 
     */
    public double getTotScore() {
        return totScore;
    }

    /**
     * 设置totScore属性的值。
     * 
     */
    public void setTotScore(double value) {
        this.totScore = value;
    }

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取langCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * 设置langCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCd(String value) {
        this.langCd = value;
    }

    /**
     * 获取officephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficephone() {
        return officephone;
    }

    /**
     * 设置officephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficephone(String value) {
        this.officephone = value;
    }

    /**
     * 获取crdNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdNum() {
        return crdNum;
    }

    /**
     * 设置crdNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdNum(String value) {
        this.crdNum = value;
    }

    /**
     * 获取crdDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrdDt() {
        return crdDt;
    }

    /**
     * 设置crdDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrdDt(XMLGregorianCalendar value) {
        this.crdDt = value;
    }

    /**
     * 获取crtfDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrtfDt() {
        return crtfDt;
    }

    /**
     * 设置crtfDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrtfDt(XMLGregorianCalendar value) {
        this.crtfDt = value;
    }

    /**
     * 获取orgDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgDt() {
        return orgDt;
    }

    /**
     * 设置orgDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgDt(XMLGregorianCalendar value) {
        this.orgDt = value;
    }

    /**
     * 获取orgOper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgOper() {
        return orgOper;
    }

    /**
     * 设置orgOper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgOper(String value) {
        this.orgOper = value;
    }

    /**
     * 获取htlCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtlCd() {
        return htlCd;
    }

    /**
     * 设置htlCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtlCd(String value) {
        this.htlCd = value;
    }

    /**
     * 获取crtfNm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrtfNm() {
        return crtfNm;
    }

    /**
     * 设置crtfNm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrtfNm(String value) {
        this.crtfNm = value;
    }

    /**
     * 获取geo1Nm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeo1Nm() {
        return geo1Nm;
    }

    /**
     * 设置geo1Nm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeo1Nm(String value) {
        this.geo1Nm = value;
    }

    /**
     * 获取geo2Nm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeo2Nm() {
        return geo2Nm;
    }

    /**
     * 设置geo2Nm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeo2Nm(String value) {
        this.geo2Nm = value;
    }

    /**
     * 获取geo3Nm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeo3Nm() {
        return geo3Nm;
    }

    /**
     * 设置geo3Nm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeo3Nm(String value) {
        this.geo3Nm = value;
    }

    /**
     * 获取degree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置degree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegree(String value) {
        this.degree = value;
    }

    /**
     * 获取vip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVip() {
        return vip;
    }

    /**
     * 设置vip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVip(String value) {
        this.vip = value;
    }

    /**
     * 获取interest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterest() {
        return interest;
    }

    /**
     * 设置interest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterest(String value) {
        this.interest = value;
    }

    /**
     * 获取hskpNotice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHskpNotice() {
        return hskpNotice;
    }

    /**
     * 设置hskpNotice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHskpNotice(String value) {
        this.hskpNotice = value;
    }

    /**
     * 获取posNotice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosNotice() {
        return posNotice;
    }

    /**
     * 设置posNotice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosNotice(String value) {
        this.posNotice = value;
    }

    /**
     * 获取bindDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBindDt() {
        return bindDt;
    }

    /**
     * 设置bindDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBindDt(XMLGregorianCalendar value) {
        this.bindDt = value;
    }

    /**
     * 获取chgOper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChgOper() {
        return chgOper;
    }

    /**
     * 设置chgOper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChgOper(String value) {
        this.chgOper = value;
    }

    /**
     * 获取orgCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCd() {
        return orgCd;
    }

    /**
     * 设置orgCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCd(String value) {
        this.orgCd = value;
    }

    /**
     * 获取hissumscore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHissumscore() {
        return hissumscore;
    }

    /**
     * 设置hissumscore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHissumscore(BigDecimal value) {
        this.hissumscore = value;
    }

    /**
     * 获取icBal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIcBal() {
        return icBal;
    }

    /**
     * 设置icBal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIcBal(BigDecimal value) {
        this.icBal = value;
    }

    /**
     * 获取other属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * 设置other属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * 获取trnflg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnflg() {
        return trnflg;
    }

    /**
     * 设置trnflg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnflg(String value) {
        this.trnflg = value;
    }

    /**
     * 获取typdrpt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypdrpt() {
        return typdrpt;
    }

    /**
     * 设置typdrpt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypdrpt(String value) {
        this.typdrpt = value;
    }

    /**
     * 获取flgdrpt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgdrpt() {
        return flgdrpt;
    }

    /**
     * 设置flgdrpt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgdrpt(String value) {
        this.flgdrpt = value;
    }

    /**
     * 获取sScore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSScore() {
        return sScore;
    }

    /**
     * 设置sScore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSScore(String value) {
        this.sScore = value;
    }

    /**
     * 获取staffname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffname() {
        return staffname;
    }

    /**
     * 设置staffname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffname(String value) {
        this.staffname = value;
    }

    /**
     * 获取staffhtlcd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffhtlcd() {
        return staffhtlcd;
    }

    /**
     * 设置staffhtlcd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffhtlcd(String value) {
        this.staffhtlcd = value;
    }

    /**
     * 获取edDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdDt() {
        return edDt;
    }

    /**
     * 设置edDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdDt(String value) {
        this.edDt = value;
    }

    /**
     * 获取icScore属性的值。
     * 
     */
    public double getIcScore() {
        return icScore;
    }

    /**
     * 设置icScore属性的值。
     * 
     */
    public void setIcScore(double value) {
        this.icScore = value;
    }

    /**
     * 获取isNotlogin属性的值。
     * 
     */
    public boolean isIsNotlogin() {
        return isNotlogin;
    }

    /**
     * 设置isNotlogin属性的值。
     * 
     */
    public void setIsNotlogin(boolean value) {
        this.isNotlogin = value;
    }

    /**
     * 获取uniteParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniteParam() {
        return uniteParam;
    }

    /**
     * 设置uniteParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniteParam(String value) {
        this.uniteParam = value;
    }

    /**
     * 获取track2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack2() {
        return track2;
    }

    /**
     * 设置track2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack2(String value) {
        this.track2 = value;
    }

    /**
     * 获取track3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack3() {
        return track3;
    }

    /**
     * 设置track3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack3(String value) {
        this.track3 = value;
    }

    /**
     * 获取recoPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecoPerson() {
        return recoPerson;
    }

    /**
     * 设置recoPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecoPerson(String value) {
        this.recoPerson = value;
    }

    /**
     * 获取toDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDt() {
        return toDt;
    }

    /**
     * 设置toDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDt(String value) {
        this.toDt = value;
    }

    /**
     * 获取quadRt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuadRt() {
        return quadRt;
    }

    /**
     * 设置quadRt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuadRt(String value) {
        this.quadRt = value;
    }

    /**
     * 获取totVst属性的值。
     * 
     */
    public int getTotVst() {
        return totVst;
    }

    /**
     * 设置totVst属性的值。
     * 
     */
    public void setTotVst(int value) {
        this.totVst = value;
    }

    /**
     * 获取introducer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroducer() {
        return introducer;
    }

    /**
     * 设置introducer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroducer(String value) {
        this.introducer = value;
    }

    /**
     * 获取mastericNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMastericNum() {
        return mastericNum;
    }

    /**
     * 设置mastericNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMastericNum(String value) {
        this.mastericNum = value;
    }

    /**
     * 获取trnPwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnPwd() {
        return trnPwd;
    }

    /**
     * 设置trnPwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnPwd(String value) {
        this.trnPwd = value;
    }

    /**
     * 获取wxId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWxId() {
        return wxId;
    }

    /**
     * 设置wxId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWxId(String value) {
        this.wxId = value;
    }

    /**
     * 获取htlcdlist属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtlcdlist() {
        return htlcdlist;
    }

    /**
     * 设置htlcdlist属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtlcdlist(String value) {
        this.htlcdlist = value;
    }

    /**
     * 获取fnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnumber() {
        return fnumber;
    }

    /**
     * 设置fnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnumber(String value) {
        this.fnumber = value;
    }

    /**
     * 获取fcardno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcardno() {
        return fcardno;
    }

    /**
     * 设置fcardno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcardno(String value) {
        this.fcardno = value;
    }

    /**
     * 获取ftime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtime() {
        return ftime;
    }

    /**
     * 设置ftime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtime(String value) {
        this.ftime = value;
    }

    /**
     * 获取htlcdmapping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtlcdmapping() {
        return htlcdmapping;
    }

    /**
     * 设置htlcdmapping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtlcdmapping(String value) {
        this.htlcdmapping = value;
    }

}
