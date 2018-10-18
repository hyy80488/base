
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;


/**
 * ## 类说明：
 * 	单位商品定义FORM信息数据传输对象
 * @author    [sunqihua]   
 * @version   [V1.0, 2017-10-17]
 * @package com.jw.hms.pms.m3280.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-10-17|sunqihua|新增|GrpFinUnitGoodsRequestFormDto新增
 */
@DrptDto(dtonm = "单位商品定义FORM信息数据传输对象",dtodrpt="单位商品定义FORM信息数据传输对象")
public class GrpFinUnitGoodsTrnRequestFormDto extends RequestBaseDto implements  java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -8671635214434713267L;
	@DrptField(fieldnm="单位商品定义新值",fielddrpt="单位商品定义新值")
	private GoodsParentTrnDto submitData;
	@DrptField(fieldnm="单位商品定义原值",fielddrpt="单位商品定义原值")
	private GoodsParentTrnDto originData;
	public GoodsParentTrnDto getSubmitData() {
		return submitData;
	}
	public void setSubmitData(GoodsParentTrnDto submitData) {
		this.submitData = submitData;
	}
	public GoodsParentTrnDto getOriginData() {
		return originData;
	}
	public void setOriginData(GoodsParentTrnDto originData) {
		this.originData = originData;
	}
	

	
	
}
