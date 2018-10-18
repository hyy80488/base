
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3220.f010.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.base.framework.core.util.CalcUtil;
import com.jw.base.framework.core.util.DateUtil;
import com.jw.base.framework.core.util.NumberUtil;

import static org.apache.commons.lang3.ObjectUtils.firstNonNull;
/**
 * ## 类说明：
 * 	可用房dto
 * @author    [dazhuang]   
 * @version   [V1.0, 2017-03-17]
 * @package com.jw.hms.pms.m3250.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-03-17|dazhuangm|新增|RmCheckDto新增
 */
@DrptDto(dtonm = "RoomAvaRes",dtodrpt="可用房dto")
public class RoomAvaRes  implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7342920380262767878L;
	@DrptField(fieldnm="roomtypId",fielddrpt="房型id")
	private Integer roomtypId;
	@DrptField(fieldnm="roomtypCd",fielddrpt="房型cd")
	private String roomtypCd;
	@DrptField(fieldnm="roomtypNm",fielddrpt="房型nm")
	private String roomtypNm;
	@DrptField(fieldnm = "statusFlg", fielddrpt = "有效无效 ")
	private String statusFlg;
	@DrptField(fieldnm = "pseudoFlg", fielddrpt = "假房标志")
	private String pseudoFlg;
	@DrptField(fieldnm = "roomtypFlg", fielddrpt = "房型属性 ")
	private String roomtypFlg;
	@DrptField(fieldnm="seq",fielddrpt="seq")
	private Integer seq;
	@DrptField(fieldnm="yymd",fielddrpt="日期")
	private Date yymd;
	@DrptField(fieldnm="allRoomCnt",fielddrpt="总放数据")
	private Integer allRoomCnt;
	@DrptField(fieldnm="Bs_Ooo",fielddrpt="ooo数量")
	private Integer bs_Ooo;
	@DrptField(fieldnm="Bs_Oos",fielddrpt="oos数量")
	private Integer bs_Oos;
	@DrptField(fieldnm="Bs_Ooi",fielddrpt="ooi数量")
	private Integer bs_Ooi;
	@DrptField(fieldnm="Bs_OverBk",fielddrpt="超定数")
	private Integer bs_OverBk;
	@DrptField(fieldnm="bs_Tempid",fielddrpt="临时预订散客")
	private Integer bs_Tempid;
	@DrptField(fieldnm="bs_TempGr",fielddrpt="临时预订团队")
	private Integer bs_TempGr;
	@DrptField(fieldnm="bs_EarlyIn",fielddrpt="早入住")
	private Integer bs_EarlyIn;
	@DrptField(fieldnm="bs_LateOut",fielddrpt="晚离店")
	private Integer bs_LateOut;
	@DrptField(fieldnm="bs_EpArrRsvId",fielddrpt="预抵无房号散客")
	private Integer bs_EpArrRsvId;
	@DrptField(fieldnm="bs_EpArrPriId",fielddrpt="预抵有房号散客")
	private Integer bs_EpArrPriId;
	@DrptField(fieldnm="bs_EpArrRsvGr",fielddrpt="预抵无房号团队")
	private Integer bs_EpArrRsvGr;
	@DrptField(fieldnm="bs_EpArrPriGr",fielddrpt="预抵有房号团队")
	private Integer bs_EpArrPriGr;
	@DrptField(fieldnm="bs_ArrId",fielddrpt="预订已到散客")
	private Integer bs_ArrId;
	@DrptField(fieldnm="bs_ArrGr",fielddrpt="预订已到团队")
	private Integer bs_ArrGr;
	@DrptField(fieldnm="bs_StayOverId",fielddrpt="STAYOVER散客")
	private Integer bs_StayOverId;
	@DrptField(fieldnm="bs_StayOverGr",fielddrpt="STAYOVER团队")
	private Integer bs_StayOverGr;
	@DrptField(fieldnm="bs_DepartureId",fielddrpt="预离散客")
	private Integer bs_DepartureId;
	@DrptField(fieldnm="bs_DepartureGr",fielddrpt="预离团队")
	private Integer bs_DepartureGr;
	@DrptField(fieldnm="bs_OutId",fielddrpt="已结散客")
	private Integer bs_OutId;
	@DrptField(fieldnm="bs_OutGr",fielddrpt="已结团队")
	private Integer bs_OutGr;
	@DrptField(fieldnm="bs_StyDepId",fielddrpt="在店散客")
	private Integer bs_StyDepId;
	@DrptField(fieldnm="bs_StyDepGr",fielddrpt="在店团队")
	private Integer bs_StyDepGr;
	@DrptField(fieldnm="bs_StyDepWi",fielddrpt="Walkin在店（酒店日期当天）")
	private Integer bs_StyDepWi;
	@DrptField(fieldnm="bs_DuRsvPriId",fielddrpt="DAYUSE散客预订")
	private Integer bs_DuRsvPriId;
	@DrptField(fieldnm="bs_DuRsvPriGr",fielddrpt="DAYUSE团队预订")
	private Integer bs_DuRsvPriGr;
	@DrptField(fieldnm="bs_DuDepId",fielddrpt="预离DAYUSE散客")
	private Integer bs_DuDepId;
	@DrptField(fieldnm="bs_DuDepGr",fielddrpt="预离DAYUSE团队")
	private Integer bs_DuDepGr;
	@DrptField(fieldnm="bs_DuOutId",fielddrpt="已结DAYUSE散客")
	private Integer bs_DuOutId;
	@DrptField(fieldnm="bs_DuOutGr",fielddrpt="已结DAYUSE团队")
	private Integer bs_DuOutGr;
	
	@DrptField(fieldnm="bs_CrRsvPriId",fielddrpt="钟点房散客预订")
	private Integer bs_CrRsvPriId;
	@DrptField(fieldnm="bs_CrRsvPriGr",fielddrpt="钟点房团队预订")
	private Integer bs_CrRsvPriGr;
	@DrptField(fieldnm="bs_CrDepId",fielddrpt="预离钟点房散客")
	private Integer bs_CrDepId;
	@DrptField(fieldnm="bs_CrDepGr",fielddrpt="预离钟点房团队")
	private Integer bs_CrDepGr;
	@DrptField(fieldnm="bs_CrOutId",fielddrpt="已结钟点房散客")
	private Integer bs_CrOutId;
	@DrptField(fieldnm="bs_CrOutGr",fielddrpt="已结钟点房团队")
	private Integer bs_CrOutGr;
	
	@DrptField(fieldnm="bs_VacIp",fielddrpt="已查空房")
	private Integer bs_VacIp;
	@DrptField(fieldnm="bs_OccIp",fielddrpt="已查占用")
	private Integer bs_OccIp;
	@DrptField(fieldnm="bs_VacCL",fielddrpt="干净空房")
	private Integer bs_VacCL;
	@DrptField(fieldnm="bs_OccCL",fielddrpt="干净占用")
	private Integer bs_OccCL;
	@DrptField(fieldnm="bs_VacDt",fielddrpt="脏房空")
	private Integer bs_VacDt;
	@DrptField(fieldnm="bs_OccDt",fielddrpt="脏房占用")
	private Integer bs_OccDt;
	@DrptField(fieldnm="bs_InHsDepId",fielddrpt="在店预离散客房数")
	private Integer bs_InHsDepId;
	@DrptField(fieldnm="bs_InHsDepGr",fielddrpt="在店预离团队房数")
	private Integer bs_InHsDepGr;
	
	public Integer getRoomtypId() {
		return roomtypId;
	}
	public void setRoomtypId(Integer roomtypId) {
		this.roomtypId = roomtypId;
	}

	public String getRoomtypCd() {
		return roomtypCd;
	}
	public void setRoomtypCd(String roomtypCd) {
		this.roomtypCd = roomtypCd;
	}

	public String getRoomtypNm() {
		return roomtypNm;
	}
	public void setRoomtypNm(String roomtypNm) {
		this.roomtypNm = roomtypNm;
	}

	public String getStatusFlg() {
		return statusFlg;
	}
	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}

	public String getPseudoFlg() {
		return pseudoFlg;
	}
	public void setPseudoFlg(String pseudoFlg) {
		this.pseudoFlg = pseudoFlg;
	}
	@JSONField(serialize=false)
	public String getRoomtypFlg() {
		return roomtypFlg;
	}
	public void setRoomtypFlg(String roomtypFlg) {
		this.roomtypFlg = roomtypFlg;
	}

	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Date getYymd() {
		return yymd;
	}
	public void setYymd(Date yymd) {
		this.yymd = yymd;
	}

	public Integer getAllRoomCnt() {
		return allRoomCnt;
	}
	public void setAllRoomCnt(Integer allRoomCnt) {
		this.allRoomCnt = allRoomCnt;
	}
	@JSONField(serialize=false)
	public Integer getBs_Ooo() {
		return bs_Ooo;
	}
	public void setBs_Ooo(Integer bs_Ooo) {
		this.bs_Ooo = bs_Ooo;
	}

	public Integer getBs_Oos() {
		return bs_Oos;
	}
	public void setBs_Oos(Integer bs_Oos) {
		this.bs_Oos = bs_Oos;
	}

	public Integer getBs_OverBk() {
		return bs_OverBk;
	}
	public void setBs_OverBk(Integer bs_OverBk) {
		this.bs_OverBk = bs_OverBk;
	}

	public Integer getBs_Tempid() {
		return bs_Tempid;
	}
	public void setBs_Tempid(Integer bs_Tempid) {
		this.bs_Tempid = bs_Tempid;
	}

	public Integer getBs_TempGr() {
		return bs_TempGr;
	}
	public void setBs_TempGr(Integer bs_TempGr) {
		this.bs_TempGr = bs_TempGr;
	}

	public Integer getBs_EarlyIn() {
		return bs_EarlyIn;
	}
	public void setBs_EarlyIn(Integer bs_EarlyIn) {
		this.bs_EarlyIn = bs_EarlyIn;
	}
	
	public Integer getBs_LateOut() {
		return bs_LateOut;
	}
	public void setBs_LateOut(Integer bs_LateOut) {
		this.bs_LateOut = bs_LateOut;
	}
	
	public Integer getBs_EpArrRsvId() {
		return bs_EpArrRsvId;
	}
	public void setBs_EpArrRsvId(Integer bs_EpArrRsvId) {
		this.bs_EpArrRsvId = bs_EpArrRsvId;
	}
	
	public Integer getBs_EpArrPriId() {
		return bs_EpArrPriId;
	}
	public void setBs_EpArrPriId(Integer bs_EpArrPriId) {
		this.bs_EpArrPriId = bs_EpArrPriId;
	}
	
	public Integer getBs_EpArrRsvGr() {
		return bs_EpArrRsvGr;
	}
	public void setBs_EpArrRsvGr(Integer bs_EpArrRsvGr) {
		this.bs_EpArrRsvGr = bs_EpArrRsvGr;
	}
	
	public Integer getBs_EpArrPriGr() {
		return bs_EpArrPriGr;
	}
	public void setBs_EpArrPriGr(Integer bs_EpArrPriGr) {
		this.bs_EpArrPriGr = bs_EpArrPriGr;
	}
	
	public Integer getBs_ArrId() {
		return bs_ArrId;
	}
	public void setBs_ArrId(Integer bs_ArrId) {
		this.bs_ArrId = bs_ArrId;
	}
	
	public Integer getBs_ArrGr() {
		return bs_ArrGr;
	}
	public void setBs_ArrGr(Integer bs_ArrGr) {
		this.bs_ArrGr = bs_ArrGr;
	}
	
	public Integer getBs_StayOverId() {
		return bs_StayOverId;
	}
	public void setBs_StayOverId(Integer bs_StayOverId) {
		this.bs_StayOverId = bs_StayOverId;
	}
	
	public Integer getBs_StayOverGr() {
		return bs_StayOverGr;
	}
	public void setBs_StayOverGr(Integer bs_StayOverGr) {
		this.bs_StayOverGr = bs_StayOverGr;
	}
	
	public Integer getBs_DepartureId() {
		return bs_DepartureId;
	}
	public void setBs_DepartureId(Integer bs_DepartureId) {
		this.bs_DepartureId = bs_DepartureId;
	}
	
	public Integer getBs_DepartureGr() {
		return bs_DepartureGr;
	}
	public void setBs_DepartureGr(Integer bs_DepartureGr) {
		this.bs_DepartureGr = bs_DepartureGr;
	}
	
	public Integer getBs_OutId() {
		return bs_OutId;
	}
	public void setBs_OutId(Integer bs_OutId) {
		this.bs_OutId = bs_OutId;
	}
	
	public Integer getBs_OutGr() {
		return bs_OutGr;
	}
	public void setBs_OutGr(Integer bs_OutGr) {
		this.bs_OutGr = bs_OutGr;
	}
	
	public Integer getBs_StyDepId() {
		return bs_StyDepId;
	}
	public void setBs_StyDepId(Integer bs_StyDepId) {
		this.bs_StyDepId = bs_StyDepId;
	}
	
	public Integer getBs_StyDepGr() {
		return bs_StyDepGr;
	}
	public void setBs_StyDepGr(Integer bs_StyDepGr) {
		this.bs_StyDepGr = bs_StyDepGr;
	}
	
	public Integer getBs_StyDepWi() {
		return bs_StyDepWi;
	}
	public void setBs_StyDepWi(Integer bs_StyDepWi) {
		this.bs_StyDepWi = bs_StyDepWi;
	}
	
	public Integer getBs_DuRsvPriId() {
		return bs_DuRsvPriId;
	}
	public void setBs_DuRsvPriId(Integer bs_DuRsvPriId) {
		this.bs_DuRsvPriId = bs_DuRsvPriId;
	}
	
	public Integer getBs_DuRsvPriGr() {
		return bs_DuRsvPriGr;
	}
	public void setBs_DuRsvPriGr(Integer bs_DuRsvPriGr) {
		this.bs_DuRsvPriGr = bs_DuRsvPriGr;
	}
	
	public Integer getBs_DuDepId() {
		return bs_DuDepId;
	}
	public void setBs_DuDepId(Integer bs_DuDepId) {
		this.bs_DuDepId = bs_DuDepId;
	}
	
	public Integer getBs_DuDepGr() {
		return bs_DuDepGr;
	}
	public void setBs_DuDepGr(Integer bs_DuDepGr) {
		this.bs_DuDepGr = bs_DuDepGr;
	}
	
	public Integer getBs_DuOutId() {
		return bs_DuOutId;
	}
	public void setBs_DuOutId(Integer bs_DuOutId) {
		this.bs_DuOutId = bs_DuOutId;
	}
	
	public Integer getBs_DuOutGr() {
		return bs_DuOutGr;
	}
	public void setBs_DuOutGr(Integer bs_DuOutGr) {
		this.bs_DuOutGr = bs_DuOutGr;
	}
	
	public Integer getBs_CrRsvPriId() {
		return bs_CrRsvPriId;
	}
	
	public Integer getBs_CrRsvPriGr() {
		return bs_CrRsvPriGr;
	}
	
	public Integer getBs_CrDepId() {
		return bs_CrDepId;
	}
	
	public Integer getBs_CrDepGr() {
		return bs_CrDepGr;
	}
	
	public Integer getBs_CrOutId() {
		return bs_CrOutId;
	}
	
	public Integer getBs_CrOutGr() {
		return bs_CrOutGr;
	}
	public void setBs_CrRsvPriId(Integer bs_CrRsvPriId) {
		this.bs_CrRsvPriId = bs_CrRsvPriId;
	}
	public void setBs_CrRsvPriGr(Integer bs_CrRsvPriGr) {
		this.bs_CrRsvPriGr = bs_CrRsvPriGr;
	}
	public void setBs_CrDepId(Integer bs_CrDepId) {
		this.bs_CrDepId = bs_CrDepId;
	}
	public void setBs_CrDepGr(Integer bs_CrDepGr) {
		this.bs_CrDepGr = bs_CrDepGr;
	}
	public void setBs_CrOutId(Integer bs_CrOutId) {
		this.bs_CrOutId = bs_CrOutId;
	}
	public void setBs_CrOutGr(Integer bs_CrOutGr) {
		this.bs_CrOutGr = bs_CrOutGr;
	}
	
	public Integer getBs_VacIp() {
		return bs_VacIp;
	}
	public void setBs_VacIp(Integer bs_VacIp) {
		this.bs_VacIp = bs_VacIp;
	}
	
	public Integer getBs_OccIp() {
		return bs_OccIp;
	}
	public void setBs_OccIp(Integer bs_OccIp) {
		this.bs_OccIp = bs_OccIp;
	}
	
	public Integer getBs_VacCL() {
		return bs_VacCL;
	}
	public void setBs_VacCL(Integer bs_VacCL) {
		this.bs_VacCL = bs_VacCL;
	}
	
	public Integer getBs_OccCL() {
		return bs_OccCL;
	}
	public void setBs_OccCL(Integer bs_OccCL) {
		this.bs_OccCL = bs_OccCL;
	}
	
	public Integer getBs_VacDt() {
		return bs_VacDt;
	}
	public void setBs_VacDt(Integer bs_VacDt) {
		this.bs_VacDt = bs_VacDt;
	}
	
	public Integer getBs_OccDt() {
		return bs_OccDt;
	}
	public void setBs_OccDt(Integer bs_OccDt) {
		this.bs_OccDt = bs_OccDt;
	}
	
	public Integer getBs_InHsDepId() {
		return bs_InHsDepId;
	}
	public void setBs_InHsDepId(Integer bs_InHsDepId) {
		this.bs_InHsDepId = bs_InHsDepId;
	}
	
	public Integer getBs_InHsDepGr() {
		return bs_InHsDepGr;
	}
	public void setBs_InHsDepGr(Integer bs_InHsDepGr) {
		this.bs_InHsDepGr = bs_InHsDepGr;
	}
	public RoomAvaRes() {
		super();
	}
	
	public RoomAvaRes(Map<String, Object> map) {
		super();
		setRoomtypId(NumberUtil.toInt(map.get("roomtyp_id"), null));//房型
		setRoomtypCd(MapUtils.getString(map, "roomtyp_cd"));//房型
		setRoomtypNm(MapUtils.getString(map, "roomtyp_nm"));//房型
		setSeq(NumberUtil.toInt(map.get("seq"), null));//房型
		setYymd(DateUtil.toDate(map.get("yymd"), null));
		setAllRoomCnt(NumberUtil.toInt(map.get("cnt"), null));//房型房数
		setBs_Ooo(NumberUtil.toInt(map.get("bs_ooo"), null)); //OOO
		setBs_Oos(NumberUtil.toInt(map.get("bs_oos"), null)); //OOS
		setBs_OverBk(NumberUtil.toInt(map.get("bs_overbk"), null));//超定数
		setBs_Tempid(NumberUtil.toInt(map.get("bs_tempid"), null));//临时预订散客
		setBs_TempGr(NumberUtil.toInt(map.get("bs_tempgr"), null));//临时预订团队
		setBs_EarlyIn(NumberUtil.toInt(map.get("bs_earlyin"), null));//早入住
		setBs_LateOut(NumberUtil.toInt(map.get("bs_lateout"), null));//晚离店
		setBs_EpArrRsvId(NumberUtil.toInt(map.get("bs_eparrrsvid"), null));//预抵无房号散客
		setBs_EpArrPriId(NumberUtil.toInt(map.get("bs_eparrpriid"), null));//预抵有房号散客
		setBs_EpArrRsvGr(NumberUtil.toInt(map.get("bs_eparrrsvgr"), null));//预抵无房号团队
		setBs_EpArrPriGr(NumberUtil.toInt(map.get("bs_eparrprigr"), null));//预抵有房号团队
		setBs_ArrId(NumberUtil.toInt(map.get("bs_arrid"), null));//预订已到散客
		setBs_ArrGr(NumberUtil.toInt(map.get("bs_arrgr"), null));//预订已到团队
		setBs_StayOverId(NumberUtil.toInt(map.get("bs_stayoverid"), null));//STAYOVER散客
		setBs_StayOverGr(NumberUtil.toInt(map.get("bs_stayovergr"), null));//STAYOVER团队
		
		setBs_StayOverId_Arr(NumberUtil.toInt(map.get("bs_stayoverid_arr"), null));//STAYOVER散客 arr
		setBs_StayOverGr_Arr(NumberUtil.toInt(map.get("bs_stayovergr_arr"), null));//STAYOVER团队 arr
		
		setBs_DepartureId(NumberUtil.toInt(map.get("bs_departureid"), null));//预离散客
		setBs_DepartureGr(NumberUtil.toInt(map.get("bs_departuregr"), null));//预离团队
		setBs_OutId(NumberUtil.toInt(map.get("bs_outid"), null));//已结散客
		setBs_OutGr(NumberUtil.toInt(map.get("bs_outgr"), null));//已结团队
		setBs_StyDepId(NumberUtil.toInt(map.get("bs_stydepid"), null));//在店散客
		setBs_StyDepGr(NumberUtil.toInt(map.get("bs_stydepgr"), null));//在店团队
		setBs_StyDepWi(NumberUtil.toInt(map.get("bs_stydepwi"), null));//Walkin在店（酒店日期当天）
		
		setBs_DuRsvPriId(NumberUtil.toInt(map.get("bs_dursvpriid"), null));//DAYUSE散客预订
		setBs_DuRsvPriGr(NumberUtil.toInt(map.get("bs_dursvprigr"), null));//DAYUSE团队预订
		setBs_DuDepId(NumberUtil.toInt(map.get("bs_dudepid"), null));//预离DAYUSE散客
		setBs_DuDepGr(NumberUtil.toInt(map.get("bs_dudepgr"), null));//预离DAYUSE团队
		setBs_DuOutId(NumberUtil.toInt(map.get("bs_duoutid"), null));//已结DAYUSE散客
		setBs_DuOutGr(NumberUtil.toInt(map.get("bs_duoutgr"), null));//已结DAYUSE团队
		
		setBs_CrRsvPriId(MapUtils.getInteger(map, "bs_crrsvpriid")); // 钟点房预定散客
		setBs_CrRsvPriGr(MapUtils.getInteger(map, "bs_crrsvprigr"));//钟点房预定团队
		setBs_CrDepId(MapUtils.getInteger(map, "bs_crdepid"));//预离钟点房散客
		setBs_CrDepGr(MapUtils.getInteger(map, "bs_crdepgr"));//预离钟点房团队
		setBs_CrOutId(MapUtils.getInteger(map, "bs_croutid"));//已结钟点房散客
		setBs_CrOutGr(MapUtils.getInteger(map, "bs_croutgr"));//已结钟点房团队
		
		setBs_VacIp(NumberUtil.toInt(map.get("bs_vacip"), null));//已查空房
		setBs_OccIp(NumberUtil.toInt(map.get("bs_occip"), null));//已查占用
		setBs_VacCL(NumberUtil.toInt(map.get("bs_vaccl"), null));//干净空房
		setBs_OccCL(NumberUtil.toInt(map.get("bs_occcl"), null));//干净占用
		setBs_VacDt(NumberUtil.toInt(map.get("bs_vacdt"), null));//脏房空
		setBs_OccDt(NumberUtil.toInt(map.get("bs_occdt"), null));//脏房占用
		setBs_InHsDepId(NumberUtil.toInt(map.get("bs_inhsdepid"), null));//在店预离散客房数
		setBs_InHsDepGr(NumberUtil.toInt(map.get("bs_inhsdepgr"), null));//在店预离团队房数
	}
	
	
	@DrptField(fieldnm="avaRoomCnt",fielddrpt="可用房")
	private Integer avaRoomCnt;
	/*
	 * 可用房
	 * 物理房数-过夜房数-OOO-OOS - 早入住 - 晚离店
	 */
	public Integer getAvaRoomCnt() {
		return firstNonNull(allRoomCnt, 0)  //房间数
				- firstNonNull(getSv5_Overnight(), 0) //
				- firstNonNull(bs_Ooo, 0) //ooo
				- firstNonNull(bs_Oos, 0) //oos
				- firstNonNull(getSv1_Departure(), 0);
	
	}
	/*
	 * 物理房数
	 * 1.物理房数													
		2.(物理房数-OOO) 													
		3.(物理房数-OOO-OOS) 										
	 */
	public Integer getRoomCnt(){
		Integer allRoomCnt_tmp = firstNonNull(allRoomCnt, 0) ;
		if(optsOcc == 1){
			
		}
		if(optsOcc == 2){
			allRoomCnt_tmp -= firstNonNull(bs_Ooo, 0) ;
		}
		if(optsOcc == 3){
			allRoomCnt_tmp -= firstNonNull(bs_Oos, 0) ;
		}
		return allRoomCnt_tmp;
	}
	@DrptField(fieldnm="expectOcc",fielddrpt="预计出租率")
	private BigDecimal expectOcc;
	/**
	 预计出租率
	 */
	public BigDecimal getExpectOcc() {
		Integer  tmp = getRoomCnt();
		if(tmp ==0){
			return BigDecimal.ZERO;
		}
		//Integer stayover = Utils.firstNonNull(bs_StayOverId, 0)  + Utils.firstNonNull(bs_StayOverGr, 0); //过夜
		return CalcUtil.toDecimal(CalcUtil.div(Double.valueOf(getSv5_Overnight()), Double.valueOf(tmp), BigDecimal.ROUND_HALF_UP,4));
	}
	
	@DrptField(fieldnm="currOcc",fielddrpt="当前出租率")
	private BigDecimal currOcc;
	/**
	 当前出租率
	 */
	public BigDecimal getCurrOcc() {
		Integer  tmp = getRoomCnt();
		if(tmp ==0){
			return BigDecimal.ZERO;
		}
		
	/*	Integer stayover = Utils.firstNonNull(bs_StayOverId, 0)  + Utils.firstNonNull(bs_StayOverGr, 0) //过夜
											+ Utils.firstNonNull(bs_DuDepId, 0)  + Utils.firstNonNull(bs_DuDepGr, 0) //在店dayous
											+ Utils.firstNonNull(bs_DepartureId, 0)  + Utils.firstNonNull(bs_DepartureGr, 0) //预离
											
											- Utils.firstNonNull(bs_DuDepId, 0) - Utils.firstNonNull(bs_DuDepGr, 0)
											//+ Utils.firstNonNull(bs_LateOut, 0) 
											- Utils.firstNonNull(bs_EpArrRsvId, 0) - Utils.firstNonNull(bs_EpArrRsvGr, 0)// 预抵无房号
											- Utils.firstNonNull(bs_EpArrPriId, 0) - Utils.firstNonNull(bs_EpArrPriGr, 0);//预抵有房号
*/		if(tmp == 0){
			return BigDecimal.ZERO;
		}
		return CalcUtil.toDecimal(CalcUtil.div(Double.valueOf(getSv1_StyDep()), Double.valueOf(tmp),BigDecimal.ROUND_HALF_UP, 4));
	}
	/*
	 * 可用房开关
	 */
	private Integer optsOcc = 1;
/*	public Integer getOptsOcc() {
		return optsOcc;
	}*/
	public void setOptsOcc(Integer optsOcc) {
		this.optsOcc = optsOcc;
	}
	
	private Integer bs_StayOverId_Arr;
	private Integer bs_StayOverGr_Arr;
	public void setBs_StayOverId_Arr(Integer bs_StayOverId_Arr) {
		this.bs_StayOverId_Arr = bs_StayOverId_Arr;
	}
	public void setBs_StayOverGr_Arr(Integer bs_StayOverGr_Arr) {
		this.bs_StayOverGr_Arr = bs_StayOverGr_Arr;
	}
	
	@Override
	public String toString() {
		return "RoomAvaRes [roomtypId=" + roomtypId + ", roomtypCd=" + roomtypCd + ", roomtypNm=" + roomtypNm + ", seq="
				+ seq + ", yymd=" + yymd + ", allRoomCnt=" + allRoomCnt + ", bs_Ooo=" + bs_Ooo + ", bs_Oos=" + bs_Oos
				+ ", bs_OverBk=" + bs_OverBk + ", bs_Tempid=" + bs_Tempid + ", bs_TempGr=" + bs_TempGr + ", bs_EarlyIn="
				+ bs_EarlyIn + ", bs_LateOut=" + bs_LateOut + ", bs_EpArrRsvId=" + bs_EpArrRsvId + ", bs_EpArrPriId="
				+ bs_EpArrPriId + ", bs_EpArrRsvGr=" + bs_EpArrRsvGr + ", bs_EpArrPriGr=" + bs_EpArrPriGr
				+ ", bs_ArrId=" + bs_ArrId + ", bs_ArrGr=" + bs_ArrGr + ", bs_StayOverId=" + bs_StayOverId
				+ ", bs_StayOverGr=" + bs_StayOverGr + ", bs_DepartureId=" + bs_DepartureId + ", bs_DepartureGr="
				+ bs_DepartureGr + ", bs_OutId=" + bs_OutId + ", bs_OutGr=" + bs_OutGr + ", bs_StyDepId=" + bs_StyDepId
				+ ", bs_StyDepGr=" + bs_StyDepGr + ", bs_StyDepWi=" + bs_StyDepWi + ", bs_DuRsvPriId=" + bs_DuRsvPriId
				+ ", bs_DuRsvPriGr=" + bs_DuRsvPriGr + ", bs_DuDepId=" + bs_DuDepId + ", bs_DuDepGr=" + bs_DuDepGr
				+ ", bs_DuOutId=" + bs_DuOutId + ", bs_DuOutGr=" + bs_DuOutGr + ", bs_VacIp=" + bs_VacIp + ", bs_OccIp="
				+ bs_OccIp + ", bs_VacCL=" + bs_VacCL + ", bs_OccCL=" + bs_OccCL + ", bs_VacDt=" + bs_VacDt
				+ ", bs_OccDt=" + bs_OccDt + ", bs_InHsDepId=" + bs_InHsDepId + ", bs_InHsDepGr=" + bs_InHsDepGr
				+ ", avaRoomCnt=" + avaRoomCnt + ", expectOcc=" + expectOcc + ", currOcc=" + currOcc + ", optsOcc="
				+ optsOcc + ", bs_StayOverId_Arr=" + bs_StayOverId_Arr + ", bs_StayOverGr_Arr=" + bs_StayOverGr_Arr
				+ "]";
	}

	/** 
	 在库房	=	建筑－OOI(暂无)
	 **/
	public Integer getSv1_InvRm() {
		return firstNonNull(allRoomCnt, 0);
	}
	/** 
	可卖房	Sv5_AvlbRm	Inventory rooms(在库房)－OOO-过夜
	 **/
	public Integer getSv5_AvlbRm() {
		return getSv1_InvRm() - firstNonNull(bs_Ooo, 0) - getSv5_Overnight();
	}
	/** 
	最大可卖房	Sv6_MaxAvlbRm	Available rooms(可卖房)＋OVER(超定数)
	 **/
	public Integer getSv6_MaxAvlbRm() {
		return getSv5_AvlbRm() +  firstNonNull(bs_OverBk, 0);
	}
	/** 
	临时预订	Sv1_Temp	临时散客＋临时团队
	 **/
	public Integer getSv1_Temp() {
		return firstNonNull(bs_Tempid, 0) + firstNonNull(bs_TempGr, 0);
	}
	/** 
	最小可卖房	Sv7_MinAvlbRm	最大可卖房－临时预订－早入住－晚离店
	 **/
	public Integer getSv7_MinAvlbRm() {
		return getSv6_MaxAvlbRm() - getSv1_Temp() - firstNonNull(bs_EarlyIn, 0) - firstNonNull(bs_LateOut, 0);
	}
	/** 
	可用	Sv5_OnHand	建筑 - OOI - OOO - 过夜 - 早入住 - 晚离 + 超定数
	 **/
	public Integer getSv5_OnHand() {
		return firstNonNull(allRoomCnt, 0) 
				- firstNonNull(bs_Ooi, 0) 
				- firstNonNull(bs_Ooo, 0)
				- getSv5_Overnight()
				- firstNonNull(bs_EarlyIn, 0) 
				- firstNonNull(bs_LateOut, 0) 
				+ firstNonNull(bs_OverBk, 0);
	}
	/** 
	占用	Sv6_Occupied	OOI＋OOO＋过夜＋早入住＋晚离店
	 **/
	public Integer getSv6_Occupied() {
		return  firstNonNull(bs_Ooi, 0)
				+ firstNonNull(bs_Ooo, 0)
				+ getSv5_Overnight() 
				+ firstNonNull(bs_EarlyIn, 0) 
				+ firstNonNull(bs_LateOut, 0) ;
	}
	/** 
	SOLD 出售	Sv6_Sold	过夜＋DAYUSE 
	 **/
	public Integer getSv6_Sold() {
		return getSv5_Overnight() + getSv2_Du();
	}
	/** 
	过夜	Sv5_Overnight 过夜散客＋过夜团队
	 **/
	public Integer getSv5_Overnight() {
		return getSv4_OvernightId() + getSv4_OvernightGr();
	}
	/** 
	过夜散客	Sv4_OvernightId	来店散客＋STAYOVER散客－预离散客 - 已结散客
	 **/
	public Integer getSv4_OvernightId() {
		return getSv2_ArrId() + firstNonNull(bs_StayOverId, 0) - firstNonNull(bs_DepartureId, 0) - firstNonNull(bs_OutId, 0);
	}
	/** 
	过夜团队	Sv4_OvernightGr	来店团队＋STAYOVER团队－预离团队 - 已结团队
	 **/
	public Integer getSv4_OvernightGr() {
		return getSv2_ArrGr() + firstNonNull(bs_StayOverGr, 0) - firstNonNull(bs_DepartureGr, 0) - firstNonNull(bs_OutGr, 0);
	}
	/** 
	来店	Sv3_Arr	来店散客＋来店团队
	 **/
	public Integer getSv3_Arr() {
		return getSv2_ArrId() + getSv2_ArrGr();
	}
	/** 
	来店散客	Sv2_ArrId	预抵未抵散客＋预订已到散客（含Walkin）
	 **/
	public Integer getSv2_ArrId() {
		return getSv1_EpArrId() + firstNonNull(bs_ArrId, 0);
	}
	/** 
	来店团队	Sv2_ArrGr	预抵未抵团队＋预订已到团队（含Walkin）
	 **/
	public Integer getSv2_ArrGr() {
		return getSv1_EpArrGr() + firstNonNull(bs_ArrGr, 0);
	}
	/** 
	预抵未抵	Sv2_EpArr	预抵未抵散客＋预抵未抵团队
	 **/
	public Integer getSv2_EpArr() {
		return getSv1_EpArrId() + getSv1_EpArrGr();
	}
	/** 
	  预抵未抵散客	Sv1_EpArrId	预抵未抵无房号散客＋预抵未抵有房号散客
	 **/
	public Integer getSv1_EpArrId() {
		return firstNonNull(bs_EpArrRsvId, 0) + firstNonNull(bs_EpArrPriId, 0);
	}
	/** 
	预抵未抵团队	Sv1_EpArrGr	预抵未抵无房号团队＋预抵未抵有房号团队
	 **/
	public Integer getSv1_EpArrGr() {
		return firstNonNull(bs_EpArrRsvGr, 0) + firstNonNull(bs_EpArrPriGr, 0);
	}
	/** 
	预订已到（含Wi）	Sv1_Arr	预订已到散客＋预订已到团队
	 **/
	public Integer getSv1_Arr() {
		return firstNonNull(bs_ArrId, 0) + firstNonNull(bs_ArrGr, 0);
	}
	/** 
	STAYOVER	Sv1_StayOver	STAYOVER散客＋STAYOVER团队
	 **/
	public Integer getSv1_StayOver() {
		return firstNonNull(bs_StayOverId, 0) + firstNonNull(bs_StayOverGr, 0);
	}
	/** 
	离店	Sv2_DepOut	预离未离＋已结
	 **/
	public Integer getSv2_DepOut() {
		return getSv1_Departure() + getSv1_Out();
	}
	/** 
	预离	Sv1_Departure	预离未离散客＋预离未离团队
	 **/
	public Integer getSv1_Departure() {
		return firstNonNull(bs_DepartureId, 0) + firstNonNull(bs_DepartureGr, 0);
	}
	/** 
	已结	Sv1_Out	已结散客＋已结团队
	 **/
	public Integer getSv1_Out() {
		return firstNonNull(bs_OutId, 0) + firstNonNull(bs_OutGr, 0);
	}
	/** 
	在店	Sv1_StyDep	在店散客＋在店团队
	 **/
	public Integer getSv1_StyDep() {
		return firstNonNull(bs_StyDepId, 0) + firstNonNull(bs_StyDepGr, 0);
	}
	/** 
	当日预排房预订	Sv1_EpArrPri	预抵未抵有房号散客＋预抵未抵有房号团队
	 **/
	public Integer getSv1_EpArrPri() {
		return firstNonNull(bs_EpArrPriId, 0) + firstNonNull(bs_EpArrPriGr, 0);
	}
	/** 
	当日来店的过夜	Sv3_ArrOvernight	预订未抵＋预订已到－DAYUSE预订－预离未离DAYUSE - 已结DayUse
	 **/
	public Integer getSv3_ArrOvernight() {
		return getSv2_EpArr() + getSv1_Arr() - getSv2_Du() ;
	}
	/** 
	DAYUSE总	Sv2_Du	DAYUSE预订＋预离未离DAYUSE＋已结DAYUSE
	 **/
	public Integer getSv2_Du() {
		return getSv1_DuRsvPri() + getSv1_DuDep() + getSv1_DuOut();
	}
	/** 
	DAYUSE占用	Sv2_DuOcc	DAYUSE预订＋预离未离DAYUSE
	 **/
	public Integer getSv2_DuOcc() {
		return getSv1_DuRsvPri() + getSv1_DuDep();
	}
	/** 
	DAYUSE预订	Sv1_DuRsvPri	DAYUSE散客预订＋DAYUSE团队预订
	 **/
	public Integer getSv1_DuRsvPri() {
		return firstNonNull(bs_DuRsvPriId, 0) + firstNonNull(bs_DuRsvPriGr, 0);
	}
	/** 
	预离未离DAYUSE	Sv1_DuDep	预离未离DAYUSE散客+预离未离DAYUSE团队
	 **/
	public Integer getSv1_DuDep() {
		return firstNonNull(bs_DuDepId, 0) + firstNonNull(bs_DuDepGr, 0);
	}
	/** 
	已结DAYUSE	Sv1_DuOut	已结DAYUSE散客+已结DAYUSE团队
	 **/
	public Integer getSv1_DuOut() {
		return firstNonNull(bs_DuOutId, 0) + firstNonNull(bs_DuOutGr, 0);
	}
	/** 
	已查	Sv1_Ip	已查空房＋已查占用
	 **/
	public Integer getSv1_Ip() {
		return firstNonNull(bs_VacIp, 0) + firstNonNull(bs_OccIp, 0);
	}
	/** 
	干净	Sv1_Cl	干净空房＋干净占用
	 **/
	public Integer getSv1_Cl() {
		return firstNonNull(bs_VacCL, 0) + firstNonNull(bs_OccCL, 0);
	}
	/** 
	脏	Sv1_Dt	脏房空＋脏房占用
	 **/
	public Integer getSv1_Dt() {
		return firstNonNull(bs_VacDt, 0) + firstNonNull(bs_OccDt, 0);
	}
	/** 
	BLOCD可用	Sv3_BlkOnHand	SUM(BLOCK_INFO[].可用)
	 **/
	public Integer getSv3_BlkOnHand() {
		return null;
	}
	/** 
	BLOCD已卖数	Sv2_BlkSold	SUM(BLOCK_INFO[].已卖)
	 **/
	public Integer getSv2_BlkSold() {
		return null;
	}
	/** 
	BLOCD契约数	Sv2_BlkSet	SUM(BLOCK_INFO[].契约)
	 **/
	public Integer getSv2_BlkSet() {
		return null;
	}
	/** 
	在店预离房数	Sv1_InHsDep	在店预离散客房数＋在店预离团队房数
	 **/
	public Integer getSv1_InHsDep() {
		return firstNonNull(bs_InHsDepId, 0) + firstNonNull(bs_InHsDepGr, 0);
	}

}
