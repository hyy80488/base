/**   
* @Title: HptHkRoomSwitchReqestDto.java 
* @Package com.jw.common.framework.m3250.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年9月25日 下午12:01:33 
* @version V1.0   
*/
package com.jw.common.framework.m3250.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [tianpei]   
 * @version   [V1.0, 2018年9月25日]
 * @package com.jw.common.framework.m3250.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月25日|tianpei|新增|HptHkRoomSwitchReqestDto.java新增
*/
@DrptDto(dtonm = "房间配置FORM信息数据传输对象",dtodrpt="房间配置FORM信息数据传输对象")
public class HptHkRoomSwitchReqestDto  extends RequestBaseDto implements java.io.Serializable {

	private static final long serialVersionUID = 116493846887888194L;

	@DrptField(fieldnm="submitData",fielddrpt="房间配置新值")
	private HptHkRoomSwitchDto submitData;
	
	@DrptField(fieldnm="originData",fielddrpt="房间配置原值")
	private HptHkRoomSwitchDto originData;

	public HptHkRoomSwitchDto getSubmitData() {
		return submitData;
	}

	public void setSubmitData(HptHkRoomSwitchDto submitData) {
		this.submitData = submitData;
	}

	public HptHkRoomSwitchDto getOriginData() {
		return originData;
	}

	public void setOriginData(HptHkRoomSwitchDto originData) {
		this.originData = originData;
	}
	
}
