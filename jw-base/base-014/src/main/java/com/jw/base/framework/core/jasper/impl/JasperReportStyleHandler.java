package com.jw.base.framework.core.jasper.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.jw.base.framework.core.jasper.ListReportStyleHandler;
import com.jw.base.framework.core.jasper.dto.ListrptConditionDto;
import com.jw.base.framework.core.jasper.dto.ListrptSlCondDto;

import net.sf.jasperreports.engine.design.JasperDesign;

@Component
public class JasperReportStyleHandler implements ListReportStyleHandler {

	/**
	 * list报表主题设定
	 * @param design
	 * @param listrptId
	 * @throws Exception
	 */
	@Override
	public void applyTheme(int listrptId, Object obj) throws Exception {
		JasperDesign design = (JasperDesign) obj;
		
		//Listrpt listrpt = listrptManager.getById(listrptId);
		//Integer themeId = listrpt.getThemeId();
		
		// 主题ID
		Integer themeId = 0;
		if (themeId != null) {
			
//			List<Themeelmtsp> themeelmtsps = themeelmtspManager.listThemeelmtsp(themeId);
//			if (themeelmtsps != null) {
//				HibernateExtend.initialize(themeelmtsps, new String[] {"themeelmt", "themeelmt.element", "styleprop" });
//				for (Themeelmtsp themeelmtsp : themeelmtsps) {
//					JasperEngineUtil.setStyle(themeelmtsp, design);
//				}
//			}
			
//			StlThemeelmtsp st = new StlThemeelmtsp();
//			st.setSvlu("仿宋体");
//			JasperEngineUtil.setStyle(st, design);
		}
	}

	/**
	 * list报表样式属性设定应用
	 * @param design
	 * @param listrptId
	 * @throws Exception
	 */
	@Override
	public void applyListStyle(int listrptId, Object obj) throws Exception {
		JasperDesign design = (JasperDesign) obj;
		
//		List<RptLstrptstyle> lstrptstyles = lstrptstyleManager.findByListId(listrptId);
		
//		if (lstrptstyles == null) {
//			return;
//		}
//		if (lstrptstyles.size() == 0) {
//			return;
//		}
		
//		HibernateExtend.initialize(lstrptstyles, new String[] { "rpttmplelem", "rpttmplelem.element", "styleprop" });
//		for (Lstrptstyle lstrptstyle : lstrptstyles) {
//			JasperEngineUtil.setStyle(lstrptstyle, design);
//		}
		
//		RptLstrptstyle lstrptstyle = new RptLstrptstyle();
		// 分别获得图报表元素，样式属性元素以及样式属性元素值
//		JasperEngineUtil.setStyle(lstrptstyle, design);
	}

	/**
	 * list报表条件设定应用
	 * @param design
	 * @param listrptId
	 * @param condDto
	 * @throws Exception
	 */
	@Override
	public void applyLstrptslcond(int listrptId, ListrptConditionDto condDto, Object obj) throws Exception {
		JasperDesign design = (JasperDesign) obj;
		
//		List<RptLstrptslcond> lstrptslconds = lstrptslcondManager.findByListId(listrptId);
		
//		if (lstrptslconds == null) {
//			return;
//		}
//		if (lstrptslconds.size() == 0) {
//			return;
//		}

		Map<Integer, ListrptSlCondDto> slcondparam = new HashMap<Integer, ListrptSlCondDto>();
		if (condDto != null) {
			List<ListrptSlCondDto> listrptSlCondDtos = condDto.getListrptSlCondDto();
			if (listrptSlCondDtos != null) {
				for (ListrptSlCondDto listrptSlCondDto : listrptSlCondDtos) {
					Integer lstrptslcond = listrptSlCondDto.getId();
					slcondparam.put(lstrptslcond, listrptSlCondDto);
				}
			}
		}

//		HibernateExtend.initialize(lstrptslconds, new String[] { "rpttmplelem", "rpttmplelem.element", "styleprop" });
		// Rpttmplelem rpttmplelem;
		// 分别获得图报表元素，样式属性元素以及样式属性元素值
//		for (RptLstrptslcond lstrptslcond : lstrptslconds) {
//			// Rpttmplelem rpttmplelem = lstrptslcond.getRpttmplelem();
//			Integer lstrptslcondId = lstrptslcond.getId();
//			if (slcondparam.containsKey(lstrptslcondId)) {
//				ListrptSlCondDto slcondDtoParam = slcondparam
//						.get(lstrptslcondId);
//
//				String propvalue = slcondDtoParam.getPropvalue();
//				String datatyp = slcondDtoParam.getDatatyp();
//				if (StringUtils.isNotBlank(propvalue)) {
//					if (datatyp.equals("1")) {
//						lstrptslcond.setSvlu(propvalue);
//					} else if (datatyp.equals("2")) {
//						try {
//							Long nval = Long.parseLong(propvalue);
//							lstrptslcond.setNvlu(nval);
//						} catch (Exception e) {
//
//						}
//					} else if (datatyp.equals("3")) {
//						try {
//							Long nval = Long.parseLong(propvalue);
//							lstrptslcond.setNvlu(nval);
//						} catch (Exception e) {
//
//						}
//					} else {
//						lstrptslcond.setSvlu(propvalue);
//					}
//				}
//			}
//			JasperEngineUtil.setStyle(lstrptslcond, design);
//		}

	}

}
