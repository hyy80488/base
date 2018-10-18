package com.jw.base.framework.core.jasper.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jw.base.framework.core.jasper.ListReportDataHandler;
import com.jw.base.framework.core.jasper.dto.ListrptConditionDto;
import com.jw.base.framework.core.servlet.StartUpServlet;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.HtmlExporter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleHtmlExporterOutput;
import net.sf.jasperreports.export.SimpleHtmlReportConfiguration;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.export.SimpleXlsReportConfiguration;

@Component
public class JasperReportDataHandler implements ListReportDataHandler {

//	@Autowired
//	private JasperReportStyleHandler jasperReportStyleHandler;
	@Autowired
	private JasperBindingHandler jasperBindingHandler;
	@Autowired
	private JasperReportTemplateManager jasperReportTemplateManager;

	/**
	 * 报表处理
	 * @param param 参数
	 * @param condDto 画面条件
	 * @param mainDs 数据集
	 * @param response
	 * @throws Exception
	 */
	@Override
	public byte[] reportHandler(Map<String, Object> param, ListrptConditionDto condDto, Collection mainDs, HttpServletResponse response) throws Exception {

		// 子报表
		List<String> subfiles = new ArrayList<String>();
		Map<String, Object> mainPath = new HashMap<String, Object>();
		// 加载报表
		//JasperDesign jasperDesign = jasperReportTemplateManager.loadTemplate(param, mainPath, subfiles);

		Map<String, Object> parameters = new HashMap<String, Object>();
		if (mainPath != null) {
			parameters.putAll(param);
		}

		// 主题
//		jasperReportStyleHandler.applyTheme(listrptId, jasperDesign);
		// 样式
//		jasperReportStyleHandler.applyListStyle(listrptId, jasperDesign);
		// 样式条件
//		jasperReportStyleHandler.applyLstrptslcond(listrptId, condDto, jasperDesign);
		// 绑定值设定
//		jasperBindingHandler.setReportBindings(listrptId, jasperDesign);
//		JRMapCollectionDataSource jrds = new JRMapCollectionDataSource(mainDs);

		String realPath = (String) StartUpServlet.getConfig().get("realPath")+param.get("reportPath");
		parameters.put("SUBREPORT_DIR", realPath);
		
		// 子报表处理
		//jasperBindingHandler.setSubreport(jasperDesign);
		
		// 子报表处理
		if (subfiles != null) {
			for (String subreport : subfiles) {
				// 加载模板
//				JasperDesign subDesign = JRXmlLoader.load(subreport);
				// 主题
//				jasperReportStyleHandler.applyTheme(listrptId, subDesign);
				// 样式
//				jasperReportStyleHandler.applyListStyle(listrptId, subDesign);
				// 样式条件
//				jasperReportStyleHandler.applyLstrptslcond(listrptId, condDto, subDesign);
				// 绑定值设定
//				jasperBindingHandler.setReportBindings(listrptId, subDesign);
				// 子报表处理
//				jasperBindingHandler.setSubreport(subDesign);
				// 编译子报表
				//JasperCompileManager.compileReportToFile(subDesign, subreport.replace(".jrxml", ".jasper"));
//				JasperReport jreport = (JasperReport)JRLoader.loadObject(new File(subreport.replace(".jrxml", ".jasper")));
			}
		}
		
		try{
			// 编译
//			JasperReport jreport = JasperCompileManager.compileReport(jasperDesign);
			
			param.put(JRParameter.REPORT_LOCALE, Locale.CHINA);
			
			String jasperPath = realPath + param.get("reportName") + ".jasper";
			
			JasperReport jreport;
			switch (MapUtils.getString(param, "LoadMode","FILE")) {
				case "FILE":
					jreport = (JasperReport)JRLoader.loadObject(new File(jasperPath));
					break;
				case "URL":
					jreport = (JasperReport)JRLoader.loadObject(new URL((String)param.get("LoadURL")));
					break;
				default:
					jreport = (JasperReport)JRLoader.loadObject(new File(jasperPath));
					break;
			}
			//InputStream stream = IOUtils.toInputStream(FastJsonUtil.toJSONString(mainDs), "UTF-8");
			//JRDataSource jrDataSource = new JsonDataSource(stream);
			JRDataSource jrDataSource = new JRBeanCollectionDataSource(mainDs);
			
			// 填充报表
			JasperPrint jprint = JasperFillManager.fillReport(jreport, parameters, jrDataSource);

			switch (MapUtils.getString(param, "handlerMode","HTML")) {
				case "HTML":
					// 输出HTML
					return viewHtml(jprint, (String) param.get("contextPath"), (String) param.get("reportName"), response);
				case "PDF":
					// 输出PDF
					return viewPDF(jprint, (String) param.get("reportName"), response);
				case "EXCEL":
					// 输出EXCEL
					return viewExcel(jprint, (String) param.get("reportName"), response);
				default:
					// 输出HTML
					return viewHtml(jprint, (String) param.get("contextPath"), (String) param.get("reportName"), response);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * HTML方式输出
	 * @param response
	 * @param jasperPrint
	 * @throws Exception
	 */
	private byte[] viewHtml(JasperPrint jasperPrint, String contextPath, String reportName, HttpServletResponse response) throws Exception {
		if (jasperPrint != null) {
			try {
				// 使用HtmlExporter导出Html格式
				HtmlExporter htmlexporter = new HtmlExporter();
				htmlexporter.setExporterInput(new SimpleExporterInput(jasperPrint));
//				String filepath = (String)PropertyConfigurer.getContextProperty("file.path");
//				FileUtil.mkDir(filepath);
//				htmlexporter.setExporterOutput(new SimpleHtmlExporterOutput(filepath+reportName+".html"));
				
				//流输出
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				htmlexporter.setExporterOutput(new SimpleHtmlExporterOutput(bos));
//				htmlexporter.setImageHandler(new WebHtmlResourceHandler("http://192.168.18.212/group1/M00/00/01/wKgS1Fkn5XiALuLDAAAXUCpfx5E385.jpg?image={0}{1}"));
				
				SimpleHtmlReportConfiguration reportExportConfiguration = new SimpleHtmlReportConfiguration();
				reportExportConfiguration.setWhitePageBackground(false);
				reportExportConfiguration.setRemoveEmptySpaceBetweenRows(true);
				htmlexporter.setConfiguration(reportExportConfiguration);
				
				htmlexporter.exportReport();
				
				return bos.toByteArray();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * PDF方式输出
	 * @param response
	 * @param jasperPrint
	 * @throws Exception
	 */
	private byte[] viewPDF(JasperPrint jasperPrint, String reportName, HttpServletResponse response) throws Exception {
		if (jasperPrint != null) {
			try {
				JRPdfExporter pdfexporter = new JRPdfExporter();
				pdfexporter.setExporterInput(new SimpleExporterInput(jasperPrint));
				//文件输出
//				String filepath = (String)PropertyConfigurer.getContextProperty("file.path");
//				FileUtil.mkDir(filepath);
//				pdfexporter.setExporterOutput(new SimpleOutputStreamExporterOutput(filepath+reportName+".pdf"));
				
				//流输出
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				pdfexporter.setExporterOutput(new SimpleOutputStreamExporterOutput(bos));
				
				//输出到响应流，展现在浏览器上 
//				pdfexporter.setExporterOutput(new SimpleOutputStreamExporterOutput(response.getOutputStream()));  
				//1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
//				response.setContentType("multipart/form-data");
		        //2.设置文件头：最后一个参数是设置下载文件名(假如我们叫a.pdf)
//				response.setHeader("Content-Disposition", "attachment;fileName="+reportName+".pdf");
				
				SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();  
				//可以通过configuration对象设置输出pdf文档的各种属性  
	            //configuration.setCreatingBatchModeBookmarks(true);
				configuration.setEncrypted(false);
				pdfexporter.setConfiguration(configuration);
				pdfexporter.exportReport();
				
				return bos.toByteArray();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Excel方式输出
	 * @param response
	 * @param jasperPrint
	 * @throws Exception
	 */
	private byte[] viewExcel(JasperPrint jasperPrint, String reportName, HttpServletResponse response) throws Exception {
		if (jasperPrint != null) {
			try {
				// 使用JRXlsExporter导出Excel格式
				JRXlsExporter excelexporter = new JRXlsExporter();
				excelexporter.setExporterInput(new SimpleExporterInput(jasperPrint));
//				String filepath = (String)PropertyConfigurer.getContextProperty("file.path");
//				FileUtil.mkDir(filepath);
//				excelexporter.setExporterOutput(new SimpleOutputStreamExporterOutput(filepath+reportName+".xls"));
				
				//流输出
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				excelexporter.setExporterOutput(new SimpleOutputStreamExporterOutput(bos));
				
				SimpleXlsReportConfiguration configuration = new SimpleXlsReportConfiguration();
				configuration.setOnePagePerSheet(false);
				excelexporter.setConfiguration(configuration);
				
				excelexporter.exportReport();
				
				return bos.toByteArray();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
