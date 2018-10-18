package com.jw.base.framework.core.config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jw.base.framework.core.exception.BsProcessErrorCode;
import com.jw.base.framework.core.exception.BusinessException;
import com.jw.base.framework.core.util.StringUtil;

public class PropertyConfigurer extends PropertyPlaceholderConfigurer {

	private static Map<String, Object> ctxPropertiesMap;

	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props) throws BeansException {
		super.processProperties(beanFactory, props);
		//load properties to ctxPropertiesMap  
		ctxPropertiesMap = new HashMap<String, Object>();
		for (Map.Entry<Object, Object> entry : props.entrySet()){
			String keyStr = (String)entry.getKey();
			ctxPropertiesMap.put(keyStr, entry.getValue());
		}
		System.out.println("init load properties to map......");
		if (null != ctxPropertiesMap.get("param.reload") && "true".equals((String)ctxPropertiesMap.get("param.reload"))){
			task();
			System.out.println("start task......");
		}
	}

	//static method for accessing context properties  
	public static Object getContextProperty(String name) {
		return ctxPropertiesMap.get(name);
	}
	
	/**
	 * ## 方法说明：
	 * 	根据模块名称获取域名
	 * @param sourceNm:
	 * 				PMS/PCM/GRP/POS/LPS/CRM/CRS/EBS
	 * @return
	 * @throws Exception
	 */
	public static String getContextUrl(String sourceNm)throws Exception{
		String tempUrldomain = null;
		if(StringUtil.isEmpty(sourceNm)){
			return tempUrldomain;
		}
		switch (sourceNm) {
			case "LOG":tempUrldomain = (String)PropertyConfigurer.getContextProperty("log.apiurl");break;
			case "STAT":tempUrldomain = (String)PropertyConfigurer.getContextProperty("stat.apiurl");break;
			
			case "PMS":tempUrldomain = (String)PropertyConfigurer.getContextProperty("pms.apiurl");break;
			case "POS":tempUrldomain = (String)PropertyConfigurer.getContextProperty("pos.apiurl");break;
			case "LPS":tempUrldomain = (String)PropertyConfigurer.getContextProperty("lps.apiurl");break;
			case "CRM":tempUrldomain = (String)PropertyConfigurer.getContextProperty("crm.apiurl");break;
			case "CRS":tempUrldomain = (String)PropertyConfigurer.getContextProperty("crs.apiurl");break;
			case "EBS":tempUrldomain = (String)PropertyConfigurer.getContextProperty("ebs.apiurl");break;
			case "SCM":tempUrldomain = (String)PropertyConfigurer.getContextProperty("scm.apiurl");break;
			case "GFC":tempUrldomain = (String)PropertyConfigurer.getContextProperty("gfc.apiurl");break;
			case "GRP":tempUrldomain = (String)PropertyConfigurer.getContextProperty("grp.apiurl");break;

			case "CCS":tempUrldomain = (String)PropertyConfigurer.getContextProperty("ccs.apiurl");break;
			case "CLDR":tempUrldomain = (String)PropertyConfigurer.getContextProperty("cldr.apiurl");break;
			
			case "RPT":tempUrldomain = (String)PropertyConfigurer.getContextProperty("rpt.apiurl");break;
			case "IIR":tempUrldomain = (String)PropertyConfigurer.getContextProperty("iir.apiurl");break;
			case "CMS":tempUrldomain = (String)PropertyConfigurer.getContextProperty("cms.apiurl");break;
			case "PCM":tempUrldomain = (String)PropertyConfigurer.getContextProperty("pcm.apiurl");break;
			
			case "IFSVC1":tempUrldomain = (String)PropertyConfigurer.getContextProperty("ifsvc1.apiurl");break;
			case "OPEN":tempUrldomain = (String)PropertyConfigurer.getContextProperty("open.apiurl");break;
			default:throw new BusinessException(BsProcessErrorCode.ERROR_CODE_360008, "数据源模块不存在", "数据源模块不存在", BsProcessErrorCode.ERROR_LEVEL_5);
		}
		return tempUrldomain;
	}
	
	//系统参数cfg.properties定时重新加载
	public void task() {
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				try {
					Properties properties = new Properties();
					Resource res = new ClassPathResource("conf/cfg.properties");
					properties.load(res.getInputStream());
					for (Map.Entry<Object, Object> entry : properties.entrySet()){
						String keyStr = (String)entry.getKey();
						ctxPropertiesMap.put(keyStr, entry.getValue());
					}
					System.out.println("load properties again......"+ctxPropertiesMap);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		Timer timer = new Timer();
		//第一次执行任务时可以指定你想要的delay时间
		long delay = 1000 * Integer.valueOf((String)ctxPropertiesMap.get("param.delay"));
		//X秒触发一次
		long intevalPeriod = 1000 * Integer.valueOf((String)ctxPropertiesMap.get("param.intevalPeriod"));
		// schedules the task to be run in an interval    
		logger.info("Task setting  delay:" + delay + "  intevalPeriod:" + intevalPeriod);
		timer.scheduleAtFixedRate(task, delay, intevalPeriod);
	}
}
