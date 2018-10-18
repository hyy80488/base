
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	接口参数
 * @author    [zteng]   
 * @version   [V1.0, 2018-06-07]
 * @package com.jw.hms.group.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018-06-07|zteng|新增|GrpUnitIfsvcQueryDto新增
 */
@DrptDto(dtonm = "接口参数",dtodrpt="接口参数")
public class GrpUnitIfsvcParamQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 4633348583869690146L;
	@DrptField(fieldnm="chainUid", fielddrpt="chainUid", nullable = "false", length = "40")
	private String chainUid;
	
	@DrptField(fieldnm="unitUid", fielddrpt="unitUid", nullable = "false", length = "40")
	private String unitUid;
	
	private List<Integer> wsIfsvcVer; 
	private List<Integer> unitIfsvcVer; 
	private List<String> unitUids;
	private List<String> wsNos;
	
	public List<String> getWsNos() {
		return wsNos;
	}
	public void setWsNos(List<String> wsNos) {
		this.wsNos = wsNos;
	}
	public String getChainUid() {
		return chainUid;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public List<Integer> getWsIfsvcVer() {
		return wsIfsvcVer;
	}
	public void setWsIfsvcVer(List<Integer> wsIfsvcVer) {
		this.wsIfsvcVer = wsIfsvcVer;
	}
	public List<Integer> getUnitIfsvcVer() {
		return unitIfsvcVer;
	}
	public void setUnitIfsvcVer(List<Integer> unitIfsvcVer) {
		this.unitIfsvcVer = unitIfsvcVer;
	}
	public List<String> getUnitUids() {
		return unitUids;
	}
	public void setUnitUids(List<String> unitUids) {
		this.unitUids = unitUids;
	}
	
}

