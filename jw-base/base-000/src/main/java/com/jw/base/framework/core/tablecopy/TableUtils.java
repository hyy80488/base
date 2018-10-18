package com.jw.base.framework.core.tablecopy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections4.MapUtils;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.DateType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.StringType;
import org.hibernate.type.TimestampType;
import org.hibernate.type.Type;

import com.jw.base.framework.core.util.DateUtil;
import com.jw.base.framework.core.util.NumberUtil;

public class TableUtils {
	
	/** 
	* @Fields MAX_EXPORT_CNT : 最大导出数据
	*/ 
	public static final Integer MAX_EXPORT_CNT = 50;
	public static final Integer MAX_ACCT_EXPORT_CNT = 20;
	public static final List<TableCopyDto> CELLS;
	static {
		CELLS = new ArrayList<>();
		CELLS.add(new TableCopyDto("business_uid",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("business_stus",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("created_by_uid",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("created_date",StandardBasicTypes.TIMESTAMP));
		CELLS.add(new TableCopyDto("created_by",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("created_by_cd",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("created_unit_cd",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("created_unit_uid",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("modified_by_uid",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("modified_date",StandardBasicTypes.TIMESTAMP));
		CELLS.add(new TableCopyDto("modified_by",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("modified_by_cd",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("modified_unit_cd",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("modified_unit_uid",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("trace_uid",StandardBasicTypes.STRING));
		CELLS.add(new TableCopyDto("version",StandardBasicTypes.INTEGER));
	}
	
	public final static String getInsertSelectSql(
			final Map<String, Object> params, 
			final Integer index, 
			final Map<String, TableToDo<?>> todos,
			final List<TableCopyDto> cells,
			final Map<String, Map<Object, Type>> outMap){
		StringBuilder sql=new StringBuilder();
		cells.forEach(m -> {
			if(sql.length() != 0){
				sql.append(",");
			}
			String strNm = m.getCellNm();
			String strNm_Sql = String.format("%s_%s",strNm,index);
			String strNm_select = ":" + strNm_Sql;
			outMap.put(strNm_Sql, new HashMap<>());
			TableToDo<?> tran = todos.get(m.getCellNm());
			if(IntegerType.class.isInstance(m.getDbTyp())){
				Integer value = MapUtils.getInteger(params, strNm);
				if(tran != null){
					value = NumberUtil.toInt(tran.todo(), null);
				}
				outMap.get(strNm_Sql).put(value, m.getDbTyp());
			}
			if(StringType.class.isInstance(m.getDbTyp())){
				String value = MapUtils.getString(params, strNm);
				if(tran != null){
					value = Objects.toString(tran.todo(),null);
				}
				outMap.get(strNm_Sql).put(value, m.getDbTyp());
			}
			if(BigDecimalType.class.isInstance(m.getDbTyp())){
				BigDecimal value = NumberUtil.toBigDecimal(params.get(strNm), null);
				if(tran != null){
					value = NumberUtil.toBigDecimal(tran.todo(),null);
				}
				outMap.get(strNm_Sql).put(value, m.getDbTyp());
			}
			if(DateType.class.isInstance(m.getDbTyp())){
				Date value = DateUtil.toDate(params.get(strNm), null);
				if(tran != null){
					value =  DateUtil.toDate(tran.todo(),null);
				}
				outMap.get(strNm_Sql).put(value, m.getDbTyp());
				strNm_select = String.format("CAST(%s AS DATE)", strNm_select);
			}
			if(TimestampType.class.isInstance(m.getDbTyp())){
				Date value = DateUtil.toTIMESTAMP(params.get(strNm), null);
				if(tran != null){
					value =  DateUtil.toTIMESTAMP(tran.todo(),null);
				}
				outMap.get(strNm_Sql).put(value, m.getDbTyp());
				strNm_select = String.format("CAST(%s AS TIMESTAMP)", strNm_select);
			}
			sql.append(strNm_select);
		});
		sql.insert(0, " SELECT ");
		return sql.toString();
	}
	
	private final static <T> T getValue(Object obj, Class<T> t){
		return (T)obj;
	}
	
	public static void main(String[] args) {
		
		java.sql.Date date = new java.sql.Date(999999);
		System.out.println(date instanceof Date);
		
		Map<String, TableToDo<?>> param = new HashMap<>();
		param.put("created_date",() ->  new Date());
		param.put("version",() ->  0);
		
		System.out.println(DateUtil.toTIMESTAMP(param.get("created_date").todo(), null));
		
		
		TableCopyDto tableCopyDto = new TableCopyDto("a",StandardBasicTypes.INTEGER);
		System.out.println(getValue(new BigDecimal(100), BigDecimal.class));
		System.out.println(tableCopyDto.getDbTyp() instanceof IntegerType);
		System.out.println(IntegerType.class.isInstance(tableCopyDto.getDbTyp()));
		System.out.println(tableCopyDto.getDbTyp() == StandardBasicTypes.INTEGER);
		Map<String, Map<Object, Type>> map = new HashMap<>();
		String string = Table_STAT_SNAP_AR_INVCTRN_JRNL.getParamMap(new HashMap<>(),0,null,map);
		System.out.println(string);
		//String string = Table_STAT_SNAP_AR_INVCTRN_JRNL.getParamMap(new HashMap<>(),0,null,map);
		//System.out.println(string);
		System.out.println(map);
	}
}
