
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
 * 	商品定义子DTO
 * @author    [sunqihua]   
 * @version   [V1.0, 2017-10-17]
 * @package com.jw.hms.pms.m3280.f010.subdto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-10-17|sunqihua|新增|GrpFinBaseGoodsSubDto新增
 */
@DrptDto(dtonm = "商品定义子DTO",dtodrpt="商品定义子DTO")
public class GrpFinBaseGoodsSubDto implements java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 510794644834255659L;
	@DrptField(fieldnm = "CRUD类型", fielddrpt = "CRUD类型")
	private String typCRUD;
	public String getTypCRUD() {
		return this.typCRUD;
	}
	public void setTypCRUD(String value) {
		this.typCRUD=value;
	}
	
}

