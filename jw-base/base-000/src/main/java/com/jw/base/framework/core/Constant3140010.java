package com.jw.base.framework.core;

public class Constant3140010 {
	/**
	 * 操作员属性
	 */
	public static enum ENUM_NOTICE_TYP {
		/**101 交通路线*/
		ROUTING("101"),
		/**102 周边生活*/
		SURROUNDLIFE("102"),
		/**103 周边景点*/
		SURROUNDINGVIEW("103");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_NOTICE_TYP(String value) {
			this._value = value;
		}
	}
	/**
	 * 操作员属性
	 */
	public static enum ENUM_IFTYPE_ID {
		/**240001 证扫*/
		ZS(240001),
		/**240002 门锁*/
		MS(240002),
		/**240004 switch*/
		SW(240004),
		/**240005 会员服务*/
		LPS(240005),
		/**240006 户籍发送*/
		RDC(240006);
		private Integer _value;
		
		public Integer getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_IFTYPE_ID(Integer value) {
			this._value = value;
		}
	}
	/**
	 * 操作员属性
	 */
	public static enum ENUM_USRE_FLG {
		/**1：普通操作员*/
		NORMAL("1"),
		/**7：接口操作员*/
		PORT("7"),
		/**默认0：普通操作员*/
		DEFAULT("1");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_USRE_FLG(String value) {
			this._value = value;
		}
	}
	/**
	 * 
	 * 	开关表数据类型 1.前端使用  2.后端使用 3.均可
	 */
	public static enum ENUM_OPTION_TYP{
		/**1：前端使用 */
		WEB("1"),
		/**2：后端使用*/
		BACKPRO("2"),
		/**2：均可*/
		BOTH("3");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_OPTION_TYP(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 数据表类型 1:数据表;2:管控类型
	 */
	public static enum ENUM_TABLE_FLG{
		/** 1:数据表*/
		TABLE("1"),
		/**2:管控类型**/
		CONTROL_FIELD("2");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_TABLE_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 控制参数类型 N:默认不管控;Y:默认管控
	 */
	public static enum ENUM_CTRL_TYP{
		/** N:默认不管控*/
		NO_CONTROL("N"),
		/**Y:默认管控**/
		CONTROL("Y"),
		/**F:始终管控**/
		PLF("F");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_CTRL_TYP(String value) {
			this._value = value;
		}
	}
	
	
	/**
	 * 控制参数类型TBC：总体受管控的权限；TCL：总体管控下级的权限；DBC：分参数类型受管控的权限；DCL：分参数类型管控下级的权限  TPM：总体授权，DPM：分参数授权
	 */
	public static enum ENUM_OPTION_CTRL_TYP{
		/** TBC：总体受管控的权限*/
		TBC("TBC"),
		/**TCL：总体管控下级的权限**/
		TCL("TCL"),
		/**DBC：分参数类型受管控的权限**/
		DBC("DBC"),
		/**DCL：分参数类型管控下级的权限**/
		DCL("DCL"),
		/**TPM：总体授权**/
		TPM("TPM"),
		/**DPM：分参数授权**/
		DPM("DPM");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		private ENUM_OPTION_CTRL_TYP(String value) {
			this._value = value;
		}
	}
	
	/**
	 *	0:每个工作站参数独立;1:酒店参数统一 
	 **/
	public static enum ENUM_IF_PARAM_FLG{
		/** 0:每个工作站参数独立*/
		WS("0"),
		/**1:酒店参数统一 **/
		UNIT("1");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
		
		private ENUM_IF_PARAM_FLG(String value) {
			this._value = value;
		}
	}
	
	public static enum ENUM_USE_FLG{
		/**USE：当前使用 */
		USE("USE"),
		/**TMP：临时配置*/
		TMP("TMP");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		private ENUM_USE_FLG(String value) {
			this._value = value;
		}
	}
	public static enum ENUM_CTRL_FLG{
		/**U：单位自建开关*/
		U("U"),
		/**M：向下级被管控单位提供的开关*/
		M("M"),
		/**B：被上级单位管控的开关*/
		B("B");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		private ENUM_CTRL_FLG(String value) {
			this._value = value;
		}
	}
	
	public static enum ENUM_ROLE_FLG{
		/**U：单位自用角色*/
		U("U"),
		/**M：向被管控单体提供的角色*/
		M("M"),
		/**S：向下级管控单位提供的共享角色*/
		S("S");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		private ENUM_ROLE_FLG(String value) {
			this._value = value;
		}
		
	}
	/*
	 * 使用标识 
	 * IMP：仅供导入
		USE：仅自用
		INU：自用切供导入
	 */
	public static enum ENUM_PARAM_USE_FLG{
		/**IMP：仅供导入 */
		IMP("IMP"),
		/**USE：仅自用 */
		USE("USE"),
		/**INU：自用切供导入 */
		INU("INU");
		private String _value;
		
		public String getValue() {
			return _value;
		}
		
		private ENUM_PARAM_USE_FLG(String value) {
			this._value = value;
		}
		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}
	}
	
	/**
	 * 系统类别     1：集团系统；2：单店系统；
	 */
	public static enum ENUM_SYS_FLG {
		/** 仅集团 */
		GRP("1"),
		/** 仅单店 */
		UNIT("2"),
		/** 3：仅单体； */
		ONLY("3"),
		/** 4：集团+单店 */
		GRP_UNIT("4"),
		/** 5：单体+单店 */
		ONLY_UNIT("5"),
		/** 6：集团+单体 */
		GRP_ONLY("6"),
		/** 7：集团+单店+单体 */
		GRP_UNIT_ONLY("7");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_SYS_FLG(String value) {
			this._value = value;
		}
	}
	
	//父级管控字段
	public static final String PARENT_FIELD = "PARENT_FIELD";
	//管控下级字段
	public static final String NOW_FIELD = "NOW_FIELD";
}
