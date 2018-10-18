package com.jw.common.framework.m3130.f010.dto;


/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */

import java.math.BigDecimal;

import com.jw.base.framework.core.annotation.DrptField;

/**
 * 
 * ## 类说明：
 * 	给IPad端返回制法的实体类
 * @author    [liyunlong]   
 * @version   [V1.0, 2018年9月12日]
 * @package com.jw.hms.cmm.m3130.f030.dto.posMenu
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月12日|liyunlong|新增|PosMakeForIPadInfo.java新增
 */
public class PosMakeForIPadInfo implements java.io.Serializable{
	
    private static final long serialVersionUID = 3063761573370319895L;

    @DrptField(fieldnm="制法名称",fielddrpt="制法名称")
	private String makeName;
	
	@DrptField(fieldnm="制法价格",fielddrpt="制法价格")
	private BigDecimal makePrice;
	
	@DrptField(fieldnm="制法代码",fielddrpt="制法代码")
	private String makeCd;
	
	@DrptField(fieldnm="制法标识",fielddrpt="制法标识")
	private Integer makeId;
	
	@DrptField(fieldnm="制法有效标识",fielddrpt="制法有效标识")
	private String makeValidFlg;
	
	@DrptField(fieldnm="制法类别",fielddrpt="制法类别")
	private Integer makeTyp;
	
	@DrptField(fieldnm="制法属性",fielddrpt="制法属性")
	private String makeFlg;
	
	@DrptField(fieldnm="备注",fielddrpt="备注")
	private String memo;
	
	@DrptField(fieldnm="排序号",fielddrpt="排序号")
	private Integer makeSeq;

	/**
	 * @return the makeName
	 */
	public String getMakeName() {
		return makeName;
	}

	/**
	 * @param makeName the makeName to set
	 */
	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}

	/**
	 * @return the makePrice
	 */
	public BigDecimal getMakePrice() {
		return makePrice;
	}

	/**
	 * @param makePrice the makePrice to set
	 */
	public void setMakePrice(BigDecimal makePrice) {
		this.makePrice = makePrice;
	}

	/**
	 * @return the makeCd
	 */
	public String getMakeCd() {
		return makeCd;
	}

	/**
	 * @param makeCd the makeCd to set
	 */
	public void setMakeCd(String makeCd) {
		this.makeCd = makeCd;
	}

	/**
	 * @return the makeId
	 */
	public Integer getMakeId() {
		return makeId;
	}

	/**
	 * @param makeId the makeId to set
	 */
	public void setMakeId(Integer makeId) {
		this.makeId = makeId;
	}

	/**
	 * @return the makeValidFlg
	 */
	public String getMakeValidFlg() {
		return makeValidFlg;
	}

	/**
	 * @param makeValidFlg the makeValidFlg to set
	 */
	public void setMakeValidFlg(String makeValidFlg) {
		this.makeValidFlg = makeValidFlg;
	}

	/**
	 * @return the makeTyp
	 */
	public Integer getMakeTyp() {
		return makeTyp;
	}

	/**
	 * @param makeTyp the makeTyp to set
	 */
	public void setMakeTyp(Integer makeTyp) {
		this.makeTyp = makeTyp;
	}

	/**
	 * @return the makeFlg
	 */
	public String getMakeFlg() {
		return makeFlg;
	}

	/**
	 * @param makeFlg the makeFlg to set
	 */
	public void setMakeFlg(String makeFlg) {
		this.makeFlg = makeFlg;
	}

	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return the makeSeq
	 */
	public Integer getMakeSeq() {
		return makeSeq;
	}

	/**
	 * @param makeSeq the makeSeq to set
	 */
	public void setMakeSeq(Integer makeSeq) {
		this.makeSeq = makeSeq;
	}
	
	
}

