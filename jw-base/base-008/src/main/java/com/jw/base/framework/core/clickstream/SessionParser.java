/**   
* @Title: SessionParser.java 
* @Package com.jw.base.framework.core.clickstream 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年3月23日 上午9:18:53 
* @version V1.0   
*/
package com.jw.base.framework.core.clickstream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年3月23日]
 * @package com.jw.base.framework.core.clickstream
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月23日|bwliu|新增|SessionParser.java新增
*/
public class SessionParser {
	SimpleDateFormat sdf_origin = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", Locale.ENGLISH);
	SimpleDateFormat sdf_final = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public String parser(WebLogSessionBean sessionBean, String sessionID) {
		sessionBean.setSession(sessionID);
		return sessionBean.toString();
	}

	public WebLogSessionBean loadBean(String sessionContent) {
		WebLogSessionBean weblogSession = new WebLogSessionBean();
		String[] contents = sessionContent.split(" ");
		weblogSession.setTime(timeTransform(contents[1]));
		weblogSession.setIP_addr(contents[0]);
		weblogSession.setRequest_URL(contents[3]);
		weblogSession.setReferal(contents[8]);
		return weblogSession;
	}

	private String timeTransform(String time) {
		Date standard_time = null;
		try {
			standard_time = sdf_origin.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sdf_final.format(standard_time);
	}
}
