
package com.jw.common.framework.m5300.f010.dto.ProductInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ArrayOfHotelInfo implements Serializable{

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5564558674478976281L;
	protected List<HotelInfo> hotelInfo;

    public List<HotelInfo> getHotelInfo() {
        if (hotelInfo == null) {
            hotelInfo = new ArrayList<HotelInfo>();
        }
        return this.hotelInfo;
    }

}
