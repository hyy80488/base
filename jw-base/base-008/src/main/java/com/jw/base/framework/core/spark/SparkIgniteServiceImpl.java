package com.jw.base.framework.core.spark;

import org.apache.ignite.Ignite;
import org.apache.ignite.resources.IgniteInstanceResource;
import org.apache.ignite.services.Service;
import org.apache.ignite.services.ServiceContext;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.context.ApplicationContext;

/**
 * 独立模式 全局一个 保证sparkContext上下文一直
 */
public class SparkIgniteServiceImpl implements SparkIgniteService, Service {

	private static final long serialVersionUID = 1188136202518338360L;

	@IgniteInstanceResource
	private Ignite ignite;

	private String master = "local";

	private String appName = "imagesearch";

	private Integer batchinteval = 100;

	public void setBatchinteval(Integer batchinteval) {
		this.batchinteval = batchinteval;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	@Override
	public void cancel(ServiceContext ctx) {
	}

	@Override
	public void init(ServiceContext ctx) throws Exception {
		System.setProperty("hadoop.home.dir", "hdfs://Master.Hadoop:9000/inputfile");
		System.out.println(System.getenv("HADOOP_HOME"));
		System.out.println("########################ignite Spark 服务启动 #########################");
	}

	@Override
	public void execute(ServiceContext ctx) throws Exception {
	}

	@Override
	public JavaSparkContext getSparkContext() {
		//		 SparkConf conf = new SparkConf().setAppName(appName).setMaster(master);
		//		 //另外一些环境变量的添加
		//		 conf.set("spark.serializer","org.apache.spark.serializer.KryoSerializer");
		//		 //.set("spark.executor.memory", "1g")
		//		 //.set("spark.executor.memory", "128m")
		//       //.set("spark.cores.max", "1")
		//       //.set("spark.default.parallelism", "3");
		//		 return  new JavaSparkContext(conf);
		return (JavaSparkContext) SpringContextHolder.getApplicationContext().getBean("sparkContext");
	}

	@Override
	public ApplicationContext getSpringContext() {
		return SpringContextHolder.getApplicationContext();
	}

}
