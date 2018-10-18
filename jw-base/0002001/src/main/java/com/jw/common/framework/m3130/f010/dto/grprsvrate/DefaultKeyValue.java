package com.jw.common.framework.m3130.f010.dto.grprsvrate;

import java.io.Serializable;

import org.apache.commons.collections4.keyvalue.AbstractKeyValue;

public class DefaultKeyValue<K, V> extends AbstractKeyValue<K, V> implements Serializable {

	public DefaultKeyValue(K key, V value) {
		super(key, value);
		// TODO Auto-generated constructor stub
	}

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7809505804486335933L;

}
