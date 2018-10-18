/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3140.f010.dto;

import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmAttribute;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.LoginBaseDto;

/**
 * ## 类说明：
 * 	登录页面参数传递DTO
 * @author    [jianana]   
 * @version   [V1.0, 2017年1月5日]
 * @package com.jw.hms.group.m3140.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年1月5日|jianana|新增|LoginResponseDto.java新增
 */
@DrptDto(dtonm = "登录页面参数传递DTO",dtodrpt="登录页面参数传递DTO")
public class LoginRequestDto extends LoginBaseDto implements java.io.Serializable{
	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -3827118429128081315L;
	@DrptField(fieldnm="jwAccessToken", fielddrpt="分配的授权码")
	private String jwAccessToken;
	@DrptField(fieldnm="jwClientCode", fielddrpt="群组code")
	private String jwClientCode;
	@DrptField(fieldnm="hotelCode", fielddrpt="酒店代码")
	private String hotelCode;
	@DrptField(fieldnm="language", fielddrpt="语种")
	private Integer language;
	
	public String getJwAccessToken() {
		return jwAccessToken;
	}
	public void setJwAccessToken(String jwAccessToken) {
		this.jwAccessToken = jwAccessToken;
	}
	public String getJwClientCode() {
		return jwClientCode;
	}
	public void setJwClientCode(String jwClientCode) {
		this.jwClientCode = jwClientCode;
	}
	public Integer getLanguage() {
		return language;
	}
	public void setLanguage(Integer language) {
		this.language = language;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	/** sessinKey **/
	@DrptField(fieldnm="sessinKey", fielddrpt="sessinKey")
	private String sessinKey;
	/** 用户Uid **/
	@DrptField(fieldnm="userUid", fielddrpt="用户uid")
	private String userUid;
	/** 集团代码 **/
	@DrptField(fieldnm="chainCd", fielddrpt="集团代码")
	private String chainCd;
	/** 酒店代码 **/
	@DrptField(fieldnm="unitCd", fielddrpt="酒店代码")
	private String unitCd;
	/** 用户编码及用户密码 **/
	@DrptField(fieldnm="systemInfo", fielddrpt="用户编码及用户密码")
	private String systemInfo;
	/** 集团UID **/
	@DrptField(fieldnm="chainUid", fielddrpt="集团UID")
	private String chainUid;
	/** 酒店UID **/
	@DrptField(fieldnm="unitUid", fielddrpt="酒店UID")
	private String unitUid;
	/** 权限信息 **/
	@DrptField(fieldnm="permissionInfo", fielddrpt="权限信息")
	private List<Map<String, Object>> permissionInfo;
	/** 菜单信息 **/
	@DrptField(fieldnm="menuInfo", fielddrpt="菜单信息")
	private List<Map<String, Object>> menuInfo;
	/** 报表信息 **/
	@DrptField(fieldnm="reportInfo", fielddrpt="报表信息")
	private List<Map<String, Object>> reportInfo;
	@DrptField(fieldnm="plfOption", fielddrpt="开关数据")
	private List<Map<String,Object>> plfOption;
	
	public List<Map<String, Object>> getPlfOption() {
		return plfOption;
	}
	public void setPlfOption(List<Map<String, Object>> plfOption) {
		this.plfOption = plfOption;
	}
	/**
	 * 连接数据库类型
	 *  0:正式库 
	 *  1:练习库 
	 *  2:测试库 
	 *  3:保留数据库标识1 
	 *  4:保留数据库标识2 
	 *  5:保留数据库标识3
	 */
	@DrptField(fieldnm="dbType", fielddrpt="连接数据库类型",paramtype=ConstantParm.ENUM_PARA_TYPE.SYS_PARA,paramsubtype=ConstantParmAttribute.PLF_OPS_DBCONF_DATA_TYP_WEB)
	private String dbType;
	
	/**
	 * 所属系统代码
	 * 例如：IF,FW,GRP,CMM,CRS,CRM,CCM,CMS,CSO,WDS,IDS
	 */
	@DrptField(fieldnm="sysId", fielddrpt="所属系统代码")
	private String sysId;
	/**
	 * 工作站代码
	 */
	@DrptField(fieldnm="wsNo", fielddrpt="工作站代码")
	private String wsNo;
	/**
	 * 	工作站机器名/机器名
	 * @return
	 */
	@DrptField(fieldnm="machineNm", fielddrpt="工作站机器名/机器名")
	private String machineNm;
	/**
	 * mac地址
	 */
	@DrptField(fieldnm="macAddr", fielddrpt="mac地址")
	private String macAddr;
	/**
	 * 	工作站名称
	 * @return
	 */
	@DrptField(fieldnm="stationNm", fielddrpt="工作站名称")
	private String stationNm;
	
	/**
	 * 1 普通登陆  2接口操作员登陆
	 */
	//1 普通登陆  2接口操作员登陆
	@DrptField(fieldnm="loginFlg", fielddrpt="登陆方式")
	private String loginFlg;
	//语种ID
	@DrptField(fieldnm="languageId", fielddrpt="语种ID")
	private Integer languageId;
	@DrptField(fieldnm="languageCd", fielddrpt="语种CD")
	private String languageCd;

	
	
	public String getSessinKey() {
		return sessinKey;
	}
	public void setSessinKey(String sessinKey) {
		this.sessinKey = sessinKey;
	}
	public String getUserUid() {
		return userUid;
	}
	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}
	public String getLanguageCd() {
		return languageCd;
	}
	public void setLanguageCd(String languageCd) {
		this.languageCd = languageCd;
	}
	public Integer getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}
	public String getWsNo() {
		return wsNo;
	}
	public void setWsNo(String wsNo) {
		this.wsNo = wsNo;
	}
	public String getMachineNm() {
		return machineNm;
	}
	public void setMachineNm(String machineNm) {
		this.machineNm = machineNm;
	}
	public String getStationNm() {
		return stationNm;
	}
	public void setStationNm(String stationNm) {
		this.stationNm = stationNm;
	}
	//@JSONField(serialize=false)
	public String getChainCd() {
		return chainCd;
	}
	public void setChainCd(String chainCd) {
		this.chainCd = chainCd;
	}
	public String getUnitCd() {
		return unitCd;
	}
	public void setUnitCd(String unitCd) {
		this.unitCd = unitCd;
	}
	public String getSystemInfo() {
		return systemInfo;
	}
	public void setSystemInfo(String systemInfo) {
		this.systemInfo = systemInfo;
	}
	public String getChainUid() {
		return chainUid;
	}
	public void setChainUid(String chainUid) {
		this.chainUid = chainUid;
	}
	public String getUnitUid() {
		return unitUid;
	}
	public void setUnitUid(String unitUid) {
		this.unitUid = unitUid;
	}
	public List<Map<String, Object>> getPermissionInfo() {
		return permissionInfo;
	}
	public void setPermissionInfo(List<Map<String, Object>> permissionInfo) {
		this.permissionInfo = permissionInfo;
	}
	public List<Map<String, Object>> getMenuInfo() {
		return menuInfo;
	}
	public void setMenuInfo(List<Map<String, Object>> menuInfo) {
		this.menuInfo = menuInfo;
	}
	
	public List<Map<String, Object>> getReportInfo() {
		return reportInfo;
	}
	public void setReportInfo(List<Map<String, Object>> reportInfo) {
		this.reportInfo = reportInfo;
	}
	public String getSysId() {
		return sysId;
	}
	public void setSysId(String sysId) {
		this.sysId = sysId;
	}
	public String getDbType() {
		return dbType;
	}
	public void setDbType(String dbType) {
		this.dbType = dbType;
	}
	public String getMacAddr() {
		return macAddr;
	}
	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}
	public String getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(String loginFlg) {
		this.loginFlg = loginFlg;
	}

}
