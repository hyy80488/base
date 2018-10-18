/**   
* @Title: UpdateCrsAcctStusRequestDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月20日 上午10:30:16 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import java.math.BigDecimal;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [yingw]   
 * @version   [V1.0, 2018年8月20日]
 * @package com.jw.common.framework.m3550.f010.dto.acctCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月20日|yingw|新增|UpdateCrsAcctStusRequestDto.java新增
*/
public class UpdateCrsAcctStusRequestDto extends RequestBaseDto implements java.io.Serializable {

   
    private static final long serialVersionUID = 4883064047679803764L;
    
    @DrptField(fieldnm="opratTyp",fielddrpt="操作类型 OUT离店， EDIT 修改，IN 入住， CXL 取消, NSW noshow")
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
    
    @DrptField(fieldnm="departureDt",fielddrpt="离店日期")
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
    
    
    public String getCrsNum() {
        return crsNum;
    }

    public void setCrsNum(String crsNum) {
        this.crsNum = crsNum;
    }

    public String getCrsAcctNo() {
        return crsAcctNo;
    }

    public void setCrsAcctNo(String crsAcctNo) {
        this.crsAcctNo = crsAcctNo;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }
    
}
