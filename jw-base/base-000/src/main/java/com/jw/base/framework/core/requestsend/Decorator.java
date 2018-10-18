package com.jw.base.framework.core.requestsend;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class Decorator<T>  extends SendParam<T>  implements Request {

	public Request req;
	
	public Decorator(String url, T body,Request req) {
		super(url, body);
		this.req = req;
	}
	public Decorator(String key, String url, T body,Request req) {
		super(key,url, body);
		this.req = req;
	}
	
	@Override
	public Object request(Map<String, String> head, Function<String, Map<String, String>> fnc,
			BiConsumer<String, Map<String, String>> bcn) throws Exception {
		return null;
	}

	@Override
	public Object request(Map<String, String> head) throws Exception {
		
		return null;
	}
}
