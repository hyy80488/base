package com.jw.common.framework.m3130.f010.dto;


/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;


/**
 * ## 类说明：
 * 	PosGetCookbookForIPadRResponseFormDto获取菜谱返回对象
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-21]
 * @package com.jw.hms.pos.m3310.f010.dto.posCookbook
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-21|gaofei|新增|PosGetCookbookResponseFormDto新增
 */
@DrptDto(dtonm = "PosGetCookbookForIPadRResponseFormDto",dtodrpt="PosGetCookbookForIPadRResponseFormDto获取菜谱返回对象")
public class PosGetCookbookForIPadRResponseFormDto extends ResponseBaseDto implements java.io.Serializable{
	
	
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4402648541193142375L;
	@DrptField(fieldnm="goods",fielddrpt="菜品分类以及菜品分类下菜品列表")
	private List<PosGetCookbookForIPadResponseFormDto> goods;
	@DrptField(fieldnm="制法",fielddrpt="制法")
	private List<PosMakeForIPadInfo> makes;
	@DrptField(fieldnm="需求",fielddrpt="需求")
	private List<PosDemandForIPadInfo> demand;
	/**
	 * @return the goods
	 */
	public List<PosGetCookbookForIPadResponseFormDto> getGoods() {
		return goods;
	}
	/**
	 * @param goods the goods to set
	 */
	public void setGoods(List<PosGetCookbookForIPadResponseFormDto> goods) {
		this.goods = goods;
	}
	/**
	 * @return the makes
	 */
	public List<PosMakeForIPadInfo> getMakes() {
		return makes;
	}
	/**
	 * @param makes the makes to set
	 */
	public void setMakes(List<PosMakeForIPadInfo> makes) {
		this.makes = makes;
	}
	/**
	 * @return the demand
	 */
	public List<PosDemandForIPadInfo> getDemand() {
		return demand;
	}
	/**
	 * @param demand the demand to set
	 */
	public void setDemand(List<PosDemandForIPadInfo> demand) {
		this.demand = demand;
	}
	
	
	
}

