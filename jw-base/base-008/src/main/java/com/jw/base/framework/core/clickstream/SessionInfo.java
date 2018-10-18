/**   
* @Title: LogSession.java 
* @Package com.jw.base.framework.core.clickstream 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年3月23日 上午9:17:57 
* @version V1.0   
*/
package com.jw.base.framework.core.clickstream;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.UUID;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * ## 类说明：
 * 	描述
 * @author    [bwliu]   
 * @version   [V1.0, 2018年3月23日]
 * @package com.jw.base.framework.core.clickstream
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2018年3月23日|bwliu|新增|LogSession.java新增
*/
//第二次清理出来的Session信息结构如下:
//时间	                IP	            SessionID	请求页面URL	Referal URL
//2015-05-30 19:38:00	192.168.12.130	Session1	/blog/me	www.baidu.com
//2015-05-30 19:39:00	192.168.12.130	Session1	/blog/me/details	www.mysite.com/blog/me
//2015-05-30 19:38:00	192.168.12.40	Session2	/blog/me	www.baidu.com
public class SessionInfo {
	public static class sessionMapper extends Mapper<Object, Text, Text, Text> {

		private Text IPAddr = new Text();
		private Text content = new Text();
//		private NullWritable v = NullWritable.get();
		WebLogParser webLogParser = new WebLogParser();

		public void map(Object key, Text value, Context context) {
			//将一行内容转成string  
			String line = value.toString();
			String[] weblogArry = line.split(" ");
			IPAddr.set(weblogArry[0]);
			content.set(line);
			try {
				//根据ip来分组  
				context.write(IPAddr, content);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static class sessionReducer extends Reducer<Text, Text, Text, NullWritable> {
//		private Text IPAddr = new Text();
		private Text content = new Text();
		private NullWritable v = NullWritable.get();
		WebLogParser webLogParser = new WebLogParser();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SessionParser sessionParser = new SessionParser();

		int i = 0;
		
		@Override
		protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
			System.out.println(i);
			i++;
			Date sessionStartTime = null;
			String sessionID = UUID.randomUUID().toString();
			//将IP地址所对应的用户的所有浏览记录按时间排序  
			ArrayList<WebLogSessionBean> sessionBeanGroup = new ArrayList<WebLogSessionBean>();
			for (Text browseHistory : values) {
				System.out.println("browseHistory::"+browseHistory.toString());
				WebLogSessionBean sessionBean = sessionParser.loadBean(browseHistory.toString());
				sessionBeanGroup.add(sessionBean);
			}
			Collections.sort(sessionBeanGroup, new Comparator<WebLogSessionBean>() {
				public int compare(WebLogSessionBean sessionBean1, WebLogSessionBean sessionBean2) {
					Date date1 = sessionBean1.getTimeWithDateFormat();
					Date date2 = sessionBean2.getTimeWithDateFormat();
					if (date1 == null && date2 == null)
						return 0;
					return date1.compareTo(date2);
				}
			});

			for (WebLogSessionBean sessionBean : sessionBeanGroup) {
				if (sessionStartTime == null) {
					//当天日志中某用户第一次访问网站的时间  
					sessionStartTime = timeTransform(sessionBean.getTime());
					content.set(sessionParser.parser(sessionBean, sessionID));
					try {
						context.write(content, v);
					} catch (IOException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					Date sessionEndTime = timeTransform(sessionBean.getTime());
					long sessionStayTime = timeDiffer(sessionStartTime, sessionEndTime);
					if (sessionStayTime > 30 * 60 * 1000) {
						//将当前浏览记录的时间设为下一个session的开始时间  
						sessionStartTime = timeTransform(sessionBean.getTime());
						sessionID = UUID.randomUUID().toString();
						continue;
					}
					content.set(sessionParser.parser(sessionBean, sessionID));
					try {
						context.write(content, v);
					} catch (IOException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

		private Date timeTransform(String time) {
			Date standard_time = null;
			try {
				standard_time = sdf.parse(time);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return standard_time;
		}

		private long timeDiffer(Date start_time, Date end_time) {
			long diffTime = 0;
			diffTime = end_time.getTime() - start_time.getTime();
			return diffTime;
		}

	}

	public static void main(String[] args) throws Exception {

		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://Master.Hadoop:9000");

		Job job = Job.getInstance(conf);
		job.setJarByClass(LogClean.class);

		//指定本业务job要使用的mapper/Reducer业务类  
		job.setMapperClass(sessionMapper.class);
		job.setReducerClass(sessionReducer.class);

		//指定mapper输出数据的kv类型  
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);

		//指定最终输出的数据的kv类型  
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(NullWritable.class);

		Date curDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		String dateStr = sdf.format(curDate);

		//指定job的输入原始文件所在目录  
		FileInputFormat.setInputPaths(job, new Path("/clickstream/cleandata/" + dateStr + "/*"));
		//指定job的输出结果所在目录  
		FileOutputFormat.setOutputPath(job, new Path("/clickstream/sessiondata/" + dateStr + "/"));

		//将job中配置的相关参数，以及job所用的java类所在的jar包，提交给yarn去运行  

		boolean res = job.waitForCompletion(true);
		System.out.println("res===================" + res);
		System.exit(res ? 0 : 1);
	}
}
