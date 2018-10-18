/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0001.f001.entity.impl;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.jw.common.framework.m0001.f001.entity.BusinessBaseEntityWithUnit;
/**
 * 
 * ## 类说明：
 * 	基础entity（创建人、创建时间、创建人操作酒店、更新人、更新时间、更新人操作酒店）实现类
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月27日]
 * @package com.jw.common.framework.m0001.f001.entity.impl
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月27日|jianana|新增|BusinessBaseEntityWithUnitImpl.java新增
 */
@MappedSuperclass
public class BusinessBaseEntityWithUnitImpl extends DomainObjectImpl implements BusinessBaseEntityWithUnit, java.io.Serializable{
	
	private static final long serialVersionUID = 5386792265414810446L;
	/** 创建人 */
	private java.lang.String createdBy;
	/** 创建时间*/
	private java.util.Date createdDate;
	/** 创建人ID*/
	private String createdByUid;
	/** 创建人CODE */
	private String createdByCd;
	/** 创建人操作酒店编码 */
	private String createdUnitUid;
	/** 创建人操作酒店Cd */
	private String createdUnitCd;
	/** 更新人 */
	private java.lang.String modifiedBy;
	/** 更新时间 */
	private java.util.Date modifiedDate;
	/** 更新人ID */
	private String modifiedByUid;
	/** 更新人CODE */
	private String modifiedByCd;
	/** 更新人操作酒店编码 */
	private String modifiedUnitUid;
	/** 更新人操作酒店Cd */
	private String modifiedUnitCd;
	
	@Override
	@Column(name = "created_by", length = 50)
	public java.lang.String getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	@Column(name = "created_date", length = 0)
	public java.util.Date getCreatedDate() {
		return createdDate;
	}

	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	@Column(name = "created_by_uid", length = 40)
	public String getCreatedByUid() {
		return createdByUid;
	}

	@Override
	public void setCreatedByUid(String createdByUid) {
		this.createdByUid = createdByUid;
	}

	@Override
	@Column(name = "created_by_cd", length = 50)
	public String getCreatedByCd() {
		return createdByCd;
	}

	@Override
	public void setCreatedByCd(String createdByCd) {
		this.createdByCd = createdByCd;
	}

	@Override
	@Column(name = "created_unit_uid", length = 40)
	public String getCreatedUnitUid() {
		return createdUnitUid;
	}

	@Override
	public void setCreatedUnitUid(String createdUnitUid) {
		this.createdUnitUid = createdUnitUid;
	}

	@Override
	@Column(name = "created_unit_cd", length = 50)
	public String getCreatedUnitCd() {
		return createdUnitCd;
	}

	@Override
	public void setCreatedUnitCd(String createdUnitCd) {
		this.createdUnitCd = createdUnitCd;
	}
	
	@Override
	@Column(name = "modified_by_uid", length = 40)
	public String getModifiedByUid() {
		return modifiedByUid;
	}

	@Override
	public void setModifiedByUid(String modifiedByUid) {
		this.modifiedByUid = modifiedByUid;
	}

	@Override
	@Column(name = "modified_by", length = 50)
	public java.lang.String getModifiedBy() {
		return modifiedBy;
	}

	@Override
	public void setModifiedBy(java.lang.String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	@Column(name = "modified_date", length = 0)
	public java.util.Date getModifiedDate() {
		return modifiedDate;
	}

	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	@Override
	@Column(name = "modified_by_cd", length = 50)
	public String getModifiedByCd() {
		return modifiedByCd;
	}
	
	@Override
	public void setModifiedByCd(String modifiedByCd) {
		this.modifiedByCd = modifiedByCd;
	}
	
	@Override
	@Column(name = "modified_unit_uid", length = 40)
	public String getModifiedUnitUid() {
		return modifiedUnitUid;
	}
	
	@Override
	public void setModifiedUnitUid(String modifiedUnitUid) {
		this.modifiedUnitUid = modifiedUnitUid;
	}

	@Override
	@Column(name = "modified_unit_cd", length = 50)
	public String getModifiedUnitCd() {
		return modifiedUnitCd;
	}

	@Override
	public void setModifiedUnitCd(String modifiedUnitCd) {
		this.modifiedUnitCd = modifiedUnitCd;
	}
	
}
