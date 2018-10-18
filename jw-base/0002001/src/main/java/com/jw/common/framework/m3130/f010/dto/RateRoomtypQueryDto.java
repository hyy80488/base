/**   
* @Title: RateRoomtypQueryDto.java 
* @Package com.jw.hms.cmm.m3130.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月2日 下午1:21:09 
* @version V1.0   
*/
package com.jw.common.framework.m3130.f010.dto;

import java.util.Date;
import java.util.List;

import com.jw.base.framework.core.annotation.DrptDto;
import com.jw.base.framework.core.annotation.DrptField;
import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 房价房型查询数据传输对象
 * @author    [yingw]   
 * @version   [V1.0, 2018年8月2日]
 * @package com.jw.hms.cmm.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月2日|yingw|新增|RateRoomtypQueryDto.java新增
*/
@DrptDto(dtonm = "房价房型查询数据传输对象",dtodrpt="房价房型查询数据传输对象")
public class RateRoomtypQueryDto extends RequestBaseDto implements java.io.Serializable {

    private static final long serialVersionUID = 8258822136023148564L;
    
    @DrptField(fieldnm="roomtypIds",fielddrpt="房型id集合")
    private List<Integer> roomtypIds;
    
    @DrptField(fieldnm="rateIds",fielddrpt="房价id集合")
    private List<Integer> rateIds;
    
    @DrptField(fieldnm="unitUid",fielddrpt="unitUid")
    private String unitUid;
    
    @DrptField(fieldnm="id",fielddrpt="开始时间")
    private Date startDate;
    
    @DrptField(fieldnm="endDate",fielddrpt="结束时间")
    private Date endDate;

    public List<Integer> getRoomtypIds() {
        return roomtypIds;
    }

    public void setRoomtypIds(List<Integer> roomtypIds) {
        this.roomtypIds = roomtypIds;
    }

    public List<Integer> getRateIds() {
        return rateIds;
    }

    public void setRateIds(List<Integer> rateIds) {
        this.rateIds = rateIds;
    }

    public String getUnitUid() {
        return unitUid;
    }

    public void setUnitUid(String unitUid) {
        this.unitUid = unitUid;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
}
