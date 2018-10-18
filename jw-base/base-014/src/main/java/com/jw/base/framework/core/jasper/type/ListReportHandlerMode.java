package com.jw.base.framework.core.jasper.type;

public enum ListReportHandlerMode {

	// 输出HTML
	HTML("1"),
	// 输出PDF格式
	PDF("2"),
	// 输出EXCEL
	EXCEL("3");

	// 定义私有变量
	private String code;

	private ListReportHandlerMode(String code) {
		this.code = code;
	}

	public String toString() {
		return code;
	}
}
