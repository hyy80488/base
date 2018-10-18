package com.jw.base.framework.core.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Objects;

public class FileUploadUtil {
	/** 
	 * ## 方法说明：
	 * 	上传数据
	 * @param postUrl url
	 * @param BOUNDARY 分隔符
	 * @param param 参数
	 * @param len 参数长度
	 * @return
	 * @throws Exception
	*/
	public static String upload(String postUrl, String BOUNDARY, List<List<byte[]>> param, Long paramLen) throws Exception {
		// http请求结尾
		byte[] end_data = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();
		// java的http相关类库，建 立http链接
		URL url = null;
		HttpURLConnection connection = null;
		// 发送参数
		DataOutputStream out = null;
		try {
			url = new URL(postUrl);  //上传文件处理服务地址
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setRequestMethod("POST");     //使用post发送
			connection.setRequestProperty("Content-Type",
					"multipart/form-data; boundary=" + BOUNDARY);
			connection.setRequestProperty("Content-Length", String
					.valueOf(paramLen + end_data.length*2)); //计算报文长度
			connection.setUseCaches(false);
			connection.connect();
			// 发送参数
			out = new DataOutputStream(connection
					.getOutputStream());
			for (List<byte[]> lst : param) {
				for (byte[] bs : lst) {
					out.write(bs);  
				}
				out.write(end_data);
			}
			//正常响应
			if (connection.getResponseCode() == 200) {
				InputStream u = connection.getInputStream();// 获取http连接的返回内容
				BufferedReader in = new BufferedReader(new InputStreamReader(u));
				StringBuffer buffer = new StringBuffer();
				String line = "";
				while ((line = in.readLine()) != null) {
					buffer.append(line);
				}
				return buffer.toString();
			} else {
				//连接不成功 返回 --999--
				return String.valueOf(connection.getResponseCode());
			}
		} catch (Exception e) {
			 e.printStackTrace();
			 return "--000--";
		}finally{
			//回收
			if(Objects.nonNull(out)){
				out.flush();
				out.close();
			}
			//释放连接
			if(Objects.nonNull(connection)){
				connection.disconnect();
			}
		}
	}
}
