
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.persistence.Transient;

import org.apache.commons.collections4.MapUtils;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

import com.jw.base.framework.core.util.NumberUtil;

/** 
 * ## 类说明：
 * 	菜谱项目DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f030.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|gaofei|新增|PosCookbookItemResultDto新增
 */
public class PosCookbookItemDto implements java.io.Serializable {
	/** ID  **/
	private Integer id;
	/** 菜品类别标识  **/
	private Integer cookbookItemId;
	/** 集团标识  **/
	private String chainUid;
	/** 酒店(单位)标识 标识当前数据是集团或酒店录入的 **/
	private String unitUid;
	/** 菜谱标识  **/
	private Integer cookbookId;
	/** 菜谱类别标识  **/
	private Integer cookbookTypeId;
	/** 菜谱类别代码  **/
	private String cookbookTypeCd;
	/** 菜品标识  **/
	private Integer menuId;
	/** 定义菜品在当前菜谱中进行 分类显示时的类别 一道菜在一个菜谱中只能有一个分组类别 0-否 1-是 **/
	private String groupFlg;
	/** 版本号  **/
	private Integer version;
	/** 备注  **/
	private String memo;
	/** businessUid **/
	private String businessUid;
	/** businessStus **/
	private String businessStus;
	/** posMenuDtoT **/
	private PosMenuDtoT posMenuDtoT;
	
	
	public PosMenuDtoT getPosMenuDtoT() {
		return posMenuDtoT;
	}
	public void setPosMenuDtoT(PosMenuDtoT posMenuDtoT) {
		this.posMenuDtoT = posMenuDtoT;
	}
	public Integer getId() {
		return this.id;
	}	
	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getCookbookItemId() {
		return this.cookbookItemId;
	}	
	public void setCookbookItemId(Integer value) {
		this.cookbookItemId = value;
	}
	public String getChainUid() {
		return this.chainUid;
	}	
	public void setChainUid(String value) {
		this.chainUid = value;
	}
	public String getUnitUid() {
		return this.unitUid;
	}	
	public void setUnitUid(String value) {
		this.unitUid = value;
	}
	public Integer getCookbookId() {
		return this.cookbookId;
	}	
	public void setCookbookId(Integer value) {
		this.cookbookId = value;
	}
	public Integer getCookbookTypeId() {
		return this.cookbookTypeId;
	}	
	public void setCookbookTypeId(Integer value) {
		this.cookbookTypeId = value;
	}
	public String getCookbookTypeCd() {
		return this.cookbookTypeCd;
	}	
	public void setCookbookTypeCd(String value) {
		this.cookbookTypeCd = value;
	}
	public Integer getMenuId() {
		return this.menuId;
	}	
	public void setMenuId(Integer value) {
		this.menuId = value;
	}
	public String getGroupFlg() {
		return this.groupFlg;
	}	
	public void setGroupFlg(String value) {
		this.groupFlg = value;
	}
	public Integer getVersion() {
		return this.version;
	}	
	public void setVersion(Integer value) {
		this.version = value;
	}
	public String getMemo() {
		return this.memo;
	}	
	public void setMemo(String value) {
		this.memo = value;
	}
	public String getBusinessUid() {
		return this.businessUid;
	}	
	public void setBusinessUid(String value) {
		this.businessUid = value;
	}
	public String getBusinessStus() {
		return this.businessStus;
	}	
	public void setBusinessStus(String value) {
		this.businessStus = value;
	}
	
	
	
	/**
	 * ## 方法说明：
	 * 	将数据拼接成select 
	 * @param index 索引
	 * @param map 参数值
	 */
	@Transient
	public String selectSql(Integer index,Map<String, Map<Object, Type>> map){
		StringBuilder sql=new StringBuilder(" SELECT ");
		sql.append(String.format(":cookbook_item_id_%s, ",index));
		map.put("cookbook_item_id_"+index, new HashMap<>());
		map.get("cookbook_item_id_"+index).put(getCookbookItemId(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":chain_uid_%s, ",index));
		map.put("chain_uid_"+index, new HashMap<>());
		map.get("chain_uid_"+index).put(getChainUid(), StandardBasicTypes.STRING);
		sql.append(String.format(":unit_uid_%s, ",index));
		map.put("unit_uid_"+index, new HashMap<>());
		map.get("unit_uid_"+index).put(getUnitUid(), StandardBasicTypes.STRING);
		sql.append(String.format(":cookbook_id_%s, ",index));
		map.put("cookbook_id_"+index, new HashMap<>());
		map.get("cookbook_id_"+index).put(getCookbookId(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":cookbook_type_id_%s, ",index));
		map.put("cookbook_type_id_"+index, new HashMap<>());
		map.get("cookbook_type_id_"+index).put(getCookbookTypeId(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":cookbook_type_cd_%s, ",index));
		map.put("cookbook_type_cd_"+index, new HashMap<>());
		map.get("cookbook_type_cd_"+index).put(getCookbookTypeCd(), StandardBasicTypes.STRING);
		sql.append(String.format(":menu_id_%s, ",index));
		map.put("menu_id_"+index, new HashMap<>());
		map.get("menu_id_"+index).put(getMenuId(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":group_flg_%s, ",index));
		map.put("group_flg_"+index, new HashMap<>());
		map.get("group_flg_"+index).put(getGroupFlg(), StandardBasicTypes.STRING);
		sql.append(String.format(":version_%s, ",index));
		map.put("version_"+index, new HashMap<>());
		map.get("version_"+index).put(getVersion(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":memo_%s, ",index));
		map.put("memo_"+index, new HashMap<>());
		map.get("memo_"+index).put(getMemo(), StandardBasicTypes.STRING);
		sql.append(String.format(":business_uid_%s, ",index));
		map.put("business_uid_"+index, new HashMap<>());
		map.get("business_uid_"+index).put(getBusinessUid(), StandardBasicTypes.STRING);
		sql.append(String.format(":business_stus_%s ",index));
		map.put("business_stus_"+index, new HashMap<>());
		map.get("business_stus_"+index).put(getBusinessStus(), StandardBasicTypes.STRING);
		return sql.toString();
	}
	
	@Transient
	public String insertSql(){
		StringBuilder sb=new StringBuilder();
		sb.append(" insert into pos_cookbook_item ");
		sb.append("( ");
		sb.append("	cookbook_item_id, ");
		sb.append("	chain_uid, ");
		sb.append("	unit_uid, ");
		sb.append("	cookbook_id, ");
		sb.append("	cookbook_type_id, ");
		sb.append("	cookbook_type_cd, ");
		sb.append("	menu_id, ");
		sb.append("	group_flg, ");
		sb.append("	created_by_uid, ");
		sb.append("	created_by_cd, ");
		sb.append("	created_by, ");
		sb.append("	created_date, ");
		sb.append("	created_unit_uid, ");
		sb.append("	created_unit_cd, ");
		sb.append("	version, ");
		sb.append("	memo, ");
		sb.append("	business_uid, ");
		sb.append("	business_stus ");
		sb.append(")  ");
		return sb.toString();
	}
	
	@Transient
	public void conventMapToEntity(Map<String, Object> map) throws Exception {
		if(MapUtils.isNotEmpty(map)){
				setId(NumberUtil.toInt(map.get("id"), null));
				setCookbookItemId(NumberUtil.toInt(map.get("cookbook_item_id"), null));
				setChainUid(Objects.toString(map.get("chain_uid"), null));
				setUnitUid(Objects.toString(map.get("unit_uid"), null));
				setCookbookId(NumberUtil.toInt(map.get("cookbook_id"), null));
				setCookbookTypeId(NumberUtil.toInt(map.get("cookbook_type_id"), null));
				setCookbookTypeCd(Objects.toString(map.get("cookbook_type_cd"), null));
				setMenuId(NumberUtil.toInt(map.get("menu_id"), null));
				setGroupFlg(Objects.toString(map.get("group_flg"), null));
				setVersion(NumberUtil.toInt(map.get("version"), null));
				setMemo(Objects.toString(map.get("memo"), null));
				setBusinessUid(Objects.toString(map.get("business_uid"), null));
				setBusinessStus(Objects.toString(map.get("business_stus"), null));
		}
	}
	
	/**
	{
	"id":"ID ",
	"cookbookItemId":"菜品类别标识 ",
	"chainUid":"集团标识 ",
	"unitUid":"酒店(单位)标识 标识当前数据是集团或酒店录入的",
	"cookbookId":"菜谱标识 ",
	"cookbookTypeId":"菜谱类别标识 ",
	"cookbookTypeCd":"菜谱类别代码 ",
	"menuId":"菜品标识 ",
	"groupFlg":"定义菜品在当前菜谱中进行 分类显示时的类别 一道菜在一个菜谱中只能有一个分组类别 0-否 1-是",
	"version":"版本号 ",
	"memo":"备注 ",
	"traceUid":"traceUid",
	"businessUid":"businessUid",
	"businessStus":"businessStus",
	}
	 **/
	/**
	{
	"id":"ID ",
	"cookbook_item_id":"菜品类别标识 ",
	"chain_uid":"集团标识 ",
	"unit_uid":"酒店(单位)标识 标识当前数据是集团或酒店录入的",
	"cookbook_id":"菜谱标识 ",
	"cookbook_type_id":"菜谱类别标识 ",
	"cookbook_type_cd":"菜谱类别代码 ",
	"menu_id":"菜品标识 ",
	"group_flg":"定义菜品在当前菜谱中进行 分类显示时的类别 一道菜在一个菜谱中只能有一个分组类别 0-否 1-是",
	"version":"版本号 ",
	"memo":"备注 ",
	"trace_uid":"traceUid",
	"business_uid":"businessUid",
	"business_stus":"businessStus",
	}
	 **/
	
}

