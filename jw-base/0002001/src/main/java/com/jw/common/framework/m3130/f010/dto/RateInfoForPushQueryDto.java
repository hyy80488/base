/**   
* @Title: RateInfoForPushQueryDto.java 
* @Package com.jw.common.framework.m3130.f010.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月3日 下午1:35:25 
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
 * 查询推送房价信息
 * @author    [yingw]   
 * @version   [V1.0, 2018年8月3日]
 * @package com.jw.common.framework.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月3日|yingw|新增|RateInfoForPushQueryDto.java新增
*/

/**
 * ## 类说明：
 * 	描述
 * @author    [yingw]   
 * @version   [V1.0, 2018年9月20日]
 * @package com.jw.common.framework.m3130.f010.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年9月20日|yingw|新增|RateInfoForPushQueryDto.java新增
*/
@DrptDto(dtonm = "查询推送房价信息数据传输对象",dtodrpt="查询推送房价信息数据传输对象")
public class RateInfoForPushQueryDto extends RequestBaseDto implements java.io.Serializable {

    private static final long serialVersionUID = 2008109672359598335L;
    
    @DrptField(fieldnm="rateIds",fielddrpt="房价id集合")
    private List<Integer> rateIds;
    
    @DrptField(fieldnm="roomtypIds",fielddrpt="房型Id集合")
    private List<Integer> roomtypIds;
    
    @DrptField(fieldnm="unitUid",fielddrpt="unitUid")
    private String unitUid;
    
    @DrptField(fieldnm="channelNos",fielddrpt="渠道noList")
    private List<String> channelNos;
    
    @DrptField(fieldnm="id",fielddrpt="开始时间")
    private Date startDate;
    
    @DrptField(fieldnm="endDate",fielddrpt="结束时间")
    private Date endDate;

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

    public List<Integer> getRoomtypIds() {
        return roomtypIds;
    }

    public void setRoomtypIds(List<Integer> roomtypIds) {
        this.roomtypIds = roomtypIds;
    }

    public List<String> getChannelNos() {
        return channelNos;
    }

    public void setChannelNos(List<String> channelNos) {
        this.channelNos = channelNos;
    }
    
}
