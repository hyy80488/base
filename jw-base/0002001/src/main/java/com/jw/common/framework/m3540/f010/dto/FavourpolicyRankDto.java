/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3540.f010.dto;

import java.io.Serializable;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmTran.ENUM_LOGGED;
import com.jw.base.framework.core.ConstantParmTran.ENUM_TRAN_TYPE;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.annotation.TrimProcessNeeded;
/**
 * ## 类说明：
 * 	会员优惠策略会员等级
 * @author    [jianana]   
 * @version   [V1.0, 2017年12月6日]
 * @package com.jw.hms.crm.m3540.f010.dto.LpsSetFavourpolicy
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年12月6日|jianana|新增|FavourpolicyRankDto.java新增
 */
@DrptDto(dtonm = "FavourpolicyRankDto",dtodrpt="会员优惠策略会员等级")
public class FavourpolicyRankDto implements Serializable {
	
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = 7272076250420139107L;

	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "memberrankId", fielddrpt = "会员等级", paramtype=ConstantParm.ENUM_PARA_TYPE.COMMON_PARA, 
			paramsubtype=ConstantParm.PARA_MEMBERRANK, nullable = "false", length = "10", logged = ENUM_LOGGED.YES)
	private Integer memberrankId;
	
	@TrimProcessNeeded(isTrimNeeded = true)
	@DrptField(fieldnm = "mcardrankId", fielddrpt = "卡等级", paramtype=ConstantParm.ENUM_PARA_TYPE.COMMON_PARA, 
			paramsubtype=ConstantParm.PARA_MCARDRANK,trantype = ENUM_TRAN_TYPE.MCARDRANK_INFO, nullable = "false", length = "10", logged = ENUM_LOGGED.YES)
	private Integer mcardrankId;

	public Integer getMemberrankId() {
		return memberrankId;
	}

	public void setMemberrankId(Integer memberrankId) {
		this.memberrankId = memberrankId;
	}

	public Integer getMcardrankId() {
		return mcardrankId;
	}

	public void setMcardrankId(Integer mcardrankId) {
		this.mcardrankId = mcardrankId;
	}
}
