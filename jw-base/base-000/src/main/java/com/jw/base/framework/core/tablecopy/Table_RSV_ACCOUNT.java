
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
 * 	rsv_account基础字段
 * @author    [jianana]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.base.framework.core.tablecopy
 */
public class Table_RSV_ACCOUNT{
	private static final String TABLE = "hist_account";
	private static final String ORI_TABLE = "rsv_account";
	private static final List<TableCopyDto> CELLS;
	static{
		CELLS = new ArrayList<>();
		
		CELLS.add(new TableCopyDto("chain_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resv_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("share_seq",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("link_acct_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("turn_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("definite_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("guarantee_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cutoff_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("stay_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ig_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("group_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("group_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("group_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("group_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("group_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("partner_seq",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("resvsrc_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("mark",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("arr_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dep_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("clockrm_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reguest_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("bkguest_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("member_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("membertyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("memberrank_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("mcard_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("mcardtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("corp_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("corp_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("nego_corp_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("channel_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ffptyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("ffp_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("intro_profile_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("orgarr_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("arr_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("arr_tm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("hrstart_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("earlyin_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("orgdpt_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("dpt_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("dpt_tm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("hrend_tm",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("block_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("orgroomtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("saleroomtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("roomtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("room_quant",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("floor_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("building_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("area_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("room_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("roomfix_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pos_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("bed_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ml_prd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("extratable_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("paymentmethod_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("req_deposit_amt",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("req_deposit_enddt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("excsvc_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exctax1_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exctax2_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exctax3_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exctax4_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("exctax5_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("nopost_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rcpost_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ccardtyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("ccard_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ccard_expire_dt",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ccard_gst_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("othercrd_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("artrust_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ar_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("olpay_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("voucher",StandardBasicTypes.STRING));
		
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
		
		CELLS.add(new TableCopyDto("freememo",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("superfix_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("rt_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("key_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("invc_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("idsend_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ffsend_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("confirm_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("msgsend_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("audit_stus",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reserved_flg1",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reserved_flg2",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reserved_flg3",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reserved_flg4",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reserved_flg5",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reserved_flg6",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reserved_flg7",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reserved_flg8",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reserved_flg9",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reserved_flg10",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pickup_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pickup_station",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pickup_trno",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pickup_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("pickup_carrier",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pickup_cano",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pickup_memo",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dropoff_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dropoff_station",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dropoff_trno",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dropoff_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("dropoff_carrier",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dropoff_cano",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dropoff_memo",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("noprintrate_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("prrg_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("prrg_nums",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("prrgfmt_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("prrg_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("regicard_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("regicard_nums",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("regicardfmt_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("regicard_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cfmletter_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cfmletter_nums",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("cfmletterfmt_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("cfmletter_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("folio_nums",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("tele_lvl",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("net_lvl",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tv_lvl",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("keyresv",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("key_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ifuser_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("ifuser_pwd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("tele_from",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("wlrsn_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("wlrsn_txt",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("wl_priority",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("wl_teleno",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dnrrsn_txt",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("crs_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("crsacct_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("crsget_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("crsallowupt_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("confirmation_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("confirm_bdt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("confirm_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("confirm_unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("confirm_unit_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("confirm_user_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("confirm_user_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("confirm_user_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvcreate_bdt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("resvcreate_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("resvcreate_unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvcreate_unit_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvcreate_user_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvcreate_user_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvcreate_user_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reinstate_dt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("resvmodify_bdt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("resvmodify_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("resvmodify_unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvmodify_unit_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvmodify_user_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvmodify_user_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("resvmodify_user_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cancel_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cancellation_num",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cancelrsn_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("cancel_bdt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("cancel_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("cancel_unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cancel_unit_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cancel_user_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cancel_user_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cancel_user_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("checkin_bdt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("checkin_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("checkin_unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("checkin_unit_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("checkin_user_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("checkin_user_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("checkin_user_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("checkout_bdt",StandardBasicTypes.DATE));
		
		CELLS.add(new TableCopyDto("checkout_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("checkout_unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("checkout_unit_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("checkout_user_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("checkout_user_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("checkout_user_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("commission_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("lateout_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cancelrsn_txt",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dnrrsn_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("set_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("setrt_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("pseudo_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("hist_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reinstate_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("key_nums",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("accompany_nms",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str1",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str2",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str3",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str4",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str5",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str6",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str7",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str8",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str9",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str10",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str11",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str12",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str13",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str14",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str15",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str16",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str17",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str18",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str19",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str20",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str21",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str22",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str23",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str24",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str25",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str26",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str27",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str28",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str29",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_str30",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_num1",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num2",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num3",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num4",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num5",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num6",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num7",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num8",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num9",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num10",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num11",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num12",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num13",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num14",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num15",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num16",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num17",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num18",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num19",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_num20",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("acct_dt1",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("acct_dt2",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("acct_dt3",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("acct_dt4",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("acct_dt5",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("acct_dt6",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("acct_dt7",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("acct_dt8",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("acct_dt9",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("acct_dt10",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("credit_limit",StandardBasicTypes.BIG_DECIMAL));
		
		CELLS.add(new TableCopyDto("reinstatersn_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("reinstatersn_txt",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reinstate_unit_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reinstate_unit_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reinstate_user_uid",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reinstate_user_cd",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("reinstate_user_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("crbegin_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("crend_dhms",StandardBasicTypes.TIMESTAMP));
		
		CELLS.add(new TableCopyDto("arrpost_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("dptpost_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("member_no",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("mcardrank_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("realcard_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("turn_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("reserve_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("cutoff_days",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("salesphase_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("grouptyp_id",StandardBasicTypes.INTEGER));
		
		CELLS.add(new TableCopyDto("group_nm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("group_enm",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("partnermain_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("salesphase_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("acct_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("routing_flg",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("onlinepayment_typ",StandardBasicTypes.STRING));
		
		CELLS.add(new TableCopyDto("creditinst_id",StandardBasicTypes.INTEGER));
		
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

