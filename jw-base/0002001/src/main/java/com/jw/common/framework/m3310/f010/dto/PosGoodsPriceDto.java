/**   
* @Title: PosGoodsPriceDto.java 
* @Package com.jw.common.framework.m3310.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年10月15日 下午3:09:52 
* @version V1.0   
*/
package com.jw.common.framework.m3310.f010.dto;

import java.math.BigDecimal;

import com.jw.base.framework.core.annotation.DrptField;

/**
 * ## 类说明：
 * 	描述
 * @author    [yingw]   
 * @version   [V1.0, 2018年10月15日]
 * @package com.jw.common.framework.m3310.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年10月15日|yingw|新增|PosGoodsPriceDto.java新增
*/
public class PosGoodsPriceDto implements java.io.Serializable {
    
    private static final long serialVersionUID = -1149123828504757355L;

    @DrptField(fieldnm="priceId",fielddrpt="菜品价格id")
    private Integer priceId;
    
    @DrptField(fieldnm="specId",fielddrpt="菜品规格id")
    private Integer specId;
    
    @DrptField(fieldnm="menuId",fielddrpt="菜品id")
    private Integer menuId;
    
    @DrptField(fieldnm="specName",fielddrpt="菜品规格name")
    private String specName;
    
    @DrptField(fieldnm="price",fielddrpt="菜品价格")
    private BigDecimal price;

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
    
}
