/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5100.f010.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
import com.jw.common.framework.m0002.f001.dto.mq.point.LpsBnsConsumeDto;

@DrptDto(dtonm = "DealMemberDto",dtodrpt="处理消费")
public class DealMemberDto extends RequestBaseDto implements java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1714390290728298689L;
	//积分和金额暂时不传，传消费明细项，然后计算金额和积分
	BigDecimal trnAmt;
	BigDecimal score;
	public BigDecimal getTrnAmt() {
		return trnAmt;
	}
	public void setTrnAmt(BigDecimal trnAmt) {
		this.trnAmt = trnAmt;
	}
	public BigDecimal getScore() {
		return score;
	}
	public void setScore(BigDecimal score) {
		this.score = score;
	} 
	

}
