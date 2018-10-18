/**   
* @Title: VisitsInfoParser.java 
* @Package com.jw.base.framework.core.clickstream 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年3月23日 上午10:07:56 
* @version V1.0   
*/
package com.jw.base.framework.core.clickstream;

import java.util.ArrayList;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年3月23日]
 * @package com.jw.base.framework.core.clickstream
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月23日|bwliu|新增|VisitsInfoParser.java新增
*/
public class VisitsInfoParser {
	public String parser(ArrayList<String> pageViewsGroup, String totalVisitNum) {

		VisitsInfoBean visitsBean = new VisitsInfoBean();
		String entryPage = pageViewsGroup.get(0).split(" ")[4];
		String leavePage = pageViewsGroup.get(pageViewsGroup.size() - 1).split(" ")[4];
		String startTime = pageViewsGroup.get(0).split(" ")[0] + " " + pageViewsGroup.get(0).split(" ")[1];
		String endTime = pageViewsGroup.get(pageViewsGroup.size() - 1).split(" ")[0] + " " + pageViewsGroup.get(pageViewsGroup.size() - 1).split(" ")[1];
		String session = pageViewsGroup.get(0).split(" ")[3];
		String IP = pageViewsGroup.get(0).split(" ")[2];
		String referal = pageViewsGroup.get(0).split(" ")[5];

		visitsBean.setSession(session);
		visitsBean.setStart_time(startTime);
		visitsBean.setEnd_time(endTime);
		visitsBean.setEntry_page(entryPage);
		visitsBean.setLeave_page(leavePage);
		visitsBean.setVisit_page_num(totalVisitNum);
		visitsBean.setIP_addr(IP);
		visitsBean.setReferal(referal);

		return visitsBean.toString();
	}
}