package com.jw.base.framework.core.jasper;

import com.jw.base.framework.core.jasper.dto.Binding;

public abstract class ListReportExpressionEvaluation {

	/**
	 * 公式Evaluate
	 * 
	 * @param binding
	 * @return
	 */
	public static Object evaluate(Binding binding) {
		return null;
	}

	/**
	 * 判断是否为公式
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isExpression(String value) {
		return false;
	}
}
