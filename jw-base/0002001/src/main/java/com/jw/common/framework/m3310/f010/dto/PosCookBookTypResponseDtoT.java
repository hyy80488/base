

/**   
* @Title: PosMenuTypResponseDtoT.java 
* @Package com.jw.common.framework.m3310.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年6月25日 上午10:30:11 
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
 * @version   [V1.0, 2018年6月25日]
 * @package com.jw.common.framework.m3310.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年6月25日|gaofei|新增|PosMenuTypResponseDtoT.java新增
*/
@DrptDto(dtonm = "PosCookBookTypResponseDtoT",dtodrpt="菜谱类别配置返回传输对象")
public class PosCookBookTypResponseDtoT extends ResponseBaseDto implements java.io.Serializable{

	@DrptField(fieldnm="posCookbookTypDtos",fielddrpt="菜谱类别")
	private List<PosCookbookTypDto>  posCookbookTypDtos;

	public List<PosCookbookTypDto> getPosCookbookTypDtos() {
		return posCookbookTypDtos;
	}

	public void setPosCookbookTypDtos(List<PosCookbookTypDto> posCookbookTypDtos) {
		this.posCookbookTypDtos = posCookbookTypDtos;
	}

	
	
}
