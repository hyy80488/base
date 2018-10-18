
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
 * 	rsv_account_guest基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.base.framework.core.tablecopy
 */
public class Table_RSV_ACCOUNT_GUEST{
	private static final String TABLE = "hist_account_guest";
	private static final String ORI_TABLE = "rsv_account_guest";
	private static final List<TableCopyDto> CELLS;
	static{
		CELLS = new ArrayList<>();
		
CELLS.add(new TableCopyDto("chain_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guest_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("resv_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guest_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("profile_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("profile_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("first_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("middle_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("last_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("alt_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guest_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("sound_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("index_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("title_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("gender",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("vip_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("nation_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("birthplace_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("birthday",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("birthdate",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("country_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("province_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("city_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("language_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("certificatetyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("crtf_country_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("certificate_idcd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("crtf_expiry_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("visatyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("visa_country_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("visa_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("visa_expiry_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("visaoffice_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("visa_nums",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("visa_issue_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("entry_point",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("entry_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("stay_rs",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("wherefrom",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("whereto",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("receipt_company",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rcountry_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rprovince_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rcity_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("district_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("address1",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("address2",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("address3",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("post_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tele_ctno",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("email_eml",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("contacttyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("contact_ctno",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("confirmation_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("extconfm_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guest_memo",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guest_suppress_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("hist_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("mediafile_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("idsend_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guest_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("arr_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("arr_tm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dpt_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("dpt_tm",StandardBasicTypes.STRING));

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

