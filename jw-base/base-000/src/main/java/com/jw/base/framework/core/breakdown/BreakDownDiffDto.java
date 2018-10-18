package com.jw.base.framework.core.breakdown;

import java.math.BigDecimal;


/**
 * ## 类说明：
 * 	阶梯方式dto
 * @author    [MiaoDaZhuang]   
 * @version   [V1.0, 2018年3月15日]
 * @package com.jw.base.framework.core.breakdown
 * @since 日期|作者|类型|内容:----|:-----|:-----|:-----2018年3月15日|MiaoDaZhuang|新增|BreakDownDiffDto.java新增
*/
public class BreakDownDiffDto {
	//阶梯基准
	private String diffStand;
	//阶梯收费方式
	private String diffTyp;
	//阶梯金额
	private Double diffAmt;
	//收费方式金额 || 百分比
	private Double diffNum;
	public String getDiffStand() {
		return diffStand;
	}
	public String getDiffTyp() {
		return diffTyp;
	}
	public void setDiffStand(String diffStand) {
		this.diffStand = diffStand;
	}
	public void setDiffTyp(String diffTyp) {
		this.diffTyp = diffTyp;
	}
	public Double getDiffAmt() {
		return diffAmt;
	}
	public Double getDiffNum() {
		return diffNum;
	}
	public void setDiffAmt(Double diffAmt) {
		this.diffAmt = diffAmt;
	}
	public void setDiffNum(Double diffNum) {
		this.diffNum = diffNum;
	}
}
