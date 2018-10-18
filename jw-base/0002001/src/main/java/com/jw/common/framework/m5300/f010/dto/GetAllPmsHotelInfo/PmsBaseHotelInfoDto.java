/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m5300.f010.dto.GetAllPmsHotelInfo;

import java.io.Serializable;
import java.util.List;

public class PmsBaseHotelInfoDto implements Serializable {

	/** @Fields serialVersionUID **/
	private static final long serialVersionUID = -5259463646814733438L;
	/**厂商酒店代码  Y**/
	private String hotelCode;
	/**厂商酒店酒店名称 Y**/
	private String hotelName;
	/**厂商路由组代码 Y   由入住通提供固定值，1.0 模式和 2.0 模式 该值不同，需厂商区分**/
	private String hotelGroupCode;
	/**Y  酒店电话号码**/
	private String telephone;
	/**Y  酒店地址**/
	private String address;
	/**Y  酒店邮箱**/
	private String email;
	/**Y  省份	例：北京**/
	private String provinceCode;
	/**Y  城市	例：三亚**/
	private String hotelCityName;
	/**Y PMS 产品列表**/
	private List<PmsProductInfoDto> productInfoDtos;

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelGroupCode() {
		return hotelGroupCode;
	}

	public void setHotelGroupCode(String hotelGroupCode) {
		this.hotelGroupCode = hotelGroupCode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getHotelCityName() {
		return hotelCityName;
	}

	public void setHotelCityName(String hotelCityName) {
		this.hotelCityName = hotelCityName;
	}

	public List<PmsProductInfoDto> getProductInfoDtos() {
		return productInfoDtos;
	}

	public void setProductInfoDtos(List<PmsProductInfoDto> productInfoDtos) {
		this.productInfoDtos = productInfoDtos;
	}

}
