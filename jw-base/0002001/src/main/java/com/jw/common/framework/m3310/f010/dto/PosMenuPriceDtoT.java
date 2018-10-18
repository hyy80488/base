
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import java.math.BigDecimal;

/** 
 * ## 类说明：
 * 	菜品价表DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f030.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|gaofei|新增|PosMenuPriceDtoT新增
 */
public class PosMenuPriceDtoT implements java.io.Serializable {
	/** ID  **/
	private Integer id;
	/** 菜品价格标识  **/
	private Integer menuPriceId;
	/** 集团标识  **/
	private String chainUid;
	/** 酒店(单位)标识 标识当前数据是集团或酒店录入的 **/
	private String unitUid;
	/** 菜品标识  **/
	private Integer menuId;
	/** 菜品代码  **/
	private String menuCd;
	/** 价格附加信息 价格附加信息,当菜品控制字段为场租时可以输入,例如:大会议室,小会议室,多功能厅等 **/
	private String menuPriceAttach;
	/** 菜品规格标识 只有场租的形式可以出现同一规格有不同价格同时存在 **/
	private Integer menuSpecId;
	/** 菜品规格代码  **/
	private String menuSpecCd;
	/** 菜品价格  **/
	private BigDecimal unitPrice;
	/** 会员价  **/
	private BigDecimal memberPrice;
	/** 成本价  **/
	private BigDecimal costPrice;
	/** 菜品价格条码 菜品价格条形码 **/
	private String menuPriceBar;
	/** 有效标识 0-无效,1-有效 **/
	private String validFlg;
	/** 退账标识 0-不退,1-退 当退菜或冲减(消菜)时菜品数量回归估清数量中 **/
	private String refundFlg;
	/** 物资编码 对应库存系统物资编码 **/
	private String stockCode;
	/** 定价排序  **/
	private Integer priceSeq;
	/** 版本号  **/
	private Integer version;
	/** 备注  **/
	private String memo;
	/** businessUid **/
	private String businessUid;
	/** businessStus **/
	private String businessStus;
	public Integer getId() {
		return this.id;
	}	
	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getMenuPriceId() {
		return this.menuPriceId;
	}	
	public void setMenuPriceId(Integer value) {
		this.menuPriceId = value;
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
	public Integer getMenuId() {
		return this.menuId;
	}	
	public void setMenuId(Integer value) {
		this.menuId = value;
	}
	public String getMenuCd() {
		return this.menuCd;
	}	
	public void setMenuCd(String value) {
		this.menuCd = value;
	}
	public String getMenuPriceAttach() {
		return this.menuPriceAttach;
	}	
	public void setMenuPriceAttach(String value) {
		this.menuPriceAttach = value;
	}
	public Integer getMenuSpecId() {
		return this.menuSpecId;
	}	
	public void setMenuSpecId(Integer value) {
		this.menuSpecId = value;
	}
	public String getMenuSpecCd() {
		return this.menuSpecCd;
	}	
	public void setMenuSpecCd(String value) {
		this.menuSpecCd = value;
	}
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}	
	public void setUnitPrice(BigDecimal value) {
		this.unitPrice = value;
	}
	public BigDecimal getMemberPrice() {
		return this.memberPrice;
	}	
	public void setMemberPrice(BigDecimal value) {
		this.memberPrice = value;
	}
	public BigDecimal getCostPrice() {
		return this.costPrice;
	}	
	public void setCostPrice(BigDecimal value) {
		this.costPrice = value;
	}
	public String getMenuPriceBar() {
		return this.menuPriceBar;
	}	
	public void setMenuPriceBar(String value) {
		this.menuPriceBar = value;
	}
	public String getValidFlg() {
		return this.validFlg;
	}	
	public void setValidFlg(String value) {
		this.validFlg = value;
	}
	public String getRefundFlg() {
		return this.refundFlg;
	}	
	public void setRefundFlg(String value) {
		this.refundFlg = value;
	}
	public String getStockCode() {
		return this.stockCode;
	}	
	public void setStockCode(String value) {
		this.stockCode = value;
	}
	public Integer getPriceSeq() {
		return this.priceSeq;
	}	
	public void setPriceSeq(Integer value) {
		this.priceSeq = value;
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
	public String getBusinessUid() {
		return this.businessUid;
	}	
	public void setBusinessUid(String value) {
		this.businessUid = value;
	}
	public String getBusinessStus() {
		return this.businessStus;
	}	
	public void setBusinessStus(String value) {
		this.businessStus = value;
	}
	
	
}

