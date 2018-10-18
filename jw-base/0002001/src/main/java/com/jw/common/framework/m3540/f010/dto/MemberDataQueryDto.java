package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;
import java.util.Collection;

import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


/**
 * ## 类说明：
 * 	会员数据查询
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年10月11日]
 * @package com.jw.common.framework.m3540.f010.dto
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年10月11日|MiaoDaZhuang|新增|MemberDataQueryDto.java新增
*/
public class MemberDataQueryDto extends RequestBaseDto implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -4038003068065260445L;
	@DrptField(fieldnm="memberNo",fielddrpt="会员号")
	private String memberNo;
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
/*	@DrptField(fieldnm="param",fielddrpt="参数")
	private Map<String, Object> param;
	public Map<String, Object> getParam() {
		return param;
	}
	public void setParam(Map<String, Object> param) {
		this.param = param;
	}
	@DrptField(fieldnm="condMap",fielddrpt="条件数据")
	private Map<String, String> condMap;
	public Map<String, String> getCondMap() {
		return condMap;
	}
	public void setCondMap(Map<String, String> condMap) {
		this.condMap = condMap;
	}*/
	
	private Collection<UpgradeCondGroupDto> paramDtos;
	public Collection<UpgradeCondGroupDto> getParamDtos() {
		return paramDtos;
	}
	public void setParamDtos(Collection<UpgradeCondGroupDto> paramDtos) {
		this.paramDtos = paramDtos;
	}
}
