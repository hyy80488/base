package com.jw.base.framework.core.jasper.type;

public enum ListReportLoadMode {

	// Load jasper文件以FILE方式
	FILE("1"),
	// Load jasper文件以URL方式
	URL("2");

	// 定义私有变量
	private String code;

	private ListReportLoadMode(String code) {
		this.code = code;
	}

	public String toString() {
		return code;
	}
}
