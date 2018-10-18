package com.jw.common.framework.m0002.f001.dto.handler;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jw.base.framework.core.ConstantRpt;
import com.jw.base.framework.core.util.ListUtil;
import com.jw.common.framework.m0002.f001.dto.DataTableDto;

import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.beans.BeanMap;

/*
 * 
 * ## 类说明：
 * 	cglib生成bean
 * @author    [liubowen]   
 * @version   [V1.0, 2017年5月10日]
 * @package com.jw.common.framework.m0002.f001.dto.handler
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年5月10日|liubowen|新增|DynamicBeanHandler.java新增
 */
public class DynamicBeanHandler {

	/*
	 * 根据query查询结果，动态生成对应List<Object>，属性名同查询结果名，属性类型同查询结果类型
	 */
	public static List<Object> defineBean(Map<String,List<Object>> datamap, String reporttype, DataTableDto dataDataSetMapping) throws ClassNotFoundException {
		if (reporttype.equals(ConstantRpt.REPORT_SINGLE)) {
			return generateSingleBean(datamap.get("dtoList"));
		} else if (reporttype.equals(ConstantRpt.REPORT_MULTIPLE)) {
			return generateMultipleBean(datamap.get("dtoList"));
		} else if (reporttype.equals(ConstantRpt.REPORT_MASTER_SLAVE)) {
			return generateMasterSlaveBean(datamap.get("dtoList"), datamap.get("dsflgList"), datamap.get("datasetIdList"), dataDataSetMapping);
		}
		return null;
	}

	/*
	 * 根据query查询结果，动态生成对应List<Bean>
	 * 其中Bean结构如下:
	 * class Bean {
	 * 		主属性1;
	 * 		主属性2;
	 * 		……
	 */
	public static List<Object> generateSingleBean(List<Object> dataTableDto) throws ClassNotFoundException {
		List<Object> beanList = new ArrayList<Object>();
		if (ListUtil.isNotEmpty(dataTableDto)) {
			//单一数据源
			if (dataTableDto.size() == 1) {
				List<Map<String, Object>> l = ((DataTableDto)dataTableDto.get(0)).getData();
				//循环每一条记录（设置bean属性，并set值）
				for (Map<String, Object> m : l) {
					Map<String, Class<?>> properties = new HashMap<String, Class<?>>();
					//循环获取每条记录的每个属性
					String[] grps = null;
					if(null != ((DataTableDto)dataTableDto.get(0)).getMemo()){
						grps=((DataTableDto)dataTableDto.get(0)).getMemo().toString().split("\\|");
					}
					for (Map.Entry<String, Object> entry : m.entrySet()) {
						if (null == entry.getValue()) {
							properties.put(entry.getKey(), Class.forName("java.lang.String"));
						} else {
							properties.put(entry.getKey(), entry.getValue().getClass());
						}
						
						//判断如果查询条件中包含分组条件（xu）
//						if(entry.getKey().equals(((DataTableDto)dataTableDto.get(0)).getMemo())){
//							properties.put(ConstantRpt.QUERY_GROUPBY, entry.getValue().getClass());
//						}
						if(null != grps){
							for(int i=0;i<grps.length;i++){
								if(entry.getKey().equals(grps[i])){
									properties.put(ConstantRpt.QUERY_GROUPBY+"_"+i, entry.getValue().getClass());
								}
							}
						}
					}
					//根据属性生成bean
					Object bean = generateObject(properties);
					//给bean set值
					for (Map.Entry<String, Object> entry : m.entrySet()) {
						setValue(bean, entry.getKey(), entry.getValue());
						//分组具体字段
//						if(entry.getKey().equals(((DataTableDto)dataTableDto.get(0)).getMemo())){
//							setValue(bean, ConstantRpt.QUERY_GROUPBY, entry.getValue());
//						}
						if(null != grps){
							for(int i=0;i<grps.length;i++){
								if(entry.getKey().equals(grps[i])){
									setValue(bean, ConstantRpt.QUERY_GROUPBY+"_"+i, entry.getValue());
								}
							}
						}
					}
					
					//给bean set query_groupby 值（xu）
					//根据新传进来的分组的具体字段
					//从for (Map.Entry<String, Object> entry : m.entrySet()) 遍历到相应的值
					//setValue(bean, "query_groupby", "分组查询被选择的字段的值");
					
					//bean放入集合中
					beanList.add(bean);
				}
			}
		}
		return beanList;
	}

	/*
	 * 根据query查询结果，动态生成对应List<MasterBean>
	 * 其中MasterBean结构如下:
	 * class MasterBean {
	 * 		List<Object> subList1;
	 * 		List<Object> subList2;
	 * 		List<Object> ……;
	 * }
	 */
	public static List<Object> generateMultipleBean(List<Object> dataTableDto) throws ClassNotFoundException {
		List<Object> beanList = new ArrayList<Object>();
		if (ListUtil.isNotEmpty(dataTableDto)) {
			//组合报表，多数据源
			Map<String, Class<?>> masterProperties = new HashMap<String, Class<?>>();
			Integer num = 1;
			//多数据源的主bean的属性设置
			for (Object d : dataTableDto) {
				masterProperties.put("subList" + num, new ArrayList<Object>().getClass());
				num++;
			}
			//重置
			num = 1;
			//根据属性生成主bean
			Object masterBean = generateObject(masterProperties);
			for (Object d : dataTableDto) {
				//子list bean生成
				List<Object> subBeanList = new ArrayList<Object>();
				List<Map<String, Object>> l = ((DataTableDto)d).getData();
				for (Map<String, Object> m : l) {
					Map<String, Class<?>> properties = new HashMap<String, Class<?>>();
					for (Map.Entry<String, Object> entry : m.entrySet()) {
						if (null == entry.getValue()) {
							properties.put(entry.getKey(), Class.forName("java.lang.String"));
						} else {
							properties.put(entry.getKey(), entry.getValue().getClass());
						}
					}
					Object bean = generateObject(properties);
					for (Map.Entry<String, Object> entry : m.entrySet()) {
						setValue(bean, entry.getKey(), entry.getValue());
					}
					subBeanList.add(bean);
				}
				setValue(masterBean, "subList" + num, subBeanList);
				num++;
			}
			//bean放入集合中
			beanList.add(masterBean);
		}
		return beanList;
	}

	/*
	 * 根据query查询结果，动态生成对应List<MasterBean>
	 * 其中MasterBean结构如下:
	 * class MasterBean {
	 * 		主属性1;
	 * 		主属性2;
	 * 		……
	 * 		List<Object> slaveList1;
	 * 		List<Object> slaveList2;
	 * 		List<Object> ……
	 * }
	 */
	public static List<Object> generateMasterSlaveBean(List<Object> dataTableDto, List<Object> dsflgList, List<Object> datasetIdList, DataTableDto dataDataSetMapping) throws ClassNotFoundException {
		List<Object> beanList = new ArrayList<Object>();
		if (ListUtil.isNotEmpty(dataTableDto)) {
			
			//先遍历出所有子集，并发子集数据进行预处理
			//子集结构Map
			Map<String, Class<?>> masterProperties = new HashMap<String, Class<?>>();
			//子库映射标示Map
			Map<String, String> slaveKeyMap = new HashMap<String, String>();
			//子库对应预处理后的Data
			Map<String, Map<String, List<Map<String, Object>>>> slaveData = new HashMap<String, Map<String, List<Map<String, Object>>>>();
			int dataLength = dataTableDto.size();
			for (int i=0; i<dataLength; i++) {
				//如果是子数据集
				if (ConstantRpt.DS_FLAG_SLAVE.equals(dsflgList.get(i))){
					
					//获得报表对应数据集主子对应关系
					List<Map<String, Object>> listDataDataSetMapping = dataDataSetMapping.getData();
					//子库映射标示
					String slaveKey="";
					for(Map<String, Object> mapping : listDataDataSetMapping){
						if(datasetIdList.get(i).equals(String.valueOf(mapping.get("slave_dataset_id")))){
							slaveKey = (String)mapping.get("slave_datastrudtlnm");
						}
					}
					slaveKeyMap.put("slaveList" + i, slaveKey);
					
					masterProperties.put("slaveList" + i, new ArrayList<Object>().getClass());
					//并发子集数据进行预处理，用对应字段作为key，重组List
					Map<String, List<Map<String, Object>>> slaveDto = new HashMap<String, List<Map<String, Object>>>();
					DataTableDto d = (DataTableDto)dataTableDto.get(i);
					List<Map<String, Object>> l = d.getData();
					for(Map<String, Object> m : l){
						String value = (String)m.get(slaveKey);
						if (slaveDto.containsKey(value)){
							slaveDto.get(value).add(m);
						}else{
							List<Map<String, Object>> newList = new ArrayList<Map<String, Object>>();
							newList.add(m);
							slaveDto.put(value, newList);
						}
					}
					slaveData.put("slaveList" + i, slaveDto);
				}
			}
			
			//获得主数据源data（第一个datadto为主数据源结果）
			List<Map<String, Object>> l = ((DataTableDto)dataTableDto.get(0)).getData();
			//循环每一条记录（设置bean属性，并set值）
			for (Map<String, Object> m : l) {
				Map<String, Class<?>> properties = new HashMap<String, Class<?>>();
				//循环获取每条记录的每个属性
				for (Map.Entry<String, Object> entry : m.entrySet()) {
					if (null == entry.getValue()) {
						properties.put(entry.getKey(), Class.forName("java.lang.String"));
					} else {
						properties.put(entry.getKey(), entry.getValue().getClass());
					}
				}
				
				//构建子集list结构属性
				for (Map.Entry<String, Class<?>> entry : masterProperties.entrySet()){
					properties.put(entry.getKey(), entry.getValue());
				}
				
				//根据属性生成bean
				Object masterBean = generateObject(properties);
				
				//给masterBean set值
				for (Map.Entry<String, Object> entry : m.entrySet()) {
					setValue(masterBean, entry.getKey(), entry.getValue());
				}
				
				//给masterBean的子集list赋值
				for (Map.Entry<String, Class<?>> entry : masterProperties.entrySet()){
					List<Object> slaveBeanList = new ArrayList<Object>();
					
					//从预处理结构中得到子结果集
					Map<String, List<Map<String, Object>>> slaveList = slaveData.get(entry.getKey());
					List<Map<String, Object>> ll = slaveList.get(m.get(slaveKeyMap.get(entry.getKey())));
					if (null != ll){
						for (Map<String, Object> slaveMap : ll) {
							Map<String, Class<?>> slaveProperties = new HashMap<String, Class<?>>();
							for (Map.Entry<String, Object> slaveEntry : slaveMap.entrySet()) {
								if (null == slaveEntry.getValue()) {
									slaveProperties.put(slaveEntry.getKey(), Class.forName("java.lang.String"));
								} else {
									slaveProperties.put(slaveEntry.getKey(), slaveEntry.getValue().getClass());
								}
							}
							//构建子的结构
							Object slavebean = generateObject(slaveProperties);
							//给子Bean set值
							for (Map.Entry<String, Object> slaveEntry : slaveMap.entrySet()) {
								setValue(slavebean, slaveEntry.getKey(), slaveEntry.getValue());
							}
							slaveBeanList.add(slavebean);
						}
					}
					setValue(masterBean, entry.getKey(), slaveBeanList);
				}
				
				//bean放入集合中
				beanList.add(masterBean);
			}
		}
		return beanList;
	}
	
	/*
	 * 生成Object
	 */
	private static Object generateObject(Map<String, Class<?>> properties) {
		BeanGenerator generator = new BeanGenerator();
		Set<String> keySet = properties.keySet();
		for (Iterator<String> i = keySet.iterator(); i.hasNext();) {
			String key = (String) i.next();
			generator.addProperty(key, (Class) properties.get(key));
		}
		return generator.create();
	}

	/*
	 * 得到对象对应属性值
	 */
	private static Object getValue(Object obj, String property) {
		BeanMap beanMap = BeanMap.create(obj);
		return beanMap.get(property);
	}

	/*
	 * 设置对象对应属性值
	 */
	private static void setValue(Object obj, String property, Object value) {
		BeanMap beanMap = BeanMap.create(obj);
		beanMap.put(property, value);
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Map<String, Class<?>> properties = new HashMap<String, Class<?>>();
		properties.put("id", Class.forName("java.lang.Integer"));
		properties.put("name", Class.forName("java.lang.String"));
		properties.put("address", Class.forName("java.lang.String"));
		Object stu = generateObject(properties);

		System.err.println("Set values");
		setValue(stu, "id", 123);
		setValue(stu, "name", "454");
		setValue(stu, "address", "789");

		System.err.println("Get values");
		System.err.println(">> " + getValue(stu, "id"));
		System.err.println(">> " + getValue(stu, "name"));
		System.err.println(">> " + getValue(stu, "address"));

		System.err.println("Show all methods");
		Method[] methods = stu.getClass().getDeclaredMethods();
		for (Method method : methods) {
			System.err.println(">> " + method.getName());
		}

		System.err.println("Show all properties");
		Field[] fields = stu.getClass().getDeclaredFields();
		for (Field field : fields) {
			System.err.println(">> " + field.getName());
		}
	}
}
