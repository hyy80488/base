/**   
* @Title: CrsChannelHandlerOpratRequestDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月20日 上午9:15:32 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

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
2018年8月20日|yingw|新增|CrsChannelHandlerOpratRequestDto.java新增
*/
public class CrsChannelHandlerOpratRequestDto extends RequestBaseDto implements java.io.Serializable {
    
    private static final long serialVersionUID = 3054752374095319450L;
    
    private CrsChannelHandlerDto submitData;
    
    private CrsChannelHandlerDto originData;

    public CrsChannelHandlerDto getSubmitData() {
        return submitData;
    }

    public void setSubmitData(CrsChannelHandlerDto submitData) {
        this.submitData = submitData;
    }

    public CrsChannelHandlerDto getOriginData() {
        return originData;
    }
   
    public void setOriginData(CrsChannelHandlerDto originData) {
        this.originData = originData;
    }
    
}
