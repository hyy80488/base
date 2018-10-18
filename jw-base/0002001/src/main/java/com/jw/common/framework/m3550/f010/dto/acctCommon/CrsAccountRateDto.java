/**   
* @Title: CrsAccountRateDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月17日 下午6:27:34 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.math.BigDecimal;
import java.util.List;

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
2018年8月17日|yingw|新增|CrsAccountRateDto.java新增
*/
public class CrsAccountRateDto implements java.io.Serializable {
    
    private static final long serialVersionUID = 3374265610685018983L;
    
    @DrptField(fieldnm="crsAcctNo",fielddrpt="预订账号")
    private String crsAcctNo;
    
    @DrptField(fieldnm="rateId",fielddrpt="价格代码")
    private Integer rateId;
    
    @DrptField(fieldnm="customizeFlg",fielddrpt="自定义价格类型")
    private String customizeFlg;
    
    @DrptField(fieldnm="rateRoomtypId",fielddrpt="付费房间类型")
    private Integer rateRoomtypId;
    
    @DrptField(fieldnm="rateAmt",fielddrpt="实收房价")
    private BigDecimal rateAmt;

    @DrptField(fieldnm="totalAmt",fielddrpt="总房价")
    private BigDecimal totalAmt;

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

    public BigDecimal getRateAmt() {
        return rateAmt;
    }

    public void setRateAmt(BigDecimal rateAmt) {
        this.rateAmt = rateAmt;
    }

    public String getCrsAcctNo() {
        return crsAcctNo;
    }

    public void setCrsAcctNo(String crsAcctNo) {
        this.crsAcctNo = crsAcctNo;
    }


    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }
    
}
