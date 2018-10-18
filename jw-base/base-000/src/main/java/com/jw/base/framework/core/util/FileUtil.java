/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * ## 类说明：
 * 	文件工具类
 * @author    [liubowen]   
 * @version   [1.0, 2016/11/26]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016/11/26|liubowen|新增|FileUtil.java新增
 */
public class FileUtil {
	
	private static Log logger=LogFactory.getLog(FileUtil.class);
	private static final int BUFFER_SIZE = 16 * 1024;
	
	/**
	 * ## 方法说明：
	 * 	把数据写至文件中
	 * @param filePath 文件路径+文件
	 * @param data 数据
	 */
	public static void writeFile(String filePath, String data){
		FileOutputStream fos = null;
		OutputStreamWriter writer=null;
		try {
			fos = new FileOutputStream(new File(filePath));
			writer=new OutputStreamWriter(fos, "UTF-8");			
			writer.write(data);
		} catch (Exception ex) {
			logger.error(ex, ex.fillInStackTrace());
		} finally {
			try {
				if(writer!=null){
					writer.close();
				}
				if (fos != null){
					fos.close();
				}
			} catch (Exception e) {
			}
		}		
	}
	
	public static void writeFile(String fileURI, byte[] bfile) {
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;
		File file = null;
		try {
			file = new File(fileURI);
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			bos.write(bfile);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * ## 方法说明：
	 * 	读取文件内容
	 * @param filePath 文件路径+文件
	 * @return
	 */
	public static String readFile(String filePath) {
		StringBuffer buffer = new StringBuffer();
		// 读出这个文件的内容
		try {
			File file = new File(filePath);
			FileInputStream fis = null;
			BufferedReader breader = null;
			try {
				fis = new FileInputStream(file);
				InputStreamReader isReader = new InputStreamReader(fis, "UTF-8");
				breader = new BufferedReader(isReader);
				String line;
				while ((line = breader.readLine()) != null) {
					buffer.append(line);
					buffer.append("\r\n");
				}
				breader.close();
				isReader.close();
				fis.close();
			} catch (FileNotFoundException e) {
				logger.error(e.getMessage());
				return null;
			} catch (IOException e) {
				logger.error(e, e.fillInStackTrace());
				return null;
			}
		} catch (Exception e) {
			logger.error(e, e.fillInStackTrace());
			return null;
		}
		return buffer.toString();
	}
	
	/**
	 * ## 方法说明：
	 * 	复制文件
	 * @param src 原文件
	 * @param dst 目标文件
	 */
	public static void copyFile(File src, File dst) {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(src), BUFFER_SIZE);
			out = new BufferedOutputStream(new FileOutputStream(dst), BUFFER_SIZE);
			byte[] buffer = new byte[BUFFER_SIZE];
			int len = 0;
			while ((len = in.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != in) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != out) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * ## 方法说明：
	 * 	获取文件名的前缀
	 * @param fileName 文件名称
	 * @return
	 */
	public static String getFilePrefix(String fileName) {
		int splitIndex = fileName.lastIndexOf(".");
		if (splitIndex == -1) {
			return "";
		} else {
			return fileName.substring(0, splitIndex);
		}
	}
	
	/**
	 * ## 方法说明：
	 * 	获取文件名的后缀
	 * @param fileName 文件名称
	 * @return
	 */
	public static String getFileSufix(String fileName) {
		int splitIndex = fileName.lastIndexOf(".");
		if (splitIndex == -1) {
			return "";
		} else {
			return fileName.substring(splitIndex + 1);
		}
	}
	
	/**
	 * ## 方法说明：
	 * 	删除文件
	 * @param fileName 文件路径+文件
	 * @return
	 */
	public static void deleteFile(String fileName) {
		File file = new File(fileName);
		if (file.exists()) {
			file.delete();
		}
	}
	 
	/**
	 * ## 方法说明：
	 * 	创建文件目录
	 * @param dir 目录路径
	 * @return
	 */
	public static boolean mkDir(String dir) {
		File file = new File(dir);
		if (!file.exists()) {
			return file.mkdirs();
		}
		return true;
	}
	
	/**
	 * ## 方法说明：
	 * 	zip压缩文件
	 * @param filename 文件路径+文件
	 * @param tempFilePath 临时文件夹
	 * @return
	 */
	public static void zipFile(String filename,String tempFilePath) throws Exception{
		FileOutputStream fos = null;
        ZipOutputStream zipOut = null;
        FileInputStream fis = null;
        File zipFileTemp = new File( filename);
        String [] files = ( new File( tempFilePath ) ).list();
        fos = new FileOutputStream( zipFileTemp );
        zipOut = new ZipOutputStream( fos );
        int i = 0;
    	for ( i = 0; i < files.length; i++ ) {
    		File f = new File( files[i] );
            fis = new FileInputStream( tempFilePath + "/" + files[i] );
            ZipEntry ze = new ZipEntry( f.getName() );
            zipOut.putNextEntry( ze );
            int c = 0;
            while ( ( c = fis.read() ) != -1 ) {
            	zipOut.write( c );
            }
            fis.close();
    	}
        zipOut.close();
        fis.close();
        fos.close();
	}
	
	/**
	 * ## 方法说明：
	 * 	删除目录下所有文件
	 * @param filePath 目录路径
	 * @return
	 */
	public static void delAllFile(String filePath) {
		File file = new File(filePath);
		File[] fileList = file.listFiles();
		String dirPath = null;
		if (fileList != null) {
			for (int i = 0; i < fileList.length; i++) {
				if (fileList[i].isFile()) {
					fileList[i].delete();
				}
				if (fileList[i].isDirectory()) {
					dirPath = fileList[i].getPath();
					delAllFile(dirPath);
				}
			}
			file.delete();
		}
	}
	
//	/**
//	 * ## 方法说明：
//	 * 	 在同一个目录下，如果存放文件时，文件名称相同，则以如下规则“a.pdf”,"a_1.pdf","a_2.pdf"
//	 * @param dictoryFile 目标目录
//	 * @param compareFile 存放的文件
//	 * @return
//	 */
//    public static String getReToName(File dictoryFile,File compareFile)
//    {
//    	List<Integer> sameFileNameList=new java.util.ArrayList<Integer>();
//    	String fileFullName=compareFile.getName();
//    	//String[] fileNameAndSuffix=fileFullName.split("\\.");
//    	String fileName=fileFullName.substring(0,fileFullName.length()-4);
//    	String reToFileName=null;
//    	if(compareFile.exists())
//    	{
//    		//如果文件已经存在
//    		File[] fileList=dictoryFile.listFiles();
//			for(File tmpFile:fileList)
//			{
//				String tmpfileName=tmpFile.getName();
//				if(tmpfileName.startsWith(fileName+"_"))
//				{
//					//String tmpFileNameAndSuffix[]=tmpfileName.split("\\.");
//					String tempFilePuffix=tmpfileName.substring(0, tmpfileName.length()-4);
//					String index=tempFilePuffix.substring(fileName.length()+1);
//					Integer indexInteger=Integer.valueOf(index);
//					sameFileNameList.add(indexInteger);
//				}
//			}
//			if(sameFileNameList.size()>0)
//			{
//				Collections.sort(sameFileNameList);
//				Integer maxIndex=sameFileNameList.get(sameFileNameList.size()-1);//获取已存在的最大值
//				reToFileName=fileName+"_"+(maxIndex+1);
//			}
//			else
//			{
//				//没有的话从1开始取，eg：a_1.pdf
//				reToFileName=fileName+"_1";
//			}
//    	}
//    	else
//    	{
//    		reToFileName=fileName;
//    	}
//    	return reToFileName+".pdf";//返回文件名加后缀
//    }
    
    /**
     * ## 方法说明：
     * 	直接下载文件
     * @param res HttpServletResponse
     * @param localPath 应用服务器的文件
     * @param createFileName 生成的文件名称
     */
    public static void downloadFile(HttpServletResponse res,String localPath,String createFileName){
    	try{
    		//1.设置文件ContentType类型，这样设置，会自动判断下载文件类型  
			res.setContentType("application/x-download");  
	        //2.设置文件头：最后一个参数是设置下载文件名
			res.addHeader("Content-Type", "text/html; charset=utf-8");  
			res.setHeader("Content-Disposition", "attachment;fileName="+ new String( createFileName.getBytes("gbk"), "ISO8859-1" ) );  
	        ServletOutputStream out;  
	        //通过文件路径获得File对象
	        File file = new File(localPath);  
	        FileInputStream in = new FileInputStream(file);  
            //3.通过response获取ServletOutputStream对象(out)  
            out = res.getOutputStream();  
            
            int len = 0;  
            byte[] buffer = new byte[BUFFER_SIZE];  
            while ((len = in.read(buffer)) > 0) {
                //4.写到输出流(out)中  
                out.write(buffer,0,len);  
            }  
            in.close();  
            out.close();  
            out.flush();  
    	}catch (Exception e) {
    		e.printStackTrace();
		}
    }
}
