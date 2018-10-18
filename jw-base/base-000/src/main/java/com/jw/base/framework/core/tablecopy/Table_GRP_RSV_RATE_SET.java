
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
 * 	grp_rsv_rate_set基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.base.framework.core.tablecopy
 */
public class Table_GRP_RSV_RATE_SET{
	private static final String TABLE = "grp_rsv_rate_set";
	private static final String ORI_TABLE = "grp_rsv_rate_set";
	private static final List<TableCopyDto> CELLS;
	static{
		CELLS = new ArrayList<>();
		
		CELLS.add(new TableCopyDto("chain_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rate_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rate_set_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("status_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("start_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("end_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("season_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tier_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("day1",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day2",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day3",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day4",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day5",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day6",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("day7",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("adultdef_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult1_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult2_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult3_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult4_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult5_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("childrendef_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("children1_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("children2_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("children3_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("children4_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("children5_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("extra_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("pkggroup_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("adultdef_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("adult1_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("adult2_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("adult3_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("adult4_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("adult5_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("childrendef_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("children1_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("children2_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("children3_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("children4_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("children5_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("extra_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("adultdef_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult1_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult2_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult3_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult4_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult5_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("childrendef_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("children1_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("children2_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("children3_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("children4_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("children5_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("extra_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("tolerance_tmlen",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("starting_tmlen",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("starting_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("timingcell_tmlen",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("timing_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("timingmin_tmlen",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("timingmin_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("timingfree_tmlen",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("c2nrate_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("clk2nml_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("clk2nml_settm",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("clk2nml_limitlen",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("clockrmnights_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("clockrm_nights",StandardBasicTypes.BIG_DECIMAL));
		
	/*	CELLS.add(new TableCopyDto("business_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("business_stus",StandardBasicTypes.STRING));*/
		
		CELLS.add(new TableCopyDto("roomtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rate_set_flg",StandardBasicTypes.STRING));

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

