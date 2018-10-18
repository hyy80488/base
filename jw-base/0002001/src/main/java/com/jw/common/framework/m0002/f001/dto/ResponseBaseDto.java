/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0002.f001.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	通用响应DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|ResponseBaseDto.java新增
*/
@DrptDto(dtonm = "ResponseBaseDto", dtodrpt = "通用响应DTO")
public class ResponseBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = 2270163051485265473L;

	@DrptField(fieldnm = "responseCommonDto", fielddrpt = "共通字段信息")
	private ResponseCommonDto responseCommonDto;

	public ResponseBaseDto() {
		setResponseCommonDto(new ResponseCommonDto());
	}

	/**
	 * @return the responseCommonDto
	 */
	public ResponseCommonDto getResponseCommonDto() {
		return responseCommonDto;
	}

	/**
	 * @param responseCommonDto
	 *            the responseCommonDto to set
	 */
	public void setResponseCommonDto(ResponseCommonDto responseCommonDto) {
		this.responseCommonDto = responseCommonDto;
	}
	/** 操作dto */
	private Map<String, Map<String, Object>> handleDto = new HashMap<>();
	public Map<String, Map<String, Object>> getHandleDto() {
		return handleDto;
	}
	public void setHandleDto(Map<String, Map<String, Object>> handleDto) {
		this.handleDto = handleDto;
	}

	/** 创建人 */
	public void setCreatedBy(java.lang.String createdBy) {
		setParam("created", "userNm", createdBy);
	}
	/** 创建时间*/
	public void setCreatedDate(java.util.Date createdDate) {
		setParam("created", "userDate", createdDate);
	}
	/** 创建人ID*/
	public void setCreatedByUid(String createdByUid) {
		setParam("created", "userUid", createdByUid);
	}
	/** 创建人CODE */
	public void setCreatedByCd(String createdByCd) {
		setParam("created", "userCd", createdByCd);
	}
	/** 创建人操作酒店编码 */
	public void setCreatedUnitUid(String createdUnitUid) {
		setParam("created", "unitUid", createdUnitUid);
	}
	/** 创建人操作酒店Cd */
	public void setCreatedUnitCd(String createdUnitCd) {
		setParam("created", "unitCd", createdUnitCd);
	}
	/** 更新人 */
	public void setModifiedBy(java.lang.String modifiedBy) {
		setParam("modified", "userNm", modifiedBy);
	}
	/** 更新时间 */
	public void setModifiedDate(java.util.Date modifiedDate) {
		setParam("modified", "userDate", modifiedDate);
	}
	/** 更新人ID */
	public void setModifiedByUid(String modifiedByUid) {
		setParam("modified", "userUid", modifiedByUid);
	}
	/** 更新人CODE */
	public void setModifiedByCd(String modifiedByCd) {
		setParam("modified", "userCd", modifiedByCd);
	}
	/** 更新人操作酒店编码 */
	public void setModifiedUnitUid(String modifiedUnitUid) {
		setParam("modified", "unitUid", modifiedUnitUid);
	}
	/** 更新人操作酒店Cd */
	public void setModifiedUnitCd(String modifiedUnitCd) {
		setParam("modified", "unitCd", modifiedUnitCd);
	}
	/** 自定义 */
	public void setParam(String groupNm, String fieldNm, Object param){
		if(Objects.isNull(param)){
			return;
		}
		Map<String, Object> tmp = handleDto.get(groupNm);
		if(Objects.isNull(tmp)){
			tmp = new HashMap<>();
			handleDto.put(groupNm, tmp);
		}
		tmp.put(fieldNm, param);
	}
	

}
