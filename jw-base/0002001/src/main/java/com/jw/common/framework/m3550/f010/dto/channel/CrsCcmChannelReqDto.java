
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3550.f010.dto.channel;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [jianana]   
 * @version   [V1.0, 2018年8月18日]
 * @package com.jw.common.framework.m3550.f010.dto.channel
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月18日|jianana|新增|CrsCcmChannelReqDto.java新增
 */
@DrptDto(dtonm = "渠道信息QUERY信息数据传输对象", dtodrpt = "渠道信息QUERY信息数据传输对象")
public class CrsCcmChannelReqDto extends RequestBaseDto implements java.io.Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 1344991806889091913L;

	@DrptField(fieldnm = "chainUid", fielddrpt = "chainUid", nullable = "false", length = "40")
	private String chainUid;

	@DrptField(fieldnm = "syschannelId", fielddrpt = "syschannelId", nullable = "true", length = "4")
	private Integer syschannelId;


	@DrptField(fieldnm = "unitUid", fielddrpt = "unitUid", nullable = "true", length = "40")
	private String unitUid;


	public String getChainUid() {
		return chainUid;
	}


	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}


	public Integer getSyschannelId() {
		return syschannelId;
	}


	public void setSyschannelId(Integer syschannelId) {
		this.syschannelId = syschannelId;
	}


	public String getUnitUid() {
		return unitUid;
	}


	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

}
