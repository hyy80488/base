
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
 * 	hpt_fin_transaction基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.base.framework.core.tablecopy
 */
public class Table_HPT_FIN_TRANSACTION{
	private static final String TABLE = "hist_fin_transaction";
	private static final String ORI_TABLE = "hpt_fin_transaction";
	private static final List<TableCopyDto> CELLS;
	static{
		CELLS = new ArrayList<>();
		
CELLS.add(new TableCopyDto("chain_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("trn_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("business_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("post_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("acct_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("orgacct_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guest_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("room_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("area_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("ws_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("page_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("trncd_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("trn_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("trn_drpt",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("trncls_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("trnsubcls_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("normal",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("trn_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("print_trn_drpt",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("print_trn_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("adult_cnt",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("children_cnt",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("fiscal_nights",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("ccardtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("ar_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("mcard_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("posbill_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("folio_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ext_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ml_prd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("trn_ref",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("trn_cmnt",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("currency_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("exchange_rate",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("input_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("use_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trntot_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("pkg_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("svccharge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax1charge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax2charge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax3charge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax4charge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tax5charge_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("trn_net",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trn_tax1",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trn_tax2",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trn_tax3",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trn_tax4",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trn_tax5",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trnsvc_net",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trnsvc_tax1",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trnsvc_tax2",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trnsvc_tax3",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trnsvc_tax4",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trnsvc_tax5",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("trn_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("mtrn_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("bill_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("roomtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rate_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("trn_memo",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("func_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("hist_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rate_ver",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("turn_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("nocredit_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("orgguest_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("begin_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("end_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("product_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("goods_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("goods_quant",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("member_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("realcard_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("tran_sysid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pointfolio_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("mcfolio_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("mrightfolio_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("thirdsys_bill_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("arrpost_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("dptpost_id",StandardBasicTypes.INTEGER));

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

