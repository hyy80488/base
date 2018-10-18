
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/** 
 * ## 类说明：
 * 	税率配置DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f030.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|gaofei|新增|PosTaxResultDto新增
 */
@DrptDto(dtonm = "PosCdsRequestDto",dtodrpt="Pos请求通用DTO")
public class PosCdsRequestDto extends RequestBaseDto implements  java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1424441876491754053L;
	private String[] cds;
	public String[] getCds() {
		return cds;
	}
	public void setCds(String[] cds) {
		this.cds = cds;
	}

	
}

