/**   
* @Title: ConstantTask.java 
* @Package com.jw.base.framework.core 
* @Description: TODO(用一句话描述该文件做什么) 
* @author [tianpei] 
* @date 2018年10月8日 下午6:00:40 
* @version V1.0   
*/
package com.jw.base.framework.core;


/**
 * ## 类说明：
 * 	接口任务相关
 * @author    [tianpei]   
 * @version   [V1.0, 2018年10月8日]
 * @package com.jw.base.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年10月8日|tianpei|新增|ConstantTask.java新增
*/
public class ConstantTask {

	/**电话接口任务
	 * TELELVL：设置电话等级
	 * VOCMAIL：设置语音信箱
	 * TDND：设置免扰
	 * SETMCALL：设置叫早
	 * CXLMCALL：取消叫早
	 */
	public static enum ENUM_PBX_TYPE {
		TELELVL("TELELVL"),
		VOCMAIL("VOCMAIL"),
		TDND("TDND"),
		SETMCALL("SETMCALL"),
		CXLMCALL("CXLMCALL");
		
		private String _value;

		private ENUM_PBX_TYPE(String _value) {
			this._value = _value;
		}

		public String getValue() {
			return _value;
		}
		
		public Boolean isEquals(String value) {
			return this._value.equals(value);
		}
	}
}
