/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3130.f010.dto;

import java.util.ArrayList;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;
/**
 * ## 类说明：
 * 	交易代码共同参数
 * @author    [jianana]   
 * @version   [V1.0, 2017年4月21日]
 * @package com.jw.hms.cmm.m3130.f010.dto.grpFinBaseTrncode
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月21日|jianana|新增|FinBaseTrncodeParamDto.java新增
 */
@DrptDto(dtonm = "交易代码共同参数",dtodrpt="交易代码共同参数")
public class FinBaseTrncodeParamDto  extends RequestBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 8120572164566303709L;
	@DrptField(fieldnm="交易代码IDS",fielddrpt="交易代码IDS")
	private List<Integer> trncdIds = new ArrayList<>();
	@DrptField(fieldnm="交易代码类型集合",fielddrpt="交易代码类型集合")
	private List<String> trnTyps = new ArrayList<>();
	public List<Integer> getTrncdIds() {
		return trncdIds;
	}
	public void setTrncdIds(List<Integer> trncdIds) {
		this.trncdIds = trncdIds;
	}
	public List<String> getTrnTyps() {
		return trnTyps;
	}
	public void setTrnTyps(List<String> trnTyps) {
		this.trnTyps = trnTyps;
	}

}
