/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.dialect;

import org.hibernate.dialect.PostgreSQL81Dialect;
import org.hibernate.id.IdentityGenerator;
import org.hibernate.id.SequenceGenerator;
import org.hibernate.id.TableHiLoGenerator;

/**
 * ## 类说明：
 * 	自定义PostgreSQL的hibernate本地方言
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.dao
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|JwPostgreSQLDialect.java新增
*/
public class JwPostgreSQLDialect extends PostgreSQL81Dialect {

	/**
	 * ## 方法说明：
	 * 	说明，通过设置存在Identity，直接在数据库中使用默认值保存ID
	 * @return
	 */
	@Override
	public Class getNativeIdentifierGeneratorClass() {
		if (supportsIdentityColumns()) {
			return IdentityGenerator.class;
		} else if (supportsSequences()) {
			return SequenceGenerator.class;
		} else {
			return TableHiLoGenerator.class;
		}
	}
}
