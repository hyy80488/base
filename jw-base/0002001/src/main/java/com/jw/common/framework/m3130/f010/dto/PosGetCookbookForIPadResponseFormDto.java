package com.jw.common.framework.m3130.f010.dto;


/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	PosGetCookbookPosMenuForIPadResponseFormDto获取菜谱返回对象
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-21]
 * @package com.jw.hms.pos.m3310.f010.dto.posCookbook
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-21|gaofei|新增|PosGetCookbookResponseFormDto新增
 */
@DrptDto(dtonm = "PosGetCookbookPosMenuForIPadResponseFormDto",dtodrpt="PosGetCookbookPosMenuForIPadResponseFormDto获取菜品分类返回对象forIPad")
public class PosGetCookbookForIPadResponseFormDto implements java.io.Serializable{
	

	
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2354409316866462241L;

	@DrptField(fieldnm="displayType",fielddrpt="菜品显示布局")
	private String displayType;
	
	@DrptField(fieldnm="goodsTypeId",fielddrpt="菜品分类id")
	private java.lang.Integer goodsTypeId;
	
	@DrptField(fieldnm="goodsTypeCd",fielddrpt="菜品分类代码")
	private String goodsTypeCd;
	
	@DrptField(fieldnm="goodsTypeName",fielddrpt="菜品分类名称")
	private String goodsTypeName;
	
	@DrptField(fieldnm="goodsTypeList",fielddrpt="菜品分类下菜品分类list")
	private List<PosGetCookbookForIPadResponseFormDto> goodsTypeList;
	
	@DrptField(fieldnm="goodsList",fielddrpt="菜品分类下菜品list")
	private List<PosGetCookbookPosMenuForIPadResponseFormDto> goodsList;

	@DrptField(fieldnm="goodTypeParentId",fielddrpt="菜品分类父分类id")
	private java.lang.Integer goodsTypeParentId;

	/**
	 * @return the displayType
	 */
	public String getDisplayType() {
		return displayType;
	}

	/**
	 * @param displayType the displayType to set
	 */
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	/**
	 * @return the goodsTypeId
	 */
	public java.lang.Integer getGoodsTypeId() {
		return goodsTypeId;
	}

	/**
	 * @param goodsTypeId the goodsTypeId to set
	 */
	public void setGoodsTypeId(java.lang.Integer goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	/**
	 * @return the goodsTypeCd
	 */
	public String getGoodsTypeCd() {
		return goodsTypeCd;
	}

	/**
	 * @param goodsTypeCd the goodsTypeCd to set
	 */
	public void setGoodsTypeCd(String goodsTypeCd) {
		this.goodsTypeCd = goodsTypeCd;
	}

	/**
	 * @return the goodsTypeName
	 */
	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	/**
	 * @param goodsTypeName the goodsTypeName to set
	 */
	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	/**
	 * @return the goodsTypeList
	 */
	public List<PosGetCookbookForIPadResponseFormDto> getGoodsTypeList() {
		return goodsTypeList;
	}

	/**
	 * @param goodsTypeList the goodsTypeList to set
	 */
	public void setGoodsTypeList(List<PosGetCookbookForIPadResponseFormDto> goodsTypeList) {
		this.goodsTypeList = goodsTypeList;
	}

	/**
	 * @return the goodsList
	 */
	public List<PosGetCookbookPosMenuForIPadResponseFormDto> getGoodsList() {
		return goodsList;
	}

	/**
	 * @param goodsList the goodsList to set
	 */
	public void setGoodsList(List<PosGetCookbookPosMenuForIPadResponseFormDto> goodsList) {
		this.goodsList = goodsList;
	}

	/**
	 * @return the goodsTypeParentId
	 */
	public java.lang.Integer getGoodsTypeParentId() {
		return goodsTypeParentId;
	}

	/**
	 * @param goodsTypeParentId the goodsTypeParentId to set
	 */
	public void setGoodsTypeParentId(java.lang.Integer goodsTypeParentId) {
		this.goodsTypeParentId = goodsTypeParentId;
	}

}

