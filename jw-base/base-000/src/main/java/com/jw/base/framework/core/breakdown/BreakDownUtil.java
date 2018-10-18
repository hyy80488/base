/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.breakdown;

import static com.jw.base.framework.core.util.CalcUtil.add;
import static com.jw.base.framework.core.util.CalcUtil.div;
import static com.jw.base.framework.core.util.CalcUtil.mul;
import static com.jw.base.framework.core.util.CalcUtil.round;
import static com.jw.base.framework.core.util.CalcUtil.sub;
import static com.jw.base.framework.core.util.CalcUtil.toDecimal;
import static com.jw.base.framework.core.util.CalcUtil.toDouble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.KeyValue;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;
import org.apache.commons.lang3.StringUtils;

import com.jw.base.framework.core.Constant.ENUM_YES_OR_NO;
import com.jw.base.framework.core.ConstantRate.ENUM_CHARGE_FLG;
import com.jw.base.framework.core.RoundModeEnum;
import com.jw.base.framework.core.util.NumberUtil;


/**
 * 
 * ## 类说明：
 * 	拆解金额工具类
 * @author    [guoc]   
 * @version   [V1.0, 2017年4月6日]
 * @package com.jw.hms.pms.m3210.f010.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年4月6日|guoc|新增|BreakDownUtil.java新增
 */
public class BreakDownUtil {
	/**
	 * 默认除法运算精度
	 */
    private static final int DEF_DIV_SCALE = 15;
	/**
	 * 价格收费基准
	 */
	public static enum ENUM_PARAM_STR1 {
		/** 0：无关 **/
		NON("0"),
		/** 1：成人 **/
		ADULT("1"),
		/** 2：每人 **/
		PERSON("2"),
		/** 3：儿童 **/
		CHILD("3");
		// 值
		private String _value;

		public String getValue() {
			return _value;
		}

		public Boolean isEquals(Object value) {
			return this._value.equals(value);
		}

		private ENUM_PARAM_STR1(String value) {
			this._value = value;
		}
	}
	
	//税 字段
	private static final List<KeyValue<String, String>>  taxField;
	static{
		 taxField = new ArrayList<>();
		taxField.add(new DefaultKeyValue<String, String>("tax1", "svc_tax1"));
		taxField.add(new DefaultKeyValue<String, String>("tax2", "svc_tax2"));
		taxField.add(new DefaultKeyValue<String, String>("tax3", "svc_tax3"));
		taxField.add(new DefaultKeyValue<String, String>("tax4", "svc_tax4"));
		taxField.add(new DefaultKeyValue<String, String>("tax5", "svc_tax5"));
	}
	
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
	private static Double getRateAmt(String param_str1, Integer adultCnt, Integer childCnt, Double taxAmt) {
		Double amt = 0d;
		if (ENUM_PARAM_STR1.NON.getValue().equals(param_str1)) {//无关
			amt = taxAmt;
		} else if (ENUM_PARAM_STR1.ADULT.getValue().equals(param_str1)) {//成人
			if(NumberUtil.compareInteger(adultCnt,0) == 1){
				amt = taxAmt * adultCnt;
			}
		} else if (ENUM_PARAM_STR1.PERSON.getValue().equals(param_str1)) {// 每人
			Integer personCnt = adultCnt + childCnt;
			if(NumberUtil.compareInteger(personCnt,0) == 1){
				amt = taxAmt * personCnt;
			}
		} else if (ENUM_PARAM_STR1.CHILD.getValue().equals(param_str1)) {// 纯儿童
			if(NumberUtil.compareInteger(childCnt,0) == 1){
				amt = taxAmt * childCnt;
			}
		}
		return amt;
	}
	
	/** 
	 * ## 方法说明：
	 * 获取阶梯计算金额
	 * @param param_str1
	 * @param adultCnt
	 * @param childCnt
	 * @param net
	 * @return
	*/
	private static Double getLevelNet(String param_str1, Integer adultCnt, Integer childCnt, Double net, RoundModeEnum r, int s) {
		Double amt = 0d;
		if (ENUM_PARAM_STR1.NON.getValue().equals(param_str1)) {//无关
			amt = net;
		} else if (ENUM_PARAM_STR1.ADULT.getValue().equals(param_str1)) {//成人 net/成人数
			if(NumberUtil.compareInteger(adultCnt,0) == 1){
				amt = round(div(net, adultCnt), r, s);
			}
		} else if (ENUM_PARAM_STR1.PERSON.getValue().equals(param_str1)) {// 每人
			Integer personCnt = adultCnt + childCnt;
			if(NumberUtil.compareInteger(personCnt,0) == 1){
				amt = round(div(net, personCnt), r, s);
			}
		} else if (ENUM_PARAM_STR1.CHILD.getValue().equals(param_str1)) {// 纯儿童
			if(NumberUtil.compareInteger(childCnt,0) == 1){
				amt = round(div(net, childCnt), r, s);
			}
		}
		return amt;
	}

	
	/**
	 * 
	 * ## 方法说明：
	 * 	拆解金额
	 * @param breakDto
	 */
	public static void setBreak(BreakDownDto breakDto) {
		RoundModeEnum r = breakDto.getRoundMode();
		int s = breakDto.getScale();
		double svcPcnt = toDouble(breakDto.getSvcRates());
		double tax1Pcnt = toDouble(breakDto.getTax1Rates());
		double tax2Pcnt = toDouble(breakDto.getTax2Rates());
		double tax3Pcnt = toDouble(breakDto.getTax3Rates());
		double tax4Pcnt = toDouble(breakDto.getTax4Rates());
		double tax5Pcnt = toDouble(breakDto.getTax5Rates());
		double svcTax1Pcnt = toDouble(breakDto.getSvctax1Rates());
		double svcTax2Pcnt = toDouble(breakDto.getSvctax2Rates());
		double svcTax3Pcnt = toDouble(breakDto.getSvctax3Rates());
		double svcTax4Pcnt = toDouble(breakDto.getSvctax4Rates());
		double svcTax5Pcnt = toDouble(breakDto.getSvctax5Rates());
		//收费基准：0：无关，1：每人；2：成人；3：儿童
		Map<String, String> taxMap_str1 = breakDto.getTaxMap_str1();
		//是否阶梯：0：不是；1：是
		Map<String, String> taxMap_str2 = breakDto.getTaxMap_str2();
		//阶梯基准：0：无关，1：净房费
		Map<String, String> taxMap_str3 = breakDto.getTaxMap_str3();
		//收费方式/阶梯①收费方式：0固定金额；1百分比
		Map<String, String> paramStr5 = breakDto.getTaxMap_str5();
		//税阶梯
		Map<String,TreeMap<Double, BreakDownDiffDto>>  taxMap_diff  = breakDto.getTaxMap_diff();
		
		
		// 计算charge
		double charge = calcCharge(breakDto);
		breakDto.setCharge(toDecimal(charge));
		
		// 根据收费标记获取被乘数
		double[] arrXflg = getXflg(breakDto);
		
		// 计算净额
		double net = calcNet(breakDto, arrXflg, breakDto.getAdultCnt(), breakDto.getChildCnt(), paramStr5, taxMap_str1);
		
		// 计算服务费(svc = round(net * svcPcnt / 100))
		double svc = round(div(mul(net,svcPcnt),100),r,s);
		
		//税
		LinkedHashMap<String, Double> taxMap = new LinkedHashMap<>();
		//服务费税
		LinkedHashMap<String, Double> svcTaxMap = new LinkedHashMap<>();
		

		
		//税费率
		Map<String, List<Double>> taxPoint = new HashMap<>();
		taxPoint.put("tax1", Arrays.asList(tax1Pcnt, svcTax1Pcnt));
		taxPoint.put("tax2", Arrays.asList(tax2Pcnt, svcTax2Pcnt));
		taxPoint.put("tax3", Arrays.asList(tax3Pcnt, svcTax3Pcnt));
		taxPoint.put("tax4", Arrays.asList(tax4Pcnt, svcTax4Pcnt));
		taxPoint.put("tax5", Arrays.asList(tax5Pcnt, svcTax5Pcnt));
		
		//税收费标记
		Map<String, String> taxFlg = new HashMap<>();
		taxFlg.put("tax1", breakDto.getTax1chargeFlg());
		taxFlg.put("tax2", breakDto.getTax2chargeFlg());
		taxFlg.put("tax3", breakDto.getTax3chargeFlg());
		taxFlg.put("tax4", breakDto.getTax4chargeFlg());
		taxFlg.put("tax5", breakDto.getTax5chargeFlg());
		taxFlg.put("svc_tax1", breakDto.getTax1chargeFlg());
		taxFlg.put("svc_tax2", breakDto.getTax2chargeFlg());
		taxFlg.put("svc_tax3", breakDto.getTax3chargeFlg());
		taxFlg.put("svc_tax4", breakDto.getTax4chargeFlg());
		taxFlg.put("svc_tax5", breakDto.getTax5chargeFlg());
		
		//税 阶梯
		Set<String> taxDiffF = new HashSet<>();
		//服务费税 阶梯
		Set<String> svcTaxDiffF = new HashSet<>();
		//包含税
		Set<String> taxFields = breakDto.getTaxFields();
		//成人数
		Integer adultCnt = breakDto.getAdultCnt(); 
		//儿童数
		Integer childCnt = breakDto.getChildCnt();
		//1、循环税数据 计算非阶梯税
		for (KeyValue<String, String> field : taxField) {
			String taxNm = field.getKey();
			List<Double> point = taxPoint.get(taxNm);
			
			if(taxFields.contains(taxNm)){
				//收费基准：0：无关，1：每人；2：成人；3：儿童
				String taxStr1 = MapUtils.getString(taxMap_str1, taxNm);
				//阶梯标志
				String taxStr2 = MapUtils.getString(taxMap_str2, taxNm);
				if(ENUM_YES_OR_NO.YES.isEquals(taxStr2)){
					//添加到阶梯
					taxDiffF.add(taxNm);
				}else{
					double tax = 0d;
					//收费方式/阶梯①收费方式：0固定金额；1百分比
					if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, taxNm))){
						tax = getRateAmt(taxStr1, adultCnt, childCnt, point.get(0));
					}else{
						//计算税 默认15位小数
						tax = getRateAmt(taxStr1, adultCnt, childCnt, calcTax(net, point.get(0), r, DEF_DIV_SCALE));
					}
					taxMap.put(taxNm, tax);
				}
			}
			//服务费的税
			String svcTaxNm = field.getValue();
			if(taxFields.contains(svcTaxNm)){
				//收费基准：0：无关，1：每人；2：成人；3：儿童
				String svcTaxStr1 = MapUtils.getString(taxMap_str1, svcTaxNm);
				//阶梯标志
				String svcTaxStr2 = MapUtils.getString(taxMap_str3, svcTaxNm);
				//服务费税 阶梯标志 添加到对应容器
				if(ENUM_YES_OR_NO.YES.isEquals(svcTaxStr2)){
					svcTaxDiffF.add(svcTaxNm);
				}else{
					double svcTax = 0d;
					//收费方式/阶梯①收费方式：0固定金额；1百分比
					if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, svcTaxNm))){
						svcTax = getRateAmt(svcTaxStr1, adultCnt, childCnt, point.get(1));
					}else{
						//计算税 默认15位小数
						svcTax =  getRateAmt(svcTaxStr1, adultCnt, childCnt, calcSvcTax(net, svcPcnt, point.get(1), r, DEF_DIV_SCALE));
					}
					svcTaxMap.put(svcTaxNm, svcTax);
				}
			}
		}
		Double net_tmp = 0d;
		Double svc_net = 0d;
		//2、排除非阶梯税 倒减出净额
		{
			Double sumTax1 = add(NumberUtil.firstNonNull(taxMap.get("tax1"), 0d), NumberUtil.firstNonNull(svcTaxMap.get("svc_tax1"), 0d));
			Double sumTax2 = add(NumberUtil.firstNonNull(taxMap.get("tax2"), 0d), NumberUtil.firstNonNull(svcTaxMap.get("svc_tax2"), 0d));
			Double sumTax3 = add(NumberUtil.firstNonNull(taxMap.get("tax3"), 0d), NumberUtil.firstNonNull(svcTaxMap.get("svc_tax3"), 0d));
			Double sumTax4 = add(NumberUtil.firstNonNull(taxMap.get("tax4"), 0d), NumberUtil.firstNonNull(svcTaxMap.get("svc_tax4"), 0d));
			Double sumTax5 = add(NumberUtil.firstNonNull(taxMap.get("tax5"), 0d), NumberUtil.firstNonNull(svcTaxMap.get("svc_tax5"), 0d));
			net = reCalcNet(charge, svc, sumTax1, sumTax2, sumTax3, sumTax4, sumTax5, arrXflg);
			net_tmp = net;
		}
		{
			Double sumTax1 = NumberUtil.firstNonNull(svcTaxMap.get("svc_tax1"), 0d);
			Double sumTax2 = NumberUtil.firstNonNull(svcTaxMap.get("svc_tax2"), 0d);
			Double sumTax3 = NumberUtil.firstNonNull(svcTaxMap.get("svc_tax3"), 0d);
			Double sumTax4 = NumberUtil.firstNonNull(svcTaxMap.get("svc_tax4"), 0d);
			Double sumTax5 = NumberUtil.firstNonNull(svcTaxMap.get("svc_tax5"), 0d);
			svc_net = reCalcNet(svc, 0d, sumTax1, sumTax2, sumTax3, sumTax4, sumTax5, arrXflg);
		}
		//3、计算内含的阶梯税
		{
			//税 阶梯
			if(CollectionUtils.isNotEmpty(taxDiffF)){
				Iterator<String> it = taxDiffF.iterator();
				while(it.hasNext()){
					String taxNm = it.next();
					//收费基准：0：无关，1：每人；2：成人；3：儿童
					String taxStr1 = MapUtils.getString(taxMap_str1, taxNm);
					/*//阶梯基准 税
					String taxStr3 = MapUtils.getString(taxMap_str3, taxNm);//税 阶梯标志 添加到对应容器
					Double tmpNet = net;
					//阶梯基准 1：净房费
					if(ENUM_YES_OR_NO.YES.isEquals(taxStr3)){
						tmpNet = sub(tmpNet, breakDto.getPkgNet());
					}*/
					//传入金额
					Double tmpNet = toDouble(breakDto.getRate());
					//获取阶梯税率
					TreeMap<Double, BreakDownDiffDto> diffMap = taxMap_diff.get(taxNm);
					if(Objects.isNull(diffMap)){
						diffMap = new TreeMap<>();
					}
					//获取对应的阶梯计算net
					Double tmpNet1 = getLevelNet(taxStr1, adultCnt, childCnt, tmpNet, r, DEF_DIV_SCALE);
					//获取<= 当前金额的阶梯数据
					Map.Entry<Double, BreakDownDiffDto> diff = diffMap.floorEntry(tmpNet1);
					if(Objects.nonNull(diff)){
						//外含内收标记
						String xFlg = taxFlg.get(taxNm);
						//收费方式金额 || 百分比
						Double diffNum = NumberUtil.firstNonNull(diff.getValue().getDiffNum(), 0d);
						diffNum = getRateAmt(taxStr1, adultCnt, childCnt, diffNum);
						Double tax = 0d;
						//内含金额
						if(!ENUM_CHARGE_FLG.ADD.isEquals(xFlg)){
							it.remove();
							//阶梯收费方式 0固定金额；1百分比
							if(ENUM_YES_OR_NO.NO.isEquals(diff.getValue().getDiffTyp())){
								tax = diffNum;
							}else{
								Double amt = net;
								//阶梯基准 1：净房费
								if(ENUM_YES_OR_NO.YES.isEquals(diff.getValue().getDiffStand())){
									amt = sub(net, breakDto.getPkgNet());
								}
								tax = calcTax(div(amt, add(1d, div(diffNum,100))), diffNum, r, DEF_DIV_SCALE);
							}
							//tax = getRateAmt(taxStr1, adultCnt, childCnt, tax);
							net -= tax;
						}
						taxMap.put(taxNm, tax);
					}else{
						it.remove();
					}
				}
			}
			//服务费税阶梯
			if(CollectionUtils.isNotEmpty(svcTaxDiffF)){
				Iterator<String> it = svcTaxDiffF.iterator();
				while(it.hasNext()){
					String svcTaxNm = it.next();
					//收费基准：0：无关，1：每人；2：成人；3：儿童
					String taxStr1 = MapUtils.getString(taxMap_str1, svcTaxNm);
					//服务费
					Double TmpSvc = svc;
					//获取阶梯税率
					TreeMap<Double, BreakDownDiffDto> diffMap = taxMap_diff.get(svcTaxNm);
					if(Objects.isNull(diffMap)){
						diffMap = new TreeMap<>();
					}
					//获取对应的阶梯计算net
					Double TmpSvc1 = getLevelNet(taxStr1, adultCnt, childCnt, TmpSvc, r, DEF_DIV_SCALE);
					//获取<= 当前金额的阶梯数据
					Map.Entry<Double, BreakDownDiffDto> diff = diffMap.floorEntry(TmpSvc1);
					if(Objects.nonNull(diff)){
						//外含内收标记
						String xFlg = taxFlg.get(svcTaxNm);
						//收费方式金额 || 百分比
						Double diffNum = NumberUtil.firstNonNull(diff.getValue().getDiffNum(), 0d);
						diffNum = getRateAmt(taxStr1, adultCnt, childCnt, diffNum);
						Double svcTax = 0d;
						//内含金额
						if(!ENUM_CHARGE_FLG.ADD.isEquals(xFlg)){
							it.remove();
							//阶梯收费方式 0固定金额；1百分比
							if(ENUM_YES_OR_NO.NO.isEquals(diff.getValue().getDiffTyp())){
								svcTax = diffNum;
							}else{
								svcTax = calcTax(div(svc_net,(add(1d, div(diffNum,100)))), diffNum, r, DEF_DIV_SCALE);
							}
							//svcTax = getRateAmt(taxStr1, adultCnt, childCnt, svcTax);
							svc -= svcTax;
						}
						svcTaxMap.put(svcTaxNm, svcTax);
					}else{
						it.remove();
					}
				}
			}
		}
		//4、计算另收的阶梯税
		{
			//税 阶梯
			if(CollectionUtils.isNotEmpty(taxDiffF)){
				Iterator<String> it = taxDiffF.iterator();
				while(it.hasNext()){
					String taxNm = it.next();
					//收费基准：0：无关，1：每人；2：成人；3：儿童
					String taxStr1 = MapUtils.getString(taxMap_str1, taxNm);
					/*//阶梯基准 税
					String taxStr3 = MapUtils.getString(taxMap_str3, taxNm);//税 阶梯标志 添加到对应容器
					Double tmpNet = net;
					//阶梯基准 1：净房费
					if(ENUM_YES_OR_NO.YES.isEquals(taxStr3)){
						tmpNet = sub(tmpNet, breakDto.getPkgNet());
					}*/
					//传入金额
					Double tmpNet = toDouble(breakDto.getRate());
					//获取阶梯税率
					TreeMap<Double, BreakDownDiffDto> diffMap = taxMap_diff.get(taxNm);
					if(Objects.isNull(diffMap)){
						diffMap = new TreeMap<>();
					}
					//获取对应的阶梯计算net
					Double tmpNet1 = getLevelNet(taxStr1, adultCnt, childCnt, tmpNet, r, DEF_DIV_SCALE);
					//获取<= 当前金额的阶梯数据
					Map.Entry<Double, BreakDownDiffDto> diff = diffMap.floorEntry(tmpNet1);
					if(Objects.nonNull(diff)){
						//收费方式金额 || 百分比
						Double diffNum = NumberUtil.firstNonNull(diff.getValue().getDiffNum(), 0d);
						diffNum = getRateAmt(taxStr1, adultCnt, childCnt, diffNum);
						Double tax = 0d;
						//阶梯收费方式 0固定金额；1百分比
						if(ENUM_YES_OR_NO.NO.isEquals(diff.getValue().getDiffTyp())){
							//net =  round(div(net,(add(1d, div(diffNum,100)))),r,s);
							tax = diffNum;
						}else{
							Double amt = net;
							//阶梯基准 1：净房费
							if(ENUM_YES_OR_NO.YES.isEquals(diff.getValue().getDiffStand())){
								amt = sub(net, breakDto.getPkgNet());
							}
							tax = calcTax(amt, diffNum, r, DEF_DIV_SCALE);
						}
					//	tax = getRateAmt(taxStr1, adultCnt, childCnt, tax);
						taxMap.put(taxNm, tax);
					}
				}
			}
			//服务费税阶梯
			if(CollectionUtils.isNotEmpty(svcTaxDiffF)){
				Iterator<String> it = svcTaxDiffF.iterator();
				while(it.hasNext()){
					String svcTaxNm = it.next();
					//收费基准：0：无关，1：每人；2：成人；3：儿童
					String taxStr1 = MapUtils.getString(taxMap_str1, svcTaxNm);
					//服务费
					Double TmpSvc = svc;
					//获取阶梯税率
					TreeMap<Double, BreakDownDiffDto> diffMap = taxMap_diff.get(svcTaxNm);
					if(Objects.isNull(diffMap)){
						diffMap = new TreeMap<>();
					}
					//获取对应的阶梯计算net
					Double TmpSvc1 = getLevelNet(taxStr1, adultCnt, childCnt, TmpSvc, r, DEF_DIV_SCALE);
					//获取<= 当前金额的阶梯数据
					Map.Entry<Double, BreakDownDiffDto> diff = diffMap.floorEntry(TmpSvc1);
					if(Objects.nonNull(diff)){
						//收费方式金额 || 百分比
						Double diffNum = NumberUtil.firstNonNull(diff.getValue().getDiffNum(), 0d);
						diffNum = getRateAmt(taxStr1, adultCnt, childCnt, diffNum);
						Double svcTax = 0d;
						//阶梯收费方式 0固定金额；1百分比
						if(ENUM_YES_OR_NO.NO.isEquals(diff.getValue().getDiffTyp())){
							//net =  round(div(net,(add(1d, div(diffNum,100)))),r,s);
							svcTax = diffNum;
						}else{
							svcTax = calcTax(svc_net, diffNum, r, DEF_DIV_SCALE);
						}
						//svcTax = getRateAmt(taxStr1, adultCnt, childCnt, svcTax);
						svcTaxMap.put(svcTaxNm, svcTax);
					}
				}
			}
		}
		//重新计算
		{
			Double sumTax1 = add(NumberUtil.firstNonNull(taxMap.get("tax1"), 0d), NumberUtil.firstNonNull(svcTaxMap.get("svc_tax1"), 0d));
			//总税1
			sumTax1 = round(sumTax1, r, s);
			// 计算服务费的税1
			double svcTax1 = round(NumberUtil.firstNonNull(svcTaxMap.get("svc_tax1"), 0d), r, s);
			// 倒减出净额的税1
			double tax1 = sub(sumTax1,svcTax1);
			
			Double sumTax2 = add(NumberUtil.firstNonNull(taxMap.get("tax2"), 0d), NumberUtil.firstNonNull(svcTaxMap.get("svc_tax2"), 0d));
			//总税2
			sumTax2 = round(sumTax2, r, s);
			// 计算服务费的税2
			double svcTax2 = round(NumberUtil.firstNonNull(svcTaxMap.get("svc_tax2"), 0d), r, s);
			// 倒减出净额的税2
			double tax2 = sub(sumTax2,svcTax2);
		
			Double sumTax3 = add(NumberUtil.firstNonNull(taxMap.get("tax3"), 0d), NumberUtil.firstNonNull(svcTaxMap.get("svc_tax3"), 0d));
			//总税3
			sumTax3 = round(sumTax3, r, s);
			// 计算服务费的税3
			double svcTax3 = round(NumberUtil.firstNonNull(svcTaxMap.get("svc_tax3"), 0d), r, s);
			// 倒减出净额的税3
			double tax3 = sub(sumTax3,svcTax3);
		
			Double sumTax4 = add(NumberUtil.firstNonNull(taxMap.get("tax4"), 0d), NumberUtil.firstNonNull(svcTaxMap.get("svc_tax4"), 0d));
			//总税4
			sumTax4 = round(sumTax4, r, s);
			// 计算服务费的税4
			double svcTax4 = round(NumberUtil.firstNonNull(svcTaxMap.get("svc_tax4"), 0d), r, s);
			// 倒减出净额的税4
			double tax4 = sub(sumTax4,svcTax4);
			
			Double sumTax5 = add(NumberUtil.firstNonNull(taxMap.get("tax5"), 0d), NumberUtil.firstNonNull(svcTaxMap.get("svc_tax5"), 0d));
			//总税5
			sumTax5 = round(sumTax5, r, s);
			// 计算服务费的税5
			double svcTax5 = round(NumberUtil.firstNonNull(svcTaxMap.get("svc_tax5"), 0d), r, s);
			// 倒减出净额的税5
			double tax5 = sub(sumTax5,svcTax5);
			//按照进位规则重算折扣金额
			charge = round(charge, r, s);
			net = reCalcNet(charge, svc, sumTax1, sumTax2, sumTax3, sumTax4, sumTax5, arrXflg);
			
			// 计算出gross(将net、svc、tax1~5、svcTax1~5全部相加)
			double gross = add(add(add(add(add(add(net,svc),tax1),tax2),tax3),tax4),tax5);
			gross = add(add(add(add(add(gross,svcTax1),svcTax2),svcTax3),svcTax4),svcTax5);
			// 设置返回值
			breakDto.setCharge(toDecimal(charge));
			breakDto.setNet(toDecimal(net));
			breakDto.setSvc(toDecimal(svc));
			breakDto.setTax1(toDecimal(tax1));
			breakDto.setTax2(toDecimal(tax2));
			breakDto.setTax3(toDecimal(tax3));
			breakDto.setTax4(toDecimal(tax4));
			breakDto.setTax5(toDecimal(tax5));
			breakDto.setSvcTax1(toDecimal(svcTax1));
			breakDto.setSvcTax2(toDecimal(svcTax2));
			breakDto.setSvcTax3(toDecimal(svcTax3));
			breakDto.setSvcTax4(toDecimal(svcTax4));
			breakDto.setSvcTax5(toDecimal(svcTax5));
			breakDto.setGross(toDecimal(gross));
		}
		
		
		
		
		
		
		
		
	
		
		
		
		
		/*// 计算税1总额 sumTax1 = round(net * tax1Pcnt / 100 + net * svcPcnt / 100 * svctax1Pcnt / 100)
		double sumTax1 = calcTax(net, tax1Pcnt, svcPcnt, svcTax1Pcnt, r, s);
		// 计算服务费的税1
		double svcTax1 = calcSvcTax(net, svcPcnt, svcTax1Pcnt, r, s);
		// 倒减出净额的税1
		double tax1 = sub(sumTax1,svcTax1);
		
		// 计算税2总额 sumTax2 = round(net * tax2Pcnt / 100 + net * svcPcnt / 100 * svctax2Pcnt / 100)
		double sumTax2 = calcTax(net, tax2Pcnt, svcPcnt, svcTax2Pcnt, r, s);
		// 计算服务费的税2
		double svcTax2 = calcSvcTax(net, svcPcnt, svcTax2Pcnt, r, s);
		// 倒减出净额的税2
		double tax2 = sub(sumTax2,svcTax2);
		
		// 计算税3总额 sumTax3 = round(net * tax3Pcnt / 100 + net * svcPcnt / 100 * svctax3Pcnt / 100)
		double sumTax3 = calcTax(net, tax3Pcnt, svcPcnt, svcTax3Pcnt, r, s);
		// 计算服务费的税3
		double svcTax3 = calcSvcTax(net, svcPcnt, svcTax3Pcnt, r, s);
		// 倒减出净额的税3
		double tax3 = sub(sumTax3,svcTax3);
				
		// 计算税4总额 sumTax4 = round(net * tax4Pcnt / 100 + net * svcPcnt / 100 * svctax4Pcnt / 100)
		double sumTax4 = calcTax(net, tax4Pcnt, svcPcnt, svcTax4Pcnt, r, s);
		// 计算服务费的税4
		double svcTax4 = calcSvcTax(net, svcPcnt, svcTax4Pcnt, r, s);
		// 倒减出净额的税4
		double tax4 = sub(sumTax4,svcTax4);
		
		// 计算税5总额 sumTax5 = round(net * tax5Pcnt / 100 + net * svcPcnt / 100 * svctax5Pcnt / 100)	
		double sumTax5 = calcTax(net, tax5Pcnt, svcPcnt, svcTax5Pcnt, r, s);
		// 计算服务费的税5
		double svcTax5 = calcSvcTax(net, svcPcnt, svcTax5Pcnt, r, s);
		// 倒减出净额的税5
		double tax5 = sub(sumTax5,svcTax5);
		
		//按照进位规则重算折扣金额
		charge = round(charge, r, s);
		// 最后重新倒减出净额
		net = reCalcNet(charge, svc, sumTax1, sumTax2, sumTax3, sumTax4, sumTax5, arrXflg);
		
		// 计算出gross(将net、svc、tax1~5、svcTax1~5全部相加)
		double gross = add(add(add(add(add(add(net,svc),tax1),tax2),tax3),tax4),tax5);
		gross = add(add(add(add(add(gross,svcTax1),svcTax2),svcTax3),svcTax4),svcTax5);
		
		// 设置返回值
		breakDto.setCharge(toDecimal(charge));
		breakDto.setNet(toDecimal(net));
		breakDto.setSvc(toDecimal(svc));
		breakDto.setTax1(toDecimal(tax1));
		breakDto.setTax2(toDecimal(tax2));
		breakDto.setTax3(toDecimal(tax3));
		breakDto.setTax4(toDecimal(tax4));
		breakDto.setTax5(toDecimal(tax5));
		breakDto.setSvcTax1(toDecimal(svcTax1));
		breakDto.setSvcTax2(toDecimal(svcTax2));
		breakDto.setSvcTax3(toDecimal(svcTax3));
		breakDto.setSvcTax4(toDecimal(svcTax4));
		breakDto.setSvcTax5(toDecimal(svcTax5));
		breakDto.setGross(toDecimal(gross));*/
	}
	
	
	
	/**
	 * 
	 * ## 方法说明：
	 * 	在确定服务费以及税额后，重新计算净额
	 * @param charge
	 * @param svc
	 * @param tax1
	 * @param tax2
	 * @param tax3
	 * @param tax4
	 * @param tax5
	 * @param xFlg
	 * @return
	 */
	private static double reCalcNet(double charge, double svc, 
								    double tax1, double tax2, double tax3,double tax4, double tax5,
								    double[] xFlg) {
		double net;
		double svcX = mul(svc,xFlg[0]);
		double tax1X = mul(tax1,xFlg[1]);
		double tax2X = mul(tax2,xFlg[2]);
		double tax3X = mul(tax3,xFlg[3]);
		double tax4X = mul(tax4,xFlg[4]);
		double tax5X = mul(tax5,xFlg[5]);
		
		net = sub(charge,add(add(add(add(add(svcX,tax1X),tax2X),tax3X),tax4X),tax5X));
		
		return net;
	}
	/**
	 * 
	 * ## 方法说明：
	 * 	计算总税额(含服务费税额)
	 * @param net
	 * @param taxPcnt
	 * @param svcPcnt
	 * @param svcTaxPcnt
	 * @param r
	 * @param s
	 * @return
	 */
	private static double calcTax(double net, double taxPcnt, double svcPcnt, double svcTaxPcnt,
								  RoundModeEnum r, int s) {
		return round(add(div(mul(net, taxPcnt), 100), div(mul(div(mul(net, svcPcnt), 100), svcTaxPcnt), 100)), r, s);
	}
	
	/** 
	 * ## 方法说明：
	 * 	税计算
	 * @param net
	 * @param taxPcnt
	 * @param r
	 * @param s
	 * @return
	*/
	private static double calcTax(double net, double taxPcnt,
			  RoundModeEnum r, int s) {
		return round(div(mul(net, taxPcnt), 100), r, s);
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	计算服务费税额
	 * @param net
	 * @param svcPcnt
	 * @param svcTaxPcnt
	 * @param r
	 * @param s
	 * @return
	 */
	private static double calcSvcTax(double net, double svcPcnt, double svcTaxPcnt,
			                         RoundModeEnum r, int s) {
		return round(div(mul(div(mul(net,svcPcnt),100),svcTaxPcnt),100),r,s);
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	获取charge
	 * 	charge = (Rate + ExtrAmt) * discPcnt + discAmt
	 * @param breakDto
	 * @return
	 */
	public static double calcCharge(BreakDownDto breakDto) {
		
		double rate = toDouble(breakDto.getRate());
		double extrAmt = toDouble(breakDto.getExtrAmt());
		double discPcnt = 1d;
		//折扣 存在折扣 1 - 折扣%
		if (null != breakDto.getDiscPcnt()) {
			discPcnt = sub(1d, div(toDouble(breakDto.getDiscPcnt()),100));
		}
		double discAmt = toDouble(breakDto.getDiscAmt());
		
		// charge = (Rate + ExtrAmt) * discPcnt + discAmt
		return add(mul(add(rate,extrAmt),discPcnt),discAmt);
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	计算净额
	 *	charge																			
	 *	=																			
	 *	net																			
	 *	+	net 乘 svcPcnt / 100																		
	 *	+	net 乘 tax1Pcnt / 100																		
	 *	+	net 乘 tax2Pcnt / 100																		
	 *	+	net 乘 tax3Pcnt / 100																		
	 *	+	net 乘 tax4Pcnt / 100																		
	 *	+	net 乘 tax5Pcnt / 100																		
	 *	+	net 乘 svcPcnt / 100 乘 svctax1Pcnt / 100																		
	 *	+	net 乘 svcPcnt / 100 乘 svctax2Pcnt / 100																		
	 *	+	net 乘 svcPcnt / 100 乘 svctax3Pcnt / 100																		
	 *	+	net 乘 svcPcnt / 100 乘 svctax4Pcnt / 100																		
	 *	+	net 乘 svcPcnt / 100 乘 svctax5Pcnt / 100	
	 * @param breakDto
	 * @param xFlg
	 * @return
	 */
	private static double calcNet(BreakDownDto breakDto, double[] xFlg) {

		double charge = toDouble(breakDto.getCharge());
		double svcPcnt = toDouble(breakDto.getSvcRates());
		double tax1Pcnt = toDouble(breakDto.getTax1Rates());
		double tax2Pcnt = toDouble(breakDto.getTax2Rates());
		double tax3Pcnt = toDouble(breakDto.getTax3Rates());
		double tax4Pcnt = toDouble(breakDto.getTax4Rates());
		double tax5Pcnt = toDouble(breakDto.getTax5Rates());
		double svcTax1Pcnt = toDouble(breakDto.getSvctax1Rates());
		double svcTax2Pcnt = toDouble(breakDto.getSvctax2Rates());
		double svcTax3Pcnt = toDouble(breakDto.getSvctax3Rates());
		double svcTax4Pcnt = toDouble(breakDto.getSvctax4Rates());
		double svcTax5Pcnt = toDouble(breakDto.getSvctax5Rates());
		double svcPcntOri = svcPcnt;
		
		// net 																																	
		// =																																	
		// ((Rate + ExtrAmt) * discPcnt + discAmt)																																
		//  除以																																
		// (1 + svcPcnt/100 + tax1Pcnt/100 + tax2Pcnt/100 + tax3Pcnt/100 + tax4Pcnt/100 + tax5Pcnt/100 +																																
		// svcPcnt/100 * svctax1Pcnt/100 + svcPcnt/100 * svctax2Pcnt/100 + svcPcnt/100 * svctax3Pcnt/100 + svcPcnt/100 * svctax4Pcnt/100 + svcPcnt/100 * svctax5Pcnt/100)		
		
		double totalPcnt;
		svcPcnt = div(mul(svcPcnt,xFlg[0]),100);
		// 备份原始服务费率
		svcPcntOri = div(svcPcntOri,100);
		tax1Pcnt = div(mul(tax1Pcnt,xFlg[1]),100);
		tax2Pcnt = div(mul(tax2Pcnt,xFlg[2]),100);
		tax3Pcnt = div(mul(tax3Pcnt,xFlg[3]),100);
		tax4Pcnt = div(mul(tax4Pcnt,xFlg[4]),100);
		tax5Pcnt = div(mul(tax5Pcnt,xFlg[5]),100);
		svcTax1Pcnt = div(mul(svcPcntOri,mul(svcTax1Pcnt,xFlg[1])),100);
		svcTax2Pcnt = div(mul(svcPcntOri,mul(svcTax2Pcnt,xFlg[2])),100);
		svcTax3Pcnt = div(mul(svcPcntOri,mul(svcTax3Pcnt,xFlg[3])),100);
		svcTax4Pcnt = div(mul(svcPcntOri,mul(svcTax4Pcnt,xFlg[4])),100);
		svcTax5Pcnt = div(mul(svcPcntOri,mul(svcTax5Pcnt,xFlg[5])),100);
		
		totalPcnt = add(1,svcPcnt);
		totalPcnt = add(totalPcnt,tax1Pcnt);
		totalPcnt = add(totalPcnt,tax2Pcnt);
		totalPcnt = add(totalPcnt,tax3Pcnt);
		totalPcnt = add(totalPcnt,tax4Pcnt);
		totalPcnt = add(totalPcnt,tax5Pcnt);
		totalPcnt = add(totalPcnt,svcTax1Pcnt);
		totalPcnt = add(totalPcnt,svcTax2Pcnt);
		totalPcnt = add(totalPcnt,svcTax3Pcnt);
		totalPcnt = add(totalPcnt,svcTax4Pcnt);
		totalPcnt = add(totalPcnt,svcTax5Pcnt);
	
		double net = div(charge,totalPcnt);

		return net;
	}
	
	private static double calcNet(BreakDownDto breakDto, double[] xFlg,
			Integer adultCnt,
			Integer childCnt,
			Map<String, String> paramStr5, Map<String, String> paramStr1) {

		double charge = toDouble(breakDto.getCharge());
		double svcPcnt = toDouble(breakDto.getSvcRates());
		double tax1Pcnt = toDouble(breakDto.getTax1Rates());
		double tax2Pcnt = toDouble(breakDto.getTax2Rates());
		double tax3Pcnt = toDouble(breakDto.getTax3Rates());
		double tax4Pcnt = toDouble(breakDto.getTax4Rates());
		double tax5Pcnt = toDouble(breakDto.getTax5Rates());
		double svcTax1Pcnt = toDouble(breakDto.getSvctax1Rates());
		double svcTax2Pcnt = toDouble(breakDto.getSvctax2Rates());
		double svcTax3Pcnt = toDouble(breakDto.getSvctax3Rates());
		double svcTax4Pcnt = toDouble(breakDto.getSvctax4Rates());
		double svcTax5Pcnt = toDouble(breakDto.getSvctax5Rates());
		double svcPcntOri = svcPcnt;
		
		// net 																																	
		// =																																	
		// ((Rate + ExtrAmt) * discPcnt + discAmt)																																
		//  除以																																
		// (1 + svcPcnt/100 + tax1Pcnt/100 + tax2Pcnt/100 + tax3Pcnt/100 + tax4Pcnt/100 + tax5Pcnt/100 +																																
		// svcPcnt/100 * svctax1Pcnt/100 + svcPcnt/100 * svctax2Pcnt/100 + svcPcnt/100 * svctax3Pcnt/100 + svcPcnt/100 * svctax4Pcnt/100 + svcPcnt/100 * svctax5Pcnt/100)		
		//先减去固定金额 在按照%计算
		double totalPcnt;
		svcPcnt = div(mul(svcPcnt,xFlg[0]),100);
		// 备份原始服务费率
		svcPcntOri = div(svcPcntOri,100);
		//tax1
		{
			tax1Pcnt =  getRateAmt(MapUtils.getString(paramStr1, "tax1"), adultCnt, childCnt, tax1Pcnt);
			//收费方式/阶梯①收费方式：0固定金额；1百分比
			if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, "tax1"))){
				charge = sub(charge, mul(tax1Pcnt,xFlg[1]));
				tax1Pcnt = 0;
			}else{
				tax1Pcnt = div(mul(tax1Pcnt,xFlg[1]),100);
			}
		}
		//tax2
		{
			tax2Pcnt =  getRateAmt(MapUtils.getString(paramStr1, "tax2"), adultCnt, childCnt, tax2Pcnt);
			//收费方式/阶梯①收费方式：0固定金额；1百分比
			if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, "tax2"))){
				charge = sub(charge, mul(tax2Pcnt,xFlg[2]));
				tax2Pcnt = 0;
			}else{
				tax2Pcnt = div(mul(tax2Pcnt,xFlg[2]),100);
			}
		}
		//tax3
		{
			tax3Pcnt =  getRateAmt(MapUtils.getString(paramStr1, "tax3"), adultCnt, childCnt, tax3Pcnt);
			//收费方式/阶梯①收费方式：0固定金额；1百分比
			if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, "tax3"))){
				charge = sub(charge, mul(tax3Pcnt,xFlg[3]));
				tax3Pcnt = 0;
			}else{
				tax3Pcnt = div(mul(tax3Pcnt,xFlg[3]),100);
			}
		}
		//tax4
		{
			tax4Pcnt =  getRateAmt(MapUtils.getString(paramStr1, "tax4"), adultCnt, childCnt, tax4Pcnt);
			//收费方式/阶梯①收费方式：0固定金额；1百分比
			if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, "tax4"))){
				charge = sub(charge, mul(tax4Pcnt,xFlg[4]));
				tax4Pcnt = 0;
			}else{
				tax4Pcnt = div(mul(tax4Pcnt,xFlg[4]),100);
			}
		}
		//tax5
		{
			tax5Pcnt =  getRateAmt(MapUtils.getString(paramStr1, "tax5"), adultCnt, childCnt, tax5Pcnt);
			//收费方式/阶梯①收费方式：0固定金额；1百分比
			if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, "tax5"))){
				charge = sub(charge, mul(tax5Pcnt,xFlg[5]));
				tax5Pcnt = 0;
			}else{
				tax5Pcnt = div(mul(tax5Pcnt,xFlg[5]),100);
			}
		}
		//svcTax1Pcnt
		{
			svcTax1Pcnt =  getRateAmt(MapUtils.getString(paramStr1, "svc_tax1"), adultCnt, childCnt, svcTax1Pcnt);
			//收费方式/阶梯①收费方式：0固定金额；1百分比
			if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, "svc_tax1"))){
				charge = sub(charge, mul(svcTax1Pcnt,xFlg[1]));
				svcTax1Pcnt = 0;
			}else{
				svcTax1Pcnt = div(mul(svcPcntOri,mul(svcTax1Pcnt,xFlg[1])),100);
			}
		}
		//svcTax2Pcnt
		{
			svcTax2Pcnt =  getRateAmt(MapUtils.getString(paramStr1, "svc_tax2"), adultCnt, childCnt, svcTax2Pcnt);
			//收费方式/阶梯①收费方式：0固定金额；1百分比
			if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, "svc_tax2"))){
				charge = sub(charge, mul(svcTax2Pcnt,xFlg[2]));
				svcTax2Pcnt = 0;
			}else{
				svcTax2Pcnt = div(mul(svcPcntOri,mul(svcTax2Pcnt,xFlg[2])),100);
			}
		}
		//svcTax3Pcnt
		{
			svcTax3Pcnt =  getRateAmt(MapUtils.getString(paramStr1, "svc_tax3"), adultCnt, childCnt, svcTax3Pcnt);
			//收费方式/阶梯①收费方式：0固定金额；1百分比
			if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, "svc_tax3"))){
				charge = sub(charge, mul(svcTax3Pcnt,xFlg[3]));
				svcTax3Pcnt = 0;
			}else{
				svcTax3Pcnt = div(mul(svcPcntOri,mul(svcTax3Pcnt,xFlg[3])),100);
			}
		}
		//svcTax4Pcnt
		{
			svcTax4Pcnt =  getRateAmt(MapUtils.getString(paramStr1, "svc_tax4"), adultCnt, childCnt, svcTax4Pcnt);
			//收费方式/阶梯①收费方式：0固定金额；1百分比
			if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, "svc_tax4"))){
				charge = sub(charge, mul(svcTax4Pcnt,xFlg[4]));
				svcTax4Pcnt = 0;
			}else{
				svcTax4Pcnt = div(mul(svcPcntOri,mul(svcTax4Pcnt,xFlg[4])),100);
			}
		}
		//svcTax5Pcnt
		{
			svcTax5Pcnt =  getRateAmt(MapUtils.getString(paramStr1, "svc_tax5"), adultCnt, childCnt, svcTax5Pcnt);
			//收费方式/阶梯①收费方式：0固定金额；1百分比
			if(ENUM_YES_OR_NO.NO.isEquals(MapUtils.getString(paramStr5, "svc_tax5"))){
				charge = sub(charge, mul(svcTax5Pcnt,xFlg[5]));
				svcTax5Pcnt = 0;
			}else{
				svcTax5Pcnt = div(mul(svcPcntOri,mul(svcTax5Pcnt,xFlg[5])),100);
			}	
		}
		totalPcnt = add(1,svcPcnt);
		totalPcnt = add(totalPcnt,tax1Pcnt);
		totalPcnt = add(totalPcnt,tax2Pcnt);
		totalPcnt = add(totalPcnt,tax3Pcnt);
		totalPcnt = add(totalPcnt,tax4Pcnt);
		totalPcnt = add(totalPcnt,tax5Pcnt);
		totalPcnt = add(totalPcnt,svcTax1Pcnt);
		totalPcnt = add(totalPcnt,svcTax2Pcnt);
		totalPcnt = add(totalPcnt,svcTax3Pcnt);
		totalPcnt = add(totalPcnt,svcTax4Pcnt);
		totalPcnt = add(totalPcnt,svcTax5Pcnt);
	
		double net = div(charge,totalPcnt);

		return net;
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	根据收费标记获取被乘数
	 * @param breakDto
	 * @return
	 */
	private static double[] getXflg(BreakDownDto breakDto) {
		double[] xFlg = new double[6];
	
		if (ENUM_CHARGE_FLG.ADD.getValue().equals(breakDto.getSvcchargeFlg())) {
			// 服务费加收
			xFlg[0] = 0;
		} else {
			xFlg[0] = 1;
		}
		
		if (ENUM_CHARGE_FLG.ADD.getValue().equals(breakDto.getTax1chargeFlg())) {
			// 税1加收
			xFlg[1] = 0;
		} else {
			xFlg[1] = 1;
		}
		
		if (ENUM_CHARGE_FLG.ADD.getValue().equals(breakDto.getTax2chargeFlg())) {
			// 税2加收
			xFlg[2] = 0;
		} else {
			xFlg[2] = 1;
		}
		
		if (ENUM_CHARGE_FLG.ADD.getValue().equals(breakDto.getTax3chargeFlg())) {
			// 税3加收
			xFlg[3] = 0;
		} else {
			xFlg[3] = 1;
		}
		
		if (ENUM_CHARGE_FLG.ADD.getValue().equals(breakDto.getTax4chargeFlg())) {
			// 税4加收
			xFlg[4] = 0;
		} else {
			xFlg[4] = 1;
		}
		
		if (ENUM_CHARGE_FLG.ADD.getValue().equals(breakDto.getTax5chargeFlg())) {
			// 税5加收
			xFlg[5] = 0;
		} else {
			xFlg[5] = 1;
		}
		
		return xFlg;
	}
	
	/** 
	 * ## 方法说明：
	 * 	收费标记设置
	 * @param map1
	 * @param map2
	 * @param outBDD
	 * @return
	*/
	public static BreakDownDto setXflg(Map<String,  Object> map1, Map<String,  Object> map2, BreakDownDto outBDD){
		//BreakDownDto 不存在  创建新的对象
		if(outBDD == null){
			outBDD = new BreakDownDto();
		}
		/*tax1charge_flg ~ tax5charge_flg  设置标准 
		 * 		默认为内含
		 * 		存在tax1_id 设置为tax1charge_flg 默认值为内含
		 * 		不存在tax1_id 设置为svc_tax1charge_flg 默认值为内含
		 * */		
		//设置tax1charge_flg
		{
			String tax1charge_flg = ENUM_CHARGE_FLG.ALL.getValue();
			if(MapUtils.getInteger(map1, "tax1_id") != null){
				tax1charge_flg =  firstNotEmpty(MapUtils.getString(map1, "tax1charge_flg"), ENUM_CHARGE_FLG.ALL.getValue());
			}else{
				tax1charge_flg = firstNotEmpty(MapUtils.getString(map2, "tax1charge_flg"), MapUtils.getString(map1, "svc_tax1charge_flg"), ENUM_CHARGE_FLG.ALL.getValue());
			}
			outBDD.setTax1chargeFlg(tax1charge_flg);
		}
		//设置tax2charge_flg
		{
			String tax2charge_flg = ENUM_CHARGE_FLG.ALL.getValue();
			if(MapUtils.getInteger(map1, "tax2_id") != null){
				tax2charge_flg = firstNotEmpty(MapUtils.getString(map1, "tax2charge_flg"), ENUM_CHARGE_FLG.ALL.getValue());
			}else{
				tax2charge_flg = firstNotEmpty(MapUtils.getString(map2, "tax2charge_flg"), MapUtils.getString(map1, "svc_tax2charge_flg"), ENUM_CHARGE_FLG.ALL.getValue());
			}
			outBDD.setTax2chargeFlg(tax2charge_flg);
		}
		//设置tax3charge_flg
		{
			String tax3charge_flg = ENUM_CHARGE_FLG.ALL.getValue();
			if(MapUtils.getInteger(map1, "tax3_id") != null){
				tax3charge_flg =  firstNotEmpty(MapUtils.getString(map1, "tax3charge_flg"), ENUM_CHARGE_FLG.ALL.getValue());
			}else{
				tax3charge_flg = firstNotEmpty(MapUtils.getString(map2, "tax3charge_flg"), MapUtils.getString(map1, "svc_tax3charge_flg"), ENUM_CHARGE_FLG.ALL.getValue());
			}
			outBDD.setTax3chargeFlg(tax3charge_flg);
		}
		//设置tax4charge_flg
		{
			String tax4charge_flg = ENUM_CHARGE_FLG.ALL.getValue();
			if(MapUtils.getInteger(map1, "tax4_id") != null){
				tax4charge_flg =  firstNotEmpty(MapUtils.getString(map1, "tax4charge_flg"), ENUM_CHARGE_FLG.ALL.getValue());
			}else{
				tax4charge_flg = firstNotEmpty(MapUtils.getString(map2, "tax4charge_flg"), MapUtils.getString(map1, "svc_tax4charge_flg"), ENUM_CHARGE_FLG.ALL.getValue());
			}
			outBDD.setTax4chargeFlg(tax4charge_flg);
		}
		//设置tax5charge_flg
		{
			String tax5charge_flg = ENUM_CHARGE_FLG.ALL.getValue();
			if(MapUtils.getInteger(map1, "tax5_id") != null){
				tax5charge_flg =  firstNotEmpty(MapUtils.getString(map1, "tax5charge_flg"), ENUM_CHARGE_FLG.ALL.getValue());
			}else{
				tax5charge_flg = firstNotEmpty(MapUtils.getString(map2, "tax5charge_flg"), MapUtils.getString(map1, "svc_tax5charge_flg"), ENUM_CHARGE_FLG.ALL.getValue());
			}
			outBDD.setTax5chargeFlg(tax5charge_flg);
		}

		return outBDD;
	}
	
	/** 
	 * ## 方法说明：
	 * 	第一个不为空的值
	 * @param strings
	 * @return
	*/
	private static String firstNotEmpty(String ...strings){
		String notEmptyValue = null;
		for(Integer i =0; i<strings.length;i++){
			notEmptyValue = strings[i];
			if(StringUtils.isNotEmpty(notEmptyValue)){
				break;
			}
		}
		return notEmptyValue;
	}
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, Map<Integer, Integer>> lhm = new LinkedHashMap<>();
		List<Map<Integer, Integer>> list = new ArrayList<>();
	/*	{
			Map<Integer, Integer>  map = new HashMap<>();
			map.put(100, 10);
			list.add(map);
		}
		{
			Map<Integer, Integer>  map = new HashMap<>();
			map.put(130, 80);
			list.add(map);
		}
		{
			Map<Integer, Integer>  map = new HashMap<>();
			map.put(150, 50);
			list.add(map);
		}
		{
			Map<Integer, Integer>  map = new HashMap<>();
			map.put(180, 30);
			list.add(map);
		}*/
	
		
		TreeMap<Integer, Integer>  map = new TreeMap<>();
		map.put(100, 10);
		map.put(130, 80);
		map.put(150, 50);
		map.put(180, 30);
		
		
		
		
		Integer cnt = 150;
		/*while(true){
			Integer tmp = map.ceilingKey(cnt);
		}*/
		Integer tmp = map.ceilingKey(cnt);
		System.out.println(tmp);
		
	}

}
