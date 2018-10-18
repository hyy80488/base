
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.base.framework.core.tablecopy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

/**
 * ## 类说明：
 * 	rsv_account_package基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.base.framework.core.tablecopy
 */
public class Table_RSV_ACCOUNT_PACKAGE{
	private static final String TABLE = "hist_account_package";
	private static final String ORI_TABLE = "rsv_account_package";
	public static final List<TableCopyDto> CELLS;
	static{
		CELLS = new ArrayList<>();
		
CELLS.add(new TableCopyDto("chain_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("begin_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("end_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("rate_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("package_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("pkg_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("product_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("price",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("allowance_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("frequency",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("bucket2_price",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("bucket2_allowance_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("bucket2_frequency",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("bucket3_price",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("bucket3_allowance_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("bucket3_frequency",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("bucket4_price",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("bucket4_allowance_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("bucket4_frequency",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("bucket5_price",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("bucket5_allowance_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("bucket5_frequency",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("quantity",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("org_quantity",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("pkg_std",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pkgcharge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pkgfolio_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("post_rhythm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pkgfix_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("fixedrate_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("redemption_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("product_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("audit_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("memo",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("package_seq",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pkggroup_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("hist_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("addon_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("allowance_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("from_day",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("every_day",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("day1",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day2",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day3",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day4",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day5",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day6",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day7",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date1",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date2",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date3",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date4",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date5",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date6",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date7",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date8",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date9",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date10",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date11",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date12",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date13",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date14",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date15",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date16",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date17",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date18",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date19",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date20",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date21",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date22",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date23",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date24",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date25",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date26",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date27",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date28",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date29",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date30",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("date31",StandardBasicTypes.STRING));

		CELLS.addAll(TableUtils.CELLS);
	}
	
	public final static String getInsertSql(){
		StringBuilder sb = new StringBuilder();
		if(CollectionUtils.isNotEmpty(CELLS)){
			CELLS.forEach(m -> {
				if(sb.length() != 0){
					sb.append(",");
				}
				sb.append(m.getCellNm());
			});
			sb.append(" ) ");
			sb.insert(0, " INSERT INTO " + TABLE + " ( ");
		}
		return sb.toString();
	}
	
	public final static String getInsertOriSq(){
		StringBuilder sb = new StringBuilder();
		if(CollectionUtils.isNotEmpty(CELLS)){
			CELLS.forEach(m -> {
				if(sb.length() != 0){
					sb.append(",");
				}
				sb.append(m.getCellNm());
			});
			sb.append(" ) ");
			sb.insert(0, " INSERT INTO " + ORI_TABLE + " ( ");
		}
		return sb.toString();
	}
	
	public final static String getOriSelectSql(){
		StringBuilder sb = new StringBuilder();
		if(CollectionUtils.isNotEmpty(CELLS)){
			CELLS.forEach(m -> {
				if(sb.length() != 0){
					sb.append(",");
				}
				sb.append(m.getCellNmOri());
			});
			
			sb.insert(0, " SELECT " );
			sb.append("  FROM " + ORI_TABLE);
		}
		return sb.toString();
	}
	
	/** 
	 * ## 方法说明：
	 * 	拼接参数
	 * @param params
	 * @param index
	 * @param todos
	 * @param outMap
	 * @return
	*/
	public final static String getParamMap(
			final Map<String, Object> params, 
			final Integer index, 
			Map<String, TableToDo<?>> todos, 
			final Map<String, Map<Object, Type>> outMap){
		if(Objects.isNull(todos)){
			todos = new HashMap<>();
		}
		return TableUtils.getInsertSelectSql(params, index, todos, CELLS, outMap);
	}
	/** 
	 * ## 方法说明：
	 * 	拼接参数
	 * @param params
	 * @param index
	 * @param outMap
	 * @return
	*/
	public final static String getParamMap(
			final Map<String, Object> params, 
			final Integer index, 
			final Map<String, Map<Object, Type>> outMap){
		return getParamMap(params, index, null, outMap);
	}
	
	/** 
	 * ## 方法说明：
	 * 	获取字段拼接
	 * @return
	*/
	public final static String getField(String prefix){
		if(prefix == null){
			prefix = "";
		}
		final String prefixTmp = StringUtils.isEmpty(prefix) ? "" : prefix.trim()+".";
		StringBuilder sb = new StringBuilder();
		if(CollectionUtils.isNotEmpty(CELLS)){
			CELLS.forEach(m -> {
				if(sb.length() != 0){
					sb.append(",");
				}
				sb.append(prefixTmp + m.getCellNmOri());
			});
		}
		sb.insert(0, "  ");
		sb.append("  ");
		return sb.toString();
	}

	/** 
	 * ## 方法说明：
	 * 	数据保存
	 * @param trans 回调函数
	 * @param data 保存数据
	 * @param maxLen 最大sql长度
	 * @param param 保存参数
	 * @return
	 * @throws Exception 
	*/
	public final static Integer save(TableToSave<String, Map<String, Map<Object, Type>>, Integer> trans,
			List<Map<String, Object>> data, Integer maxLen, Map<String, TableToDo<?>> param) throws Exception {
		Integer cnt = 0;
		//不存在数据直接返回
		if (CollectionUtils.isEmpty(data)) {
			return cnt;
		}
		//拼接insert 语句
		String insertSql = getInsertSql();
		//拼接保存语句
		StringBuilder sql = new StringBuilder();
		Map<String, Map<Object, Type>> outMap = new HashMap<>();
		for (Map<String, Object> map : data) {
			//不为第一条 拼接union all
			if (sql.length() != 0) {
				sql.append(" UNION ALL ");
			}
			//存在入参  调用带入参方法
			if (MapUtils.isNotEmpty(param)) {
				sql.append(getParamMap(map, cnt, param, outMap));
			} else {
				sql.append(getParamMap(map, cnt, outMap));
			}
			//超出sql最大长度，批量提交
			if (insertSql.length() + sql.length() > maxLen) {
				sql.insert(0, insertSql);
				trans.todo(sql.toString(), outMap);
				outMap.clear();
				sql = new StringBuilder();
			}
			cnt++;
		}
		//存在未提交数据  再次提交
		if (sql.length() != 0) {
			sql.insert(0, insertSql);
			trans.todo(sql.toString(), outMap);
		}
		return cnt;
	}

}

