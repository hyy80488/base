package com.jw.base.framework.core.jasper;

import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.jw.base.framework.core.jasper.dto.ListrptConditionDto;
import com.jw.base.framework.core.jasper.type.ListReportHandlerMode;

public interface ListReportDataHandler {

	/**
	 * 报表处理
	 * @param param 参数
	 * @param condDto 画面条件
	 * @param mainDs 数据集
	 * @param response
	 * @throws Exception
	 */
	public byte[] reportHandler(Map<String, Object> param, ListrptConditionDto condDto, Collection mainDs, HttpServletResponse response) throws Exception;

}
