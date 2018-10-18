
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.common.framework.m0002.f001.dto.ResponseBaseDto;

/** 
 * ## 类说明：
 * 	菜谱DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f030.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|gaofei|新增|PosCookbookResultDto新增
 */
/*@DrptDto(dtonm = "PosCookbookDtoT",dtodrpt="菜谱类别配置返回传输对象")
public class PosCookbookDtoT extends ResponseBaseDto implements java.io.Serializable{*/
public class PosCookbookDtoT implements java.io.Serializable {
	/** ID  **/
	private Integer id;
	/** 菜谱标识  **/
	private Integer cookbookId;
	/** 集团标识  **/
	private String chainUid;
	/** 酒店(单位)标识 标识当前数据是集团或酒店录入的 **/
	private String unitUid;
	/** 菜谱名称  **/
	private String cookbookNm;
	/** 菜谱分类控制 0-使用菜谱类别,1-使用菜品类别 **/
	private String cookbookTypFlg;
	/** 菜谱分类级别 1-一级分类,2-二级分类 **/
	private String cookbookLevel;
	/** 排序号  **/
	private Integer cookbookSeq;
	/** 删除标记 0-未删除,1-已删除 **/
	private String delFlg;
	/** 最后更新时间  **/
	private java.util.Date lastUpdateTm;
	/** 版本号  **/
	private Integer version;
	/** 备注  **/
	private String memo;
	/** businessUid **/
	private String businessUid;
	/** businessStus **/
	private String businessStus;
	public Integer getId() {
		return this.id;
	}	
	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getCookbookId() {
		return this.cookbookId;
	}	
	public void setCookbookId(Integer value) {
		this.cookbookId = value;
	}
	public String getChainUid() {
		return this.chainUid;
	}	
	public void setChainUid(String value) {
		this.chainUid = value;
	}
	public String getUnitUid() {
		return this.unitUid;
	}	
	public void setUnitUid(String value) {
		this.unitUid = value;
	}
	public String getCookbookNm() {
		return this.cookbookNm;
	}	
	public void setCookbookNm(String value) {
		this.cookbookNm = value;
	}
	public String getCookbookTypFlg() {
		return this.cookbookTypFlg;
	}	
	public void setCookbookTypFlg(String value) {
		this.cookbookTypFlg = value;
	}
	public String getCookbookLevel() {
		return this.cookbookLevel;
	}	
	public void setCookbookLevel(String value) {
		this.cookbookLevel = value;
	}
	public Integer getCookbookSeq() {
		return this.cookbookSeq;
	}	
	public void setCookbookSeq(Integer value) {
		this.cookbookSeq = value;
	}
	public String getDelFlg() {
		return this.delFlg;
	}	
	public void setDelFlg(String value) {
		this.delFlg = value;
	}
	public java.util.Date getLastUpdateTm() {
		return this.lastUpdateTm;
	}	
	public void setLastUpdateTm(java.util.Date value) {
		this.lastUpdateTm = value;
	}
	public Integer getVersion() {
		return this.version;
	}	
	public void setVersion(Integer value) {
		this.version = value;
	}
	public String getMemo() {
		return this.memo;
	}	
	public void setMemo(String value) {
		this.memo = value;
	}
	public String getBusinessUid() {
		return this.businessUid;
	}	
	public void setBusinessUid(String value) {
		this.businessUid = value;
	}
	public String getBusinessStus() {
		return this.businessStus;
	}	
	public void setBusinessStus(String value) {
		this.businessStus = value;
	}
	
	
	
}


