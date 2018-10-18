package com.jw.base.framework.core.spark;

import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.context.ApplicationContext;

public interface SparkIgniteService {
	public JavaSparkContext getSparkContext();
	
	public ApplicationContext getSpringContext();
}
