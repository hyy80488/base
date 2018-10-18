package com.jw.base.framework.core.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

//发生异常后，返回的都是json数据
public class DefaultExceptionHandler implements HandlerExceptionResolver {    
    
	@Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,  Exception ex) {    
    		ModelAndView mv = new ModelAndView();             
            /*  使用response返回    */  
            response.setStatus(HttpStatus.OK.value()); //设置状态码  
            response.setContentType(MediaType.APPLICATION_JSON_VALUE); //设置ContentType  
            response.setCharacterEncoding("UTF-8"); //避免乱码  
            response.setHeader("Cache-Control", "no-cache, must-revalidate");  
            try {  
                response.getWriter().write("{\"success\":false,\"msg\":\"" + ex.getMessage() + "\"}");  
            } catch (IOException e) {  
               //log.error("与客户端通讯异常:"+ e.getMessage(), e);  
            }  
  
            //log.debug("异常:" + ex.getMessage(), ex);  
            return mv;  
    }  
}
