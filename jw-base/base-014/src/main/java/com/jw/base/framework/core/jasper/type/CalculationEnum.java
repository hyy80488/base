package com.jw.base.framework.core.jasper.type;

import java.util.Map;
import java.util.TreeMap;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.PersistEnum;

// 公式类型
public enum CalculationEnum implements PersistEnum<CalculationEnum> {

	// 无公式
	NOTHING("0"),
	// 系统日期
	CURRENTDATE("1"),
	// 系统时间
	CURRENTTIME("2"),
	// 系统日期时间
	CURRENTDATETIME("3"),
	// 系统年
	CURRENTYEAR("4"),
	// 系统月
	CURRENTMONTH("5"),
	// 当前日期在一年中第几天（1-366）
	CURRENTDAYOFYEAR("6"),
	// 当前日期在一月中第几天（1-31）
	CURRENTDAYOFMONTH("7"),
	// 当前日期在系统星期（1-7）
	CURRENTWEEK("8"),
	// 年 有参数
	YEAROF("9"),
	// 月 有参数
	MONTHOF("10"),
	// 一年中第几天（1-366） 有参数
	DAYOFYEAR("11"),
	// 一月中第几天（1-31） 有参数
	DAYOFMONTH("12"),
	// 星期几 有参数
	WEEKOF("13"),
	// 随机函数 有参数
	RANDOM("14"),
	// 个数
	COUNT("15"),
	// 求和
	SUM("16"),
	// 平均数
	AVERAGE("17"),
	// 最小值
	LOWEST("18"),
	// 最大值
	HIGHEST("19");

	private static final Map<String, CalculationEnum> map = new TreeMap<String, CalculationEnum>();

	static {
		map.put(NOTHING.getCode(), NOTHING);
		map.put(CURRENTDATE.getCode(), CURRENTDATE);
		map.put(CURRENTTIME.getCode(), CURRENTTIME);
		map.put(CURRENTDATETIME.getCode(), CURRENTDATETIME);
		map.put(CURRENTYEAR.getCode(), CURRENTYEAR);
		map.put(CURRENTMONTH.getCode(), CURRENTMONTH);
		map.put(CURRENTDAYOFYEAR.getCode(), CURRENTDAYOFYEAR);
		map.put(CURRENTDAYOFMONTH.getCode(), CURRENTDAYOFMONTH);
		map.put(CURRENTWEEK.getCode(), CURRENTWEEK);
		map.put(YEAROF.getCode(), YEAROF);
		map.put(MONTHOF.getCode(), MONTHOF);
		map.put(DAYOFYEAR.getCode(), DAYOFYEAR);
		map.put(DAYOFMONTH.getCode(), DAYOFMONTH);
		map.put(WEEKOF.getCode(), WEEKOF);
		map.put(RANDOM.getCode(), RANDOM);
		map.put(COUNT.getCode(), COUNT);
		map.put(SUM.getCode(), SUM);
		map.put(AVERAGE.getCode(), AVERAGE);
		map.put(LOWEST.getCode(), LOWEST);
		map.put(HIGHEST.getCode(), HIGHEST);
	}

	// 定义私有变量
	private String code;

	@Override
	public String getPersistedValue() {
		return getCode();
	}

	private CalculationEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	@Override
	public CalculationEnum returnEnum(String persistedValue) {
		return map.get(persistedValue);
	}

	@Override
	public Map<String, CalculationEnum> getAllValueMap() {
		return map;
	}

	@Override
	public CalculationEnum[] getAllValue() {
		return CalculationEnum.values();
	}

	@Override
	public String getDisplayValue() {
		return CalculationEnum.class.getSimpleName() + Constant.CHAR_DOT + this.name();
	}

	public String toString() {
		return code;
	}
}
