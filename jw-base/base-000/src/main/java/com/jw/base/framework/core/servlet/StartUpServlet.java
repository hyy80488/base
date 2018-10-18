/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jw.base.framework.core.util.ClassUtil;

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
public class StartUpServlet extends HttpServlet {
	
	/**
	 * 存放应用程序的配置
	 */
	private static Map<String, Object> configMap = new HashMap<String, Object>();
	
	private static final long serialVersionUID = 230712991824757160L;

	/**
	 * 
	 * ## 方法说明：
	 * 	描述
	 * @param config
	 * @throws ServletException
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// 1、 读取来自config.properties文件的配置,并且放入configMap内,应用程序共同使用
//		String filePath = config.getServletContext().getRealPath("/WEB-INF/classes/conf/");
//		String configFilePath = filePath + "/cfg.properties";
//		Properties props = new Properties();
//		try {
//			FileInputStream fis = new FileInputStream(configFilePath);
//			Reader r = new InputStreamReader(fis, "UTF-8");
//			props.load(r);
//			for (Map.Entry<Object, Object> entry : props.entrySet()){
//				String key = (String) entry.getKey();
//				configMap.put(key, entry.getValue());
//			}
//		} catch (Exception ex) {
//			// logger.error(ex.getMessage());
//		}
		
		String realPath = config.getServletContext().getRealPath("/") + File.separator;
		configMap.put("realPath", realPath);
		//配置文件位置
		String cfgFilePath= realPath + "xdo.cfg";
		//导出pdf字体用
		generateXdoCfg(cfgFilePath, realPath +"fonts");
		//加载所有com.jw下的类
		ClassUtil.getClassSetForInit("com.jw");
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
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * ## 方法说明：
	 * 	描述
	 */
	@Override
	public void destroy() {
	}
	
	/**
	 * ## 方法说明：
	 * 	获取系统配置MAP
	 * @return
	 */
	public static Map<String, Object> getConfig() {
		return configMap;
	}
	
	/**
	 * 生成xdo.cfg文件，以加载BIP 的中文字体
	 * @param path 生成位置(文件夹名)
	 * @param fontPath 字体位置(字体所在文件夹)
	 * @throws IOException 
	 * */
	public static void generateXdoCfg(String cfgFilePath,String fontFolderPath)  {
		try{
			System.out.println("cfgFilePath=================="+cfgFilePath+"\n");
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream (new File(cfgFilePath)),"utf-8");
			osw.write("<config version=\"1.0.0\"  xmlns=\"http://xmlns.oracle.com/oxp/config/\">");
			osw.write("<properties>");
			osw.write("<property name=\"pdf-security\">false</property>");
			osw.write("    <property name=\"pdf-open-password\">user</property>");
			osw.write("    <property name=\"pdf-permissions-password\">owner</property>");
			osw.write("    <property name=\"pdf-no-printing\">true</property>");
			osw.write("     <property name=\"pdf-no-changing-the-document\">true</property>");
			osw.write("</properties>");
			osw.write("<fonts>");
			osw.write("  <font family=\"Times New Roman\" style=\"normal\" weight=\"normal\">");
			//osw.write("   <truetype path=\""+appAbsolutePath+"/fonts/times.ttf\" />");
			osw.write("   <truetype path=\""+ fontFolderPath + File.separator + "times.ttf\" />");
			osw.write("   </font>");
			osw.write("  <font family=\"Wingdings\" style=\"normal\" weight=\"normal\">");
			//osw.write("   <truetype path=\""+appAbsolutePath+"/fonts/wingding.ttf\" />");
			osw.write("   <truetype path=\""+ fontFolderPath + File.separator +"WINGDING.TTF\" />");
			osw.write("  </font>");
			osw.write("</fonts>");
			osw.write("  </config>");
			osw.close();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
