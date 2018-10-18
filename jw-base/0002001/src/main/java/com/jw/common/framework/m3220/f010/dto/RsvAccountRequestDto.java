/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3220.f010.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	预定初始化参数
 * @author    [jianana]   
 * @version   [V1.0, 2017年3月22日]
 * @package com.jw.hms.pms.m3220.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年3月22日|jianana|新增|RsvAccountParamDto.java新增
 */
@DrptDto(dtonm = "预定初始化参数",dtodrpt="预定初始化参数")
public class RsvAccountRequestDto extends RequestBaseDto implements java.io.Serializable{

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 9127122590522369663L;
	@DrptField(fieldnm="acctNos", fielddrpt="预订账号 集合", nullable = "false")
	private List<String> acctNos;
	@DrptField(fieldnm="acctNo", fielddrpt="预订账号", nullable = "false")
	private String acctNo;
	@DrptField(fieldnm="resvNo", fielddrpt="预订号", nullable = "false")
	private String resvNo;
	@DrptField(fieldnm="histStus", fielddrpt="0当前   1历史", nullable = "false")
	private String histStus;
	
	
	
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getHistStus() {
		return histStus;
	}
	public void setHistStus(String histStus) {
		this.histStus = histStus;
	}
	public List<String> getAcctNos() {
		return acctNos;
	}
	public void setAcctNos(List<String> acctNos) {
		this.acctNos = acctNos;
	}
	public String getResvNo() {
		return resvNo;
	}
	public void setResvNo(String resvNo) {
		this.resvNo = resvNo;
	}
	
}
