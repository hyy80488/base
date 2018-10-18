/**   
* @Title: PushRateDateDto.java 
* @Package com.jw.common.framework.m5300.f010.dto.pushRateInfo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年8月6日 下午4:11:40 
* @version V1.0   
*/
package com.jw.common.framework.m5300.f010.dto.pushRateInfo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.jw.common.framework.m0002.f001.dto.RequestBaseDto;

/**
 * ## 类说明：
 * 房价推送数据
 * @author    [yingw]   
 * @version   [V1.0, 2018年8月6日]
 * @package com.jw.common.framework.m5300.f010.dto.pushRateInfo
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年8月6日|yingw|新增|PushRateDateDto.java新增
*/
public class PushRateDateDto extends RequestBaseDto implements Serializable {

    private static final long serialVersionUID = -7471567246238648527L;
    
    // 推送开始时间
    private String startDate;
    
    // 推送结束时间
    private String endDate;
    
    private String unitUid;
    
    private String url;
    
    // 需要推送的房价数据
    private List<Map<String, Object>> dataList;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<Map<String, Object>> getDataList() {
        return dataList;
    }

    public void setDataList(List<Map<String, Object>> dataList) {
        this.dataList = dataList;
    }

    public String getUnitUid() {
        return unitUid;
    }

    public void setUnitUid(String unitUid) {
        this.unitUid = unitUid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
