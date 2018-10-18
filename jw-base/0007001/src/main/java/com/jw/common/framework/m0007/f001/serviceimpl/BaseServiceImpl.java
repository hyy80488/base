/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.common.framework.m0007.f001.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import com.jw.common.framework.m0004.f001.provider.BaseProvider;
import com.jw.common.framework.m0005.f001.service.BaseService;

/**
 * ## 类说明：
 * 	基础Service实现类
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.serviceimpl
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|BaseServiceImpl.java新增
 */
@Transactional(rollbackFor=Exception.class)
public abstract class BaseServiceImpl implements BaseService {
	protected abstract BaseProvider getEntityService();


}