package com.jw.base.framework.core.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;
import java.util.Iterator;

public class FileStreamUtils {
	private static final HashMap<String,String> mFileTypes = new HashMap<String,String>();
	private static final int BUFFER_SIZE = 64 * 1024;
    // judge file type by file header content
    static {
        mFileTypes.put("ffd8ffe000104a464946", "jpg"); //JPEG (jpg)       
        mFileTypes.put("89504e470d0a1a0a0000", "png"); //PNG (png)       
        mFileTypes.put("47494638396126026f01", "gif"); //GIF (gif)       
        mFileTypes.put("49492a00227105008037", "tif"); //TIFF (tif)       
        mFileTypes.put("424d228c010000000000", "bmp"); //16色位图(bmp)       
        mFileTypes.put("424d8240090000000000", "bmp"); //24位位图(bmp)       
        mFileTypes.put("424d8e1b030000000000", "bmp"); //256色位图(bmp)       
        mFileTypes.put("41433130313500000000", "dwg"); //CAD (dwg)       
        mFileTypes.put("3c21444f435459504520", "html"); //HTML (html)  
        mFileTypes.put("3c21646f637479706520", "htm"); //HTM (htm)  
        mFileTypes.put("48544d4c207b0d0a0942", "css"); //css  
        mFileTypes.put("696b2e71623d696b2e71", "js"); //js  
        mFileTypes.put("7b5c727466315c616e73", "rtf"); //Rich Text Format (rtf)       
        mFileTypes.put("38425053000100000000", "psd"); //Photoshop (psd)       
        mFileTypes.put("46726f6d3a203d3f6762", "eml"); //Email [Outlook Express 6] (eml)         
        mFileTypes.put("d0cf11e0a1b11ae10000", "doc"); //MS Excel 注意：word、msi 和 excel的文件头一样       
        mFileTypes.put("d0cf11e0a1b11ae10000", "vsd"); //Visio 绘图       
        mFileTypes.put("5374616E64617264204A", "mdb"); //MS Access (mdb)        
        mFileTypes.put("252150532D41646F6265", "ps");
        mFileTypes.put("255044462d312e350d0a", "pdf"); //Adobe Acrobat (pdf)     
        mFileTypes.put("2e524d46000000120001", "rmvb"); //rmvb/rm相同    
        mFileTypes.put("464c5601050000000900", "flv"); //flv与f4v相同    
        mFileTypes.put("00000020667479706d70", "mp4");
        mFileTypes.put("49443303000000002176", "mp3");
        mFileTypes.put("000001ba210001000180", "mpg"); //       
        mFileTypes.put("3026b2758e66cf11a6d9", "wmv"); //wmv与asf相同      
        mFileTypes.put("52494646e27807005741", "wav"); //Wave (wav)    
        mFileTypes.put("52494646d07d60074156", "avi");
        mFileTypes.put("4d546864000000060001", "mid"); //MIDI (mid)     
        mFileTypes.put("504b0304140000000800", "zip");
        mFileTypes.put("526172211a0700cf9073", "rar");
        mFileTypes.put("235468697320636f6e66", "ini");
        mFileTypes.put("504b03040a0000000000", "jar");
        mFileTypes.put("4d5a9000030000000400", "exe");//可执行文件  
        mFileTypes.put("3c25402070616765206c", "jsp");//jsp文件  
        mFileTypes.put("4d616e69666573742d56", "mf");//MF文件  
        mFileTypes.put("3c3f786d6c2076657273", "xml");//xml文件  
        mFileTypes.put("494e5345525420494e54", "sql");//xml文件  
        mFileTypes.put("7061636b616765207765", "java");//java文件  
        mFileTypes.put("406563686f206f66660d", "bat");//bat文件  
        mFileTypes.put("1f8b0800000000000000", "gz");//gz文件  
        mFileTypes.put("6c6f67346a2e726f6f74", "properties");//bat文件  
        mFileTypes.put("cafebabe0000002e0041", "class");//bat文件  
        mFileTypes.put("49545346030000006000", "chm");//bat文件  
        mFileTypes.put("04000000010000001300", "mxp");//bat文件  
        mFileTypes.put("504b0304140006000800", "docx");//docx文件  
        mFileTypes.put("d0cf11e0a1b11ae10000", "wps");//WPS文字wps、表格et、演示dps都是一样的  
        mFileTypes.put("6431303a637265617465", "torrent");

        mFileTypes.put("6D6F6F76", "mov"); //Quicktime (mov)    
        mFileTypes.put("FF575043", "wpd"); //WordPerfect (wpd)     
        mFileTypes.put("CFAD12FEC5FD746F", "dbx"); //Outlook Express (dbx)       
        mFileTypes.put("2142444E", "pst"); //Outlook (pst)        
        mFileTypes.put("AC9EBD8F", "qdf"); //Quicken (qdf)       
        mFileTypes.put("E3828596", "pwl"); //Windows Password (pwl)           
        mFileTypes.put("2E7261FD", "ram"); //Real Audio (ram)     
        mFileTypes.put("null", "text"); //null
    }
    /**
     * 
     * ## 方法说明：
     * 	获取文件的文件类型
		优化处理：在不同的设备上同样类型的文件，文件头前面内容未必一致，可能只有前几个一致，后面就不同了
		（例如：jpg类型文件，在不同手机上，lennovo k900前10个是一致的，但是MI3只有前5个字符一致，后面是不一样的，所有一些情况进行特殊处理）
		当整个头文件失败后，在进行前5个字符截取对比处理
		获取失败默认返回txt类型
     * @param filePath
     * @return
     */
    public static String getFileType(byte[] bytes) {
    	String keySearch=getFileHeader(bytes);
    	String fileSuffix=mFileTypes.get(keySearch);
    	//补充 这里并不是所有的文件格式前10 byte（jpg）都一致，前五个byte一致即可
    	if(fileSuffix==null){
    		Iterator<String> keyList=mFileTypes.keySet().iterator();
    		String key = null;
    		String keySearchPrefix=keySearch.substring(0,5);
    		while (keyList.hasNext()){
    			key=keyList.next();
    			if(key.startsWith(keySearchPrefix)) {
    				fileSuffix = mFileTypes.get(key);
    				break;
    			}
    		}
    	}
    	if(fileSuffix==null){
    		fileSuffix = "text";
    	}
    	return fileSuffix;
    }
    private static String getFileHeader(byte[] bytes) {
        if(bytes==null || bytes.length<=0){
            return "null";
        }
        String value = null;
        byte[] b = new byte[10];
        for(int i=0;i<10&&i<bytes.length;i++){
        	b[i] = bytes[i];
        }
        value = bytesToHexString(b);
        
//        byte[] clone = null;
//        try {
//        	clone = bytes.clone();
//            byte[] b = new byte[10];
//            for(int i=0;i<10;i++){
//            	b[i] = clone[i];
//            }
//            value = bytesToHexString(b);
//        } catch (Exception e) {
//        } finally {
//            if(null != clone) {
//            	clone=null;
//            }
//        }
        return value;
    }
    
    
    /**
     * 
     * ## 方法说明：
     * 	获取文件的文件类型
		优化处理：在不同的设备上同样类型的文件，文件头前面内容未必一致，可能只有前几个一致，后面就不同了
		（例如：jpg类型文件，在不同手机上，lennovo k900前10个是一致的，但是MI3只有前5个字符一致，后面是不一样的，所有一些情况进行特殊处理）
		当整个头文件失败后，在进行前5个字符截取对比处理
		获取失败默认返回txt类型
     * @param filePath
     * @return
     */
    public static String getFileType(String filePath) {
        String keySearch=getFileHeader(filePath);
        String fileSuffix=mFileTypes.get(keySearch);
        //补充 这里并不是所有的文件格式前10 byte（jpg）都一致，前五个byte一致即可
        if(fileSuffix==null){
            Iterator<String> keyList=mFileTypes.keySet().iterator();
            String key = null;
            String keySearchPrefix=keySearch.substring(0,5);
            while (keyList.hasNext()){
                key=keyList.next();
                if(key.startsWith(keySearchPrefix)) {
                    fileSuffix = mFileTypes.get(key);
                    break;
                }
            }
        }
        if(fileSuffix==null){
        	fileSuffix = "text";
        }
        return fileSuffix;
    }

    private static String getFileHeader(String filePath) {
        File file=new File(filePath);
        if(!file.exists() || file.length()<=0){
            return "null";
        }
        FileInputStream is = null;
        String value = null;
        try {
            is = new FileInputStream(file);
            byte[] b = new byte[10];
            is.read(b, 0, b.length);
            value = bytesToHexString(b);
        } catch (Exception e) {
        } finally {
            if(null != is) {
                try {
                    is.close();
                } catch (IOException e) {}
            }
        }
        return value;
    }

    private static String bytesToHexString(byte[] src){
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
    
    
    
    /**
	 * 
	 * ## 方法说明：
	 * 	将输入流转成File文件
	 * @param ins
	 * @param f
	 */
	public static void inputstreamtofile(InputStream ins,File f) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(f);
			int bytesRead = 0;
			byte[] buffer = new byte[BUFFER_SIZE];
			while((bytesRead = ins.read(buffer,0,BUFFER_SIZE)) != -1){
				os.write(buffer, 0, bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(os!=null){
				try {
					os.flush();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(ins!=null){
				try {
					ins.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// return f;
	}
	/**
	 * 
	 * ## 方法说明：
	 * 	将输入流转成File文件
	 * @param ins
	 * @param f
	 * @throws Exception 
	 */
	public static void bytesTofile(byte[] ins,File f) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(f);
			os.write(ins);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(os!=null){
				try {
					os.flush();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// return f;
	}
	/**
	 * 
	 * ## 方法说明：
	 * 	根据流获取比特数组
	 * @param f
	 * @return
	 * @throws Exception
	 */
	public static byte[] toByteArray(InputStream f) throws Exception {  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        BufferedInputStream in = null;  
        try {  
            in = new BufferedInputStream(f);  
            byte[] buffer = new byte[BUFFER_SIZE];  
            int len = 0;  
            while (-1 != (len = in.read(buffer, 0, BUFFER_SIZE))) {  
                bos.write(buffer, 0, len);  
            }  
            return bos.toByteArray();  
        } catch (IOException e) {  
            e.printStackTrace();  
            throw e;  
        } finally {  
            try { 
            	if(in!=null){
            		in.close();  
            	}
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            bos.close();  
        }  
    }  
	/**
	 * 
	 * ## 方法说明：
	 * 	获取文件的比特流
	 * @param f
	 * @return
	 * @throws Exception
	 */
	 public static byte[] toByteArray(File f) throws Exception {  
//		if (f.length()> Integer.MAX_VALUE) {  
//			throw new BusinessException(BsProcessErrorCode.ERROR_CODE_000061, "文件过大", "文件过大", BsProcessErrorCode.ERROR_LEVEL_5);
//        }  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        BufferedInputStream in = null;  
        try {  
            in = new BufferedInputStream(new FileInputStream(f));  
            byte[] buffer = new byte[BUFFER_SIZE];  
            int len = 0;  
            while (-1 != (len = in.read(buffer, 0, BUFFER_SIZE))) {  
                bos.write(buffer, 0, len);  
            }  
            return bos.toByteArray();  
        } catch (IOException e) {  
            e.printStackTrace();  
            throw e;  
        } finally {  
            try {  
            	if(in!=null){
            		in.close();  
            	}
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            bos.close();  
        }  
    }  
	 /**
	  * 
	  * ## 方法说明：
	  * 	用nio方式获取文件的比特流 
	  * @param filename
	  * @return
	  * @throws IOException
	  */
	 public static byte[] toByteArray3(String filename) throws IOException {  
        FileChannel fc = null;  
        try {  
            fc = new RandomAccessFile(filename, "r").getChannel();  
            MappedByteBuffer byteBuffer = fc.map(MapMode.READ_ONLY, 0,  
                    fc.size()).load();  
            System.out.println(byteBuffer.isLoaded());  
            byte[] result = new byte[(int) fc.size()];  
            if (byteBuffer.remaining() > 0) {  
                // System.out.println("remain");  
                byteBuffer.get(result, 0, byteBuffer.remaining());  
            }  
            return result;  
        } catch (IOException e) {  
            e.printStackTrace();  
            throw e;  
        } finally {  
            try {  
            	if(fc!=null){
            		fc.close();  
            	}
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        } 
	 }
}
