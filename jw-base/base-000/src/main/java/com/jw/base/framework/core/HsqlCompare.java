package com.jw.base.framework.core;

/**
 * ## 类说明：
 * 	hsql 查询 比较操作符类
 * @author    [dzm]   
 * @version   [1.0, 2017/04/20]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017/04/20|dzm|新增|HsqlCompare.java新增
 */
public class HsqlCompare {
	
	/**
	 * 比较操作 
	 */
	public static enum ENUM_COMPARE {
		/** 大于 **/
		Larger(">"),
		/** 大于等于 **/
		LargerOrEqual(">="),
		/** 小于 **/
		Less("<"),
		/** 小于等于 **/
		LessOrEqual("<="),
		/** 不等于 **/
		NotEqual("!=");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		private ENUM_COMPARE(String value) {
			this._value = value;
		}
	}
	
	private HsqlCompare.ENUM_COMPARE compare;
	private Object value;
	public HsqlCompare() {
	}
	public HsqlCompare(ENUM_COMPARE compare, Object value) {
		super();
		this.compare = compare;
		this.value = value;
	}
	public HsqlCompare.ENUM_COMPARE getCompare() {
		return compare;
	}
	public void setCompare(HsqlCompare.ENUM_COMPARE compare) {
		this.compare = compare;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
