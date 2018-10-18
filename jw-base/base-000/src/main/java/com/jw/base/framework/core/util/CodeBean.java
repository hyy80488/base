/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	保存key和value有序值
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.base.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|CodeBean.java新增
 */
@DrptDto(dtonm = "CodeBean", dtodrpt = "CodeBean类")
public class CodeBean implements Serializable {

	private static final long serialVersionUID = -8599840123331163646L;

	/** key */
	@DrptField(fieldnm = "key", fielddrpt = "关键字")
	private String key = "";
	
	/** code */
	@DrptField(fieldnm = "code", fielddrpt = "编码")
	private String code = "";

	/** name */
	@DrptField(fieldnm = "name", fielddrpt = "描述")
	private String name = "";
	
	/** 默认值 */
	@DrptField(fieldnm = "defValue", fielddrpt = "默认值")
	private String defValue;
	
	@JSONField(serialize=false)
	private String param_str1;
	
	@JSONField(serialize=false)
	private String param_str2;
	
	@JSONField(serialize=false)
	private String param_str3;
	
	@JSONField(serialize=false)
	private String param_str4;
	
	@JSONField(serialize=false)
	private String param_str5;
	
	@JSONField(serialize=false)
	private String param_str6;
	
	@JSONField(serialize=false)
	private String param_str7;
	
	@JSONField(serialize=false)
	private String param_str8;
	
	@JSONField(serialize=false)
	private String param_str9;
	
	@JSONField(serialize=false)
	private String param_str10;
	
	@JSONField(serialize=false)
	private BigDecimal param_num1;
	
	@JSONField(serialize=false)
	private BigDecimal param_num2;
	
	@JSONField(serialize=false)
	private BigDecimal param_num3;
	
	@JSONField(serialize=false)
	private BigDecimal param_num4;
	
	@JSONField(serialize=false)
	private BigDecimal param_num5;
	
	@JSONField(serialize=false)
	private BigDecimal param_num6;
	
	@JSONField(serialize=false)
	private BigDecimal param_num7;
	
	@JSONField(serialize=false)
	private BigDecimal param_num8;
	
	@JSONField(serialize=false)
	private BigDecimal param_num9;
	
	@JSONField(serialize=false)
	private BigDecimal param_num10;
	
	@JSONField(serialize=false)
	private BigDecimal param_int1;
	
	@JSONField(serialize=false)
	private BigDecimal param_int2;
	
	@JSONField(serialize=false)
	private BigDecimal param_int3;
	
	@JSONField(serialize=false)
	private BigDecimal param_int4;
	
	@JSONField(serialize=false)
	private BigDecimal param_int5;
	
	@JSONField(serialize=false)
	private BigDecimal param_int6;
	
	@JSONField(serialize=false)
	private BigDecimal param_int7;
	
	@JSONField(serialize=false)
	private BigDecimal param_int8;
	
	@JSONField(serialize=false)
	private BigDecimal param_int9;
	
	@JSONField(serialize=false)
	private BigDecimal param_int10;
	
	/** paramFlg 参数属性 */
	private String paramFlg;
	
	private boolean status;
	
	public BigDecimal getParam_int1() {
		return param_int1;
	}

	public void setParam_int1(BigDecimal param_int1) {
		this.param_int1 = param_int1;
	}

	public BigDecimal getParam_int2() {
		return param_int2;
	}

	public void setParam_int2(BigDecimal param_int2) {
		this.param_int2 = param_int2;
	}

	public BigDecimal getParam_int3() {
		return param_int3;
	}

	public void setParam_int3(BigDecimal param_int3) {
		this.param_int3 = param_int3;
	}

	public BigDecimal getParam_int4() {
		return param_int4;
	}

	public void setParam_int4(BigDecimal param_int4) {
		this.param_int4 = param_int4;
	}

	public BigDecimal getParam_int5() {
		return param_int5;
	}

	public void setParam_int5(BigDecimal param_int5) {
		this.param_int5 = param_int5;
	}

	public BigDecimal getParam_int6() {
		return param_int6;
	}

	public void setParam_int6(BigDecimal param_int6) {
		this.param_int6 = param_int6;
	}

	public BigDecimal getParam_int7() {
		return param_int7;
	}

	public void setParam_int7(BigDecimal param_int7) {
		this.param_int7 = param_int7;
	}

	public BigDecimal getParam_int8() {
		return param_int8;
	}

	public void setParam_int8(BigDecimal param_int8) {
		this.param_int8 = param_int8;
	}

	public BigDecimal getParam_int9() {
		return param_int9;
	}

	public void setParam_int9(BigDecimal param_int9) {
		this.param_int9 = param_int9;
	}

	public BigDecimal getParam_int10() {
		return param_int10;
	}

	public void setParam_int10(BigDecimal param_int10) {
		this.param_int10 = param_int10;
	}

	public String getDefValue() {
		return defValue;
	}

	public void setDefValue(String defValue) {
		this.defValue = defValue;
	}

	
	public String getParamFlg() {
		return paramFlg;
	}

	public void setParamFlg(String paramFlg) {
		this.paramFlg = paramFlg;
	}

	
	public CodeBean() {
		super();
	}
	
	/** 有序锁表集合用  */
	public CodeBean(String className, boolean status) {
		super();
		this.name = className;
		this.status = status;
	}
	/**排序使用**/
	public CodeBean(String name, String desc) {
		super();
		this.code = name;
		this.name = desc;
	}
	
	public void setCode(String code) {
		this.code = (code == null) ? "" : code;
	}

	public String getCode() {
		return this.code;
	}

	public void setName(String name) {
		this.name = (name == null) ? "" : name;
	}

	public String getName() {
		return name;
	}
	
	public void setKey(String key) {
		this.key = (key == null) ? "" : key;
	}
	
	public String getKey() {
		return key;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getParam_str1() {
		return param_str1;
	}

	public void setParam_str1(String param_str1) {
		this.param_str1 = param_str1;
	}

	public String getParam_str2() {
		return param_str2;
	}

	public void setParam_str2(String param_str2) {
		this.param_str2 = param_str2;
	}

	public String getParam_str3() {
		return param_str3;
	}

	public void setParam_str3(String param_str3) {
		this.param_str3 = param_str3;
	}

	public String getParam_str4() {
		return param_str4;
	}

	public void setParam_str4(String param_str4) {
		this.param_str4 = param_str4;
	}

	public String getParam_str5() {
		return param_str5;
	}

	public void setParam_str5(String param_str5) {
		this.param_str5 = param_str5;
	}

	public String getParam_str6() {
		return param_str6;
	}

	public void setParam_str6(String param_str6) {
		this.param_str6 = param_str6;
	}

	public String getParam_str7() {
		return param_str7;
	}

	public void setParam_str7(String param_str7) {
		this.param_str7 = param_str7;
	}

	public String getParam_str8() {
		return param_str8;
	}

	public void setParam_str8(String param_str8) {
		this.param_str8 = param_str8;
	}

	public String getParam_str9() {
		return param_str9;
	}

	public void setParam_str9(String param_str9) {
		this.param_str9 = param_str9;
	}

	public String getParam_str10() {
		return param_str10;
	}

	public void setParam_str10(String param_str10) {
		this.param_str10 = param_str10;
	}

	public BigDecimal getParam_num1() {
		return param_num1;
	}

	public void setParam_num1(BigDecimal param_num1) {
		this.param_num1 = param_num1;
	}

	public BigDecimal getParam_num2() {
		return param_num2;
	}

	public void setParam_num2(BigDecimal param_num2) {
		this.param_num2 = param_num2;
	}

	public BigDecimal getParam_num3() {
		return param_num3;
	}

	public void setParam_num3(BigDecimal param_num3) {
		this.param_num3 = param_num3;
	}

	public BigDecimal getParam_num4() {
		return param_num4;
	}

	public void setParam_num4(BigDecimal param_num4) {
		this.param_num4 = param_num4;
	}

	public BigDecimal getParam_num5() {
		return param_num5;
	}

	public void setParam_num5(BigDecimal param_num5) {
		this.param_num5 = param_num5;
	}

	public BigDecimal getParam_num6() {
		return param_num6;
	}

	public void setParam_num6(BigDecimal param_num6) {
		this.param_num6 = param_num6;
	}

	public BigDecimal getParam_num7() {
		return param_num7;
	}

	public void setParam_num7(BigDecimal param_num7) {
		this.param_num7 = param_num7;
	}

	public BigDecimal getParam_num8() {
		return param_num8;
	}

	public void setParam_num8(BigDecimal param_num8) {
		this.param_num8 = param_num8;
	}

	public BigDecimal getParam_num9() {
		return param_num9;
	}

	public void setParam_num9(BigDecimal param_num9) {
		this.param_num9 = param_num9;
	}

	public BigDecimal getParam_num10() {
		return param_num10;
	}

	public void setParam_num10(BigDecimal param_num10) {
		this.param_num10 = param_num10;
	}
	
	/**
	 * ## 方法说明：
	 * 	取得表示文字
	 * @return 用空格分开的各个属性
	 */
//	public String getLabel() {
//		return key + " " + code + " " + name;
//	}

	/**
	 * ## 方法说明：
	 * 	取得表示用文字
	 * @return 用逗号分开的各个属性
	 */
//	public String getCodeCommaName() {
//		return key + "," + code + "," + name;
//	}
	
	
}
