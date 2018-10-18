/**   
* @Title: PosMenuPriceResponseDtoT.java 
* @Package com.jw.common.framework.m3310.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年6月26日 下午4:01:37 
* @version V1.0   
*/
package com.jw.common.framework.m3310.f010.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [gaofei]   
 * @version   [V1.0, 2018年6月26日]
 * @package com.jw.common.framework.m3310.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年6月26日|gaofei|新增|PosMenuPriceResponseDtoT.java新增
*/
@DrptDto(dtonm = "PosMenuPriceResponseDtoT",dtodrpt="菜价类别配置返回传输对象")
public class PosMenuPriceResponseDtoT extends ResponseBaseDto implements java.io.Serializable{

	@DrptField(fieldnm="posMenuPriceDtoTs",fielddrpt="菜品类别")
	private List<PosMenuPriceDtoT>  posMenuPriceDtoTs;

	public List<PosMenuPriceDtoT> getPosMenuPriceDtoTs() {
		return posMenuPriceDtoTs;
	}

	public void setPosMenuPriceDtoTs(List<PosMenuPriceDtoT> posMenuPriceDtoTs) {
		this.posMenuPriceDtoTs = posMenuPriceDtoTs;
	}

	


}
