/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core;

import java.math.BigDecimal;

/**
 * ## 类说明：
 * 	货币枚举类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|RoundModeEnum.java新增
 */
public enum RoundModeEnum {
	/** 取整 */
	intValue(BigDecimal.ROUND_DOWN),

	/** 四舍五入 */
	roundHalfUp(BigDecimal.ROUND_HALF_UP),
	
	/** 向上取整 */
	roundUp(BigDecimal.ROUND_UP),

	/** 向下取整 */
	roundDown(BigDecimal.ROUND_DOWN),
	
	/** 四舍六入五成双 
	 * 1. 被修约的数字小于5时，该数字舍去；
	 * 2. 被修约的数字大于5时，则进位；
	 * 3. 被修约的数字等于5时，要看5前面的数字，若是奇数则进位，若是偶数则将5舍掉，即修约后末尾数字都成为偶数；若5的后面还有不为“0”的任何数，则此时无论5的前面是奇数还是偶数，均应进位。
	 * */
	roundHalfEven(BigDecimal.ROUND_HALF_EVEN);
	
	private Integer _vlaue;
	private RoundModeEnum(Integer value){
		this._vlaue = value;
	}
	public Integer getValue(){
		return this._vlaue;
	}
	
}
