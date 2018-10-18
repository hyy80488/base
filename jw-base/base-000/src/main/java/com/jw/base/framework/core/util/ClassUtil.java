package com.jw.base.framework.core.util;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassUtil {

	private static final Logger log = LoggerFactory.getLogger(ClassUtil.class);

	/*获取类加载器*/
	public static ClassLoader getClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}

	/*加载类*/
	public static Class<?> loadClass(String className, boolean isInitail) {
		Class<?> cls = null;
		try {
			cls = Class.forName(className, isInitail, getClassLoader());
		} catch (ClassNotFoundException e) {
			log.error("can't find class" + className);
			throw new RuntimeException(e);
		}
		return cls;
	}

	/*加载文件夹的类*/
	private static void addClass(Set<Class<?>> classSet, String packagePath, String packageName) {
		File[] files = new File(packagePath).listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				//获取以.class后缀的文件,以及所有的文件目录
				return (file.isFile() && file.getName().endsWith(".class")) || file.isDirectory();
			}
		});

		for (File file : files) {
			String fileName = file.getName();
			if (file.isFile()) {
				//以.class结尾的类文件
				String className = fileName.substring(0, fileName.lastIndexOf("."));
				if (StringUtils.isNotEmpty(className)) {
					className = packageName + "." + className;
				}
				//加载类
				doAddClass(classSet, className);
				log.info(className);
			} else {
				String subPackagePath = fileName;
				//获取子路径
				if (StringUtils.isNotEmpty(subPackagePath)) {
					subPackagePath = packagePath + "/" + subPackagePath;
				}
				//获取子包名
				String subPackageName = fileName;
				if (StringUtils.isNotEmpty(subPackageName)) {
					subPackageName = subPackageName + "." + subPackageName;

				}
				//递归加载子目录下的类
				addClass(classSet, subPackagePath, subPackageName);
			}

		}

	}

	private static void doAddClass(Set<Class<?>> classSet, String className) {
		//log.info(className);
		Class<?> cls = loadClass(className, false);
		classSet.add(cls);
	}

	public static Set<Class<?>> getClassSet(String packageName) {
		Set<Class<?>> classSet = new HashSet<Class<?>>();
		try {
			Enumeration<URL> urls = getClassLoader().getResources(packageName.replace(".", "/"));
			while (urls.hasMoreElements()) {
				URL url = urls.nextElement();
				if (null != url) {
					String protocol = url.getProtocol();
					if (protocol.equals("file")) {
						//开发环境jetty启动的时候，会加载target_class下的东东
						String packagePath = url.getPath().replaceAll("%20", " "); //替换所有的%20为空格
						addClass(classSet, packagePath, packageName); //加载文件夹,以及文件夹下面的类
					} else if (protocol.equals("jar")) {
						//解压jar包然后获取entry
						//entry格式如下org/apache/commons/lang3/time/FormatCache$MultipartKey.class 
						JarURLConnection jarURLConnection = (JarURLConnection) url.openConnection();
						if (null != jarURLConnection) {
							JarFile jarFile = jarURLConnection.getJarFile();
							if (null != jarFile) {
								Enumeration<JarEntry> jarEntries = jarFile.entries(); //获取所有的entry
								while (jarEntries.hasMoreElements()) {
									JarEntry jarEntry = jarEntries.nextElement();
									String jarEntryName = jarEntry.getName();
									if (jarEntryName.endsWith(".class")) { //是否是类,是类进行加载
//										System.out.println(jarEntryName);
										String className = jarEntryName.substring(0, jarEntryName.lastIndexOf(".")).replaceAll("/", ".");
										doAddClass(classSet, className);
									}
								}
							}
						}
					}

				}
			}
		} catch (Exception e) {
			log.error("get class set fail", e);
			throw new RuntimeException(e);
		}
		return classSet;
	}
	
	/* 只load jar包的类，file的暂不load */
	public static Set<Class<?>> getClassSetForInit(String packageName) {
		Set<Class<?>> classSet = new HashSet<Class<?>>();
		try {
			Enumeration<URL> urls = getClassLoader().getResources(packageName.replace(".", "/"));
			while (urls.hasMoreElements()) {
				URL url = urls.nextElement();
				if (null != url) {
					String protocol = url.getProtocol();
					//只加载jar包内的
					if (protocol.equals("jar")) {
						//解压jar包然后获取entry
						//entry格式如下org/apache/commons/lang3/time/FormatCache$MultipartKey.class 
						JarURLConnection jarURLConnection = (JarURLConnection) url.openConnection();
						if (null != jarURLConnection) {
							JarFile jarFile = jarURLConnection.getJarFile();
							if (null != jarFile) {
								Enumeration<JarEntry> jarEntries = jarFile.entries(); //获取所有的entry
								while (jarEntries.hasMoreElements()) {
									JarEntry jarEntry = jarEntries.nextElement();
									String jarEntryName = jarEntry.getName();
									if (jarEntryName.endsWith(".class") && !jarEntryName.contains("net/sf/jasperreports")) { //是否是类,是类进行加载
//										System.out.println(jarEntryName);
										String className = jarEntryName.substring(0, jarEntryName.lastIndexOf(".")).replaceAll("/", ".");
										doAddClass(classSet, className);
									}
								}
							}
						}
					}

				}
			}
		} catch (Exception e) {
			log.error("get class set fail", e);
			throw new RuntimeException(e);
		}
		return classSet;
	}

	//得到当前Field的子泛型
	public static Type getSubGenericType(Field field){
		Type fc = field.getGenericType();
		//ParameterizedType是一个接口,这个类可以用来检验泛型是否被参数化
		if(null!=fc && fc instanceof ParameterizedType){
			ParameterizedType pt = (ParameterizedType) fc;
			if(null != pt && null!=pt.getActualTypeArguments() && pt.getActualTypeArguments().length>0 && null!=pt.getActualTypeArguments()[0]){
				Type typeChild = pt.getActualTypeArguments()[0];
				return typeChild;
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		getClassSet("org.apache.commons");
		log.info("1");
	}

}
