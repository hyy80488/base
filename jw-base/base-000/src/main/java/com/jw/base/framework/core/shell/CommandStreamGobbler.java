package com.jw.base.framework.core.shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

//Java在执行Runtime.getRuntime().exec(command)之后，Linux会创建一个进程，该进程与JVM进程建立三个管道连接，标准输入流、标准输出流、标准错误流。
//假设linux进程不断向标准输出流和标准错误流写数据，而JVM却不读取，数据会暂存在linux缓存区，当缓存区存满之后导致该进程无法继续写数据，会僵死，导致java进程会卡死在waitFor()处，永远无法结束。
//解决方式：由于标准输出和错误输出都会向Linux缓存区写数据，而脚本如何输出这两种流是Java端不能确定的。为了不让shell脚本的子进程卡死，这两种输出需要分别读取，而且不能互相影响。所以必须新开两个线程来进行读取。

//由于shell脚本的编写问题，当其自身出现僵死的情况，上述代码出现Java代码被僵死的Shell脚本阻塞住的情况。
//原因分析：由于shell脚本也是人写的，难免会出现失误。在Java调用shell脚本时，无论是Debug场景还是生产环境，都发生过shell脚本意外僵死反过来卡死Java相关线程的情况。典型的表现为：shell脚本长时间运行，标准输出和错误输出没有任何输出（包括结束符），操作系统显示shell脚本在正常运行或僵死，没有退出信号。
//解决方式：上述代码中，至少有三处会导致线程阻塞，包括标准输出和错误输出这线程的BufferedReader的readline方法，以及Process的waitFor方法。解决这个问题的核心有两个，1.避免任何Java线程被阻塞住，因为一旦被IO阻塞住，线程将处于内核态，主线程没有任何办法强制结束相关子线程。2.添加一个简单的超时机制，超时后回收相应的线程资源，并结束调用过程。

//在执行shell脚本过程中，可能会添加参数，通常在终端中，我们使用“ ”（空格）把参数隔开。
//为了区分空格是作为参数分隔符，还是参数的一部分。调用exec方法有特别的注意事项。
//如String command = "/home/Lance/workspace/someTest/testbash.sh 'hello world'";
public class CommandStreamGobbler extends Thread {  
	  
    private InputStream is;  
  
    private String command;  
  
    private String prefix = "";  
  
    private boolean readFinish = false;  
  
    private boolean ready = false;  
  
    // 命令执行结果,0:执行中 1:超时  
    private int commandResult = 0;  
  
    private List<String> infoList = new LinkedList<String>();  
  
    CommandStreamGobbler(InputStream is, String command, String prefix) {  
        this.is = is;  
        this.command = command;  
        this.prefix = prefix;  
    }  
  
    @Override
    public void run() {  
        InputStreamReader isr = null;  
        BufferedReader br = null;  
        try {  
            isr = new InputStreamReader(is);  
            br = new BufferedReader(isr);  
            String line = null;  
            ready = true;  
            while (commandResult != 1) {  
                if (br.ready()) {  
                    if ((line = br.readLine()) != null) {  
                        infoList.add(line);  
                        System.out.println(prefix + " line: " + line);  
                    } else {  
                        break;  
                    }  
                } else {  
                    Thread.sleep(1000);  
                }  
            }  
        } catch (IOException | InterruptedException ioe) {  
            System.out.println("正式执行命令：" + command + "有IO异常");  
        } finally {  
            try {  
                if (br != null) {  
                    br.close();  
                }  
                if (isr != null) {  
                    isr.close();  
                }  
            } catch (IOException ioe) {  
                System.out.println("正式执行命令：" + command + "有IO异常");  
            }  
            readFinish = true;  
        }  
    }  
  
    public InputStream getIs() {  
        return is;  
    }  
  
    public String getCommand() {  
        return command;  
    }  
  
    public boolean isReadFinish() {  
        return readFinish;  
    }  
  
    public boolean isReady() {  
        return ready;  
    }  
  
    public List<String> getInfoList() {  
        return infoList;  
    }  
  
    public void setTimeout(int timeout) {  
        this.commandResult = timeout;  
    }  
}  