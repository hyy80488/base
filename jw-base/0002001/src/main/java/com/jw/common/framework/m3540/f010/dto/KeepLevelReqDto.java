package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


/**
 * ## 类说明：
 * 	保级DTO
 * @author    [jianana]   
 * @version   [V1.0, 2018年10月15日]
 * @package com.jw.common.framework.m3540.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年10月15日|jianana|新增|KeepLevelReqDto.java新增
 */
public class KeepLevelReqDto extends RequestBaseDto implements Serializable   {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -6941976379838227031L;
	
	private String chainUid;
	private String unitUid;
	private String memberNo;
	private String key;

	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getUnitUid() {
		return unitUid;
	}

	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

	public String getChainUid() {
		return chainUid;
	}

	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	
	
	
}
