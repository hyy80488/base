/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.jasper.servlet;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jw.base.framework.core.jasper.initbean.ExampleBean;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 * ## 类说明：
 * 	工程初始化，存放应用程序的配置
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.servlet
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|StartUpServlet.java新增
 */
public class JasperServlet extends HttpServlet {
	
	private static final long serialVersionUID = -4405803346976812651L;

	/**
	 * 存放应用程序的配置
	 */
	private static Map<String, JasperReport> configMap = new HashMap<String, JasperReport>();
	
	/**
	 * 
	 * ## 方法说明：
	 * 	初始化默认报表，把jasperreport所需类初次加载，提高后续报表生成速度
	 * @param config
	 * @throws ServletException
	 */
	public void init(ServletConfig config) throws ServletException {
//		String realPath = config.getServletContext().getRealPath("/")+File.separator+"WEB-INF"+File.separator+"classes"+File.separator+"jrxml"+File.separator;
//		String jasperPath = realPath + "MvcIReportExample.jasper";
		try {
//			JasperReport jreport = (JasperReport)JRLoader.loadObject(new File(jasperPath));
			JasperReport jreport = (JasperReport)JRLoader.loadObject(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/jw/base/framework/core/jasper/servlet/MvcIReportExample.jasper"));
			JRDataSource jrDataSource = new JRBeanCollectionDataSource(ExampleBean.getList());
			//填充一个示例报表，通过其加载所需类到jvm中，提高报表第一次加载慢的问题
			JasperFillManager.fillReport(jreport, new HashMap<String, Object>(), jrDataSource);
			configMap.put("MvcIReportExample", jreport);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * ## 方法说明：
	 * 	描述
	 */
	public void destroy() {
	}
	
	/**
	 * ## 方法说明：
	 * 	获取系统配置MAP
	 * @return
	 */
	public static Map<String, JasperReport> getJasperReport() {
		return configMap;
	}
}
