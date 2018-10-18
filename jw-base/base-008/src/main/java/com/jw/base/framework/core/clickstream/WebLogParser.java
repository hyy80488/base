/**   
* @Title: WebLogParser.java 
* @Package com.jw.base.framework.core.clickstream 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年3月22日 下午6:07:02 
* @version V1.0   
*/
package com.jw.base.framework.core.clickstream;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ## 类说明：
 * 	用正则表达式匹配出合法的日志记录  
 * @author    [bwliu]   
 * @version   [V1.0, 2018年3月22日]
 * @package com.jw.base.framework.core.clickstream
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月22日|bwliu|新增|WebLogParser.java新增
*/
public class WebLogParser {
	public String parser(String weblog_origin) {

		WebLogBean weblogbean = new WebLogBean();

		// 获取IP地址  
		Pattern IPPattern = Pattern.compile("\\d+.\\d+.\\d+.\\d+");
		Matcher IPMatcher = IPPattern.matcher(weblog_origin);
		if (IPMatcher.find()) {
			String IPAddr = IPMatcher.group(0);
			weblogbean.setIP_addr(IPAddr);
		} else {
			return "";
		}
		
		// 获取时间信息  
		Pattern TimePattern = Pattern.compile("\\[(.+)\\]");
		Matcher TimeMatcher = TimePattern.matcher(weblog_origin);
		if (TimeMatcher.find()) {
			String time = TimeMatcher.group(1);
			String[] cleanTime = time.split(" ");
			weblogbean.setTime(cleanTime[0]);
		} else {
			return "";
		}

		//获取其余请求信息  
		Pattern InfoPattern = Pattern.compile("(\\\"[POST|GET].+?\\\") (\\d+) (\\d+) (\\\".+?\\\") - (\\d+\\.\\d+) (\\d+\\.\\d+) (\\d+.\\d+.\\d+.\\d+:\\d+)");
		Matcher InfoMatcher = InfoPattern.matcher(weblog_origin);
		if (InfoMatcher.find()) {
			String requestInfo = InfoMatcher.group(1).replace('\"', ' ').trim();
			String[] requestInfoArry = requestInfo.split(" ");
			weblogbean.setMethod(requestInfoArry[0]);
			weblogbean.setRequest_URL(requestInfoArry[1]);
			weblogbean.setRequest_protocol(requestInfoArry[2]);
			String status_code = InfoMatcher.group(2);
			weblogbean.setRespond_code(status_code);

			String respond_data = InfoMatcher.group(3);
			weblogbean.setRespond_data(respond_data);

			String request_come_from = InfoMatcher.group(4).replace('\"', ' ').trim();
			weblogbean.setRequst_come_from(request_come_from);

			String respond_ip_port = InfoMatcher.group(7).replace('\"', ' ').trim();
			weblogbean.setRespond_ip_port(respond_ip_port);
		} else {
			return "";
		}

		return weblogbean.toString();
	}
}
