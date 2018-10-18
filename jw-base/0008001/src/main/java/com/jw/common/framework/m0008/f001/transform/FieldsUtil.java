package com.jw.common.framework.m0008.f001.transform;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.ConstantEs;
import com.jw.base.framework.core.servlet.SharedMap;
import com.jw.base.framework.core.util.ClassUtil;
import com.jw.base.framework.core.util.DateUtil;
import com.jw.base.framework.core.util.FastJsonUtil;
import com.jw.base.framework.core.util.ListUtil;
import com.jw.base.framework.core.util.StringUtil;
import com.jw.common.framework.m0002.f001.dto.LogContentDto;
import com.jw.common.framework.m0002.f001.dto.LogInfoDto;
import com.jw.common.framework.m0002.f001.dto.LogTranDto;
import com.jw.common.framework.m0002.f001.dto.api.LogOrigin;

//工具SQL_1
//select id, 'configMap_zh.put("' || dtonm || '.' ||fieldnm || '", "' || fielddrpt || '");' from jw_platform.ind_dtofield where dtonm like '%RsvAccountGuestDto%'
//工具SQL_2
//SELECT DISTINCT 'public static final String ' || replace(replace(attribute_typ, '.', '_'), '-', '_') || '= "' || attribute_typ || '";' FROM  plf_dd_attribute 
//order by 'public static final String ' || replace(replace(attribute_typ, '.', '_'), '-', '_') || '= "' || attribute_typ || '";'
public class FieldsUtil {

	//dto.field ==> field属性描述信息
	private static Map<String, String> configMap_zh = SharedMap.getConfigZh();
	private static Map<String, String> configMap_en = SharedMap.getConfigEn();
	private static Map<String, String> configMap_jp = SharedMap.getConfigJp();
	
	private static Map<String, String> interfacedefMap_zh = SharedMap.getInterfacedefMapZh();
	private static Map<String, String> interfacedefMap_en = SharedMap.getInterfacedefMapEn();
	private static Map<String, String> interfacedefMap_jp = SharedMap.getInterfacedefMapJp();
	
	//dto.field ==> 自定义特殊类型
	private static Map<String, String> configMap_trantype = SharedMap.getTrantype();
		
	//dto.field ==> drptmap(Map描述信息)
	private static Map<String, String> configMap_dtoField_drptmap = SharedMap.getDrptmap();
	
	//dto.field ==> propertymap(Map属性信息：表名.字段名【property_nm】)
	private static Map<String, String> configMap_dtoField_propertymap = SharedMap.getDrptmap();
	
	private final static String[] TYPES = { "java.lang.Integer", 
									 		"java.lang.Double", 
									 		"java.lang.Float", 
									 		"java.lang.Long",
									 		"java.lang.Short", 
									 		"java.lang.Byte", 
									 		"java.lang.Boolean", 
									 		"java.lang.Character", 
									 		"java.lang.String",
									 		"java.lang.Object", 
									 		"java.lang.Class",
									 		"java.util.Date",
									 		"java.math.BigDecimal",
									 		"int", 
									 		"double", 
									 		"long", 
									 		"short", 
									 		"byte", 
									 		"boolean", 
									 		"char", 
									 		"float",
									 		"class" };
	/**
	 * NORMAL:基本类型和封装类型
	 * DTO:dto类类型
	 * ARRAY:list类型
	 * MAP:map类型
	 */
	private final static String[] FIELDTYP={"NORMAL", "DTO", "ARRAY", "MAP"};
	
	private static Map<String, String> getConfigMap(String languageId){
		switch (languageId) {
			case ConstantEs.LANGUAG_ZH:
				return configMap_zh;
			case ConstantEs.LANGUAG_EN:
				return configMap_en;
			case ConstantEs.LANGUAG_JP:
				return configMap_jp;
			default:
				return configMap_zh;
		}
	}
	
	private static Map<String, String> getInterfacedefMap(String languageId){
		switch (languageId) {
			case ConstantEs.LANGUAG_ZH:
				return interfacedefMap_zh;
			case ConstantEs.LANGUAG_EN:
				return interfacedefMap_en;
			case ConstantEs.LANGUAG_JP:
				return interfacedefMap_jp;
			default:
				return interfacedefMap_zh;
		}
	}
	
	//获取内容
	public static List<String> getTransformObjectSpec(LogInfoDto logDto, String languageId, Map<String, String> dbmap){
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		Map<String, String> configMap = getConfigMap(languageId);
		Map<String, String> interfacedefMap = getInterfacedefMap(languageId);
		sb.append(ConstantEs.SPLIT_LEFT + ConstantEs.OPT_DATE.get(languageId) + ConstantEs.SPLIT_MID + DateUtil.formatDate(logDto.getLogDhms(), DateUtil.DATE_FORMAT) + ConstantEs.SPLIT_RIGHT + ConstantEs.SPLIT_STR +
				  ConstantEs.SPLIT_LEFT + ConstantEs.OPT_PEOPLE.get(languageId) + ConstantEs.SPLIT_MID + logDto.getCreatedBy() + ConstantEs.SPLIT_RIGHT + ConstantEs.SPLIT_STR +
				  ConstantEs.SPLIT_LEFT + ConstantEs.OPT_NAME.get(languageId) + ConstantEs.SPLIT_MID + interfacedefMap.get(logDto.getClassName() + "." + logDto.getMethodName()) + ConstantEs.SPLIT_RIGHT + ConstantEs.SPLIT_STR);
		if (null != configMap && ListUtil.isNotEmpty(logDto.getContent())) {
			for (LogContentDto logContentDto : logDto.getContent()){
				String old_value = logContentDto.getFieldValueOld();
				String new_value = logContentDto.getFieldValueNew();
				if (StringUtil.isNotEmpty(old_value)){
					old_value = FieldsParamUtil.tranValueSpec(old_value, logContentDto.getParamtype(), logContentDto.getParamsubtype(), languageId, dbmap.get(Constant.ENUM_DATA_TYP.GRP.getValue()));
				}
				if (StringUtil.isNotEmpty(new_value)){
					new_value = FieldsParamUtil.tranValueSpec(new_value, logContentDto.getParamtype(), logContentDto.getParamsubtype(), languageId, dbmap.get(Constant.ENUM_DATA_TYP.GRP.getValue()));
				}
				
				sb.append(ConstantEs.SPLIT_LEFT + 
						  ConstantEs.RECORD_KEY.get(languageId) + ConstantEs.SPLIT_MID + logContentDto.getKeyValue() + ConstantEs.SPLIT_COMMA + 
						  ConstantEs.SPLIT_COVR_MAP.get(languageId) + configMap.get(logContentDto.getFieldnm()) + ConstantEs.SPLIT_COMMA + 
						  ConstantEs.SPLIT_OLD_MAP.get(languageId) + ConstantEs.SPLIT_MID + old_value + ConstantEs.SPLIT_COMMA + 
						  ConstantEs.SPLIT_NEW_MAP.get(languageId) + ConstantEs.SPLIT_MID + new_value + 
						  ConstantEs.SPLIT_RIGHT + 
						  ConstantEs.SPLIT_STR);
			}
		}
		if (null != configMap && ListUtil.isNotEmpty(logDto.getTranContent())) {
			for (LogTranDto logTranDto : logDto.getTranContent()){
				StringBuilder sbTran = new StringBuilder();
				sbTran.append(ConstantEs.SPLIT_LEFT + 
						  ConstantEs.RECORD_KEY.get(languageId) + ConstantEs.SPLIT_MID + logTranDto.getKeyValue() + ConstantEs.SPLIT_COMMA + 
						  configMap.get(logTranDto.getFieldnm()) + ConstantEs.SPLIT_MID + logTranDto.getFieldvalue() + ConstantEs.SPLIT_COMMA + 
						  FieldsTranUtil.tranBySqls(logTranDto.getTrantype(), dbmap, logTranDto.getFieldvalue(), logTranDto.getFieldtype(), configMap, languageId) + 
						  ConstantEs.SPLIT_RIGHT + 
						  ConstantEs.SPLIT_STR);
				sb.append(sbTran.toString());
				sb2.append(sbTran.toString());
			}
		}
		if (StringUtil.isNotEmpty(sb.toString())){
			sb.delete(sb.length()-3, sb.length()-1);
		}
		if (StringUtil.isNotEmpty(sb2.toString())){
			sb2.delete(sb2.length()-3, sb2.length()-1);
		}
		List<String> ll = new ArrayList<String>();
		ll.add(sb.toString());
		ll.add(sb2.toString());
		return ll;
	}
	
	//获取SubmitData和OriginData对比内容
	public static List<String> getTransformObject(LogInfoDto logDto, String languageId, Map<String, String> dbmap) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb_submitData = new StringBuilder();
		StringBuilder sb_originData = new StringBuilder();
		
		Map<String, String> submitmap = new HashMap<String, String>();
		Map<String, String> originmap = new HashMap<String, String>();
		Map<String, Map<String, String>> datamapTran = new HashMap<String, Map<String, String>>();
		
		Map<String, String> configMap = getConfigMap(languageId);
		Map<String, String> interfacedefMap = getInterfacedefMap(languageId);
		sb.append(ConstantEs.SPLIT_LEFT + ConstantEs.OPT_DATE.get(languageId) + ConstantEs.SPLIT_MID + DateUtil.formatDate(logDto.getLogDhms(), DateUtil.DATE_FORMAT) + ConstantEs.SPLIT_RIGHT + ConstantEs.SPLIT_STR +
				  ConstantEs.SPLIT_LEFT + ConstantEs.OPT_PEOPLE.get(languageId) + ConstantEs.SPLIT_MID + logDto.getCreatedBy() + ConstantEs.SPLIT_RIGHT + ConstantEs.SPLIT_STR +
				  ConstantEs.SPLIT_LEFT + ConstantEs.OPT_NAME.get(languageId) + ConstantEs.SPLIT_MID + interfacedefMap.get(logDto.getClassName() + "." + logDto.getMethodName()) + ConstantEs.SPLIT_RIGHT + ConstantEs.SPLIT_STR);
		if (null != configMap) {
			if (!"".equals(logDto.getRequestData())) {
				//获取logDto中的RequestData
				Object obj = FastJsonUtil.toBean(logDto.getRequestData(),Class.forName(logDto.getRequestDtoName()));
				//日志还原
				if (obj instanceof LogOrigin) {
					Field[] field = obj.getClass().getDeclaredFields();
					for (int j = 0; j < field.length; j++) {
						//只有submitData才去获取相应Tran-Datamap
						if ("submitData".equalsIgnoreCase(field[j].getName())){
							if (FieldType(field[j].getType()).equalsIgnoreCase("ARRAY")) {
								String name = field[j].getName().substring(0, 1).toUpperCase() + field[j].getName().substring(1); // 将属性的首字符大写，方便构造get，set方法
								Method m = obj.getClass().getMethod("get" + name);
								List<Object> value = (List<Object>) m.invoke(obj); // 调用getter方法获取属性值
								if(null != value){
									sb_submitData.append(getSubObject(value, languageId, dbmap, submitmap, configMap, datamapTran));
								}
							}
							if (FieldType(field[j].getType()).equalsIgnoreCase("DTO")) {
								String name = field[j].getName().substring(0, 1).toUpperCase() + field[j].getName().substring(1); // 将属性的首字符大写，方便构造get，set方法
								Method m = obj.getClass().getMethod("get" + name);
								Object value = (Object) m.invoke(obj); // 调用getter方法获取属性值
								if(null != value){
									//递归获取嵌套dto的内容
									sb_submitData.append(getSubObject(value, languageId, dbmap, submitmap, configMap, datamapTran));
								}
							}
						}
						if ("originData".equalsIgnoreCase(field[j].getName())){
							if (FieldType(field[j].getType()).equalsIgnoreCase("ARRAY")) {
								String name = field[j].getName().substring(0, 1).toUpperCase() + field[j].getName().substring(1); // 将属性的首字符大写，方便构造get，set方法
								Method m = obj.getClass().getMethod("get" + name);
								List<Object> value = (List<Object>) m.invoke(obj); // 调用getter方法获取属性值
								if(null != value){
									sb_originData.append(getSubObject(value, languageId, dbmap, originmap, configMap, null));
								}
							}
							if (FieldType(field[j].getType()).equalsIgnoreCase("DTO")) {
								String name = field[j].getName().substring(0, 1).toUpperCase() + field[j].getName().substring(1); // 将属性的首字符大写，方便构造get，set方法
								Method m = obj.getClass().getMethod("get" + name);
								Object value = (Object) m.invoke(obj); // 调用getter方法获取属性值
								if(null != value){
									//递归获取嵌套dto的内容
									sb_originData.append(getSubObject(value, languageId, dbmap, originmap, configMap, null));
								}
							}
						}
					}
				}
			}
		}
//		System.err.println("submitData---------"+sb_submitData.toString());
//		System.err.println("originData---------"+sb_originData.toString());
//		System.err.println("equals---------"+sb_submitData.toString().equals(sb_originData.toString()));
//		System.err.println("submitmap---------"+submitmap);
//		System.err.println("originmap---------"+originmap);
		for (Map.Entry submit_m : submitmap.entrySet()){
			//原值originData，中有submitData的属性，并且原值与新值不同
			if (null!=originmap.get(submit_m.getKey()) && !submit_m.getValue().equals(originmap.get(submit_m.getKey()))){
				System.out.println("KEY================================="+submit_m.getKey());
				System.out.println("原值================================="+originmap.get(submit_m.getKey()));
				System.out.println("新值================================="+submit_m.getValue());
				sb.append(ConstantEs.SPLIT_LEFT + 
						  ConstantEs.SPLIT_COVR_MAP.get(languageId) + submit_m.getKey() + ConstantEs.SPLIT_COMMA + 
						  ConstantEs.SPLIT_OLD_MAP.get(languageId) + ConstantEs.SPLIT_MID + originmap.get(submit_m.getKey()) + ConstantEs.SPLIT_COMMA + 
						  ConstantEs.SPLIT_NEW_MAP.get(languageId) + ConstantEs.SPLIT_MID + submit_m.getValue() + 
						  ConstantEs.SPLIT_RIGHT + 
						  ConstantEs.SPLIT_STR);
			}
		}
		//拼接特殊转换
		if (MapUtils.isNotEmpty(datamapTran)){
			for (Map.Entry tranm : datamapTran.entrySet()){
				Map<String, String> mapm = (Map<String, String>) tranm.getValue();
				if(StringUtil.isNotEmpty(configMap_trantype.get(mapm.get("tranKey")))){
					StringBuilder sbTran = new StringBuilder();
					String tranStr = FieldsTranUtil.tranBySqls(configMap_trantype.get(mapm.get("tranKey")), dbmap, mapm.get("tranValue"), mapm.get("tranType"), configMap, languageId);
					sbTran.append(ConstantEs.SPLIT_LEFT);
					sbTran.append(tranStr);
					sbTran.append(ConstantEs.SPLIT_RIGHT + ConstantEs.SPLIT_STR);
					//System.err.println("))))))))))))))sbTran.toString()))))))))))))))))))))))))"+sbTran.toString());
					if (StringUtil.isNotEmpty(tranStr) && sb.toString().indexOf(tranStr)==-1){
						sb.append(sbTran.toString());
						sb2.append(sbTran.toString());
					}
				}
			}
		}
		if (StringUtil.isNotEmpty(sb.toString())){
			sb.delete(sb.length()-3, sb.length()-1);
		}
		if (StringUtil.isNotEmpty(sb2.toString())){
			sb2.delete(sb2.length()-3, sb2.length()-1);
		}
		List<String> ll = new ArrayList<String>();
		ll.add(sb.toString());
		ll.add(sb2.toString());
		return ll;
	}
	
	
	/**
	 * ## 方法说明：
	 * 	递归获取嵌套dto的内容
	 * @param obj 被递归对象
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
	private final static String getSubObject(Object obj, String languageId, Map<String, String> dbmap, Map<String, String> datamap, Map<String, String> configMap, Map<String, Map<String, String>> datamapTran) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		StringBuilder sb = new StringBuilder();
		if (FieldType(obj.getClass()).equalsIgnoreCase("DTO")) {
			// 获取dto类的所有属性，返回Field数组
			Field[] field = obj.getClass().getDeclaredFields();
			for (int j = 0; j < field.length; j++) { // 遍历所有属性
				//过滤无用字段用
				if (isValidField(field[j].getName())){
					if (FieldType(field[j].getType()).equalsIgnoreCase("DTO")) {//字段为dto字段
						String name = field[j].getName().substring(0, 1).toUpperCase() + field[j].getName().substring(1); // 将属性的首字符大写，方便构造get，set方法
						Method m = obj.getClass().getMethod("get" + name);
						Object value = (Object) m.invoke(obj); // 调用getter方法获取属性值
						if(null != value){
							//递归获取嵌套dto的内容
							sb.append(getSubObject(value, languageId, dbmap, datamap, configMap, datamapTran));
						}
					}else if (FieldType(field[j].getType()).equalsIgnoreCase("ARRAY")) {//字段为list字段
						Type typeChild = ClassUtil.getSubGenericType(field[j]);
						if (null!=typeChild){
							if(typeChild.getTypeName().startsWith("java.util.List")){
								String name = field[j].getName().substring(0, 1).toUpperCase() + field[j].getName().substring(1); // 将属性的首字符大写，方便构造get，set方法
								Method m = obj.getClass().getMethod("get" + name);
								List<Object> value = (List<Object>) m.invoke(obj); // 调用getter方法获取属性值
								if(ListUtil.isNotEmpty(value)){
									for(Object subo : value){
										//递归获取嵌套dto的内容
										sb.append(getSubObject(subo, languageId, dbmap, datamap, configMap, datamapTran));
									}
								}
							}else
							if(typeChild.getTypeName().startsWith("java.util.Map")){
								String name = field[j].getName().substring(0, 1).toUpperCase() + field[j].getName().substring(1); // 将属性的首字符大写，方便构造get，set方法
								Method m = obj.getClass().getMethod("get" + name);
								List<Object> value = (List<Object>) m.invoke(obj); // 调用getter方法获取属性值
								if(ListUtil.isNotEmpty(value)){
									for(Object subo : value){
										//递归获取嵌套dto的内容
										sb.append(getSubObject(subo, languageId, dbmap, datamap, configMap, datamapTran));
									}
								}
							}else
							if(!typeChild.getTypeName().startsWith("org.apache.commons.collections4")){
								//泛型类型type
								Class<?> type = (Class<?>)typeChild;
								//如果是非DTO对象、ARRAY、MAP
								if (FieldType(type).equalsIgnoreCase("NORMAL")) {
									String nameOld = field[j].getName(); // 获取属性的名字
									String name = nameOld.substring(0, 1).toUpperCase() + nameOld.substring(1); // 将属性的首字符大写，方便构造get，set方法
									String typeSub = field[j].getGenericType().toString(); // 获取属性的类型
									//反射到相应get方法，获取属性值，并拼接成"属性名:属性值;"字符串
									sb.append(FieldsInvokeUtil.invokeMethod(typeSub, name, nameOld, obj, languageId, dbmap, datamap, configMap, datamapTran));
								}else{
									String name = field[j].getName().substring(0, 1).toUpperCase() + field[j].getName().substring(1); // 将属性的首字符大写，方便构造get，set方法
									Method m = obj.getClass().getMethod("get" + name);
									List<Object> value = (List<Object>) m.invoke(obj); // 调用getter方法获取属性值
									if(ListUtil.isNotEmpty(value)){
										for(Object subo : value){
											//递归获取嵌套dto的内容
											sb.append(getSubObject(subo, languageId, dbmap, datamap, configMap, datamapTran));
										}
									}
								}
							}
						}
						
					}else if (FieldType(field[j].getType()).equalsIgnoreCase("MAP")) {//字段为map字段
						String nameOld = field[j].getName(); // 获取属性的名字
						String name = field[j].getName().substring(0, 1).toUpperCase() + field[j].getName().substring(1); // 将属性的首字符大写，方便构造get，set方法
						Method m = obj.getClass().getMethod("get" + name);
						Map<?,?> value = (Map<?,?>) m.invoke(obj); // 调用getter方法获取属性值
						if (null!=value){
							for(Map.Entry<?, ?> map : value.entrySet()){
								String mapStr = configMap_dtoField_drptmap.get(obj.getClass().getName() + "." + nameOld)==null ? obj.getClass().getName() + "." + nameOld + "." + map.getKey() :configMap_dtoField_drptmap.get(obj.getClass().getName() + "." + nameOld);
								if (!(obj.getClass().getName() + "." + nameOld + "." + map.getKey()).equals(mapStr)){
									if (StringUtil.isNotEmpty(mapStr)){
										Map<?,?> mm = FastJsonUtil.toBean(mapStr, Map.class);
										String appendkey = mm.get(map.getKey()).toString();
										String appendvalue = null==map.getValue()?"":map.getValue().toString();
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
							}
						}
					}else{
						String nameOld = field[j].getName(); // 获取属性的名字
						String name = nameOld.substring(0, 1).toUpperCase() + nameOld.substring(1); // 将属性的首字符大写，方便构造get，set方法
						String type = field[j].getGenericType().toString(); // 获取属性的类型
						//反射到相应get方法，获取属性值，并拼接成"属性名:属性值;"字符串
						sb.append(FieldsInvokeUtil.invokeMethod(type, name, nameOld, obj, languageId, dbmap, datamap, configMap, datamapTran));
					}
				}
			}
		}else if (FieldType(obj.getClass()).equalsIgnoreCase("ARRAY")) {
			List<Object> value = (List<Object>) obj;
			if(ListUtil.isNotEmpty(value)){
				for(Object subo : value){
					//递归获取嵌套dto的内容
					sb.append(getSubObject(subo, languageId, dbmap, datamap, configMap, datamapTran));
				}
			}
		}else if (FieldType(obj.getClass()).equalsIgnoreCase("MAP")) {
			Map<?,?> mm  = (Map<?,?>)obj;
			if (null!=mm){
				for(Map.Entry<?, ?> m : mm.entrySet()){
//					System.err.println("--------------------------"+m.getKey());
//					System.err.println("--------------------------"+m.getValue());
				}
			}
		}
		return sb.toString();
	}
	
	//判断是否是有效字段
	//过滤无用字段用
	private final static Boolean isValidField(String fieldName){
		Boolean flag = true;
		if ("serialVersionUID".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("version".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		
		if ("createdBy".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("createdDate".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("createdByUid".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("createdByCd".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("createdUnitUid".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("createdUnitCd".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		
		if ("modifiedBy".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("modifiedDate".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("modifiedByUid".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("modifiedByCd".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("modifiedUnitUid".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		if ("modifiedUnitCd".equalsIgnoreCase(fieldName)){
			flag = false;
		}
		
		return flag;
	}
	
	//获取字段类型
	private final static String FieldType(Class<?> cls){
		Integer i=1;
		if (Arrays.asList(TYPES).contains(cls.getName())) {
			i=0;
		}else if (Iterable.class.isAssignableFrom(cls) || cls.isArray()) {
			i=2;
		}else if (Map.class.isAssignableFrom(cls)) {
			i=3;
		}
		return FIELDTYP[i];
	}
	
}
