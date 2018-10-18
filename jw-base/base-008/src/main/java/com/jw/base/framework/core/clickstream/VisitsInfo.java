/**   
* @Title: VisitsInfo.java 
* @Package com.jw.base.framework.core.clickstream 
* @Description: TODO(用一句话描述该文件做什么) 
* @author bwliu
* @date 2018年3月23日 上午10:07:12 
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
import java.util.HashMap;
import java.util.Map;

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
2018年3月23日|bwliu|新增|VisitsInfo.java新增
*/
//第四步，再次清洗Session日志，并生成Visits信息表
//第四次清洗日志产生的访问记录表结构如下:
//SessionID	访问时间	                                         离开时间	                                         第一次访问页面	最后一次访问的页面	             访问的页面总数	IP	            Referal
//Session1	2016-05-30 15:17:00	2016-05-30 15:19:00	/blog/me	/blog/others	5	        192.168.12.130	www.baidu.com
//Session2	2016-05-30 14:17:00	2016-05-30 15:19:38	/home	    /profile	    10	        192.168.12.140	www.178.com
//Session3	2016-05-30 12:17:00	2016-05-30 15:40:00	/products	/detail	        6	        192.168.12.150	www.78dm.net
public class VisitsInfo {
	public static class visitMapper extends Mapper<Object, Text, Text, Text> {

		private Text word = new Text();

		public void map(Object key, Text value, Context context) {

			String line = value.toString();
			String[] webLogContents = line.split(" ");
			word.set(webLogContents[3]);
			try {
				//根据session来分组  
				context.write(word, value);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static class visitReducer extends Reducer<Text, Text, Text, NullWritable> {

		private Text content = new Text();
		private NullWritable v = NullWritable.get();
		VisitsInfoParser visitsParser = new VisitsInfoParser();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		PageViewsParser pageViewsParser = new PageViewsParser();

		String entry_URL = "";
		String leave_URL = "";
		int total_visit_pages = 0;
		int i = 0;

		@Override
		protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
			System.out.println(i);
			i++;
			
			Map<String, Integer> viewedPagesMap = new HashMap<String, Integer>();
			
			//将session所对应的所有浏览记录按时间排序 
			ArrayList<String> browseInfoGroup = new ArrayList<String>();
			for (Text browseInfo : values) {
				System.out.println("browseInfo::"+browseInfo.toString());
				browseInfoGroup.add(browseInfo.toString());
			}
			Collections.sort(browseInfoGroup, new Comparator<String>() {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				public int compare(String browseInfo1, String browseInfo2) {
					String dateStr1 = browseInfo1.split(" ")[0] + " " + browseInfo1.split(" ")[1];
					String dateStr2 = browseInfo2.split(" ")[0] + " " + browseInfo2.split(" ")[1];
					Date date1;
					Date date2;
					try {
						date1 = sdf.parse(dateStr1);
						date2 = sdf.parse(dateStr2);
						if (date1 == null && date2 == null)
							return 0;
						return date1.compareTo(date2);
					} catch (ParseException e) {
						e.printStackTrace();
						return 0;
					}
				}
			});

			//统计该session访问的总页面数,第一次进入的页面，跳出的页面            
			for (String browseInfo : browseInfoGroup) {
				String[] browseInfoStrArr = browseInfo.split(" ");
				String curVisitURL = browseInfoStrArr[4];
				Integer curVisitURLInteger = viewedPagesMap.get(curVisitURL);
				if (curVisitURLInteger == null) {
					viewedPagesMap.put(curVisitURL, 1);
				}
			}
			total_visit_pages = viewedPagesMap.size();
			String visitsInfo = visitsParser.parser(browseInfoGroup, total_visit_pages + "");
			content.set(visitsInfo);
			try {
				context.write(content, v);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("");
			System.out.println("");
		}
	}

	public static void main(String[] args) throws Exception {

		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://Master.Hadoop:9000");

		Job job = Job.getInstance(conf);
		job.setJarByClass(VisitsInfo.class);

		//指定本业务job要使用的mapper/Reducer业务类  
		job.setMapperClass(visitMapper.class);
		job.setReducerClass(visitReducer.class);

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
		FileInputFormat.setInputPaths(job, new Path("/clickstream/sessiondata/" + dateStr + "/*"));
		//指定job的输出结果所在目录  
		FileOutputFormat.setOutputPath(job, new Path("/clickstream/visitsinfo/" + dateStr + "/"));

		//将job中配置的相关参数，以及job所用的java类所在的jar包，提交给yarn去运行  

		boolean res = job.waitForCompletion(true);
		System.out.println("res===================" + res);
		System.exit(res ? 0 : 1);

	}
}
