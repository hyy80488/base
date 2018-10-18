/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections4.MapUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.FastJsonUtil;
import com.jw.base.framework.core.util.StringUtil;
/**
 * ## 类说明：
 * 	API返回值处理
 * @author    [jianana]   
 * @version   [V1.0, 2018年1月24日]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年1月24日|jianana|新增|ResponseDataUtil.java新增
 */
public class ResponseDataUtil {
	/**
	 * ## 方法说明：
	 * 	处理API请求返回DTO
	 * @param str	API返回字符串
	 * @param clazz DTO
	 * @return
	 * @throws Exception
	 */
	public static <E extends ResponseBaseDto> E returnData(String str,Class<E> clazz)throws Exception{
		if(StringUtil.isEmpty(str)){
			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_360007,"请求失败","请求失败",BsProcessErrorCode.ERROR_LEVEL_0);
		}
		//返回全部字段
		E obj = FastJsonUtil.toBean(str,clazz);
		if(Objects.isNull(obj)){
			ResponseBaseDto objError = FastJsonUtil.toBean(str,ResponseBaseDto.class);
			if(Objects.isNull(objError)){
				throw new BusinessException(BsProcessErrorCode.ERROR_CODE_360007,str,str,BsProcessErrorCode.ERROR_LEVEL_0);
			}
			if(!Objects.equals(objError.getResponseCommonDto().getResultCode(), "0")){
				throw new BusinessException(objError.getResponseCommonDto().getMessage(),
						str,str,objError.getResponseCommonDto().getErrorLevel());
			}
		}else{
			if(!Objects.equals(obj.getResponseCommonDto().getResultCode(), "0")){
				throw new BusinessException(obj.getResponseCommonDto().getMessage(),
						str,str,obj.getResponseCommonDto().getErrorLevel());
			}
		}
		return obj;
	}
	
	/**
	 * ## 方法说明：
	 * 	API请求返回Map
	 * @param str API返回字符串
	 * @return
	 * @throws Exception
	 */
	public static Map<String, Object> returnMapData(String str)throws Exception{
		if(StringUtil.isEmpty(str)){
			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_360007,"请求失败","请求失败",BsProcessErrorCode.ERROR_LEVEL_0);
		}
		Map<String, Object> objMap = JSON.parseObject(str, new TypeReference<Map<String, Object>>(){});
		if (null != objMap){
			Map<String, Object> responseCommonDto = (Map<String, Object>) MapUtils.getObject(objMap, "responseCommonDto");
			if (null != responseCommonDto){
				if(!Objects.equals(MapUtils.getString(responseCommonDto, "resultCode"), "0")){
					throw new BusinessException(MapUtils.getString(responseCommonDto, "message"), MapUtils.getString(objMap, "errorMessage"),
							MapUtils.getString(objMap, "errorMessage"),MapUtils.getString(responseCommonDto, "errorLevel"));
				}
			}
		}
		return objMap;
	}
	
	/**
	 * ## 方法说明：
	 * 	错误代码转换
	 * @param code
	 * @param message
	 * @throws Exception
	 */
	public static void resultPross(String code,String message,String server)throws Exception{
		if(StringUtil.isEmpty(code) || Objects.equals(code, "0")){
			return;
		}
		switch (server) {
		case "HTNG":
			throw new BusinessException(String.format("HTNG_ERROR_%s", code), message,message,BsProcessErrorCode.ERROR_LEVEL_5);
		default:
			throw new BusinessException(String.format("HTNG_ERROR_%s", code), message,message,BsProcessErrorCode.ERROR_LEVEL_5);
		}
	}
}
