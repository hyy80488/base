/**   
* @Title: PageViewsBean.java 
* @Package com.jw.base.framework.core.clickstream 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年3月23日 上午9:59:45 
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
2018年3月23日|bwliu|新增|PageViewsBean.java新增
*/
public class PageViewsBean {
	String session;
	String IP_addr;
	String time;
	String visit_URL;
	String stayTime;
	String step;

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

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

	public String getVisit_URL() {
		return visit_URL;
	}

	public void setVisit_URL(String visit_URL) {
		this.visit_URL = visit_URL;
	}

	public String getStayTime() {
		return stayTime;
	}

	public void setStayTime(String stayTime) {
		this.stayTime = stayTime;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
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
		return session + " " + IP_addr + " " + time + " " + visit_URL + " " + stayTime + " " + step;
	}
}
