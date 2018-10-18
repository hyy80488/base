package com.jw.base.framework.core.websocket;

import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.jw.base.framework.core.cache.JwCache;
import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.util.AppUtil;
import com.jw.base.framework.core.util.StringUtil;

@Component
public class BasePosPrinterTaskListen<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(BasePosPrinterTaskListen.class);
	
//	protected Class<T> listenClass;
	
	// 静态变量，用来记录当前在线连接数。
	protected static int onlineCount = 0;

	// 用来存放 unituid/session的map,key为unituid,value为各个终端的session对象
	protected static ConcurrentHashMap<String, BasePosPrinterTaskListen<?>> unitWebSocketMap = new ConcurrentHashMap<String, BasePosPrinterTaskListen<?>>();
	   
    // 与某个客户端的连接会话，需要通过它来给客户端发送数据
    public Session sessions;
 	
//	public BasePosPrinterTaskListen(Class<T> listenClass) {
//		this.listenClass = listenClass;
//	}
	
	/**
	 * 连接建立成功调用的方法
	 * @param session 可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
	 */
	@OnOpen
	public void onOpen(@PathParam("uuid") String uuid, Session session, EndpointConfig config) {
		JwCache redisCache = (JwCache) AppUtil.getBean("redisImpl");
		
		if(StringUtil.isNotEmpty(uuid)){
			//每个sessionkey，同那些服务建立了长链接，{"ws-xxxxxxxxxx":"pos-printer-task,xxxxxxx,xxxxxx"}
			redisCache.sadd("ws-"+uuid, (String) PropertyConfigurer.getContextProperty("websocket.server.posprinter"));
			//本服务，包含哪些sessionkey{"pos-printer-task":"sessionkey1,sessionkey2,xxxxxxx"}
			redisCache.sadd((String) PropertyConfigurer.getContextProperty("websocket.server.posprinter"), "ws-"+uuid);
			unitWebSocketMap.put(uuid, this);
		}
		
		this.sessions = session;
		addOnlineCount(); // 在线数加1
		logger.info("有新连接加入："+uuid+"！当前在线人数为" + getOnlineCount());
	}
	
	/**
	 * 连接关闭调用的方法
	 */
	@OnClose
	public void onClose(@PathParam("uuid") String uuid) {
		JwCache redisCache = (JwCache) AppUtil.getBean("redisImpl");
		
		if(StringUtil.isNotEmpty(uuid)){
			//从缓存中清除，sessionkey对应的服务的长链接
			redisCache.srem("ws-"+uuid, (String) PropertyConfigurer.getContextProperty("websocket.server.posprinter"));
			//从缓存中清除，本服务中已关闭的sessionkey
			redisCache.srem((String) PropertyConfigurer.getContextProperty("websocket.server.posprinter"), "ws-"+uuid);
			if(redisCache.scard("ws-"+uuid)==0){
				redisCache.del("ws-"+uuid);
			}
			unitWebSocketMap.remove(uuid);
		}
		subOnlineCount(); // 在线数减1
		logger.info("有一连接关闭："+uuid+"！当前在线人数为" + getOnlineCount());
	}
	
	/**
	 * 发生错误时调用
	 * @param session
	 * @param error
	 */
	@OnError
	public void onError(@PathParam("uuid") String uuid, Session session, Throwable error) {
		logger.error(uuid + "发生错误");
		//error.printStackTrace();
	}
	
	public static synchronized int getOnlineCount() {
		return onlineCount;
	}

	public static synchronized void addOnlineCount() {
		BasePosPrinterTaskListen.onlineCount++;
	}

	public static synchronized void subOnlineCount() {
		BasePosPrinterTaskListen.onlineCount--;
	}
}
