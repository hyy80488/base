package com.jw.common.framework.m3310.f010.dto;

/**   
* @Title: PosDemandDto.java 
* @Package com.jw.hms.pos.m3310.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年9月14日 下午3:10:27 
* @version V1.0   
*/

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 口味、需求Dto
 * @author    [yingw]   
 * @version   [V1.0, 2018年9月14日]
 * @package com.jw.hms.pos.m3310.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月14日|yingw|新增|PosDemandDto.java新增
*/
@DrptDto(dtonm = "PosDemandDto",dtodrpt="口味、需求Dto")
public class PosDemandDto implements java.io.Serializable {
    
    private static final long serialVersionUID = -8941333230029192149L;

    @DrptField(fieldnm="tasteName",fielddrpt="口味、需求名称")
    private String tasteName;
    
    @DrptField(fieldnm="tasteId",fielddrpt="口味、需求id")
    private Integer tasteId;

    public String getTasteName() {
        return tasteName;
    }

    public void setTasteName(String tasteName) {
        this.tasteName = tasteName;
    }

    public Integer getTasteId() {
        return tasteId;
    }

    public void setTasteId(Integer tasteId) {
        this.tasteId = tasteId;
    }
    
}
