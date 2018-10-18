/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq;

import com.jw.base.framework.core.mq.common.DetailRes;

/**
 * ## 类说明：
 * 	MQ发送接口
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|JwMqSender.java新增
*/
public interface JwMqSender {

	/**
     * ## 方法说明：
     * 	电话计费\视频点播\宽带计费\酒店功能
     * @param msg
     * @return
     */
	public DetailRes sendJobPbxByDirect(JwMessage msg);
	/**
	 * ## 方法说明：
	 * 	公安
	 * @param msg
	 * @return
	 */
	public DetailRes sendJobResidenceByDirect(JwMessage msg);
	/**
	 * ## 方法说明：
	 * 	房控
	 * @param msg
	 * @return
	 */
	public DetailRes sendJobRoomByDirect(JwMessage msg);
	/**
	 * ## 方法说明：
	 * 	CRM
	 * @param msg
	 * @return
	 */
	public DetailRes sendJobCrmByDirect(JwMessage msg);
	/**
	 * ## 方法说明：
	 * 	CRS
	 * @param msg
	 * @return
	 */
	public DetailRes sendJobCrsByDirect(JwMessage msg);
	/**
	 * ## 方法说明：
	 * 	短信
	 * @param msg
	 * @return
	 */
	public DetailRes sendJobMessageByDirect(JwMessage msg);
	/**
	 * ## 方法说明：
	 * 	任务分发
	 * @param msg
	 * @return
	 */
	public DetailRes sendMissionByDirect(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	发送EntiytLog消息
	 * @param msg
	 * @return
	 */
	public DetailRes sendEntityLogByDirect(JwMessage msg);
	
	/**
     * ## 方法说明：
     * 	发送ReporttLog消息
     * @param msg
     * @return
     */
	public DetailRes sendReporttLogByDirect(JwMessage msg);
	
	/**
     * ## 方法说明：
     * 	发送NumbertLog消息
     * @param msg
     * @return
     */
	public DetailRes sendNumbertLogByDirect(JwMessage msg);
	
	/**
     * ## 方法说明：
     * 	发送NumbertLog消息
     * @param msg
     * @return
     */
	public DetailRes sendLoginLogByDirect(JwMessage msg);
	
	/**
     * ## 方法说明：
     * 	发送websocket消息
     * @param msg
     * @return
     */
	public DetailRes sendWebsocketByDirect(JwMessage msg);
	
	/**
     * ## 方法说明：
     * 	发送厨打消息
     * @param msg
     * @return
     */
	public DetailRes sendPosPrinterTaskByDirect(JwMessage msg);
	
	/**
     * ## 方法说明：
     * 	发送通知消息
     * @param msg
     * @return
     */
	public DetailRes sendNoticeTaskByDirect(JwMessage msg);
	
	/**
     * ## 方法说明：
     * 	发送apidoc
     * @param msg
     * @return
     */
	public DetailRes sendApidocByDirect(JwMessage msg);
	
	/**
     * ## 方法说明：
     * 	发送积分
     * @param msg
     * @return
     */
	public DetailRes sendPointsByDirect(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	补偿处理，及时队列
	 * @param msg
	 * @return
	 */
	public DetailRes sendCompensatingByDirect(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	ARI、EBK【发送房态、房价、房量】
	 * @param msg
	 * @return
	 */
	public DetailRes sendCtripOTA(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	渠道调用日志，如webservice
	 * @param msg
	 * @return
	 */
	public DetailRes sendLogChannelInfo(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	夜审通知
	 * @param msg
	 * @return
	 */
	public DetailRes sendAuditNoticeByDirect(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	从RMS中获取"间夜量"、"房费收入"等预测数据
	 * @param msg
	 * @return
	 */
	public DetailRes sendGetRMSDataByDirect(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	计算会员保级
	 * @param msg
	 * @return
	 */
	public DetailRes sendKeepLevelByDirect(JwMessage msg);
	
	/**
	 * ## 方法说明：
	 * 	计算会员积分过期清零
	 * @param msg
	 * @return
	 */
	public DetailRes sendPointsExpiredByDirect(JwMessage msg);
	
//	/**
//	 * ## 方法说明：
//	 * 	发送消息反馈消息
//	 * @param msg
//	 */
//	public DetailRes sendAck(JwMessage msg);
	
}
