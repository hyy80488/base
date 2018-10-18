/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq;

import com.jw.base.framework.core.mq.common.DetailRes;

/**
 * ## 类说明：
 * 	MQ动态发送接口
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|JwMqDynamicSender.java新增
*/
public interface JwMqDynamicSender {

	/**
	 * ## 方法说明：
	 * 	指定队列发送MQ
	 * @param msg
	 * @return
	 */
	public DetailRes send(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	指定队列发送延迟MQ
	 * @param msg
	 * @param dealyExchange
	 * @param dealyTopic
	 * @param dealyRouting
	 * @param dealyQueue
	 * @param xExpires
	 * @return
	 */
	public DetailRes sendDelay(JwMessage msg, String delayExchange, String delayTopic, String delayRouting, String delayQueue, long xExpires);
	
}
