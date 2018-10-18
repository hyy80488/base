/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.Map;
import java.util.Set;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	任务分发DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|MissionRequestDto.java新增
 */
@DrptDto(dtonm = "MissionRequestDto", dtodrpt = "任务分发DTO")
public class CommandRequestDto extends RequestBaseDto implements java.io.Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7043087867971005406L;

	@DrptField(fieldnm = "unitUid", fielddrpt = "unitUid")
	private String unitUid;
	
	@DrptField(fieldnm = "chainUid", fielddrpt = "chainUid")
	private String chainUid;
	
	@DrptField(fieldnm = "commandTyp", fielddrpt = "commandTyp")
	private String commandTyp;
	
	@DrptField(fieldnm = "param", fielddrpt = "param")
	private Map<String, Object> param;
	
	@DrptField(fieldnm = "orgParam", fielddrpt = "param")
	private Map<String, Object> orgParam;

	/**
	 * @return the unitUid
	 */
	public String getUnitUid() {
		return unitUid;
	}

	/**
	 * @param unitUid the unitUid to set
	 */
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

	/**
	 * @return the chainUid
	 */
	public String getChainUid() {
		return chainUid;
	}

	/**
	 * @param chainUid the chainUid to set
	 */
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}

	public String getCommandTyp() {
		return commandTyp;
	}

	public void setCommandTyp(String commandTyp) {
		this.commandTyp = commandTyp;
	}

	/**
	 * @return the param
	 */
	public Map<String, Object> getParam() {
		return param;
	}

	/**
	 * @param param the param to set
	 */
	public void setParam(Map<String,  Object> param) {
		this.param = param;
	}
	
	
	public Map<String, Object> getOrgParam() {
		return orgParam;
	}

	public void setOrgParam(Map<String, Object> orgParam) {
		this.orgParam = orgParam;
	}


	//命令代码
	private String commandCd;

	public String getCommandCd() {
		return commandCd;
	}

	public void setCommandCd(String commandCd) {
		this.commandCd = commandCd;
	}
	
	
	private MqParamDto mqParamDto;

	public MqParamDto getMqParamDto() {
		return mqParamDto;
	}

	public void setMqParamDto(MqParamDto mqParamDto) {
		this.mqParamDto = mqParamDto;
	}
}
