
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3260.f010.dto;

import java.math.BigDecimal;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/**
 * ## 类说明：
 * 	应收账户FORM信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-07-19]
 * @package com.jw.hms.group.m3260.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-07-19|jianana|新增|GrpArAccountResponseFormDto新增
 */
@DrptDto(dtonm = "应收账户FORM信息数据传输对象",dtodrpt="应收账户FORM信息数据传输对象")
public class CommonGrpArAccountResponseFormDto extends ResponseBaseDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5392099688639601650L;
	public String arNm;
	public String postFlg;
	public String arStus;
	public BigDecimal creditLimit;
	public BigDecimal arBal;
	
	public String getArStus() {
		return arStus;
	}
	public void setArStus(String arStus) {
		this.arStus = arStus;
	}
	public String getArNm() {
		return arNm;
	}
	public void setArNm(String arNm) {
		this.arNm = arNm;
	}
	public String getPostFlg() {
		return postFlg;
	}
	public void setPostFlg(String postFlg) {
		this.postFlg = postFlg;
	}
	public BigDecimal getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}
	public BigDecimal getArBal() {
		return arBal;
	}
	public void setArBal(BigDecimal arBal) {
		this.arBal = arBal;
	}
	
	
}
