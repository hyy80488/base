
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
 * 	菜谱类别DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-20]
 * @package com.jw.hms.cmm.m3130.f030.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-20|gaofei|新增|PosCookbookTypResultDto新增
 */
public class PosCookbookTypDto implements java.io.Serializable {
	/** ID  **/
	private Integer id;
	/** 菜谱类别标识  **/
	private Integer cookbookTypId;
	/** 集团标识  **/
	private String chainUid;
	/** 酒店(单位)标识 标识当前数据是集团或酒店录入的 **/
	private String unitUid;
	/** 菜谱标识  **/
	private Integer cookbookId;
	/** 菜谱类别代码 类别代码业务上为4位 大类2位+小类2位 **/
	private String cookbookTypCd;
	/** 菜谱类别名称  **/
	private String cookbookTypNm;
	/** 上级类别标识  **/
	private Integer parentTypId;
	/** 上级类别代码  **/
	private String parentTypCd;
	/** 菜谱类别级别  **/
	private Integer cookbookTypGrade;
	/** 排序号  **/
	private Integer cookbookTypSeq;
	/** 最小类别 0-不是,1-是 **/
	private String endFlg;
	/** 有效标识 0-无效,1-有效 **/
	private String validFlg;
	/** 删除标记 0-未删除,1-已删除 **/
	private String delFlg;
	/** 版本号  **/
	private Integer version;
	/** 备注  **/
	private String memo;
	/** 分组标识 0-不是,1-是 **/
	private String groupFlg;
	/** businessUid **/
	private String businessUid;
	/** businessStus **/
	private String businessStus;
	public Integer getId() {
		return this.id;
	}	
	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getCookbookTypId() {
		return this.cookbookTypId;
	}	
	public void setCookbookTypId(Integer value) {
		this.cookbookTypId = value;
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
	public String getCookbookTypCd() {
		return this.cookbookTypCd;
	}	
	public void setCookbookTypCd(String value) {
		this.cookbookTypCd = value;
	}
	public String getCookbookTypNm() {
		return this.cookbookTypNm;
	}	
	public void setCookbookTypNm(String value) {
		this.cookbookTypNm = value;
	}
	public Integer getParentTypId() {
		return this.parentTypId;
	}	
	public void setParentTypId(Integer value) {
		this.parentTypId = value;
	}
	public String getParentTypCd() {
		return this.parentTypCd;
	}	
	public void setParentTypCd(String value) {
		this.parentTypCd = value;
	}
	public Integer getCookbookTypGrade() {
		return this.cookbookTypGrade;
	}	
	public void setCookbookTypGrade(Integer value) {
		this.cookbookTypGrade = value;
	}
	public Integer getCookbookTypSeq() {
		return this.cookbookTypSeq;
	}	
	public void setCookbookTypSeq(Integer value) {
		this.cookbookTypSeq = value;
	}
	public String getEndFlg() {
		return this.endFlg;
	}	
	public void setEndFlg(String value) {
		this.endFlg = value;
	}
	public String getValidFlg() {
		return this.validFlg;
	}	
	public void setValidFlg(String value) {
		this.validFlg = value;
	}
	public String getDelFlg() {
		return this.delFlg;
	}	
	public void setDelFlg(String value) {
		this.delFlg = value;
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
	public String getGroupFlg() {
		return this.groupFlg;
	}	
	public void setGroupFlg(String value) {
		this.groupFlg = value;
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
		sql.append(String.format(":cookbook_typ_id_%s, ",index));
		map.put("cookbook_typ_id_"+index, new HashMap<>());
		map.get("cookbook_typ_id_"+index).put(getCookbookTypId(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":chain_uid_%s, ",index));
		map.put("chain_uid_"+index, new HashMap<>());
		map.get("chain_uid_"+index).put(getChainUid(), StandardBasicTypes.STRING);
		sql.append(String.format(":unit_uid_%s, ",index));
		map.put("unit_uid_"+index, new HashMap<>());
		map.get("unit_uid_"+index).put(getUnitUid(), StandardBasicTypes.STRING);
		sql.append(String.format(":cookbook_id_%s, ",index));
		map.put("cookbook_id_"+index, new HashMap<>());
		map.get("cookbook_id_"+index).put(getCookbookId(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":cookbook_typ_cd_%s, ",index));
		map.put("cookbook_typ_cd_"+index, new HashMap<>());
		map.get("cookbook_typ_cd_"+index).put(getCookbookTypCd(), StandardBasicTypes.STRING);
		sql.append(String.format(":cookbook_typ_nm_%s, ",index));
		map.put("cookbook_typ_nm_"+index, new HashMap<>());
		map.get("cookbook_typ_nm_"+index).put(getCookbookTypNm(), StandardBasicTypes.STRING);
		sql.append(String.format(":parent_typ_id_%s, ",index));
		map.put("parent_typ_id_"+index, new HashMap<>());
		map.get("parent_typ_id_"+index).put(getParentTypId(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":parent_typ_cd_%s, ",index));
		map.put("parent_typ_cd_"+index, new HashMap<>());
		map.get("parent_typ_cd_"+index).put(getParentTypCd(), StandardBasicTypes.STRING);
		sql.append(String.format(":cookbook_typ_grade_%s, ",index));
		map.put("cookbook_typ_grade_"+index, new HashMap<>());
		map.get("cookbook_typ_grade_"+index).put(getCookbookTypGrade(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":cookbook_typ_seq_%s, ",index));
		map.put("cookbook_typ_seq_"+index, new HashMap<>());
		map.get("cookbook_typ_seq_"+index).put(getCookbookTypSeq(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":end_flg_%s, ",index));
		map.put("end_flg_"+index, new HashMap<>());
		map.get("end_flg_"+index).put(getEndFlg(), StandardBasicTypes.STRING);
		sql.append(String.format(":valid_flg_%s, ",index));
		map.put("valid_flg_"+index, new HashMap<>());
		map.get("valid_flg_"+index).put(getValidFlg(), StandardBasicTypes.STRING);
		sql.append(String.format(":del_flg_%s, ",index));
		map.put("del_flg_"+index, new HashMap<>());
		map.get("del_flg_"+index).put(getDelFlg(), StandardBasicTypes.STRING);
		sql.append(String.format(":version_%s, ",index));
		map.put("version_"+index, new HashMap<>());
		map.get("version_"+index).put(getVersion(), StandardBasicTypes.INTEGER);
		sql.append(String.format(":memo_%s, ",index));
		map.put("memo_"+index, new HashMap<>());
		map.get("memo_"+index).put(getMemo(), StandardBasicTypes.STRING);
		sql.append(String.format(":group_flg_%s, ",index));
		map.put("group_flg_"+index, new HashMap<>());
		map.get("group_flg_"+index).put(getGroupFlg(), StandardBasicTypes.STRING);
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
		sb.append(" insert into pos_cookbook_typ ");
		sb.append("( ");
		sb.append("	cookbook_typ_id, ");
		sb.append("	chain_uid, ");
		sb.append("	unit_uid, ");
		sb.append("	cookbook_id, ");
		sb.append("	cookbook_typ_cd, ");
		sb.append("	cookbook_typ_nm, ");
		sb.append("	parent_typ_id, ");
		sb.append("	parent_typ_cd, ");
		sb.append("	cookbook_typ_grade, ");
		sb.append("	cookbook_typ_seq, ");
		sb.append("	end_flg, ");
		sb.append("	valid_flg, ");
		sb.append("	del_flg, ");
		sb.append("	created_by_uid, ");
		sb.append("	created_by_cd, ");
		sb.append("	created_by, ");
		sb.append("	created_date, ");
		sb.append("	created_unit_uid, ");
		sb.append("	created_unit_cd, ");
		sb.append("	version, ");
		sb.append("	memo, ");
		sb.append("	group_flg, ");
		sb.append("	business_uid, ");
		sb.append("	business_stus ");
		sb.append(")  ");
		return sb.toString();
	}
	
	@Transient
	public void conventMapToEntity(Map<String, Object> map) throws Exception {
		if(MapUtils.isNotEmpty(map)){
				setId(NumberUtil.toInt(map.get("id"), null));
				setCookbookTypId(NumberUtil.toInt(map.get("cookbook_typ_id"), null));
				setChainUid(Objects.toString(map.get("chain_uid"), null));
				setUnitUid(Objects.toString(map.get("unit_uid"), null));
				setCookbookId(NumberUtil.toInt(map.get("cookbook_id"), null));
				setCookbookTypCd(Objects.toString(map.get("cookbook_typ_cd"), null));
				setCookbookTypNm(Objects.toString(map.get("cookbook_typ_nm"), null));
				setParentTypId(NumberUtil.toInt(map.get("parent_typ_id"), null));
				setParentTypCd(Objects.toString(map.get("parent_typ_cd"), null));
				setCookbookTypGrade(NumberUtil.toInt(map.get("cookbook_typ_grade"), null));
				setCookbookTypSeq(NumberUtil.toInt(map.get("cookbook_typ_seq"), null));
				setEndFlg(Objects.toString(map.get("end_flg"), null));
				setValidFlg(Objects.toString(map.get("valid_flg"), null));
				setDelFlg(Objects.toString(map.get("del_flg"), null));
				setVersion(NumberUtil.toInt(map.get("version"), null));
				setMemo(Objects.toString(map.get("memo"), null));
				setGroupFlg(Objects.toString(map.get("group_flg"), null));
				setBusinessUid(Objects.toString(map.get("business_uid"), null));
				setBusinessStus(Objects.toString(map.get("business_stus"), null));
		}
	}
	
	/**
	{
	"id":"ID ",
	"cookbookTypId":"菜谱类别标识 ",
	"chainUid":"集团标识 ",
	"unitUid":"酒店(单位)标识 标识当前数据是集团或酒店录入的",
	"cookbookId":"菜谱标识 ",
	"cookbookTypCd":"菜谱类别代码 类别代码业务上为4位 大类2位+小类2位",
	"cookbookTypNm":"菜谱类别名称 ",
	"parentTypId":"上级类别标识 ",
	"parentTypCd":"上级类别代码 ",
	"cookbookTypGrade":"菜谱类别级别 ",
	"cookbookTypSeq":"排序号 ",
	"endFlg":"最小类别 0-不是,1-是",
	"validFlg":"有效标识 0-无效,1-有效",
	"delFlg":"删除标记 0-未删除,1-已删除",
	"version":"版本号 ",
	"memo":"备注 ",
	"traceUid":"traceUid",
	"groupFlg":"分组标识 0-不是,1-是",
	"businessUid":"businessUid",
	"businessStus":"businessStus",
	}
	 **/
	/**
	{
	"id":"ID ",
	"cookbook_typ_id":"菜谱类别标识 ",
	"chain_uid":"集团标识 ",
	"unit_uid":"酒店(单位)标识 标识当前数据是集团或酒店录入的",
	"cookbook_id":"菜谱标识 ",
	"cookbook_typ_cd":"菜谱类别代码 类别代码业务上为4位 大类2位+小类2位",
	"cookbook_typ_nm":"菜谱类别名称 ",
	"parent_typ_id":"上级类别标识 ",
	"parent_typ_cd":"上级类别代码 ",
	"cookbook_typ_grade":"菜谱类别级别 ",
	"cookbook_typ_seq":"排序号 ",
	"end_flg":"最小类别 0-不是,1-是",
	"valid_flg":"有效标识 0-无效,1-有效",
	"del_flg":"删除标记 0-未删除,1-已删除",
	"version":"版本号 ",
	"memo":"备注 ",
	"trace_uid":"traceUid",
	"group_flg":"分组标识 0-不是,1-是",
	"business_uid":"businessUid",
	"business_stus":"businessStus",
	}
	 **/
	
}

