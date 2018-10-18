package com.jw.base.framework.core;

/**
 * ## 类说明：
 * 	hsql 查询 忽略大小写
 * @author    [jianana]   
 * @version   [V1.0, 2017年9月6日]
 * @package com.jw.base.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年9月6日|jianana|新增|HsqlUpper.java新增
 */
public class HsqlUpperOrLower {
	
	/**
	 * 大小写
	 */
	public static enum ENUM_UPORLW {
		/** 大写 **/
		UPPER("UPPER"),
		/** 小写 **/
		LOWER("LOWER");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		private ENUM_UPORLW(String value) {
			this._value = value;
		}
	}
	
	private HsqlUpperOrLower.ENUM_UPORLW uporlw;
	private Object value;
	public HsqlUpperOrLower() {
	}
	public HsqlUpperOrLower(ENUM_UPORLW uporlw, Object value) {
		super();
		this.uporlw = uporlw;
		this.value = value;
	}
	public HsqlUpperOrLower.ENUM_UPORLW getUporlw() {
		return uporlw;
	}
	public void setUporlw(HsqlUpperOrLower.ENUM_UPORLW uporlw) {
		this.uporlw = uporlw;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
