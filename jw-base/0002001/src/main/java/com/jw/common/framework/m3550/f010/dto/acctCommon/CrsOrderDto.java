package com.jw.common.framework.m3550.f010.dto.acctCommon;

import com.jw.base.framework.core.annotation.DrptField;

public class CrsOrderDto implements java.io.Serializable {

    private static final long serialVersionUID = 289041835960350484L;

    @DrptField(fieldnm = "channelNo", fielddrpt = "channelNo")
    private String channelNo;
    
    @DrptField(fieldnm = "contact", fielddrpt = "联系人")
    private String contact;
    
    @DrptField(fieldnm = "teleCtno", fielddrpt = "联系人电话")
    private String teleCtno;
    
    @DrptField(fieldnm = "mcardNo", fielddrpt = "会员卡号")
    private String mcardNo;
    
    @DrptField(fieldnm = "mcardrankId", fielddrpt = "会员卡等级")
    private Integer mcardrankId;
    
    @DrptField(fieldnm = "marketId", fielddrpt = "市场代码")
    private Integer marketId;
    
    @DrptField(fieldnm = "sourceId", fielddrpt = "客源代码")
    private Integer sourceId;
    
    @DrptField(fieldnm = "salerId", fielddrpt = "销售员代码")
    private Integer salerId;
    
    @DrptField(fieldnm = "memo", fielddrpt = "备注")
    private String memo;

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTeleCtno() {
        return teleCtno;
    }

    public void setTeleCtno(String teleCtno) {
        this.teleCtno = teleCtno;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public Integer getMcardrankId() {
        return mcardrankId;
    }

    public void setMcardrankId(Integer mcardrankId) {
        this.mcardrankId = mcardrankId;
    }

    public Integer getMarketId() {
        return marketId;
    }

    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getSalerId() {
        return salerId;
    }

    public void setSalerId(Integer salerId) {
        this.salerId = salerId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    
}
