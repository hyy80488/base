/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import com.jw.base.framework.core.annotation.CustomEditDisplayField;
import com.jw.base.framework.core.annotation.CustomInputTypeField;
import com.jw.base.framework.core.annotation.CustomListDisplayField;
import com.jw.base.framework.core.annotation.CustomRelateField;
import com.jw.base.framework.core.annotation.TrimProcessNeeded;

public class BsSysUserMult implements java.io.Serializable {
	@CustomEditDisplayField(isDisplay=false)
	private static final long serialVersionUID = 3868161778320867028L;
	@CustomEditDisplayField(isDisplay=false)
	private Integer id;
	@CustomEditDisplayField(isDisplay=false)
	private String bsSysUserId;
	@CustomEditDisplayField(isDisplay=false)
	private String languageType;
	@CustomListDisplayField(isDisplay=true)
	@CustomRelateField(relateFieldName="userName")
	@Length(max=100)
	@CustomInputTypeField(inputType="textarea")
	@TrimProcessNeeded(isTrimNeeded=true)
	private String userName;
	@CustomEditDisplayField(isDisplay=false)
	private Integer version;
	private BigDecimal bigDec;
	
	public BsSysUserMult() {
		
	}

	public BsSysUserMult(String languageType, String userName) {
		super();
		this.languageType = languageType;
		this.userName = userName;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBsSysUserId() {
		return bsSysUserId;
	}

	public void setBsSysUserId(String bsSysUserId) {
		this.bsSysUserId = bsSysUserId;
	}

	public String getLanguageType() {
		return languageType;
	}

	public void setLanguageType(String languageType) {
		this.languageType = languageType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public BigDecimal getBigDec() {
		return bigDec;
	}

	public void setBigDec(BigDecimal bigDec) {
		this.bigDec = bigDec;
	}

}
