/**
 *@ProjectName: 0002001
 *@FileName: LogDiffer.java
 *@Date: 2016年12月7日-上午8:56:29
 *@Copyright: 2016 www.jointwisdom.com Inc. All rights reserved.
 
 * Copyright (c) 2016 jointwisdom Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
*/
package com.jw.common.framework.m0002.f001.dto.api;

import java.util.List;

import com.jw.common.framework.m0002.f001.dto.LogDifferInfoDto;

/**
 * ## 类说明：
 * 	对比字段接口
 * @author    [liubowen]   
 * @version   [版本号, 2016/11/21]
 * @package com.jw.platform.framework.core.api
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/21|liubowen|新增|LogDiffer.java新增
*/
public interface LogDiffer {
	/**
	 * ## 方法说明：
	 * 	对比字段
	 * @return List<LogDifferInfo>
	 */
	public List<LogDifferInfoDto> getLogDiffer();
}
