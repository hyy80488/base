package com.jw.base.framework.core.requestsend;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

public interface Request {
	public Object request(Map<String, String> head,Function<String,Map<String, String>> fnc,BiConsumer<String, Map<String, String>> bcn) throws Exception;
	public Object request(Map<String, String> head) throws Exception;
}
