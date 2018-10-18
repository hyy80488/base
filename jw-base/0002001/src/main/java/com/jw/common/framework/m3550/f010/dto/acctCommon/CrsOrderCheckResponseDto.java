/**   
* @Title: CrsOrderCheckResponseDto.java 
* @Package com.jw.common.framework.m3550.f010.dto.acctCommon 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月20日 上午9:14:32 
* @version V1.0   
*/
package com.jw.common.framework.m3550.f010.dto.acctCommon;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [yingw]   
 * @version   [V1.0, 2018年8月20日]
 * @package com.jw.common.framework.m3550.f010.dto.acctCommon
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月20日|yingw|新增|CrsOrderCheckResponseDto.java新增
*/
public class CrsOrderCheckResponseDto extends ResponseBaseDto implements java.io.Serializable {

    private static final long serialVersionUID = -1710433994735069987L;
    private CrsOrderCheckResponseDataDto resultData;

    public CrsOrderCheckResponseDataDto getResultData() {
        return resultData;
    }

    public void setResultData(CrsOrderCheckResponseDataDto resultData) {
        this.resultData = resultData;
    }
    
}
