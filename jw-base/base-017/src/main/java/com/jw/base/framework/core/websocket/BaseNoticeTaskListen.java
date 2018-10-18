package com.jw.base.framework.core.websocket;

//import java.util.Map;
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
public class BaseNoticeTaskListen<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(BaseNoticeTaskListen.class);
	
//	protected Class<T> listenClass;
	
	// 静态变量，用来记录当前在线连接数。
	protected static int onlineCount = 0;

	// 用来存放 unituid/session的map,key为unituid,value为各个终端的session对象
	protected static ConcurrentHashMap<String, BaseNoticeTaskListen<?>> unitWebSocketMap = new ConcurrentHashMap<String, BaseNoticeTaskListen<?>>();
	   
    // 与某个客户端的连接会话，需要通过它来给客户端发送数据
    public Session sessions;
 	
//	public BaseNoticeTaskListen(Class<T> listenClass) {
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
			//每个sessionkey，同那些服务建立了长链接，{"ws-xxxxxxxxxx":"notice-task,xxxxxxx,xxxxxx"}
			redisCache.sadd("ws-"+uuid, (String) PropertyConfigurer.getContextProperty("websocket.server.notice"));
			//本服务，包含哪些sessionkey{"notice-task":"sessionkey1,sessionkey2,xxxxxxx"}
			redisCache.sadd((String) PropertyConfigurer.getContextProperty("websocket.server.notice"), "ws-"+uuid);
			unitWebSocketMap.put(uuid, this);
		}
		
//		System.out.println("------"+redisCache.smembers("ws-"+uuid));
//		System.out.println("------"+redisCache.smembers((String) PropertyConfigurer.getContextProperty("websocket.server.notice")));
		
//		for (Map.Entry m : unitWebSocketMap.entrySet()){
//			System.out.println(m.getKey());
//			System.out.println(m.getValue());
//		}
		
		this.sessions = session;
		addOnlineCount(); // 在线数加1
		System.out.println("有新连接加入："+uuid+"！当前在线人数为" + getOnlineCount());
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
			redisCache.srem("ws-"+uuid, (String) PropertyConfigurer.getContextProperty("websocket.server.notice"));
			//从缓存中清除，本服务中已关闭的sessionkey
			redisCache.srem((String) PropertyConfigurer.getContextProperty("websocket.server.notice"), "ws-"+uuid);
			if(redisCache.scard("ws-"+uuid)==0){
				redisCache.del("ws-"+uuid);
			}
			unitWebSocketMap.remove(uuid);
		}
		subOnlineCount(); // 在线数减1
		System.out.println("有一连接关闭："+uuid+"！当前在线人数为" + getOnlineCount());
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
		BaseNoticeTaskListen.onlineCount++;
	}

	public static synchronized void subOnlineCount() {
		BaseNoticeTaskListen.onlineCount--;
	}
}
