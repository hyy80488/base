/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ## 类说明：
 * 	存放DtoField及其对应描述信息初始化
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.servlet
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|DtoFieldServlet.java新增
 */
public class DtoFieldServlet extends HttpServlet {
	
	private static final long serialVersionUID = 3178684230783677142L;
	
	/**
	 * 
	 * ## 方法说明：
	 * 	初始化
	 * @param config
	 * @throws ServletException
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		SharedMap.initMap();
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	doGet
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * ## 方法说明：
	 * 	destroy
	 */
	@Override
	public void destroy() {
	}
	
}
