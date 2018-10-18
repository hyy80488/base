package com.jw.common.framework.m3550.f010.dto.checkavailability;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;


/**
 * ## 类说明：
 * 	可订性检查响应dto
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年8月17日]
 * @package com.jw.common.framework.m3550.f010.dto.checkavailability
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年8月17日|MiaoDaZhuang|新增|CheckAvailabilityResDto.java新增
*/
public class CheckAvailabilityResDto extends ResponseBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -6775312312241396114L;

	//crs房间
	private List<Map<String,Object>> lstCrsRoom;

	public List<Map<String, Object>> getLstCrsRoom() {
		return lstCrsRoom;
	}

	public void setLstCrsRoom(List<Map<String, Object>> lstCrsRoom) {
		this.lstCrsRoom = lstCrsRoom;
	}
}
