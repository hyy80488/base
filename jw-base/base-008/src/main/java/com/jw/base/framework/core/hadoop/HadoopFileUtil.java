package com.jw.base.framework.core.hadoop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class HadoopFileUtil {
	FileSystem fs = null;

	public void init() throws Exception {
		//初始化
		fs = FileSystem.get(new URI("hdfs://Master.Hadoop:9000"), new Configuration(), "hadoop");
	}

	//上传文件
	public void fileUpload(String input, String output) throws Exception {
		InputStream in = new FileInputStream(input);
		OutputStream out = fs.create(new Path(output));
		//in输入源, out输出源头, 1024缓冲区大小 ,true 是否关闭数据流。如果是false，就在finally里关掉
		IOUtils.copyBytes(in, out, 1024, true);
	}

	//创建文件夹
	public boolean mkdir(String path) throws IllegalArgumentException, IOException {
		boolean flag = fs.mkdirs(new Path(path));
		//如果创建目录成功会返回true
		System.out.println("mkdir: "+flag);
		return flag;
	}

	//下载文件
	public void fileDownload(String input, String output) throws IllegalArgumentException, IOException {
		//fs.copyToLocalFile(new Path("/jdk"),new Path("d://jkd111"));
		
		//InputStream  hdfs上的文件
		InputStream in = fs.open(new Path(input));
		//下载到本地路径 以及重命名后的名字
		OutputStream out = new FileOutputStream(output);
		IOUtils.copyBytes(in, out, 4096, true);
	}

	//删除文件
	public boolean fileDel(String pathOrFile) throws IllegalArgumentException, IOException {
		//如果是删除路径  把参数换成路径即可
		//第二个参数true表示递归删除，如果该文件夹下还有文件夹或者内容 ，会变递归删除，若为false则路径下有文件则会删除不成功
		boolean flag = fs.delete(new Path(pathOrFile), true);
		System.out.println("fileDel: "+flag);
		return flag;
	}

	//重命名文件
	public boolean fileRename(String oldName, String newName) throws IllegalArgumentException, IOException {
		//第一个参数改名为第二个参数
		boolean flag = fs.rename(new Path(oldName), new Path(newName));
		System.out.println("fileRename: " + flag);
		return flag;
	}

	//查看文件是否存在
	public boolean CheckFile(String path) throws IllegalArgumentException, IOException {
		boolean flag = fs.exists(new Path(path));
		System.out.println("CheckFile: " + flag);
		return flag;
	}

	//寻找文件在集群中的位置
	public void FileLoc(String path) throws IllegalArgumentException, IOException {
		FileStatus filestatus = fs.getFileStatus(new Path(path));
		System.out.println("filestatus: "+filestatus);//如果创建目录成功会返回true
		BlockLocation[] blkLocations = fs.getFileBlockLocations(filestatus, 0, filestatus.getLen());//文件开始与结束

		int blockLen = blkLocations.length;//块的个数
		System.out.println("---------分割线--------");
		for (int i = 0; i < blockLen; i++) {
			String[] hosts = blkLocations[i].getHosts();
			System.out.println("block_" + i + "location:" + hosts[0]);
		}
		System.out.println("---------分割线---------");
	}

	//直接在hdfs上创建文件并在其中输入文字   测试成功
	public void createTextFile(String content, String pathName) throws IllegalArgumentException, IOException {
		byte[] buff = content.getBytes();//想要输入内容
		Path path = new Path(pathName);//文件存放路径及文件名称
		FSDataOutputStream outputStream = fs.create(path);
		outputStream.write(buff, 0, buff.length);
		System.out.println("输出文件成功");
	}

	public static void main(String[] args) throws Exception {
		HadoopFileUtil test = new HadoopFileUtil();
		test.init();
		
		test.fileUpload("d://api.jwcloudpms.com.log","/inputfile/test/api.jwcloudpms.com.log");
		
		//上传到了/softwares/hadoop/dfs/data/current/BP-1534689591-192.168.18.202-1522835091842/current/finalized/subdir0/subdir0
//		test.fileUpload("D://eclipse mars workspace//bigdata//bigdata//file//NaiveBayes.txt","/inputfile/NaiveBayes.txt");
		
//		test.mkdir("/inputfile/test");
//		
//		test.fileDownload("/inputfile/NaiveBayes.txt","d://NaiveBayes.txt");
//		
//		test.fileRename("/inputfile/test", "/inputfile/test2");
//		test.fileDel("/inputfile/test");
//		test.fileDel("/inputfile/test2");
//		test.fileDel("/inputfile/testtext.txt");
//		test.CheckFile("/inputfile/test");
//		
//		test.fileUpload("d://testtext.txt","/inputfile/testtext.txt");
//		test.FileLoc("/inputfile/testtext.txt");
//		
//		StringBuffer s = new StringBuffer();
//		s.append("hello hadoop world!\n");
//		test.createTextFile(s.toString(),"/inputfile/testword.txt");
	}
}
