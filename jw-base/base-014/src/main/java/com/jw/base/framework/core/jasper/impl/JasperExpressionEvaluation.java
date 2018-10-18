package com.jw.base.framework.core.jasper.impl;

import java.util.Date;

import com.jw.base.framework.core.jasper.ListReportExpressionEvaluation;
import com.jw.base.framework.core.jasper.dto.Binding;
import com.jw.base.framework.core.jasper.type.CalculationEnum;

import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignVariable;

public class JasperExpressionEvaluation extends ListReportExpressionEvaluation {

	public static final String EXPRESSION_PREFIX = "{";
	public static final String EXPRESSION_SUFFIX = "}";

	public static boolean isExpression(String value) {
		// 判断是否存在存在{}且{在}之前
		return (value != null && value.indexOf(EXPRESSION_PREFIX) != -1
				&& value.indexOf(EXPRESSION_SUFFIX) != -1 && (value
				.indexOf(EXPRESSION_SUFFIX) > value.indexOf(EXPRESSION_PREFIX)));
	}

	public static Object evaluate(Binding binding) {
		if (binding == null) {
			return null;
		}
		// 表达式
		String expression = binding.getExpression();
		if (!isExpression(expression)) {
			return null;
		}
		// // {位置
		// int beginIndex = expression.indexOf(EXPRESSION_PREFIX);
		// // }位置
		// int endIndex = expression.indexOf(EXPRESSION_SUFFIX);
		// // 取得{}之间的内容作为绑定项
		// String bindingName = expression.substring(beginIndex + 1, endIndex);
		// if (ObjectUtils.isNullOrEmptyString(bindingName)) {
		// return null;
		// }

		JRDesignExpression jrExpression = new JRDesignExpression();
		// jrExpression.setText("$F{" + bindingName + "}");
		jrExpression.setText("$F{" + expression + "}");

		return jrExpression;
	}

	/**
	 * 公式
	 * 
	 * @param binding
	 * @param jrVariable
	 */
	public static void doEvaluate(Binding binding, JRDesignVariable jrVariable) {
		JRDesignExpression jrExpression = (JRDesignExpression) evaluate(binding);

		if (jrExpression == null) {
			return;
		}
		// 公式类型
		CalculationEnum calculation = binding.getCalculation();

		switch (calculation) {
		case COUNT:
			// 求总数
			jrVariable
					.setCalculation(net.sf.jasperreports.engine.type.CalculationEnum.COUNT);
			break;
		case SUM:
			// 求和
			jrVariable
					.setCalculation(net.sf.jasperreports.engine.type.CalculationEnum.SUM);
			break;
		case AVERAGE:
			// 平均值
			jrVariable
					.setCalculation(net.sf.jasperreports.engine.type.CalculationEnum.AVERAGE);
			break;
		case LOWEST:
			jrVariable
					.setCalculation(net.sf.jasperreports.engine.type.CalculationEnum.LOWEST);
			break;
		case HIGHEST:
			jrVariable
					.setCalculation(net.sf.jasperreports.engine.type.CalculationEnum.HIGHEST);
			break;
		default:
			break;
		}

		// 数值类型
		Integer datatyp = binding.getDatatyp();
		switch (datatyp) {
		case 1:
			// 文本
			jrVariable.setValueClass(String.class);
			break;
		case 2:
			// 数值
			jrVariable.setValueClass(Double.class);
			break;
		case 3:
			// 日期
			jrVariable.setValueClass(Date.class);
		case 4:
			// 时间
			jrVariable.setValueClass(java.sql.Timestamp.class);
			break;
		default:
			break;
		}
		jrVariable.setExpression(jrExpression);
	}

}
