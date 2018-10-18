/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ## 类说明：
 * 	异常分析工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.exception
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|ExceptionUtil.java新增
 */
public class ExceptionUtil {

	//AclNotFoundException, ActivationException, AlreadyBoundException, ApplicationException, AWTException, BackingStoreException, BadAttributeValueExpException, BadBinaryOpValueExpException, BadLocationException, BadStringOperationException, BrokenBarrierException, CertificateException, CloneNotSupportedException, DataFormatException, DatatypeConfigurationException, DestroyFailedException, ExecutionException, ExpandVetoException, FontFormatException, GeneralSecurityException, GSSException, IllegalClassFormatException, InterruptedException, IntrospectionException, InvalidApplicationException, InvalidMidiDataException, InvalidPreferencesFormatException, InvalidTargetObjectTypeException, IOException, JAXBException, JMException, KeySelectorException, LastOwnerException, LineUnavailableException, MarshalException, MidiUnavailableException, MimeTypeParseException, MimeTypeParseException, NamingException, NoninvertibleTransformException, NotBoundException, NotOwnerException, ParseException, ParserConfigurationException, PrinterException, PrintException, PrivilegedActionException, PropertyVetoException, ReflectiveOperationException, RefreshFailedException, RemarshalException, RuntimeException, SAXException, ScriptException, ServerNotActiveException, SOAPException, SQLException, TimeoutException, TooManyListenersException, TransformerException, TransformException, UnmodifiableClassException, UnsupportedAudioFileException, UnsupportedCallbackException, UnsupportedFlavorException, UnsupportedLookAndFeelException, URIReferenceException, URISyntaxException, UserException, XAException, XMLParseException, XMLSignatureException, XMLStreamException, XPathException
	
	/**
	 * ## 方法说明：
	 * 	异常分析工具类
	 * @param message
	 * @return
	 */
	public static Map<String,String> tranDes(String message) {
		
		Map<String,String> map = new HashMap<String,String>();
		
		if (message.indexOf("NullPointerException")!=-1){
			map.put("空指针错误", BsProcessErrorCode.ERROR_CODE_000002);
		}else
		if (message.indexOf("NumberFormatException")!=-1){
			map.put("字符串转换为数字异常", BsProcessErrorCode.ERROR_CODE_000003);
		}else
		if (message.indexOf("BadSqlGrammarException")!=-1){
			map.put("SQL错误", BsProcessErrorCode.ERROR_CODE_000004);
		}else
		if (message.indexOf("RpcException")!=-1){
			map.put("RPC远程调用异常", BsProcessErrorCode.ERROR_CODE_000055);
		}else
		if (message.indexOf("PSQLException")!=-1 && message.indexOf("cached plan must not change result type")!=-1){
			map.put("数据库表结构变更", BsProcessErrorCode.ERROR_CODE_000059);
		}else
		if (message.indexOf("PSQLException")!=-1 && message.indexOf("permission denied")!=-1){
			map.put("当前用户pg库未授权", BsProcessErrorCode.ERROR_CODE_000060);
		}else
		if (message.indexOf("org.hibernate.PropertyValueException")!=-1){
			if (message.indexOf("not-null property references a null or transient value")!=-1){
				map.put("属性值非空字段插入了空值", BsProcessErrorCode.ERROR_CODE_000057);
			}else{
				map.put("属性值异常", BsProcessErrorCode.ERROR_CODE_000058);
			}
		}else
		if (message.indexOf("org.hibernate.StaleObjectStateException")!=-1){
			map.put("当前已不是最新版本", BsProcessErrorCode.ERROR_CODE_100000);
		}else
		if (message.indexOf("EntityValidationException")!=-1){
			map.put("Hibernate处理异常", BsProcessErrorCode.ERROR_CODE_000005);
//			if (message.indexOf("com.jw.base.framework.core.exception.EntityValidationException:") != -1) {
//				String regEx = "com.jw.base.framework.core.exception.EntityValidationException:(.*)";
//				Pattern pat = Pattern.compile(regEx);
//				Matcher mat = pat.matcher(message);
//				boolean rs = mat.find();
//				if (rs) {
//					map.put(BsProcessErrorCode.ERROR_CODE_000005, "Hibernate约束校验失败:"+mat.group(1));
//				}
//			}
		}else 
		if (message.indexOf("PessimisticLockException")!=-1){
			map.put("Hibernate悲观锁异常", BsProcessErrorCode.ERROR_CODE_000056);
		}else
		if (message.indexOf("ArithmeticExecption")!=-1){
			map.put("算术异常", BsProcessErrorCode.ERROR_CODE_000006);
		}else
		if (message.indexOf("ClassCastException")!=-1){
			map.put("类型强制转换异常", BsProcessErrorCode.ERROR_CODE_000007);
		}else
		if (message.indexOf("NegativeArrayException")!=-1){
			map.put("数组负下标异常", BsProcessErrorCode.ERROR_CODE_000008);
		}else
		if (message.indexOf("ArrayIndexOutOfBoundsException")!=-1){
			map.put("数组下标越界异常", BsProcessErrorCode.ERROR_CODE_000009);
		}else
		if (message.indexOf("SecturityException")!=-1){
			map.put("违背安全原则异常", BsProcessErrorCode.ERROR_CODE_000010);
		}else
		if (message.indexOf("EOFException")!=-1){
			map.put("文件已结束异常", BsProcessErrorCode.ERROR_CODE_000011);
		}else
		if (message.indexOf("FileNotFoundException")!=-1){
			map.put("文件未找到异常", BsProcessErrorCode.ERROR_CODE_000012);
		}else
		if (message.indexOf("SQLException")!=-1){
			map.put("操作数据库SQL异常", BsProcessErrorCode.ERROR_CODE_000013);
		}else
		if (message.indexOf("IOException")!=-1){
			map.put("输入输出异常", BsProcessErrorCode.ERROR_CODE_000014);
		}else
		if (message.indexOf("NoSuchMethodException")!=-1){
			map.put("方法未找到异常", BsProcessErrorCode.ERROR_CODE_000015);
		}else
		if (message.indexOf("AbstractMethodError")!=-1){
			map.put("抽象方法错误", BsProcessErrorCode.ERROR_CODE_000016);
		}else
		if (message.indexOf("AssertionError")!=-1){
			map.put("断言错", BsProcessErrorCode.ERROR_CODE_000017);
		}else
		if (message.indexOf("ClassCircularityError")!=-1){
			map.put("类循环依赖错误", BsProcessErrorCode.ERROR_CODE_000018);
		}else
		if (message.indexOf("ClassFormatError")!=-1){
			map.put("类格式错误", BsProcessErrorCode.ERROR_CODE_000019);
		}else
		if (message.indexOf("ExceptionInInitializerError")!=-1){
			map.put("初始化程序错误", BsProcessErrorCode.ERROR_CODE_000020);
		}else
		if (message.indexOf("IllegalAccessError")!=-1){
			map.put("违法访问错误", BsProcessErrorCode.ERROR_CODE_000021);
		}else
		if (message.indexOf("IncompatibleClassChangeError")!=-1){
			map.put("不兼容的类变化错误", BsProcessErrorCode.ERROR_CODE_000022);
		}else
		if (message.indexOf("InstantiationError")!=-1){
			map.put("实例化错误", BsProcessErrorCode.ERROR_CODE_000023);
		}else
		if (message.indexOf("InternalError")!=-1){
			map.put("内部错误", BsProcessErrorCode.ERROR_CODE_000024);
		}else
		if (message.indexOf("LinkageError")!=-1){
			map.put("链接错误", BsProcessErrorCode.ERROR_CODE_000025);
		}else
		if (message.indexOf("NoClassDefFoundError")!=-1){
			map.put("未找到类定义错误", BsProcessErrorCode.ERROR_CODE_000026);
		}else
		if (message.indexOf("NoSuchFieldError")!=-1){
			map.put("域不存在错误", BsProcessErrorCode.ERROR_CODE_000027);
		}else
		if (message.indexOf("NoSuchMethodError")!=-1){
			map.put("方法不存在错误", BsProcessErrorCode.ERROR_CODE_000028);
		}else
		if (message.indexOf("OutOfMemoryError")!=-1){
			map.put("内存不足错误", BsProcessErrorCode.ERROR_CODE_000029);
		}else
		if (message.indexOf("StackOverflowError")!=-1){
			map.put("堆栈溢出错误", BsProcessErrorCode.ERROR_CODE_000030);
		}else
		if (message.indexOf("ThreadDeath")!=-1){
			map.put("线程结束", BsProcessErrorCode.ERROR_CODE_000031);
		}else
		if (message.indexOf("UnknownError")!=-1){
			map.put("未知错误", BsProcessErrorCode.ERROR_CODE_000032);
		}else
		if (message.indexOf("UnsatisfiedLinkError")!=-1){
			map.put("未满足的链接错误", BsProcessErrorCode.ERROR_CODE_000033);
		}else
		if (message.indexOf("UnsupportedClassVersionError")!=-1){
			map.put("不支持的类版本错误", BsProcessErrorCode.ERROR_CODE_000034);
		}else
		if (message.indexOf("VerifyError")!=-1){
			map.put("验证错误", BsProcessErrorCode.ERROR_CODE_000035);
		}else
		if (message.indexOf("VirtualMachineError")!=-1){
			map.put("虚拟机错误", BsProcessErrorCode.ERROR_CODE_000036);
		}else
		if (message.indexOf("ArithmeticException")!=-1){
			map.put("算术条件异常", BsProcessErrorCode.ERROR_CODE_000037);
		}else
		if (message.indexOf("ArrayStoreException")!=-1){
			map.put("数组存储异常", BsProcessErrorCode.ERROR_CODE_000038);
		}else
		if (message.indexOf("ClassNotFoundException")!=-1){
			map.put("找不到类异常", BsProcessErrorCode.ERROR_CODE_000039);
		}else
		if (message.indexOf("CloneNotSupportedException")!=-1){
			map.put("不支持克隆异常", BsProcessErrorCode.ERROR_CODE_000040);
		}else
		if (message.indexOf("EnumConstantNotPresentException")!=-1){
			map.put("枚举常量不存在异常", BsProcessErrorCode.ERROR_CODE_000041);
		}else
		if (message.indexOf("IllegalAccessException")!=-1){
			map.put("违法的访问异常", BsProcessErrorCode.ERROR_CODE_000042);
		}else
		if (message.indexOf("IllegalMonitorStateException")!=-1){
			map.put("违法的监控状态异常", BsProcessErrorCode.ERROR_CODE_000043);
		}else
		if (message.indexOf("IllegalStateException")!=-1){
			map.put("违法的状态异常", BsProcessErrorCode.ERROR_CODE_000044);
		}else
		if (message.indexOf("IllegalThreadStateException")!=-1){
			map.put("违法的线程状态异常", BsProcessErrorCode.ERROR_CODE_000045);
		}else
		if (message.indexOf("StringIndexOutOfBoundsException")!=-1){
			map.put("字符串索引越界异常", BsProcessErrorCode.ERROR_CODE_000053);
		}else
		if (message.indexOf("IndexOutOfBoundsException")!=-1){
			map.put("索引越界异常", BsProcessErrorCode.ERROR_CODE_000046);
		}else
		if (message.indexOf("InstantiationException")!=-1){
			map.put("实例化异常", BsProcessErrorCode.ERROR_CODE_000047);
		}else
		if (message.indexOf("InterruptedException")!=-1){
			map.put("被中止异常", BsProcessErrorCode.ERROR_CODE_000048);
		}else
		if (message.indexOf("NegativeArraySizeException")!=-1){
			map.put("数组大小为负值异常", BsProcessErrorCode.ERROR_CODE_000049);
		}else
		if (message.indexOf("NoSuchFieldException")!=-1){
			map.put("属性不存在异常", BsProcessErrorCode.ERROR_CODE_000050);
		}else
		if (message.indexOf("RuntimeException")!=-1){
			map.put("运行时异常", BsProcessErrorCode.ERROR_CODE_000051);
		}else
		if (message.indexOf("SecurityException")!=-1){
			map.put("安全异常", BsProcessErrorCode.ERROR_CODE_000052);
		}else
		if (message.indexOf("TypeNotPresentException")!=-1){
			map.put("类型不存在异常", BsProcessErrorCode.ERROR_CODE_000054);
		}else
		{
			map.put("未知异常", BsProcessErrorCode.ERROR_CODE_000001);
		}
		
		return map;
	}
	
}
