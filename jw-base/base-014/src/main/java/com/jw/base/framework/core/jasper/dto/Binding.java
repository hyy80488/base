package com.jw.base.framework.core.jasper.dto;

import com.jw.base.framework.core.jasper.type.CalculationEnum;

public class Binding {

	private String key;

	private String name;

	// 公式类别ID
	private CalculationEnum calculation;

	// 表达式
	private String expression;

	// 数据类型
	private Integer datatyp;

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public CalculationEnum getCalculation() {
		return calculation;
	}

	public void setCalculation(CalculationEnum calculation) {
		this.calculation = calculation;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public Integer getDatatyp() {
		return datatyp;
	}

	public void setDatatyp(Integer datatyp) {
		this.datatyp = datatyp;
	}

}
