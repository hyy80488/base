package com.jw.base.framework.core.shell;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelShell;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

//设置操作系统  sudo vim /etc/ssh/sshd_config
//ClientAliveInterval 60
//ClientAliveCountMax 3


//JSch 是SSH2的一个纯Java实现。它允许你连接到一个sshd 服务器，使用端口转发，X11转发，文件传输等等。你可以将它的功能集成到你自己的 程序中。同时该项目也提供一个J2ME版本用来在手机上直连SSHD服务器。
//SSH是Secure Shell的缩写，一种建立在应用层和传输层基础上的安全协议。SSH在连接和传送过程中会加密所有数据，可以用来在不同系统或者服务器之间进行安全连接。SSH提供两种的安全验证方式：基于密码的认证和基于密匙的认证。其中，基于密码的认证比较简单，只要知道远程主机的用户名和密码，就可以进行登录。基于密匙的认证比较麻烦，而且连接比较耗时，这里不详细介绍。 
//有很多基于SSH协议的客户端，例如：PuTTY、OpenSSH、Xshell 4等，可以远程连接几乎所有UNIX平台。同时，可以通过Linux命令行ssh uername@host连接到某主机。 
//在项目中，如何利用代码实现SSH，远程执行Shell脚本呢？JSch是Java Secure Channel的缩写，是一个SSH2功能的纯Java实现，具体信息可以参考JSch官网。它允许你连接到一个SSH服务器，并且可以使用端口转发，X11转发，文件传输等，同时你也可以集成它的功能到你自己的应用程序。
public class SecureShell {
	
	private String charset = "UTF-8"; // 设置编码格式,可以根据服务器的编码设置相应的编码格式  
	
	// 远程主机的ip地址
	private String ip;
	// 远程主机登录用户名
	private String username;
	// 远程主机的登录密码
	private String password;
	// 免密登录密钥路径
	private String prvkey;
	// 设置ssh连接的远程端口
	private int port = 22;
	//超时时间
	private int timeout = 3600 * 72 * 1000;
	// 保存输出内容的容器
	private ArrayList<String> stdout;
	// 保存输出错误的容器
	private ArrayList<String> stderr;

	/**
	 * 初始化登录信息
	 * 
	 * @param ip
	 * @param username
	 * @param password
	 */
	public SecureShell(final String ip, final String username, final String password, final String prvkey) {
		this.ip = ip;
		this.username = username;
		this.password = password;
		this.prvkey = prvkey;
		stdout = new ArrayList<String>();
		stderr = new ArrayList<String>();
	}
	
	public SecureShell(final String ip, final String username, final String password, final String prvkey, final int port) {
		this.ip = ip;
		this.username = username;
		this.password = password;
		this.prvkey = prvkey;
		this.port = port;
		stdout = new ArrayList<String>();
		stderr = new ArrayList<String>();
	}

	/**
	 * 执行shell命令
	 * 
	 * @param command
	 * @return
	 */
	public int execute(final String command) {
		int returnCode = -1;
		JSch jsch = new JSch();
		JwUserInfo userInfo = new JwUserInfo();

		try {
			// 设置免密登录密钥路径
//			jsch.addIdentity(prvkey);
			
			// 创建session并且打开连接，因为创建session之后要主动打开连接
			Session session = jsch.getSession(username, ip, port);
			session.setPassword(password);
			session.setUserInfo(userInfo);
			//不使用的是图形界面进行交互，跳过检测，否则会报错
			Properties config = new Properties();
			config.put("StrictHostKeyChecking", "no");
			// 为Session对象设置properties
			session.setConfig(config);
			//72个小时
			session.setTimeout(timeout);
			session.connect(timeout);
			
			// 打开通道，设置通道类型，和执行的命令
			Channel channel = session.openChannel("exec");
			ChannelExec channelExec = (ChannelExec) channel;
			channelExec.setCommand(command);
			
			channelExec.setInputStream(null);
//			channelExec.setErrStream(System.err);
			BufferedReader error = new BufferedReader(new InputStreamReader(channelExec.getErrStream(), Charset.forName(charset)));
			BufferedReader input = new BufferedReader(new InputStreamReader(channelExec.getInputStream(), Charset.forName(charset)));
			
			channelExec.connect(timeout);
			System.out.println(ip + ":"+port+" The remote exec command is :" + command);
			
			// 接收远程服务器执行命令的结果
			String line;
			while ((line = input.readLine()) != null) {
//				System.out.println(line);
				stdout.add(line);
			}
			input.close();
			
			String lineError;
			while ((lineError = error.readLine()) != null) {
				stderr.add(lineError);
			}
			error.close();
			
			// 得到returnCode
			channelExec.isClosed();
			if (channelExec.isClosed()) {
				returnCode = channelExec.getExitStatus();
				System.out.println("returnCode============================="+returnCode);
			}
			
			// 关闭通道
			channelExec.disconnect();
			// 关闭session
			session.disconnect();

		} catch (JSchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnCode;
	}
	
	public int executeNoInputStream(final String command) {
		int returnCode = -1;
		JSch jsch = new JSch();
		JwUserInfo userInfo = new JwUserInfo();

		try {
			// 创建session并且打开连接，因为创建session之后要主动打开连接
			Session session = jsch.getSession(username, ip, port);
			session.setPassword(password);
			session.setUserInfo(userInfo);
			//不使用的是图形界面进行交互，跳过检测，否则会报错
			session.setConfig("StrictHostKeyChecking", "no");
			//10个小时
			session.setTimeout(timeout);
			session.connect(timeout);
			
			// 打开通道，设置通道类型，和执行的命令
			Channel channel = session.openChannel("exec");
			ChannelExec channelExec = (ChannelExec) channel;
			channelExec.setCommand(command);

			channelExec.setInputStream(null);
			BufferedReader error = new BufferedReader(new InputStreamReader(channelExec.getErrStream(), Charset.forName(charset)));

			channelExec.connect(timeout);
			System.out.println(ip + ":"+port+" The remote exec command is :" + command);

			// 接收远程服务器执行命令的结果
			stdout.add("");
			
			String lineError;
			while ((lineError = error.readLine()) != null) {
				stderr.add(lineError);
			}
			error.close();

			// 得到returnCode
			channelExec.isClosed();
			if (channelExec.isClosed()) {
				returnCode = channelExec.getExitStatus();
				System.out.println("returnCode============================="+returnCode);
			}
			
			// 关闭通道
			channelExec.disconnect();
			// 关闭session
			session.disconnect();

		} catch (JSchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnCode;
	}
	
	public int shell(final String command) {
		int returnCode = -1;
		JSch jsch = new JSch();
		JwUserInfo userInfo = new JwUserInfo();

		try {
			// 设置免密登录密钥路径
//			jsch.addIdentity(prvkey);
			
			// 创建session并且打开连接，因为创建session之后要主动打开连接
			Session session = jsch.getSession(username, ip, port);
			session.setPassword(password);
			session.setUserInfo(userInfo);
			//不使用的是图形界面进行交互，跳过检测，否则会报错
			Properties config = new Properties();
			config.put("StrictHostKeyChecking", "no");
			// 为Session对象设置properties
			session.setConfig(config);
			//72个小时
			session.setTimeout(timeout);
			session.connect(timeout);
			
			// 打开通道，设置通道类型，和执行的命令
			Channel channel = session.openChannel("shell");
			ChannelShell channelShell = (ChannelShell) channel;
			
			channelShell.setInputStream(null);
			BufferedReader input = new BufferedReader(new InputStreamReader(channelShell.getInputStream(), Charset.forName(charset)));
			DataOutputStream dataOut = new DataOutputStream(channel.getOutputStream());
			
			channelShell.connect(timeout);
			System.out.println(ip + ":"+port+" The remote shell command is :" + command);
			
			// send ls command to the server
		    dataOut.writeBytes(command + " \r\n");
		    dataOut.flush();
		    dataOut.writeBytes("exit \r\n");
		    dataOut.flush();
			
			// 接收远程服务器执行命令的结果
			String line;
			while ((line = input.readLine()) != null) {
//				System.out.println(line);
				stdout.add(line);
			}
			
			input.close();
			dataOut.close();
			
			// 得到returnCode
			channelShell.isClosed();
			if (channelShell.isClosed()) {
				returnCode = channelShell.getExitStatus();
				System.out.println("returnCode============================="+returnCode);
			}
			
			// 关闭通道
			channelShell.disconnect();
			// 关闭session
			session.disconnect();

		} catch (JSchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnCode;
	}
	
	/**
	 * get stdout
	 * @return
	 */
	public ArrayList<String> getStandardOutput() {
		return stdout;
	}

	public ArrayList<String> getStandardError() {
		return stderr;
	}
	
	public static void main(final String[] args) {
//		SecureShell shell = new SecureShell("192.168.18.217", "root", "sFAQRqsR");
//		shell.execute("uname -s -r -v");
//		shell.execute("/softwares/shell/testbash.sh");
		
		
		//生成本地的公钥私钥
		//ssh-keygen -f id_rsa_31 -t rsa -P ""
		//将公钥copy到目标机器上
		//设置本地登录的私钥路径
		//免密登录测试
		//ssh -o StrictHostKeyChecking=no root@postgreMaster
		
//		long invokerStart = System.nanoTime();
//		SecureShell shell = new SecureShell("postgreMaster", "root", "zh123456", "");
//		shell.execute("bash /software/pg_backup_all.sh ");
//		ArrayList<String> stdout = shell.getStandardOutput();
//		for (String str : stdout) {
//			System.out.println(str);
//		}
//		long invokerEnd = System.nanoTime();
//		long invokerElapsed = invokerEnd - invokerStart;
//		BigDecimal b1 = BigDecimal.valueOf(invokerElapsed);
//		System.err.println("耗时============"+b1.divide(BigDecimal.valueOf(1000*1000))+"ms");
		
		SecureShell shell = new SecureShell("postgreMaster", "root", "zh123456", "");
		int returnCode = shell.shell("ls");
	}
}
