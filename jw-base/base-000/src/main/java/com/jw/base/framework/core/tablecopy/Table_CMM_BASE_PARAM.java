
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
 * 	cmm_base_param基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.base.framework.core.tablecopy
 */
public class Table_CMM_BASE_PARAM{
	private static final String TABLE = "cmm_base_param";
	private static final String ORI_TABLE = "cmm_base_param";
	private static final List<TableCopyDto> CELLS;
	static{
		CELLS = new ArrayList<>();
		
		CELLS.add(new TableCopyDto("chain_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_drpt",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("paramgrp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("paramsubgrp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("status_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("seq",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("note",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str1",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str2",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str3",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str4",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str5",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str6",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str7",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str8",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str9",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str10",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_num1",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num2",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num3",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num4",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num5",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num6",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num7",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num8",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num9",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num10",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_dt1",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt2",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt3",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt4",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt5",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt6",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt7",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt8",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt9",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt10",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_str11",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str12",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str13",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str14",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str15",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str16",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str17",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str18",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str19",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str20",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str21",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str22",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str23",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str24",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str25",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str26",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str27",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str28",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str29",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_str30",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("param_num11",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num12",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num13",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num14",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num15",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num16",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num17",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num18",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num19",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_num20",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("param_dt11",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt12",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt13",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt14",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt15",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt16",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt17",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt18",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt19",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_dt20",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("param_int1",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int2",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int3",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int4",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int5",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int6",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int7",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int8",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int9",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int10",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int11",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int12",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int13",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int14",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int15",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int16",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int17",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int18",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int19",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("param_int20",StandardBasicTypes.INTEGER));
		
	/*	CELLS.add(new TableCopyDto("business_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("business_stus",StandardBasicTypes.STRING));*/
		
		CELLS.add(new TableCopyDto("crt_unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exclusive_flg",StandardBasicTypes.STRING));

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

