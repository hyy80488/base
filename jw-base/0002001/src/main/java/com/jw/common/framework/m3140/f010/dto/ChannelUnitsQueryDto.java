
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * 
 * ## 类说明：
 * 	渠道获取酒店列表
 * @author    [zm]   
 * @version   [V1.0, 2018年9月19日]
 * @package com.jw.common.framework.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月19日|zteng|新增|GrpCmmDirectSellingUnitQueryDto.java新增
 */
@DrptDto(dtonm = "直销查询酒店列表信息数据传输对象", dtodrpt = "直销查询酒店列表信息数据传输对象")
public class ChannelUnitsQueryDto extends RequestBaseDto implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -3269915081748799378L;
	//集团代码
	private String chainUid;
	//渠道代码
	private String channelNo;
	//渠道类型
	//private String channelFlg;
	public String getChainUid() {
		return chainUid;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
}
