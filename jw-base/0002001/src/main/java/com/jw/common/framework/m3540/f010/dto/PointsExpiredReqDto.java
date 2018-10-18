package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


/**
 * ## 类说明：
 * 	过期清零DTO
 * @author    [mdz]   
 * @version   [V1.0, 2018年10月15日]
 * @package com.jw.common.framework.m3540.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年10月15日|mdz|新增|PointsExpiredReqDto.java新增
 */
public class PointsExpiredReqDto extends RequestBaseDto implements Serializable   {
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -4978640272078604909L;
	private String chainUid;
	private String unitUid;

	
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
	
	private String key;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	private String memberNo;
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
}
