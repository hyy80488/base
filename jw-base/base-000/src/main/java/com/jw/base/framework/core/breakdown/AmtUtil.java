package com.jw.base.framework.core.breakdown;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jw.base.framework.core.ConstantRate;
import com.jw.base.framework.core.ConstantRate.ENUM_PSN_STD;
import com.jw.base.framework.core.ConstantRate.ENUM_RATE_STD;
import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.NumberUtil;

public class AmtUtil {
	
	
	public static BigDecimal rateByCalc(Integer adultCnt, Integer childCnt, Map<String, Object> mapRate) throws Exception {
		if (MapUtils.isNotEmpty(mapRate)) {
			//rate_std	房费价格基准	1：每房间；2：每人；3：每人（分儿童）；4：纯儿童
			String rateStd = MapUtils.getString(mapRate, "rate_std", "");
			//psn_std	房费人数基准	10：单一价格；20：五人价格；21：五人含儿童；22：五段儿童；30：多人价格；31：多人含儿童价；32：多儿童段
			String psn_std = MapUtils.getString(mapRate, "psn_std", "");
			//每人 只能五人价
			if(!ENUM_PSN_STD.FIVE.isEquals(psn_std)){
				if(ENUM_RATE_STD.ADULTCHILD.isEquals(rateStd)){
					throw new BusinessException(BsProcessErrorCode.ERROR_CODE_308066,"五人价格 房费价格只能设置每人","五人价格 房费价格只能设置每人",BsProcessErrorCode.ERROR_LEVEL_5);
				}
			}
			//3：每人（分儿童） 只能
			if(!ENUM_PSN_STD.FIVE_HASCHILD.isEquals(psn_std)){
				if(ENUM_RATE_STD.PERSON.isEquals(rateStd)){
					throw new BusinessException(BsProcessErrorCode.ERROR_CODE_308067,"五人含儿童 房费价格只能设置每人（分儿童）","五人含儿童 房费价格只能设置每人（分儿童）",BsProcessErrorCode.ERROR_LEVEL_5);
				}
			}
			TreeMap<Integer, BigDecimal> aryAdultAmt = getAmtMap(psn_std, mapRate, "adultdef_amt", "adult_amts");
			TreeMap<Integer, BigDecimal> aryChildAmt = getAmtMap(psn_std, mapRate, "childrendef_amt", "child_amts");
			return getRateAmt(rateStd, psn_std, adultCnt, childCnt, aryAdultAmt, aryChildAmt);
		}
		//return null;
		throw new BusinessException(BsProcessErrorCode.ERROR_CODE_308003,"指定价格不存在","指定价格不存在",BsProcessErrorCode.ERROR_LEVEL_5);
	}
	
	/** 
	 * ## 方法说明：
	 * 	获取人数对应的价格
	 * @param row
	 * @param defNm
	 * @param fieldNm
	 * @return
	*/
	private static TreeMap<Integer, BigDecimal> getAmtMap(String psn_std, Map<String, Object> row, String defNm, String fieldNm){
		TreeMap<Integer, BigDecimal> treeMap = new TreeMap<>();
		//默认价格
		treeMap.put(-999, NumberUtil.toBigDecimal(MapUtils.getObject(row, defNm), null));
		//非单一价格 取多人价格
		if(!ENUM_PSN_STD.ONLY.isEquals(psn_std)){
			String amt = MapUtils.getString(row, fieldNm);
			if(StringUtils.isNotBlank(amt)){
				List<Map<String, Object>> list = JSON.parseObject(amt, new TypeReference<List<Map<String, Object>>>(){});
				IterableUtils.forEach(list, m -> {
					Integer person_cnt = MapUtils.getInteger(m, "person_cnt");
					Double rate_set_amt = MapUtils.getDouble(m, "rate_set_amt");
					if(Objects.nonNull(person_cnt) && Objects.nonNull(rate_set_amt)){
						treeMap.put(person_cnt, new BigDecimal(rate_set_amt));
					}
				});
			}
		}
		return treeMap;
	}
	
	/** 
	 * ## 方法说明：
	 * 	设置价格
	 * @param rateStd 价格基准
	 * @param psn_std 人数基准
	 * @param adultCnt
	 * @param childCnt
	 * @param aryAdultAmt
	 * @param aryChildAmt
	 * @return
	*/
	private static BigDecimal getRateAmt(String rateStd, String psn_std, Integer adultCnt, Integer childCnt, TreeMap<Integer, BigDecimal> aryAdultAmt,
			TreeMap<Integer, BigDecimal> aryChildAmt) {
		BigDecimal amt = null;
		BigDecimal adultAmt = null;
		BigDecimal childAmt = null;
		//rate_std	房费价格基准	1：每房间；2：每人；3：每人（分儿童）；4：纯儿童
		//psn_std	房费人数基准	10：单一价格；20：五人价格；21：五人含儿童；22：五段儿童；30：多人价格；31：多人含儿童价；32：多儿童段
		if (ConstantRate.ENUM_RATE_STD.ROOM.getValue().equals(rateStd)) {
			// 每房间
			if(!ENUM_PSN_STD.FIVE_HASCHILD.isEquals(psn_std)){
				//每房间
				Integer personCnt = adultCnt + childCnt;
				if(NumberUtil.compare(0, personCnt) >= 0){
					amt = BigDecimal.ZERO;
				}else{
					amt = getRateAmtCore(personCnt, aryAdultAmt);
				}
			}else{
				//21：五人含儿童
				if(NumberUtil.compare(0, adultCnt) >= 0){
					adultAmt = BigDecimal.ZERO;
				}else{
					adultAmt = getRateAmtCore(adultCnt, aryAdultAmt);
				}
				if(NumberUtil.compare(0, childCnt) >= 0){
					childAmt = BigDecimal.ZERO;
				}else{
					childAmt = getRateAmtCore(childCnt, aryChildAmt);
				}
				amt = adultAmt.add(childAmt);
			}
		} else if (ConstantRate.ENUM_RATE_STD.ADULTCHILD.getValue().equals(rateStd)) {
			// 每人
/*			adultAmt = getRateAmtCore(adultCnt, aryAdultAmt);
			childAmt = getRateAmtCore(childCnt, aryChildAmt);
			amt = adultAmt.add(childAmt);*/
			Integer personCnt = adultCnt + childCnt;
			if(NumberUtil.compare(0, personCnt) >= 0){
				amt = BigDecimal.ZERO;
				personCnt = 0;
			}else{
				amt = getRateAmtCore(personCnt, aryAdultAmt);
			}
			amt = amt.multiply(new BigDecimal(personCnt));
		} else if (ConstantRate.ENUM_RATE_STD.PERSON.getValue().equals(rateStd)) {
			//3：每人（分儿童）
			/*Integer personCnt = adultCnt + childCnt;
			adultAmt = getRateAmtCore(personCnt, aryAdultAmt);
			adultAmt = adultAmt.multiply(new BigDecimal(adultCnt.intValue()));

			childAmt = getRateAmtCore(personCnt, aryChildAmt);
			childAmt = childAmt.multiply(new BigDecimal(childCnt.intValue()));*/
			if(NumberUtil.compare(0, adultCnt) >= 0){
				adultAmt = BigDecimal.ZERO;
			}else{
				adultAmt = getRateAmtCore(adultCnt, aryAdultAmt);
				adultAmt = adultAmt.multiply(new BigDecimal(adultCnt.intValue()));
			}
			if(NumberUtil.compare(0, childCnt) >= 0){
				childAmt = BigDecimal.ZERO;
			}else{
				childAmt = getRateAmtCore(childCnt, aryChildAmt);
				childAmt = childAmt.multiply(new BigDecimal(childCnt.intValue()));
			}
			amt = adultAmt.add(childAmt);
		} else if (ConstantRate.ENUM_RATE_STD.CHILD.getValue().equals(rateStd)) {
			// 纯儿童
			amt = null;
		}
		return amt;
	}
	
	/** 
	 * ## 方法说明：
	 * 	查询对应的人数价格
	 * @param personCnt
	 * @param aryAmt
	 * @return
	*/
	private static BigDecimal getRateAmtCore(Integer personCnt, TreeMap<Integer, BigDecimal> aryAmt) {
		BigDecimal amt = null;
		if(MapUtils.isNotEmpty(aryAmt)){
			Map.Entry<Integer, BigDecimal> entry =  aryAmt.floorEntry(personCnt);
			if(Objects.nonNull(entry)){
				amt = entry.getValue();
			}
		}
		if(Objects.isNull(amt)){
			amt = BigDecimal.ZERO;
		}
		return amt;
	}
	

	/** 
	 * ## 方法说明：
	* 	根据价格日历获取价格
	 * @param date 日期
	 * @param adultCnt 成人数
	 * @param childCnt 儿童数
	 * @param lsRtClndr 价格日历
	 * @return 
	 * @throws Exception 
	*/
/*	public static BigDecimal rateByCalc(Date date, Integer adultCnt, Integer childCnt, List<Map<String, Object>> lsRtClndr) throws Exception {
		Map<String, Object> mapRate = IterableUtils.find(lsRtClndr, m -> {
			Date nYymd = (Date) m.get("yymd");
			if (date.equals(nYymd)) {
				return true;
			}
			return false;
		});

		return rateByCalc(adultCnt, childCnt, mapRate);
	}*/
	/** 
	 * ## 方法说明：
	* 	根据每日价格信息获取价格
	 * @param date 日期
	 * @param adultCnt 成人数
	 * @param childCnt 儿童数
	 * @param mapRate 每日价格
	 * @return 
	 * @throws Exception 
	*/
	/*public static BigDecimal rateByCalc(Integer adultCnt, Integer childCnt, Map<String, Object> mapRate) throws Exception {

		if (MapUtils.isNotEmpty(mapRate)) {
			String rateStd = Objects.toString(mapRate.get("rate_std"), "");
			BigDecimal[] aryAdultAmt = setAryAdultAmt(mapRate);
			BigDecimal[] aryChildAmt = setAryChildAmt(mapRate);
			return getRateAmt(rateStd, adultCnt, childCnt, aryAdultAmt, aryChildAmt);
		}
		//return null;
		throw new BusinessException(BsProcessErrorCode.ERROR_CODE_308003,"指定价格不存在","指定价格不存在",BsProcessErrorCode.ERROR_LEVEL_5);
	}*/
	
	
	
	/** 
	 * ## 方法说明：
	* 	根据每日价格信息获取价格
	 * @param date 日期
	 * @param adultCnt 成人数
	 * @param childCnt 儿童数
	 * @param mapRate 每日价格
	 * @return 
	 * @throws Exception 
	*/
	/*public static List<BigDecimal> rateByCalc1(Integer adultCnt, Integer childCnt, Map<String, Object> mapRate, BigDecimal pkgAmtOrg, BigDecimal pkgAmtCur) throws Exception {

		if (MapUtils.isNotEmpty(mapRate)) {
			String rateStd = Objects.toString(mapRate.get("rate_std"), "");
			BigDecimal[] aryAdultAmt = setAryAdultAmt(mapRate);
			BigDecimal[] aryChildAmt = setAryChildAmt(mapRate);
			return getRateAmt(rateStd, adultCnt, childCnt, aryAdultAmt, aryChildAmt, pkgAmtOrg, pkgAmtCur);
		}
		//return null;
		throw new BusinessException(BsProcessErrorCode.ERROR_CODE_308003,"指定价格不存在","指定价格不存在",BsProcessErrorCode.ERROR_LEVEL_5);
	}*/
	
	/** 
	 * ## 方法说明：
	 * 	重新计算价格
	 * @param rateStd
	 * @param adultCnt
	 * @param childCnt
	 * @param rateAmt
	 * @param pkgAmtOrg
	 * @param pkgAmtCur
	 * @return
	 * @throws Exception
	*/
	/*public static List<BigDecimal> pkgByCalc(String rateStd, Integer adultCnt, Integer childCnt, BigDecimal pkgAmtOrg, BigDecimal pkgAmtCur) throws Exception {
		if(Objects.isNull(pkgAmtOrg)){
			pkgAmtOrg = BigDecimal.ZERO;
		}
		if(Objects.isNull(pkgAmtCur)){
			pkgAmtCur = BigDecimal.ZERO;
		}
		if(Objects.isNull(adultCnt)){
			adultCnt = 0;
		}
		if(Objects.isNull(childCnt)){
			childCnt = 0;
		}
		if(ConstantRate.ENUM_RATE_STD.PERSON.getValue().equals(rateStd)){
			// 每人
			Integer personCnt = adultCnt + childCnt;
			return Arrays.asList(pkgAmtOrg.multiply(new BigDecimal(personCnt.intValue())), 
					pkgAmtCur.multiply(new BigDecimal(personCnt.intValue())));
		}else{
			return Arrays.asList(pkgAmtOrg, pkgAmtCur);
		}

	}*/

	/**
	 * 
	 * ## 方法说明：
	 * 	获取指定人数的价格金额
	 * @param rateStd
	 * @param adultCnt
	 * @param childCnt
	 * @param aryAdultAmt
	 * @param aryChildAmt
	 * @return
	 */
	/*private static BigDecimal getRateAmt(String rateStd, Integer adultCnt, Integer childCnt, BigDecimal[] aryAdultAmt,
			BigDecimal[] aryChildAmt) {
		BigDecimal amt = null;
		BigDecimal adultAmt = null;
		BigDecimal childAmt = null;

		if (ConstantRate.ENUM_RATE_STD.ROOM.getValue().equals(rateStd)) {
			// 每房间
			Integer personCnt = adultCnt + childCnt;
			amt = getRateAmtCore(personCnt, aryAdultAmt);

		} else if (ConstantRate.ENUM_RATE_STD.ADULTCHILD.getValue().equals(rateStd)) {
			// 成人携儿童
			adultAmt = getRateAmtCore(adultCnt, aryAdultAmt);
			childAmt = getRateAmtCore(childCnt, aryChildAmt);
			amt = adultAmt.add(childAmt);

		} else if (ConstantRate.ENUM_RATE_STD.PERSON.getValue().equals(rateStd)) {
			// 每人
			Integer personCnt = adultCnt + childCnt;
			adultAmt = getRateAmtCore(personCnt, aryAdultAmt);
			adultAmt = adultAmt.multiply(new BigDecimal(adultCnt.intValue()));

			childAmt = getRateAmtCore(personCnt, aryChildAmt);
			childAmt = childAmt.multiply(new BigDecimal(childCnt.intValue()));

			amt = adultAmt.add(childAmt);

		} else if (ConstantRate.ENUM_RATE_STD.CHILD.getValue().equals(rateStd)) {
			// 纯儿童
			amt = null;
		}

		if (null != amt) {
			return CalcUtil.toDecimal(CalcUtil.round(amt.doubleValue(), ShareSession.getUnitDecimalRoundMode(), ShareSession.getUnitDecimalScale()));
		}
		return amt;
	}*/
	
	
	
	/**
	 * 
	 * ## 方法说明：
	 * 	获取指定人数的价格金额
	 * @param rateStd
	 * @param adultCnt
	 * @param childCnt
	 * @param aryAdultAmt
	 * @param aryChildAmt
	 * @return
	 */
	/*private static List<BigDecimal> getRateAmt(String rateStd, Integer adultCnt, Integer childCnt, BigDecimal[] aryAdultAmt,
			BigDecimal[] aryChildAmt, BigDecimal pkgAmtOrg, BigDecimal pkgAmtCur) {
		if(Objects.isNull(pkgAmtOrg)){
			pkgAmtOrg = BigDecimal.ZERO;
		}
		if(Objects.isNull(pkgAmtCur)){
			pkgAmtCur = BigDecimal.ZERO;
		}
		if (ConstantRate.ENUM_RATE_STD.ROOM.getValue().equals(rateStd)) {
			// 每房间
			Integer personCnt = adultCnt + childCnt;
			BigDecimal amt = getRateAmtCore(personCnt, aryAdultAmt);
			return Arrays.asList(amt, pkgAmtOrg, pkgAmtCur);

		} else if (ConstantRate.ENUM_RATE_STD.ADULTCHILD.getValue().equals(rateStd)) {
			// 成人携儿童
			BigDecimal adultAmt = getRateAmtCore(adultCnt, aryAdultAmt);
			BigDecimal childAmt = getRateAmtCore(childCnt, aryChildAmt);
			return Arrays.asList(adultAmt.add(childAmt), pkgAmtOrg, pkgAmtCur);
		} else if (ConstantRate.ENUM_RATE_STD.PERSON.getValue().equals(rateStd)) {
			// 每人
			Integer personCnt = adultCnt + childCnt;
			BigDecimal adultAmt = getRateAmtCore(personCnt, aryAdultAmt);
			adultAmt = adultAmt.multiply(new BigDecimal(adultCnt.intValue()));
			
			BigDecimal childAmt = getRateAmtCore(personCnt, aryChildAmt);
			childAmt = childAmt.multiply(new BigDecimal(childCnt.intValue()));
			return Arrays.asList(adultAmt.add(childAmt), 
					pkgAmtOrg.multiply(new BigDecimal(personCnt.intValue())), 
					pkgAmtCur.multiply(new BigDecimal(personCnt.intValue())));

		} else if (ConstantRate.ENUM_RATE_STD.CHILD.getValue().equals(rateStd)) {
			// 纯儿童
			
		}

		if (null != amt) {
			return CalcUtil.toDecimal(CalcUtil.round(amt.doubleValue(), ShareSession.getUnitDecimalRoundMode(), ShareSession.getUnitDecimalScale()));
		}
		return Arrays.asList(BigDecimal.ZERO, pkgAmtOrg, pkgAmtCur);
	}*/

	/**
	 * 
	 * ## 方法说明：
	 * 	循环获取指定人数的价格金额
	 * @param personCnt
	 * @param aryAmt
	 * @return
	 */
/*	private static BigDecimal getRateAmtCore(Integer personCnt, BigDecimal[] aryAmt) {
		BigDecimal amt = null;
		for (int i = aryAmt.length - 1; i >= 0; i--) {
			if ((personCnt >= i) && (null != aryAmt[i])) {
				amt = aryAmt[i];
				break;
			}
		}
		if(Objects.isNull(amt)){
			amt = BigDecimal.ZERO;
		}
		return amt;
	}*/
	

	
	public static void main(String[] args) {
TreeMap<Integer, BigDecimal> treeMap = new TreeMap<>();
		
		treeMap.put(-999, new BigDecimal(100));
		treeMap.put(1, new BigDecimal(200));
		treeMap.put(2, new BigDecimal(220));
		treeMap.put(3, new BigDecimal(300));
		
		System.out.println(treeMap.floorEntry(2));
		System.out.println(treeMap.ceilingEntry(2));
	}
	

	/*private static BigDecimal[] setAryAdultAmt(Map<String, Object> row) {
		BigDecimal[] aryAdultAmt = new BigDecimal[6];
		if (null == row.get("adultdef_amt")) {
			aryAdultAmt[0] = null;
		} else {
			aryAdultAmt[0] = (BigDecimal) row.get("adultdef_amt");
		}

		if (null == row.get("adult1_amt")) {
			aryAdultAmt[1] = null;
		} else {
			aryAdultAmt[1] = (BigDecimal) row.get("adult1_amt");
		}

		if (null == row.get("adult2_amt")) {
			aryAdultAmt[2] = null;
		} else {
			aryAdultAmt[2] = (BigDecimal) row.get("adult2_amt");
		}

		if (null == row.get("adult3_amt")) {
			aryAdultAmt[3] = null;
		} else {
			aryAdultAmt[3] = (BigDecimal) row.get("adult3_amt");
		}

		if (null == row.get("adult4_amt")) {
			aryAdultAmt[4] = null;
		} else {
			aryAdultAmt[4] = (BigDecimal) row.get("adult4_amt");
		}

		if (null == row.get("adult5_amt")) {
			aryAdultAmt[5] = null;
		} else {
			aryAdultAmt[5] = (BigDecimal) row.get("adult5_amt");
		}

		return aryAdultAmt;
	}

	private static BigDecimal[] setAryChildAmt(Map<String, Object> row) {
		BigDecimal[] aryChildAmt = new BigDecimal[6];

		if (null == row.get("childrendef_amt")) {
			aryChildAmt[0] = null;
		} else {
			aryChildAmt[0] = (BigDecimal) row.get("childrendef_amt");
		}

		if (null == row.get("children1_amt")) {
			aryChildAmt[1] = null;
		} else {
			aryChildAmt[1] = (BigDecimal) row.get("children1_amt");
		}

		if (null == row.get("children2_amt")) {
			aryChildAmt[2] = null;
		} else {
			aryChildAmt[2] = (BigDecimal) row.get("children2_amt");
		}

		if (null == row.get("children3_amt")) {
			aryChildAmt[3] = null;
		} else {
			aryChildAmt[3] = (BigDecimal) row.get("children3_amt");
		}

		if (null == row.get("children4_amt")) {
			aryChildAmt[4] = null;
		} else {
			aryChildAmt[4] = (BigDecimal) row.get("children4_amt");
		}

		if (null == row.get("children5_amt")) {
			aryChildAmt[5] = null;
		} else {
			aryChildAmt[5] = (BigDecimal) row.get("children5_amt");
		}

		return aryChildAmt;
	}*/
}
