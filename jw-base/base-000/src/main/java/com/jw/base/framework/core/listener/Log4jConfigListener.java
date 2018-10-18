package com.jw.base.framework.core.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.util.Log4jWebConfigurer;

import com.jw.base.framework.core.config.PropertyConfigurer;

public class Log4jConfigListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.setProperty("log4j.home",(String)PropertyConfigurer.getContextProperty("log4j.home"));
		System.setProperty("log4j.filename",(String)PropertyConfigurer.getContextProperty("log4j.filename"));
		Log4jWebConfigurer.initLogging(event.getServletContext());
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		Log4jWebConfigurer.shutdownLogging(event.getServletContext());
	}

}
