
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

/** 
 * ## 类说明：
 * 	菜品类别制法表DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f030.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|gaofei|新增|PosMenuTypMakeResultDto新增
 */
public class PosMenuTypMakeDtoT implements java.io.Serializable {
	/** id **/
	private Integer id;
	/** chainUid **/
	private String chainUid;
	/** unitUid **/
	private String unitUid;
	/** menuTypId **/
	private Integer menuTypId;
	/** makeId **/
	private Integer makeId;
	/** version **/
	private Integer version;
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
	public Integer getMenuTypId() {
		return this.menuTypId;
	}	
	public void setMenuTypId(Integer value) {
		this.menuTypId = value;
	}
	public Integer getMakeId() {
		return this.makeId;
	}	
	public void setMakeId(Integer value) {
		this.makeId = value;
	}
	public Integer getVersion() {
		return this.version;
	}	
	public void setVersion(Integer value) {
		this.version = value;
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

