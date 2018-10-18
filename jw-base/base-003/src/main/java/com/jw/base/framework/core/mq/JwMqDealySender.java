/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq;

import com.jw.base.framework.core.mq.common.DetailRes;

/**
 * ## 类说明：
 * 	MQ延迟发送接口
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|JwMqDealySender.java新增
*/
public interface JwMqDealySender {

	
	/**
     * ## 方法说明：
     * 	强一致性校验延迟队列
     * @param msg
     * @return
     */
//	public DetailRes sendStrongConsistencyDealy(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	弱一致性校验延迟队列
	 * @param msg
	 * @return
	 */
//	public DetailRes sendWeakConsistencyDealy(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	长延迟队列
	 * @param msg
	 * @return
	 */
	public DetailRes sendLongDealy(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	短延迟队列
	 * @param msg
	 * @return
	 */
	public DetailRes sendShortDealy(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	订单处理延迟队列，1小时零1分，（直销订单预付超一小时取消）
	 * @param msg
	 * @return
	 */
	public DetailRes sendOrderDealDealy(JwMessage msg);
	
}
