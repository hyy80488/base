
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.Date;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.api.Nightaudit;

/**
 * ## 类说明：
 * 	夜审日志表参数信息数据传输对象
 * @author    [jianana]   
 * @version   [V1.0, 2017-06-20]
 * @package com.jw.hms.pms.m3290.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-06-20|jianana|新增|HptLogNightauditQueryDto新增
 */
@DrptDto(dtonm = "夜审日志表参数信息数据传输对象", dtodrpt = "夜审日志表参数信息数据传输对象")
public class HptLogNightauditParamDto extends RequestBaseDto implements Nightaudit, java.io.Serializable {
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -8790709462294156550L;
	@DrptField(fieldnm = "isConstraint", fielddrpt = "当用户不一致时，是否强制往下执行    1是   0否", nullable = "true", length = "10")
	private String isConstraint;
	@DrptField(fieldnm = "isCheck", fielddrpt = "是否夜审检查  0否  1是", nullable = "true", length = "10")
	private String isCheck;
	@DrptField(fieldnm = "isFirst", fielddrpt = "是否首次请求  首次请求需要将检查的  0否  1是", nullable = "true", length = "10")
	private String isFirst;
	@DrptField(fieldnm = "stepId", fielddrpt = "夜审步骤ID", nullable = "true")
	private Integer stepId;
	@DrptField(fieldnm = "auditDt", fielddrpt = "审计日期", nullable = "true")
	private Date auditDt;

	public String getIsFirst() {
		return isFirst;
	}

	public void setIsFirst(String isFirst) {
		this.isFirst = isFirst;
	}

	public Integer getStepId() {
		return stepId;
	}

	public void setStepId(Integer stepId) {
		this.stepId = stepId;
	}

	public Date getAuditDt() {
		return auditDt;
	}

	public void setAuditDt(Date auditDt) {
		this.auditDt = auditDt;
	}

	public String getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}

	public String getIsConstraint() {
		return isConstraint;
	}

	public void setIsConstraint(String isConstraint) {
		this.isConstraint = isConstraint;
	}


}
