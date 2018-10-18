/**   
* @Title: CrsAccountDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月17日 下午6:19:43 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.jw.base.framework.core.Constant3220010;
import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmAttribute;
import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
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
2018年8月17日|yingw|新增|CrsAccountDto.java新增
*/
public class CrsAccountDto implements java.io.Serializable {
    
    private static final long serialVersionUID = 6842618169923667453L;
    
    @DrptField(fieldnm="crsAcctNo",fielddrpt="预订账号",logged = ENUM_LOGGED.YES)
    private String crsAcctNo;
    
    @DrptField(fieldnm="crsOrderNo",fielddrpt="预订号")
    private String crsOrderNo;
    
    /** RSV：预订；STY：在店；OUT：已离；CXL：取消；NSW：no show；WAT：等候；WAC：等候取消；？？？作废 GRP：团队主单 **/
    @DrptField(fieldnm="crsAcctStus",fielddrpt="账户状态")
    private String crsAcctStus;
    
    @DrptField(fieldnm="prepayPntamt",fielddrpt="额度")
    private BigDecimal prepayPntamt;
    
    /** Mark 自定义输入，也可主表配置 **/
    @DrptField(fieldnm="mark",fielddrpt="Mark")
    private String mark;
    
    @DrptField(fieldnm="orgarrDt",fielddrpt="原始来店日期")
    private java.util.Date orgarrDt;
    
    @DrptField(fieldnm="arrDt",fielddrpt="来店日期")
    private java.util.Date arrDt;
    
    @DrptField(fieldnm="arrTm",fielddrpt="来店时间")
    private String arrTm;
    
    @DrptField(fieldnm="earlyinFlg",fielddrpt="早到店标识")
    private String earlyinFlg;
    
    @DrptField(fieldnm="orgdptDt",fielddrpt="原始离店日期")
    private java.util.Date orgdptDt;
    
    @DrptField(fieldnm="departureDt",fielddrpt="离店日期")
    private java.util.Date dptDt;
    
    @DrptField(fieldnm="dptTm",fielddrpt="离店时间")
    private String dptTm;
    
    @DrptField(fieldnm="saleroomtypId",fielddrpt="销售房型")
    private Integer saleroomtypId;
    
    @DrptField(fieldnm="adultCnt",fielddrpt="成人数")
    private Integer adultCnt;
    
    @DrptField(fieldnm="childrenCnt",fielddrpt="儿童数")
    private Integer childrenCnt;
    
    
    @DrptField(fieldnm="roomQuant",fielddrpt="房间数量")
    private Integer roomQuant;
    
    @DrptField(fieldnm="freememo",fielddrpt="备注 ")
    private String freememo;

    
    @DrptField(fieldnm="reinstateDt",fielddrpt="入住取消日期")
    private java.util.Date reinstateDt;
    
    /**  Business Date **/
    @DrptField(fieldnm="resvmodifyBdt",fielddrpt="预订修改日期")
    private java.util.Date resvmodifyBdt;
    
    @DrptField(fieldnm="resvmodifyDhms",fielddrpt="预定修改时间")
    private java.util.Date resvmodifyDhms;
    
    @DrptField(fieldnm="cancelTyp",fielddrpt="订单取消方式",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA, paramsubtype=ConstantParmAttribute.RSV_ACCOUNT_CANCEL_TYP, logged = ENUM_LOGGED.YES)
    private String cancelTyp;
    
    @DrptField(fieldnm="cancellationNum",fielddrpt="预订取消号码",logged = ENUM_LOGGED.YES)
    private String cancellationNum;
    
    @DrptField(fieldnm="cancelrsnId",fielddrpt="订单取消原因ID",paramtype=ConstantParm.ENUM_PARA_TYPE.COMMON_PARA, paramsubtype=ConstantParm.CANCELRSN, logged = ENUM_LOGGED.YES)
    private Integer cancelrsnId;
    
    @DrptField(fieldnm="cancelrsnTxt",fielddrpt="订单取消原因描述",logged = ENUM_LOGGED.YES)
    private String cancelrsnTxt;
    
    /**  Business Date **/
    @DrptField(fieldnm="cancelBdt",fielddrpt="预订取消日期")
    private java.util.Date cancelBdt;
    
    @DrptField(fieldnm="cancelDhms",fielddrpt="预订取消时间")
    private java.util.Date cancelDhms;
    
    @DrptField(fieldnm="cancelUnitUid",fielddrpt="取消单位uid")
    private String cancelUnitUid;
    
    @DrptField(fieldnm="cancelUnitNm",fielddrpt="取消单位名称")
    private String cancelUnitNm;
    
    @DrptField(fieldnm="cancelUnitCd",fielddrpt="取消单位cd")
    private String cancelUnitCd;
    
    @DrptField(fieldnm="cancelUserUid",fielddrpt="预订取消操作员uid")
    private String cancelUserUid;
    
    @DrptField(fieldnm="cancelUserCd",fielddrpt="预订取消操作员代码")
    private String cancelUserCd;
    
    @DrptField(fieldnm="cancelUserNm",fielddrpt="预订取消操作员姓名")
    private String cancelUserNm;
    
    @DrptField(fieldnm="drptMap",fielddrpt="所有描述信息",drptmap=Constant3220010.DRPTMAPSTR)
    private Map<String,String> drptMap = new HashMap<>();
    
    public CrsAccountDto() {
        drptMap.put("reguestId", null);
        drptMap.put("bkguestId", null);
        drptMap.put("negoCorpNo", null);
        drptMap.put("salerId", null);
        drptMap.put("roomtypId", null);
        drptMap.put("cancelUnitUid", null);
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

    public String getCrsAcctStus() {
        return crsAcctStus;
    }

    public void setCrsAcctStus(String crsAcctStus) {
        this.crsAcctStus = crsAcctStus;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public java.util.Date getOrgarrDt() {
        return orgarrDt;
    }

    public void setOrgarrDt(java.util.Date orgarrDt) {
        this.orgarrDt = orgarrDt;
    }

    public java.util.Date getArrDt() {
        return arrDt;
    }

    public void setArrDt(java.util.Date arrDt) {
        this.arrDt = arrDt;
    }

    public String getArrTm() {
        return arrTm;
    }

    public void setArrTm(String arrTm) {
        this.arrTm = arrTm;
    }

    public String getEarlyinFlg() {
        return earlyinFlg;
    }

    public void setEarlyinFlg(String earlyinFlg) {
        this.earlyinFlg = earlyinFlg;
    }

    public java.util.Date getOrgdptDt() {
        return orgdptDt;
    }

    public void setOrgdptDt(java.util.Date orgdptDt) {
        this.orgdptDt = orgdptDt;
    }

    public BigDecimal getPrepayPntamt() {
        return prepayPntamt;
    }

    public void setPrepayPntamt(BigDecimal prepayPntamt) {
        this.prepayPntamt = prepayPntamt;
    }

    public java.util.Date getDptDt() {
        return dptDt;
    }

    public void setDptDt(java.util.Date dptDt) {
        this.dptDt = dptDt;
    }

    public String getDptTm() {
        return dptTm;
    }

    public void setDptTm(String dptTm) {
        this.dptTm = dptTm;
    }

    public Integer getAdultCnt() {
        return adultCnt;
    }

    public void setAdultCnt(Integer adultCnt) {
        this.adultCnt = adultCnt;
    }

    public Integer getChildrenCnt() {
        return childrenCnt;
    }

    public void setChildrenCnt(Integer childrenCnt) {
        this.childrenCnt = childrenCnt;
    }

    public Integer getSaleroomtypId() {
        return saleroomtypId;
    }

    public void setSaleroomtypId(Integer saleroomtypId) {
        this.saleroomtypId = saleroomtypId;
    }

    public Integer getRoomQuant() {
        return roomQuant;
    }

    public void setRoomQuant(Integer roomQuant) {
        this.roomQuant = roomQuant;
    }


    public String getFreememo() {
        return freememo;
    }

    public void setFreememo(String freememo) {
        this.freememo = freememo;
    }

    public java.util.Date getReinstateDt() {
        return reinstateDt;
    }

    public void setReinstateDt(java.util.Date reinstateDt) {
        this.reinstateDt = reinstateDt;
    }

    public java.util.Date getResvmodifyBdt() {
        return resvmodifyBdt;
    }

    public void setResvmodifyBdt(java.util.Date resvmodifyBdt) {
        this.resvmodifyBdt = resvmodifyBdt;
    }

    public java.util.Date getResvmodifyDhms() {
        return resvmodifyDhms;
    }

    public void setResvmodifyDhms(java.util.Date resvmodifyDhms) {
        this.resvmodifyDhms = resvmodifyDhms;
    }

    public String getCancelTyp() {
        return cancelTyp;
    }

    public void setCancelTyp(String cancelTyp) {
        this.cancelTyp = cancelTyp;
    }

    public String getCancellationNum() {
        return cancellationNum;
    }

    public void setCancellationNum(String cancellationNum) {
        this.cancellationNum = cancellationNum;
    }

    public Integer getCancelrsnId() {
        return cancelrsnId;
    }

    public void setCancelrsnId(Integer cancelrsnId) {
        this.cancelrsnId = cancelrsnId;
    }

    public String getCancelrsnTxt() {
        return cancelrsnTxt;
    }

    public void setCancelrsnTxt(String cancelrsnTxt) {
        this.cancelrsnTxt = cancelrsnTxt;
    }

    public java.util.Date getCancelBdt() {
        return cancelBdt;
    }

    public void setCancelBdt(java.util.Date cancelBdt) {
        this.cancelBdt = cancelBdt;
    }

    public java.util.Date getCancelDhms() {
        return cancelDhms;
    }

    public void setCancelDhms(java.util.Date cancelDhms) {
        this.cancelDhms = cancelDhms;
    }

    public String getCancelUnitUid() {
        return cancelUnitUid;
    }

    public void setCancelUnitUid(String cancelUnitUid) {
        this.cancelUnitUid = cancelUnitUid;
    }

    public String getCancelUnitNm() {
        return cancelUnitNm;
    }

    public void setCancelUnitNm(String cancelUnitNm) {
        this.cancelUnitNm = cancelUnitNm;
    }

    public String getCancelUnitCd() {
        return cancelUnitCd;
    }

    public void setCancelUnitCd(String cancelUnitCd) {
        this.cancelUnitCd = cancelUnitCd;
    }

    public String getCancelUserUid() {
        return cancelUserUid;
    }

    public void setCancelUserUid(String cancelUserUid) {
        this.cancelUserUid = cancelUserUid;
    }

    public String getCancelUserCd() {
        return cancelUserCd;
    }

    public void setCancelUserCd(String cancelUserCd) {
        this.cancelUserCd = cancelUserCd;
    }

    public String getCancelUserNm() {
        return cancelUserNm;
    }

    public void setCancelUserNm(String cancelUserNm) {
        this.cancelUserNm = cancelUserNm;
    }

    public Map<String, String> getDrptMap() {
        return drptMap;
    }

    public void setDrptMap(Map<String, String> drptMap) {
        this.drptMap = drptMap;
    }

}
