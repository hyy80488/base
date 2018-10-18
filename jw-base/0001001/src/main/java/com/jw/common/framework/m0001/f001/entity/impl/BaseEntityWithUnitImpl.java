/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0001.f001.entity.impl;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.jw.common.framework.m0001.f001.entity.BaseEntityWithUnit;
/**
 * 
 * ## 类说明：
 * 	基础entity（创建人、创建时间、创建人操作酒店）实现类
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月27日]
 * @package com.jw.common.framework.m0001.f001.entity.impl
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月27日|jianana|新增|BaseEntityWithUnitImpl.java新增
 */
@MappedSuperclass
public class BaseEntityWithUnitImpl extends DomainObjectImpl implements BaseEntityWithUnit, java.io.Serializable {

	private static final long serialVersionUID = 1915182806489551977L;
	/** 创建人 */
	private java.lang.String createdBy;
	/** 创建时间 */
	private java.util.Date createdDate;
	/** 创建人ID */
	private String createdByUid;
	/** 创建人CODE */
	private String createdByCd;
	/** 创建人操作酒店编码 */
	private String createdUnitUid;
	/** 创建人操作酒店Cd */
	private String createdUnitCd;
	
	/** 创建人 */
	@Override
	@Column(name = "created_by", length = 50)
	public java.lang.String getCreatedBy() {
		return createdBy;
	}
	/** 创建人 */
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}
	/** 创建时间 */
	@Override
	@Column(name = "created_date", length = 0)
	public java.util.Date getCreatedDate() {
		return createdDate;
	}
	/** 创建时间 */
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}
	/** 创建人ID */
	@Override
	@Column(name = "created_by_uid", length = 40)
	public String getCreatedByUid() {
		return createdByUid;
	}
	/** 创建人ID */
	@Override
	public void setCreatedByUid(String createdByUid) {
		this.createdByUid = createdByUid;
	}
	/** 创建人CODE */
	@Override
	@Column(name = "created_by_cd", length = 50)
	public String getCreatedByCd() {
		return createdByCd;
	}
	/** 创建人CODE */
	@Override
	public void setCreatedByCd(String createdByCd) {
		this.createdByCd = createdByCd;
	}
	/** 创建人操作酒店编码 */
	@Override
	@Column(name = "created_unit_uid", length = 40)
	public String getCreatedUnitUid() {
		return createdUnitUid;
	}
	/** 创建人操作酒店编码 */
	@Override
	public void setCreatedUnitUid(String createdUnitUid) {
		this.createdUnitUid = createdUnitUid;
	}
	/** 创建人操作酒店Cd */
	@Override
	@Column(name = "created_unit_cd", length = 50)
	public String getCreatedUnitCd() {
		return createdUnitCd;
	}
	/** 创建人操作酒店Cd */
	@Override
	public void setCreatedUnitCd(String createdUnitCd) {
		this.createdUnitCd = createdUnitCd;
	}
	

}
