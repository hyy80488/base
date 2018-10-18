package com.jw.base.framework.core.jasper;

import java.util.Map;

import com.jw.base.framework.core.jasper.dto.ListrptConditionDto;

public interface ListReportStyleHandler {

	/**
	 * list报表主题设定
	 * 
	 * @param design
	 * @param listrptId
	 * @throws Exception
	 */
	void applyTheme(int listrptId, Object design) throws Exception;

	/**
	 * list报表样式属性设定应用
	 * 
	 * @param design
	 * @param listrptId
	 * @throws Exception
	 */
	void applyListStyle(int listrptId, Object design) throws Exception;

	/**
	 * list报表条件设定应用
	 * 
	 * @param design
	 * @param listrptId
	 * @param condDto
	 * @throws Exception
	 */
	void applyLstrptslcond(int listrptId, ListrptConditionDto condDto, Object design) throws Exception;
}
