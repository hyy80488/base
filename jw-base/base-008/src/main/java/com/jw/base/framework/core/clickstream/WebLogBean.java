/**   
* @Title: WebLogBean.java 
* @Package com.jw.base.framework.core.clickstream 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年3月22日 下午6:07:55 
* @version V1.0   
*/
package com.jw.base.framework.core.clickstream;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年3月22日]
 * @package com.jw.base.framework.core.clickstream
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月22日|bwliu|新增|WebLogBean.java新增
*/
public class WebLogBean {
	String IP_addr;
	String time;
	String method;
	String request_URL;
	String request_protocol;
	String respond_code;
	String respond_data;
	String respond_ip_port;
	String requst_come_from;
	String browser;
	
	public String getIP_addr() {
		return IP_addr;
	}

	public void setIP_addr(String iP_addr) {
		IP_addr = iP_addr;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getRequest_URL() {
		return request_URL;
	}

	public void setRequest_URL(String request_URL) {
		this.request_URL = request_URL;
	}

	public String getRequest_protocol() {
		return request_protocol;
	}

	public void setRequest_protocol(String request_protocol) {
		this.request_protocol = request_protocol;
	}

	public String getRespond_code() {
		return respond_code;
	}

	public void setRespond_code(String respond_code) {
		this.respond_code = respond_code;
	}

	public String getRespond_data() {
		return respond_data;
	}

	public void setRespond_data(String respond_data) {
		this.respond_data = respond_data;
	}

	public String getRequst_come_from() {
		return requst_come_from;
	}

	public void setRequst_come_from(String requst_come_from) {
		this.requst_come_from = requst_come_from;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getRespond_ip_port() {
		return respond_ip_port;
	}

	public void setRespond_ip_port(String respond_ip_port) {
		this.respond_ip_port = respond_ip_port;
	}

	@Override
	public String toString() {
		return IP_addr + " " + time + " " + method + " " + request_URL + " " + request_protocol + " " + respond_code + " " + respond_data + " " + requst_come_from + " " + respond_ip_port;
	}
}
