/**   
* @Title: PosTaxResponseDtoT.java 
* @Package com.jw.common.framework.m3310.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年6月27日 下午1:44:10 
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
 * @version   [V1.0, 2018年6月27日]
 * @package com.jw.common.framework.m3310.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年6月27日|gaofei|新增|PosTaxResponseDtoT.java新增
*/
@DrptDto(dtonm = "PosTaxResponseDtoT",dtodrpt="税对象")
public class PosTaxResponseDtoT extends ResponseBaseDto implements java.io.Serializable{

	@DrptField(fieldnm="posTaxDtoTs",fielddrpt="税")
	private List<PosTaxDtoRequestT>  posTaxDtoTs;

	public List<PosTaxDtoRequestT> getPosTaxDtoTs() {
		return posTaxDtoTs;
	}

	public void setPosTaxDtoTs(List<PosTaxDtoRequestT> posTaxDtoTs) {
		this.posTaxDtoTs = posTaxDtoTs;
	}

	
	


}
