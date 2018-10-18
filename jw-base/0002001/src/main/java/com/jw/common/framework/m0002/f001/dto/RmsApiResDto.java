
/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
 */
package com.jw.common.framework.m0002.f001.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.jw.base.framework.core.util.FastJsonUtil;

/** 
 * ## 类说明：
 * 	酒店渠道信息映射DTO
 * @author    [tianpei]   
 * @version   [V1.0, 2018-08-01]
 * @package com.jw.common.framework.m0002.f001.dto
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018-08-01|tianpei|新增|RmsApiResDto新增
 */
public class RmsApiResDto implements java.io.Serializable {
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7173555731760649759L;
	
	private Map<String,Object> status;
	private List<RmsInfo> data;
	
	public Map<String, Object> getStatus() {
		return status;
	}
	public void setStatus(Map<String, Object> status) {
		this.status = status;
	}
	public List<RmsInfo> getData() {
		return data;
	}
	public void setData(List<RmsInfo> data) {
		this.data = data;
	}

	public static class RmsInfo{
		private String htl_cd;
		private List<RmsDetailInfo> detail;
		public RmsInfo(){};
		public String getHtl_cd() {
			return htl_cd;
		}
		public void setHtl_cd(String htl_cd) {
			this.htl_cd = htl_cd;
		}
		public List<RmsDetailInfo> getDetail() {
			return detail;
		}
		public void setDetail(List<RmsDetailInfo> detail) {
			this.detail = detail;
		}
		public static class RmsDetailInfo{
			private String htl_cd;
			private Integer para_typ;
			private String para_cd;
			private String live_dt;
			private String observe_dt;
			private Integer occ;
			private BigDecimal rev;
			
			public RmsDetailInfo(){}

			public String getHtl_cd() {
				return htl_cd;
			}
			public void setHtl_cd(String htl_cd) {
				this.htl_cd = htl_cd;
			}
			public Integer getPara_typ() {
				return para_typ;
			}
			public void setPara_typ(Integer para_typ) {
				this.para_typ = para_typ;
			}
			public String getPara_cd() {
				return para_cd;
			}
			public void setPara_cd(String para_cd) {
				this.para_cd = para_cd;
			}
			public String getLive_dt() {
				return live_dt;
			}
			public void setLive_dt(String live_dt) {
				this.live_dt = live_dt;
			}
			public String getObserve_dt() {
				return observe_dt;
			}
			public void setObserve_dt(String observe_dt) {
				this.observe_dt = observe_dt;
			}
			public Integer getOcc() {
				return occ;
			}
			public void setOcc(Integer occ) {
				this.occ = occ;
			}
			public BigDecimal getRev() {
				return rev;
			}
			public void setRev(BigDecimal rev) {
				this.rev = rev;
			};
			
		}
	}
}
