/**   
* @Title: RequestMappingServlet.java 
* @Package com.jw.base.framework.core.servlet 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年6月4日 下午1:10:16 
* @version V1.0   
*/
package com.jw.base.framework.core.servlet;

import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.jw.base.framework.core.ConstantZk;
import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.util.AppUtil;
import com.jw.base.framework.core.util.NetUtil;
import com.jw.base.framework.core.util.StringUtil;
import com.jw.base.framework.core.zk.ZooKeeperUtil;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年6月4日]
 * @package com.jw.base.framework.core.servlet
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年6月4日|bwliu|新增|RequestMappingServlet.java新增
*/
public class RequestMappingServlet extends HttpServlet {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7949791542587112613L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		String ip = NetUtil.getServerIp();
		String port = (String)PropertyConfigurer.getContextProperty("local.server.port");
		//String contextName = config.getServletContext().getServletContextName(); //  3160001RA
		String contextPath = config.getServletContext().getContextPath();        //  /3160001RA-1.0.0-SNAPSHOT
		
		try {
			String apiRegister = (String)PropertyConfigurer.getContextProperty("api.register");
			if ("open".equals(apiRegister)) {
				RequestMappingHandlerConfig requestMappingHandlerConfig = (RequestMappingHandlerConfig) AppUtil.getBean(RequestMappingHandlerConfig.class);
	//			System.out.println("requestMappingHandlerConfig==============="+requestMappingHandlerConfig);
				RequestMappingHandlerMapping requestMappingHandlerMapping = requestMappingHandlerConfig.requestMappingHandlerMapping();
				Map<RequestMappingInfo, HandlerMethod> map = requestMappingHandlerMapping.getHandlerMethods();
				Set<RequestMappingInfo> mappings = map.keySet();
				
				String zkAddress = (String)PropertyConfigurer.getContextProperty("zk.address");
				RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
				CuratorFramework client = CuratorFrameworkFactory.builder()
																 .connectString(zkAddress)
																 .retryPolicy(retryPolicy)
																 .connectionTimeoutMs(2000).build();
				client.start();
				ZooKeeperUtil.createNode(client, "/"+ConstantZk.JW_API_SERVER, CreateMode.PERSISTENT, zkAddress.getBytes());
				ZooKeeperUtil.createNode(client, "/"+ConstantZk.JW_API_URL, CreateMode.PERSISTENT, zkAddress.getBytes());
				
				for (RequestMappingInfo info : mappings) {
					HandlerMethod method = map.get(info);
					String methodstr = method.toString();
					methodstr = methodstr.split("\\(")[0];
					methodstr = methodstr.split(" ")[2];
					int i = methodstr.lastIndexOf(".");
					String controllerName = methodstr.substring(0, i);
					String methodName = methodstr.substring(i+1,methodstr.length());
					String urlparm = info.getPatternsCondition().toString();
					String urlpath = urlparm.substring(1, urlparm.length() - 1);
					String url = "http://"+ip+":"+port+"/"+contextPath.substring(1,contextPath.length())+urlpath;
	//				System.out.println("===>>" + URLEncoder.encode("api://"+ip+"/"+contextPath.substring(1,contextPath.length())+url+"?controllerName="+controllerName+"&methodName="+methodName, "UTF-8"));
	//				System.out.println("===>" + URLEncoder.encode(url, "UTF-8"));
					
//					ZooKeeperUtil.createNode(client, 
//							"/"+ConstantZk.JW_API_SERVER+"/" + ip + "_" + port + "_" + contextPath.substring(1,contextPath.length()),
//							CreateMode.EPHEMERAL, 
//							("").getBytes());
					ZooKeeperUtil.createNode(client, 
							"/"+ConstantZk.JW_API_SERVER+"/" + ip + "_" + port + "_" + contextPath.substring(1,contextPath.length()) + "/" + URLEncoder.encode(url, "UTF-8"),
							CreateMode.EPHEMERAL, 
							("api://"+ip+":"+port+"/"+contextPath.substring(1,contextPath.length())+url+"?controllerName="+controllerName+"&methodName="+methodName).getBytes());
					
//					ZooKeeperUtil.createNode(client, 
//							"/"+ConstantZk.JW_API_URL+"/" + URLEncoder.encode(StringUtil.replace(urlpath, "/", "_"), "UTF-8"),
//							CreateMode.EPHEMERAL, 
//							("").getBytes());
					ZooKeeperUtil.createNode(client, 
							"/"+ConstantZk.JW_API_URL+"/" + URLEncoder.encode(StringUtil.replace(urlpath, "/", "_"), "UTF-8") + "/" + URLEncoder.encode(url, "UTF-8"),
							CreateMode.EPHEMERAL, 
							("api://"+ip+":"+port+"/"+contextPath.substring(1,contextPath.length())+url+"?controllerName="+controllerName+"&methodName="+methodName).getBytes());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
	}
}
