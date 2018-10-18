/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3220.f010.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;

import com.jw.base.framework.core.Constant3290010.ENUM_STAT_TYP;
import com.jw.base.framework.core.util.BeanUtil;
import com.jw.base.framework.core.util.DateUtil;
import com.jw.base.framework.core.util.NumberUtil;

public class IndexConvert implements Serializable {
	
	 /** @Fields serialVersionUID **/
	private static final long serialVersionUID = -7622595647372754378L;
	/** 
	 * ## 方法说明：
	 * 	数据传输验证 
	 * @param first
	 * @param second
	 * @return
	*/
	public static <T> T firstNonNull(T first, T second) {
	    return first != null ? first : second;
	}
	
	/**
	 * ## 方法说明：
	 * 	统一转换数据
	 * @param inMap
	 * @return
	 * @throws Exception
	 */
	public static Map<String, Object> convertMap(Map<String, RoomAvaRes> inMap)throws Exception{
		Map<String, Object> resultMap = new HashMap<>();
		{
			//全部房数
			RoomAvaRes avaRes = inMap.get(ENUM_STAT_TYP.ALLR.getValue());
			if(!BeanUtil.isEmpty(avaRes)){
				resultMap.put("businessDt", avaRes.getYymd());
				//空净
				resultMap.put("vaccl", firstNonNull(avaRes.getBs_VacCL(), 0));
				//空脏
				resultMap.put("vacdt", firstNonNull(avaRes.getBs_VacDt(), 0));
				//空待查
				resultMap.put("vacip", firstNonNull(avaRes.getBs_VacIp(), 0));
				//住净
				resultMap.put("occcl", firstNonNull(avaRes.getBs_OccCL(), 0));
				//住脏
				resultMap.put("occdt", firstNonNull(avaRes.getBs_OccDt(), 0));
				//住待查
				resultMap.put("occip", firstNonNull(avaRes.getBs_OccIp(), 0));
				//关闭
				resultMap.put("ooo", firstNonNull(avaRes.getBs_Ooo(), 0));
				//维修
				resultMap.put("oos", firstNonNull(avaRes.getBs_Oos(), 0));
				//停用
				resultMap.put("ooi", 0);
				//临时锁房
				resultMap.put("nba", 0);
				//总房数
				resultMap.put("housingqty", firstNonNull(avaRes.getAllRoomCnt(), 0));
				avaRes.setOptsOcc(1);
				//预计出租率
				resultMap.put("expectOcc",NumberUtil.toBigDecimal(avaRes.getExpectOcc(), BigDecimal.ZERO));
				//当前出租率
				resultMap.put("currOcc",NumberUtil.toBigDecimal(avaRes.getCurrOcc(), BigDecimal.ZERO));
				//已售房数
				resultMap.put("saleRoomCnt", avaRes.getSv5_Overnight());//getSv1_StyDep
				//预计在店数
				resultMap.put("rsvSty", avaRes.getSv5_Overnight());
				//今日预离
				resultMap.put("etdData", avaRes.getSv1_Departure());
				//今日离店 
				resultMap.put("dayOutData", avaRes.getSv2_DepOut());
				//今日已离
				resultMap.put("outData", avaRes.getSv1_Out());
				//今日预抵
				resultMap.put("etaData", avaRes.getSv2_EpArr());
				//今日入住=预订已到散客 +预订已到团队+已结DAYUSE散客+已结DAYUSE团队
				resultMap.put("dayStyData", avaRes.getSv1_Arr());
				//在住=在店散客  + 在店团队
				resultMap.put("styData", avaRes.getSv1_StyDep());
				//散客入住=在店散客 
				resultMap.put("wiData", firstNonNull(avaRes.getBs_StyDepWi(), 0));
				//DayUse = Dayuse预离散客 +Dayuse预离团队 
				resultMap.put("duData", avaRes.getSv2_Du());
				//昨日过夜
				resultMap.put("yestNight", avaRes.getSv1_StayOver());
				//当前在店
				resultMap.put("sv1_stydep", avaRes.getSv1_StyDep());
				//当前在店
				resultMap.put("sv1_stydep_cnt", avaRes.getSv1_StyDep());
			}
		}
		{
			//全部人数
			RoomAvaRes avaRes = inMap.get(ENUM_STAT_TYP.ALLP.getValue());
			if(!BeanUtil.isEmpty(avaRes)){
				resultMap.put("styDdultCnt", avaRes.getSv5_Overnight());
				//今日预离
				resultMap.put("etdDataCnt", avaRes.getSv1_Departure());
				//今日离店 
				resultMap.put("dayOutDataCnt", avaRes.getSv2_DepOut());
				//今日已离
				resultMap.put("outDataCnt", avaRes.getSv1_Out());
				//今日预抵
				resultMap.put("etaDataCnt", avaRes.getSv2_EpArr());
				//今日入住=预订已到散客 +预订已到团队+已结DAYUSE散客+已结DAYUSE团队
				resultMap.put("dayStyDataCnt", avaRes.getSv1_Arr());
				//在住=在店散客  + 在店团队
				resultMap.put("styDataCnt", avaRes.getSv1_StyDep());
				//散客入住=在店散客 
				resultMap.put("wiDataCnt", firstNonNull(avaRes.getBs_StyDepWi(), 0));
				//DayUse = Dayuse预离散客 +Dayuse预离团队 
				resultMap.put("duDataCnt", avaRes.getSv2_Du());
				//已售人数
				resultMap.put("saleAutlCnt", avaRes.getSv5_Overnight());
				//昨日过夜人数
				resultMap.put("yestNightCnt", avaRes.getSv1_StayOver());
			}
		}
		{
			//钟点房数
			RoomAvaRes avaRes = inMap.get(ENUM_STAT_TYP.CLKR.getValue());
			if(!BeanUtil.isEmpty(avaRes)){
				resultMap.put("cpRoomQuant", avaRes.getSv2_Du());
			}
		}
		{
			//钟点人数
			RoomAvaRes avaRes = inMap.get(ENUM_STAT_TYP.CLKP.getValue());
			if(!BeanUtil.isEmpty(avaRes)){
				resultMap.put("cpDdultCnt",  avaRes.getSv2_Du());
			}
		}
		{
			//VIP人数
			RoomAvaRes avaRes = inMap.get(ENUM_STAT_TYP.VIPP.getValue());
			if(!BeanUtil.isEmpty(avaRes)){
				resultMap.put("vipDdultCnt",  avaRes.getSv3_Arr());
			}
		}
		return resultMap;
	}
	
	
	
	/**
	 * ## 方法说明：
	 * 	组装统计信息
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public static RoomAvaRes statDayMap(Map<String, Object> paramMap) throws Exception {
		if (MapUtils.isEmpty(paramMap)) {
			paramMap = new HashMap<>();
		}
		StatRoomAvaRes avaRes = new StatRoomAvaRes();
		avaRes.setYymd(DateUtil.parse(MapUtils.getString(paramMap, "business_dt"), DateUtil.DATE_FORMAT));
		avaRes.setBs_VacCL(MapUtils.getInteger(paramMap, "vaccl",0));//空净
		avaRes.setBs_VacDt(MapUtils.getInteger(paramMap, "vacdt",0));//空脏
		avaRes.setBs_VacIp(MapUtils.getInteger(paramMap, "vacip",0));//空待查
		avaRes.setBs_OccCL(MapUtils.getInteger(paramMap, "occcl",0));//住净
		avaRes.setBs_OccDt(MapUtils.getInteger(paramMap, "occdt",0));//住脏
		avaRes.setBs_OccIp(MapUtils.getInteger(paramMap, "occip",0));//住待查
		avaRes.setBs_Oos(MapUtils.getInteger(paramMap, "oos",0));//维修
		avaRes.setBs_Ooo(MapUtils.getInteger(paramMap, "ooo",0));//占用
		avaRes.setAllRoomCnt(MapUtils.getInteger(paramMap, "housingqty",0));//总房数
		avaRes.setBs_Tempid(MapUtils.getInteger(paramMap, "tempid",0));//临时散客
		avaRes.setBs_TempGr(MapUtils.getInteger(paramMap, "tempgr",0));//临时团队
		avaRes.setBs_EarlyIn(MapUtils.getInteger(paramMap, "earlyin",0));//早入住
		avaRes.setBs_LateOut(MapUtils.getInteger(paramMap,"lateout",0));//晚离店
		avaRes.setBs_EpArrRsvId(MapUtils.getInteger(paramMap,"eparrrsvid",0));//预抵无房号散客
		avaRes.setBs_EpArrPriId(MapUtils.getInteger(paramMap,"eparrpriid",0));//预抵有房号散客
		avaRes.setBs_EpArrRsvGr(MapUtils.getInteger(paramMap,"eparrrsvgr",0));//预抵无房号团队
		avaRes.setBs_EpArrPriGr(MapUtils.getInteger(paramMap,"eparrprigr",0));//预抵有房号团队
		avaRes.setBs_ArrId(MapUtils.getInteger(paramMap,"arrid",0));//当日来店散客
		avaRes.setBs_ArrGr(MapUtils.getInteger(paramMap,"arrgr",0));//当日来店团队
		
		avaRes.setBs_StayOverId(MapUtils.getInteger(paramMap,"yest_stayoverid",0));//昨日过夜散客
		avaRes.setBs_StayOverGr(MapUtils.getInteger(paramMap,"yest_stayovergr",0));//昨日过夜团队
		
		avaRes.setBs_DepartureId(MapUtils.getInteger(paramMap,"departureid",0));//当日离店散客
		avaRes.setBs_DepartureGr(MapUtils.getInteger(paramMap,"departuregr",0));//当日离店团队
		
//		avaRes.setBs_OutId(MapUtils.getInteger(paramMap,"outid",0));//已结散客
//		avaRes.setBs_OutGr(MapUtils.getInteger(paramMap,"outgr",0));//已结团队
		avaRes.setBs_StyDepId(MapUtils.getInteger(paramMap,"stydepid",0));//在店散客
		avaRes.setBs_StyDepGr(MapUtils.getInteger(paramMap,"stydepgr",0));//在店团队
		avaRes.setBs_StyDepWi(MapUtils.getInteger(paramMap,"stydepwiid",0) + MapUtils.getInteger(paramMap,"stydepwigr",0));//在店walkin散客
//		avaRes.setBs_sdbid(MapUtils.getInteger(paramMap,"sdbid",0));//在店当日预订当日入住散客
//		avaRes.setBs_sdbgr(MapUtils.getInteger(paramMap,"sdbgr",0));//在店当日预订当日入住团队
		avaRes.setBs_DuRsvPriId(MapUtils.getInteger(paramMap,"dursvpriid",0));//Dayuse散客预订
		avaRes.setBs_DuRsvPriGr(MapUtils.getInteger(paramMap,"dursvprigr",0));//Dayuse团队预订
		avaRes.setBs_DuDepId(MapUtils.getInteger(paramMap,"dudepid",0));//Dayuse预离散客
		avaRes.setBs_DuDepGr(MapUtils.getInteger(paramMap,"dudepgr",0));//Dayuse预离团队
		avaRes.setBs_DuOutId(MapUtils.getInteger(paramMap,"duoutid",0));//Dayuse已离散客
		avaRes.setBs_DuOutGr(MapUtils.getInteger(paramMap,"duoutgr",0));//Dayuse已离团队
//		avaRes.setBs_dudepwiid(MapUtils.getInteger(paramMap,"dudepwiid",0));//Dayuse预离walkin散客
//		avaRes.setBs_dudepwigr(MapUtils.getInteger(paramMap,"dudepwigr",0));//Dayuse预离walkin团队
//		avaRes.setBs_duoutwiid(MapUtils.getInteger(paramMap,"duoutwiid",0));//Dayuse已离walkin散客
//		avaRes.setBs_duoutwigr(MapUtils.getInteger(paramMap,"duoutwigr",0));//Dayuse已离walkin团队
//		avaRes.setBs_dudepsdbid(MapUtils.getInteger(paramMap,"dudepsdbid",0));//Dayuse预离当日预订当日入住散客
//		avaRes.setBs_dudepsdbgr(MapUtils.getInteger(paramMap,"dudepsdbgr",0));//Dayuse预离当日预订当日入住团队
//		avaRes.setBs_duoutsdbid(MapUtils.getInteger(paramMap,"duoutsdbid",0));//Dayuse已离当日预订当日入住散客
//		avaRes.setBs_duoutsdbgr(MapUtils.getInteger(paramMap,"duoutsdbgr",0));//Dayuse已离当日预订当日入住团队
		avaRes.setBs_InHsDepId(MapUtils.getInteger(paramMap,"inhsdepid",0));//在店预离散客
		avaRes.setBs_InHsDepGr(MapUtils.getInteger(paramMap,"inhsdepgr",0));//在店预离团队
		return avaRes;
	}
	
}
