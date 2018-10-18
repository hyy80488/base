
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3220.f010.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;
/**
 * ## 类说明：
 * 	可用房dto
 * @author    [dazhuang]   
 * @version   [V1.0, 2017-03-17]
 * @package com.jw.hms.pms.m3250.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-03-17|dazhuangm|新增|RmCheckDto新增
 */
@DrptDto(dtonm = "RoomAvaResponseDto",dtodrpt="可用房响应dto")
public class RoomAvaResponseDto extends ResponseBaseDto implements Serializable {
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -4644233665760056459L;
	@DrptField(fieldnm="roomAvas",fielddrpt="可用房数据按日期")
	private List<RoomAvaRes> roomAvas;
	@DrptField(fieldnm="dataTable",fielddrpt="画面展示数据")
	private List<Map<String, Map<String, Object>>> dataTable;
	@JSONField(serialize=false)  
	public List<RoomAvaRes> getRoomAvas() {
		return roomAvas;
	}

	public void setRoomAvas(List<RoomAvaRes> roomAvas) {
		this.roomAvas = roomAvas;
	}

	public List<Map<String, Map<String, Object>>> getDataTable() {
		return dataTable;
	}

	public void setDataTable(List<Map<String, Map<String, Object>>> dataTable) {
		this.dataTable = dataTable;
	}
	

}
