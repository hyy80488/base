
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.base.framework.core.tablecopy;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

import com.jw.base.framework.core.util.DateUtil;

/**
 * ## 类说明：
 * 	log_channel_info基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.base.framework.core.tablecopy
 */
public class Table_LOG_CHANNEL_INFO{
	private static final String TABLE = "log_channel_info";
	private static final String ORI_TABLE = "log_channel_info";
	private static final List<TableCopyDto> CELLS;
	static{
		CELLS = new ArrayList<>();
		
		CELLS.add(new TableCopyDto("chain_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("sor_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("send_url",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("request_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("response_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("request_data",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("response_data",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("retry_cnt",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("ifsvcver_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("success_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("syschannel_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("channel_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("chnl_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("crs_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("arr_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("arr_tm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dpt_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("dpt_tm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("memo",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_str1",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_str2",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_str3",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_str4",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_str5",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_str6",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_str7",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_str8",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_str9",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_str10",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("if_num1",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("if_num2",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("if_num3",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("if_num4",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("if_num5",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("if_dt1",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("if_dt2",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("if_dt3",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("if_dt4",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("if_dt5",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("scan_str5",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("scan_str6",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("scan_str7",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("scan_str8",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("scan_str9",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("scan_str10",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("scan_num1",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("scan_num2",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("scan_num3",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("scan_num4",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("scan_num5",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("scan_dt1",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("scan_dt2",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("scan_dt3",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("scan_dt4",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("scan_dt5",StandardBasicTypes.DATE));

		CELLS.addAll(TableUtils.CELLS);
	}
	
	public final static String getInsertSql(String yymd){
		StringBuilder sb = new StringBuilder();
		if(CollectionUtils.isNotEmpty(CELLS)){
			CELLS.forEach(m -> {
				if(sb.length() != 0){
					sb.append(",");
				}
				sb.append(m.getCellNm());
			});
			sb.append(" ) ");
			sb.insert(0, " INSERT INTO " + TABLE + "_" + yymd + " ( ");
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
		String yymm = DateUtil.formatDate(new Date(), DateUtil.DATE_YYMM_FORMAT);
		//拼接insert 语句
		String insertSql = getInsertSql(yymm);
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

