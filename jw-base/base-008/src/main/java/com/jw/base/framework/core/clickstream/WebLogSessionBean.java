/**   
* @Title: WebLogSessionBean.java 
* @Package com.jw.base.framework.core.clickstream 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年3月23日 上午9:19:23 
* @version V1.0   
*/
package com.jw.base.framework.core.clickstream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年3月23日]
 * @package com.jw.base.framework.core.clickstream
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月23日|bwliu|新增|WebLogSessionBean.java新增
*/
public class WebLogSessionBean {
	String time;
	String IP_addr;
	String session;
	String request_URL;
	String referal;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getIP_addr() {
		return IP_addr;
	}

	public void setIP_addr(String iP_addr) {
		IP_addr = iP_addr;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getRequest_URL() {
		return request_URL;
	}

	public void setRequest_URL(String request_URL) {
		this.request_URL = request_URL;
	}

	public String getReferal() {
		return referal;
	}

	public void setReferal(String referal) {
		this.referal = referal;
	}

	public Date getTimeWithDateFormat() {
		SimpleDateFormat sdf_final = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (this.time != null && this.time != "") {
			try {
				return sdf_final.parse(this.time);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return time + " " + IP_addr + " " + session + " " + request_URL + " " + referal;
	}
}
