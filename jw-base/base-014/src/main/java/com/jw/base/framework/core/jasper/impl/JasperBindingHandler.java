package com.jw.base.framework.core.jasper.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.jw.base.framework.core.jasper.ListReportBingingHandler;
import com.jw.base.framework.core.jasper.dto.Binding;
import com.jw.base.framework.core.jasper.type.CalculationEnum;
import com.jw.base.framework.core.util.StringUtil;

import net.sf.jasperreports.engine.JRBand;
import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRGroup;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JRSection;
import net.sf.jasperreports.engine.JRStaticText;
import net.sf.jasperreports.engine.JRSubreportParameter;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignBand;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignField;
import net.sf.jasperreports.engine.design.JRDesignGroup;
import net.sf.jasperreports.engine.design.JRDesignImage;
import net.sf.jasperreports.engine.design.JRDesignSubreport;
import net.sf.jasperreports.engine.design.JRDesignSubreportParameter;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.design.JRDesignVariable;
import net.sf.jasperreports.engine.design.JasperDesign;

@Component
public class JasperBindingHandler implements ListReportBingingHandler {

	// 报表绑定项处理
	@Override
	public void setReportBindings(int listId, Object obj) throws Exception {
		JasperDesign design = (JasperDesign) obj;

		// 筛选字段
		JRDesignField parentfiltercolumn = (JRDesignField) design.getFieldsMap().get(ListReportFilterUtil.parentfilterName);
		// 筛选值
		JRDesignField parentfilterdata = (JRDesignField) design.getFieldsMap().get(ListReportFilterUtil.parentfilterData);

		if (parentfiltercolumn == null) {
			JRDesignField jRDesignField = new JRDesignField();
			jRDesignField.setName(ListReportFilterUtil.parentfilterName);
			jRDesignField.setValueClass(java.util.List.class);
			design.addField(jRDesignField);
		} else {
			parentfiltercolumn.setValueClass(java.util.List.class);
		}
		if (parentfilterdata == null) {
			JRDesignField jRDesignField = new JRDesignField();
			jRDesignField.setName(ListReportFilterUtil.parentfilterData);
			jRDesignField.setValueClass(java.util.Map.class);
			design.addField(jRDesignField);
		} else {
			parentfilterdata.setValueClass(java.util.Map.class);
		}

		// 根据List报表ID查出所有绑定项及其值
		// List<RptLstrptbindset> lstrptbindsets = lstrptbindsetManager.findByListId(listId);
		
		// 未设置绑定值
//		if (lstrptbindsets == null) {
//			return;
//		}
//		if (lstrptbindsets.size() == 0) {
//			return;
//		}
		
//		HibernateExtend.initialize(lstrptbindsets, new String[] { "rpttmpldtl" });
		List<Binding> titleBindings = new ArrayList<Binding>();
		List<Binding> pageHeadBindings = new ArrayList<Binding>();
		List<Binding> groupBindings = new ArrayList<Binding>();
		List<Binding> columnheadbindings = new ArrayList<Binding>();
		List<Binding> groupHeadBindings = new ArrayList<Binding>();
		List<Binding> fieldbindings = new ArrayList<Binding>();
		List<Binding> groupFootBindings = new ArrayList<Binding>();
		List<Binding> columnfootbindings = new ArrayList<Binding>();
		List<Binding> pageFootBindings = new ArrayList<Binding>();
		List<Binding> summaryBindings = new ArrayList<Binding>();
		List<Binding> variablesBindings = new ArrayList<Binding>();

		// 设置列头
		setColumnHeader(listId, design);
		// 设置field类型
		setFieldClassType(listId, design);

		Binding binding;
		Object value = null;
		// 循环绑定值设定LIST，获取各个绑定项及其值
//		for (RptLstrptbindset lstrptbindset : lstrptbindsets) {
//			// 获取报表模板绑定项名称
//			RptRpttmpldtl rpttmpldtl = lstrptbindset.getRpttmpldtl();
//			String bindName = rpttmpldtl.getBindingnm();
//			String bindflg = rpttmpldtl.getBindingflg().getCode();
//			// 数据类型
//			RpttmpldtlDatatypEnum datatypEnum = rpttmpldtl.getDatatyp();
//			// 计算公式
//			// String sformula = lstrptbindset.getSformula();
//
//			// OLAP公式类别ID
//			Integer olapcaclId = lstrptbindset.getOlapcaclId();
//			// OLAP公式表达式
//			String expression1 = lstrptbindset.getExpression1();
//			// 图报表引擎公式ID
//			Integer valcaclId = lstrptbindset.getValcaclId();
//			// 图报表引擎公式表达式
//			String expression2 = lstrptbindset.getExpression2();
//			// LIST报表-数据条件
//			Integer lstrptdscondId = lstrptbindset.getLstrptdscondId();
//			// 获取绑定项值类型
//			// String bindType = rpttmpldtl.getDatatyp().getCode();
//			// 获取绑定数据集类型
//			// 1：绑定数据集；2：手工输入；3：数据值选择；4：公式
//			String bindDatasetType = rpttmpldtl.getBindtyp().getCode();
//
//			// 如果类型为1（绑定数据集），则获取对应数据集中的值.如果为2（任意值），则直接从lstrptbindset中获取值
//			if (bindDatasetType.equals("1")) {
//
//			} else if (bindDatasetType.equals("4")) {
//				// 计算公式
//				// value = lstrptbindset.getSFORMULA();
//				// lstrptbindset.g
//
//				Integer datatyp = 0;
//				if (datatypEnum != null) {
//					datatyp = Integer.parseInt(datatypEnum.getCode());
//				}
//
//				OlapParameter valcaclPara = olapParameterManager.getById(valcaclId);
//
//				if (valcaclPara != null) {
//					// 公式类型
//					String valcacl = valcaclPara.getStr1();
//					// 转换为枚举
//					CalculationEnum calculation = convertCalculation(valcacl);
//					if (StringUtils.isNotBlank(valcacl)) {
//						binding = new Binding();
//						binding.setKey(bindName);
//						binding.setName((String) value);
//						binding.setDatatyp(datatyp);
//						// 公式类型
//						binding.setCalculation(calculation);
//						// 公式内容
//						binding.setExpression(expression2);
//						variablesBindings.add(binding);
//					}
//				}
//			} else {
//				if (lstrptbindset.getDvlu() != null) {
//					value = lstrptbindset.getDvlu();
//				} else if (lstrptbindset.getNvlu() != null) {
//					value = lstrptbindset.getNvlu();
//				} else if (lstrptbindset.getSvlu() != null) {
//					value = lstrptbindset.getSvlu();
//				} else {
//					// value = lstrptbindset.getSformula();
//				}
//
//				// 对绑定名和绑定值进行处理
//				switch (bindflg) {
//				case "1":
//					binding = new Binding();
//					binding.setKey(bindName);
//					binding.setName((String) value);
//					titleBindings.add(binding);
//					break;
//				case "2":
//					binding = new Binding();
//					binding.setKey(bindName);
//					binding.setName((String) value);
//					pageHeadBindings.add(binding);
//					break;
//				case "3":
//					binding = new Binding();
//					binding.setKey(bindName);
//					binding.setName((String) value);
//					groupBindings.add(binding);
//					break;
//				case "4":
//					binding = new Binding();
//					binding.setKey(bindName);
//					binding.setName((String) value);
//					columnheadbindings.add(binding);
//					break;
//				case "5":
//					binding = new Binding();
//					binding.setKey(bindName);
//					binding.setName((String) value);
//					groupHeadBindings.add(binding);
//					break;
//				case "6":
//					binding = new Binding();
//					binding.setKey(bindName);
//					binding.setName((String) value);
//					fieldbindings.add(binding);
//					break;
//				case "7":
//					binding = new Binding();
//					binding.setKey(bindName);
//					binding.setName((String) value);
//					groupFootBindings.add(binding);
//					break;
//				case "8":
//					binding = new Binding();
//					binding.setKey(bindName);
//					binding.setName((String) value);
//					columnfootbindings.add(binding);
//					break;
//				case "9":
//					binding = new Binding();
//					binding.setKey(bindName);
//					binding.setName((String) value);
//					pageFootBindings.add(binding);
//					break;
//				case "10":
//					binding = new Binding();
//					binding.setKey(bindName);
//					binding.setName((String) value);
//					summaryBindings.add(binding);
//					break;
//				// case "A":
//				// binding = new Binding();
//				// binding.setKey(bindName);
//				// binding.setName((String) value);
//				// fieldbindings.add(binding);
//				// break;
//				case "B":
//					break;
//
//				}
//			}
//
//		}

		setTitle(design, titleBindings);
		setPageHead(design, pageHeadBindings);
		setColumnHeader(design, columnheadbindings);
		setField(design, fieldbindings);
		setGroup(design, groupBindings);
		setGroupHeader(design, groupHeadBindings);
		setGroupFooter(design, groupFootBindings);
		// setSubreport(design, lstrptbindsets);
		setSummary(design, summaryBindings);
		// 设置公式
		setVariable(design, variablesBindings);
	}
	
	public static Map<String, Object> setParameter(List<Binding> parabindings) {
		if (parabindings.size() > 0) {
			Map<String, Object> map = new HashMap<String, Object>();
			for (Binding binding : parabindings) {
				map.put(binding.getKey(), binding.getName());
			}
			return map;
		}
		return null;
	}

	public static void setVariable(JasperDesign design, List<Binding> variablebindings) {
		if (variablebindings.size() > 0) {
			for (Binding binding : variablebindings) {
				JRDesignVariable jrVariable = (JRDesignVariable) design.getVariablesMap().get(binding.getKey());
				JasperExpressionEvaluation.doEvaluate(binding, jrVariable);
			}
		}
	}

	public static void setTitle(JasperDesign design, List<Binding> titlebindings) {
		if (titlebindings.size() > 0) {
			JRDesignBand titleBand = (JRDesignBand) design.getTitle();
			for (Binding binding : titlebindings) {
				JRElement jrelement = titleBand.getElementByKey(binding.getKey());
				if (jrelement != null) {
					setJrelement(jrelement, binding);
				}
			}
		}
	}

	public static void setPageHead(JasperDesign design, List<Binding> pageHeadbindings) {
		if (pageHeadbindings.size() > 0) {
			JRDesignBand headBand = (JRDesignBand) design.getPageHeader();
			for (Binding binding : pageHeadbindings) {
				JRElement jrelement = headBand.getElementByKey(binding.getKey());
				if (jrelement != null) {
					setJrelement(jrelement, binding);
				}
			}
		}
	}

	public static void setPageHead(JasperReport jreport, List<Binding> pageHeadbindings) {
		if (pageHeadbindings.size() > 0) {
			JRBand headBand = (JRBand) jreport.getPageHeader();
			for (Binding binding : pageHeadbindings) {
				JRElement jrelement = headBand.getElementByKey(binding.getKey());
				if (jrelement != null) {
					setJrelement(jrelement, binding);
				}
			}
		}
	}

	public static void setPageFoot(JasperDesign design, List<Binding> pageFootbindings) {
		if (pageFootbindings.size() > 0) {
			JRDesignBand footBand = (JRDesignBand) design.getPageFooter();
			for (Binding binding : pageFootbindings) {
				JRElement jrelement = footBand.getElementByKey(binding.getKey());
				if (jrelement != null) {
					setJrelement(jrelement, binding);
				}
			}
		}
	}

	public static void setPageFoot(JasperReport jreport, List<Binding> pageFootbindings) {
		if (pageFootbindings.size() > 0) {

			JRBand footBand = (JRBand) jreport.getPageFooter();
			for (Binding binding : pageFootbindings) {
				JRElement jrelement = footBand.getElementByKey(binding.getKey());
				if (jrelement != null) {
					setJrelement(jrelement, binding);
				}
			}
		}
	}

	public static void setColumnHeader(JasperDesign design, List<Binding> columnheadbindings) {
		if (columnheadbindings.size() > 0) {
			JRDesignBand headBand = (JRDesignBand) design.getColumnHeader();
			List<String> bindColumns = new ArrayList<String>();
			for (Binding binding : columnheadbindings) {
				JRElement jrelement = headBand.getElementByKey(binding.getKey());
				if (jrelement != null) {
					setJrelement(jrelement, binding);
					bindColumns.add(binding.getKey());
				}
			}
		}
	}

	public static void setField(JasperDesign design, List<Binding> fieldbindings) throws JRException {
		JRSection jRSection = design.getDetailSection();
		if (jRSection == null) {
			return;
		}
		JRDesignBand detailBand = (JRDesignBand) jRSection.getBands()[0];
		List<String> bindColumns = new ArrayList<String>();
		if (fieldbindings.size() > 0) {
			for (Binding binding : fieldbindings) {
				JRElement jrelement = detailBand.getElementByKey(binding.getKey());
				if (jrelement != null) {
					bindColumns.add(binding.getKey());
					setJrelement(jrelement, binding);
				}
			}
		}
	}

	// 先设置detail里面的field
	public static void setGroup(JasperDesign design, List<Binding> groupBindings) {
		if (groupBindings.size() > 0) {
			for (Binding binding : groupBindings) {
				JRDesignGroup group = (JRDesignGroup) design.getGroupsMap().get(binding.getKey());
				JRDesignExpression expression = new JRDesignExpression();
				expression.setText(binding.getName());
				group.setExpression(expression);
			}
		}
	}

	// 先设置detail里面的field
	public static void setGroup(JasperReport jreport, List<Binding> groupBindings) {
		if (groupBindings.size() > 0) {
			for (Binding binding : groupBindings) {
				JRGroup[] groups = jreport.getGroups();
				if (groups != null) {
					if (groups.length > 0) {
						for (JRGroup group : groups) {
							if (group.getName().equals(binding.getKey())) {
								JRDesignExpression expression = new JRDesignExpression();
								expression.setText(binding.getName());
								((JRDesignGroup) group).setExpression(expression);
							}
						}
					}
				}

			}
		}
	}

	// 先设置detail里面的field
	public static void setGroupHeader(JasperDesign design, List<Binding> groupHeadBindings) {
		if (groupHeadBindings.size() > 0) {
			for (Binding binding : groupHeadBindings) {
				String[] s = binding.getKey().split("-");
				JRDesignGroup group = (JRDesignGroup) design.getGroupsMap().get(s[0]);
				JRElement jrElement = group.getGroupHeaderSection().getBands()[Integer.parseInt(s[1]) - 1].getElementByKey(s[2]);
				setJrelement(jrElement, binding);
			}
		}
	}

	// 先设置detail里面的field
	public static void setGroupHeader(JasperReport jreport, List<Binding> groupHeadBindings) {
		if (groupHeadBindings.size() > 0) {
			for (Binding binding : groupHeadBindings) {
				String[] s = binding.getKey().split("-");
				JRGroup[] groups = jreport.getGroups();
				if (groups != null) {
					if (groups.length > 0) {
						for (JRGroup group : groups) {
							if (group.getName().equals(s[0])) {
								JRElement jrElement = group.getGroupHeaderSection().getBands()[Integer.parseInt(s[1]) - 1].getElementByKey(s[2]);
								setJrelement(jrElement, binding);
							}
						}
					}
				}
			}
		}
	}

	public static void setGroupFooter(JasperDesign design, List<Binding> groupFootBindings) {
		if (groupFootBindings.size() > 0) {
			for (Binding binding : groupFootBindings) {
				String[] s = binding.getKey().split("-");
				JRDesignGroup group = (JRDesignGroup) design.getGroupsMap().get(s[0]);
				JRElement jrElement = group.getGroupFooterSection().getBands()[Integer.parseInt(s[1]) - 1].getElementByKey(s[2]);
				if (jrElement != null) {
					setJrelement(jrElement, binding);
				}
			}
		}
	}

	// GroupFooter
	public static void setGroupFooter(JasperReport jreport, List<Binding> groupFootBindings) {
		if (groupFootBindings.size() > 0) {
			for (Binding binding : groupFootBindings) {
				String[] s = binding.getKey().split("-");
				JRGroup[] jrGroup = jreport.getGroups();
				if (jrGroup != null) {
					if (jrGroup.length > 0) {
						JRGroup group = jrGroup[0];
						JRElement jrElement = group.getGroupFooterSection().getBands()[Integer.parseInt(s[1]) - 1].getElementByKey(s[2]);
						if (jrElement != null) {
							setJrelement(jrElement, binding);
						}
					}
				}

			}
		}
	}

	public static void setSummary(JasperDesign design, List<Binding> summaryBindings) {
		if (summaryBindings.size() > 0) {
			JRDesignBand summaryBand = (JRDesignBand) design.getSummary();
			for (Binding binding : summaryBindings) {
				JRElement jrelement = summaryBand.getElementByKey(binding.getKey());
				if (jrelement != null) {
					setJrelement(jrelement, binding);
				}
			}
		}
	}

	// 设置Summary
	public static void setSummary(JasperReport jreport, List<Binding> summaryBindings) {
		if (summaryBindings.size() > 0) {
			JRBand summaryBand = (JRBand) jreport.getSummary();
			for (Binding binding : summaryBindings) {
				// 取得Summary设定
				JRElement jrelement = summaryBand.getElementByKey(binding.getKey());
				if (jrelement != null) {
					setJrelement(jrelement, binding);
				}
			}
		}
	}

	public static void setJrelement(JRElement jrelement, Binding binding) {
		if (jrelement instanceof JRStaticText) {
			JRStaticText staticText = (JRStaticText) jrelement;
			staticText.setText(binding.getName());
		}
		if (jrelement instanceof JRDesignTextField) {
			JRDesignTextField text = (JRDesignTextField) jrelement;
			JRDesignExpression expression = new JRDesignExpression();
			expression.setText(binding.getName());
			text.setExpression(expression);
		}
		if (jrelement instanceof JRDesignImage) {
			JRDesignImage image = (JRDesignImage) jrelement;
			JRDesignExpression expression = new JRDesignExpression();
			expression.setText(binding.getName());
			image.setExpression(expression);
		}
	}

	private void setColumnHeader(int listId, JasperDesign design) {
		// 根据List报表ID查出所有绑定项及其值
		//List<RptLstrptbindset> lstrptbindsets = lstrptbindsetManager.findByListId(listId);
		List<Binding> columnheadbindings = new ArrayList<Binding>();
		Binding binding;

		// 未设置绑定值
//		if (lstrptbindsets == null) {
//			return;
//		}
//		if (lstrptbindsets.size() == 0) {
//			return;
//		}
		
		//HibernateExtend.initialize(lstrptbindsets, new String[] { "rpttmpldtl" });
		// 循环绑定值设定LIST，获取各个绑定项及其值
//		for (RptLstrptbindset lstrptbindset : lstrptbindsets) {
//			Integer datasetId = lstrptbindset.getDatasetId();
//			Integer listrptdsId = lstrptbindset.getListrptdsId();
//
//			// 列名设置
//			if (datasetId != null && listrptdsId != null) {
//				// 获取报表模板绑定项名称
//				RptRpttmpldtl rpttmpldtl = lstrptbindset.getRpttmpldtl();
//				Map<String, String> colnms = new HashMap<String, String>();
//				Map<String, String> colBindMap = new HashMap<String, String>();
//				Map<String, DatatypEnum> coltype = new HashMap<String, DatatypEnum>();
//				BindtypEnum bindtyp = rpttmpldtl.getBindtyp();
//				if (bindtyp != null) {
//					// 1：绑定数据集；2：手工输入；3：数据值选择；4：公式
//					String bindDatasetType = rpttmpldtl.getBindtyp().getCode();
//					// 如果类型为1（绑定数据集），则获取对应数据集中的值.如果为2（任意值），则直接从lstrptbindset中获取值
//					if (bindDatasetType.equals("1")) {
//						// dataset字段名
//						dataHandler.getDatasetColName(datasetId, colnms, coltype);
//						// 报表
//						dataHandler.getColumnBindset(listId, listrptdsId, colBindMap);
//						// 绑定项列名和描述
//						Map<String, String> bindingName = new HashMap<String, String>();
//						if (colBindMap != null && colnms != null) {
//							for (String key : colBindMap.keySet()) {
//								if (colnms.containsKey(key)) {
//									// 绑定项
//									bindingName.put(colBindMap.get(key), colnms.get(key));
//								}
//							}
//						}
//
//						if (bindingName != null) {
//							for (String columnNm : bindingName.keySet()) {
//								binding = new Binding();
//								binding.setKey(columnNm + "_name");
//								binding.setName((String) bindingName.get(columnNm));
//								columnheadbindings.add(binding);
//							}
//							setColumnHeader(design, columnheadbindings);
//							columnheadbindings.clear();
//						}
//					}
//				}
//			}
//		}

	}

	/**
	 * 设置field的类型
	 * 
	 * @param listId
	 * @param design
	 * @throws JRException
	 */
	private void setFieldClassType(int listId, JasperDesign design) throws JRException {
		// 根据List报表ID查出所有绑定项及其值
		// List<RptLstrptbindset> lstrptbindsets = lstrptbindsetManager.findByListId(listId);
		
		// 未设置绑定值
//		if (lstrptbindsets == null) {
//			return;
//		}
//		if (lstrptbindsets.size() == 0) {
//			return;
//		}
		
//		HibernateExtend.initialize(lstrptbindsets, new String[] { "rpttmpldtl" });

		// 循环绑定值设定LIST，获取各个绑定项及其值
//		for (RptLstrptbindset lstrptbindset : lstrptbindsets) {
//			Integer datasetId = lstrptbindset.getDatasetId();
//			Integer listrptdsId = lstrptbindset.getListrptdsId();
//			// 列名设置
//			if (datasetId != null && listrptdsId != null) {
//				// 获取报表模板绑定项名称
//				RptRpttmpldtl rpttmpldtl = lstrptbindset.getRpttmpldtl();
//				Map<String, String> colnms = new HashMap<String, String>();
//				Map<String, String> colBindMap = new HashMap<String, String>();
//				Map<String, DatatypEnum> coltype = new HashMap<String, DatatypEnum>();
//				BindtypEnum bindtyp = rpttmpldtl.getBindtyp();
//				if (bindtyp != null) {
//					// 1：绑定数据集；2：手工输入；3：数据值选择；4：公式
//					String bindDatasetType = rpttmpldtl.getBindtyp().getCode();
//					// 如果类型为1（绑定数据集），则获取对应数据集中的值.如果为2（任意值），则直接从lstrptbindset中获取值
//					if (bindDatasetType.equals("1")) {
//						// dataset字段名
//						dataHandler.getDatasetColName(datasetId, colnms, coltype);
//						// 报表
//						dataHandler.getColumnBindset(listId, listrptdsId, colBindMap);
//						// 绑定项列名和描述
//						// Map<String, String> bindingName = new HashMap<String,
//						// String>();
//						if (colBindMap != null && colnms != null) {
//							for (String key : colBindMap.keySet()) {
//								if (coltype.containsKey(key)) {
//									String fieldName = colBindMap.get(key);
//									JRDesignField jrField = (JRDesignField) design.getFieldsMap().get(fieldName);
//									if (jrField != null) {
//										DatatypEnum datatyp = coltype.get(key);
//
//										// 设置fiel类型
//										if (datatyp == DatatypEnum.TEXT) {
//											jrField.setValueClass(java.lang.String.class);
//										} else if (datatyp == DatatypEnum.INT) {
//											jrField.setValueClass(java.lang.Integer.class);
//										} else if (datatyp == DatatypEnum.FLOAT) {
//											jrField.setValueClass(java.lang.Double.class);
//										} else if (datatyp == DatatypEnum.DATE) {
//											jrField.setValueClass(java.util.Date.class);
//										} else if (datatyp == DatatypEnum.TIME) {
//											jrField.setValueClass(java.sql.Timestamp.class);
//										}
//									} else {
//
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
	}

	public static void setSubreport(JasperDesign design, JRDesignSubreport jrDesignSubreport) throws JRException {
		if (design != null) {

			String subKey = jrDesignSubreport.getKey();

			if (!StringUtil.isEmpty(subKey)) {
				// jrDesignSubreport.set
				JRDesignExpression dataSourceExpression = new JRDesignExpression();
				dataSourceExpression.setText("new net.sf.jasperreports.engine.data.JRBeanCollectionDataSource($P{" + subKey + "},$F{" + ListReportFilterUtil.parentfilterName + "},$F{" + ListReportFilterUtil.parentfilterData + "})");
				jrDesignSubreport.setDataSourceExpression(dataSourceExpression);
			}
			Map<String, JRParameter> jrParameters = design.getParametersMap();
			if (jrParameters != null) {
				for (String para : jrParameters.keySet()) {
					// 将当前参数传入子报表
					// JRParameter jrParameter = jrParameters.get(para);
					if (!StringUtil.isEmpty(para)) {
						JRDesignSubreportParameter subreportParameter = new JRDesignSubreportParameter();
						subreportParameter.setName(para);
						JRDesignExpression expression = new JRDesignExpression();
						expression.setText("$P{" + para + "}");
						// expression.setValueClass(jrParameters.get(para).getClass());
						subreportParameter.setExpression(expression);
						Map<String, JRSubreportParameter> jrSubParameters = jrDesignSubreport.getParametersMap();
						if (jrSubParameters.containsKey(para)) {

						} else {
							jrDesignSubreport.addParameter(subreportParameter);
						}
					}

				}
			}
		}

	}

	/**
	 * 子报表处理
	 * 
	 * @param design
	 * @throws JRException
	 */
	public void setSubreport(JasperDesign design) throws JRException {
		JRBand[] jrbands = design.getAllBands();
		for (JRBand jrBand : jrbands) {
			JRElement[] jrElements = jrBand.getElements();
			for (JRElement jrSubreport : jrElements) {
				if (jrSubreport instanceof JRDesignSubreport) {
					JRDesignSubreport jrDesignSubreport = (JRDesignSubreport) jrSubreport;
					setSubreport(design, jrDesignSubreport);
				}
			}
		}
	}

	/**
	 * 公式类型
	 * 
	 * @param valcacl
	 * @return
	 */
	public CalculationEnum convertCalculation(String valcacl) {
		// 默认为无公式
		CalculationEnum calculation = CalculationEnum.NOTHING;
		if (StringUtils.isNotBlank(valcacl)) {
			if (valcacl.equalsIgnoreCase("NOTHING")) {
				calculation = CalculationEnum.NOTHING;
			} else if (valcacl.equalsIgnoreCase("COUNT")) {
				// count
				calculation = CalculationEnum.COUNT;
			} else if (valcacl.equalsIgnoreCase("SUM")) {
				// 求和
				calculation = CalculationEnum.SUM;
			} else if (valcacl.equalsIgnoreCase("AVERAGE")) {
				// 平均值
				calculation = CalculationEnum.AVERAGE;
			} else if (valcacl.equalsIgnoreCase("LOWEST")) {
				// 最小值
				calculation = CalculationEnum.LOWEST;
			} else if (valcacl.equalsIgnoreCase("HIGHEST")) {
				// 最大值
				calculation = CalculationEnum.HIGHEST;
			}
		}
		return calculation;
	}

}
