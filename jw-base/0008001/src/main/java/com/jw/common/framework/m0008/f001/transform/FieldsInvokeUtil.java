/**   
* @Title: FieldsInvokeUtil.java 
* @Package com.jw.common.framework.m0008.f001.transform 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年2月6日 上午10:56:31 
* @version V1.0   
*/
package com.jw.common.framework.m0008.f001.transform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.ConstantEs;
import com.jw.base.framework.core.ConstantParmTran;
import com.jw.base.framework.core.servlet.SharedMap;
import com.jw.base.framework.core.util.DateUtil;
import com.jw.base.framework.core.util.GenerateKeyUtil;
import com.jw.base.framework.core.util.StringUtil;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年2月6日]
 * @package com.jw.common.framework.m0008.f001.transform
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年2月6日|bwliu|新增|FieldsInvokeUtil.java新增
*/
public class FieldsInvokeUtil {
	
	//dto.field ==> 自定义特殊类型
	private static Map<String, String> configMap_trantype = SharedMap.getTrantype();
	
	//反射到相应get方法，获取属性值，并拼接成"属性名:属性值;"字符串
	/**
	 * ## 方法说明：
	 * 	数据传输验证 
	 * @param type 属性的类型【class java.lang.String\class java.lang.Integer】
	 * @param name 属性的首字符大写，方便构造get，set方法
	 * @param nameOld 属性的名字
	 * @param obj 对象
	 * @param languageId 语种
	 * @param dbmap 数据源集合
	 *              【310:pms_0001_000001】
	 *              【210:grp_0001】
	 * @param datamap 翻译后的key和value【submitmap 或 originmap】
	 * @param configMap
	 *              dtonm.fieldnm                                          ==>   fielddrpt
	 *              com.jw.hms.pms.m3250.f010.entity.HptHkRoom.phoneFlg    ==>   电话开通级别
	 *              com.jw.hms.pms.m3250.f010.entity.HptHkRoom。areaReal    ==>   逻辑楼区
	 *              com.jw.hms.pms.m3250.f010.entity.HptHkRoom。floorId     ==>   楼层代码
	 *              com.jw.hms.pms.m3250.f010.entity.HptHkRoom。buildingId  ==>   楼座代码
	 *              com.jw.hms.pms.m3250.f010.entity.HptHkRoom。areaId      ==>   楼区代码
	 *              com.jw.hms.pms.m3250.f010.entity.HptHkRoom。internetFlg ==>   网络开通标识
	 * @param datamapTran 特殊转换List
	 *             [{uuid:{tranKey:xxxxxx, tranValue:xxxxxx, tranType:xxxxxx}},
	 *              {uuid:{tranKey:xxxxxx, tranValue:xxxxxx, tranType:xxxxxx}},
	 *              {uuid:{tranKey:xxxxxx, tranValue:xxxxxx, tranType:xxxxxx}}]
	 * @return
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static String invokeMethod(String type, String name, String nameOld, Object obj, String languageId, Map<String, String> dbmap, Map<String, String> datamap, Map<String, String> configMap, Map<String, Map<String, String>> datamapTran) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		StringBuilder sb = new StringBuilder();
		if (type.equals(ConstantParmTran.TYPE_STRING)) { // 如果type是类类型，则前面包含"class// "，后面跟类名
			Method m = obj.getClass().getMethod("get" + name);
			String value = (String) m.invoke(obj); // 调用getter方法获取属性值
			if (value != null) {
				String key = obj.getClass().getName() + "." + nameOld;
				if(StringUtil.isNotEmpty(configMap_trantype.get(key)) && null!=datamapTran){
					///////////////////////////////////////////////////////
					///////////////////////keyno转换////////////////////////
					///////////////////////////////////////////////////////
//					sb.append(ConstantEs.SPLIT_LEFT);
//					sb.append(FieldsTranUtil.tranBySqls(configMap_trantype.get(key), dbmap, value, type, configMap, languageId));
//					sb.append(ConstantEs.SPLIT_RIGHT + ConstantEs.SPLIT_STR);
					Map<String, String> tranMap = new HashMap<String, String>();
					tranMap.put("tranKey", key);
					tranMap.put("tranValue", value);
					tranMap.put("tranType", type);
					datamapTran.put(GenerateKeyUtil.getUUID(), tranMap);
				}else{
					String appendkey = configMap.get(key)==null ? key :configMap.get(key);
					///////////////////////字典转换////////////////////////
					String appendvalue = FieldsParamUtil.tranValue(value, nameOld, obj.getClass().getName(), languageId, dbmap.get(Constant.ENUM_DATA_TYP.GRP.getValue()));
					sb.append(ConstantEs.SPLIT_LEFT +  ConstantEs.SPLIT_COVR_MAP.get(languageId));
					sb.append(appendkey);
					sb.append(ConstantEs.SPLIT_MID);
					sb.append(appendvalue);
					sb.append(ConstantEs.SPLIT_RIGHT);
					sb.append(ConstantEs.SPLIT_STR);
					//考虑appendkey值重复的情况
					datamap.put(FieldsInvokeUtil.mapHasKey(datamap, appendkey), appendvalue);
				}
			}
		}else
		if (type.equals(ConstantParmTran.TYPE_INTEGER)) {
			Method m = obj.getClass().getMethod("get" + name);
			Integer value = (Integer) m.invoke(obj);
			if (value != null) {
				String key = obj.getClass().getName() + "." + nameOld;
				if(StringUtil.isNotEmpty(configMap_trantype.get(key)) && null!=datamapTran){
					///////////////////////////////////////////////////////
					///////////////////////keyno转换////////////////////////
					///////////////////////////////////////////////////////
//					sb.append(ConstantEs.SPLIT_LEFT);
//					sb.append(FieldsTranUtil.tranBySqls(configMap_trantype.get(key), dbmap, value, type, configMap, languageId));
//					sb.append(ConstantEs.SPLIT_RIGHT + ConstantEs.SPLIT_STR);
					Map<String, String> tranMap = new HashMap<String, String>();
					tranMap.put("tranKey", key);
					tranMap.put("tranValue", ""+value+"");
					tranMap.put("tranType", type);
					datamapTran.put(GenerateKeyUtil.getUUID(), tranMap);
				}else{
					String appendkey = configMap.get(key)==null ? key :configMap.get(key);
					///////////////////////字典转换////////////////////////
					String appendvalue = FieldsParamUtil.tranValue(String.valueOf(value), nameOld, obj.getClass().getName(), languageId, dbmap.get(Constant.ENUM_DATA_TYP.GRP.getValue()));
					sb.append(ConstantEs.SPLIT_LEFT + ConstantEs.SPLIT_COVR_MAP.get(languageId));
					sb.append(appendkey);
					sb.append(ConstantEs.SPLIT_MID);
					sb.append(appendvalue);
					sb.append(ConstantEs.SPLIT_RIGHT);
					sb.append(ConstantEs.SPLIT_STR);
					//考虑appendkey值重复的情况
					datamap.put(FieldsInvokeUtil.mapHasKey(datamap, appendkey), appendvalue);
				}
			}
		}else
		if (type.equals(ConstantParmTran.TYPE_BIGDECIMAL)) {
			Method m = obj.getClass().getMethod("get" + name);
			BigDecimal value = (BigDecimal) m.invoke(obj);
			if (value != null) {
				String key = obj.getClass().getName() + "." + nameOld;
				String appendkey = configMap.get(key)==null ? key :configMap.get(key);
				String appendvalue = null==value?"":value.toString();
				sb.append(ConstantEs.SPLIT_LEFT + ConstantEs.SPLIT_COVR_MAP.get(languageId));
				sb.append(appendkey);
				sb.append(ConstantEs.SPLIT_MID);
				sb.append(appendvalue);
				sb.append(ConstantEs.SPLIT_RIGHT);
				sb.append(ConstantEs.SPLIT_STR);
				//考虑appendkey值重复的情况
				datamap.put(FieldsInvokeUtil.mapHasKey(datamap, appendkey), appendvalue);
			}
		}else
		if (type.equals(ConstantParmTran.TYPE_BOOLEAN)) {
			Method m = obj.getClass().getMethod("get" + name);
			Boolean value = (Boolean) m.invoke(obj);
			if (value != null) {
				String key = obj.getClass().getName() + "." + nameOld;
				String appendkey = configMap.get(key)==null ? key :configMap.get(key);
				String appendvalue = null==value?"":value.toString();
				sb.append(ConstantEs.SPLIT_LEFT + ConstantEs.SPLIT_COVR_MAP.get(languageId));
				sb.append(appendkey);
				sb.append(ConstantEs.SPLIT_MID);
				sb.append(appendvalue);
				sb.append(ConstantEs.SPLIT_RIGHT);
				sb.append(ConstantEs.SPLIT_STR);
				//考虑appendkey值重复的情况
				datamap.put(FieldsInvokeUtil.mapHasKey(datamap, appendkey), appendvalue);
			}
		}else
		if (type.equals(ConstantParmTran.TYPE_DATE)) {
			Method m = obj.getClass().getMethod("get" + name);
			Date value = (Date) m.invoke(obj);
			if (value != null) {
				String key = obj.getClass().getName() + "." + nameOld;
				String appendkey = configMap.get(key)==null ? key :configMap.get(key);
				String appendvalue = DateUtil.formatDate(value, DateUtil.DATE_FORMAT);
				sb.append(ConstantEs.SPLIT_LEFT + ConstantEs.SPLIT_COVR_MAP.get(languageId));
				sb.append(appendkey);
				sb.append(ConstantEs.SPLIT_MID);
				sb.append(appendvalue);
				sb.append(ConstantEs.SPLIT_RIGHT);
				sb.append(ConstantEs.SPLIT_STR);
				//考虑appendkey值重复的情况
				datamap.put(FieldsInvokeUtil.mapHasKey(datamap, appendkey), appendvalue);
			}
		}else
		if (type.contains(ConstantParmTran.TYPE_LIST)) {
			Method m = obj.getClass().getMethod("get" + name);
			List<?> value = (List<?>) m.invoke(obj);
			if (value != null) {
				String key = obj.getClass().getName() + "." + nameOld;
				String appendkey = configMap.get(key)==null ? key :configMap.get(key);
				String appendvalue = null==value?"":value.toString();
				sb.append(ConstantEs.SPLIT_LEFT + ConstantEs.SPLIT_COVR_MAP.get(languageId));
				sb.append(appendkey);
				sb.append(ConstantEs.SPLIT_MID);
				sb.append(appendvalue);
				sb.append(ConstantEs.SPLIT_RIGHT);
				sb.append(ConstantEs.SPLIT_STR);
				//考虑appendkey值重复的情况
				datamap.put(FieldsInvokeUtil.mapHasKey(datamap, appendkey), appendvalue);
			}
		}
		return sb.toString();
	}
	
	/**
	 * ## 方法说明：
	 * 	map中是或否有传入的key
		如果没有，返回传入的key，
		如果有，返回key上拼接一个+号，再进行迭代判断，直到没有为止
	 * @param map
	 * @return
	 */
	public static String mapHasKey(Map<String, String> map, String key){
		if (!map.containsKey(key)){
			return key;
		}else{
			return mapHasKey(map, key+"+");
		}
	}
}
