/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;

import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	多业务ID通用请求DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|IdsRequestDto.java新增
 */
@DrptDto(dtonm = "IdsRequestDto", dtodrpt = "多业务ID通用请求DTO")
public class IdsRequestDto extends RequestBaseDto implements java.io.Serializable {

	private static final long serialVersionUID = 6629846262292236599L;
	
	@DrptField(fieldnm = "ids", fielddrpt = "业务ID数组",logged = ENUM_LOGGED.YES)
	private Integer[] ids;
	
	@DrptField(fieldnm = "pkIds", fielddrpt = "pkIds",logged = ENUM_LOGGED.YES)
	private List<Integer> pkIds;

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	public List<Integer> getPkIds() {
		return pkIds;
	}

	public void setPkIds(List<Integer> pkIds) {
		this.pkIds = pkIds;
	}

}
