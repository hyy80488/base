
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	PosSalesQUERY信息数据传输对象
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-21]
 * @package com.jw.hms.pos.m3310.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-21|gaofei|新增|PosSalesQueryDto新增
 */
@DrptDto(dtonm = "PosSalesCanUseQueryDto",dtodrpt="PosSalesQUERY信息数据传输对象")
public class PosSalesCanUseQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	 
	private static final long serialVersionUID = 1212400350172168604L;
	private String pageStart;
	private String pageLength;
	private String unitUid;
	
	/**
	 * pad点餐 0-停用 1-启用
	 */
	private String padFlg;
	
	
	/**
	 * @return the padFlg
	 */
	public String getPadFlg() {
		return padFlg;
	}

	/**
	 * @param padFlg the padFlg to set
	 */
	public void setPadFlg(String padFlg) {
		this.padFlg = padFlg;
	}

	public String getPageStart() {
		return pageStart;
	}

	public void setPageStart(String pageStart) {
		this.pageStart = pageStart;
	}

	public String getPageLength() {
		return pageLength;
	}

	public void setPageLength(String pageLength) {
		this.pageLength = pageLength;
	}

	@DrptField(fieldnm="userID",fielddrpt="用户id")
	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getUnitUid() {
		return unitUid;
	}

	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

