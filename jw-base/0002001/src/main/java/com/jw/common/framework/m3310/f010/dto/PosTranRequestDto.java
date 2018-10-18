package com.jw.common.framework.m3310.f010.dto;

/**   
* @Title: PosTranRequestDto.java 
* @Package com.jw.hms.pos.m3310.f010.dto.posTran.forIPad 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年9月4日 下午1:55:50 
* @version V1.0   
*/

import java.util.List;

import com.jw.base.framework.core.ConstantParm;
import com.jw.base.framework.core.ConstantParmAttribute;
import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 	描述
 * @author    [yingw]   
 * @version   [V1.0, 2018年9月4日]
 * @package com.jw.hms.pos.m3310.f010.dto.posTran.forIPad
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月4日|yingw|新增|PosTranRequestDto.java新增
*/
@DrptDto(dtonm = "PosTranRequestDto",dtodrpt="PosTranRequestDto菜品传输对象")
public class PosTranRequestDto extends RequestBaseDto implements java.io.Serializable {

    private static final long serialVersionUID = 1284143741365650591L;
    
    @DrptField(fieldnm="posId",fielddrpt="销售点id")
    private Integer posId;
    
    @DrptField(fieldnm="orderId",fielddrpt="账单id")
    private Integer orderId;
    
    @DrptField(fieldnm="tableId",fielddrpt="桌台id")
    private Integer tableId;
    
    @DrptField(fieldnm="tableCd",fielddrpt="桌台代码")
    private String tableCd;
    
    @DrptField(fieldnm="status",fielddrpt="0-开台暂存,1-开台送单")
    private Integer status;
    
    @DrptField(fieldnm="remarks",fielddrpt="整单备注")
    private String remarks;
    
    @DrptField(fieldnm="goods",fielddrpt="菜品list")
    private List<PosGoodsDto> goods;
    
    @DrptField(fieldnm="chainCd",fielddrpt="集团Cd")
    private String chainCd;
    
    @DrptField(fieldnm="unitCd",fielddrpt="酒店Cd")
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

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getTableCd() {
        return tableCd;
    }

    public void setTableCd(String tableCd) {
        this.tableCd = tableCd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<PosGoodsDto> getGoods() {
        return goods;
    }

    public void setGoods(List<PosGoodsDto> goods) {
        this.goods = goods;
    }

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
    
}
