
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	房型配置子DTO
 * @author    [jianana]   
 * @version   [V1.0, 2017-03-21]
 * @package com.jw.hms.cmm.m3130.f010.subdto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-03-21|jianana|新增|GrpHkUnitRoomtypeSubDto新增
 */
@DrptDto(dtonm = "房型配置子DTO",dtodrpt="房型配置子DTO")
public class SubDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 7991571844213260402L;
	@DrptField(fieldnm = "typCRUD", fielddrpt = "CRUD类型")
	private String typCRUD;
	public String getTypCRUD() {
		return this.typCRUD;
	}
	public void setTypCRUD(String value) {
		this.typCRUD=value;
	}
	
}

