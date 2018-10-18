/**   
* @Title: RsvRateCancelDtlRequestDto.java 
* @Package com.jw.hms.pms.m3220.f010.dto.rate 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年9月21日 上午10:14:08 
* @version V1.0   
*/
package com.jw.common.framework.m3220.f010.dto;

import java.io.Serializable;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 获取房价取消政策明细请求DTO
 * @author    [yingw]   
 * @version   [V1.0, 2018年9月21日]
 * @package com.jw.hms.pms.m3220.f010.dto.rate
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月21日|yingw|新增|RsvRateCancelDtlRequestDto.java新增
*/
@DrptDto(dtonm = "RsvRateCancelDtlRequestDto", dtodrpt = "获取房价取消政策明细请求DTO")
public class RsvRateCancelDtlRequestDto extends RequestBaseDto implements Serializable {
    
  
    private static final long serialVersionUID = 6772973497304558120L;
    
    @DrptField(fieldnm="acctNo",fielddrpt="预定号")
    private String acctNo;

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

}
