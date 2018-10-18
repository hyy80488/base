
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m3310.f010.dto;

/** 
 * ## 类说明：
 * 	菜品类别DTO
 * @author    [gaofei]   
 * @version   [V1.0, 2017-09-06]
 * @package com.jw.hms.pos.m3310.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-09-06|gaofei|新增|PosMenuTypResultDto新增
 */
public class PosMenuTypDtoT implements java.io.Serializable {
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 5945150738440363950L;
	/** ID  **/
	private Integer id;
	/** 菜品类别标识  **/
	private Integer menuTypId;
	/** 集团标识  **/
	private String chainUid;
	/** 酒店(单位)标识 标识当前数据是集团或酒店录入的 **/
	private String unitUid;
	/** 菜品类别代码 类别代码业务上为4位 大类2位+小类2位 **/
	private String menuTypCd;
	/** 菜品类别名称  **/
	private String menuTypNm;
	/** 上级类别标识  **/
	private Integer parentTypId;
	/** 上级类别代码  **/
	private String parentTypCd;
	/** 菜品类别级别  **/
	private Integer menuTypGrade;
	/** 排序号  **/
	private Integer menuTypSeq;
	/** 删除标记 0-未删除,1-已删除 **/
	private String delFlg;
	/** 版本号  **/
	private Integer version;
	/** 备注  **/
	private String memo;
	/** 厨房打印机1标识 **/
	private Integer cookPrint1Id;
	/** 厨房打印机2标识 **/
	private Integer cookPrint2Id;
	/** 传菜打印机标识 **/
	private Integer passPrintId;
	/** 催菜打印机标识 **/
	private Integer urgePrintId;
	/** 改菜打印机标识 **/
	private Integer alterPrintId;
	/** 预留打印机1标识 **/
	private Integer obligatePrint1Id;
	/** 预留打印机2标识 **/
	private Integer obligatePrint2Id;
	/** 预留打印机3标识 **/
	private Integer obligatePrint3Id;
	/** 预留打印机4标识 **/
	private Integer obligatePrint4Id;
	/** 预留打印机5标识 **/
	private Integer obligatePrint5Id;
	public Integer getId() {
		return this.id;
	}	
	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getMenuTypId() {
		return this.menuTypId;
	}	
	public void setMenuTypId(Integer value) {
		this.menuTypId = value;
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
	public String getMenuTypCd() {
		return this.menuTypCd;
	}	
	public void setMenuTypCd(String value) {
		this.menuTypCd = value;
	}
	public String getMenuTypNm() {
		return this.menuTypNm;
	}	
	public void setMenuTypNm(String value) {
		this.menuTypNm = value;
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
	public Integer getMenuTypGrade() {
		return this.menuTypGrade;
	}	
	public void setMenuTypGrade(Integer value) {
		this.menuTypGrade = value;
	}
	public Integer getMenuTypSeq() {
		return this.menuTypSeq;
	}	
	public void setMenuTypSeq(Integer value) {
		this.menuTypSeq = value;
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
	public Integer getCookPrint1Id() {
		return this.cookPrint1Id;
	}	
	public void setCookPrint1Id(Integer value) {
		this.cookPrint1Id = value;
	}
	public Integer getCookPrint2Id() {
		return this.cookPrint2Id;
	}	
	public void setCookPrint2Id(Integer value) {
		this.cookPrint2Id = value;
	}
	public Integer getPassPrintId() {
		return this.passPrintId;
	}	
	public void setPassPrintId(Integer value) {
		this.passPrintId = value;
	}
	public Integer getUrgePrintId() {
		return this.urgePrintId;
	}	
	public void setUrgePrintId(Integer value) {
		this.urgePrintId = value;
	}
	public Integer getAlterPrintId() {
		return this.alterPrintId;
	}	
	public void setAlterPrintId(Integer value) {
		this.alterPrintId = value;
	}
	public Integer getObligatePrint1Id() {
		return this.obligatePrint1Id;
	}	
	public void setObligatePrint1Id(Integer value) {
		this.obligatePrint1Id = value;
	}
	public Integer getObligatePrint2Id() {
		return this.obligatePrint2Id;
	}	
	public void setObligatePrint2Id(Integer value) {
		this.obligatePrint2Id = value;
	}
	public Integer getObligatePrint3Id() {
		return this.obligatePrint3Id;
	}	
	public void setObligatePrint3Id(Integer value) {
		this.obligatePrint3Id = value;
	}
	public Integer getObligatePrint4Id() {
		return this.obligatePrint4Id;
	}	
	public void setObligatePrint4Id(Integer value) {
		this.obligatePrint4Id = value;
	}
	public Integer getObligatePrint5Id() {
		return this.obligatePrint5Id;
	}	
	public void setObligatePrint5Id(Integer value) {
		this.obligatePrint5Id = value;
	}
	
	
	
}

