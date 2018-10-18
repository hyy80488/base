/**   
* @Title: FieldsResultUtil.java 
* @Package com.jw.common.framework.m0008.f001.transform 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年2月8日 下午1:44:23 
* @version V1.0   
*/
package com.jw.common.framework.m0008.f001.transform;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.Constant;
import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.util.ListUtil;
import com.jw.base.framework.core.util.StringUtil;
import com.jw.common.framework.m0002.f001.dto.EsTransformResponseDto;
import com.jw.common.framework.m0002.f001.dto.LogInfoDto;
import com.jw.common.framework.m0002.f001.dto.ResponseCommonDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年2月8日]
 * @package com.jw.common.framework.m0008.f001.transform
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年2月8日|bwliu|新增|FieldsResultUtil.java新增
*/
public class FieldsResultUtil {

	public static EsTransformResponseDto getResult(LogInfoDto logDto, String projectName) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		EsTransformResponseDto esTransformResponseDto = new EsTransformResponseDto();
		ResponseCommonDto responseCommonDto = new ResponseCommonDto();
		esTransformResponseDto.setResponseCommonDto(responseCommonDto);
		String transformStr = "";
		String transformKeyStr = "";
		if (ListUtil.isNotEmpty(logDto.getContent())){//手工日志内容
			List<String> transformStrList = FieldsUtil.getTransformObjectSpec(logDto, logDto.getLanguage_id(), getDbMap(logDto));
			transformStr = transformStrList.get(0);
			transformKeyStr = transformStrList.get(1);
		}else{//SubmitData和OriginData对比内容
			List<String> transformStrList = FieldsUtil.getTransformObject(logDto, logDto.getLanguage_id(), getDbMap(logDto));
			transformStr = transformStrList.get(0);
			transformKeyStr = transformStrList.get(1);
		}
//		System.err.println(projectName+"::"+"transformStr::"+transformStr);
		esTransformResponseDto.setTransformStr(transformStr);
//		System.err.println(projectName+"::"+"transformKeyStr::"+transformKeyStr);
		esTransformResponseDto.setTransformKeyStr(transformKeyStr);
		esTransformResponseDto.getResponseCommonDto().setMessageStatus(BsProcessErrorCode.SUCCESS_CODE_000000, BsProcessErrorCode.RESULT_CODE_0, BsProcessErrorCode.ERROR_LEVEL_0);
		return esTransformResponseDto;
	}
	
	//数据源集合
	private static Map<String, String> getDbMap(LogInfoDto logDto){
		Map<String, String> dbmap = new HashMap<String, String>();
		dbmap.put(Constant.ENUM_DATA_TYP.GRP.getValue(), dbHandle(logDto.getChainDbName()));
		dbmap.put(Constant.ENUM_DATA_TYP.PMS.getValue(), dbHandle(logDto.getUnitDbName()));
		
		dbmap.put(Constant.ENUM_DATA_TYP.POS.getValue(), dbHandle(logDto.getPosDbName()));
		dbmap.put(Constant.ENUM_DATA_TYP.CCS.getValue(), dbHandle(logDto.getCcsDbName()));
		dbmap.put(Constant.ENUM_DATA_TYP.CLDR.getValue(), dbHandle(logDto.getCldrDbName()));
		dbmap.put(Constant.ENUM_DATA_TYP.CRS.getValue(), dbHandle(logDto.getCrsDbName()));
		dbmap.put(Constant.ENUM_DATA_TYP.CRM.getValue(), dbHandle(logDto.getCrmDbName()));
		dbmap.put(Constant.ENUM_DATA_TYP.LPS.getValue(), dbHandle(logDto.getLpsDbName()));
		dbmap.put(Constant.ENUM_DATA_TYP.EBS.getValue(), dbHandle(logDto.getEbsDbName()));
		dbmap.put(Constant.ENUM_DATA_TYP.SCM.getValue(), dbHandle(logDto.getScmDbName()));
		dbmap.put(Constant.ENUM_DATA_TYP.GFC.getValue(), dbHandle(logDto.getGfcDbName()));
		return dbmap;
	}

	//如果chainDbName为从库，转换为对应的主库的名称，用于不同库，不同字典转换用
	private static String dbHandle(String dbname){
		if(StringUtil.isNotEmpty(dbname) && dbname.contains("_slave")){
			dbname = dbname.substring(0, dbname.lastIndexOf("_slave"));
		}
		return dbname;
	}
}
