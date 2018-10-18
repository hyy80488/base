package com.jw.base.framework.core.tablecopy;

import org.hibernate.type.AbstractSingleColumnStandardBasicType;

public class TableCopyDto {
	/** 
	* 表列名
	*/ 
	private String cellNm;
	/** 
	* 表列名原值
	*/ 
	private String cellNmOri;
	/** 
	* 数据类型
	*/ 
	private AbstractSingleColumnStandardBasicType<?> dbTyp;
	public String getCellNm() {
		return cellNm;
	}
	public void setCellNm(String cellNm) {
		this.cellNm = cellNm;
	}
	public String getCellNmOri() {
		return cellNmOri;
	}
	public void setCellNmOri(String cellNmOri) {
		this.cellNmOri = cellNmOri;
	}
	public AbstractSingleColumnStandardBasicType<?> getDbTyp() {
		return dbTyp;
	}
	public void setDbTyp(AbstractSingleColumnStandardBasicType<?> dbTyp) {
		this.dbTyp = dbTyp;
	}
	public TableCopyDto(String cellNm, AbstractSingleColumnStandardBasicType<?> dbTyp, String cellNmOri) {
		super();
		this.cellNm = cellNm;
		this.cellNmOri = cellNmOri;
		this.dbTyp = dbTyp;
	}
	public TableCopyDto(String cellNm, AbstractSingleColumnStandardBasicType<?> dbTyp) {
		super();
		this.cellNm = cellNm;
		this.cellNmOri = cellNm;
		this.dbTyp = dbTyp;
	}
	public TableCopyDto() {
		super();
	}
}
