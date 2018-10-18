/**   
* @Title: RequestMappingHandlerConfig.java 
* @Package com.jw.hms.cmm.m3160.f001.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年6月4日 上午11:04:05 
* @version V1.0   
*/
package com.jw.base.framework.core.servlet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年6月4日]
 * @package com.jw.hms.cmm.m3160.f001.controller
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年6月4日|bwliu|新增|RequestMappingHandlerConfig.java新增
*/

@Configuration
public class RequestMappingHandlerConfig {
	@Bean
	public RequestMappingHandlerMapping requestMappingHandlerMapping() {
		RequestMappingHandlerMapping mapping = new RequestMappingHandlerMapping();
		return mapping;
	}

}
