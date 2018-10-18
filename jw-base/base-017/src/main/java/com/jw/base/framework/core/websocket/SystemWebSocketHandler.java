package com.jw.base.framework.core.websocket;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.jw.base.framework.core.ConstantWebsocket;

/** 
 * websocket 处理器 
 */
@Component
public class SystemWebSocketHandler extends TextWebSocketHandler implements WebSocketHandler {

	private static final Logger logger = LoggerFactory.getLogger(SystemWebSocketHandler.class);
	private static final CopyOnWriteArraySet<WebSocketSession> users;

	static {
		users = new CopyOnWriteArraySet<WebSocketSession>();
	}

	// @Autowired
	// private WebSocketService webSocketService;

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		logger.info("connect to the websocket success......");
		System.out.println("connect to the websocket success......");
		users.add(session);
		String userName = (String) session.getAttributes().get(ConstantWebsocket.WEBSOCKET_USERNAME);
		if (userName != null) {
			// 查询未读消息
			// int count = webSocketService.getUnReadNews((String)
			// session.getAttributes().get(Constants.WEBSOCKET_USERNAME));
			int count = 1;
			session.sendMessage(new TextMessage(count + ""));
		}
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		System.out.println("handleMessage......");
		//sendMessageToUsers(new TextMessage("lbw"));
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		if (session.isOpen()) {
			session.close();
		}
		logger.info("websocket connection closed......");
		System.out.println("websocket connection closed......");
		users.remove(session);
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
		logger.info("websocket connection closed......");
		System.out.println("websocket connection closed......");
		users.remove(session);
	}

	@Override
	public boolean supportsPartialMessages() {
		return false;
	}

	/**
	 * 给所有在线用户发送消息
	 *
	 * @param message
	 */
	public void sendMessageToUsers(TextMessage message) {
		for (WebSocketSession user : users) {
			try {
				if (user.isOpen()) {
					user.sendMessage(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 给某个用户发送消息
	 * 
	 * @param userName
	 * @param message
	 */
	public void sendMessageToUser(String userName, TextMessage message) {
		for (WebSocketSession user : users) {
			if (user.getAttributes().get(ConstantWebsocket.WEBSOCKET_USERNAME).equals(userName)) {
				try {
					if (user.isOpen()) {
						user.sendMessage(message);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}
	
	@Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        //接收到客户端消息时调用
        System.out.println("text message: " + session.getId() + "-" + message.getPayload());
    }

}
