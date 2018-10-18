package com.jw.base.framework.core.websocket;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import com.jw.base.framework.core.ConstantWebsocket;

/** 
 * 建立连接，握手拦截器 
 */
@Component
public class WebSocketHandshakeInterceptor extends HttpSessionHandshakeInterceptor implements HandshakeInterceptor {

	private static Logger logger = LoggerFactory.getLogger(HandshakeInterceptor.class);

	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Map<String, Object> attributes) throws Exception {
		if (request instanceof ServletServerHttpRequest) {
			ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
			HttpSession session = servletRequest.getServletRequest().getSession(true);
			
			// 保存session中已登录的用户到websocket的上下文环境中。在推送消息的时候，需要根据当前登录用户获取点位权限
			// final IbmsUser user = IbmsUserHolder.getUser();
			// attributes.put(IBMSConstant.SESSION_WEBSOCKET_LOGINED_USER, user);
			
			if (session != null) {
				// 使用userName区分WebSocketHandler，以便定向发送消息
				String userName = (String) session.getAttribute(ConstantWebsocket.SESSION_USERNAME);
				if(userName==null){
					userName = "socket-username";
				}
				attributes.put(ConstantWebsocket.WEBSOCKET_USERNAME, userName);
				
				session.setAttribute(ConstantWebsocket.SESSION_USERNAME, userName);
			}
			String msg = "beforeHandshake ******************* session:" + session.getAttribute(ConstantWebsocket.SESSION_USERNAME);
			System.err.println(msg);
		}
		return super.beforeHandshake(request, response, wsHandler, attributes);
	}

	@Override
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Exception exception) {
		URI uri = request.getURI();
		InetSocketAddress remoteAddress = request.getRemoteAddress();
		String msg = "afterHandshake ******************* uri:" + uri + "; remoteAddress;" + remoteAddress;
		System.err.println(msg);
		logger.debug(msg);
		super.afterHandshake(request, response, wsHandler, exception);
	}
}
