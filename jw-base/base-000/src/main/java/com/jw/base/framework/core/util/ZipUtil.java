/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;
import org.apache.tools.zip.ZipOutputStream;

/**
 * ## 类说明：
 * 	压缩和解压缩工具类
 * 由于直接使用java.util.zip工具包下的类，会出现中文乱码问题，所以使用ant.jar中的org.apache.tools.zip下的工具类
 * @author    [liubowen]   
 * @version   [1.0, 2017/08/10]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|ZipUtil.java新增
 */
public class ZipUtil {
    private static byte[] _byte = new byte[1024] ;
   
    
    /**
     * 压缩文件或路径
     * @param zip 压缩的目的地址
     * @param srcFiles 压缩的源文件
     */
	public static void zipFile(String zip, List<File> srcFiles) {
		try {
			if (zip.endsWith(".zip") || zip.endsWith(".ZIP")) {
				ZipOutputStream _zipOut = new ZipOutputStream(new FileOutputStream(new File(zip)));
				_zipOut.setEncoding("GBK");
				for (File _f : srcFiles) {
					handlerFile(zip, _zipOut, _f, "");
				}
				_zipOut.close();
			} else {
				System.out.println("target file[" + zip + "] is not .zip type file");
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
    /**
     * 
     * @param zip 压缩的目的地址
     * @param zipOut 
     * @param srcFile  被压缩的文件信息
     * @param path  在zip中的相对路径
     * @throws IOException
     */
	private static void handlerFile(String zip, ZipOutputStream zipOut, File srcFile, String path) throws IOException {
//		System.out.println(" begin to compression file[" + srcFile.getName() + "]");
		if (!"".equals(path) && !path.endsWith(File.separator)) {
			path += File.separator;
		}
		if (!srcFile.getPath().equals(zip)) {
			if (srcFile.isDirectory()) {
				File[] _files = srcFile.listFiles();
				if (_files.length == 0) {
					zipOut.putNextEntry(new ZipEntry(path + srcFile.getName() + File.separator));
					zipOut.closeEntry();
				} else {
					for (File _f : _files) {
						handlerFile(zip, zipOut, _f, path + srcFile.getName());
					}
				}
			} else {
				InputStream _in = new FileInputStream(srcFile);
				zipOut.putNextEntry(new ZipEntry(path + srcFile.getName()));
				int len = 0;
				while ((len = _in.read(_byte)) > 0) {
					zipOut.write(_byte, 0, len);
				}
				_in.close();
				zipOut.closeEntry();
			}
		}
	}

    /**
     * 解压缩ZIP文件，将ZIP文件里的内容解压到targetDIR目录下
     * @param zipName 待解压缩的ZIP文件名
     * @param targetBaseDirName  目标目录
     */
	public static List<File> upzipFile(String zipPath, String descDir) {
		return upzipFile(new File(zipPath), descDir);
	}
    
    /**
     * 对.zip文件进行解压缩
     * @param zipFile  解压缩文件
     * @param descDir  压缩的目标地址，如：D:\\测试 或 /mnt/d/测试
     * @return
     */
	public static List<File> upzipFile(File zipFile, String descDir) {
		List<File> _list = new ArrayList<File>();
		try {
			ZipFile _zipFile = new ZipFile(zipFile, "GBK");
			for (Enumeration entries = _zipFile.getEntries(); entries.hasMoreElements();) {
				ZipEntry entry = (ZipEntry) entries.nextElement();
				File _file = new File(descDir + File.separator + entry.getName());
				if (entry.isDirectory()) {
					_file.mkdirs();
				} else {
					File _parent = _file.getParentFile();
					if (!_parent.exists()) {
						_parent.mkdirs();
					}
					InputStream _in = _zipFile.getInputStream(entry);
					OutputStream _out = new FileOutputStream(_file);
					int len = 0;
					while ((len = _in.read(_byte)) > 0) {
						_out.write(_byte, 0, len);
					}
					_in.close();
					_out.flush();
					_out.close();
					_list.add(_file);
				}
			}
		} catch (IOException e) {
		}
		return _list;
	}
	/**
	 * 
	 * ## 方法说明：
	 * 	解压文件到指定路径
	 * @param zipFile
	 * @param descDir
	 * @return
	 */
	public static List<File> upzipFileNoPath(File zipFile, String descDir) {
		List<File> _list = new ArrayList<File>();
		try {
			ZipFile _zipFile = new ZipFile(zipFile, "GBK");
			for (Enumeration entries = _zipFile.getEntries(); entries.hasMoreElements();) {
				ZipEntry entry = (ZipEntry) entries.nextElement();
				if(entry.isDirectory()){
					continue;
				}
				File _file = new File(descDir + File.separator + entry.getName());
				if(!_file.exists()){
					_file.createNewFile();
				}
		        String name= entry.getName();
		        String[] names = null;
		        if(StringUtil.isNotEmpty(name)){
		        	if("\\".equals(File.separator)){
		        		names = name.split("\\\\");
		        	}else{
		        		names = name.split("/");
		        	}
		        	name = names[names.length-1];
		        }
				
				InputStream _in = _zipFile.getInputStream(entry);
				OutputStream _out = new FileOutputStream(_file);
				int len = 0;
				while ((len = _in.read(_byte)) > 0) {
					_out.write(_byte, 0, len);
				}
				_in.close();
				_out.flush();
				_out.close();
				_list.add(_file);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return _list;
	}
	/**
	 * 解压缩ZIP文件，将ZIP文件里的内容解压
	 * @param zipName 待解压缩的ZIP文件名
	 */
	public static List<Map<String,Object>> upzipFile(String zipPath) {
		return upzipFile(new File(zipPath));
	}
	
	/**
	 * 对.zip文件进行解压缩  暂时不能用
	 * @param zipFile  解压缩文件 
	 * @return
	 */
	public static List<Map<String,Object>> upzipFile(File zipFile) {
		
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
		try {
			ZipFile _zipFile = new ZipFile(zipFile, "GBK");
			for (Enumeration entries = _zipFile.getEntries(); entries.hasMoreElements();) {
				ZipEntry entry = (ZipEntry) entries.nextElement();
				if(entry.isDirectory()){
					continue;
				}
				Map<String,Object> map = new HashMap<String,Object>();
				byte[] _bytes = new byte[(int) entry.getSize()];
				InputStream _in = _zipFile.getInputStream(entry);
				_in.read(_bytes);
				
		       
		        String name= entry.getName();
		        String[] names = null;
		        if(StringUtil.isNotEmpty(name)){
		        	if("\\".equals(File.separator)){
		        		names = name.split("\\\\");
		        	}else{
		        		names = name.split("/");
		        	}
		        	name = names[names.length-1];
		        }
//		        byte[] b = new byte[3];
//		        _in.read(b, 0, b.length);
//		        _in.close();
//		        String xxx = bytesToHexString(b);
//		        xxx = xxx.toUpperCase();
//		        String ooo = checkType(xxx);
		        String[] ext  = name.split("\\.");
		        String ooo = ext[ext.length-1];
				map.put("fileLength", entry.getSize());
				map.put("fileName", name);
				map.put("fileExt", ooo);
				map.put("bytes", _bytes);
				result.add(map);
			}
		} catch (IOException e) {
		}
		return result;
	}
	/**
	 * 对.zip文件进行解压缩 暂时不能用
	 * @param zipFile  解压缩文件
	 * @return
	 */
	public static List<Map<String,Object>> upzipFile1(File zipFile) {
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
		try {
			ZipFile _zipFile = new ZipFile(zipFile, "GBK");
			for (Enumeration entries = _zipFile.getEntries(); entries.hasMoreElements();) {
				ZipEntry entry = (ZipEntry) entries.nextElement();
				if(entry.isDirectory()){
					continue;
				}
				Map<String,Object> map = new HashMap<String,Object>();
				InputStream _in = _zipFile.getInputStream(entry);
				
				
				String name= entry.getName();
				String[] names = null;
				if(StringUtil.isNotEmpty(name)){
					if("\\".equals(File.separator)){
						names = name.split("\\\\");
					}else{
						names = name.split("/");
					}
					name = names[names.length-1];
				}
				String[] ext  = name.split("\\.");
				String ooo = ext[ext.length-1];
				map.put("fileLength", entry.getSize());
				map.put("fileName", name);
				map.put("fileExt", ooo);
				map.put("inputStream", _in);
				result.add(map);
			}
		} catch (IOException e) {
		}
		return result;
	}
    
    /**
     * 对临时生成的文件夹和文件夹下的文件进行删除
     */
	public static void deletefile(String delpath) {
		try {
			File file = new File(delpath);
			if(!file.exists()){
				return ;
			}
			if (!file.isDirectory()) {
				file.delete();
			} else if (file.isDirectory()) {
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File delfile = new File(delpath + File.separator + filelist[i]);
					if (!delfile.isDirectory()) {
						delfile.delete();
					} else if (delfile.isDirectory()) {
						deletefile(delpath + File.separator + filelist[i]);
					}
				}
				file.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
	
        	
    
}



