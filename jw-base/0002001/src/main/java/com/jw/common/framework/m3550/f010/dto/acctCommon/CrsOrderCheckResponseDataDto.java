package com.jw.common.framework.m3550.f010.dto.acctCommon;

public class CrsOrderCheckResponseDataDto implements java.io.Serializable {

    private static final long serialVersionUID = 226832895755117950L;

    // 是否检查通过 true 通过 false 不通过
    private Boolean flag;
    
    // 不通过是否可以继续执行  1 可以 0 不可以
    private Integer stillOprat;
    
    // 争议原因
    private Integer disputeId;
    
    private String channelFlg;
    
    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getStillOprat() {
        return stillOprat;
    }

    public void setStillOprat(Integer stillOprat) {
        this.stillOprat = stillOprat;
    }

    public Integer getDisputeId() {
        return disputeId;
    }

    public void setDisputeId(Integer disputeId) {
        this.disputeId = disputeId;
    }

    public String getChannelFlg() {
        return channelFlg;
    }

    public void setChannelFlg(String channelFlg) {
        this.channelFlg = channelFlg;
    }
    
}
