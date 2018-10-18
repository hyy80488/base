package com.jw.base.framework.core;

import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.StringUtil;

public class ConstantRoom {
	/*
	 * 房型属性
	 */
	public static enum ENUM_ROOMTYPE_FLG {
		// 物理房型
		PHYSICA("R"),
		// 销售房型
		SELL("S"),
		// 两者通用
		DUAL("A"), DEFULT("A");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_ROOMTYPE_FLG(String value) {
			this._value = value;
		}
	}
	
	/*
	 * 连通房标识
	 */
	public static enum ENUM_COMBO_FLG {
		/** 连通房 **/
		CONNECT("0"),
		/** 组合房（默认） **/
		COMBO("1"),
		/** 有效（默认） **/
		DEFAULT("1");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_COMBO_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 假房标志  NML：正常，PF：普通假房，PM：团队假房，HO：Hold假房，LS：账目遗漏假房，HK：保管假房
	 */
	public static enum ENUM_PSEUDO_FLG {
		/**  NML：正常 */
		NML("NML"),
		/** PF：普通假房 */
		PF("PF"),
		/** PM：团队假房*/
		PM("PM"),
		/** HO：Hold假房 */
		Hold("Hold"),
		/** LS：账目遗漏假房 */
		LS("LS"),
		/** AD：定金处理房 */
		AD("AD"),
		/** IF：接口抛账房 */
		IF("IF"),
		/** HK：保管假房 */
		HK("HK"),
		/** 所有 */
		All("-1");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_PSEUDO_FLG(String value) {
			this._value = value;
		}
	}
	
	/**
	 * 客房清扫状态： C（干净） D（脏房） I（待查） T（轻脏）
	 */
	public static enum ENUM_CLEAN_STUS {
		/** C（干净） */
		UP("C"),
		/** D（脏房） */
		DT("D"),
		/** I（待查） */
		IP("I"),
		/** T（轻脏） */
		TC("T");
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}

		private ENUM_CLEAN_STUS(String value) {
			this._value = value;
		}
		
		public static final Boolean hasEnum(String vlu){
			Boolean flg = false;
			for (ENUM_CLEAN_STUS PARA : ENUM_CLEAN_STUS.values()) {
				if (PARA.getValue().equals(vlu)) {
					return true;
				}
			}
			return flg;
		}

		/**
		 * ## 方法说明： 根据Value获取枚举常量
		 * 
		 * @param value
		 */
		public static final ENUM_CLEAN_STUS returnEnum(String value) throws Exception {
			if (StringUtil.isEmpty(value)) {
				return null;
			}
			// 遍历枚举数据 存在相同数据
			for (ENUM_CLEAN_STUS PARA : ENUM_CLEAN_STUS.values()) {
				if (PARA.getValue().equals(value)) {
					return PARA;
				}
			}
			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_100005, "枚举类型转换错误：ENUM_CLEAN_STUS",
					"枚举类型转换错误：ENUM_CLEAN_STUS", BsProcessErrorCode.ERROR_LEVEL_5);
		}
	}
}
