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
 * 	stat_snap_rsv基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.base.framework.core.tablecopy
 */
public class Table_STAT_SNAP_RSV{
	private static final String TABLE = "stat_snap_rsv";
	private static final String ORI_TABLE = "stat_snap_rsv";
	private static final List<TableCopyDto> CELLS;
	static{
		CELLS = new ArrayList<>();
		
		CELLS.add(new TableCopyDto("chain_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("business_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("acct_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resv_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("share_seq",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("definite_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guarantee_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("stay_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ig_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("group_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("arr_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dep_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("member_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("membertyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("memberrank_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("mcard_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("mcardtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("nego_corp_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("channel_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("arr_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("arr_tm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dpt_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("dpt_tm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("roomtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("room_quant",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("floor_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("building_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("area_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("room_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pseudo_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("saler_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("stattyp1_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("stattyp2_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("stattyp3_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("stattyp4_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("stattyp5_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("stattyp6_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("stattyp7_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("stattyp8_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("stattyp9_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("stattyp10_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("scountry_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("sprovince_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("scity_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("resvcreate_bdt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("cancel_bdt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("charge_tot",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("pay_tot",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("gst_balance",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("balanced_folios",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("guest_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("profile_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("first_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("middle_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("last_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("alt_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guest_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("sound_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("index_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("gender",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("vip_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("birthday",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("birthdate",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("country_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("province_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("city_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rate_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rate_roomtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("use_rate",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("adult_cnt",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("children_cnt",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("age1_cnt",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("age2_cnt",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("age3_cnt",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("age4_cnt",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("age5_cnt",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("extrabed_quant",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("crib_quant",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("disc_pcnt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("disc_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("ratersn_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("rate_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("rc_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("main_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cohu_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("market_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("source_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("negprice_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("package_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pkg_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("turn_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("group_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("group_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("group_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("partner_seq",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvsrc_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("clockrm_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("member_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("mcardrank_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("realcard_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("ffptyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("intro_profile_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("hrstart_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("earlyin_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("hrend_tm",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("lateout_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("orgroomtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("saleroomtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("roomfix_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pos_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("bed_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("paymentmethod_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("excsvc_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exctax1_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exctax2_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exctax3_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exctax4_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exctax5_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("nopost_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rcpost_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("arrpost_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dptpost_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("confirm_bdt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("profile_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guest_suppress_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rate_ver",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("customize_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rack_rate",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("room_cost",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("total_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("total_pkg_amt",StandardBasicTypes.BIG_DECIMAL));
		
		//CELLS.add(new TableCopyDto("business_uid",StandardBasicTypes.STRING));
		
		//CELLS.add(new TableCopyDto("business_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("orgarr_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("orgdpt_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("reinstate_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("checkin_bdt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("auth_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("forecast_rmcharge",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("forecast_othcharge",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("reserve_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cutoff_days",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("salesphase_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("grouptyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("group_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("group_enm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("partnermain_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("salesphase_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_typ",StandardBasicTypes.STRING));

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

