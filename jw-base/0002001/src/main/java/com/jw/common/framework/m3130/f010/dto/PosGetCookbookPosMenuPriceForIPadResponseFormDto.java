package com.jw.common.framework.m3130.f010.dto;


/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */

import java.math.BigDecimal;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	PosGetCookbookPosMenuPriceForIPadResponseFormDto获取菜谱返回对象
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-21]
 * @package com.jw.hms.pos.m3310.f010.dto.posCookbook
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-21|gaofei|新增|PosGetCookbookResponseFormDto新增
 */
@DrptDto(dtonm = "PosGetCookbookPosMenuPriceForIPadResponseFormDto",dtodrpt="PosGetCookbookPosMenuPriceForIPadResponseFormDto获取菜品价格返回对象")
public class PosGetCookbookPosMenuPriceForIPadResponseFormDto implements java.io.Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -1462870759310742359L;
	
	@DrptField(fieldnm="goodsPriceId",fielddrpt="菜品价格标识")
	private java.lang.Integer goodsPriceId;
	
	@DrptField(fieldnm="goodsPriceAttach",fielddrpt="价格附加信息")
	private String goodsPriceAttach;
	
	@DrptField(fieldnm="goodsSpecId",fielddrpt="菜品规格标识")
	private java.lang.Integer goodsSpecId;
	
	@DrptField(fieldnm="goodsCd",fielddrpt="菜品规格代码")
	private String goodsCd;
	
	@DrptField(fieldnm="goodsCdNm",fielddrpt="菜品规格名称")
	private String goodsCdNm;
	
	@DrptField(fieldnm="goodsPrice",fielddrpt="菜品价格")
	private BigDecimal goodsPrice;
	
	@DrptField(fieldnm="goodsMemberPrice",fielddrpt="会员价")
	private BigDecimal goodsMemberPrice;
	
	@DrptField(fieldnm="goodsCostPrice",fielddrpt="成本价")
	private BigDecimal goodsCostPrice;
	
	@DrptField(fieldnm="goodsMenuPriceBar",fielddrpt="菜品价格条码")
	private String goodsMenuPriceBar;

	/**
	 * @return the goodsPriceId
	 */
	public java.lang.Integer getGoodsPriceId() {
		return goodsPriceId;
	}

	/**
	 * @param goodsPriceId the goodsPriceId to set
	 */
	public void setGoodsPriceId(java.lang.Integer goodsPriceId) {
		this.goodsPriceId = goodsPriceId;
	}

	/**
	 * @return the goodsPriceAttach
	 */
	public String getGoodsPriceAttach() {
		return goodsPriceAttach;
	}

	/**
	 * @param goodsPriceAttach the goodsPriceAttach to set
	 */
	public void setGoodsPriceAttach(String goodsPriceAttach) {
		this.goodsPriceAttach = goodsPriceAttach;
	}

	/**
	 * @return the goodsSpecId
	 */
	public java.lang.Integer getGoodsSpecId() {
		return goodsSpecId;
	}

	/**
	 * @param goodsSpecId the goodsSpecId to set
	 */
	public void setGoodsSpecId(java.lang.Integer goodsSpecId) {
		this.goodsSpecId = goodsSpecId;
	}

	/**
	 * @return the goodsCd
	 */
	public String getGoodsCd() {
		return goodsCd;
	}

	/**
	 * @param goodsCd the goodsCd to set
	 */
	public void setGoodsCd(String goodsCd) {
		this.goodsCd = goodsCd;
	}

	/**
	 * @return the goodsCdNm
	 */
	public String getGoodsCdNm() {
		return goodsCdNm;
	}

	/**
	 * @param goodsCdNm the goodsCdNm to set
	 */
	public void setGoodsCdNm(String goodsCdNm) {
		this.goodsCdNm = goodsCdNm;
	}

	/**
	 * @return the goodsPrice
	 */
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	/**
	 * @param goodsPrice the goodsPrice to set
	 */
	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	/**
	 * @return the goodsMemberPrice
	 */
	public BigDecimal getGoodsMemberPrice() {
		return goodsMemberPrice;
	}

	/**
	 * @param goodsMemberPrice the goodsMemberPrice to set
	 */
	public void setGoodsMemberPrice(BigDecimal goodsMemberPrice) {
		this.goodsMemberPrice = goodsMemberPrice;
	}

	/**
	 * @return the goodsCostPrice
	 */
	public BigDecimal getGoodsCostPrice() {
		return goodsCostPrice;
	}

	/**
	 * @param goodsCostPrice the goodsCostPrice to set
	 */
	public void setGoodsCostPrice(BigDecimal goodsCostPrice) {
		this.goodsCostPrice = goodsCostPrice;
	}

	/**
	 * @return the goodsMenuPriceBar
	 */
	public String getGoodsMenuPriceBar() {
		return goodsMenuPriceBar;
	}

	/**
	 * @param goodsMenuPriceBar the goodsMenuPriceBar to set
	 */
	public void setGoodsMenuPriceBar(String goodsMenuPriceBar) {
		this.goodsMenuPriceBar = goodsMenuPriceBar;
	}
	
}

