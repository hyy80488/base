package com.jw.base.framework.core.fdfs;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.csource.fastdfs.UploadFileSender;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.jw.base.framework.core.config.PropertyConfigurer;
import com.jw.base.framework.core.servlet.StartUpServlet;
import com.jw.base.framework.core.util.DateUtil;
import com.jw.base.framework.core.util.FileStreamUtils;
import com.jw.base.framework.core.util.ListUtil;
import com.jw.base.framework.core.util.StringUtil;
import com.jw.base.framework.core.util.ZipUtil;

/**
 * <strong>类概要： FastDFS Java客户端工具类</strong> <br>
 */
public class FileManager {

	private static TrackerClient trackerClient;
	private static TrackerServer trackerServer;
	private static StorageServer storageServer;
	private static StorageClient storageClient;
	private static StorageClient1 storageClient1;

	private static final int BUFFER_SIZE = 16 * 1024;
	
	static {
		try {
			String fdfsClientConfigFilePath = (String) StartUpServlet.getConfig().get("realPath")+"WEB-INF"
												+File.separator+"classes"
												+File.separator+"conf"
												+File.separator+PropertyConfigurer.getContextProperty("dfs.client_config_file");
			ClientGlobal.init(fdfsClientConfigFilePath);

			trackerClient = new TrackerClient();
			trackerServer = trackerClient.getConnection();
			storageClient = new StorageClient(trackerServer, storageServer);
			storageClient1 = new StorageClient1(trackerServer, storageServer);
//			System.out.println("初始化 storageClient......");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * <strong>方法概要： 文件上传</strong> <br>
	 * <strong>创建时间： 2016-9-26 上午10:26:11</strong> <br>
	 * 
	 * @param FastDFSFile file
	 * @return fileAbsolutePath
	 */
	public static String upload(FastDFSFile file, NameValuePair[] valuePairs) {
		String[] uploadResults = null;
		try {
			uploadResults = storageClient.upload_file(file.getContent(), file.getExt(), valuePairs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String groupName = uploadResults[0];
		String remoteFileName = uploadResults[1];

		String fileAbsolutePath = (String)PropertyConfigurer.getContextProperty("dfs.protocol") 
								+ (String)PropertyConfigurer.getContextProperty("dfs.tracker_ngnix_addr")
								//+ trackerServer.getInetSocketAddress().getHostName()
								//+ SEPARATOR + TRACKER_NGNIX_PORT 
								+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + groupName 
								+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + remoteFileName;
		return fileAbsolutePath;
	}
	
	/**
	 * <strong>方法概要： 文件上传zip包解压后上传到FastDfs</strong> <br>
	 * @param FastDFSFile file
	 * @return fileAbsolutePath
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	public static List<Map<String,Object>> uploadUpZip2(MultipartFile file) throws Exception {
		String path = (String)PropertyConfigurer.getContextProperty("upload.file.path")+File.separator+UUID.randomUUID()+File.separator;
//		String group = (String)PropertyConfigurer.getContextProperty("dfs.group");
		File file1 = new File(path+file.getOriginalFilename());
	    if(file1.exists()){
	    	file1.delete();
	    }
	    if(!file1.getParentFile().exists()){
	    	file1.getParentFile().mkdirs();
	    }
	    if(!file1.exists()){
//	    	file.transferTo(file1);
	    	FileStreamUtils.inputstreamtofile(file.getInputStream(),file1);
	    }
	    List<File> upzipFile = ZipUtil.upzipFileNoPath(file1, path);
		
		List<Map<String,Object>> fileAbsolutePath = null;
		if(ListUtil.isNotEmpty(upzipFile)){
			fileAbsolutePath = new ArrayList<Map<String,Object>>();
			for(File uzFile:upzipFile ){
				String ext = uzFile.getName().substring(uzFile.getName().lastIndexOf(".")+1);
				NameValuePair[] meta_list = new NameValuePair[4];
				meta_list[0] = new NameValuePair("fileName", uzFile.getName());
				meta_list[1] = new NameValuePair("fileLength", String.valueOf(uzFile.length()));
				meta_list[2] = new NameValuePair("fileExt", ext);
				meta_list[3] = new NameValuePair("fileAuthor", "www");
				String[] uploadResults = null;
				try {
					uploadResults = storageClient.upload_file(uzFile.getAbsolutePath(), ext, meta_list);
				} catch (Exception e) {
					e.printStackTrace();
				}
				String groupName = uploadResults[0];
				String remoteFileName = uploadResults[1];
				String filePath = (String)PropertyConfigurer.getContextProperty("dfs.protocol") 
						+ (String)PropertyConfigurer.getContextProperty("dfs.tracker_ngnix_addr")
						//+ trackerServer.getInetSocketAddress().getHostName()
						//+ SEPARATOR + TRACKER_NGNIX_PORT 
						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + groupName 
						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + remoteFileName;
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("url", filePath);
				map.put("name", uzFile.getName());
				map.put("ext", ext);
				fileAbsolutePath.add(map);
			}
			
		}
		System.gc();
		ZipUtil.deletefile(path);
		return fileAbsolutePath;
	}
	
	/**
	 * <strong>方法概要： 文件上传zip包解压后上传到FastDfs</strong> <br>
	 * @param file
	 * @return
	 * @throws Exception
	 */
	public static List<Map<String,Object>> uploadUpZip3(File file1) throws Exception {
//		String path = (String)PropertyConfigurer.getContextProperty("upload.file.path")+File.separator+UUID.randomUUID();
		String path = (String)PropertyConfigurer.getContextProperty("upload.file.path")+File.separator+UUID.randomUUID()+File.separator;
//		List<File> upzipFile = ZipUtil.upzipFileNoPath(file1, path);
		List<File> upzipFile = ZipUtil.upzipFile(file1, path);
//		List<File> upzipFile = ZipUtil.upzipFile(file1);
		List<Map<String,Object>> fileAbsolutePath = null;
		if(ListUtil.isNotEmpty(upzipFile)){
			fileAbsolutePath = new ArrayList<Map<String,Object>>();
			for(File uzFile:upzipFile ){
				String ext = uzFile.getName().substring(uzFile.getName().lastIndexOf(".")+1);
				NameValuePair[] meta_list = new NameValuePair[4];
				meta_list[0] = new NameValuePair("fileName", uzFile.getName());
				meta_list[1] = new NameValuePair("fileLength", String.valueOf(uzFile.length()));
				meta_list[2] = new NameValuePair("fileExt", ext);
				meta_list[3] = new NameValuePair("fileAuthor", "www");
				String[] uploadResults = null;
				try {
					uploadResults = storageClient.upload_file(uzFile.getAbsolutePath(), ext, meta_list);
				} catch (Exception e) {
					e.printStackTrace();
				}
				String groupName = uploadResults[0];
				String remoteFileName = uploadResults[1];
				String filePath = (String)PropertyConfigurer.getContextProperty("dfs.protocol") 
						+ (String)PropertyConfigurer.getContextProperty("dfs.tracker_ngnix_addr")
						//+ trackerServer.getInetSocketAddress().getHostName()
						//+ SEPARATOR + TRACKER_NGNIX_PORT 
						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + groupName 
						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + remoteFileName;
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("url", filePath);
				map.put("name", uzFile.getName());
				map.put("ext", ext);
				fileAbsolutePath.add(map);
			}
			
		}
		System.gc();
		ZipUtil.deletefile(path);
		return fileAbsolutePath;
	}

	/**
	 * <strong>方法概要： 文件上传zip包解压后上传到FastDfs</strong> <br>
	 * 
	 * @param FastDFSFile file
	 * @return fileAbsolutePath
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	public static List<String> uploadUpZip(MultipartFile file) throws Exception {
		String path = (String)PropertyConfigurer.getContextProperty("upload.file.path")+File.separator+UUID.randomUUID()+File.separator;
//		String group = (String)PropertyConfigurer.getContextProperty("dfs.group");
		File file1 = new File(path+file.getOriginalFilename());
	    if(file1.exists()){
	    	file1.delete();
	    }
	    if(!file1.getParentFile().exists()){
	    	file1.getParentFile().mkdirs();
	    }
	    if(!file1.exists()){
//	    	file.transferTo(file1);
	    	FileStreamUtils.inputstreamtofile(file.getInputStream(),file1);
	    }
	    List<File> upzipFile = ZipUtil.upzipFileNoPath(file1, path);
//		List<Map<String, Object>> upzipFile = ZipUtil.upzipFile(file1);
//		List<Map<String, Object>> upzipFile = ZipUtil.upzipFile1(file1);
		
		List<String> fileAbsolutePath = null;
		if(ListUtil.isNotEmpty(upzipFile)){
			fileAbsolutePath = new ArrayList<String>();
			for(File uzFile:upzipFile ){
				String ext = uzFile.getName().substring(uzFile.getName().lastIndexOf(".")+1);
				NameValuePair[] meta_list = new NameValuePair[4];
				meta_list[0] = new NameValuePair("fileName", uzFile.getName());
				meta_list[1] = new NameValuePair("fileLength", String.valueOf(uzFile.length()));
				meta_list[2] = new NameValuePair("fileExt", ext);
				meta_list[3] = new NameValuePair("fileAuthor", "www");
				String[] uploadResults = null;
				try {
					uploadResults = storageClient.upload_file(uzFile.getAbsolutePath(), ext, meta_list);
				} catch (Exception e) {
					e.printStackTrace();
				}
				String groupName = uploadResults[0];
				String remoteFileName = uploadResults[1];
				String filePath = (String)PropertyConfigurer.getContextProperty("dfs.protocol") 
						+ (String)PropertyConfigurer.getContextProperty("dfs.tracker_ngnix_addr")
						//+ trackerServer.getInetSocketAddress().getHostName()
						//+ SEPARATOR + TRACKER_NGNIX_PORT 
						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + groupName 
						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + remoteFileName;
				fileAbsolutePath.add(filePath);
			}
			
//			for(Map<String, Object> map:upzipFile){
//				String ext = map.get("fileExt")!=null?(String)map.get("fileExt"):"";
////				byte[] bytes = (byte[])map.get("bytes");
////				FastDFSFile f = new FastDFSFile(bytes,ext);
//				NameValuePair[] meta_list = new NameValuePair[4];
//				meta_list[0] = new NameValuePair("fileName", map.get("fileName")!=null?(String)map.get("fileName"):"");
//				meta_list[1] = new NameValuePair("fileLength", map.get("fileLength")!=null?String.valueOf(map.get("fileLength")):"0");
//				meta_list[2] = new NameValuePair("fileExt", ext);
//				meta_list[3] = new NameValuePair("fileAuthor", "www");
//				
//				String[] uploadResults = null;
//				try {
//					uploadResults = storageClient.upload_file((byte[])map.get("bytes"), ext, meta_list);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				String groupName = uploadResults[0];
//				String remoteFileName = uploadResults[1];
//				String filePath = (String)PropertyConfigurer.getContextProperty("dfs.protocol") 
//						+ (String)PropertyConfigurer.getContextProperty("dfs.tracker_ngnix_addr")
//						//+ trackerServer.getInetSocketAddress().getHostName()
//						//+ SEPARATOR + TRACKER_NGNIX_PORT 
//						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + groupName 
//						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + remoteFileName;
//				fileAbsolutePath.add(filePath);
				
				
//				String remoteFileName = null;
//				try {
//					UploadFileSender callback = new UploadFileSender(map.get("inputStream")!=null?(InputStream)map.get("inputStream"):null);
//					remoteFileName = storageClient1.upload_file1(group, map.get("fileLength")!=null?Integer.valueOf(map.get("fileLength").toString()):0, callback, ext, meta_list);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				String filePath = (String)PropertyConfigurer.getContextProperty("dfs.protocol") 
//						+ (String)PropertyConfigurer.getContextProperty("dfs.tracker_ngnix_addr")
//						//+ trackerServer.getInetSocketAddress().getHostName()
//						//+ SEPARATOR + TRACKER_NGNIX_PORT 
//						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + remoteFileName;
//				fileAbsolutePath.add(filePath);
//			}
		}
		System.gc();
//		if(ListUtil.isNotEmpty(upzipFile)){
//			for(File fi:upzipFile){
//				fi.delete();
////				ZipUtil.deletefile(path+file.getOriginalFilename());
//			}
//		}
//		file1.delete();
		ZipUtil.deletefile(path);
		return fileAbsolutePath;
	}
	
	/**
	 * <strong>方法概要： 文件上传zip包解压后上传到FastDfs</strong> <br>
	 * @param file
	 * @return
	 * @throws Exception
	 */
	public static List<String> uploadUpZip1(File file1) throws Exception {
		String path = (String)PropertyConfigurer.getContextProperty("upload.file.path")+File.separator+UUID.randomUUID()+File.separator;
//		String group = (String)PropertyConfigurer.getContextProperty("dfs.group");
		List<File> upzipFile = ZipUtil.upzipFileNoPath(file1, path);
//		List<Map<String, Object>> upzipFile = ZipUtil.upzipFile(file1);
//		List<Map<String, Object>> upzipFile = ZipUtil.upzipFile1(file1);
		
		List<String> fileAbsolutePath = null;
		if(ListUtil.isNotEmpty(upzipFile)){
			fileAbsolutePath = new ArrayList<String>();
			for(File uzFile:upzipFile ){
				String ext = uzFile.getName().substring(uzFile.getName().lastIndexOf(".")+1);
				NameValuePair[] meta_list = new NameValuePair[4];
				meta_list[0] = new NameValuePair("fileName", uzFile.getName());
				meta_list[1] = new NameValuePair("fileLength", String.valueOf(uzFile.length()));
				meta_list[2] = new NameValuePair("fileExt", ext);
				meta_list[3] = new NameValuePair("fileAuthor", "www");
				String[] uploadResults = null;
				try {
					uploadResults = storageClient.upload_file(uzFile.getAbsolutePath(), ext, meta_list);
				} catch (Exception e) {
					e.printStackTrace();
				}
				String groupName = uploadResults[0];
				String remoteFileName = uploadResults[1];
				String filePath = (String)PropertyConfigurer.getContextProperty("dfs.protocol") 
						+ (String)PropertyConfigurer.getContextProperty("dfs.tracker_ngnix_addr")
						//+ trackerServer.getInetSocketAddress().getHostName()
						//+ SEPARATOR + TRACKER_NGNIX_PORT 
						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + groupName 
						+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + remoteFileName;
				fileAbsolutePath.add(filePath);
			}
			
		}
		System.gc();
		ZipUtil.deletefile(path);
		return fileAbsolutePath;
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	根据数组上传文件
	 * @param bytes
	 * @param fileName
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static String uploadBytes(byte[] bytes,String fileName) throws Exception {
//		String path = (String)PropertyConfigurer.getContextProperty("upload.file.path")+File.separator+UUID.randomUUID()+File.separator;
//		String group = (String)PropertyConfigurer.getContextProperty("dfs.group");
		
		String fileAbsolutePath = null;
		if(bytes!=null&&bytes.length>0){
			String ext = null;
			if(StringUtil.isNotEmpty(fileName)){
				if(fileName.contains(".")){
					ext = fileName.substring(fileName.lastIndexOf(".")+1);
				}
			}
			if(null==ext){
				//根据比特流获取文件后缀名
				ext = FileStreamUtils.getFileType(bytes);
			}
			
			NameValuePair[] meta_list = new NameValuePair[4];
			meta_list[0] = new NameValuePair("fileName", fileName);
			meta_list[1] = new NameValuePair("fileLength", String.valueOf(bytes.length));
			meta_list[2] = new NameValuePair("fileExt", ext);
			meta_list[3] = new NameValuePair("fileAuthor", "www");
			
			String[] uploadResults = null;
			try {
				uploadResults = storageClient.upload_file(bytes, ext, meta_list);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String groupName = uploadResults[0];
			String remoteFileName = uploadResults[1];
			fileAbsolutePath = (String)PropertyConfigurer.getContextProperty("dfs.protocol") 
					+ (String)PropertyConfigurer.getContextProperty("dfs.tracker_ngnix_addr")
					//+ trackerServer.getInetSocketAddress().getHostName()
					//+ SEPARATOR + TRACKER_NGNIX_PORT 
					+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + groupName 
					+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + remoteFileName;
		
		}
		return fileAbsolutePath;
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	根据流上传文件
	 * @param inputStream
	 * @param fileName
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static String uploadStream(InputStream inputStream,String fileName) throws Exception{
//		String path = (String)PropertyConfigurer.getContextProperty("upload.file.path")+File.separator+UUID.randomUUID()+File.separator;
		String group = (String)PropertyConfigurer.getContextProperty("dfs.group");
		
		String fileAbsolutePath = null;
		if(inputStream!=null){
			String ext = null;
			if(StringUtil.isNotEmpty(fileName)){
				if(fileName.contains(".")){
					ext = fileName.substring(fileName.lastIndexOf(".")+1);
				}
			}
			if(null==ext){
				//根据比特流获取文件后缀名
				byte[] byteArray = FileStreamUtils.toByteArray(inputStream);
				ext = FileStreamUtils.getFileType(byteArray);
			}
			
			NameValuePair[] meta_list = new NameValuePair[4];
			meta_list[0] = new NameValuePair("fileName", fileName);
			meta_list[1] = new NameValuePair("fileLength", String.valueOf(inputStream.available()));
			meta_list[2] = new NameValuePair("fileExt", ext);
			meta_list[3] = new NameValuePair("fileAuthor", "www");
			
			try {
				UploadFileSender callback = new UploadFileSender(inputStream);
				fileAbsolutePath = storageClient1.upload_file1(group, inputStream.available(), callback, ext, meta_list);
//				uploadResults = storageClient.upload_file(bytes, ext, meta_list);
			} catch (Exception e) {
				e.printStackTrace();
			}
			fileAbsolutePath = (String)PropertyConfigurer.getContextProperty("dfs.protocol") 
					+ (String)PropertyConfigurer.getContextProperty("dfs.tracker_ngnix_addr")
					//+ trackerServer.getInetSocketAddress().getHostName()
					//+ SEPARATOR + TRACKER_NGNIX_PORT 
					+ (String)PropertyConfigurer.getContextProperty("dfs.separator") + fileAbsolutePath;
			
			
		}
		return fileAbsolutePath;
	}
	
	/**
	 * <strong>方法概要： 文件下载</strong> <br>
	 * <strong>创建时间： 2016-9-26 上午10:28:21</strong> <br>
	 * @param String groupName
	 * @param String remoteFileName
	 * @return returned value comment here
	 */
	public static ResponseEntity<byte[]> download(String groupName, String remoteFileName, String specFileName) {
		byte[] content = null;
		HttpHeaders headers = new HttpHeaders();
		try {
			int num = 0;
			//上传后，马上获取，可能获取不到内容
			while ((null==content || content.length==0) && num<10){
				content = storageClient.download_file(groupName, remoteFileName);
				num++;
			}
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.setContentDispositionFormData("attachment", new String(specFileName.getBytes("UTF-8"), "iso-8859-1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(content, headers, HttpStatus.OK);
	}
	
	/**
	 * <strong>方法概要： 获取文件的比特数组</strong> <br>
	 * <strong>创建时间： 2016-9-26 上午10:28:21</strong> <br>
	 * @param String groupName
	 * @param String remoteFileName
	 * @return returned value comment here
	 */
	public static byte[] downloadByBytes(String url) {
		byte[] content = null;
		try {
			String substr = url.substring(url.indexOf("group"));
			String groupName = substr.split("/")[0];
			String remoteFileName = substr.substring(substr.indexOf("/M00")+5);
			int num = 0;
			//上传后，马上获取，可能获取不到内容
			while ((null==content || content.length==0) && num<10){
				content = storageClient.download_file(groupName, remoteFileName);
				num++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return content;
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	多个文件下载 不打压缩包
	 * @param downFiles key值为url value为名字
	 * @return
	 */
	public static ResponseEntity<List<byte[]>> downloadBatch(Map<String,String> downFiles) {
		HttpHeaders headers = new HttpHeaders();
		List<byte[]> contents = new ArrayList<byte[]>();
		try {
			String specFileName = "";
			if(downFiles!=null&&downFiles.size()>0){
				for(String key : downFiles.keySet()){
					String substr = key.substring(key.indexOf("group"));
					String groupName = substr.split("/")[0];
					String remoteFileName = substr.substring(substr.indexOf("/M00")+5);
					byte[] content = null;
					int num = 0;
					//上传后，马上获取，可能获取不到内容
					while ((null==content || content.length==0) && num<10){
						content = storageClient.download_file(groupName, remoteFileName);
						num++;
					}
					if(content!=null){
						contents.add(content);
						specFileName +=downFiles.get(key)+",";
					}
				}
			}
			if(specFileName.length()>0){
				specFileName = specFileName.substring(0,specFileName.length()-1);
			}
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.setContentDispositionFormData("attachment", new String(specFileName.getBytes("UTF-8"), "iso-8859-1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<List<byte[]>>(contents, headers, HttpStatus.OK);
	}
	
	/**
	 * 
	 * ## 方法说明：
	 * 	多个文件下载 打压缩包
	 * @param downFiles key值为url value为名字
	 * @return
	 */
	public static ResponseEntity<byte[]> downloadZip(Map<String,String> downFiles,String specFileName) {
		String path = (String)PropertyConfigurer.getContextProperty("upload.file.path")+File.separator+UUID.randomUUID()+File.separator;
		HttpHeaders headers = new HttpHeaders();
		byte[] contents = null;
		FileInputStream fio = null;
		try {
			if(downFiles!=null&&downFiles.size()>0){
				//压缩包的文件名
				if(StringUtil.isEmpty(specFileName)){
					specFileName = ""+DateUtil.getSysYear()+DateUtil.getSysMonth()+DateUtil.getSysDay();
				}
				String zipName =path+specFileName+".zip";
				File zipFile = new File(zipName);
				if(!zipFile.getParentFile().exists()){
					zipFile.getParentFile().mkdirs();
				}
				List<File> files = new ArrayList<File>();
				for(String key : downFiles.keySet()){
					String substr = key.substring(key.indexOf("group"));
					String groupName = substr.split("/")[0];
					String remoteFileName = substr.substring(substr.indexOf("/M00")+5);
					int num = 0;
					int i = -1;
					String ext = "txt";
					if(remoteFileName.contains(".")){
						ext = remoteFileName.substring(remoteFileName.lastIndexOf(".")+1);
					}
					String fileName = path+downFiles.get(key)+"."+ext;
					while (i!=0 && num<=10){
						i = storageClient.download_file(groupName, remoteFileName,fileName);
						num++;
					}
					File file= new File(fileName);
					if(file.exists()){
						files.add(file);
					}
				}
				ZipUtil.zipFile(zipName, files);
				fio = new FileInputStream(zipFile);
				if(fio!=null){
					contents = new byte[fio.available()];
					fio.read(contents);
				}
				
			}
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.setContentDispositionFormData("attachment", new String(specFileName.getBytes("UTF-8"), "iso-8859-1"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fio!=null){
				try {
					fio.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			//删除文件
			System.gc();
			ZipUtil.deletefile(path);
		}
		return new ResponseEntity<byte[]>(contents, headers, HttpStatus.OK);
	}
	
	/**
	 * ## 方法说明：
	 * 	文件删除
	 * @param groupName
	 * @param remoteFileName
	 * @return
	 */
	public static int delete(String groupName, String remoteFileName) {
		//i 0删除成功 2文件不存在     其他删除出错
		int i = 1;
		try {
			i = storageClient.delete_file(groupName, remoteFileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	/**
	 * <strong>方法概要： 流直接下载【不落地】</strong> <br>
	 */
	public static ResponseEntity<byte[]> downloadByte(String groupName, String specFileName, byte[] content) {
		HttpHeaders headers = new HttpHeaders();
		try {
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.setContentDispositionFormData("attachment", new String(specFileName.getBytes("UTF-8"), "iso-8859-1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(content, headers, HttpStatus.OK);
	}

	//获得指定文件的byte数组 
	public static byte[] getBytes(String filePath) {
		byte[] buffer = null;
		try {
			File file = new File(filePath);
			FileInputStream fis = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] b = new byte[BUFFER_SIZE];
			int n;
			while ((n = fis.read(b)) != -1) {
				bos.write(b, 0, n);
			}
			fis.close();
			bos.close();
			buffer = bos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer;
	}
	
//        public static void main(String[] args) throws Exception {
//        	byte[] byteArray = FileStreamUtils.toByteArray(new File("D:\\BaiduNetdiskDownload\\1\\nio.pdf"));
//        	System.out.println(FileStreamUtils.getFileType(byteArray));
////        	System.out.println(FileUtils.getFileType("D:\\BaiduNetdiskDownload\\1\\1.html"));
//        	System.out.println(new Date().getTime());
//        }

}
