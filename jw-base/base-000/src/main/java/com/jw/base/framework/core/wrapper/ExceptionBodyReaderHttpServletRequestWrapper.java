package com.jw.base.framework.core.wrapper;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

//request.getInputStream()与request.getReader()
//只能调用一次，因为是流，读取完就没了
//重写HttpServletRequestWrapper，自己实现一个Wrapper
public class ExceptionBodyReaderHttpServletRequestWrapper extends HttpServletRequestWrapper {

	private byte[] body;

	public ExceptionBodyReaderHttpServletRequestWrapper(HttpServletRequest request) throws IOException {
		super(request);
		//缓存请求body  
		//body = StreamUtils.copyToByteArray(request.getInputStream());
		body = HttpHelper.getBodyString(request).getBytes(Charset.forName("UTF-8"));
	}

	@Override
	public BufferedReader getReader() throws IOException {
		return new BufferedReader(new InputStreamReader(getInputStream()));
	}

	@Override
	public ServletInputStream getInputStream() throws IOException {

		if(body == null){  
			body= new byte[0];  
        }
		
		final ByteArrayInputStream bais = new ByteArrayInputStream(body);

		return new ServletInputStream() {

			@Override
			public int read() throws IOException {
				return bais.read();
			}

			@Override
			public boolean isFinished() {
				return false;
			}

			@Override
			public boolean isReady() {
				return false;
			}

			@Override
			public void setReadListener(ReadListener readListener) {

			}
		};
	}

}
