/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.util.Date;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * 
 * ## 类说明：
 * 	查询房含列表数据传输对象
 * @author    [guoc]   
 * @version   [V1.0, 2017年4月11日]
 * @package com.jw.hms.pms.m3210.f010.dto.rsvRateQuery
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月11日|guoc|新增|GrpRsvRatePackageListInfoQueryDto.java新增
 */
@DrptDto(dtonm = "查询房含列表数据传输对象",dtodrpt="查询房含列表数据传输对象")
public class GrpRsvRatePackageListInfoQueryDto extends RequestBaseDto implements java.io.Serializable{
	
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -4204675945353590956L;
	
	@DrptField(fieldnm="chainUid",fielddrpt="集团uid")
	private String chainUid;
	@DrptField(fieldnm="unitUid",fielddrpt="单位uid")
	private String unitUid;
	@DrptField(fieldnm="rateId",fielddrpt="价格id")
	private Integer rateId;
	@DrptField(fieldnm="frDt",fielddrpt="开始日期")
	private Date frDt;
	@DrptField(fieldnm="toDt",fielddrpt="结束日期")
	private Date toDt;
	@DrptField(fieldnm="age1Cnt",fielddrpt="一段儿童数")
	private Integer age1Cnt;
	@DrptField(fieldnm="age2Cnt",fielddrpt="二段儿童数")
	private Integer age2Cnt;
	@DrptField(fieldnm="age3Cnt",fielddrpt="三段儿童数")
	private Integer age3Cnt;
	@DrptField(fieldnm="age4Cnt",fielddrpt="四段儿童数")
	private Integer age4Cnt;
	@DrptField(fieldnm="age5Cnt",fielddrpt="五段儿童数")
	private Integer age5Cnt;
	@DrptField(fieldnm="addonFlg",fielddrpt="自定义价格可用")
	private String addonFlg;
	@DrptField(fieldnm="pkggroupId",fielddrpt="房含分组")
	private Integer pkggroupId;  
	


	public Date getFrDt() {
		return frDt;
	}

	public void setFrDt(Date frDt) {
		this.frDt = frDt;
	}

	public Date getToDt() {
		return toDt;
	}

	public void setToDt(Date toDt) {
		this.toDt = toDt;
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

	public Integer getRateId() {
		return rateId;
	}

	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}

	public Integer getAge1Cnt() {
		return age1Cnt;
	}

	public void setAge1Cnt(Integer age1Cnt) {
		this.age1Cnt = age1Cnt;
	}

	public Integer getAge2Cnt() {
		return age2Cnt;
	}

	public void setAge2Cnt(Integer age2Cnt) {
		this.age2Cnt = age2Cnt;
	}

	public Integer getAge3Cnt() {
		return age3Cnt;
	}

	public void setAge3Cnt(Integer age3Cnt) {
		this.age3Cnt = age3Cnt;
	}

	public Integer getAge4Cnt() {
		return age4Cnt;
	}

	public void setAge4Cnt(Integer age4Cnt) {
		this.age4Cnt = age4Cnt;
	}

	public Integer getAge5Cnt() {
		return age5Cnt;
	}

	public void setAge5Cnt(Integer age5Cnt) {
		this.age5Cnt = age5Cnt;
	}

	public String getAddonFlg() {
		return addonFlg;
	}

	public void setAddonFlg(String addonFlg) {
		this.addonFlg = addonFlg;
	}

	public Integer getPkggroupId() {
		return pkggroupId;
	}

	public void setPkggroupId(Integer pkggroupId) {
		this.pkggroupId = pkggroupId;
	}
	
	


}
