
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3260.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * 
 * ## 类说明：
 * 	应收账户和客户关联查询使用requestdto
 * @author    [liyunlong]   
 * @version   [V1.0, 2018年8月16日]
 * @package com.jw.common.framework.m3260.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月16日|liyunlong|新增|GrpArAccountAndGrpCrmCorpRequestDto.java新增
 */
@DrptDto(dtonm = "应收账户和客户关联查询使用信息数据传输对象",dtodrpt="应收账户和客户关联查询使用信息数据传输对象")
public class GrpArAccountAndGrpCrmCorpRequestDto extends RequestBaseDto implements java.io.Serializable{

	private static final long serialVersionUID = 5593374291979414515L;
	
	public String arNo;
	public String corpNo;
	public String mngUnitUid;
	
	
	/**
	 * @return the mngUnitUid
	 */
	public String getMngUnitUid() {
		return mngUnitUid;
	}
	/**
	 * @param mngUnitUid the mngUnitUid to set
	 */
	public void setMngUnitUid(String mngUnitUid) {
		this.mngUnitUid = mngUnitUid;
	}
	/**
	 * @return the arNo
	 */
	public String getArNo() {
		return arNo;
	}
	/**
	 * @param arNo the arNo to set
	 */
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	/**
	 * @return the corpNo
	 */
	public String getCorpNo() {
		return corpNo;
	}
	/**
	 * @param corpNo the corpNo to set
	 */
	public void setCorpNo(String corpNo) {
		this.corpNo = corpNo;
	}
}
