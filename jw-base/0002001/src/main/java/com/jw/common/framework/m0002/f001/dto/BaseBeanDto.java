/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.util.ListUtil;
import com.jw.base.framework.core.util.StringUtil;

/**
 * ## 类说明：
 * 	多业务ID通用请求DTO
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/21]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|IdsRequestDto.java新增
 */
@DrptDto(dtonm = "BaseBeanDto", dtodrpt = "报表bean")
public class BaseBeanDto implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/
	private static final long serialVersionUID = 6074181698802644064L;

	public static void getDic(DataTableDto resultDto, ResponseDictionaryDto dicDto) {
		Map<String, Map<String, Object>> paramObject = dicDto.getParamObject();
		List<Map<String, Object>> data = resultDto.getData();
		if (ListUtil.isNotEmpty(data) && paramObject != null) {
			Map<String, Object> dic1 = paramObject.get(ConstantParm.PARA_ROOMTYPE);
			Map<String, Object> dic2 = paramObject.get(ConstantParm.REPIARRSN);
			Map<String, Object> dic3 = paramObject.get(ConstantParm.BUILDING);
			Map<String, Object> dic4 = paramObject.get(ConstantParm.AREA);
			Map<String, Object> dic5 = paramObject.get(ConstantParm.FLOOR);
//			Map<String, Object> dic6 = paramObject.get(ConstantParm.BEDTYP);
			Map<String, Object> dic7 = paramObject.get(ConstantParm.VIP);
			Map<String, Object> dic8 = paramObject.get(ConstantParm.MARKET);
			// 交易小分类
			Map<String, Object> dic9 = paramObject.get(ConstantParm.TRNSUBCLS);
			Map<String, Object> dic10 = paramObject.get(ConstantParm.PARA_SALER);
			Map<String, Object> dic11 = paramObject.get(ConstantParm.TRNCLS);
			// 班次
			Map<String, Object> dic12 = paramObject.get(ConstantParm.PARA_TURN);

			Map<String, Object> dic13 = paramObject.get(ConstantParm.CCARDTYP);
			Map<String, Object> dic14 = paramObject.get(ConstantParm.PARA_POS_SALES);
			Map<String, Object> dic15 = paramObject.get(ConstantParm.SOURCE);
			Map<String, Object> dic16 = paramObject.get(ConstantParm.PARA_RATE);
			Map<String, Object> dic17 = paramObject.get(ConstantParm.PARA_CORP);
			Map<String, Object> dic18 = paramObject.get(ConstantParm.RATERSN);
			Map<String, Object> dic19 = paramObject.get(ConstantParm.ARTYPE);
			Map<String, Object> dic20 = paramObject.get(ConstantParm.GRP_FIN_BASE_TRNCODE_TRN_TYP);
			Map<String, Object> dic21 = paramObject.get(ConstantParm.COUNTRY);
			Map<String, Object> dic22 = paramObject.get(ConstantParm.CERTIFICATETYP);
			Map<String, Object> dic23 = paramObject.get(ConstantParm.PROVINCE);
			Map<String, Object> dic24 = paramObject.get(ConstantParm.PARA_PRODUCT);
			Map<String, Object> dic25 = paramObject.get(ConstantParm.PARA_GOODS);
			Map<String, Object> dic26 = paramObject.get(ConstantParm.NATION);
			Map<String, Object> dic27 = paramObject.get(ConstantParm.CITY);
			Map<String, Object> dic28 = paramObject.get(ConstantParm.WORKTITLE);
			//加收项目
			Map<String, Object> dic29 = paramObject.get(ConstantParm.EXTRAROOMRATE);
			for (Map<String, Object> bean : data) {
				if (dic1 != null && bean.get("roomtyp_id") != null) {
					Object object2 = dic1.get(bean.get("roomtyp_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("roomtyp_nm", StringUtil.toString(value.get("name"), null));
						bean.put("roomtyp_cd", StringUtil.toString(value.get("param_cd"), null));
					}
				}
				if (dic1 != null && bean.get("rate_roomtyp_id") != null) {
					Object object2 = dic1.get(bean.get("rate_roomtyp_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("rate_roomtyp_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic2 != null && bean.get("repairrsn_id") != null) {
					Object object2 = dic2.get(bean.get("repairrsn_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("repairrsn_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic3 != null && bean.get("building_id") != null) {
					Object object2 = dic3.get(bean.get("building_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("building_name", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic4 != null && bean.get("area_id") != null) {
					Object object2 = dic4.get(bean.get("area_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("area_name", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic5 != null && bean.get("floor_id") != null) {
					Object object2 = dic5.get(bean.get("floor_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("floor_name", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic7 != null && bean.get("vip_id") != null) {
					Object object2 = dic7.get(bean.get("vip_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("vip_name", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic8 != null && bean.get("normal") != null) {
					Object object2 = dic8.get(bean.get("normal").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("normal2", StringUtil.toString(value.get("name"), null));
					}
				} else if (dic8 != null && bean.get("market_id") != null) {
					Object object2 = dic8.get(bean.get("market_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("market_name", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic9 != null && bean.get("normal") != null) {
					Object object2 = dic9.get(bean.get("normal").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("normal1", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic9 != null && bean.get("trnsubcls_id") != null) {
					Object object2 = dic9.get(bean.get("trnsubcls_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("trnsubcls_nm", StringUtil.toString(value.get("name"), null));
					}
				} else if (dic9 != null && bean.get("subcls_id") != null) {
					Object object2 = dic9.get(bean.get("subcls_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("subcls_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic10 != null && bean.get("saler_id") != null) {
					Object object2 = dic10.get(bean.get("saler_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("saler_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic11 != null && bean.get("subcls_id") != null) {
					Object object2 = dic11.get(bean.get("subcls_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("subcls_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic12 != null && bean.get("turn_id") != null) {
					Object object2 = dic12.get(bean.get("turn_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("turn_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic13 != null && bean.get("ccardtyp_id") != null) {
					Object object2 = dic13.get(bean.get("ccardtyp_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("ccardtyp_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic14 != null && bean.get("sales_id") != null) {
					Object object2 = dic14.get(bean.get("sales_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("sales_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic15 != null && bean.get("source_id") != null) {
					Object object2 = dic15.get(bean.get("source_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("source_name", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic16 != null && bean.get("rate_id") != null) {
					Object object2 = dic16.get(bean.get("rate_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("rate_name", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic17 != null && bean.get("nego_corp_no") != null) {
					Object object2 = dic17.get(bean.get("nego_corp_no").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("nego_corp_no_nm", StringUtil.toString(value.get("name"), null));
					}
				} else if (dic17 != null && bean.get("corp_no") != null) {
					Object object2 = dic17.get(bean.get("corp_no").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("nego_corp_no_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic18 != null && bean.get("ratersn_id") != null) {
					Object object2 = dic18.get(bean.get("ratersn_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("ratersn_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic19 != null && bean.get("artype_id") != null) {
					Object object2 = dic19.get(bean.get("artype_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("artype_name", StringUtil.toString(value.get("name"), null));
					}
				}

				if (dic20 != null && bean.get("trn_typ") != null) {
					Object object2 = dic20.get(bean.get("trn_typ").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("trn_typ", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic21 != null && bean.get("country_id") != null) {
					Object object2 = dic21.get(bean.get("country_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("country_drpt", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic22 != null && bean.get("certificatetyp_id") != null) {
					Object object2 = dic22.get(bean.get("certificatetyp_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("certificatetyp_drpt", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic23 != null && bean.get("province_id") != null) {
					Object object2 = dic23.get(String.valueOf(bean.get("province_id")));
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("province_drpt", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic23 != null && bean.get("rprovince_id") != null) {
					Object object2 = dic23.get(String.valueOf(bean.get("province_id")));
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("rprovince_drpt", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic24 != null && bean.get("product_id") != null) {
					Object object2 = dic24.get(bean.get("product_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("product_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic25 != null && bean.get("goods_id") != null) {
					Object object2 = dic25.get(bean.get("goods_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("goods_nm", StringUtil.toString(value.get("name"), null));
						bean.put("goods_cd", StringUtil.toString(value.get("code"), null));
					}
				}
				if (dic26 != null && bean.get("nation_id") != null) {
					Object object2 = dic26.get(bean.get("nation_id").toString());
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("nation_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic27 != null && bean.get("city_id") != null) {
					Object object2 = dic27.get(String.valueOf(bean.get("city_id")));
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("city_drpt", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic27 != null && bean.get("rcity_id") != null) {
					Object object2 = dic27.get(String.valueOf(bean.get("rcity_id")));
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("rcity_drpt", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic28 != null && bean.get("worktitle_id") != null) {
					Object object2 = dic28.get(String.valueOf(bean.get("worktitle_id")));
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("worktitle_drpt", StringUtil.toString(value.get("name"), null));
					}
				}
				if (dic29 != null && bean.get("dptpost_id") != null) {
					Object object2 = dic29.get(String.valueOf(bean.get("dptpost_id")));
					if (object2 != null) {
						Map<String, Object> value = (Map<String, Object>) object2;
						bean.put("dptpost_nm", StringUtil.toString(value.get("name"), null));
					}
				}
				
			}
			resultDto.setData(data);
		}
	}

}
