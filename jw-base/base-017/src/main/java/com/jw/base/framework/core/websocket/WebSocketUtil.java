package com.jw.base.framework.core.websocket;

import java.io.IOException;
import javax.websocket.Session;

public class WebSocketUtil {
	public static void sendMessage(String message, Session session) throws IOException {
		if (session.isOpen()) {
			session.getBasicRemote().sendText(message);
			//this.session.setMaxTextMessageBufferSize(10240000);
			//this.session.getAsyncRemote().sendText(message);
		}
	}
}
