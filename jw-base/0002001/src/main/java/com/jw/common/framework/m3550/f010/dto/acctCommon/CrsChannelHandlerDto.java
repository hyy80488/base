/**   
* @Title: CrsChannelHandlerRequestDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月17日 下午6:12:04 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.math.BigDecimal;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * Crs订单 检查 操作 DTO
 * @author    [yingw]   
 * @version   [V1.0, 2018年8月17日]
 * @package com.jw.common.framework.m3550.f010.dto.acctCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月17日|yingw|新增|CrsChannelHandlerDto.java新增
*/
@DrptDto(dtonm = "Crs订单 检查 操作 DTO", dtodrpt="Crs订单 检查 操作 DTO")
public class CrsChannelHandlerDto extends RequestBaseDto implements java.io.Serializable {
    
    private static final long serialVersionUID = 8790070178134032624L;
    
    @DrptField(fieldnm="opratTyp",fielddrpt="操作类型: Constant3220010.ENUM_ACCOUNR_FLG '9' 待结结账 '5'离店， '3' 修改，'10' 入住， '21' 取消订单 '20' 取消入住, '4' noshow")
    private String opratTyp;
    
    @DrptField(fieldnm = "acctNo", fielddrpt = "订单号")
    private String acctNo;
    
    @DrptField(fieldnm = "channelNo", fielddrpt = "渠道No")
    private String channelNo;
    
    @DrptField(fieldnm = "crsAcctNo", fielddrpt = "Crs订单号")
    private String crsAcctNo;
    
    @DrptField(fieldnm = "crsNum", fielddrpt = "PMS接受的CRS号")
    private String crsNum;
    
    @DrptField(fieldnm="arrDt",fielddrpt="来店日期")
    private java.util.Date arrDt;
    
    @DrptField(fieldnm="arrTm",fielddrpt="来店时间")
    private String arrTm;
    
    @DrptField(fieldnm="dptDt",fielddrpt="离店日期")
    private java.util.Date dptDt;
    
    @DrptField(fieldnm="dptTm",fielddrpt="离店时间")
    private String dptTm;
    
    @DrptField(fieldnm="adultCnt",fielddrpt="成人数")
    private Integer adultCnt;
    
    @DrptField(fieldnm="childrenCnt",fielddrpt="儿童数")
    private Integer childrenCnt;
    
    @DrptField(fieldnm="roomQuant",fielddrpt="房间数量")
    private Integer roomQuant;
    
    @DrptField(fieldnm="rateId",fielddrpt="价格代码")
    private Integer rateId;
    
    @DrptField(fieldnm="customizeFlg",fielddrpt="自定义价格类型")
    private String customizeFlg;
    
    @DrptField(fieldnm="rateRoomtypId",fielddrpt="付费房间类型")
    private Integer rateRoomtypId;
    
    @DrptField(fieldnm="totalAmt",fielddrpt="总房价")
    private BigDecimal totalAmt;

    public String getOpratTyp() {
        return opratTyp;
    }

    public void setOpratTyp(String opratTyp) {
        this.opratTyp = opratTyp;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getCrsNum() {
        return crsNum;
    }

    public void setCrsNum(String crsNum) {
        this.crsNum = crsNum;
    }

    public java.util.Date getArrDt() {
        return arrDt;
    }

    public void setArrDt(java.util.Date arrDt) {
        this.arrDt = arrDt;
    }

    public java.util.Date getDptDt() {
        return dptDt;
    }

    public void setDptDt(java.util.Date dptDt) {
        this.dptDt = dptDt;
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

    public Integer getRoomQuant() {
        return roomQuant;
    }

    public void setRoomQuant(Integer roomQuant) {
        this.roomQuant = roomQuant;
    }

    public Integer getRateId() {
        return rateId;
    }

    public void setRateId(Integer rateId) {
        this.rateId = rateId;
    }

    public String getCustomizeFlg() {
        return customizeFlg;
    }

    public void setCustomizeFlg(String customizeFlg) {
        this.customizeFlg = customizeFlg;
    }

    public Integer getRateRoomtypId() {
        return rateRoomtypId;
    }

    public void setRateRoomtypId(Integer rateRoomtypId) {
        this.rateRoomtypId = rateRoomtypId;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public String getArrTm() {
        return arrTm;
    }

    public void setArrTm(String arrTm) {
        this.arrTm = arrTm;
    }

    public String getDptTm() {
        return dptTm;
    }

    public void setDptTm(String dptTm) {
        this.dptTm = dptTm;
    }

    public String getCrsAcctNo() {
        return crsAcctNo;
    }

    public void setCrsAcctNo(String crsAcctNo) {
        this.crsAcctNo = crsAcctNo;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }
    
}
