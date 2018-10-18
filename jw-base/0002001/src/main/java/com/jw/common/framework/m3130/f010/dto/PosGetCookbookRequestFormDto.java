package com.jw.common.framework.m3130.f010.dto;


import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmAttribute;

/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	PosGetCookbookRequestFormDto获取菜谱传输对象
 * @author    [gaofei]   
 * @version   [V1.0, 2017-02-21]
 * @package com.jw.hms.pos.m3310.f010.dto.posCookbook
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017-02-21|gaofei|新增|PosGetCookbookRequestFormDto新增
 */
@DrptDto(dtonm = "PosGetCookbookRequestFormDto",dtodrpt="PosGetCookbookRequestFormDto获取菜谱传输对象")
public class PosGetCookbookRequestFormDto extends RequestBaseDto implements java.io.Serializable{
	

	
	

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -6610926588713078678L;
	
	@DrptField(fieldnm="salesId",fielddrpt="销售点标识")
	private java.lang.Integer salesId;
	
	@DrptField(fieldnm="posId",fielddrpt="销售点标识IPad端使用")
	private java.lang.Integer posId ;
	
	@DrptField(fieldnm="tableId",fielddrpt="桌台标识IPad端使用")
	private java.lang.Integer tableId ;
	
	@DrptField(fieldnm="periodId",fielddrpt="当前餐点")
	private java.lang.Integer periodId;
	
	@DrptField(fieldnm="cookbook_id",fielddrpt="菜谱标识")
	private java.lang.Integer cookbook_id;
	
	@DrptField(fieldnm="last_update_tm",fielddrpt="上次更新时间")
	private java.util.Date last_update_tm;
	
	/** 集团代码 **/
	@DrptField(fieldnm="chainCd", fielddrpt="集团代码")
	private String chainCd;
	/** 酒店代码 **/
	@DrptField(fieldnm="unitCd", fielddrpt="酒店代码")
	private String unitCd;
	
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
     * @return the dbType
     */
    public String getDbType() {
        return dbType;
    }
    /**
     * @param dbType the dbType to set
     */
    public void setDbType(String dbType) {
        this.dbType = dbType;
    }
    public java.lang.Integer getSalesId() {
		return salesId;
	}
	public void setSalesId(java.lang.Integer salesId) {
		this.salesId = salesId;
	}
	public java.lang.Integer getPeriodId() {
		return periodId;
	}
	public void setPeriodId(java.lang.Integer periodId) {
		this.periodId = periodId;
	}
	public java.lang.Integer getCookbook_id() {
		return cookbook_id;
	}
	public void setCookbook_id(java.lang.Integer cookbook_id) {
		this.cookbook_id = cookbook_id;
	}
	public java.util.Date getLast_update_tm() {
		return last_update_tm;
	}
	public void setLast_update_tm(java.util.Date last_update_tm) {
		this.last_update_tm = last_update_tm;
	}
	/**
	 * @return the chainCd
	 */
	public String getChainCd() {
		return chainCd;
	}
	/**
	 * @param chainCd the chainCd to set
	 */
	public void setChainCd(String chainCd) {
		this.chainCd = chainCd;
	}
	/**
	 * @return the unitCd
	 */
	public String getUnitCd() {
		return unitCd;
	}
	/**
	 * @param unitCd the unitCd to set
	 */
	public void setUnitCd(String unitCd) {
		this.unitCd = unitCd;
	}
	/**
	 * @return the posId
	 */
	public java.lang.Integer getPosId() {
		return posId;
	}
	/**
	 * @param posId the posId to set
	 */
	public void setPosId(java.lang.Integer posId) {
		this.posId = posId;
	}
	/**
	 * @return the tableId
	 */
	public java.lang.Integer getTableId() {
		return tableId;
	}
	/**
	 * @param tableId the tableId to set
	 */
	public void setTableId(java.lang.Integer tableId) {
		this.tableId = tableId;
	}


	
	
}

