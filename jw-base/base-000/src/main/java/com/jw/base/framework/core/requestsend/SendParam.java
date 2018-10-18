package com.jw.base.framework.core.requestsend;

public class SendParam<T> {
	private String key;
	private String url;
	private T body;
	public String getKey() {
		return key;
	}
	public String getUrl() {
		return url;
	}
	public T getBody() {
		return body;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setBody(T body) {
		this.body = body;
	}
	public SendParam(String url,T body) {
		super();
		this.url = url;
		this.body = body;
	}
	public SendParam(String key, String url,T body) {
		super();
		this.key = key;
		this.url = url;
		this.body = body;
	}
}
