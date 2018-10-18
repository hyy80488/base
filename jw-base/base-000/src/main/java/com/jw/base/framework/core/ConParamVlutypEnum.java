package com.jw.base.framework.core;

import java.util.Map;
import java.util.TreeMap;

/**
 * 条件参数  值类型
 */
public enum ConParamVlutypEnum implements PersistEnum<ConParamVlutypEnum>{
    // 利用构造函数传参
	//20：User ID
	USER_UID("20"),
	//21：用户所属单位ID
	UNIT_UID("21"),
	//22：集团 ID
	CHAIN_UID("22"),
	
	//23：子集团ID
//		SUBGROUP_ID("23"),
	//24：财务起始月
//		FADSTARTMONTH("24"),
	//25：财务起始日
//		FADSTARTDAY("25"),
	//26：财务日期
//		FADDATE("26"),
	
	//27：业务日期
	MDDATE("27"),
	//28：业务日期减一
	MDDATE_MINUS_1("28"),
	//29：审核日期
	AUDITDATE("29"),
	//30：审核日期减一
	AUDITDATE_MINUS_1("30"),
	//31：夜审日期
	NIGHTDATE("31"),
	//32：夜审日期减一
	NIGHTDATE_MINUS_1("32"),
	//33：语种
	LANGUAGEID("33"),
	//34：工作站
	WSNO("34"),
	//35：酒店币种
	UNITCURRENCY("35"),
	//36：酒店国家
	UNITCOUNTRY("36"),
	//37：餐饮部门
	DEPT_UID("37");

    private static final Map<String, ConParamVlutypEnum> map = new TreeMap<String, ConParamVlutypEnum>();
    
    static {
        map.put(USER_UID.getCode(), USER_UID);
        map.put(UNIT_UID.getCode(), UNIT_UID);
        map.put(CHAIN_UID.getCode(), CHAIN_UID);
//        map.put(SUBGROUP_ID.getCode(), SUBGROUP_ID);
//        map.put(FADSTARTMONTH.getCode(), FADSTARTMONTH);
//        map.put(FADSTARTDAY.getCode(), FADSTARTDAY);
//        map.put(FADDATE.getCode(), FADDATE);
        map.put(MDDATE.getCode(), MDDATE);
        map.put(MDDATE_MINUS_1.getCode(), MDDATE_MINUS_1);
        map.put(AUDITDATE.getCode(), AUDITDATE);
        map.put(AUDITDATE_MINUS_1.getCode(), AUDITDATE_MINUS_1);
        map.put(NIGHTDATE.getCode(), NIGHTDATE);
        map.put(NIGHTDATE_MINUS_1.getCode(), NIGHTDATE_MINUS_1);
        map.put(LANGUAGEID.getCode(), LANGUAGEID);
        map.put(WSNO.getCode(), WSNO);
        map.put(UNITCURRENCY.getCode(), UNITCURRENCY);
        map.put(UNITCOUNTRY.getCode(), UNITCOUNTRY);
        map.put(DEPT_UID.getCode(), DEPT_UID);
    }
    
    // 定义私有变量
    private String code ;

    // 构造函数，枚举类型只能为私有
	private ConParamVlutypEnum(String code) {
		this.code = code;
	}

    public String getCode() {
        return code;
    }

    public String getPersistedValue() {
        return getCode();
    }

    public ConParamVlutypEnum returnEnum(String persistedValue) {
        return map.get(persistedValue);
    }

    public Map<String, ConParamVlutypEnum> getAllValueMap() {
        return map;
    }

    public ConParamVlutypEnum[] getAllValue() {
        return ConParamVlutypEnum.values();
    }
    
    public String getDisplayValue() {
    	return ConParamVlutypEnum.class.getSimpleName() + "." + this.name();
    }
    
    public String toString() {
    	return code;
    }
}
