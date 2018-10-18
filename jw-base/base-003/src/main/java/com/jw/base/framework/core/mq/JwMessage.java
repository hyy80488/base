/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.mq;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.jw.base.framework.core.mq.common.Constants;

/**
 * ## 类说明：
 * 	MQ消息类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.mq
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|JwMessage.java新增
*/
public class JwMessage implements Serializable {

	private static final long serialVersionUID = -7755544250191172541L;
	
	/** 发送类型：direct、fanout、topic **/
	private String msgType;
	
	/** 主题 **/
	private String topics;
	
	/** tag标签 **/
	private String tags;
	
	/** 关键字 **/
	private String keys;
	
	/** tracerId **/
	private String tracerId;
	
	/** tracerId **/
	private String businessId;
	
	/** 消息体 **/
	private byte[] body;
	
	/** 消息属性 **/
	private Map<String, String> properties;
	
	/** messageID **/
	private String msgId;
	
	/** 标示 **/
	private String flag;
	
	/** 延时时间 **/
	private int delayTime;
	
	/** 消息被发送次数 **/
	/** 消息被重发，计数用 **/
	private int times;
	
	/** 是否等待存储消息成功 **/
	private boolean waitStoreMsgOK;
	
	private String sysType;
	private String executeUrl;
	private String requestCommonDtoJson;
	
	public JwMessage() {
		super();
	}
	
	public JwMessage(String msgType, String msgId, String topics, String tags, String keys, 
			String flag, byte[] body, Map<String, String> properties, int delayTime, boolean waitStoreMsgOK) {
        this.msgType = msgType;
        this.msgId = msgId;
        this.topics = topics;
        this.tags = tags;
        this.keys = keys;
        this.flag = flag;
        this.body = body;
        this.properties = properties;
        this.delayTime = delayTime;
        this.waitStoreMsgOK = waitStoreMsgOK;
    }
	
	public JwMessage(String msgType, String msgId, String topics, String tags, String keys, 
			String tracerId, String businessId, String flag, byte[] body, Map<String, String> properties, int delayTime, boolean waitStoreMsgOK,int times) {
        this.msgType = msgType;
        this.msgId = msgId;
        this.topics = topics;
        this.tags = tags;
        this.keys = keys;
        this.tracerId = tracerId;
        this.businessId = businessId;
        this.flag = flag;
        this.body = body;
        this.properties = properties;
        this.delayTime = delayTime;
        this.waitStoreMsgOK = waitStoreMsgOK;
        this.times = times;
    }
	
	public JwMessage(String msgType, String msgId, String topics, String tags, String keys, 
			String tracerId, String businessId, String flag, byte[] body, Map<String, String> properties, int delayTime, boolean waitStoreMsgOK,int times,
			String sysType, String executeUrl, String requestCommonDtoJson) {
		this.msgType = msgType;
		this.msgId = msgId;
		this.topics = topics;
		this.tags = tags;
		this.keys = keys;
		this.tracerId = tracerId;
		this.businessId = businessId;
		this.flag = flag;
		this.body = body;
		this.properties = properties;
		this.delayTime = delayTime;
		this.waitStoreMsgOK = waitStoreMsgOK;
		this.times = times;
		this.sysType = sysType;
		this.executeUrl = executeUrl;
		this.requestCommonDtoJson = requestCommonDtoJson;
	}
	
	public String getTopics() {
		return topics;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

	public String getTracerId() {
		return tracerId;
	}

	public void setTracerId(String tracerId) {
		this.tracerId = tracerId;
	}

	public byte[] getBody() {
		return body;
	}

	public void setBody(byte[] body) {
		this.body = body;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public String getProperty(final String name) {
        if (null == this.properties) {
            this.properties = new HashMap<String, String>();
        }

        return this.properties.get(name);
    }
	
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public void putProperty(final String name, final String value) {
        if (null == this.properties) {
            this.properties = new HashMap<String, String>();
        }
        this.properties.put(name, value);
    }
	
	public void clearProperty(final String name) {
        if (null != this.properties) {
            this.properties.remove(name);
        }
    }
	
	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	public String getMsgId() {
		return msgId;
	}
	
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(int delayTime) {
		this.delayTime = delayTime;
	}

	public boolean isWaitStoreMsgOK() {
		return waitStoreMsgOK;
	}

	public void setWaitStoreMsgOK(boolean waitStoreMsgOK) {
		this.waitStoreMsgOK = waitStoreMsgOK;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	/**
	 * @return the sysType
	 */
	public String getSysType() {
		return sysType;
	}

	/**
	 * @param sysType the sysType to set
	 */
	public void setSysType(String sysType) {
		this.sysType = sysType;
	}

	/**
	 * @return the executeUrl
	 */
	public String getExecuteUrl() {
		return executeUrl;
	}

	/**
	 * @param executeUrl the executeUrl to set
	 */
	public void setExecuteUrl(String executeUrl) {
		this.executeUrl = executeUrl;
	}

	/**
	 * @return the requestCommonDtoJson
	 */
	public String getRequestCommonDtoJson() {
		return requestCommonDtoJson;
	}

	/**
	 * @param requestCommonDtoJson the requestCommonDtoJson to set
	 */
	public void setRequestCommonDtoJson(String requestCommonDtoJson) {
		this.requestCommonDtoJson = requestCommonDtoJson;
	}

	public void setKeys(Collection<String> keys) {
        StringBuffer sb = new StringBuffer();
        for (String k : keys) {
            sb.append(k);
            sb.append(Constants.KEY_SEPARATOR);
        }

        this.setKeys(sb.toString().trim());
    }
	
	@Override
    public String toString() {
        return "Message [msgType="+msgType+", msgId=" + msgId + ", topic=" + topics + ", tags=" + tags + ", flag=" + flag + ", properties=" + properties + ", body=" + (body != null ? body.length : 0) + "]";
    }
}
