
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
import java.util.Map;

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
@DrptDto(dtonm = "PosCookBookQueryResponseDtoT",dtodrpt="菜谱sql结果")
public class PosCookBookQueryResponseDtoT extends ResponseBaseDto implements java.io.Serializable{

	@DrptField(fieldnm="listMapMenuTypFirstList",fielddrpt="菜品类别")
	private List<Map<String, Object>> listMapMenuTypFirstList;
	
	@DrptField(fieldnm="listMapMenuTypSecondList",fielddrpt="菜品类别")
	private List<Map<String, Object>> listMapMenuTypSecondList;

	public List<Map<String, Object>> getListMapMenuTypFirstList() {
		return listMapMenuTypFirstList;
	}

	public void setListMapMenuTypFirstList(List<Map<String, Object>> listMapMenuTypFirstList) {
		this.listMapMenuTypFirstList = listMapMenuTypFirstList;
	}

	public List<Map<String, Object>> getListMapMenuTypSecondList() {
		return listMapMenuTypSecondList;
	}

	public void setListMapMenuTypSecondList(List<Map<String, Object>> listMapMenuTypSecondList) {
		this.listMapMenuTypSecondList = listMapMenuTypSecondList;
	}

	

	


}
