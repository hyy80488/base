/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.exception;

/**
 * ## 类说明：
 * 	异常静态编码
 * @author    [liubowen]   
 * @version   [V1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.exception
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|BsProcessErrorCode.java新增
 */
public class BsProcessErrorCode {
	/** 返回状态 成功 **/
	public static final String RESULT_CODE_0 = "0";
	/** 返回状态 失败 **/
	public static final String RESULT_CODE_1 = "1";
	/** 返回状态 校验失败 **/
	public static final String RESULT_CODE_2 = "2";
	/** 返回状态 重复提交 **/
	public static final String RESULT_CODE_3 = "3";

	/** 等级 普通 **/
	public static final String ERROR_LEVEL_0 = "0";
	/** 等级 逻辑错误需要确认后继续执行 **/
	public static final String ERROR_LEVEL_3 = "3";
	/** 等级 中间等级 **/
	public static final String ERROR_LEVEL_5 = "5";
	/** 等级 本地接口错误 **/
	public static final String ERROR_LEVEL_7 = "7";
	/** 等级 严重 **/
	public static final String ERROR_LEVEL_9 = "9";

	/** 成功 **/
	public static final String SUCCESS_CODE_000000 = "000000";
	/** 未知异常 **/
	public static final String ERROR_CODE_000001 = "000001";
	/** 空指针错误 **/
	public static final String ERROR_CODE_000002 = "000002";
	/** 字符串转换为数字异常 **/
	public static final String ERROR_CODE_000003 = "000003";
	/** SQL错误 **/
	public static final String ERROR_CODE_000004 = "000004";
	/** Hibernate约束校验失效 **/
	public static final String ERROR_CODE_000005 = "000005";
	/** 算术异常 **/
	public static final String ERROR_CODE_000006 = "000006";
	/** 类型强制转换异常 **/
	public static final String ERROR_CODE_000007 = "000007";
	/** 数组负下标异常 **/
	public static final String ERROR_CODE_000008 = "000008";
	/** 数组下标越界异常 **/
	public static final String ERROR_CODE_000009 = "000009";
	/** 违背安全原则异常 **/
	public static final String ERROR_CODE_000010 = "000010";
	/** 文件已结束异常 **/
	public static final String ERROR_CODE_000011 = "000011";
	/** 文件未找到异常 **/
	public static final String ERROR_CODE_000012 = "000012";
	/** 操作数据库SQL异常 **/
	public static final String ERROR_CODE_000013 = "000013";
	/** 输入输出异常 **/
	public static final String ERROR_CODE_000014 = "000014";
	/** 方法未找到异常 **/
	public static final String ERROR_CODE_000015 = "000015";
	/** 抽象方法错误 **/
	public static final String ERROR_CODE_000016 = "000016";
	/** 断言错 **/
	public static final String ERROR_CODE_000017 = "000017";
	/** 类循环依赖错误 **/
	public static final String ERROR_CODE_000018 = "000018";
	/** 类格式错误 **/
	public static final String ERROR_CODE_000019 = "000019";
	/** 初始化程序错误 **/
	public static final String ERROR_CODE_000020 = "000020";
	/** 违法访问错误 **/
	public static final String ERROR_CODE_000021 = "000021";
	/** 不兼容的类变化错误 **/
	public static final String ERROR_CODE_000022 = "000022";
	/** 实例化错误 **/
	public static final String ERROR_CODE_000023 = "000023";
	/** 内部错误 **/
	public static final String ERROR_CODE_000024 = "000024";
	/** 链接错误 **/
	public static final String ERROR_CODE_000025 = "000025";
	/** 未找到类定义错误 **/
	public static final String ERROR_CODE_000026 = "000026";
	/** 域不存在错误 **/
	public static final String ERROR_CODE_000027 = "000027";
	/** 方法不存在错误 **/
	public static final String ERROR_CODE_000028 = "000028";
	/** 内存不足错误 **/
	public static final String ERROR_CODE_000029 = "000029";
	/** 堆栈溢出错误 **/
	public static final String ERROR_CODE_000030 = "000030";
	/** 线程结束 **/
	public static final String ERROR_CODE_000031 = "000031";
	/** 未知错误 **/
	public static final String ERROR_CODE_000032 = "000032";
	/** 未满足的链接错误 **/
	public static final String ERROR_CODE_000033 = "000033";
	/** 不支持的类版本错误 **/
	public static final String ERROR_CODE_000034 = "000034";
	/** 验证错误 **/
	public static final String ERROR_CODE_000035 = "000035";
	/** 虚拟机错误 **/
	public static final String ERROR_CODE_000036 = "000036";
	/** 算术条件异常 **/
	public static final String ERROR_CODE_000037 = "000037";
	/** 数组存储异常 **/
	public static final String ERROR_CODE_000038 = "000038";
	/** 找不到类异常 **/
	public static final String ERROR_CODE_000039 = "000039";
	/** 不支持克隆异常 **/
	public static final String ERROR_CODE_000040 = "000040";
	/** 枚举常量不存在异常 **/
	public static final String ERROR_CODE_000041 = "000041";
	/** 违法的访问异常 **/
	public static final String ERROR_CODE_000042 = "000042";
	/** 违法的监控状态异常 **/
	public static final String ERROR_CODE_000043 = "000043";
	/** 违法的状态异常 **/
	public static final String ERROR_CODE_000044 = "000044";
	/** 违法的线程状态异常 **/
	public static final String ERROR_CODE_000045 = "000045";
	/** 索引越界异常 **/
	public static final String ERROR_CODE_000046 = "000046";
	/** 实例化异常 **/
	public static final String ERROR_CODE_000047 = "000047";
	/** 被中止异常 **/
	public static final String ERROR_CODE_000048 = "000048";
	/** 数组大小为负值异常 **/
	public static final String ERROR_CODE_000049 = "000049";
	/** 属性不存在异常 **/
	public static final String ERROR_CODE_000050 = "000050";
	/** 运行时异常 **/
	public static final String ERROR_CODE_000051 = "000051";
	/** 安全异常 **/
	public static final String ERROR_CODE_000052 = "000052";
	/** 字符串索引越界异常 **/
	public static final String ERROR_CODE_000053 = "000053";
	/** 类型不存在异常 **/
	public static final String ERROR_CODE_000054 = "000054";
	/** RPC远程调用异常 **/
	public static final String ERROR_CODE_000055 = "000055";
	/** Hibernate悲观锁异常 **/
	public static final String ERROR_CODE_000056 = "000056";
	/** 属性值非空字段插入了空值 **/
	public static final String ERROR_CODE_000057 = "000057";
	/** 属性值异常 **/
	public static final String ERROR_CODE_000058 = "000058";
	/** 数据库表结构变更 **/
	public static final String ERROR_CODE_000059 = "000059";
	/** 当前用户pg库未授权 **/
	public static final String ERROR_CODE_000060 = "000060";
	/** 文件过大 **/
	public static final String ERROR_CODE_000061 = "000061";
	/** 部分成功 **/
	public static final String ERROR_CODE_000062 = "000062";
	public static final String ERROR_CODE_000063 = "000063";
	public static final String ERROR_CODE_000064 = "000064";
	public static final String ERROR_CODE_000065 = "000065";
	public static final String ERROR_CODE_000066 = "000066";
	public static final String ERROR_CODE_000067 = "000067";
	public static final String ERROR_CODE_000068 = "000068";
	public static final String ERROR_CODE_000069 = "000069";
	public static final String ERROR_CODE_000070 = "000070";
	public static final String ERROR_CODE_000071 = "000071";
	public static final String ERROR_CODE_000072 = "000072";
	public static final String ERROR_CODE_000073 = "000073";
	public static final String ERROR_CODE_000074 = "000074";
	public static final String ERROR_CODE_000075 = "000075";
	public static final String ERROR_CODE_000076 = "000076";
	public static final String ERROR_CODE_000077 = "000077";
	public static final String ERROR_CODE_000078 = "000078";
	public static final String ERROR_CODE_000079 = "000079";
	public static final String ERROR_CODE_000080 = "000080";
	/** 无效操作 **/
	public static final String ERROR_CODE_400026 = "400026";
	/*
	 * 100000 基础异常信息
	 */
	/** 当前已不是最新版本 **/
	public static final String ERROR_CODE_100000 = "100000";
	/** 当前记录已被锁定 **/
	public static final String ERROR_CODE_100001 = "100001";
	/** 方法参数为空，没有被锁定的对象 **/
	public static final String ERROR_CODE_100002 = "100002";
	/** 没有被注解的参数 **/
	public static final String ERROR_CODE_100003 = "100003";
	/** 取锁失败 **/
	public static final String ERROR_CODE_100004 = "100004";
	/** 修改时版本号不能为空 **/
	public static final String ERROR_CODE_100005 = "100005";
	/** 发番对应缓存为空，可能为新库新番号未初始化 **/
	public static final String ERROR_CODE_100006 = "100006";
	/** ES文章转换失败 **/
	public static final String ERROR_CODE_100007 = "100007";
	public static final String ERROR_CODE_100008 = "100008";
	public static final String ERROR_CODE_100009 = "100009";
	public static final String ERROR_CODE_100010 = "100010";
	public static final String ERROR_CODE_100011 = "100011";
	public static final String ERROR_CODE_100012 = "100012";
	public static final String ERROR_CODE_100013 = "100013";
	public static final String ERROR_CODE_100014 = "100014";
	public static final String ERROR_CODE_100015 = "100015";
	public static final String ERROR_CODE_100016 = "100016";
	public static final String ERROR_CODE_100017 = "100017";
	public static final String ERROR_CODE_100018 = "100018";
	public static final String ERROR_CODE_100019 = "100019";
	public static final String ERROR_CODE_100020 = "100020";

	/*
	 * 200000 校验异常信息
	 */
	/** 登录校验失败 (更新登陆时间失败)**/
	public static final String ERROR_CODE_200044 = "200044";
	/** 登录校验失败 (没有此用户)**/
	public static final String ERROR_CODE_200000 = "200000";
	/** 请勿重复提交 **/
	public static final String ERROR_CODE_200001 = "200001";
	/** 非法提交 **/
	public static final String ERROR_CODE_200002 = "200002";
	/** 酒店代码校验 **/
	public static final String ERROR_CODE_200003 = "200003";
	/** 没有操作权限 **/
	public static final String ERROR_CODE_200004 = "200004";
	/** 无效的URL **/
	public static final String ERROR_CODE_200005 = "200005";
	/** 锁表失败 **/
	public static final String ERROR_CODE_200006 = "200006";
	/** 无效处理 **/
	public static final String ERROR_CODE_200007 = "200007";
	/** 账号为空或者密码为空 **/
	public static final String ERROR_CODE_200008 = "200008";
	/** 账号密码不匹配 **/
	public static final String ERROR_CODE_200099 = "200099";
	/** 无效的用户 **/
	public static final String ERROR_CODE_200009 = "200009";
	/** 密码错误 **/
	public static final String ERROR_CODE_200010 = "200010";
	/** 集团或者酒店不存在 **/
	public static final String ERROR_CODE_200111 = "200111";
	/** 根据登录传入的集团代码找不到对应的集团信息 **/
	public static final String ERROR_CODE_200011 = "200011";
	/** 根据登录传入的单位代码找不到对应的单位信息 **/
	public static final String ERROR_CODE_200012 = "200012";
	/** 数据库中没有配置权限信息 **/
	public static final String ERROR_CODE_200013 = "200013";
	/** 数据库中没有配置菜单信息 **/
	public static final String ERROR_CODE_200014 = "200014";
	/** 系统类型不可为空 **/
	public static final String ERROR_CODE_200015 = "200015";
	/** 只能存在一条集团数据 **/
	public static final String ERROR_CODE_200016 = "200016";
	/** 无效Json **/
	public static final String ERROR_CODE_200017 = "200017";
	/** 超过流量限制 **/
	public static final String ERROR_CODE_200018 = "200018";
	/** 酒店日期与系统酒店日期不一致 **/
	public static final String ERROR_CODE_200019 = "200019";
	/** 夜审执行中，不可编辑操作 **/
	public static final String ERROR_CODE_200020 = "200020";
	/** 头信息中sessionkey为null，或头信息中userUid为null **/
	public static final String ERROR_CODE_200021 = "200021";
	/** sessionkey缓存中获取为null，或者sessionInfoMap为null **/
	public static final String ERROR_CODE_200022 = "200022";
	/** userInfo缓存中获取为null **/
	public static final String ERROR_CODE_200122 = "200122";
	/** 请求头中的sesseionkey和redis缓存中的sessionkey不一致 **/
	public static final String ERROR_CODE_200023 = "200023";
	/** 头信息中token为null **/
	public static final String ERROR_CODE_200024 = "200024";
	/** 获取不到Redis对象 **/
	public static final String ERROR_CODE_200025 = "200025";
	/** 临时缓存中SessionInfo对象的Key值为null **/
	public static final String ERROR_CODE_200026 = "200026";
	/** sessionInfo转JSON字符串错误 **/
	public static final String ERROR_CODE_200027 = "200027";
	/** chainInfoMap或unitInfoMap为null **/
	public static final String ERROR_CODE_200028 = "200028";
	/** 权限代码funCode为空 **/
	public static final String ERROR_CODE_200029 = "200029";
	/** permissionMap为空或permissionMap中不包含相应funCode **/
	public static final String ERROR_CODE_200030 = "200030";
	/** 当前登录人菜单权限为null **/
	public static final String ERROR_CODE_200031 = "200031";
	/** URL权级与当前登录人权级不匹配 **/
	public static final String ERROR_CODE_200032 = "200032";
	/** 酒店/集团没有购买相应的产品和功能 **/
//	public static final String ERROR_CODE_200041 = "200041";
	/** 酒店/集团没有购买相应的产品不可用 **/
	public static final String ERROR_CODE_200042 = "200042";
	/** 酒店/集团没有购买相应的产品权限无效 **/
	public static final String ERROR_CODE_200043 = "200043";
	/** 产品权限验证不匹配 **/
	public static final String ERROR_CODE_200033 = "200033";
	/** userInfo为null，或者userInfo的所属集团代码，所属酒店代码为空 **/
	public static final String ERROR_CODE_200034 = "200034";
	/** loginRequestDto为null **/
	public static final String ERROR_CODE_200035 = "200035";
	/** loginRequestDto.getSystemInfo为null **/
	public static final String ERROR_CODE_200036 = "200036";
	/** loginRequestDto.getChainCd为null **/
	public static final String ERROR_CODE_200037 = "200037";
	/** loginRequestDto.getUnitCd为null **/
	public static final String ERROR_CODE_200038 = "200038";
	/** loginRequestDto.getDbType为null **/
	public static final String ERROR_CODE_200039 = "200039";
	public static final String ERROR_CODE_200040 = "200040";
	/** 禁止接口操作员进行普通登陆 **/
	public static final String ERROR_CODE_200045 = "200045";
	/** 禁止普通操作员进行接口登陆 **/
	public static final String ERROR_CODE_200046 = "200046";
	/** 机器名为空 **/
	public static final String ERROR_CODE_200047 = "200047";
	/** 机器mac地址为空 **/
	public static final String ERROR_CODE_200048 = "200048";
	/** 从头上获取的酒店日期不能为null **/
	public static final String ERROR_CODE_200049 = "200049";
	/** 缓存中业务日期为null **/
	public static final String ERROR_CODE_200050 = "200050";
	/** 此API不允许前端直接调用 **/
	public static final String ERROR_CODE_200051 = "200051";
	/** 酒店没有对应的sku **/
	public static final String ERROR_CODE_200052 = "200052";
	/** 酒店没有配置第三方接口 **/
	public static final String ERROR_CODE_200053 = "200053";
	/** 酒店配置多个第三方接口 **/
	public static final String ERROR_CODE_200054 = "200054";
	/** 酒店配置第三方接口不匹配 **/
	public static final String ERROR_CODE_200055 = "200055";
	/** 酒店配置第三方接口参数配置错误**/
	public static final String ERROR_CODE_200056 = "200056";
	/** 没有可用角色**/
	public static final String ERROR_CODE_200057 = "200057";
	/** hotelCode为空或者酒店uid为空或者酒店cd为空*/
	public static final String ERROR_CODE_200058 = "200058";
	/** AccessToken值或ClientId值为空 */
	public static final String ERROR_CODE_200059 = "200059";
	/** AccessToken已失效 */
	public static final String ERROR_CODE_200060 = "200060";
	/** 缓存中不存在销售点所选部门 **/
	public static final String ERROR_CODE_200061 = "200061";
	/**  所选部门没有操作权限 **/
	public static final String ERROR_CODE_200062 = "200062";
	/** 未初始化酒店缓存 **/
	public static final String ERROR_CODE_200063 = "200063";
	/**chainCd为空或者chainCd有误**/
	public static final String ERROR_CODE_200064 = "200064";
	/**unitCd为空或者unitCd有误**/
	public static final String ERROR_CODE_200065 = "200065";
	public static final String ERROR_CODE_200066 = "200066";
	public static final String ERROR_CODE_200067 = "200067";
	public static final String ERROR_CODE_200068 = "200068";
	public static final String ERROR_CODE_200069 = "200069";
	public static final String ERROR_CODE_200070 = "200070";
	public static final String ERROR_CODE_200071 = "200071";
	public static final String ERROR_CODE_200072 = "200072";
	public static final String ERROR_CODE_200073 = "200073";
	public static final String ERROR_CODE_200074 = "200074";
	public static final String ERROR_CODE_200075 = "200075";
	public static final String ERROR_CODE_200076 = "200076";
	public static final String ERROR_CODE_200077 = "200077";
	public static final String ERROR_CODE_200078 = "200078";
	public static final String ERROR_CODE_200079 = "200079";
	public static final String ERROR_CODE_200080 = "200080";
	public static final String ERROR_CODE_299999 = "299999";

	/*
	 * 300000 业务异常信息
	 */
	/** 集团密钥解密失败 **/
	public static final String ERROR_CODE_300031 = "300031";
	/** 集团密钥为空 **/
	public static final String ERROR_CODE_300035 = "300035";
	public static final String ERROR_CODE_300000 = "300000";
	/** 对象为空 **/
	public static final String ERROR_CODE_300001 = "300001";
	/** 班次不存在**/
	public static final String ERROR_CODE_300101 = "300101";
	/** 和缓存中用户不匹配 **/
	public static final String ERROR_CODE_300102 = "300102";
	/** 用户代码为空 **/
	public static final String ERROR_CODE_300002 = "300002";
	/** 用户代码重复 **/
	public static final String ERROR_CODE_300003 = "300003";
	/** 批量更新不允许涉及敏感信息类型的字段 **/
	public static final String ERROR_CODE_300004 = "300004";
	/** 该角色不存在**/
	public static final String ERROR_CODE_300005 = "300005";
	/** 同一集团内只能创建两个酒店代码为空的角色 **/
	public static final String ERROR_CODE_300006 = "300006";
	/** 同一酒店内角色代码重复 **/
	public static final String ERROR_CODE_300007 = "300007";
	/** 同一酒店内角色名称重复 **/
	public static final String ERROR_CODE_300008 = "300008";
	/** 该角色在使用中不允许删除 **/
	public static final String ERROR_CODE_300009 = "300009";
    /** 该操作员无效或者不存在 **/
	public static final String ERROR_CODE_300010 = "300010";
	/** 同一酒店内角色序号重复 **/
	public static final String ERROR_CODE_300011 = "300011";
	/** 参数为空 **/
	public static final String ERROR_CODE_300012 = "300012";
	/**数据异常**/
	public static final String ERROR_CODE_300013 = "300013";
	/**参数异常**/
	public static final String ERROR_CODE_300014 = "300014";
	/**预订状态非有效状态，不可修改销售状态*/
	public static final String ERROR_CODE_300015 = "300015";
	/**主单来离期范围不可小于团队宾客来离期范围*/
	public static final String ERROR_CODE_300016 = "300016";
	/**报表系统条件不可为空**/
	public static final String ERROR_CODE_300017 = "300017";
	/**预订状态非有效状态，不可修改团队信息*/
	public static final String ERROR_CODE_300018 = "300018";
	/**类型不存在**/
	public static final String ERROR_CODE_300019 = "300019";
	/** 报表文件不存在**/
	public static final String ERROR_CODE_300020 = "300020";
	/** 序列号不能小于0 **/
	public static final String ERROR_CODE_300021 = "300021";
	/** 科目类型不能重复 **/
	public static final String ERROR_CODE_300022 = "300022";
	/** 配置代码不能重复 **/
	public static final String ERROR_CODE_300023 = "300023";
	/** 配置名称不能重复 **/
	public static final String ERROR_CODE_300024 = "300024";
	/** 接口操作员不能新建和修改 **/
	public static final String ERROR_CODE_300025 = "300025";
	/** 上传报表文件为空 **/
	public static final String ERROR_CODE_300026 = "300026";
	/** 上传报表源文件和编译文件不一致 **/
	public static final String ERROR_CODE_300027 = "300027";
	/** 单据报表不存在**/
	public static final String ERROR_CODE_300028 = "300028";
	/** 没有找到相关数据**/
	public static final String ERROR_CODE_300029 = "300029";
	/** 报表正在部署，请稍后查看**/
	public static final String ERROR_CODE_300030 = "300030";
	/** 参数转化异常 **/
	public static final String ERROR_CODE_300036 = "300036";
	/** 开始结束日期不能为空 **/
	public static final String ERROR_CODE_300037 = "300037";
	/** 时间范围大于限制  **/
	public static final String ERROR_CODE_300038 = "300038";
	/** 数据大于限制  **/
	public static final String ERROR_CODE_300039 = "300039";
	/** 方法调用错误  **/
	public static final String ERROR_CODE_300040 = "300040";
	/** 数据源配置不符合规定 **/
	public static final String ERROR_CODE_300032 = "300032";
	/** 假房不能添加为同来人 **/
	public static final String ERROR_CODE_300033 = "300033";
	/** 应收数据已删除 无法取消兑现 **/
	public static final String ERROR_CODE_300034 = "300034";
	/** 角色属性不能为空 **/
	public static final String ERROR_CODE_300041 = "300041";
	/** 没有购买子集团 **/
	public static final String ERROR_CODE_300042 = "300042";
	/** 该角色被管控，不允许修改 **/
	public static final String ERROR_CODE_300043 = "300043";
	/** 没有购买子集团 **/
	public static final String ERROR_CODE_300044 = "300044";
	/** 被管控，没有权限 **/
	public static final String ERROR_CODE_300045 = "300045";
	/** 管理酒店不为当前酒店 **/
	public static final String ERROR_CODE_300046 = "300046";
	/** 管理酒店已经为当前酒店 **/
	public static final String ERROR_CODE_300047 = "300047";
	/** 没有购买集团共享角色 **/
	public static final String ERROR_CODE_300048 = "300048";
	/** 该协议账户已绑定其他应收帐号 **/
	public static final String ERROR_CODE_300049 = "300049";
	/** 开始日期不能为空 **/
	public static final String ERROR_CODE_300050 = "300050";
	/** 结束日期不能为空 **/
	public static final String ERROR_CODE_300051 = "300051";
	/** 时间范围错误  **/
	public static final String ERROR_CODE_300052 = "300052";
	//***********************************************************************************************
	//**										个人异常信息										   **		
	//***********************************************************************************************
	/** 个人账户不是唯一数据**/
	public static final String ERROR_CODE_301000 = "301000";
	/** 地址不是唯一数据**/
	public static final String ERROR_CODE_301001 = "301001";
	/** 黑名单不是唯一数据**/
	public static final String ERROR_CODE_301002 = "301002";
	/** 客史证件不是唯一数据**/
	public static final String ERROR_CODE_301003 = "301003";
	/** 客史类型不是唯一数据**/
	public static final String ERROR_CODE_301004 = "301004";
	/** 客史公司不是唯一数据**/
	public static final String ERROR_CODE_301005 = "301005";
	/** 客史联系方式不是唯一数据**/
	public static final String ERROR_CODE_301006= "301006";
	/** 客史备注不是唯一数据**/
	public static final String ERROR_CODE_301007 = "301007";
	/** 个人账户不存在**/
	public static final String ERROR_CODE_301008= "301008";
	/** 个人姓名不能为空**/
	public static final String ERROR_CODE_301009= "301009";
	/** 当前用户不存在客使无效权限**/
	public static final String ERROR_CODE_301010= "301010";
	/** 当前用户不存在客使休眠权限**/
	public static final String ERROR_CODE_301011= "301011";
	/** 当前用户不存在客使保密权限**/
	public static final String ERROR_CODE_301012= "301012";
	/** 数据错误**/
	public static final String ERROR_CODE_301013= "301013";
	
	//***********************************************************************************************
	//**										法人异常信息										   **		
	//***********************************************************************************************
	/** 数据有误 **/
	public static final String ERROR_CODE_302000 = "302000";
	/** 法人不存在 **/
	public static final String ERROR_CODE_302001 = "302001";
	/** 作废原因不可为空 **/
	public static final String ERROR_CODE_302002 = "302002";
	/** 人员不存在 **/
	public static final String ERROR_CODE_302003 = "302003";
	/** 此法人与酒店关联关系已存在 **/
	public static final String ERROR_CODE_302004 = "302004";
	/** 酒店未管控当前协议客户，不可修改 **/
	public static final String ERROR_CODE_302005 = "302005";
	/** 只能无效和休眠该酒店创建的协议客户 **/
	public static final String ERROR_CODE_302006 = "302006";
	/** 只能无效和休眠该集团下酒店创建的协议客户 **/
	public static final String ERROR_CODE_302007 = "302007";

	/** 个人客史分类已存在 **/
	public static final String ERROR_CODE_302012 = "302012";
	/** 个人客史证件已存在 **/
	public static final String ERROR_CODE_302019 = "302019";
	/** 上级客户号不能为自己 **/
	public static final String ERROR_CODE_302008 = "302008";
	/** 主公司号不存在**/
	public static final String ERROR_CODE_302009 = "302009";
	/** 当前用户不存在协议客户无效权限**/
	public static final String ERROR_CODE_302010= "302010";
	/** 当前用户不存在协议客户休眠权限**/
	public static final String ERROR_CODE_302011= "302011";
	/** 未导入协议客户不可修改**/
	public static final String ERROR_CODE_302013 = "302013";
	/** 协议客户不可修改**/
	public static final String ERROR_CODE_302014 = "302014";
	/** 协议客户单位信息不存在**/
	public static final String ERROR_CODE_302015 = "302015";
	/** 协议客户管理单位不能为空**/
	public static final String ERROR_CODE_302016 = "302016";
	/** 单店无法设置当前协议客户有效标志和休眠标记**/
	public static final String ERROR_CODE_302017 = "302017";
	/** 酒店代码不存在 **/
	public static final String ERROR_CODE_302018 = "302018";
	/** 合同不存在 **/
	public static final String ERROR_CODE_302020 = "302020";
	/** 同一时间段内已存在其他合同 **/
	public static final String ERROR_CODE_302021 = "302021";
	/** 存在当前价格 **/
	public static final String ERROR_CODE_302022 = "302022";
	/** 存在当前房型 **/
	public static final String ERROR_CODE_302023 = "302023";
	/** 已经兑现的票据不可对冲 **/
	public static final String ERROR_CODE_302024 = "302024";
	//***********************************************************************************************
	//**										会员异常信息										   **		
	//***********************************************************************************************
	/** 该会员不存在 **/
	public static final String ERROR_CODE_303000 = "303000";
	/** 客史号为空 **/
	public static final String ERROR_CODE_303001 = "303001";
	/** 会员重复 **/
	public static final String ERROR_CODE_303002 = "303002";
	/** 该单位已经存在主会员信息，不可再次录入主会员 **/
	public static final String ERROR_CODE_303003 = "303003";
	/** 手机号码不可为空 **/
	public static final String ERROR_CODE_303004 = "303004";
	/** 邮箱不可为空 **/
	public static final String ERROR_CODE_303005 = "303005";
	/** 登录名不可为空 **/
	public static final String ERROR_CODE_303006 = "303006";
	/** 证件号码不可为空 **/
	public static final String ERROR_CODE_303007 = "303007";
	/** 手机号码、邮箱、登录名、证件号码至少输入一个 **/
	public static final String ERROR_CODE_303008 = "303008";
	/** 会员卡不存在 **/
	public static final String ERROR_CODE_354062 = "354062";
	/** 会员卡号不能为空 **/
	public static final String ERROR_CODE_354063 = "354063";
	/** 登录用户名不能与其他会员的重复 **/
	public static final String ERROR_CODE_354064 = "354064";
	/** 身份证号不能重复 **/
	public static final String ERROR_CODE_354065 = "354065";
	/** 登录手机号不能与其他会员的重复 **/
	public static final String ERROR_CODE_354066 = "354066";
	/** 登录邮箱不能与其他会员的重复 **/
	public static final String ERROR_CODE_354067 = "354067";
	/** 个人账户id不存在 **/
	public static final String ERROR_CODE_303009 = "303009";
	/**该会员已作废**/
	public static final String ERROR_CODE_303010 = "303010";
	/**该会员已退会/冻结/过期**/
	public static final String ERROR_CODE_303011 = "303011";
	/**该会员余额不足**/
	public static final String ERROR_CODE_303012 = "303012";
	public static final String ERROR_CODE_303013 = "303013";
	public static final String ERROR_CODE_303014 = "303014";
	public static final String ERROR_CODE_303015 = "303015";
	public static final String ERROR_CODE_303016 = "303016";
	public static final String ERROR_CODE_303017 = "303017";
	public static final String ERROR_CODE_303018 = "303018";
	public static final String ERROR_CODE_303019 = "303019";
	public static final String ERROR_CODE_303020 = "303020";
	/** 会员发行信息已存在 **/
	public static final String ERROR_CODE_303029 = "303029";
	/** 会员使用信息已存在 **/
	public static final String ERROR_CODE_303030 = "303030";
	/** 会员使用新建修改假房不能重复 **/
	public static final String ERROR_CODE_303031 = "303031";
	/** 代充哑房房号不能为空 **/
	public static final String ERROR_CODE_303032 = "303032";
	/** 代充值费用交易代码不能为空 **/
	public static final String ERROR_CODE_303033 = "303033";
	/** 是否在本店使用不能为空 **/
	public static final String ERROR_CODE_303034 = "303034";
	/** 发行单位不能为空 **/
	public static final String ERROR_CODE_303035 = "303035";
	/** 使用单位不能为空 **/
	public static final String ERROR_CODE_303036 = "303036";
	//***********************************************************************************************
	//**										参数异常信息										   **		
	//***********************************************************************************************
	/** 参数类型不允许为空 **/
	public static final String ERROR_CODE_304001 = "304001";
	/** 参数类型与父参数ID不予许为空 **/
	public static final String ERROR_CODE_304002 = "304002";
	/** 参数Id不可为空 **/
	public static final String ERROR_CODE_304003 = "304003";
	/** 代码已经存在，请重新输入 **/
	public static final String ERROR_CODE_304004 = "304004";
	/** 税种代码已经存在，请重新输入 **/
	public static final String ERROR_CODE_304005 = "304005";
	/** 科目代码/税率不可为空 **/
	public static final String ERROR_CODE_304006 = "304006";
	/** 酒店税种标识不可为空，值例如：TAX1 **/
	public static final String ERROR_CODE_304007 = "304007";
	/** 税种标识必须包含TAX字符**/
	public static final String ERROR_CODE_304008 = "304008";
	/** 系统参数不可操作 **/
	public static final String ERROR_CODE_304009 = "304009";
	/** 酒店参数对象为空 **/
	public static final String ERROR_CODE_304010 = "304010";
	/** 集团参数对象为空 **/
	public static final String ERROR_CODE_304011 = "304011";
	/** 已经使用的税率不可删除 **/
	public static final String ERROR_CODE_304012 = "304012";
	/** 媒体类型不存在 **/
	public static final String ERROR_CODE_304013 = "304013";
	/** 参数类型必填 **/
	public static final String ERROR_CODE_304014 = "304014";
	/** 参数CD必填**/
	public static final String ERROR_CODE_304015 = "304015";
	/** 序号不可小于0**/
	public static final String ERROR_CODE_304016 = "304016";
	/** 单店无法新增数据**/
	public static final String ERROR_CODE_304017 = "304017";
	/** 主表参数配置数据异常**/
	public static final String ERROR_CODE_304018 = "304018";
	/** 不可执行该操作**/
	public static final String ERROR_CODE_304019 = "304019";
	/** 集团开关表不可新增，仅可修改**/
	public static final String ERROR_CODE_304020 = "304020";
	/** 单店消费点表不可新增，仅可修改**/
	public static final String ERROR_CODE_304023 = "304023";
	/** 单店商品表不可新增，仅可修改**/
	public static final String ERROR_CODE_304024 = "304024";
	/** 此类型数据已经存在**/
	public static final String ERROR_CODE_304021 = "304021";
	/** 集团管控字段不可修改**/
	public static final String ERROR_CODE_304022 = "304022";
	/** 接管失败**/
	public static final String ERROR_CODE_304025 = "304025";
	public static final String ERROR_CODE_304026 = "304026";
	public static final String ERROR_CODE_304027 = "304027";
	
	//***********************************************************************************************
	//**										媒体文件异常信息										   **		
	//***********************************************************************************************
	/** 媒体类型为空 **/
	public static final String ERROR_CODE_314000 = "314000";
	/** 媒体文件为空 **/
	public static final String ERROR_CODE_314004 = "314004";
	
	//***********************************************************************************************
	//**										客房异常信息										   **		
	//***********************************************************************************************
	/** 01~10 集团房型 **/
	public static final String ERROR_CODE_305001 =	"305001";
	public static final String ERROR_CODE_305002 =	"305002";
	public static final String ERROR_CODE_305003 =	"305003";
	public static final String ERROR_CODE_305004 =	"305004";
	public static final String ERROR_CODE_305005 =	"305005";
	public static final String ERROR_CODE_305006 =	"305006";
	public static final String ERROR_CODE_305007 =	"305007";
	public static final String ERROR_CODE_305008 =	"305008";
	public static final String ERROR_CODE_305009 =	"305009";
	public static final String ERROR_CODE_305010 =	"305010";
	/** 11~20 酒店房型 **/
	/** 指定房型不存在**/
	public static final String ERROR_CODE_305011 =	"305011";
	public static final String ERROR_CODE_305012 =	"305012";
	public static final String ERROR_CODE_305013 =	"305013";
	public static final String ERROR_CODE_305014 =	"305014";
	public static final String ERROR_CODE_305015 =	"305015";
	public static final String ERROR_CODE_305016 =	"305016";
	public static final String ERROR_CODE_305017 =	"305017";
	public static final String ERROR_CODE_305018 =	"305018";
	public static final String ERROR_CODE_305019 =	"305019";
	public static final String ERROR_CODE_305020 =	"305020";
	/** 21~30 酒店房间 **/
	/** 房间为空 **/
	public static final String ERROR_CODE_305021 =	"305021";
	/** 已完成的维修不可删除 **/
	public static final String ERROR_CODE_305022 =	"305022";
	/** 维修日期不可交叠 **/
	public static final String ERROR_CODE_305023 =	"305023";
	/** 协议价格日期不可交叠 **/
	public static final String ERROR_CODE_305032 =	"305032";
	/** 房间已占用 **/
	public static final String ERROR_CODE_305024 =	"305024";
	public static final String ERROR_CODE_305025 =	"305025";
	public static final String ERROR_CODE_305026 =	"305026";
	public static final String ERROR_CODE_305027 =	"305027";
	public static final String ERROR_CODE_305028 =	"305028";
	public static final String ERROR_CODE_305029 =	"305029";
	public static final String ERROR_CODE_305030 =	"305030";
	/**新增维修房检查 **/
	public static final String ERROR_CODE_305031 =	"305031";
	/**开始日期不能小于酒店日期 **/
	public static final String ERROR_CODE_305040 =	"305040";
	/**假房检查 **/
	public static final String ERROR_CODE_305039 =	"305039";
	/**只能存在一个定金假房 **/
	public static final String ERROR_CODE_305041 =	"305041";
	
	//***********************************************************************************************
	//**										餐饮异常信息										   **		
	//***********************************************************************************************
	/** 操作失败，请求对象为空！ **/
	public static final String ERROR_CODE_306001 = "306001";
	/** 操作失败，没有找到当前账单！**/
	public static final String ERROR_CODE_306002 = "306002";
	/** 操作失败，账单已被锁定！**/
	public static final String ERROR_CODE_306003 = "306003";
	/** 操作失败，只有未结、预订状态的账单可以作废！**/
	public static final String ERROR_CODE_306004 = "306004";
	/** 操作失败，只有已结、作废状态的账单可以恢复！**/
	public static final String ERROR_CODE_306005 = "306005";
	/** 操作失败，菜品已沽清！**/
	public static final String ERROR_CODE_306006 = "306006";
	/** 操作失败，金额为零的菜品不能打折！**/
	public static final String ERROR_CODE_306007 = "306007";
	/** 操作失败，消费金额大于付款金额！**/
	public static final String ERROR_CODE_306008 = "306008";
	/** 操作失败，消费金额小于付款金额！**/
	public static final String ERROR_CODE_306009 = "306009";
	/** 操作失败，套餐子项不支持赠送！**/
	public static final String ERROR_CODE_306010 = "306010";
	/** 操作失败，非赠送项目不能取消赠送！**/
	public static final String ERROR_CODE_306011 = "306011";
	/** 操作失败，只有未结账单支持赠菜操作！**/
	public static final String ERROR_CODE_306012 = "306012";
	/** 操作失败，设置临时套餐菜品为空！**/
	public static final String ERROR_CODE_306013 = "306013";
	/** 操作失败，消费金额小于等于付款金额！**/
	public static final String ERROR_CODE_306014 = "306014";
	/** 操作失败，只有未结、预订状态的账单可以修改！**/
	public static final String ERROR_CODE_306015 = "306015";
	/** 操作失败，付款项目不可修改！**/
	public static final String ERROR_CODE_306016 = "306016";
	/** 操作失败，账单号不可重复！**/
	public static final String ERROR_CODE_306017 = "306017";
	/** 操作失败，交易号生成错误！**/
	public static final String ERROR_CODE_306018 = "306018";
	/** 操作失败，餐点未定义！**/
	public static final String ERROR_CODE_306019 = "306019";
	/** 操作失败，未查到目标桌台信息！**/
	public static final String ERROR_CODE_306020 = "306020";
	/** 操作失败，未查到原桌台信息！**/
	public static final String ERROR_CODE_306021 = "306021";
	/** 操作失败，未找到账单明细！**/
	public static final String ERROR_CODE_306022 = "306022";
	/** 操作失败，未找到付款方式！**/
	public static final String ERROR_CODE_306023 = "306023";
	/** 操作失败，未找到销售点！**/
	public static final String ERROR_CODE_306024 = "306024";
	/** 操作失败，付款金额应大于零！**/
	public static final String ERROR_CODE_306025 = "306025";
	/** 操作失败，找零金额应大于零！**/
	public static final String ERROR_CODE_306026 = "306026";
	/** 操作失败，未找到付款项目！**/
	public static final String ERROR_CODE_306027 = "306027";
	/** 操作失败，只有有效状态的付款项目可以进行冲减！**/
	public static final String ERROR_CODE_306028 = "306028";
	/** 操作失败，查询远期桌态图时日期不能小于酒店日期！**/
	public static final String ERROR_CODE_306029 = "306029";
	/** 操作失败，查询当日远期桌态图时餐点不能小于当前餐点！**/
	public static final String ERROR_CODE_306030 = "306030";
	/** 操作失败，未查到桌台信息！**/
	public static final String ERROR_CODE_306031 = "306031";
	/** 操作失败，未查到菜谱信息！**/
	public static final String ERROR_CODE_306032 = "306032";
	/** 操作失败，未查到统计类别信息！**/
	public static final String ERROR_CODE_306033 = "306033";
	/** 操作失败，删除操作重复提交！**/
	public static final String ERROR_CODE_306034 = "306034";
	/** 操作失败，当前类别下已有菜品不能删除！**/
	public static final String ERROR_CODE_306035 = "306035";
	/** 操作失败，未查到上级分类！**/
	public static final String ERROR_CODE_306036 = "306036";
	/** 操作失败，未查到菜品类别！**/
	public static final String ERROR_CODE_306037 = "306037";
	/** 操作失败，菜品无效！**/
	public static final String ERROR_CODE_306038 = "306038";
	/** 操作失败，未查到菜品！**/
	public static final String ERROR_CODE_306039 = "306039";
	/** 操作失败，未配置销售点税率！**/
	public static final String ERROR_CODE_306040 = "306040";
	/** 操作失败，点入项目时必须选择一个桌台！**/
	public static final String ERROR_CODE_306041 = "306041";
	/** 操作失败，未查到菜品价格！**/
	public static final String ERROR_CODE_306042 = "306042";
	/** 操作失败，套餐子项、临时套餐、已冲销、已作废项目不可删除！**/
	public static final String ERROR_CODE_306043 = "306043";
	/** 操作失败，不能删除付款项目！**/
	public static final String ERROR_CODE_306044 = "306044";
	/** 操作失败，套餐子项不能打折！**/
	public static final String ERROR_CODE_306045 = "306045";
	/** 操作失败，金额为零的菜品不能收取服务费！**/
	public static final String ERROR_CODE_306046 = "306046";
	/** 操作失败，套餐子项不能收服务费！**/
	public static final String ERROR_CODE_306047 = "306047";
	/** 操作失败，不能赠送付款项目！**/
	public static final String ERROR_CODE_306048 = "306048";
	/** 操作失败，只有未结账单可以取消赠菜！**/
	public static final String ERROR_CODE_306049 = "306049";
	/** 操作失败，只有未结账单可以设置临时套餐！**/
	public static final String ERROR_CODE_306050 = "306050";
	/** 操作失败，套餐子项金额为零不能设置套餐！**/
	public static final String ERROR_CODE_306051 = "306051";
	/** 操作失败，套餐项目不能设置套餐！**/
	public static final String ERROR_CODE_306052 = "306052";
	/** 操作失败，付款项目不能设置套餐！**/
	public static final String ERROR_CODE_306053 = "306053";
	/** 操作失败，非有效项目不能设置套餐！**/
	public static final String ERROR_CODE_306054 = "306054";
	/** 操作失败，不同桌台菜品不能设置套餐！**/
	public static final String ERROR_CODE_306055 = "306055";
	/** 操作失败，只有未结账单可以取消临时套餐！**/
	public static final String ERROR_CODE_306056 = "306056";
	/** 操作失败，只能对临时套餐主项取消临时套餐！**/
	public static final String ERROR_CODE_306057 = "306057";
	/** 操作失败，未结账单改菜！**/
	public static final String ERROR_CODE_306058 = "306058";
	/** 操作失败，改菜数量应大于零！**/
	public static final String ERROR_CODE_306059 = "306059";
	/** 操作失败，只有有效项目可以改菜！**/
	public static final String ERROR_CODE_306060 = "306060";
	/** 操作失败，同类型餐点不能重复设置！**/
	public static final String ERROR_CODE_306061 = "306061";
	/** 操作失败，该销售点当前餐点未定义入账代码！**/
	public static final String ERROR_CODE_306062 = "306062";
	/** 操作失败，该销售点未定义假房账号！**/
	public static final String ERROR_CODE_306063 = "306063";
	/** 操作失败，该付款方式未定义付款代码！**/
	public static final String ERROR_CODE_306064 = "306064";
	/** 操作失败，付款方式代码不可重复！**/
	public static final String ERROR_CODE_306065 = "306065";
	/** 操作失败，付款方式代码应为三位！**/
	public static final String ERROR_CODE_306066 = "306066";
	/** 操作失败，桌台代码不可重复！**/
	public static final String ERROR_CODE_306067 = "306067";
	/** 操作失败，统计类别代码不可重复！**/
	public static final String ERROR_CODE_306068 = "306068";
	/** 操作失败，统计类别代码应为四位！**/
	public static final String ERROR_CODE_306069 = "306069";
	/** 操作失败，菜品类别代码不可重复！**/
	public static final String ERROR_CODE_306070 = "306070";
	/** 操作失败，菜品类别代码应为四位！**/
	public static final String ERROR_CODE_306071 = "306071";
	/** 操作失败，菜品代码不可重复！**/
	public static final String ERROR_CODE_306072 = "306072";
	/** 操作失败，菜谱类别代码不可重复！**/
	public static final String ERROR_CODE_306073 = "306073";
	/** 操作失败，菜谱类别代码应为四位！**/
	public static final String ERROR_CODE_306074 = "306074";
	/** 操作失败，餐点代码不可重复！**/
	public static final String ERROR_CODE_306075 = "306075";
	/** 操作失败，销售点代码不可重复！**/
	public static final String ERROR_CODE_306076 = "306076";
	/** 操作失败，菜谱正在使用，不能删除！**/
	public static final String ERROR_CODE_306077 = "306077";
	/** 操作失败，没有账单号，不能结账！**/
	public static final String ERROR_CODE_306078 = "306078";
	/** 操作失败，没有厨打元素！**/
	public static final String ERROR_CODE_306079 = "306079";
	/** 操作失败，没有厨打策略元素！**/
	public static final String ERROR_CODE_306080 = "306080";
	/** 操作失败，没有厨打策略元素值！**/
	public static final String ERROR_CODE_306081 = "306081";
	/** 操作失败，没有厨打策略！**/
	public static final String ERROR_CODE_306082 = "306082";
	/** 操作失败，该厨打元素分组只能有一条！**/
	public static final String ERROR_CODE_306083 = "306083";
	/** 操作失败，必须有前置元素！**/
	public static final String ERROR_CODE_306084 = "306084";
	/** 操作失败，没有厨打格式！**/
	public static final String ERROR_CODE_306085 = "306085";
	/** 操作失败，没有打印机！**/
	public static final String ERROR_CODE_306086 = "306086";
	/** 操作失败，只能对未结账单催菜！**/
	public static final String ERROR_CODE_306087 = "306087";
	/** 操作失败，找不到制法！**/
	public static final String ERROR_CODE_306088 = "306088";
	/** 操作失败，账单下没有点菜**/
    public static final String ERROR_CODE_306089 = "306089";
	/** 夜审发现销售点中有未结帐**/
	public static final String ERROR_CODE_306099 = "306099";
	/** 有已送单菜品，不可取消开台**/
    public static final String ERROR_CODE_306100 = "306100";
	
	//***********************************************************************************************
	//**										预订异常信息										   **		
	//***********************************************************************************************
	/** 已有账户状态不可为空**/
	public static final String ERROR_CODE_307001 = "307001";
	/** 状态是‘预订’时，只能做‘复制合住/修改预订/checkIn/取消预订/NoShow’功能**/
	public static final String ERROR_CODE_307002 = "307002";
	/** 预订取消时，取消原因必填**/
	public static final String ERROR_CODE_307003 = "307003";
	/** 状态是‘在店’时，只能做‘复制合住/入住取消/结账’功能**/
	public static final String ERROR_CODE_307004 = "307004";
	/** 来期必须等于业务日期**/
	public static final String ERROR_CODE_307005 = "307005";
	/** 取消入住时，房间状态只能设置为‘干净房’或者‘脏房’**/
	public static final String ERROR_CODE_307006 = "307006";
	/** 取消状态下，只能做‘修改预订/恢复预订’功能**/
	public static final String ERROR_CODE_307007 = "307007";
	/** 来期必须大于等于业务日期**/
	public static final String ERROR_CODE_307008 = "307008";
	/** 已经结账的账户只能做恢复结账操作**/
	public static final String ERROR_CODE_307009 = "307009";
	/** 有房号时房数不可大于1**/
	public static final String ERROR_CODE_307010 = "307010";
	/** 来店日期不可大于离店日期**/
	public static final String ERROR_CODE_307011 = "307011";
	/** DayUse时，来店时间不可大于离店时间**/
	public static final String ERROR_CODE_307012 = "307012";
	/** 房号为空，不能进行入住操作**/
	public static final String ERROR_CODE_307013 = "307013";
	/** 人数不可超过房间最大人数限制**/
	public static final String ERROR_CODE_307014 = "307014";
	/** 只能在预订状态为‘预订’/‘在店’下复制合住**/
	public static final String ERROR_CODE_307015 = "307015";
	/** 房数大于1，不能进行复制合住。**/
	public static final String ERROR_CODE_307016 = "307016";
	/** 来期必须小于等于业务日期**/
	public static final String ERROR_CODE_307017 = "307017";
	/** 状态是‘NOSHOW’时，只能做‘修改预订/NoShow入住’功能**/
	public static final String ERROR_CODE_307018 = "307018";
	/** 来期必须等于业务日期-1**/
	public static final String ERROR_CODE_307019 = "307019";
	/** 来店日期必须是当天**/
	public static final String ERROR_CODE_307020 = "307020";
	/** 有房号时，不能进行排房**/
	public static final String ERROR_CODE_307021 = "307021";
	/** 房间数量不可大于账户的房数。**/
	public static final String ERROR_CODE_307022 = "307022";
	/** 住店人不可为空**/
	public static final String ERROR_CODE_307023 = "307023";
	/** 数据异常：房数为0**/
	public static final String ERROR_CODE_307024 = "307024";
	/** 离店日期必须等于业务日期**/
	public static final String ERROR_CODE_307025 = "307025";
	/** 离店日期必须大于业务日期**/
	public static final String ERROR_CODE_307039 = "307039";
	/** 来离期不能为空**/
	public static final String ERROR_CODE_307026 = "307026";
	/** 此房间已被占用**/
	public static final String ERROR_CODE_307027 = "307027";
	/** 此房型不是假房房型**/
	public static final String ERROR_CODE_307028 = "307028";
	/** 此房间不是假房**/
	public static final String ERROR_CODE_307029 = "307029";
	/** 此房间存在在住的客人**/
	public static final String ERROR_CODE_307030 = "307030";
	/** 房间不存在**/
	public static final String ERROR_CODE_307031 = "307031";
	/** 房型不存在**/
	public static final String ERROR_CODE_307032 = "307032";
	/** 该账户存在账单不可取消入住**/
	public static final String ERROR_CODE_307033 = "307033";
	/** 该账户存在异常数据 无法入住**/
	public static final String ERROR_CODE_307034 = "307034";
	/** 离期不能小于业务日期**/
	public static final String ERROR_CODE_307035 = "307035";
	/** 假房不允许换房**/
	public static final String ERROR_CODE_307036 = "307036";
	/** 取消日期必须大于等于业务日期**/
	public static final String ERROR_CODE_307037 = "307037";
	/** 此媒体类型数据出现多条，请调整数据**/
	public static final String ERROR_CODE_307038 = "307038";
	/** 没有“免消费税”权限**/
	public static final String ERROR_CODE_307040 = "307040";
	/** 没有“禁止接口挂账”权限**/
	public static final String ERROR_CODE_307041 = "307041";
	/** 没有“禁止打印房费”权限**/
	public static final String ERROR_CODE_307042 = "307042";
	/** 没有“修改销售员”权限**/
	public static final String ERROR_CODE_307043 = "307043";
	/** 没有“免服务费”权限**/
	public static final String ERROR_CODE_307044 = "307044";
	/** 没有“入住人姓名修改”权限**/
	public static final String ERROR_CODE_307045 = "307045";
	/** 订房人数据异常**/
	public static final String ERROR_CODE_307046 = "307046";
	/** 在住房号不可为空**/
	public static final String ERROR_CODE_307047 = "307047";
	/** 非在店预订状态不可修改预订信息**/
	public static final String ERROR_CODE_307048 = "307048";
	/** 来期离期必须一致**/
	public static final String ERROR_CODE_307049 = "307049";
	/** 此段时间不可做钟点房**/
	public static final String ERROR_CODE_307050 = "307050";
	/** 在住钟点房来期必须等于业务日期**/
	public static final String ERROR_CODE_307051 = "307051";
	/** 正价房转钟点房：来期必须等于业务日期**/
	public static final String ERROR_CODE_307052 = "307052";
	/** 来期/离期不可为空**/
	public static final String ERROR_CODE_307053 = "307053";
	/** 小时房必须为在店状态**/
	public static final String ERROR_CODE_307054 = "307054";
	/** 价格不可为空**/
	public static final String ERROR_CODE_307055 = "307055";
	/** 离期不可小于当前酒店日期**/
	public static final String ERROR_CODE_307056 = "307056";
	/** 没有转正常房权限**/
	public static final String ERROR_CODE_307057 = "307057";
	/** 不可重复结束计时**/
	public static final String ERROR_CODE_307058 = "307058";
	/** 脏房不可入住**/
	public static final String ERROR_CODE_307059 = "307059";
	/** 未超时，不可转正常房**/
	public static final String ERROR_CODE_307060 = "307060";
	/** 没有宽容时间内不收费权限**/
	public static final String ERROR_CODE_307061 = "307061";
	/** 超出宽容时间，必须收费**/
	public static final String ERROR_CODE_307062 = "307062";
	/** 预离账户不可修改价格**/
	public static final String ERROR_CODE_307063 = "307063";
	/** 房间房型与物理房型不一致**/
	public static final String ERROR_CODE_307064 = "307064";
	/** 没有查看待结账户权限**/
	public static final String ERROR_CODE_307065 = "307065";
	/** 无法获取当天价格信息**/
	public static final String ERROR_CODE_307099 = "307099";
	/** 房型修改失败，无法获取该房型对应价格代码**/
	public static final String ERROR_CODE_307100 = "307100";
	/** 房型不能为空**/
	public static final String ERROR_CODE_307101 = "307101";
	/** 价格不能为空**/
	public static final String ERROR_CODE_307102 = "307102";
	/** 入住时，主单销售状态必须为“确定”状态**/
	public static final String ERROR_CODE_307103 = "307103";
	/** 来期离期必须在主单来离期范围内**/
	public static final String ERROR_CODE_307104 = "307104";
	/** 主单状态为取消/已结状态不可创建预订**/
	public static final String ERROR_CODE_307105 = "307105";
	/**该值必须是Y或N**/
	public static final String ERROR_CODE_307106 = "307106";
	/**该值必须是1或0**/
	public static final String ERROR_CODE_307107 = "307107";
	/**主单已经取消，不可恢复团队宾客*/
	public static final String ERROR_CODE_307108 = "307108";
	/**假房只能开PF房*/
	public static final String ERROR_CODE_307109 = "307109";
	/**市场不可为空*/
	public static final String ERROR_CODE_307110 = "307110";
	/**销售员不可为空*/
	public static final String ERROR_CODE_307111 = "307111";
	/**宾客身份证不可为空*/
	public static final String ERROR_CODE_307112 = "307112";
	/**没有钟点房权限*/
	public static final String ERROR_CODE_307113 = "307113";
	/**设置同来人失败*/
	public static final String ERROR_CODE_307114 = "307114";
	/**此房号设为AD,IF,LS假房，不允许设置*/
	public static final String ERROR_CODE_307115 = "307115";
	/**没有购买团队功能**/
	public static final String ERROR_CODE_307116 = "307116";
	/**假房房型不可修改**/
	public static final String ERROR_CODE_307117 = "307117";
	/**离期必须大于等于业务日期**/
	public static final String ERROR_CODE_307118 = "307118";
	/**CRS订单不可修改**/
	public static final String ERROR_CODE_307119 = "307119";
	/**预订时长不可超过规定天数**/
	public static final String ERROR_CODE_307120 = "307120";
	/**该会员当天有效订房数量不可超过规定数量**/
	public static final String ERROR_CODE_307121 = "307121";

	//***********************************************************************************************
	//**										房价异常信息										   **		
	//***********************************************************************************************
	/** 房型房量信息为空**/
	public static final String ERROR_CODE_308001 = "308001";
	/** 价格日历为空**/
	public static final String ERROR_CODE_308002 = "308002";
	/** 指定价格不存在**/
	public static final String ERROR_CODE_308003 = "308003";
	/** 当前价格不允许折扣**/
	public static final String ERROR_CODE_308004 = "308004";
	/** 价格明细有效日期不能超出价格日期**/
	public static final String ERROR_CODE_308005 = "308005";
	/** 价格房型中不存在当前房型**/
	public static final String ERROR_CODE_308006 = "308006";
	/** 价格明细日期存在冲突**/
	public static final String ERROR_CODE_308007 = "308007";
	/** 价格明细不存在**/
	public static final String ERROR_CODE_308008 = "308008";
	/** 价格明细周设置错误**/
	public static final String ERROR_CODE_308009 = "308009";
	/** 价格明细价格未设置**/
	public static final String ERROR_CODE_308010 = "308010";
	/** 价格有效期结束日期不能小于开始日期**/
	public static final String ERROR_CODE_308011 = "308011";
	/** 价格有效期不能为空**/
	public static final String ERROR_CODE_308012 = "308012";
	/** 价格明细有效期结束日期不能小于开始日期**/
	public static final String ERROR_CODE_308013 = "308013";
	/** 价格明细有效期不能为空**/
	public static final String ERROR_CODE_308014 = "308014";
	/** 价格明细星期不存在有效数据**/
	public static final String ERROR_CODE_308015 = "308015";
	/** 更新价格明细  明细id不能为空**/
	public static final String ERROR_CODE_308016 = "308016";
	/** 价格入账代码不存在**/
	public static final String ERROR_CODE_308017 = "308017";
	/** 非免费房和自用房价格必须大于0**/
	public static final String ERROR_CODE_308018 = "308018";
	/** 每个酒店只能存在一个门市价**/
	public static final String ERROR_CODE_308019 = "308019";
	/** 账单入账代码不存在**/
	public static final String ERROR_CODE_308020 = "308020";
	/** 价格入账代码 || 账单入账代码不存在**/
	public static final String ERROR_CODE_308021 = "308021";
	/** 价格代码已存在**/
	public static final String ERROR_CODE_308022 = "308022";
	/** 价格代码不为为空**/
	public static final String ERROR_CODE_308023 = "308023";
	/** 关联价格代码不能为空**/
	public static final String ERROR_CODE_308024 = "308024";
	/** 关联价格代码不能与价格代码相同**/
	public static final String ERROR_CODE_308025 = "308025";
	/** BAR价只能关联BASE价**/
	public static final String ERROR_CODE_308026 = "308026";
	/** 销售策略价不能关联销售策略价**/
	public static final String ERROR_CODE_308027 = "308027";
	/** 免费房和自用房价格不能小于0**/
	public static final String ERROR_CODE_308028 = "308028";
	/** 当前用户不存在价格修改权限**/
	public static final String ERROR_CODE_308029 = "308029 ";
	/** 当前用户不存在房含修改权限**/
	public static final String ERROR_CODE_308030 = "308030";
	/** 当前用户不存在零房价预定权限**/
	public static final String ERROR_CODE_308031 = "308031";
	/** 当前用户不存在零房价入住权限**/
	public static final String ERROR_CODE_308032 = "308032";
	/** 价格配置服务费或税代码不存在**/
	public static final String ERROR_CODE_308033 = "308033";
	/** 定价方式不可修改**/
	public static final String ERROR_CODE_308034 = "308034";
	/** 钟点房转正常房价格与当前设置不匹配**/
	public static final String ERROR_CODE_308035 = "308035";
	/** 钟点房起步时间不能为空**/
	public static final String ERROR_CODE_308036 = "308036";
	/** 钟点房起步价格不能为空**/
	public static final String ERROR_CODE_308037 = "308037";
	/** 钟点房标准计费时长不能为空或0**/
	public static final String ERROR_CODE_308038 = "308038";
	/** 钟点房标准计费价格不能为空**/
	public static final String ERROR_CODE_308039 = "308039";
	/** 钟点房转正常房价格不能为空**/
	public static final String ERROR_CODE_308040 = "308040";
	/** 钟点房转正常方式不能为空**/
	public static final String ERROR_CODE_308041 = "308041";
	/** 钟点房转正常房价格限定时间不能为空**/
	public static final String ERROR_CODE_308042 = "308042";
	/** 钟点房转正常房价格限定时间设置错误 00:00:00--23:59:59**/
	public static final String ERROR_CODE_308043 = "308043";
	/** 钟点房转正常房价格限定时长不能为空**/
	public static final String ERROR_CODE_308045 = "308045";
	/** 价格星期配置与价格日期不匹配**/
	public static final String ERROR_CODE_308046 = "308046";
	/** 钟点房最小计费时长不能大于标准计费时长**/
	public static final String ERROR_CODE_308047 = "308047";
	/** 钟点房价格查询条件错误**/
	public static final String ERROR_CODE_308048 = "308048";
	/** 钟点房价格查询结束时间不能小于开始时间**/
	public static final String ERROR_CODE_308049 = "308049";
	/** 无法检索到当前价格代码**/
	public static final String ERROR_CODE_308050 = "308050";
	/** 正常入住条件 指定时间获取失败**/
	public static final String ERROR_CODE_308051 = "308051";
	/** 正常入住条件 限定时长获取失败**/
	public static final String ERROR_CODE_308052 = "308052";
	/** 钟点房最小计费金额不能大于标准计费金额**/
	public static final String ERROR_CODE_308053 = "308053";
	/** 消费点已存在**/
	public static final String ERROR_CODE_308056 = "308056";
	/**商品已存在**/
	public static final String ERROR_CODE_308057 = "308057";
	/** 单店无法获取到上级单位代码**/
	public static final String ERROR_CODE_308058 = "308058";
	/**房费人数基准不可修改**/
	public static final String ERROR_CODE_308059 = "308059";
	/**房费价格基准不可修改**/
	public static final String ERROR_CODE_308060 = "308060";
	/**无法设置特殊价格**/
	public static final String ERROR_CODE_308061 = "308061";
	/**价格使用方式无法修改**/
	public static final String ERROR_CODE_308062 = "308062";
	/**价格未设置**/
	public static final String ERROR_CODE_308063 = "308063";
	/**CRS已经设置过当前价格 无法修改**/
	public static final String ERROR_CODE_308064 = "308064";
	/**五人价格 房费价格只能设置每人**/
	public static final String ERROR_CODE_308066 = "308066";
	/**五人含儿童 房费价格只能设置每人（分儿童）**/
	public static final String ERROR_CODE_308067 = "308067";
	/**取消规则不能设置相同的计费类型**/
	public static final String ERROR_CODE_308068 = "308068";
	/**范围异常**/
	public static final String ERROR_CODE_308069 = "308069";
	/** 当前记录只能大于上一条记录 **/
	public static final String ERROR_CODE_308070 = "308070";
	
	//***********************************************************************************************
	//**										占房异常信息										   **		
	//***********************************************************************************************
	/** 房号不存在 **/
	public static final String ERROR_CODE_309001 = "309001";
	/** 房间被占用 **/
	public static final String ERROR_CODE_309002 = "309002";
	/** 故障号以存在 **/
	public static final String ERROR_CODE_309003 = "309003";
	
	/** 可用房 开始日期不能为空 **/
	public static final String ERROR_CODE_309004 = "309004";
	/** 可用房 开始日期不能小于业务日期 **/
	public static final String ERROR_CODE_309005 = "309005";
	/** 结束日期不能小于开始日期 **/
	public static final String ERROR_CODE_309006 = "309006";
	/** 在住状态下房号不能为空 **/
	public static final String ERROR_CODE_309007 = "309007";
	
	//***********************************************************************************************
	//**										房费计算异常信息										   **		
	//***********************************************************************************************
	/** 价格代码不存在 **/
	public static final String ERROR_CODE_310001 = "310001";
	/** 房含代码不存在 **/
	public static final String ERROR_CODE_310002 = "310002";
	/** 房价计算基本数据获取失败 **/
	public static final String ERROR_CODE_310003 = "310003";
	/** 无法获取当前账号历史价格 **/
	public static final String ERROR_CODE_310004 = "310004";
	/** 价格修改来离期小于来期基本数据获取失败 **/
	public static final String ERROR_CODE_310005 = "310005";
	/** 价格修改来离期大于离期基本数据获取失败 **/
	public static final String ERROR_CODE_310006 = "310006";
	/** 每日房价 来期不能小于历史来期 || 离期不能大于历史离期 **/
	public static final String ERROR_CODE_310007 = "310007";
	/** 只能打破合住**/
	public static final String ERROR_CODE_310008 = "310008";
	/** 不能打破合住**/
	public static final String ERROR_CODE_310009 = "310009";
	
	public static final String ERROR_CODE_0001 = "Object is null!";
	public static final String ERROR_CODE_0002 = "processDto parameter businessId error!";
	public static final String ERROR_CODE_0003 = "processDto parameter processName error!";
	public static final String ERROR_CODE_0004 = "processDto parameter isPublish error!";
	public static final String ERROR_CODE_0005 = "Expection!";
	public static final String ERROR_CODE_0006 = "No record in Database or Not Only One record in Database!";
	public static final String ERROR_CODE_0007 = "Work Role is invalid!";
	public static final String ERROR_CODE_0008 = "There has a task instance for the given TaskId in Activiti!";
	public static final String ERROR_CODE_0009 = "There is no need to Update!";
	public static final String ERROR_CODE_0010 = "processDto parameter isMerge error!";
	public static final String ERROR_CODE_0011 = "processDto parameter roleBinding error!";
	public static final String ERROR_CODE_0012 = "processDto parameter isMustAlone error!";
	public static final String ERROR_CODE_0013 = "processDto parameter workTypeStepSort error!";
	
	//***********************************************************************************************
	//**										房间异常信息										   **		
	//***********************************************************************************************
	/** 该房间被使用中，不允许修改房间号或置为无效 **/
	public static final String ERROR_CODE_309905 = "309905";
	/** 该单位 房间号已存在 **/
	public static final String ERROR_CODE_309901 = "309901";
	/** 该单位房间号不存在**/
	public static final String ERROR_CODE_309902 = "309902";
	/** 虚拟房不可以为组合房**/
	public static final String ERROR_CODE_309903 = "309903";
	/** 单间房不能成为组成房**/
	public static final String ERROR_CODE_309904 = "309904";
	/** 金额不为0，必须传入账代码 **/
	public static final String ERROR_CODE_311008 = "311008";
	/** 原房间存在未处理的预授权 **/
	public static final String ERROR_CODE_311138 = "311138";
	/** 金额为0，入账代码不能有值 **/
	public static final String ERROR_CODE_311009 = "311009";
	/** HOLD房型不能新建房间 **/
	public static final String ERROR_CODE_311010 = "311010";
	/** 账户状态不满足（只有预定和在店可以加入团队） **/
	public static final String ERROR_CODE_311011 = "311011";
	/** 来离期不满足（只有在团队来离期范围内可以加入团队） **/
	public static final String ERROR_CODE_311012 = "311012";
	/** 只有散客可以加入团队 **/
	public static final String ERROR_CODE_311013 = "311013";
	/** 散客不可以脱离团队 **/
	public static final String ERROR_CODE_311014 = "311014";
	/** 主单是执行中和预定才可以加入 **/
	public static final String ERROR_CODE_311016 = "311016";
	/** 在店客人不可以加入问询和暂时的团队 **/
	public static final String ERROR_CODE_311017 = "311017";
	//***********************************************************************************************
	//**										收银异常信息										   **		
	//***********************************************************************************************
	/** 该该账号已过夜审，不能取消退房 **/
	public static final String ERROR_CODE_311001 = "311001";
	/** 该房间已被占用 **/
	public static final String ERROR_CODE_311002 = "311002";
	/** 离店日期和业务日期不相同，不能退房 **/
	public static final String ERROR_CODE_311003 = "311003";
	/** 单据日期和业务日期不相同 **/
	public static final String ERROR_CODE_311004 = "311004";
	/** 账单已被修改 **/
	public static final String ERROR_CODE_311005 = "311005";
	/** 账单包内数据为空 **/
	public static final String ERROR_CODE_311015 = "311015";
	/** 离店日期为空 **/
	public static final String ERROR_CODE_311006 = "311006";
	/** 转应收 应收账号为空 **/
	public static final String ERROR_CODE_311007 = "311007";
	/** 日志起期止期必输 **/
	public static final String ERROR_CODE_311019 = "311019";
	/** 账号为空 **/
	public static final String ERROR_CODE_311020 = "311020";
	/** 该账号不在在店状态 **/
	public static final String ERROR_CODE_311021 = "311021";
	/** 该账号不在离店状态 **/
	public static final String ERROR_CODE_311022 = "311022";
	/** 传入账号和结账单不对应 **/
	public static final String ERROR_CODE_311023 = "311023";
	/** 账单为空 **/
	public static final String ERROR_CODE_311024 = "311024";
	/** 目的账户为空 **/
	public static final String ERROR_CODE_311025 = "311025";
	/** 原始账户为空 **/
	public static final String ERROR_CODE_311026 = "311026";
	/** 账页为空 **/
	public static final String ERROR_CODE_311027 = "311027";
	/** 目的账户不存在 **/
	public static final String ERROR_CODE_311028 = "311028";
	/** 原始账户不存在 **/
	public static final String ERROR_CODE_311029 = "311029";
	/** 应收账户禁止挂账 **/
	public static final String ERROR_CODE_311030 = "311030";
	/** 应收账户挂账大于限制 **/
	public static final String ERROR_CODE_311031 = "311031";
	/** 定金账户不存在 **/
	public static final String ERROR_CODE_311032 = "311032";
	/** 定金转入指定假房不存在 **/
	public static final String ERROR_CODE_311033 = "311033";
	/** 科目类型“预定金转押金”对应科目代码不可为空 **/
	public static final String ERROR_CODE_311034 = "311034";
	/** 发番数据异常 **/
	public static final String ERROR_CODE_311035 = "311035";
	/** 没有“超限挂账”权限 **/
	public static final String ERROR_CODE_311036 = "311036";
	/** 入账金额超限 **/
	public static final String ERROR_CODE_311037 = "311037";
	/** 存在未处理的预授权 **/
	public static final String ERROR_CODE_311038 = "311038";
	/** 自用房和免费房不加收房费 **/
	public static final String ERROR_CODE_311039 = "311039";
	/** 所选加收房费有变更 **/
	public static final String ERROR_CODE_311040 = "311040";
	/** 加收房费配置交易代码错误 **/
	public static final String ERROR_CODE_311041 = "311041";
	/** 未启用相应功能 **/
	public static final String ERROR_CODE_311042 = "311042";
	/** 待结房不能再待结结账 **/
	public static final String ERROR_CODE_311043 = "311043";
	/** 重复加收房费 **/
	public static final String ERROR_CODE_311044 = "311044";
	/** 待结结账时没有有效的HOLD房 **/
	public static final String ERROR_CODE_311045 = "311045";
	/** 入账代码不存在**/
	public static final String ERROR_CODE_311046 = "311046";
	/** 结账时入账代码不符合要求 **/
	public static final String ERROR_CODE_311047 = "311047";
	/** 非在店账户不可对冲 **/
	public static final String ERROR_CODE_311048 = "311048";
	/** 拆分金额不可为零 **/
	public static final String ERROR_CODE_311049 = "311049";
	/** 拆分金额与总金额符号不一致 **/
	public static final String ERROR_CODE_311050 = "311050";
	/** 拆分金额不小于总金额**/
	public static final String ERROR_CODE_311051 = "311051";
	/** 业务日期必须等于当天**/
	public static final String ERROR_CODE_311052 = "311052";
	/** 该账已结**/
	public static final String ERROR_CODE_311053 = "311053";
	/** 客账金额与账务金额不一致**/
	public static final String ERROR_CODE_311054 = "311054";
	/** 钟点房不能加收房费**/
	public static final String ERROR_CODE_311055 = "311055";
	/** 没有交易可打印 **/
	public static final String ERROR_CODE_311056 = "311056";
	/** 定金假房退房 **/
	public static final String ERROR_CODE_311057 = "311057";
	/** 会员号为空 **/
	public static final String ERROR_CODE_311058 = "311058";
	/** 会员号密码为空 **/
	public static final String ERROR_CODE_311061 = "311061";
	/** 卡号或手机号为空 **/
	public static final String ERROR_CODE_311062 = "311062";
	/** 积分处理异常 **/
	public static final String ERROR_CODE_311059 = "311059";
	/** 会员校验失败 **/
	public static final String ERROR_CODE_311063 = "311063";
	/** 该账号不在预订状态 **/
	public static final String ERROR_CODE_311060 = "311060";
	/** 获取应收数据失败 **/
	public static final String ERROR_CODE_311064 = "311064";
	/** 主账不做快速退房处理 **/
	public static final String ERROR_CODE_311065 = "311065";
	/** HOLD房不做快速退房处理 **/
	public static final String ERROR_CODE_311066 = "311066";
	/** 有账务未处理不做快速退房处理 **/
	public static final String ERROR_CODE_311067 = "311067";
	/** 团队主单不能做待结结账 **/
	public static final String ERROR_CODE_311068 = "311068";
	/** 有未结的团队成员，不允许主单结账 **/
	public static final String ERROR_CODE_311069 = "311069";
	/** AD,IF,LS假房 不允许结账 **/
	public static final String ERROR_CODE_311070 = "311070";
	/** 钟点房 不允许快速结账 **/
	public static final String ERROR_CODE_311071 = "311071";
	/** 金额为负值，不允许会员卡结账 **/
	public static final String ERROR_CODE_311072 = "311072";
	/** 积分已经取消 **/
	public static final String ERROR_CODE_311073 = "311073";
	/** 积分已经累计 **/
	public static final String ERROR_CODE_311074 = "311074";
	/** 不满足闪住离店扣款，退房失败**/
	public static final String ERROR_CODE_311075 = "311075";
	/** 闪住重新入住校验失败**/
	public static final String ERROR_CODE_311076 = "311076";
	/** 可用房含数量不足 **/
	public static final String ERROR_CODE_311077 = "311077";
	/** 无可取消房含 **/
	public static final String ERROR_CODE_311078 = "311078";
	/** 只可取消当日房含 **/
	public static final String ERROR_CODE_311079 = "311079";
	/**	哑房和待结账户不加收房费 **/
	public static final String ERROR_CODE_311080 = "311080";
	/**	余额不为0，退房失败 **/
	public static final String ERROR_CODE_311081 = "311081";
	//***********************************************************************************************
	//**										房含异常信息										   **		
	//***********************************************************************************************
	/** 日期有重复 **/
	public static final String ERROR_CODE_312001 = "312001";
	/** 房含代码为空 **/
	public static final String ERROR_CODE_312002 = "312002";
	/** 房含代码已存在 **/
	public static final String ERROR_CODE_312003 = "312003";
	/** 记账方式为空 **/
	public static final String ERROR_CODE_312004 = "312004";
	/** 过费科目代码为空 **/
	public static final String ERROR_CODE_312005 = "312005";
	/** 收费基准为空 **/
	public static final String ERROR_CODE_312006 = "312006";
	/** 收费基准为空 **/
	public static final String ERROR_CODE_312007 = "312007";
	/** 过费方式为空 **/
	public static final String ERROR_CODE_312008 = "312008";
	/** 消费品代码为空 **/
	public static final String ERROR_CODE_312009 = "312009";
	/** 接管数据异常 **/
	public static final String ERROR_CODE_312010 = "312010";
	/** 消费品代码重复 **/
	public static final String ERROR_CODE_312011 = "312011";
	
	//***********************************************************************************************
	//**										字典表异常信息									   **		
	//***********************************************************************************************
	/** 无法检索到字典数据 **/
	public static final String ERROR_CODE_313001 =	"313001";
	
	//***********************************************************************************************
	//**										房含分组异常信息									   **		
	//***********************************************************************************************
	public static final String ERROR_CODE_314001 = "314001";
	/** 房含分组代码为空 **/
	public static final String ERROR_CODE_314002 = "314002";
	/** 房含分组代码已存在 **/
	public static final String ERROR_CODE_314003 = "314003";
	/** 房含分组明细重复 **/
	public static final String ERROR_CODE_314005 = "314005";
	//***********************************************************************************************
	//**										房型异常信息										   **		
	//***********************************************************************************************
	//房型代码已经存在
	public static final String ERROR_CODE_313002 = "313002";
	//房型已被使用不允许置无效或者修改房型属性
	public static final String ERROR_CODE_313003 = "313003";
	//属性是IF，PF，PM，HO的房型属性类型只能有一个房型
	public static final String ERROR_CODE_313004 = "313004";
	//房间属性为空
	public static final String ERROR_CODE_313005 = "313005";
	//房型属性是物理&销售时，属性类型中仅能选择客房
	public static final String ERROR_CODE_313006 = "313006";
	/**房型代码不可为空**/
	public static final String ERROR_CODE_313007 = "313007";
	/**房型名称为空**/
	public static final String ERROR_CODE_313008 = "313008";
	/**最大入住人数为空**/
	public static final String ERROR_CODE_313009 = "313009";
	/**标准入住人数为空**/
	public static final String ERROR_CODE_313010 = "313010";
	/**需要接管才可以修改**/
	public static final String ERROR_CODE_313011 = "313011";
	/**接管时，Unit表中不可存在数据**/
	public static final String ERROR_CODE_313012 = "313012";
	/**已经存在其他单位信息，只能修改为“导入&自用”**/
	public static final String ERROR_CODE_313013 = "313013";
	/**接管时，只能选“导入”与“导入&自用”**/
	public static final String ERROR_CODE_313014 = "313014";
	/**导入&自用”数据不可修改为“导入”/“自用”**/
	public static final String ERROR_CODE_313015 = "313015";
	/**房型ID不可为空**/
	public static final String ERROR_CODE_313016 = "313016";
	/**外网名称不可为空**/
	public static final String ERROR_CODE_313017 = "313017";
	/**所在楼层不可为空**/
	public static final String ERROR_CODE_313018 = "313018";
	/**房型面积不可为空**/
	public static final String ERROR_CODE_313019 = "313019";
	/**可住人数不可为空**/
	public static final String ERROR_CODE_313020 = "313020";
	/**床型不可为空**/
	public static final String ERROR_CODE_313021 = "313021";
	/**房型设施信息不可为空**/
	public static final String ERROR_CODE_313022 = "313022";
	
	//***********************************************************************************************
	//**										酒店代码异常信息										   **		
	//***********************************************************************************************
	/** 酒店代码不能为空 **/
	public static final String ERROR_CODE_316001 = "316001";
	/** 酒店代码不存在 **/
	public static final String ERROR_CODE_316002 = "316002";
	/** 集团代码不能为空 **/
	public static final String ERROR_CODE_316003 = "316003";
	
	
	//***********************************************************************************************
	//**										过房费异常信息									   **		
	//***********************************************************************************************
	/** 合住号为空 **/
	public static final String ERROR_CODE_317000 = "317000";
	/** 科目代码不可为空 **/
	public static final String ERROR_CODE_317001 = "317001";
	/** 账户不可为空 **/
	public static final String ERROR_CODE_317002 = "317002";
	/** 入账金额不可为空 **/
	public static final String ERROR_CODE_317003 = "317003";
	/** 每日房价为空**/
	public static final String ERROR_CODE_317004 = "317004";
	/** 业务日期为空 **/
	public static final String ERROR_CODE_317005 = "317005";
	/** 缓存中和数据库中业务日期不一致 **/
	public static final String ERROR_CODE_317006 = "317006";
	/** 审计日期为空 **/
	public static final String ERROR_CODE_317007 = "317007";
	/** 夜审日期为空 **/
	public static final String ERROR_CODE_317037 = "317037";
	/** 夜审过房费只可夜审时调用 **/
	public static final String ERROR_CODE_317008 = "317008";
	/** 非在店账户不可过房费 **/
	public static final String ERROR_CODE_317009 = "317009";
	/** 假房不可过房费 **/
	public static final String ERROR_CODE_317010 = "317010";
	/** 价格异常 **/
	public static final String ERROR_CODE_317011 = "317011";
	/** 房号/账户为空 **/
	public static final String ERROR_CODE_317012 = "317012";
	/** 账户不存在 **/
	public static final String ERROR_CODE_317013 = "317013";
	/** 不能挂账 **/
	public static final String ERROR_CODE_317014 = "317014";
	/** 现付时，金额合计必须为0 **/
	public static final String ERROR_CODE_317015 = "317015";
	/** 现付时，假房标识必须为“接口抛帐房” **/
	public static final String ERROR_CODE_317016 = "317016";
	/** 科目类型非付款类型 **/
	public static final String ERROR_CODE_317017 = "317017";
	/** 发番ID不可为空 **/
	public static final String ERROR_CODE_317018 = "317018";
	/** 税组号不可为空 **/
	public static final String ERROR_CODE_317019 = "317019";
	/** 挂账时，假房标识不可为“接口抛帐房” **/
	public static final String ERROR_CODE_317020 = "317020";
	/** 服务费异常 **/
	public static final String ERROR_CODE_317021 = "317021";
	/** 税率异常 **/
	public static final String ERROR_CODE_317022 = "317022";
	/** 服务费税率异常 **/
	public static final String ERROR_CODE_317031 = "317031";
	/** 此科目代码非服务费类型 **/
	public static final String ERROR_CODE_317023 = "317023";
	/** 此科目代码非税率类型 **/
	public static final String ERROR_CODE_317024 = "317024";
	/** 提前过房费：酒店日期不可大于等于离店日期 **/
	public static final String ERROR_CODE_317025 = "317025";
	/** 不允许拆入收入类型日志 **/
	public static final String ERROR_CODE_317026 = "317026";
	/** 兑现条件不满足**/
	public static final String ERROR_CODE_317027 = "317027";
	/** 会员号必填**/
	public static final String ERROR_CODE_317028 = "317028";
	/** 信用卡类型必填**/
	public static final String ERROR_CODE_317029 = "317029";
	/** 应收账号必填**/
	public static final String ERROR_CODE_317030 = "317030";
	/** 科目代码费用类型必须小于500，付款类型必须小于900**/
	public static final String ERROR_CODE_317032 = "317032";
	/** 假房不可结束计时**/
	public static final String ERROR_CODE_317033 = "317033";
	/** 没有录入负数权限**/
	public static final String ERROR_CODE_317034 = "317034";
	/** 房号必须为空**/
	public static final String ERROR_CODE_317035 = "317035";
	/**人数数只能输入大于0的整数*/
	public static final String ERROR_CODE_317036 = "317036";
	/**加入合住，必须是1间房**/
	public static final String ERROR_CODE_317038 = "317038";
	/**消费金额不可大于总金额**/
	public static final String ERROR_CODE_317039 = "317039";
	/** 应收兑现科目代码593或者993不存在 **/
	public static final String ERROR_CODE_317049 = "317049";
	/** 应收票据编码不可为空 **/
	public static final String ERROR_CODE_317050 = "317050";
	/** 票据数据异常 **/
	public static final String ERROR_CODE_317051 = "317051";
	/** 应收数据异常 **/
	public static final String ERROR_CODE_317052 = "317052";
	/** 对冲账为空 **/
	public static final String ERROR_CODE_317053 = "317053";
	/** 应收账户已作废 **/
	public static final String ERROR_CODE_317054 = "317054";
	
	/** 应收兑现发票数据异常 **/
	public static final String ERROR_CODE_317055 = "317055";
	
	/** 应收兑现收据数据异常 **/
	public static final String ERROR_CODE_317056 = "317056";
	/** 应收交易金额与交易JRNL金额不一致 **/
	public static final String ERROR_CODE_317057 = "317057";
	/** 无法兑现 **/
	public static final String ERROR_CODE_317058 = "317058";
	/** 发票转账不能转入该发票 **/
	public static final String ERROR_CODE_317059 = "317059";
	/** 人数不可为空 **/
	public static final String ERROR_CODE_317070 = "317070";
	
	//***********************************************************************************************
	//**										夜审异常信息  									   **		
	//***********************************************************************************************
	/** 夜审步骤为空 **/
	public static final String ERROR_CODE_318000 = "318000";
	/** 此步骤不可忽略 **/
	public static final String ERROR_CODE_318001 = "318001";
	/** 酒店日期对象为空 **/
	public static final String ERROR_CODE_318002 = "318002";
	/** 夜审执行中，当前操作员与上次执行夜审操作员不一致 **/
	public static final String ERROR_CODE_318003 = "318003";
	/** 酒店日期与审计日期不一致 **/
	public static final String ERROR_CODE_318004 = "318004";
	/** 该酒店没有对应的夜审 **/
	public static final String ERROR_CODE_318005 = "318005";
	/** 数据异常。请调整数据后，继续执行 **/
	public static final String ERROR_CODE_318006 = "318006";
	/** 该酒店已经执行夜审。请调整数据后，继续执行 **/
	public static final String ERROR_CODE_318007 = "318007";
	/** 审计日期不可超过业务日期 **/
	public static final String ERROR_CODE_318008 = "318008";
	/** 夜审步骤不一致 **/
	public static final String ERROR_CODE_318009 = "318009";
	/** 数据异常，该酒店当天没有对应的夜审 **/
	public static final String ERROR_CODE_318010 = "318010";
	/** 不可恢复到夜审前状态 **/
	public static final String ERROR_CODE_318011 = "318011";
	/** 酒店日期已经变更，不可恢复到夜审前状态 **/
	public static final String ERROR_CODE_318012 = "318012";
	
	//***********************************************************************************************
	//**										特殊付款信息  									   **		
	//***********************************************************************************************
	/** 特殊付款账户不能为空 **/
	public static final String ERROR_CODE_324100= "324100";
	/** 特殊付款账户不存在 **/
	public static final String ERROR_CODE_324101= "324101";
	/** 修改数据不能存在相同账号 **/
	public static final String ERROR_CODE_324102= "324102";
	/** 特殊付款入账代码不能为空 **/
	public static final String ERROR_CODE_324103= "324103";
	/** 转账账号不能为空 **/
	public static final String ERROR_CODE_324104= "324104";
	/** 转账目标账页不能为空 **/
	public static final String ERROR_CODE_324105= "324105";
	/** 最多设置3条转账信息 **/
	public static final String ERROR_CODE_324106= "324106";
	/** 以离店账号不能新增或修改 **/
	public static final String ERROR_CODE_324107= "324107";
	/** 特殊付款无法检查到当前数据 **/
	public static final String ERROR_CODE_324108= "324108";
	/** 不能存在重复的入账代码 **/
	public static final String ERROR_CODE_324109= "324109";
	/** 转账页大于最大帐页数 **/
	public static final String ERROR_CODE_324110= "324110";
	/** 转帐页帐页不能为空 **/
	public static final String ERROR_CODE_324111= "324111";
	/** 历史账号无法设置特殊付款 **/
	public static final String ERROR_CODE_324112= "324112";
	/** 无法检索到酒店入账代码 **/
	public static final String ERROR_CODE_324113= "324113";
	/** 存在不符合条件的入账代码 **/
	public static final String ERROR_CODE_324114= "324114";
	/** 特殊付款唯一账号获取失败 **/
	public static final String ERROR_CODE_324115= "324115";
	/** 转账户不能转入本身**/
	public static final String ERROR_CODE_324116= "324116";
	/** 转账户帐页不能为空**/
	public static final String ERROR_CODE_324117= "324117";
	/** 当前账号不存在同来人账号**/
	public static final String ERROR_CODE_324118= "324118";
	/** 非RSV或STY不可设置特殊付款**/
	public static final String ERROR_CODE_324119= "324119";
	/** 当前账户不存在RSV或STY的合住账户**/
	public static final String ERROR_CODE_324120= "324120";
	/** 当前账户不为团队主单**/
	public static final String ERROR_CODE_324121= "324121";
	/** 当前账号不存在团队预定账号**/
	public static final String ERROR_CODE_324122= "324122";
	/** 特殊付款属性错误**/
	public static final String ERROR_CODE_324123= "324123";
	/** 不存在对应的特殊付款属性**/
	public static final String ERROR_CODE_324124= "324124";
	
	//***********************************************************************************************
	//**										工作站错误信息  									   **		
	//***********************************************************************************************
	/** 工作站机器名已经存在，请重新输入**/
	public static final String ERROR_CODE_325001= "325001";
	/** 工作站IP格式不正确**/
	public static final String ERROR_CODE_325002= "325002";
	/** 工作站公网IP格式不正确**/
	public static final String ERROR_CODE_325003= "325003";
	/** 工作站内接口类型对应的接口只能出现一个**/
	public static final String ERROR_CODE_325004= "325004";
	/** 修改数据时，数据异常**/
	public static final String ERROR_CODE_325005= "325005";
	/** 工作站机器名必填**/
	public static final String ERROR_CODE_325006= "325006";
	/** 工作站IP必填**/
	public static final String ERROR_CODE_325007= "325007";
	/** 工作站MAC必填**/
	public static final String ERROR_CODE_325008= "325008";
	
	//***********************************************************************************************
	//**										集团导入  									   **		
	//***********************************************************************************************
	/** 集团导入入账代码不存在**/
	public static final String ERROR_CODE_326001= "326001";
	/** 集团导入服务费代码不存在**/
	public static final String ERROR_CODE_326002= "326002";
	/** 集团导入税代码不存在**/
	public static final String ERROR_CODE_326003= "326003";
	
	/** 导入存在重复code**/
	public static final String ERROR_CODE_326005= "326005";
	
	/** 入账代码导入存在无法导入的依赖项**/
	public static final String ERROR_CODE_326004= "326004";
	/** 导入入账代码异常**/
	public static final String ERROR_CODE_326006= "326006";
	/** 消费品导入入账代码异常**/
	public static final String ERROR_CODE_326007= "326007";
	/** 房型导入 房型分组异常**/
	public static final String ERROR_CODE_326008= "326008";
	/** 房含导入 入账代码异常**/
	public static final String ERROR_CODE_326009= "326009";
	/** 房价导入 价格大分类 小分类 导入异常**/
	public static final String ERROR_CODE_326010= "326010";
	/** 商品 导入异常**/
	public static final String ERROR_CODE_326011= "326011";
	/** 不可分发**/
	public static final String ERROR_CODE_326012= "326012";
	/** 禁用**/
	public static final String ERROR_CODE_326013= "326013";
	/** 未接管的**/
	public static final String ERROR_CODE_326014= "326014";
	/** 自用**/
	public static final String ERROR_CODE_326015= "326015";
	/** 被管控 无法导入**/
	public static final String ERROR_CODE_326016= "326016";
	/** 依赖异常**/
	public static final String ERROR_CODE_326017= "326017";
	/** 分发失败**/
	public static final String ERROR_CODE_326018= "326018";
	
	//***********************************************************************************************
	//**										发票  									   **		
	//***********************************************************************************************
	/** 发票项目费用类型为空或交易金额为0**/
	public static final String ERROR_CODE_327001= "327001";
	/** 发票不存在**/
	public static final String ERROR_CODE_327002= "327002";
	/** 发票项目不能重复**/
	public static final String ERROR_CODE_327003= "327003";
	/** 同账户不可转单**/
	public static final String ERROR_CODE_327004= "327004";
	/** 存在兑现记录不可转单**/
	public static final String ERROR_CODE_327005= "327005";
	/** 票据所属账户不一致**/
	public static final String ERROR_CODE_327006= "327006";
	/*
	 * 400000 报表异常信息
	 */
	public static final String ERROR_CODE_400000 = "400000";
	/** 数据源SQL中参数（系统参数、业务参数）格式不对 **/
	public static final String ERROR_CODE_400001 = "400001";
	/** 数据源SQL中where查询条件格式不对 **/
	public static final String ERROR_CODE_400002 = "400002";
	/** 数据源SQL中币种格式不对 **/
	public static final String ERROR_CODE_400003 = "400003";
	/** 请选业务日期之前的日期 **/
	public static final String ERROR_CODE_400004 = "400004";
	/** 查询协议客户名称条件格式不合格 **/
	public static final String ERROR_CODE_400005 = "400005";
	/** 查询协议客户失败 */
	public static final String ERROR_CODE_400006 = "400006";
	/**当天已经执行过房费，不可继续执行**/
	public static final String ERROR_CODE_400007 = "400007";
	/**默认系统账户不存在**/
	public static final String ERROR_CODE_400008 = "400008";
	public static final String ERROR_CODE_400009 = "400009";
	public static final String ERROR_CODE_400010 = "400010";
	public static final String ERROR_CODE_400011 = "400011";
	public static final String ERROR_CODE_400012 = "400012";
	public static final String ERROR_CODE_400013 = "400013";
	public static final String ERROR_CODE_400014 = "400014";
	public static final String ERROR_CODE_400015 = "400015";
	public static final String ERROR_CODE_400016 = "400016";
	public static final String ERROR_CODE_400017 = "400017";
	public static final String ERROR_CODE_400018 = "400018";
	public static final String ERROR_CODE_400019 = "400019";
	public static final String ERROR_CODE_400020 = "400020";
	/** 报表数据源未配置 **/
	public static final String ERROR_CODE_400022 = "400022";
	/** 删除日期为空 **/
	public static final String ERROR_CODE_400021 = "400021";
	/**该条记录已经预授权撤销 **/
	public static final String ERROR_CODE_400023 = "400023";
	/**该条记录已经预授权完成 **/
	public static final String ERROR_CODE_400024 = "400024";
	/**该账户无法作废**/
	public static final String ERROR_CODE_400025 = "400025";
	
	//***********************************************************************************************
	//**										会员等级，卡类型，卡级别  									   **		
	//***********************************************************************************************
	/**会员级别等级不在范围内**/
	public static final String ERROR_CODE_500001 = "500001";
	/**会员级别等级重复**/
	public static final String ERROR_CODE_500002 = "500002";
	/** 同一单位直销渠道已存在 **/
	public static final String ERROR_CODE_303021 = "303021";
	/** 同一协议公司 分销渠道已存在 **/
	public static final String ERROR_CODE_303022 = "303022";
	/** 同一协议公司和单位 呼叫中心渠道已存在 **/
	public static final String ERROR_CODE_303023 = "303023";
	/** 订单前缀不能重复 **/
	public static final String ERROR_CODE_303024 = "303024";
	/** 同一集团系统渠道不能重复 **/
	public static final String ERROR_CODE_303025 = "303025";
	
	//====================================================================================================
	//*****************************************充值收费/优惠策略*******************************************
	//====================================================================================================
	/** 充值收费策略代码不可为空 **/
	public static final String ERROR_CODE_315001 = "315001";
	/** 充值收费策略名称不可为空 **/
	public static final String ERROR_CODE_315002 = "315002";
	/** 充值收费策略类型不可为空 **/
	public static final String ERROR_CODE_315003 = "315003";
	/** 交易代码不可为空 **/
	public static final String ERROR_CODE_315004 = "315004";
	/** 起充金额不可为空 **/
	public static final String ERROR_CODE_315005 = "315005";
	/** 会员等级不可为空 **/
	public static final String ERROR_CODE_315006 = "315006";
	/** 修改时，充值收费策略ID不可为空 **/
	public static final String ERROR_CODE_315007 = "315007";
	/** 该集团已经存在此代码，请重新输入 **/
	public static final String ERROR_CODE_315008 = "315008";
	/** 该类型已经存在此会员，请重新选择 **/
	public static final String ERROR_CODE_315009 = "315009";
	/** 修改时，充值收费策略对象不可为空或者数据异常 **/
	public static final String ERROR_CODE_315010 = "315010";
	/** 该策略中已经存在此附加类型，请重新输入 **/
	public static final String ERROR_CODE_315011 = "315011";
	/** 该金额在此类型已经存在 **/
	public static final String ERROR_CODE_315012 = "315012";
	
	/** 优惠策略代码不可为空 **/
	public static final String ERROR_CODE_315013 = "315013";
	/** 优惠策略名称不可为空 **/
	public static final String ERROR_CODE_315014 = "315014";
	/** 会员等级不可为空 **/
	public static final String ERROR_CODE_315015 = "315015";
	/** 优惠策略类型不可为空 **/
	public static final String ERROR_CODE_315016 = "315016";
	/** 日期不可为空 **/
	public static final String ERROR_CODE_315017 = "315017";
	/** 开始日期不可大于结束日期 **/
	public static final String ERROR_CODE_315018 = "315018";
	/** 动态参数不可为空 **/
	public static final String ERROR_CODE_315019 = "315019";
	/** 优惠策略类型输入错误，请重新输入 **/
	public static final String ERROR_CODE_315020 = "315020";
	/** 修改时，主键不可为空 **/
	public static final String ERROR_CODE_315021 = "315021";
	/** 类型为折扣价格时，价格ID不可为空 **/
	public static final String ERROR_CODE_315022 = "315022";
	/** 时长分钟数不可为空 **/
	public static final String ERROR_CODE_315023 = "315023";
	/** 固定时间值格式错误 **/
	public static final String ERROR_CODE_315024 = "315024";
	/** 明细项目不可为空 **/
	public static final String ERROR_CODE_315025 = "315025";
	/** 房型不可为空 **/
	public static final String ERROR_CODE_315026 = "315026";
	/** 该集团已经存在此代码，请重新输入**/
	public static final String ERROR_CODE_315027 = "315027";
	/** 修改时，优惠策略对象不可为空或者数据异常 **/
	public static final String ERROR_CODE_315028 = "315028";
	/** 存在交集数据 **/
	public static final String ERROR_CODE_315029 = "315029";
	/** 订单时间类型错误 **/
	public static final String ERROR_CODE_315030 = "315030";
	/** 时长分钟数范围为 1 ~ 599 **/
	public static final String ERROR_CODE_315031 = "315031";
	/** 类型为每日订单数量时，数量不可为空 **/
	public static final String ERROR_CODE_315032 = "315032";
	
	//====================================================================================================
	//*****************************************会员*******************************************
	//====================================================================================================
	/**  无法检索到渠道信息**/
	public static final String ERROR_CODE_354001 = "354001";	
	/**  无法检索到会员等级**/
	public static final String ERROR_CODE_354002 = "354002";	
	/**  策略条件不存在**/
	public static final String ERROR_CODE_354003 = "354003";	
	/**  积分规则不能为空**/
	public static final String ERROR_CODE_354004 = "354004";	
	/**  会员等级不能为空**/
	public static final String ERROR_CODE_354005 = "354005";
	/**  入账代码子分组不存在**/
	public static final String ERROR_CODE_354006 = "354006";
	/**  积分规则不能为空**/
	public static final String ERROR_CODE_354007 = "354007";
	/**  积分方式不存在**/
	public static final String ERROR_CODE_354008 = "354008";
	/**  代码不能为空**/
	public static final String ERROR_CODE_354009 = "354009";
	/**  名称不能为空**/
	public static final String ERROR_CODE_354010 = "354010";	
	
	/**  积分类型不能为空**/
	public static final String ERROR_CODE_354011 = "354011";	
	/**  开始结束日期不能为空**/
	public static final String ERROR_CODE_354012 = "354012";	
	/**  开始日期不能大于结束日期**/
	public static final String ERROR_CODE_354013 = "354013";	
	/**  积分策略不存在**/
	public static final String ERROR_CODE_354014 = "354014";	
	/**  积分策略日期存在交集数据**/
	public static final String ERROR_CODE_354015 = "354015";	
	/**  积分策略code重复**/
	public static final String ERROR_CODE_354016 = "354016";	
	/**  明细项目不能为空**/
	public static final String ERROR_CODE_354017 = "354017";	
	/**  消费金额不能为空**/
	public static final String ERROR_CODE_354018 = "354018";	
	/**  可得积分不能为空**/
	public static final String ERROR_CODE_354019 = "354019";	
	
	/**  策略条件不存在**/
	public static final String ERROR_CODE_354020 = "354020";	
	/**  升级策略不能为空**/
	public static final String ERROR_CODE_354021 = "354021";
	/**  升级策略条件不能为空**/
	public static final String ERROR_CODE_354022 = "354022";
	/**  升级策略条件数值不能为空**/
	public static final String ERROR_CODE_354023 = "354023";
	/**  策略条件类型不存在**/
	public static final String ERROR_CODE_354024 = "354024";
	/**  验证方式类型不存在**/
	public static final String ERROR_CODE_354025 = "354025";
	/**  代码不能为空**/
	public static final String ERROR_CODE_354026 = "354026";
	/**  名称不能为空**/
	public static final String ERROR_CODE_354027 = "354027";
	/**  会员等级不能为空**/
	public static final String ERROR_CODE_354028 = "354028";
	/**  原会员等级不能与新会员等级相同**/
	public static final String ERROR_CODE_354029 = "354029";
	/**  升级策略不存在**/
	public static final String ERROR_CODE_354030 = "354030";
	
	/**  升级策略code重复**/
	public static final String ERROR_CODE_354031 = "354031";
	/**  升级策略日期存在交集数据**/
	public static final String ERROR_CODE_354032 = "354032";
	/**  策略条件不存在**/
	public static final String ERROR_CODE_354033 = "354033";
	/**  会员相关code重复**/
	public static final String ERROR_CODE_354061= "354061";
	/** 无法获取积分交易数据 **/
	public static final String ERROR_CODE_354034 = "354034";
	/** 积分数据获取错误 **/
	public static final String ERROR_CODE_354035 = "354035";
	/** 消费积分不足 **/
	public static final String ERROR_CODE_354036 = "354036";
	/** 积分已过期，无法取消 **/
	public static final String ERROR_CODE_354037 = "354037";
	/** 取消积分失败 **/
	public static final String ERROR_CODE_354038 = "354038";
	/** 积分消费数据无法获取 **/
	public static final String ERROR_CODE_354039 = "354039";
	/** 积分消费无法取消 **/
	public static final String ERROR_CODE_354040 = "354040";
	/** 积分消费取消无法查找对应金额 **/
	public static final String ERROR_CODE_354041 = "354041";
	/** 积分类型错误 **/
	public static final String ERROR_CODE_354042 = "354042";
	/** 会员信息不能为空 **/
	public static final String ERROR_CODE_354043 = "354043";
	/** 会员信息部分参数不能为空 **/
	public static final String ERROR_CODE_354044 = "354044";
	/** 匿名用户物理卡不能为空 **/
	public static final String ERROR_CODE_354045 = "354045";
	/** 会员卡部分参数不能为空 **/
	public static final String ERROR_CODE_354046 = "354046";
	/** 无法检索到会员卡等级 **/
	public static final String ERROR_CODE_354047 = "354047";
	/** 无法检索此会员卡类别 **/
	public static final String ERROR_CODE_354048 = "354048";
	/** 物理卡存储号与印刷号不能相同 **/
	public static final String ERROR_CODE_354049 = "354049";
	/** 存储号已存在 **/
	public static final String ERROR_CODE_354050 = "354050";
	/** 印刷号已存在 **/
	public static final String ERROR_CODE_354051 = "354051";
	/** 客史号经校验不存在 **/
	public static final String ERROR_CODE_354052 = "354052";
	/** 客史号生成错误 **/
	public static final String ERROR_CODE_354053 = "354053";
	/** 报错！！！没有证件类型与证件号码，不能手动生成客史号 **/
	public static final String ERROR_CODE_354054 = "354054";
	/** 无法检索到会员等级 **/
	public static final String ERROR_CODE_354055 = "354055";
	/** 使用积分无法取消 **/
	public static final String ERROR_CODE_354056 = "354056";
	/** 会员不存在 **/
	public static final String ERROR_CODE_354057 = "354057";
	/** 当前消费数据已存在 **/
	public static final String ERROR_CODE_354058 = "354058";
	/** 无法检索消费数据 **/
	public static final String ERROR_CODE_354059 = "354059";
	/** 当前消费已取消 **/
	public static final String ERROR_CODE_354060 = "354060";
	
	/** 策略属性不能为空 **/
	public static final String ERROR_CODE_354068 = "354068";
	
	/** 条件异常 **/
	public static final String ERROR_CODE_354301 = "354301";
	/** 条件异常 **/
	public static final String ERROR_CODE_354302 = "354302";
	
	
	//******************************************************************************
	//==============================报表错误信息====================================
	//******************************************************************************
	/** 值类型必须为集合 **/
	public static final String ERROR_CODE_360001 = "360001";
	/** 值类型必须为字符串 **/
	public static final String ERROR_CODE_360002 = "360002";
	/** 值类型必须为数字 **/
	public static final String ERROR_CODE_360003 = "360003";
	/** 值类型必须为小数 **/
	public static final String ERROR_CODE_360004 = "360004";
	/** 值类型必须为日期 **/
	public static final String ERROR_CODE_360005 = "360005";
	/** 下拉框主键唯一 **/
	public static final String ERROR_CODE_360006 = "360006";
	/** 请求失败 **/
	public static final String ERROR_CODE_360007 = "360007";
	/** 数据源模块不存在 **/
	public static final String ERROR_CODE_360008 = "360008";
	/** 域名不存在 **/
	public static final String ERROR_CODE_360009 = "360009";
	/** 默认值为系统参数时，系统参数值不可为空 **/
	public static final String ERROR_CODE_360010 = "360010";
	/** 日期为空 **/
	public static final String ERROR_CODE_360011 = "360011";
	/** 画报表失败 **/
	public static final String ERROR_CODE_360012 = "360012";
	/** 必填域不可为空 **/
	public static final String ERROR_CODE_360013 = "360013";
	/** 报表条件重复 **/
	public static final String ERROR_CODE_360014 = "360014";
	
	//******************************************************************************
	//==============================充值============================================
	//******************************************************************************
	/**该充值已被使用，无法取消充值**/
	public static final String ERROR_CODE_361001 = "361001";
	/**会员号不可为空**/
	public static final String ERROR_CODE_361002 = "361002";
	/**会员信息异常**/
	public static final String ERROR_CODE_361003 = "361003";
	/**余额不足，当前余额0**/
	public static final String ERROR_CODE_361004 = "361004";
	/**余额不足**/
	public static final String ERROR_CODE_361005 = "361005";
	/**数据异常或businessId为空**/
	public static final String ERROR_CODE_361006 = "361006";
	/**充值数据异常**/
	public static final String ERROR_CODE_361007 = "361007";
	/**验证密码时，数据异常**/
	public static final String ERROR_CODE_361008 = "361008";
	/**密码错误，请重新输入**/
	public static final String ERROR_CODE_361009 = "361009";
	/**该单位发行会员不可在本单位用**/
	public static final String ERROR_CODE_361010 = "361010";
	/**会员号不可为空**/
	public static final String ERROR_CODE_361011 = "361011";
	/**账号不可为空**/
	public static final String ERROR_CODE_361012 = "361012";
	/**发生单位不可为空 **/
	public static final String ERROR_CODE_361013 = "361013";
	/**金额不可为空 **/
	public static final String ERROR_CODE_361014 = "361014";
	/**会员密码不可为空**/
	public static final String ERROR_CODE_361015 = "361015";
	/**策略科目代码必须为付款类型**/
	public static final String ERROR_CODE_361016 = "361016";
	/**当前会员没有对应余额，不可退款**/
	public static final String ERROR_CODE_361017 = "361017";
	/**退款金额不可超过可退金额**/
	public static final String ERROR_CODE_361018 = "361018";
	/**会员使用信息配置不存在**/
	public static final String ERROR_CODE_361019 = "361019";
	/**代充值假房房号为空，请查看配置数据是否正确**/
	public static final String ERROR_CODE_361020 = "361020";
	/**科目代码为空，请查看配置数据是否正确**/
	public static final String ERROR_CODE_361021 = "361021";
	/**代充值假房账户不存在**/
	public static final String ERROR_CODE_361022 = "361022";
	/**充值策略异常**/
	public static final String ERROR_CODE_361023 = "361023";
	/**已经消费的过的充值不可退款**/
	public static final String ERROR_CODE_361024 = "361024";
	
	/**获取当天统计信息时，开始日期必须等于结束日期**/
	public static final String ERROR_CODE_371000 = "371000";
	/**会员发行信息配置不存在**/
	public static final String ERROR_CODE_361025 = "361025";

	//====================================================================================================
	//*****************************************渠道*******************************************
	//====================================================================================================
	/**管理酒店重复**/
	public static final String ERROR_CODE_355001 = "355001";
	/**管理渠道重复**/
	public static final String ERROR_CODE_355101 = "355101";
	/**系统渠道不能为空**/
	public static final String ERROR_CODE_355002 = "355002";
	/**渠道代码不能为空**/
	public static final String ERROR_CODE_355003 = "355003";
	/**渠道名称不能为空**/
	public static final String ERROR_CODE_355004 = "355004";
	
	
	//====================================================================================================
	//*****************************************团队主单*******************************************
	//====================================================================================================
	/**团队宾客对应多条/数据不存在**/
	public static final String ERROR_CODE_322101 = "322101";
	/**销售状态不可为空**/
	public static final String ERROR_CODE_322102 = "322102";
	/**销售员不可为空 **/
	public static final String ERROR_CODE_322103 = "322103";
	/** 名称不可为空**/
	public static final String ERROR_CODE_322104 = "322104";
	/**来期必须大于等于离期 **/
	public static final String ERROR_CODE_322105 = "322105";
	/** 修改时，账号不可为空**/
	public static final String ERROR_CODE_322106 = "322106";
	/** 版本不可为空**/
	public static final String ERROR_CODE_322107 = "322107";
	/**新增时，销售状态不可选择“完成”状态 **/
	public static final String ERROR_CODE_322108 = "322108";
	/** 团队主单对应宾客数据异常**/
	public static final String ERROR_CODE_322109 = "322109";
	/**主单预订状态必须为预订 **/
	public static final String ERROR_CODE_322110 = "322110";
	/**销售状态必须为不确定状态方可取消 **/
	public static final String ERROR_CODE_322111 = "322111";
	/**该团队成员必须全部取消才可取消主单 **/
	public static final String ERROR_CODE_322112 = "322112";
	/**团队号不存在**/
	public static final String ERROR_CODE_322113 = "322113";
	/**团队号不为RSV || STY**/
	public static final String ERROR_CODE_322114 = "322114";
	/** 存在相同账号**/
	public static final String ERROR_CODE_322115 = "322115";
	/** 存在相同房号**/
	public static final String ERROR_CODE_322116 = "322116";
	/** 账号异常**/
	public static final String ERROR_CODE_322117 = "322117";
	/** 房号异常**/
	public static final String ERROR_CODE_322118 = "322118";
	/**该报表是单店报表，管理酒店不可为空**/
	public static final String ERROR_CODE_322119 = "322119";
	/**团队主单不可做分单操作**/
	public static final String ERROR_CODE_322120 = "322120";
	/**有房号时，不能进行分单**/
	public static final String ERROR_CODE_322121 = "322121";
	/**仅预订状态可以分单**/
	public static final String ERROR_CODE_322122 = "322122";
	/**账户房数必须大于1*/
	public static final String ERROR_CODE_322123 = "322123";
	/**分单房数不可大于账户的房数。**/
	public static final String ERROR_CODE_322124 = "322124";
	/**分单房数不可为空且必须为正数**/
	public static final String ERROR_CODE_322125 = "322125";
	/**人数标识不可为空*/
	public static final String ERROR_CODE_322126 = "322126";
	/**人数不可为空且必须为正数*/
	public static final String ERROR_CODE_322127 = "322127";
	/**修改时，已经存在入住宾客，销售状态不可改回问询与不确定*/
	public static final String ERROR_CODE_322128 = "322128";
	/**释放日期必须小于等于最早来期**/
	public static final String ERROR_CODE_322129 = "322129";
	/**释放日期必须大于等于业务日期**/
	public static final String ERROR_CODE_322130 = "322130";
	/**最早来期必须大于等于业务日期**/
	public static final String ERROR_CODE_322131 = "322131";
	/**总人数不可小于分单房数**/
	public static final String ERROR_CODE_322132 = "322132";
	/**获取酒店信息异常**/
	public static final String ERROR_CODE_322133 = "322133";
	
	/**主题不可为空**/
	public static final String ERROR_CODE_314101 = "314101";
	/**类型不可为空**/
	public static final String ERROR_CODE_314102 = "314102";
	/**账户必须为在店状态*/
	public static final String ERROR_CODE_314103 = "314103";
	/**假房不可延住*/
	public static final String ERROR_CODE_314104 = "314104";
	/**钟点房不可延住 */
	public static final String ERROR_CODE_314105 = "314105";
	/**集团总管控不可删除*/
	public static final String ERROR_CODE_314106 = "314106";
	/**单位属性必须为集团*/
	public static final String ERROR_CODE_314107 = "314107";
	/**单位属性必须为管控分组*/
	public static final String ERROR_CODE_314108 = "314108";
	/**单位不可为空*/
	public static final String ERROR_CODE_314109 = "314109";
	/**管控分组上级单位为空*/
	public static final String ERROR_CODE_314110 = "314110";
	/**没有购买统一管控*/
	public static final String ERROR_CODE_314111 = "314111";
	/**没有购买单独管控*/
	public static final String ERROR_CODE_314112 = "314112";
	/**类型不可为空*/
	public static final String ERROR_CODE_314113 = "314113";
	/**字段不可为空**/
	public static final String ERROR_CODE_314114 = "314114";
	/**该会员卡不可充值**/
	public static final String ERROR_CODE_314115 = "314115";
	/**940会员充值对应科目代码异常**/
	public static final String ERROR_CODE_314116 = "314116";
	/**941会员充值赠送金额对应科目代码异常**/
	public static final String ERROR_CODE_314117 = "314117";
	/**942会员消费对应科目代码异常*/
	public static final String ERROR_CODE_314118 = "314118";
	/**闪住NoShow订单，不允许办理入住**/
	public static final String ERROR_CODE_314119 = "314119";
	public static final String ERROR_CODE_314120 = "314120";
	public static final String ERROR_CODE_314121 = "314121";
	public static final String ERROR_CODE_314122 = "314122";

	
	
	public static final String ERROR_CODE_322134 = "322134";
	public static final String ERROR_CODE_322135 = "322135";
	public static final String ERROR_CODE_322136 = "322136";
	public static final String ERROR_CODE_322137 = "322137";
	public static final String ERROR_CODE_322138 = "322138";
	public static final String ERROR_CODE_322139 = "322139";
	
	public static final String ERROR_CODE_328000 = "328000";
	public static final String ERROR_CODE_328001 = "328001";
	public static final String ERROR_CODE_328002 = "328002";
	public static final String ERROR_CODE_328003 = "328003";
	public static final String ERROR_CODE_328004 = "328004";
	public static final String ERROR_CODE_328005 = "328005";
	public static final String ERROR_CODE_328006 = "328006";
	public static final String ERROR_CODE_328007 = "328007";
	public static final String ERROR_CODE_328008 = "328008";
	public static final String ERROR_CODE_328009 = "328009";
	
	public static final String ERROR_CODE_328010 = "328010";
	public static final String ERROR_CODE_328011 = "328011";
	public static final String ERROR_CODE_328012 = "328012";
	public static final String ERROR_CODE_328013 = "328013";
	public static final String ERROR_CODE_328014 = "328014";
	public static final String ERROR_CODE_328015 = "328015";
	public static final String ERROR_CODE_328016 = "328016";
	public static final String ERROR_CODE_328017 = "328017";
	public static final String ERROR_CODE_328018 = "328018";
	public static final String ERROR_CODE_328019 = "328019";
	public static final String ERROR_CODE_328020 = "328020";
	public static final String ERROR_CODE_328021 = "328021";
	public static final String ERROR_CODE_328022 = "328022";
	public static final String ERROR_CODE_328023 = "328023";
	public static final String ERROR_CODE_328024 = "328024";
	public static final String ERROR_CODE_328025 = "328025";
	public static final String ERROR_CODE_328026 = "328026";
	public static final String ERROR_CODE_328027 = "328027";
	public static final String ERROR_CODE_328028 = "328028";
	public static final String ERROR_CODE_328029 = "328029";
	
	
	/**厂商信息为空**/
	public static final String ERROR_CODE_530001 = "530001";
	/**厂商酒店代码必填**/
	public static final String ERROR_CODE_530002 = "530002";
	/**厂商酒店酒店名称必填**/
	public static final String ERROR_CODE_530003 = "530003";
	/**厂商路由组代码必填**/
	public static final String ERROR_CODE_530004 = "530004";
	/**酒店电话号码必填**/
	public static final String ERROR_CODE_530005 = "530005";
	/**酒店地址必填**/
	public static final String ERROR_CODE_530006 = "530006";
	/**酒店邮箱必填**/
	public static final String ERROR_CODE_530007 = "530007";
	/**省份必填**/
	public static final String ERROR_CODE_530008 = "530008";
	/**城市必填**/
	public static final String ERROR_CODE_530009 = "530009";
	/**PMS 产品列表必填**/
	public static final String ERROR_CODE_530010 = "530010";
	/**厂商房型代码必填**/
	public static final String ERROR_CODE_530011 = "530011";
	/**厂商房型名称必填**/
	public static final String ERROR_CODE_530012 = "530012";
	/**厂商价格代码必填**/
	public static final String ERROR_CODE_530013 = "530013";
	/**厂商价格名称必填**/
	public static final String ERROR_CODE_530014 = "530014";
	/**现预付类型必填**/
	public static final String ERROR_CODE_530015 = "530015";
	/**早餐数必填**/
	public static final String ERROR_CODE_530016 = "530016";
	/**数据返回异常**/
	public static final String ERROR_CODE_530017 = "530017";
	/**携程子酒店ID为空**/
	public static final String ERROR_CODE_530018 = "530018";
	/**请求类型必填**/
	public static final String ERROR_CODE_530019 = "530019";
	/**不可同时请求超过5个酒店**/
	public static final String ERROR_CODE_530020 = "530020";
	/**携程子酒店代码必填**/
	public static final String ERROR_CODE_530021 = "530021";
	/**携程子房型代码必填**/
	public static final String ERROR_CODE_530022 = "530022";
	/**设置类型必填**/
	public static final String ERROR_CODE_530023 = "530023";
	/**集团 id,代理商 id 二选一**/
	public static final String ERROR_CODE_530024 = "530024";
	/**系统渠道不可为空**/
	public static final String ERROR_CODE_530025 = "530025";
	/**对应地址为空**/
	public static final String ERROR_CODE_530026 = "530026";
	/**同一产品下房型与价格不能重复**/
	public static final String ERROR_CODE_530027 = "530027";
	/**不可操作定金转入账**/
	public static final String ERROR_CODE_530028 = "530028";
	/**该方法不支持此操作类型**/
	public static final String ERROR_CODE_530029 = "530029";
	/**日期间隔不可超过31天**/
	public static final String ERROR_CODE_530030 = "530030";
	public static final String ERROR_CODE_530031 = "530031";
	public static final String ERROR_CODE_530032 = "530032";
	public static final String ERROR_CODE_530033 = "530033";
	public static final String ERROR_CODE_530034 = "530034";
	public static final String ERROR_CODE_530035 = "530035";
	public static final String ERROR_CODE_530036 = "530036";
	public static final String ERROR_CODE_530037 = "530037";
	public static final String ERROR_CODE_530038 = "530038";
	public static final String ERROR_CODE_530039 = "530039";
	public static final String ERROR_CODE_530040 = "530040";
	public static final String ERROR_CODE_530041 = "530041";
	public static final String ERROR_CODE_530042 = "530042";
	public static final String ERROR_CODE_530043 = "530043";
	public static final String ERROR_CODE_530044 = "530044";
	public static final String ERROR_CODE_530045 = "530045";
	public static final String ERROR_CODE_530046 = "530046";
	public static final String ERROR_CODE_530047 = "530047";
	public static final String ERROR_CODE_530048 = "530048";
	public static final String ERROR_CODE_530049 = "530049";
	public static final String ERROR_CODE_530050 = "530050";
	public static final String ERROR_CODE_530051 = "530051";
	public static final String ERROR_CODE_530052 = "530052";
	public static final String ERROR_CODE_530053 = "530053";
	public static final String ERROR_CODE_530054 = "530054";
	public static final String ERROR_CODE_530055 = "530055";
	public static final String ERROR_CODE_530056 = "530056";
	public static final String ERROR_CODE_530057 = "530057";
	public static final String ERROR_CODE_530058 = "530058";
	public static final String ERROR_CODE_530059 = "530059";
	public static final String ERROR_CODE_530060 = "530060";
	public static final String ERROR_CODE_530061 = "530061";
	public static final String ERROR_CODE_530062 = "530062";
	public static final String ERROR_CODE_530063 = "530063";
	public static final String ERROR_CODE_530064 = "530064";
	public static final String ERROR_CODE_530065 = "530065";
	public static final String ERROR_CODE_530066 = "530066";
	public static final String ERROR_CODE_530067 = "530067";
	public static final String ERROR_CODE_530068 = "530068";
	public static final String ERROR_CODE_530069 = "530069";
	public static final String ERROR_CODE_530070 = "530070";
	public static final String ERROR_CODE_530071 = "530071";
	public static final String ERROR_CODE_530072 = "530072";
	public static final String ERROR_CODE_530073 = "530073";
	public static final String ERROR_CODE_530074 = "530074";
	public static final String ERROR_CODE_530075 = "530075";
	public static final String ERROR_CODE_530076 = "530076";
	public static final String ERROR_CODE_530077 = "530077";
	public static final String ERROR_CODE_530078 = "530078";
	public static final String ERROR_CODE_530079 = "530079";
	public static final String ERROR_CODE_530080 = "530080";
	public static final String ERROR_CODE_530081 = "530081";
	public static final String ERROR_CODE_530082 = "530082";
	public static final String ERROR_CODE_530083 = "530083";
	public static final String ERROR_CODE_530084 = "530084";
	public static final String ERROR_CODE_530085 = "530085";
	public static final String ERROR_CODE_530086 = "530086";
	public static final String ERROR_CODE_530087 = "530087";
	public static final String ERROR_CODE_530088 = "530088";
	public static final String ERROR_CODE_530089 = "530089";
	public static final String ERROR_CODE_530090 = "530090";
	public static final String ERROR_CODE_530091 = "530091";
	public static final String ERROR_CODE_530092 = "530092";
	public static final String ERROR_CODE_530093 = "530093";
	public static final String ERROR_CODE_530094 = "530094";
	public static final String ERROR_CODE_530095 = "530095";
	public static final String ERROR_CODE_530096 = "530096";
	public static final String ERROR_CODE_530097 = "530097";
	public static final String ERROR_CODE_530098 = "530098";
	public static final String ERROR_CODE_530099 = "530099";
	public static final String ERROR_CODE_530100 = "530100";
	public static final String ERROR_CODE_530101 = "530101";
	public static final String ERROR_CODE_530102 = "530102";
	/**房态10秒内重复推送**/
	public static final String ERROR_CODE_530103 = "530103";
	/**房态推送失败**/
	public static final String ERROR_CODE_530104 = "530104";
	/**房价推送失败**/
	public static final String ERROR_CODE_530105 = "530105";
	/** 渠道日志sessionKey不可为空 **/
	public static final String ERROR_CODE_530106 = "530106";
	
	
	//*************************************************************************************************
	//====================================赫程错误代码=================================================
	//*************************************************************************************************
	/**入住时间不能早于当天时间**/
	public static final String HTNG_ERROR_1 = "HTNG_ERROR_1";
	/**此房型可用房间数不足**/
	public static final String HTNG_ERROR_2 = "HTNG_ERROR_2";
	/**此房型已关房**/
	public static final String HTNG_ERROR_3 = "HTNG_ERROR_3";
	/**此房型已满房**/
	public static final String HTNG_ERROR_4 = "HTNG_ERROR_4";
	/**此房型未配置房价**/
	public static final String HTNG_ERROR_5 = "HTNG_ERROR_5";
	/**此房型不存在**/
	public static final String HTNG_ERROR_6 = "HTNG_ERROR_6";
	/**此产品不存在**/
	public static final String HTNG_ERROR_7 = "HTNG_ERROR_7";
	/**酒店编码不存在**/
	public static final String HTNG_ERROR_8 = "HTNG_ERROR_8";
	/**预订期间价格无效 **/
	public static final String HTNG_ERROR_9 = "HTNG_ERROR_9";
	/**订单失败，不是有效的入住时间**/
	public static final String HTNG_ERROR_11 = "HTNG_ERROR_11";
	/**此订单已存在，重复下单 **/
	public static final String HTNG_ERROR_12 = "HTNG_ERROR_12";
	/**此房型可用房间数不足 **/
	public static final String HTNG_ERROR_13 = "HTNG_ERROR_13";
	/**此房型已满房 **/
	public static final String HTNG_ERROR_14 = "HTNG_ERROR_14";
	/**此房型已关房 **/
	public static final String HTNG_ERROR_15 = "HTNG_ERROR_15";
	/**超出最大预订限额 **/
	public static final String HTNG_ERROR_16 = "HTNG_ERROR_16";
	/**担保错误 **/
	public static final String HTNG_ERROR_17 = "HTNG_ERROR_17";
	/**备注信息不接受 **/
	public static final String HTNG_ERROR_18 = "HTNG_ERROR_18";
	/**订单失败，不是有效的产品**/
	public static final String HTNG_ERROR_19 = "HTNG_ERROR_19";
	/**订单失败，不是有效的入住时间**/
	public static final String HTNG_ERROR_20 = "HTNG_ERROR_20";
	/**此房型可用房间数不足**/
	public static final String HTNG_ERROR_21 = "HTNG_ERROR_21";
	/**此房型已满房**/
	public static final String HTNG_ERROR_22 = "HTNG_ERROR_22";
	/**此房型已关房**/
	public static final String HTNG_ERROR_23 = "HTNG_ERROR_23";
	/**超出最大预订限额**/
	public static final String HTNG_ERROR_24 = "HTNG_ERROR_24";
	/**担保错误**/
	public static final String HTNG_ERROR_25 = "HTNG_ERROR_25";
	/**订单失败，原订单号不存在**/
	public static final String HTNG_ERROR_26 = "HTNG_ERROR_26";
	/**此订单已取消，重复取消**/
	public static final String HTNG_ERROR_27 = "HTNG_ERROR_27";
	/**取消失败，确认号订单不存在**/
	public static final String HTNG_ERROR_28 = "HTNG_ERROR_28";
	/**取消失败，订单号订单不存在**/
	public static final String HTNG_ERROR_29 = "HTNG_ERROR_29";
	/**此订单已入住，不能取消**/
	public static final String HTNG_ERROR_30 = "HTNG_ERROR_30";
	/**此订单已离店，不能取消**/
	public static final String HTNG_ERROR_31 = "HTNG_ERROR_31";
	/**此订单 noshow，不能取消**/
	public static final String HTNG_ERROR_32 = "HTNG_ERROR_32";
	/**取消失败，订单规则为不可取消**/
	public static final String HTNG_ERROR_33 = "HTNG_ERROR_33";
	/**网络问题**/
	public static final String HTNG_ERROR_34 = "HTNG_ERROR_34";
	/**程序错误**/
	public static final String HTNG_ERROR_35 = "HTNG_ERROR_35";
	/**服务器异常**/
	public static final String HTNG_ERROR_36 = "HTNG_ERROR_36";
	/**客人已办理入住，无法更改闪住**/
	public static final String HTNG_ERROR_40 = "HTNG_ERROR_40";
	/**部分满房**/
	public static final String HTNG_ERROR_41 = "HTNG_ERROR_41";
	/**全部满房**/
	public static final String HTNG_ERROR_42 = "HTNG_ERROR_42";
	/**价格不符**/
	public static final String HTNG_ERROR_43 = "HTNG_ERROR_43";
	/**需要担保**/
	public static final String HTNG_ERROR_44 = "HTNG_ERROR_44";
	/**特殊要求无法满足**/
	public static final String HTNG_ERROR_45 = "HTNG_ERROR_45";
	/**酒店装修\停业**/
	public static final String HTNG_ERROR_46 = "HTNG_ERROR_46";
	/**重复订单**/
	public static final String HTNG_ERROR_47 = "HTNG_ERROR_47";
	/**其他原因**/
	public static final String HTNG_ERROR_48 = "HTNG_ERROR_48";
	/**订单失败，不是有效的产品 闪住 **/
	public static final String HTNG_ERROR_10 = "HTNG_ERROR_10";
	/**系统异常 **/
	public static final String HTNG_ERROR_101 = "HTNG_ERROR_101";
	/**数据异常 **/
	public static final String HTNG_ERROR_102 = "HTNG_ERROR_102";
	/**参数异常 **/
	public static final String HTNG_ERROR_103 = "HTNG_ERROR_103";
	/**子酒店数量超过请求最大数 **/
	public static final String HTNG_ERROR_104 = "HTNG_ERROR_104";
	/**EBK 账号登陆异常 **/
	public static final String HTNG_ERROR_105 = "HTNG_ERROR_105";
	/**参数有误，酒店组代码不存在**/
	public static final String HTNG_ERROR_109 = "HTNG_ERROR_109";
	/**未找到该厂商产品信息 **/
	public static final String HTNG_ERROR_1020 = "HTNG_ERROR_1020";
	/**未找到携程产品信息 **/
	public static final String HTNG_ERROR_1021 = "HTNG_ERROR_1021";
	/**该母酒店已被其他酒店绑定**/
	public static final String HTNG_ERROR_1022 = "HTNG_ERROR_1022";
	/**未找到子酒店信息 **/
	public static final String HTNG_ERROR_1023 = "HTNG_ERROR_1023";
	/**该子酒店未提交审核 **/
	public static final String HTNG_ERROR_1024 = "HTNG_ERROR_1024";
	/**该携程子房型已与其他产品匹配 **/
	public static final String HTNG_ERROR_1025 = "HTNG_ERROR_1025";
	/**未找到该厂商酒店信息 **/
	public static final String HTNG_ERROR_1026 = "HTNG_ERROR_1026";
	/**携程现预付酒店不可定 **/
	public static final String HTNG_ERROR_1027 = "HTNG_ERROR_1027";
	/**参数异常:厂商酒店代码不能为空！ **/
	public static final String HTNG_ERROR_1030 = "HTNG_ERROR_1030";
	/**参数异常:厂商房型代码不能为空！**/
	public static final String HTNG_ERROR_1031 = "HTNG_ERROR_1031";
	/**参数异常:厂商价格代码不能为空！ **/
	public static final String HTNG_ERROR_1032 = "HTNG_ERROR_1032";
	/**参数异常:携程子酒店代码不能为空！ **/
	public static final String HTNG_ERROR_1033 = "HTNG_ERROR_1033";
	/**参数异常:携程子房型代码不能为空！**/
	public static final String HTNG_ERROR_1034 = "HTNG_ERROR_1034";
	/**参数异常:未找到该 setType 类型！ **/
	public static final String HTNG_ERROR_1035 = "HTNG_ERROR_1035";
	/**参数异常:未找到该匹配 Type 类型！ **/
	public static final String HTNG_ERROR_1036 = "HTNG_ERROR_1036";
	/**请求参数不正确 **/
	public static final String HTNG_ERROR_300 = "HTNG_ERROR_300";
	/**请求参数缺失 **/
	public static final String HTNG_ERROR_301 = "HTNG_ERROR_301";
	/**不满足 Ctrip 商务条件，数据无法提供或操作 **/
	public static final String HTNG_ERROR_302 = "HTNG_ERROR_302";
	/**佣金设置失败 **/
	public static final String HTNG_ERROR_303 = "HTNG_ERROR_303";
	
	
	
	
}
