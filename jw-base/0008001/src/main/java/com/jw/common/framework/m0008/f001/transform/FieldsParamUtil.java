/**   
* @Title: FieldsValueUtil.java 
* @Package com.jw.common.framework.m0008.f001.transform 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年2月6日 上午10:29:07 
* @version V1.0   
*/
package com.jw.common.framework.m0008.f001.transform;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.cache.JwCache;
import com.jw.base.framework.core.servlet.SharedMap;
import com.jw.base.framework.core.util.AppUtil;
import com.jw.base.framework.core.util.ListUtil;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年2月6日]
 * @package com.jw.common.framework.m0008.f001.transform
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年2月6日|bwliu|新增|FieldsValueUtil.java新增
*/
public class FieldsParamUtil {

	//dto.field ==> paramtype(大类)
	private static Map<String, String> configMap_dtoField_paramtype = SharedMap.getParamTypeName();
	
	//dto.field ==> paramsubtype(小类)
	private static Map<String, String> configMap_dtoField_paramsubtype = SharedMap.getParamSubTypeName();
	
	private static JwCache jwCache;
	
	public static JwCache getJwCache() {
		jwCache = (JwCache) AppUtil.getBean("redisImpl");
		
//		Set<HostAndPort> haps = new HashSet<HostAndPort>();
//		haps.add(new HostAndPort("redisCluster",7000));
//		haps.add(new HostAndPort("redisCluster",6999));
//		haps.add(new HostAndPort("redisCluster",6998));
//		haps.add(new HostAndPort("redisCluster",6997));
//		haps.add(new HostAndPort("redisCluster",6996));
//		haps.add(new HostAndPort("redisCluster",6995));
//		JedisCluster jedisCluster = new JedisCluster(haps, 2000, 3000, 5, new GenericObjectPoolConfig());
//		jwCache = new JwCacheRedisClusterImpl(jedisCluster);
		return jwCache;
	}
	
	/**
	 * 属性值转换为相应描述信息【非手工发送日志】
	 * ## 方法说明：
	 * 	数据传输验证 
	 * @param value
	 * @param nameOld
	 * @param classname
	 * @param languageId
	 * @param dbName
	 * @return
	 */
	public static String tranValue(String value, String nameOld, String classname, String languageId, String dbName){
		StringBuilder sb = new StringBuilder();
		boolean isNotTran = true;
		if(configMap_dtoField_paramtype.get(classname + "." + nameOld) != null){
			if (ConstantParm.ENUM_PARA_TYPE.COMMON_PARA.getValue().equals(configMap_dtoField_paramtype.get(classname + "." + nameOld))){
				if(configMap_dtoField_paramsubtype.get(classname + "." + nameOld) != null){
					List<String> l_value = getJwCache().hmget(configMap_dtoField_paramsubtype.get(classname + "." + nameOld)+"_"+languageId, value);
					List<String> l_cd = getJwCache().hmget("cd_"+configMap_dtoField_paramsubtype.get(classname + "." + nameOld)+"_"+languageId, value);
					if(ListUtil.isNotEmpty(l_value) && ListUtil.isNotEmpty(l_cd)){
						sb.append(l_cd.get(0) + "-" + l_value.get(0));
						isNotTran = false;
					}
				}
			}else
			if (ConstantParm.ENUM_PARA_TYPE.CHAIN_UNIT_PARA.getValue().equals(configMap_dtoField_paramtype.get(classname + "." + nameOld)) || ConstantParm.ENUM_PARA_TYPE.CHAIN_POS_PARA.getValue().equals(configMap_dtoField_paramtype.get(classname + "." + nameOld))){
				if(configMap_dtoField_paramsubtype.get(classname + "." + nameOld) != null){
					List<String> l_value = getJwCache().hmget(configMap_dtoField_paramsubtype.get(classname + "." + nameOld)+"_"+languageId+"_"+dbName, value);
					List<String> l_cd = getJwCache().hmget("cd_"+configMap_dtoField_paramsubtype.get(classname + "." + nameOld)+"_"+languageId+"_"+dbName, value);
					if(ListUtil.isNotEmpty(l_value) && ListUtil.isNotEmpty(l_cd)){
						sb.append(l_cd.get(0) + "-" + l_value.get(0));
						isNotTran = false;
					}
				}
			}else
			if (ConstantParm.ENUM_PARA_TYPE.SYS_PARA.getValue().equals(configMap_dtoField_paramtype.get(classname + "." + nameOld))){//如果是系统参数attribute类型
				if(configMap_dtoField_paramsubtype.get(classname + "." + nameOld) != null){
					List<String> l_value = getJwCache().hmget(configMap_dtoField_paramsubtype.get(classname + "." + nameOld)+"_"+languageId, value);
					if(ListUtil.isNotEmpty(l_value)){
						sb.append(l_value.get(0));
						isNotTran = false;
					}
				}
			}
		}
		if (isNotTran){
			sb.append(value);
		}
		return sb.toString();
	}
	
	/**
	 * 属性值转换为相应描述信息【手工发送日志】
	 * ## 方法说明：
	 * 	数据传输验证 
	 * @param value
	 * @param paramtypeName
	 * @param paramsubtypeName
	 * @param languageId
	 * @param dbName
	 * @return
	 */
	public static String tranValueSpec(String value, String paramtypeName, String paramsubtypeName, String languageId, String dbName){
		StringBuilder sb = new StringBuilder();
		boolean isNotTran = true;
		if (ConstantParm.ENUM_PARA_TYPE.COMMON_PARA.getValue().equals(paramtypeName)){
			List<String> l_value = getJwCache().hmget(paramsubtypeName+"_"+languageId, value);
			List<String> l_cd = getJwCache().hmget("cd_"+paramsubtypeName+"_"+languageId, value);
			if(ListUtil.isNotEmpty(l_value) && ListUtil.isNotEmpty(l_cd)){
				sb.append(l_cd.get(0) + "-" + l_value.get(0));
				isNotTran = false;
			}
		}else
		if (ConstantParm.ENUM_PARA_TYPE.CHAIN_UNIT_PARA.getValue().equals(paramtypeName) || ConstantParm.ENUM_PARA_TYPE.CHAIN_POS_PARA.getValue().equals(paramtypeName)){
			List<String> l_value = getJwCache().hmget(paramsubtypeName+"_"+languageId+"_"+dbName, value);
			List<String> l_cd = getJwCache().hmget("cd_"+paramsubtypeName+"_"+languageId+"_"+dbName, value);
			if(ListUtil.isNotEmpty(l_value) && ListUtil.isNotEmpty(l_cd)){
				sb.append(l_cd.get(0) + "-" + l_value.get(0));
				isNotTran = false;
			}
		}else
		if (ConstantParm.ENUM_PARA_TYPE.SYS_PARA.getValue().equals(paramtypeName)){//如果是系统参数attribute类型，不拼接cd
			List<String> l_value = getJwCache().hmget(paramsubtypeName+"_"+languageId, value);
			if(ListUtil.isNotEmpty(l_value)){
				sb.append(l_value.get(0));
				isNotTran = false;
			}
		}
		if (isNotTran){
			sb.append(value);
		}
		return sb.toString();
	}
}
