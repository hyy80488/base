
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import java.math.BigDecimal;

/** 
 * ## 类说明：
 * 	菜品总表DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-09-06]
 * @package com.jw.hms.pos.m3310.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-09-06|gaofei|新增|PosMenuResultDto新增
 */
public class PosMenuDtoT implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 3671503184477722690L;
	/** ID  **/
	private Integer id;
	/** 菜品标识  **/
	private Integer menuId;
	/** 集团标识  **/
	private String chainUid;
	/** 酒店(单位)标识  **/
	private String unitUid;
	/** 菜品类别标识  **/
	private Integer menuTypId;
	/** 菜品类别代码  **/
	private String menuTypCd;
	/** 统计类别标识  **/
	private Integer statsTypId;
	/** 统计类别代码  **/
	private String statsTypCd;
	/** 出品部门标识  **/
	private Integer produceDeptId;
	/** 出品部门代码  **/
	private String produceDeptCd;
	/** 菜品代码  **/
	private String menuCd;
	/** 菜品名称  **/
	private String menuNm;
	/** 菜品条码  **/
	private String menuBar;
	/** 菜品别名  **/
	private String menuAlias;
	/** 菜品标识位  **/
	private String menuFlg;
	/** 系统标识  **/
	private String sysFlg;
	/** 菜品计量单位标识  **/
	private Integer menuUnitsId;
	/** 估清控制  **/
	private String clearFlg;
	/** 估清计量单位标识  **/
	private Integer clearUnitsId;
	/** 编辑名称  **/
	private String editNameFlg;
	/** 编辑价格  **/
	private String editPriceFlg;
	/** 地哩系统显示  **/
	private String showPassedFlg;
	/** 折扣标识  **/
	private String discountFlg;
	/** 折扣方式  **/
	private String discountTyp;
	/** 折扣值  **/
	private BigDecimal discountValue;
	/** 服务费标识  **/
	private String serviceFlg;
	/** 服务费方式  **/
	private String serviceTyp;
	/** 服务费值  **/
	private BigDecimal serviceValue;
	/** 提佣标识  **/
	private String commissionFlg;
	/** 提佣方式  **/
	private String commissionTyp;
	/** 提佣值  **/
	private BigDecimal commissionValue;
	/** 上菜顺序  **/
	private Integer menuSeq;
	/** 显示顺序  **/
	private Integer displaySeq;
	/** 弹出需求  **/
	private String showMakeFlg;
	/** 弹出制法  **/
	private String showDemandFlg;
	/** 允许修改价格  **/
	private String pricingFlg;
	/** 必选制法  **/
	private String mustMakeFlg;
	/** 称重菜标识  **/
	private String weighedFlg;
	/** 参与最低消费  **/
	private String minimumsFlg;
	/** 菜品图片  **/
	private String menuImage;
	/** 有效标识  **/
	private String validFlg;
	/** PAD点餐控制  **/
	private String padDisplayFlg;
	/** 催菜时限(分钟)  **/
	private Integer ungeMinute;
	/** 催菜标识  **/
	private String ungeFlg;
	/** 配料备注  **/
	private String ingredientMemo;
	/** 口味备注  **/
	private String tasteMemo;
	/** 做法备注  **/
	private String makeMemo;
	/** 版本号  **/
	private Integer version;
	/** 备注  **/
	private String memo;
	/** 厨房打印机1标识 **/
	private Integer cookPrint1Id;
	/** 厨房打印机2标识 **/
	private Integer cookPrint2Id;
	/** 传菜打印机标识 **/
	private Integer passPrintId;
	/** 催菜打印机标识 **/
	private Integer urgePrintId;
	/** 改菜打印机标识 **/
	private Integer alterPrintId;
	/** 预留打印机1标识 **/
	private Integer obligatePrint1Id;
	/** 预留打印机2标识 **/
	private Integer obligatePrint2Id;
	/** 预留打印机3标识 **/
	private Integer obligatePrint3Id;
	/** 预留打印机4标识 **/
	private Integer obligatePrint4Id;
	/** 预留打印机5标识 **/
	private Integer obligatePrint5Id;
	public Integer getId() {
		return this.id;
	}	
	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getMenuId() {
		return this.menuId;
	}	
	public void setMenuId(Integer value) {
		this.menuId = value;
	}
	public String getChainUid() {
		return this.chainUid;
	}	
	public void setChainUid(String value) {
		this.chainUid = value;
	}
	public String getUnitUid() {
		return this.unitUid;
	}	
	public void setUnitUid(String value) {
		this.unitUid = value;
	}
	public Integer getMenuTypId() {
		return this.menuTypId;
	}	
	public void setMenuTypId(Integer value) {
		this.menuTypId = value;
	}
	public String getMenuTypCd() {
		return this.menuTypCd;
	}	
	public void setMenuTypCd(String value) {
		this.menuTypCd = value;
	}
	public Integer getStatsTypId() {
		return this.statsTypId;
	}	
	public void setStatsTypId(Integer value) {
		this.statsTypId = value;
	}
	public String getStatsTypCd() {
		return this.statsTypCd;
	}	
	public void setStatsTypCd(String value) {
		this.statsTypCd = value;
	}
	public Integer getProduceDeptId() {
		return this.produceDeptId;
	}	
	public void setProduceDeptId(Integer value) {
		this.produceDeptId = value;
	}
	public String getProduceDeptCd() {
		return this.produceDeptCd;
	}	
	public void setProduceDeptCd(String value) {
		this.produceDeptCd = value;
	}
	public String getMenuCd() {
		return this.menuCd;
	}	
	public void setMenuCd(String value) {
		this.menuCd = value;
	}
	public String getMenuNm() {
		return this.menuNm;
	}	
	public void setMenuNm(String value) {
		this.menuNm = value;
	}
	public String getMenuBar() {
		return this.menuBar;
	}	
	public void setMenuBar(String value) {
		this.menuBar = value;
	}
	public String getMenuAlias() {
		return this.menuAlias;
	}	
	public void setMenuAlias(String value) {
		this.menuAlias = value;
	}
	public String getMenuFlg() {
		return this.menuFlg;
	}	
	public void setMenuFlg(String value) {
		this.menuFlg = value;
	}
	public String getSysFlg() {
		return this.sysFlg;
	}	
	public void setSysFlg(String value) {
		this.sysFlg = value;
	}
	public Integer getMenuUnitsId() {
		return this.menuUnitsId;
	}	
	public void setMenuUnitsId(Integer value) {
		this.menuUnitsId = value;
	}
	public String getClearFlg() {
		return this.clearFlg;
	}	
	public void setClearFlg(String value) {
		this.clearFlg = value;
	}
	public Integer getClearUnitsId() {
		return this.clearUnitsId;
	}	
	public void setClearUnitsId(Integer value) {
		this.clearUnitsId = value;
	}
	public String getEditNameFlg() {
		return this.editNameFlg;
	}	
	public void setEditNameFlg(String value) {
		this.editNameFlg = value;
	}
	public String getEditPriceFlg() {
		return this.editPriceFlg;
	}	
	public void setEditPriceFlg(String value) {
		this.editPriceFlg = value;
	}
	public String getShowPassedFlg() {
		return this.showPassedFlg;
	}	
	public void setShowPassedFlg(String value) {
		this.showPassedFlg = value;
	}
	public String getDiscountFlg() {
		return this.discountFlg;
	}	
	public void setDiscountFlg(String value) {
		this.discountFlg = value;
	}
	public String getDiscountTyp() {
		return this.discountTyp;
	}	
	public void setDiscountTyp(String value) {
		this.discountTyp = value;
	}
	public BigDecimal getDiscountValue() {
		return this.discountValue;
	}	
	public void setDiscountValue(BigDecimal value) {
		this.discountValue = value;
	}
	public String getServiceFlg() {
		return this.serviceFlg;
	}	
	public void setServiceFlg(String value) {
		this.serviceFlg = value;
	}
	public String getServiceTyp() {
		return this.serviceTyp;
	}	
	public void setServiceTyp(String value) {
		this.serviceTyp = value;
	}
	public BigDecimal getServiceValue() {
		return this.serviceValue;
	}	
	public void setServiceValue(BigDecimal value) {
		this.serviceValue = value;
	}
	public String getCommissionFlg() {
		return this.commissionFlg;
	}	
	public void setCommissionFlg(String value) {
		this.commissionFlg = value;
	}
	public String getCommissionTyp() {
		return this.commissionTyp;
	}	
	public void setCommissionTyp(String value) {
		this.commissionTyp = value;
	}
	public BigDecimal getCommissionValue() {
		return this.commissionValue;
	}	
	public void setCommissionValue(BigDecimal value) {
		this.commissionValue = value;
	}
	public Integer getMenuSeq() {
		return this.menuSeq;
	}	
	public void setMenuSeq(Integer value) {
		this.menuSeq = value;
	}
	public Integer getDisplaySeq() {
		return this.displaySeq;
	}	
	public void setDisplaySeq(Integer value) {
		this.displaySeq = value;
	}
	public String getShowMakeFlg() {
		return this.showMakeFlg;
	}	
	public void setShowMakeFlg(String value) {
		this.showMakeFlg = value;
	}
	public String getShowDemandFlg() {
		return this.showDemandFlg;
	}	
	public void setShowDemandFlg(String value) {
		this.showDemandFlg = value;
	}
	public String getPricingFlg() {
		return this.pricingFlg;
	}	
	public void setPricingFlg(String value) {
		this.pricingFlg = value;
	}
	public String getMustMakeFlg() {
		return this.mustMakeFlg;
	}	
	public void setMustMakeFlg(String value) {
		this.mustMakeFlg = value;
	}
	public String getWeighedFlg() {
		return this.weighedFlg;
	}	
	public void setWeighedFlg(String value) {
		this.weighedFlg = value;
	}
	public String getMinimumsFlg() {
		return this.minimumsFlg;
	}	
	public void setMinimumsFlg(String value) {
		this.minimumsFlg = value;
	}
	public String getMenuImage() {
		return this.menuImage;
	}	
	public void setMenuImage(String value) {
		this.menuImage = value;
	}
	public String getValidFlg() {
		return this.validFlg;
	}	
	public void setValidFlg(String value) {
		this.validFlg = value;
	}
	public String getPadDisplayFlg() {
		return this.padDisplayFlg;
	}	
	public void setPadDisplayFlg(String value) {
		this.padDisplayFlg = value;
	}
	public Integer getUngeMinute() {
		return this.ungeMinute;
	}	
	public void setUngeMinute(Integer value) {
		this.ungeMinute = value;
	}
	public String getUngeFlg() {
		return this.ungeFlg;
	}	
	public void setUngeFlg(String value) {
		this.ungeFlg = value;
	}
	public String getIngredientMemo() {
		return this.ingredientMemo;
	}	
	public void setIngredientMemo(String value) {
		this.ingredientMemo = value;
	}
	public String getTasteMemo() {
		return this.tasteMemo;
	}	
	public void setTasteMemo(String value) {
		this.tasteMemo = value;
	}
	public String getMakeMemo() {
		return this.makeMemo;
	}	
	public void setMakeMemo(String value) {
		this.makeMemo = value;
	}
	public Integer getVersion() {
		return this.version;
	}	
	public void setVersion(Integer value) {
		this.version = value;
	}
	public String getMemo() {
		return this.memo;
	}	
	public void setMemo(String value) {
		this.memo = value;
	}
	public Integer getCookPrint1Id() {
		return this.cookPrint1Id;
	}	
	public void setCookPrint1Id(Integer value) {
		this.cookPrint1Id = value;
	}
	public Integer getCookPrint2Id() {
		return this.cookPrint2Id;
	}	
	public void setCookPrint2Id(Integer value) {
		this.cookPrint2Id = value;
	}
	public Integer getPassPrintId() {
		return this.passPrintId;
	}	
	public void setPassPrintId(Integer value) {
		this.passPrintId = value;
	}
	public Integer getUrgePrintId() {
		return this.urgePrintId;
	}	
	public void setUrgePrintId(Integer value) {
		this.urgePrintId = value;
	}
	public Integer getAlterPrintId() {
		return this.alterPrintId;
	}	
	public void setAlterPrintId(Integer value) {
		this.alterPrintId = value;
	}
	public Integer getObligatePrint1Id() {
		return this.obligatePrint1Id;
	}	
	public void setObligatePrint1Id(Integer value) {
		this.obligatePrint1Id = value;
	}
	public Integer getObligatePrint2Id() {
		return this.obligatePrint2Id;
	}	
	public void setObligatePrint2Id(Integer value) {
		this.obligatePrint2Id = value;
	}
	public Integer getObligatePrint3Id() {
		return this.obligatePrint3Id;
	}	
	public void setObligatePrint3Id(Integer value) {
		this.obligatePrint3Id = value;
	}
	public Integer getObligatePrint4Id() {
		return this.obligatePrint4Id;
	}	
	public void setObligatePrint4Id(Integer value) {
		this.obligatePrint4Id = value;
	}
	public Integer getObligatePrint5Id() {
		return this.obligatePrint5Id;
	}	
	public void setObligatePrint5Id(Integer value) {
		this.obligatePrint5Id = value;
	}
	
	
}

