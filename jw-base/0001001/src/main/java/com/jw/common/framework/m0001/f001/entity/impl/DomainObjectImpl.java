/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0001.f001.entity.impl;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jw.common.framework.m0001.f001.entity.DomainObject;
/**
 * ## 类说明：
 * 	基础entity接口 （ID VERSION）
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月27日]
 * @package com.jw.common.framework.m0001.f001.entity.impl
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月27日|jianana|新增|DomainObjectImpl.java新增
 */
@MappedSuperclass
public class DomainObjectImpl implements DomainObject, java.io.Serializable{

	private static final long serialVersionUID = 4586523058918481963L;
	/** 主键 */
	private Integer id;
	/** 版本 */
	private Integer version;
	/** tracerUid */
	private String tracerUid;
	/** businessUid */
	private String businessUid;
	/** businessStus */
	private String businessStus;
	
	// 仅仅写出@Id，即是使用assigned生成略
	// @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	// @GeneratedValue(generator = "generator")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id", unique = true, nullable = false, length = 64)
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	@Version
	@Column(name = "version", length = 10)
	public Integer getVersion() {
		return version;
	}
	@Override
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@JsonIgnore
	@Column(name = "trace_uid", length = 100)
	public String getTracerUid() {
		return tracerUid;
	}
	public void setTracerUid(String tracerUid) {
		this.tracerUid = tracerUid;
	}

	@JsonIgnore
	@Column(name = "business_uid", length = 40)
	public String getBusinessUid() {
		return businessUid;
	}
	public void setBusinessUid(String businessUid) {
		this.businessUid = businessUid;
	}

	@Override
	@Column(name = "business_stus", length = 3)
	public String getBusinessStus() {
		return businessStus;
	}
	@Override
	public void setBusinessStus(String businessStus) {
		this.businessStus = businessStus;
	}
	
}
