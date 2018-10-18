package com.jw.common.framework.m3130.f010.dto;


/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */

import java.math.BigDecimal;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	PosGetCookbookPosMenuForIPadResponseFormDto获取分类下菜品返回对象
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-21]
 * @package com.jw.hms.pos.m3310.f010.dto.posCookbook
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-21|gaofei|新增|PosGetCookbookResponseFormDto新增
 */
@DrptDto(dtonm = "PosGetCookbookPosMenuForIPadResponseFormDto",dtodrpt="PosGetCookbookPosMenuForIPadResponseFormDto获取分类下菜品返回对象")
public class PosGetCookbookPosMenuForIPadResponseFormDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1507418073314639778L;

	@DrptField(fieldnm="goodsId",fielddrpt="菜品标识")
	private java.lang.Integer goodsId;
	
	@DrptField(fieldnm="goodsCd",fielddrpt="菜品代码")
	private String goodsCd;
	
	@DrptField(fieldnm="goodsNm",fielddrpt="菜品名称")
	private String goodsNm;
	
	@DrptField(fieldnm="goodsBar",fielddrpt="菜品条码")
	private String goodsBar;
	
	@DrptField(fieldnm="goodsAlias",fielddrpt="菜品别名")
	private String goodsAlias;
	
	/**菜品标识位 0-普通菜品 1-套餐 关联套餐子项表 2-计时项目 关联计时项目策略表 3-场租 场租的价表根据预订区域来进行关联定义,预订区域的加收通过自动入账项目进行关联处理 4-税金 当前配置的菜品为税金项目 5-折扣 配置为折扣项目 6-服务费 配置为服务费项目 7-加工费 配置为加工费项目**/
	@DrptField(fieldnm="goodsFlg",fielddrpt="菜品标识位")
	private String goodsFlg;
	
	/**系统标识 0-不是,1-是 折扣、服务费、加工费应为系统定义,系统定义的项目不需要配置价格,也不需要加入菜谱**/
	@DrptField(fieldnm="systemFlg",fielddrpt="系统标识")
	private String systemFlg;
	
	@DrptField(fieldnm="goodsUnitsId",fielddrpt="菜品计量单位标识")
	private java.lang.Integer goodsUnitsId;
	
	/**估清控制 0-菜品估清 1-菜谱估清 按菜品估清是指估清控制作用于全部菜谱,按菜谱估清是指不同菜谱对此菜品都有估清控制**/
	@DrptField(fieldnm="goodsClearFlag",fielddrpt="估清控制")
	private String goodsClearFlag;
	
	@DrptField(fieldnm="goodsClearUnitsId",fielddrpt="估清计量单位标识")
	private java.lang.Integer goodsClearUnitsId;
	
	/**编辑名称 0-不允许,1-允许**/
	@DrptField(fieldnm="goodsEditNameFlg",fielddrpt="编辑名称 ")
	private String goodsEditNameFlg;
	
	/**编辑价格 0-不允许,1-允许**/
	@DrptField(fieldnm="goodsEditPriceFlg",fielddrpt="good_编辑价格")
	private String goodsEditPriceFlg;
	
	/**地理系统显示 0-不允许,1-允许**/
	@DrptField(fieldnm="goodsShowPassedFlg",fielddrpt="地理系统显示")
	private String goodsShowPassedFlg;
	
	/**折扣标识 0-不收 1-全局 按照餐点默认折扣->销售点默认折扣的规则计算折扣 2-菜品 按照当前项目配置的默认折扣计算**/
	@DrptField(fieldnm="goodsDiscountFlg",fielddrpt="折扣标识")
	private String goodsDiscountFlg;
	
	/**折扣方式 0-比率,1-金额**/
	@DrptField(fieldnm="goodsDiscountTyp",fielddrpt="折扣方式")
	private String goodsDiscountTyp;
	
	@DrptField(fieldnm="goodsDiscountValue",fielddrpt="折扣比率或金额数值")
	private BigDecimal goodsDiscountValue;
	
	/**服务费标识 0-不收 1-全局 按照服务费区域->餐点默认服务费率->销售点默认服务费率的规则计算服务费 2-菜品 按照当前项目配置的默认服务费计算**/
	@DrptField(fieldnm="goodsServiceFlg",fielddrpt="服务费标识")
	private String goodsServiceFlg;
	
	/**服务费方式 0-比率,1-金额**/
	@DrptField(fieldnm="goodsServiceTyp",fielddrpt="服务费方式")
	private String goodsServiceTyp;
	
	@DrptField(fieldnm="goodsServiceValue",fielddrpt="服务费比率或金额数值")
	private BigDecimal goodsServiceValue;
	
	@DrptField(fieldnm="goodsDisplaySeq",fielddrpt="显示顺序")
	private java.lang.Integer goodsDisplaySeq;
	
	/**弹出需求 0-不弹出,1-弹出**/
	@DrptField(fieldnm="goodsShowMakeFlg",fielddrpt="弹出需求")
	private String goodsShowMakeFlg;
	
	/**弹出制法 0-不弹出,1-弹出**/
	@DrptField(fieldnm="goodsShowDemandFlg",fielddrpt="弹出制法")
	private String goodsShowDemandFlg;
	
	/**必选制法 0-不必选,1-必选**/
	@DrptField(fieldnm="goodsMustMakeFlg",fielddrpt="必选制法")
	private String goodsMustMakeFlg;
	
	/**称重菜标识 0-否,1-是**/
	@DrptField(fieldnm="goodsWeighedFlg",fielddrpt="称重菜标识")
	private String goodsWeighedFlg;
	
	/**参与最低消费 0-否,1-是**/
	@DrptField(fieldnm="goodsMinimumsFlg",fielddrpt="参与最低消费")
	private String goodsMinimumsFlg;
	
	@DrptField(fieldnm="goodsIngredientMemo",fielddrpt="配料备注")
	private String goodsIngredientMemo;
	
	@DrptField(fieldnm="goodsTasteMemo",fielddrpt="口味备注")
	private String goodsTasteMemo;
	
	@DrptField(fieldnm="goodsMakeMemo",fielddrpt="做法备注")
	private String goodsMakeMemo;
	
	@DrptField(fieldnm="goodsRecommendedFlg",fielddrpt="0-非推荐菜（默认），1-推荐菜")
	private String goodsRecommendedFlg;
	
	@DrptField(fieldnm="goodsSpecialFlag",fielddrpt="0-非特色菜（默认），1-特色菜")
	private String goodsSpecialFlag;
	
	@DrptField(fieldnm="goodsMenuimageId",fielddrpt="显示图片id")
	private java.lang.Integer goodsMenuimageId;
	
	@DrptField(fieldnm="goodsMenuimageUrl",fielddrpt="显示图片url")
	private String goodsMenuimageUrl;
	
	@DrptField(fieldnm="goodsPrices",fielddrpt="菜品价格")
	private List<PosGetCookbookPosMenuPriceForIPadResponseFormDto> goodsPrices;

	/**
	 * @return the goodsId
	 */
	public java.lang.Integer getGoodsId() {
		return goodsId;
	}

	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(java.lang.Integer goodsId) {
		this.goodsId = goodsId;
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
	 * @return the goodsNm
	 */
	public String getGoodsNm() {
		return goodsNm;
	}

	/**
	 * @param goodsNm the goodsNm to set
	 */
	public void setGoodsNm(String goodsNm) {
		this.goodsNm = goodsNm;
	}

	/**
	 * @return the goodsBar
	 */
	public String getGoodsBar() {
		return goodsBar;
	}

	/**
	 * @param goodsBar the goodsBar to set
	 */
	public void setGoodsBar(String goodsBar) {
		this.goodsBar = goodsBar;
	}

	/**
	 * @return the goodsAlias
	 */
	public String getGoodsAlias() {
		return goodsAlias;
	}

	/**
	 * @param goodsAlias the goodsAlias to set
	 */
	public void setGoodsAlias(String goodsAlias) {
		this.goodsAlias = goodsAlias;
	}

	/**
	 * @return the goodsFlg
	 */
	public String getGoodsFlg() {
		return goodsFlg;
	}

	/**
	 * @param goodsFlg the goodsFlg to set
	 */
	public void setGoodsFlg(String goodsFlg) {
		this.goodsFlg = goodsFlg;
	}

	/**
	 * @return the systemFlg
	 */
	public String getSystemFlg() {
		return systemFlg;
	}

	/**
	 * @param systemFlg the systemFlg to set
	 */
	public void setSystemFlg(String systemFlg) {
		this.systemFlg = systemFlg;
	}

	/**
	 * @return the goodsUnitsId
	 */
	public java.lang.Integer getGoodsUnitsId() {
		return goodsUnitsId;
	}

	/**
	 * @param goodsUnitsId the goodsUnitsId to set
	 */
	public void setGoodsUnitsId(java.lang.Integer goodsUnitsId) {
		this.goodsUnitsId = goodsUnitsId;
	}

	/**
	 * @return the goodsClearFlag
	 */
	public String getGoodsClearFlag() {
		return goodsClearFlag;
	}

	/**
	 * @param goodsClearFlag the goodsClearFlag to set
	 */
	public void setGoodsClearFlag(String goodsClearFlag) {
		this.goodsClearFlag = goodsClearFlag;
	}

	/**
	 * @return the goodsClearUnitsId
	 */
	public java.lang.Integer getGoodsClearUnitsId() {
		return goodsClearUnitsId;
	}

	/**
	 * @param goodsClearUnitsId the goodsClearUnitsId to set
	 */
	public void setGoodsClearUnitsId(java.lang.Integer goodsClearUnitsId) {
		this.goodsClearUnitsId = goodsClearUnitsId;
	}

	/**
	 * @return the goodsEditNameFlg
	 */
	public String getGoodsEditNameFlg() {
		return goodsEditNameFlg;
	}

	/**
	 * @param goodsEditNameFlg the goodsEditNameFlg to set
	 */
	public void setGoodsEditNameFlg(String goodsEditNameFlg) {
		this.goodsEditNameFlg = goodsEditNameFlg;
	}

	/**
	 * @return the goodsEditPriceFlg
	 */
	public String getGoodsEditPriceFlg() {
		return goodsEditPriceFlg;
	}

	/**
	 * @param goodsEditPriceFlg the goodsEditPriceFlg to set
	 */
	public void setGoodsEditPriceFlg(String goodsEditPriceFlg) {
		this.goodsEditPriceFlg = goodsEditPriceFlg;
	}

	/**
	 * @return the goodsShowPassedFlg
	 */
	public String getGoodsShowPassedFlg() {
		return goodsShowPassedFlg;
	}

	/**
	 * @param goodsShowPassedFlg the goodsShowPassedFlg to set
	 */
	public void setGoodsShowPassedFlg(String goodsShowPassedFlg) {
		this.goodsShowPassedFlg = goodsShowPassedFlg;
	}

	/**
	 * @return the goodsDiscountFlg
	 */
	public String getGoodsDiscountFlg() {
		return goodsDiscountFlg;
	}

	/**
	 * @param goodsDiscountFlg the goodsDiscountFlg to set
	 */
	public void setGoodsDiscountFlg(String goodsDiscountFlg) {
		this.goodsDiscountFlg = goodsDiscountFlg;
	}

	/**
	 * @return the goodsDiscountTyp
	 */
	public String getGoodsDiscountTyp() {
		return goodsDiscountTyp;
	}

	/**
	 * @param goodsDiscountTyp the goodsDiscountTyp to set
	 */
	public void setGoodsDiscountTyp(String goodsDiscountTyp) {
		this.goodsDiscountTyp = goodsDiscountTyp;
	}

	/**
	 * @return the goodsDiscountValue
	 */
	public BigDecimal getGoodsDiscountValue() {
		return goodsDiscountValue;
	}

	/**
	 * @param goodsDiscountValue the goodsDiscountValue to set
	 */
	public void setGoodsDiscountValue(BigDecimal goodsDiscountValue) {
		this.goodsDiscountValue = goodsDiscountValue;
	}

	/**
	 * @return the goodsServiceFlg
	 */
	public String getGoodsServiceFlg() {
		return goodsServiceFlg;
	}

	/**
	 * @param goodsServiceFlg the goodsServiceFlg to set
	 */
	public void setGoodsServiceFlg(String goodsServiceFlg) {
		this.goodsServiceFlg = goodsServiceFlg;
	}

	/**
	 * @return the goodsServiceTyp
	 */
	public String getGoodsServiceTyp() {
		return goodsServiceTyp;
	}

	/**
	 * @param goodsServiceTyp the goodsServiceTyp to set
	 */
	public void setGoodsServiceTyp(String goodsServiceTyp) {
		this.goodsServiceTyp = goodsServiceTyp;
	}

	/**
	 * @return the goodsServiceValue
	 */
	public BigDecimal getGoodsServiceValue() {
		return goodsServiceValue;
	}

	/**
	 * @param goodsServiceValue the goodsServiceValue to set
	 */
	public void setGoodsServiceValue(BigDecimal goodsServiceValue) {
		this.goodsServiceValue = goodsServiceValue;
	}

	/**
	 * @return the goodsDisplaySeq
	 */
	public java.lang.Integer getGoodsDisplaySeq() {
		return goodsDisplaySeq;
	}

	/**
	 * @param goodsDisplaySeq the goodsDisplaySeq to set
	 */
	public void setGoodsDisplaySeq(java.lang.Integer goodsDisplaySeq) {
		this.goodsDisplaySeq = goodsDisplaySeq;
	}

	/**
	 * @return the goodsShowMakeFlg
	 */
	public String getGoodsShowMakeFlg() {
		return goodsShowMakeFlg;
	}

	/**
	 * @param goodsShowMakeFlg the goodsShowMakeFlg to set
	 */
	public void setGoodsShowMakeFlg(String goodsShowMakeFlg) {
		this.goodsShowMakeFlg = goodsShowMakeFlg;
	}

	/**
	 * @return the goodsShowDemandFlg
	 */
	public String getGoodsShowDemandFlg() {
		return goodsShowDemandFlg;
	}

	/**
	 * @param goodsShowDemandFlg the goodsShowDemandFlg to set
	 */
	public void setGoodsShowDemandFlg(String goodsShowDemandFlg) {
		this.goodsShowDemandFlg = goodsShowDemandFlg;
	}

	/**
	 * @return the goodsMustMakeFlg
	 */
	public String getGoodsMustMakeFlg() {
		return goodsMustMakeFlg;
	}

	/**
	 * @param goodsMustMakeFlg the goodsMustMakeFlg to set
	 */
	public void setGoodsMustMakeFlg(String goodsMustMakeFlg) {
		this.goodsMustMakeFlg = goodsMustMakeFlg;
	}

	/**
	 * @return the goodsWeighedFlg
	 */
	public String getGoodsWeighedFlg() {
		return goodsWeighedFlg;
	}

	/**
	 * @param goodsWeighedFlg the goodsWeighedFlg to set
	 */
	public void setGoodsWeighedFlg(String goodsWeighedFlg) {
		this.goodsWeighedFlg = goodsWeighedFlg;
	}

	/**
	 * @return the goodsMinimumsFlg
	 */
	public String getGoodsMinimumsFlg() {
		return goodsMinimumsFlg;
	}

	/**
	 * @param goodsMinimumsFlg the goodsMinimumsFlg to set
	 */
	public void setGoodsMinimumsFlg(String goodsMinimumsFlg) {
		this.goodsMinimumsFlg = goodsMinimumsFlg;
	}

	/**
	 * @return the goodsIngredientMemo
	 */
	public String getGoodsIngredientMemo() {
		return goodsIngredientMemo;
	}

	/**
	 * @param goodsIngredientMemo the goodsIngredientMemo to set
	 */
	public void setGoodsIngredientMemo(String goodsIngredientMemo) {
		this.goodsIngredientMemo = goodsIngredientMemo;
	}

	/**
	 * @return the goodsTasteMemo
	 */
	public String getGoodsTasteMemo() {
		return goodsTasteMemo;
	}

	/**
	 * @param goodsTasteMemo the goodsTasteMemo to set
	 */
	public void setGoodsTasteMemo(String goodsTasteMemo) {
		this.goodsTasteMemo = goodsTasteMemo;
	}

	/**
	 * @return the goodsMakeMemo
	 */
	public String getGoodsMakeMemo() {
		return goodsMakeMemo;
	}

	/**
	 * @param goodsMakeMemo the goodsMakeMemo to set
	 */
	public void setGoodsMakeMemo(String goodsMakeMemo) {
		this.goodsMakeMemo = goodsMakeMemo;
	}

	/**
	 * @return the goodsRecommendedFlg
	 */
	public String getGoodsRecommendedFlg() {
		return goodsRecommendedFlg;
	}

	/**
	 * @param goodsRecommendedFlg the goodsRecommendedFlg to set
	 */
	public void setGoodsRecommendedFlg(String goodsRecommendedFlg) {
		this.goodsRecommendedFlg = goodsRecommendedFlg;
	}

	/**
	 * @return the goodsSpecialFlag
	 */
	public String getGoodsSpecialFlag() {
		return goodsSpecialFlag;
	}

	/**
	 * @param goodsSpecialFlag the goodsSpecialFlag to set
	 */
	public void setGoodsSpecialFlag(String goodsSpecialFlag) {
		this.goodsSpecialFlag = goodsSpecialFlag;
	}

	/**
	 * @return the goodsMenuimageId
	 */
	public java.lang.Integer getGoodsMenuimageId() {
		return goodsMenuimageId;
	}

	/**
	 * @param goodsMenuimageId the goodsMenuimageId to set
	 */
	public void setGoodsMenuimageId(java.lang.Integer goodsMenuimageId) {
		this.goodsMenuimageId = goodsMenuimageId;
	}

	/**
	 * @return the goodsMenuimageUrl
	 */
	public String getGoodsMenuimageUrl() {
		return goodsMenuimageUrl;
	}

	/**
	 * @param goodsMenuimageUrl the goodsMenuimageUrl to set
	 */
	public void setGoodsMenuimageUrl(String goodsMenuimageUrl) {
		this.goodsMenuimageUrl = goodsMenuimageUrl;
	}

	/**
	 * @return the goodsPrices
	 */
	public List<PosGetCookbookPosMenuPriceForIPadResponseFormDto> getGoodsPrices() {
		return goodsPrices;
	}

	/**
	 * @param goodsPrices the goodsPrices to set
	 */
	public void setGoodsPrices(List<PosGetCookbookPosMenuPriceForIPadResponseFormDto> goodsPrices) {
		this.goodsPrices = goodsPrices;
	}

	
}

