package com.jw.base.framework.core.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;

import com.jw.base.framework.core.ConstantRpt;

/**
* 合并数据集合到主表(left)集合中，通过某个主键关联（替代数据库left join）
* 不适用场景：多表查询搜索且查询条件在关联表中且需要分页的时候，
* 适用场景：使用单表查询 + Merge工具
*/
public class MergeUtil {
	
	/**
	 * ## 方法说明：
	 * 	合并数据集合到主表(left)集合中，通过某个主键关联（替代数据库left join）
	 *  只适用字典类型的映射
	 * @param leftList 主数据集（增加addKey属性，并填充值）
	 * @param rightList 子数据集（如对应的字典数据集）
	 * @param leftKey 主数据集关联key
	 * @param rightKey 子数据集关联key
	 * @param addField 从子数据集获取的属性name，用于填充addKey
	 * @param addKey 关联至填充到主数据集新增addKey属性上
	 */
	public static void merge(List<Map<String, Object>> leftList, List<Map<String, Object>> rightList,
	   String leftKey, String rightKey, String addField, String addKey){
		
		//子集数据进行预处理，用对应字段的值作为key，重组List
		Map<String, Map<String, Object>> slaveDto = new HashMap<String, Map<String, Object>>();
		for(Map<String, Object> rightMap : rightList){
			slaveDto.put(String.valueOf(rightMap.get(rightKey)), rightMap);
		}
		
		//遍历主数据集，增加addKey属性，并填充值
		for(Map<String, Object> leftMap : leftList){
			String leftValue = String.valueOf(leftMap.get(leftKey));
			if (null != leftValue && null != slaveDto.get(leftValue)){
				leftMap.put(addKey, slaveDto.get(leftValue).get(addField));
			}else{
				leftMap.put(addKey, "");
			}
		}
	}

	/**
	 * ## 方法说明：
	 * 	对组装后的数据集，针对组装的字典部分，进行过滤
	 * @param leftList 组装后的数据集
	 * @param whereSQL 对应查询条件集合(从SQL中解析)
	 * @param queryMap 报表查询条件属性及值集合
	 * @throws ParseException 
	 */
	public static void filter(List<Map<String, Object>> leftList, Map<String, String[]> whereSQL, List<Map<String, Object>> queryMap) throws ParseException{
		if (null != queryMap && queryMap.size()>0 && null != whereSQL && !whereSQL.isEmpty()){
			for (Map<String, Object> map : queryMap){
				//条件标示
				String datascparacode = (String)map.get("datascparacode");
				if (null != datascparacode && !"".equals(datascparacode)){
					String datatyp = (String)map.get("datatyp");
					if (ConstantRpt.DATATYP_STRING.equals(datatyp)){
						String svlu = (String)map.get("svlu");
						if (StringUtil.isNotEmpty(svlu)) {
							//通过条件标示获得，从SQL中解析的查询条件集合
							String[] whereParam = whereSQL.get(datascparacode);
							if (null != whereParam && whereParam.length==3){
								switchWhereType(datatyp, leftList, whereParam[2], whereParam[1], svlu, null, null);
							}
						}
					}else if (ConstantRpt.DATATYP_INTEGER.equals(datatyp)){
						Integer nvlu = null;
						String svlu ="";
						if (map.get("nvlu") instanceof Integer) {
							nvlu = (Integer) map.get("nvlu");
						}else
						if (map.get("nvlu") instanceof Double) {
							nvlu = Integer.valueOf(((Double) map.get("nvlu")).toString());
						}else
						if (map.get("nvlu") instanceof String) {
							svlu = (String) map.get("nvlu");//整型，前端传的也是带双引号的String，因为可能有多值
						}
						if (null != nvlu) {
							//通过条件标示获得，从SQL中解析的查询条件集合
							String[] whereParam = whereSQL.get(datascparacode);
							if (null != whereParam && whereParam.length==3){
								switchWhereType(datatyp, leftList, whereParam[2], whereParam[1], null, nvlu, null);
							}
						}
						if (null != svlu) {
							//通过条件标示获得，从SQL中解析的查询条件集合
							String[] whereParam = whereSQL.get(datascparacode);
							if (null != whereParam && whereParam.length==3){
								switchWhereType(datatyp, leftList, whereParam[2], whereParam[1], svlu, null, null);
							}
						}
					}else if (ConstantRpt.DATATYP_FLOAT.equals(datatyp)){
						BigDecimal nvlu = null;
						String svlu ="";
						if (map.get("nvlu") instanceof Integer) {
							nvlu = new BigDecimal((Integer) map.get("nvlu"));
						}else
						if (map.get("nvlu") instanceof Double) {
							nvlu = new BigDecimal((Double) map.get("nvlu"));
						}else
						if (map.get("nvlu") instanceof String) {
							svlu = (String) map.get("nvlu");//浮点型，前端传的也是带双引号的String，因为可能有多值
						}
						if (null != nvlu) {
							//通过条件标示获得，从SQL中解析的查询条件集合
							String[] whereParam = whereSQL.get(datascparacode);
							if (null != whereParam && whereParam.length==3){
								switchWhereType(datatyp, leftList, whereParam[2], whereParam[1], null, null, nvlu);
							}
						}
						if (null != svlu) {
							//通过条件标示获得，从SQL中解析的查询条件集合
							String[] whereParam = whereSQL.get(datascparacode);
							if (null != whereParam && whereParam.length==3){
								switchWhereType(datatyp, leftList, whereParam[2], whereParam[1], svlu, null, null);
							}
						}
					}else if (ConstantRpt.DATATYP_DATE.equals(datatyp) || ConstantRpt.DATATYP_TIMESTAMP.equals(datatyp)){
						Date dvlu = null;
						if (map.get("dvlu") instanceof Long) {
							dvlu = new Date((Long)map.get("dvlu"));
						}else 
						if (map.get("dvlu") instanceof String) {
							String svlu = (String)map.get("dvlu");
							if (svlu.length()==10){
								dvlu = DateUtil.parse(svlu, DateUtil.DATE_FORMAT);
							}else
							if (svlu.length()==19){
								dvlu = DateUtil.parse(svlu, DateUtil.DATE_TIME_FORMAT);
							}
						}else{
							dvlu = (Date)map.get("dvlu");
						}
						if (null != dvlu) {
							//通过条件标示获得，从SQL中解析的查询条件集合
							String[] whereParam = whereSQL.get(datascparacode);
							if (null != whereParam && whereParam.length==3){
								switchWhereType(datatyp, leftList, whereParam[2], whereParam[1], DateUtil.formatDate(dvlu, DateUtil.DATE_TIME_FORMAT), null, null);
							}
						}
					}
				}
			}
		}
	}
	
	//查询条件类型判断
	//FILTER.EQUALS：等值
	//FILTER.IN-LIST：IN集合
	//FILTER.PRE-LIKE/FILTER.SUF-LIKE/FILTER.ALL-LIKE：前%/后%/前后%模糊查询
	public static void switchWhereType(String datatyp, List<Map<String, Object>> leftList, String whereType, String whereName, String svlu, Integer ivlu, BigDecimal nvlu){
		if (ConstantRpt.WHERE_FILTER_EQUALS.equals(whereType)){
			// 集合的过滤器工具
	        CollectionUtils.filter(leftList, new Predicate<Object>() {
	            @Override
	            public boolean evaluate(Object object) {
	            	Map<String, Object> m = (Map<String, Object>) object;
	                if(m.get(whereName).equals(svlu)) {
	                    return true;
	                }else{
	                	return false;
	                }
	            }
	        });
		} else
		if (ConstantRpt.WHERE_FILTER_PRE_LIKE.equals(whereType) && ConstantRpt.DATATYP_STRING.equals(datatyp)){
			// 集合的过滤器工具
	        CollectionUtils.filter(leftList, new Predicate<Object>() {
	            @Override
	            public boolean evaluate(Object object) {
	            	Map<String, Object> m = (Map<String, Object>) object;
	                if(((String)m.get(whereName)).endsWith(svlu)) {
	                    return true;
	                }else{
	                	return false;
	                }
	            }
	        });
		} else
		if (ConstantRpt.WHERE_FILTER_SUF_LIKE.equals(whereType) && ConstantRpt.DATATYP_STRING.equals(datatyp)){
			// 集合的过滤器工具
	        CollectionUtils.filter(leftList, new Predicate<Object>() {
	            @Override
	            public boolean evaluate(Object object) {
	            	Map<String, Object> m = (Map<String, Object>) object;
	                if(((String)m.get(whereName)).startsWith(svlu)) {
	                    return true;
	                }else{
	                	return false;
	                }
	            }
	        });
		} else
		if (ConstantRpt.WHERE_FILTER_ALL_LIKE.equals(whereType) && ConstantRpt.DATATYP_STRING.equals(datatyp)){
			// 集合的过滤器工具
	        CollectionUtils.filter(leftList, new Predicate<Object>() {
	            @Override
	            public boolean evaluate(Object object) {
	            	Map<String, Object> m = (Map<String, Object>) object;
	                if(null!=m.get(whereName) && ((String)m.get(whereName)).indexOf(svlu) != -1) {
	                    return true;
	                }else{
	                	return false;
	                }
	            }
	        });
		} else
		if (ConstantRpt.WHERE_FILTER_IN_LIST.equals(whereType) && ConstantRpt.DATATYP_STRING.equals(datatyp)){
			String[] vlu = StringUtil.split(svlu, ",");
			// 集合的过滤器工具
	        CollectionUtils.filter(leftList, new Predicate<Object>() {
	            @Override
	            public boolean evaluate(Object object) {
	            	Map<String, Object> m = (Map<String, Object>) object;
	            	for (String s : vlu){
	            		if(((String)m.get(whereName)).indexOf(s) != -1) {
		                    return true;
		                }
	            	}
	                return false;
	            }
	        });
		}
	}
	
	public static void main(String[] args) {
		Map<String, Object> main1 = new HashMap<String, Object>();
		main1.put("id", 1);
		main1.put("name", "A");
		main1.put("nation_id", 86);
		Map<String, Object> main2 = new HashMap<String, Object>();
		main2.put("id", 2);
		main2.put("name", "B");
		main2.put("nation_id", 86);
		Map<String, Object> main3 = new HashMap<String, Object>();
		main3.put("id", 3);
		main3.put("name", "C");
		main3.put("nation_id", 87);
		
		List<Map<String, Object>> leftList = new ArrayList<Map<String, Object>>();
		leftList.add(main1);
		leftList.add(main2);
		leftList.add(main3);
		
		
		Map<String, Object> sub1 = new HashMap<String, Object>();
		sub1.put("id", 1);
		sub1.put("p_id", 86);
		sub1.put("p_name", "中国");
		Map<String, Object> sub2 = new HashMap<String, Object>();
		sub2.put("id", 2);
		sub2.put("p_id", 87);
		sub2.put("p_name", "美国");
		Map<String, Object> sub3 = new HashMap<String, Object>();
		sub3.put("id", 3);
		sub3.put("p_id", 88);
		sub3.put("p_name", "日本");
		
		List<Map<String, Object>> rightList = new ArrayList<Map<String, Object>>();
		rightList.add(sub1);
		rightList.add(sub2);
		rightList.add(sub3);
		
		merge(leftList, rightList, "nation_id", "p_id", "p_name", "nation_name");
		
		// 集合的过滤器工具
        CollectionUtils.filter(leftList, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object object) {
            	Map<String, Object> m = (Map<String, Object>) object;
                if(m.get("nation_name").equals("中国")) {
                    return true;
                }else{
                	return false;
                }
            }
        });
		
		for(Map<String, Object> leftMap : leftList){
			System.out.println(leftMap);
		}
		
		//*****************************************************************************************
		
		Map<String, Object> query1 = new HashMap<String, Object>();
		query1.put("datascparacode", "acct_no");
		query1.put("datascparadrpt", "预订帐号");
		query1.put("datatyp", "1");
		query1.put("memo", "");
		Map<String, Object> query2 = new HashMap<String, Object>();
		query2.put("datascparacode", "rate_avg");
		query2.put("datascparadrpt", "实收房价");
		query2.put("datatyp", "3");
		query2.put("memo", "");
		Map<String, Object> query3 = new HashMap<String, Object>();
		query3.put("datascparacode", "floor_id");
		query3.put("datascparadrpt", "楼层");
		query3.put("datatyp", "2");
		query3.put("memo", "@FLOOR@");
		
		
	}
}
