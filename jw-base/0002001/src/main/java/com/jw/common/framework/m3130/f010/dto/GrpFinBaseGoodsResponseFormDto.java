
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.Set;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;



/**
 * ## 类说明：
 * 	商品定义FORM信息数据传输对象
 * @author    [sunqihua]   
 * @version   [V1.0, 2017-10-17]
 * @package com.jw.hms.pms.m3280.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-10-17|sunqihua|新增|GrpFinBaseGoodsResponseFormDto新增
 */
@DrptDto(dtonm = "商品定义FORM信息数据传输对象",dtodrpt="商品定义FORM信息数据传输对象")
public class GrpFinBaseGoodsResponseFormDto extends ResponseBaseDto implements java.io.Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5656192694372440431L;
	@DrptField(fieldnm="商品定义返回值",fielddrpt="商品定义返回值")
	private GrpFinBaseGoodsDto resultData;
	@DrptField(fieldnm="acctNos", fielddrpt="账户集合")
	private Set<String> acctNos;
	public Set<String> getAcctNos() {
		return acctNos;
	}
	public void setAcctNos(Set<String> acctNos) {
		this.acctNos = acctNos;
	}
	public GrpFinBaseGoodsDto getResultData() {
		return resultData;
	}
	public void setResultData(GrpFinBaseGoodsDto resultData) {
		this.resultData = resultData;
	}
	
}
