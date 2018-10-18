package com.jw.common.framework.m3310.f010.dto;

/**   
* @Title: PosClearCheckResponseDto.java 
* @Package com.jw.hms.pos.m3310.f010.dto.posClear 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年9月4日 下午1:43:18 
* @version V1.0   
*/

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 沽清菜品返回dto
 * @author    [yingw]   
 * @version   [V1.0, 2018年9月4日]
 * @package com.jw.hms.pos.m3310.f010.dto.posClear
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月4日|yingw|新增|PosClearCheckResponseDto.java新增
*/
@DrptDto(dtonm = "PosClearCheckResponseDto",dtodrpt="沽清菜品返回dto 数据传输对象")
public class PosClearCheckResponseDto extends ResponseBaseDto implements java.io.Serializable {

    private static final long serialVersionUID = -3048953430724949353L;
    
    @DrptField(fieldnm="orderId",fielddrpt="账单id -- billId")
    private Integer orderId;
    
    @DrptField(fieldnm="clearGoods",fielddrpt="已沽清菜品list")
    private List<PosGoodsDto> clearGoods;

    public List<PosGoodsDto> getClearGoods() {
        return clearGoods;
    }

    public void setClearGoods(List<PosGoodsDto> clearGoods) {
        this.clearGoods = clearGoods;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    
}
