package com.jw.base.framework.core.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;  
  
/** 
 * websocket 配置类, 采用websocket形式实现的通讯类似于直接使用tcp协议，属于底层协议，spring中应用层 
 * 采用高层的协议进行长连接通讯，stomp 
 */  
@Configuration
//@EnableWebMvc //这个标注可以不加，如果有加，要extends WebMvcConfigurerAdapter
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {  
  
    @Autowired
    private SystemWebSocketHandler handler;
    
    @Autowired
    private WebSocketHandshakeInterceptor handshakeInterceptor;
    
    /** 
     * 注册支持的websocket 连接 
     */  
    @Override  
    public void registerWebSocketHandlers(WebSocketHandlerRegistry reg) {
        /** 
         * websocket形式连接, client连接 
         */  
        reg.addHandler(handler, "/websocket").addInterceptors(handshakeInterceptor);
          
        /** 
         * 不支持websocket的，采用sockjs 
         */  
        reg.addHandler(handler, "/sockjs/websocket").addInterceptors(handshakeInterceptor).withSockJS();
    }
}  
