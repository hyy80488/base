package com.jw.common.framework.m0002.f001.dto;

import java.io.Serializable;

public class SubDto implements Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 6407781786155888427L;
	private String typCRUD;

	public String getTypCRUD() {
		return typCRUD;
	}

	public void setTypCRUD(String typCRUD) {
		this.typCRUD = typCRUD;
	}
}
