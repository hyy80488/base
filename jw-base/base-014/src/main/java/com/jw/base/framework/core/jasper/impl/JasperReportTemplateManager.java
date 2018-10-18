package com.jw.base.framework.core.jasper.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.jw.base.framework.core.servlet.StartUpServlet;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

@Component
public class JasperReportTemplateManager {

	// 加载模板
	public JasperDesign loadTemplate(Map<String, Object> param, Map<String, Object> mainPath, List<String> subfiles) throws JRException {

		//Listrpt listrpt = listrptManager.getById(listrptId);

		// 报表模板ID
		//Integer rpttmplId = listrpt.getRpttmplId();

		// 报表模板定义
		//Rpttmpl rpttmpl = rpttmplManager.getById(rpttmplId);

		// 模板文件名
		//String jrxmlPath = rpttmpl.getFilenm();
		//String jrxmlPath = "D:\\_git\\jw-source\\3-common\\31xx001R\\src\\main\\resources\\jrxml\\MvcIReportExample.jrxml";

		String realPath = (String) StartUpServlet.getConfig().get("realPath") + param.get("reportPath");
		String jrxmlPath = realPath + (String)param.get("reportName") + ".jrxml";

		if (subfiles == null) {
			subfiles = new ArrayList<String>();
		}
		if (mainPath == null) {
			mainPath = new HashMap<String, Object>();
		}
		File file = new File(jrxmlPath);
		// 报表路径
		String filepath = file.getParent();
		mainPath.put("SUBREPORT_DIR", filepath + "\\");
		// 主报表名称
		String filename = file.getName();
		// 主报表前缀
		String filePre = filename.replace(".jrxml", "");
		File directory = new File(filepath);
		File[] files = directory.listFiles();
		if (files != null) {
			for (File f : files) {
				// 取得所有子报表--默认所有子报表都是主报表名字开始
				if (f.getName().startsWith(filePre)) {
					if (f.getName().endsWith(".jrxml") && !f.getName().equalsIgnoreCase(filename)) {
						subfiles.add(filepath + "\\" + f.getName());
					}
				}
			}
		}

		// 加载模板
		JasperDesign design = JRXmlLoader.load(jrxmlPath);
		return design;
	}
}
