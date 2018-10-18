package com.jw.base.framework.core.listener;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;

public class LogbackConfigListener extends ContextAwareBase implements LoggerContextListener, LifeCycle {

	private boolean started = false;

	@Override
	public void start() {
		if (started){
			return;
		}

		//读取来自config.properties文件的配置,并且放入configMap内
		String configFilePath = this.getClass().getClassLoader().getResource("").getPath() + "conf/cfg.properties";
		Map<String, Object> configMap = new HashMap<String, Object>();
		Properties props = new Properties();
		try {
			FileInputStream fis = new FileInputStream(configFilePath);
			Reader r = new InputStreamReader(fis, "UTF-8");
			props.load(r);
			for (Map.Entry<Object, Object> entry : props.entrySet()){
				String key = (String) entry.getKey();
				configMap.put(key, entry.getValue());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		Context context = getContext();
		context.putProperty("log4j.home", (String)configMap.get("log4j.home"));
		context.putProperty("log4j.filename", (String)configMap.get("log4j.filename"));
		started = true;
	}

	@Override
	public void stop() {
	}

	@Override
	public boolean isStarted() {
		return started;
	}

	@Override
	public boolean isResetResistant() {
		return true;
	}

	@Override
	public void onStart(LoggerContext context) {
	}

	@Override
	public void onReset(LoggerContext context) {
	}

	@Override
	public void onStop(LoggerContext context) {
	}

	@Override
	public void onLevelChange(Logger logger, Level level) {
	}

}
