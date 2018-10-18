/**   
* @Title: PageViewsParser.java 
* @Package com.jw.base.framework.core.clickstream 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年3月23日 上午9:57:57 
* @version V1.0   
*/
package com.jw.base.framework.core.clickstream;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年3月23日]
 * @package com.jw.base.framework.core.clickstream
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月23日|bwliu|新增|PageViewsParser.java新增
*/
public class PageViewsParser {
	/**  
	 * 根据logSession的输出数据加载PageViewsBean  
	 *   
	 * */
	public PageViewsBean loadBean(String sessionContent) {
		PageViewsBean pageViewsBean = new PageViewsBean();
		String[] contents = sessionContent.split(" ");
		pageViewsBean.setTime(contents[0] + " " + contents[1]);
		pageViewsBean.setIP_addr(contents[2]);
		pageViewsBean.setSession(contents[3]);
		pageViewsBean.setVisit_URL(contents[4]);
		pageViewsBean.setStayTime("0");
		pageViewsBean.setStep("0");
		return pageViewsBean;
	}

	public String parser(PageViewsBean pageBean) {
		return pageBean.toString();
	}
}
