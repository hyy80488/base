
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
 * 	grp_rsv_rate基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.base.framework.core.tablecopy
 */
public class Table_GRP_RSV_RATE{
	private static final String TABLE = "grp_rsv_rate";
	private static final String ORI_TABLE = "grp_rsv_rate";
	private static final List<TableCopyDto> CELLS;
	static{
		CELLS = new ArrayList<>();
		
		CELLS.add(new TableCopyDto("chain_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rate_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rate_ver",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("status_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("publish_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("template_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("grp_template_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rate_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rate_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("seq",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rerate_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("baserate_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rategrp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("ratesubgrp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rate_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rate_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rate_std",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("price_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rate_level",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("use_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("crsrate_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("negotiated_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cohu_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("calendar_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("tier_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("suppress_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("publish_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("start_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("end_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("promstart_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("promend_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("bookstart_dhms",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("bookend_dhms",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("folio_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("folio_drpt",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvnotice_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("resvnotice",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("market_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("source_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("suggest_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("commission_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("nocredit_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("currency_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("multicurrency_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("disc_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("disct_net",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("disc_vlu",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("disc_pcts",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("base_round",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("min_pers",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("max_pers",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rctrncd_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("foliotrncd_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("svctyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("svcfolio_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("svccharge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax1_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("tax1folio_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax1charge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax2_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("tax2folio_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax2charge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax3_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("tax3folio_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax3charge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax4_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("tax4folio_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax4charge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax5_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("tax5folio_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax5charge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pkggroup_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("note",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("display_color",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("memo",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("c2nrate_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("cycle_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cycle_days",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("psn_std",StandardBasicTypes.STRING));
		
		
		/*CELLS.add(new TableCopyDto("business_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("business_stus",StandardBasicTypes.STRING));*/

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

