/**   
* @Title: RequestUrlUtil.java 
* @Package com.jw.hms.cmm.m3160.f010.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2017年12月20日 下午2:28:23 
* @version V1.0   
*/
package com.jw.base.framework.core.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2017年12月20日]
 * @package com.jw.base.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2017年12月20日|bwliu|新增|RequestUrlUtil.java新增
*/

/**
 * 总结：a:) HttpURLConnection的connect()函数，实际上只是建立了一个与服务器的tcp连接，并没有实际发送http请求。 无论是post还是get，http请求实际上直到HttpURLConnection的getInputStream()这个函数里面才正式发送出去。 
       b:) 在用POST方式发送URL请求时，URL请求参数的设定顺序是重中之重， 对connection对象的一切配置（那一堆set函数） 都必须要在connect()函数执行之前完成。而对outputStream的写操作，又必须要在inputStream的读操作之前。 这些顺序实际上是由http请求的格式决定的。 如果inputStream读操作在outputStream的写操作之前，会抛出例外： 
           java.net.ProtocolException: Cannot write output after reading input....... 
       c:) http请求实际上由两部分组成， 一个是http头，所有关于此次http请求的配置都在http头里面定义， 一个是正文content。 connect()函数会根据HttpURLConnection对象的配置值生成http头部信息，因此在调用connect函数之前， 就必须把所有的配置准备好。 
       d:) 在http头后面紧跟着的是http请求的正文，正文的内容是通过outputStream流写入的， 实际上outputStream不是一个网络流，充其量是个字符串流，往里面写入的东西不会立即发送到网络， 而是存在于内存缓冲区中，待outputStream流关闭时，根据输入的内容生成http正文。 至此，http请求的东西已经全部准备就绪。在getInputStream()函数调用的时候，就会把准备好的http请求 正式发送到服务器了，然后返回一个输入流，用于读取服务器对于此次http请求的返回信息。由于http 请求在getInputStream的时候已经发送出去了（包括http头和正文），因此在getInputStream()函数 之后对connection对象进行设置（对http头的信息进行修改）或者写入outputStream（对正文进行修改） 都是没有意义的了，执行这些操作会导致异常的发生。 
 */
public class RequestUrlUtil {

	private static final Logger logger = LoggerFactory.getLogger(RequestUrlUtil.class);

	/**
	 * 向指定URL发送GET方法的请求
	 * @param url 发送请求的URL
	 * @return URL 所代表远程资源的响应结果
	 */
	public static String sendGet(String url, Map<String, String> param, Map<String, String> requestProperty) {
		long nowtime = System.currentTimeMillis();
		logger.info("LOGTIME:["+nowtime+","+DateUtil.formatDate(new Date(nowtime), DateUtil.DATE_TIME_FORMAT)+"],"
				  + "COSTTIME:[0ms],CLASS:[RequestUrlUtil],METHOD:[sendGet],"
				  + "TRACERID:[],TRACERIDVERSION:[],PARAMS:["+FastJsonUtil.toJSONStringSerializer(requestProperty)+"],"
				  + "URL:["+url+"],USERCD:[],MESSAGE:[sendGet："+FastJsonUtil.toJSONStringSerializer(param)+"]");
		String result = "";
		BufferedReader in = null;
		HttpURLConnection connection = null;
		try {
			StringBuffer urlNameString = new StringBuffer();
			urlNameString.append(url);
			int num = 1;
			for (Map.Entry<String, String> mparam : param.entrySet()){
				if (num == 1){
					urlNameString.append("?" + mparam.getKey() + "=" + mparam.getValue());
				}else{
					urlNameString.append("&" + mparam.getKey() + "=" + mparam.getValue());
				}
				num ++;
			}
			URL realUrl = new URL(urlNameString.toString());
			// 打开和URL之间的连接
			connection = (HttpURLConnection)realUrl.openConnection();
			// 设置通用的请求属性
//			connection.setRequestProperty("accept", "*/*");
//			connection.setRequestProperty("connection", "Keep-Alive");
//			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			for (Map.Entry<String, String> mProperty : requestProperty.entrySet()){
				connection.setRequestProperty(mProperty.getKey(), mProperty.getValue());
			}
			connection.setRequestMethod("GET");
			connection.setReadTimeout(600000);
			connection.setConnectTimeout(600000);
			// 建立实际的连接
			connection.connect();
			// 定义 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
				if (connection != null) {
					connection.disconnect();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 向指定 URL 发送POST方法的请求
	 * @param url 发送请求的 URL
	 * @return 所代表远程资源的响应结果
	 */
	public static String sendPost(String url, String json, Map<String, String> requestProperty) {
		long nowtime = System.currentTimeMillis();
		logger.info("LOGTIME:["+nowtime+","+DateUtil.formatDate(new Date(nowtime), DateUtil.DATE_TIME_FORMAT)+"],"
				  + "COSTTIME:[0ms],CLASS:[RequestUrlUtil],METHOD:[sendPost],"
				  + "TRACERID:[],TRACERIDVERSION:[],PARAMS:["+FastJsonUtil.toJSONStringSerializer(requestProperty)+"],"
				  + "URL:["+url+"],USERCD:[],MESSAGE:[sendPost："+json+"]");
		
		PrintWriter out = null;
		BufferedReader in = null;
		HttpURLConnection conn = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			conn = (HttpURLConnection)realUrl.openConnection();
			// 设置通用的请求属性
			for (Map.Entry<String, String> mProperty : requestProperty.entrySet()){
				conn.setRequestProperty(mProperty.getKey(), mProperty.getValue());
			}
			// 设置是否向httpUrlConnection输出，因为这个是post请求，参数要放在http正文内，因此需要设为true, 默认情况下是false;
			conn.setDoOutput(true);
			// 设置是否从httpUrlConnection读入，默认情况下是true;
			conn.setDoInput(true);
			// Post 请求不能使用缓存
			conn.setUseCaches(false);
			// 设定传送的内容类型是可序列化的java对象   
			// (如果不设此项,在传送序列化对象时,当WEB服务默认的不是这种类型时可能抛java.io.EOFException)   
			// conn.setRequestProperty("Content-type", "application/x-java-serialized-object"); 
			// 设定请求的方法为"POST"，默认是GET   
			conn.setRequestMethod("POST");
			// HttpURLConnection是基于HTTP协议的，其底层通过socket通信实现。如果不设置超时（timeout），在网络异常的情况下，可能会导致程序僵死而不继续往下执行。可以通过以下两个语句来设置相应的超时： 
			// 设置从主机读取数据超时（单位：毫秒） 
			conn.setReadTimeout(600000);
			// 设置连接主机超时（单位：毫秒）
			conn.setConnectTimeout(600000);
			// 获取URLConnection对象对应的输出流
			// 此处getOutputStream会隐含的进行connect(即：如同调用上面的connect()方法，所以在开发中不调用上述的connect()也可以)
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(json);
			// flush输出流的缓冲
			out.flush();
			int responseCode = conn.getResponseCode();
			if (responseCode == 200) {
				// 定义BufferedReader输入流来读取URL的响应
				// 调用HttpURLConnection连接对象的getInputStream()函数，将内存缓冲区中封装好的完整的HTTP请求电文发送到服务端。
				// 注意，实际发送请求的代码段就在这里
				in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line;
				while ((line = in.readLine()) != null) {
					result += line;
				}
			}else{
				logger.error("HttpURLConnection请求异常，responseCode："+responseCode);
			}
		} catch (Exception e) {
			System.out.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
				if (conn != null) {
					conn.disconnect();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	
}
