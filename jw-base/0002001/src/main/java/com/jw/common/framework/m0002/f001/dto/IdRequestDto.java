/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	单业务ID通用请求DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|IdRequestDto.java新增
 */
@DrptDto(dtonm = "IdRequestDto", dtodrpt = "单业务ID通用请求DTO")
public class IdRequestDto extends RequestBaseDto implements java.io.Serializable{
	
	private static final long serialVersionUID = 2393472676649728095L;
	@DrptField(fieldnm = "id", fielddrpt = "业务ID",logged = ENUM_LOGGED.YES)
	private Integer id;
//	0：不是   1：是
	@DrptField(fieldnm = "history", fielddrpt = "是否历史库数据 ",logged = ENUM_LOGGED.YES)
	private String history;

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
