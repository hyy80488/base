/**
 * Copyright 2016 Joint Wisdom Inc. All Rights Reserved.
 * You may use it ONLY by accepting the License unless writing permission or applicable law is required. 
 * Other un-authorized conditions shall not use freely. 
*/
package com.jw.base.framework.core.util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jw.base.framework.core.util.DateUtil;
/**
 * 
 * ## 类说明：
 * 	日期测试类
 * @author    [jianana]   
 * @version   [V1.0, 2016年12月12日]
 * @package com.jw.platform.framework.core.util
 * @since
日期|作者|类型|内容
:----|:-----|:-----|:-----
2016年12月12日|jianana|新增|DateUtilTest.java新增
 */
public class DateUtilTest {
	
	private Date date;
	private String dateStr;
	
	@Before
	public void initDbunit() throws Exception {
		dateStr = DateUtil.formatDate(DateUtil.getSystemTime(), "yyyy-MM-dd");
		date = DateUtil.parse(dateStr, "yyyy-MM-dd");
	}

	@Test
	public void testGetSystemTime() {
		Date systemTime = DateUtil.getSystemTime();
		Assert.assertNotNull(systemTime);
	}

	@Test
	public void testFormatDate() {
		String dateString = DateUtil.formatDate(date, "yyyy-MM-dd");
		Assert.assertEquals(dateString, dateStr);
	}

	@Test
	public void testParse() throws ParseException {
		Date d = DateUtil.parse(dateStr, "yyyy-MM-dd");
		Assert.assertEquals(d, date);
	}

	@Test
	public void testCompareDate() throws ParseException {
		int c = DateUtil.compareDate(date,date);
		Assert.assertEquals(c, 0);
		
		int c1 = DateUtil.compareDate(DateUtil.parse("2016-01-01", "yyyy-MM-dd"),date);
		Assert.assertEquals(c1, -1);
		
		int c2 = DateUtil.compareDate(date,DateUtil.parse("2016-01-01", "yyyy-MM-dd"));
		Assert.assertEquals(c2, 1);
	}

	@Test
	public void testAddDay() {
		DateUtil.addDay(date, 3);
	}

	@Test
	public void testSetStartDay() {
		Calendar cal = Calendar.getInstance();
		DateUtil.setStartDay(cal);
		Assert.assertEquals(cal.get(Calendar.HOUR_OF_DAY), 0);
		Assert.assertEquals(cal.get(Calendar.MINUTE), 0);
		Assert.assertEquals(cal.get(Calendar.SECOND), 0);
	}

	@Test
	public void testSetEndDay() {
		Calendar cal = Calendar.getInstance();
		DateUtil.setEndDay(cal);
		Assert.assertEquals(cal.get(Calendar.HOUR_OF_DAY), 23);
		Assert.assertEquals(cal.get(Calendar.MINUTE), 59);
		Assert.assertEquals(cal.get(Calendar.SECOND), 59);
	}

	@Test
	public void testGetDateDifference() throws ParseException {
		long l = DateUtil.getDateDifference(DateUtil.parse("2016-01-02", "yyyy-MM-dd"),
				DateUtil.parse("2016-01-01", "yyyy-MM-dd"));
		Assert.assertEquals(l,1440);
	}

	@Test
	public void testGetDaySub() throws ParseException {
		long l = DateUtil.getDaySub("2016-01-01", "2016-01-10");
		Assert.assertEquals(l,9);
	}

	@Test
	public void testCopyYearMonthDay() {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		DateUtil.copyYearMonthDay(cal1, cal2);
		Assert.assertEquals(cal1,cal2);
	}

	@Test
	public void testFormatHhMm() {
		String d = DateUtil.formatHhMm(null, ":");
		Assert.assertEquals(d, "");
		
		String s = DateUtil.formatHhMm("1214", ":");
		Assert.assertEquals(s, "12:14");
		
		String s1 = DateUtil.formatHhMm("12", ":");
		Assert.assertEquals(s1, "00:12");
		
		String s2 = DateUtil.formatHhMm("012", ":");
		Assert.assertEquals(s2, "00:12");
	}

	@Test
	public void testGetFirstDayOfMonth() {
		String s = DateUtil.getFirstDayOfMonth("yyyy-MM-dd");
		Assert.assertEquals(s, "2016-12-01");
	}

	@Test
	public void testGetDefaultDay() {
		String s = DateUtil.getDefaultDay("yyyy-MM-dd");
		Assert.assertEquals(s, "2016-12-31");
	}

	@Test
	public void testGetPreviousMonthFirst() {
		String s = DateUtil.getPreviousMonthFirst(1, "yyyy-MM-dd");
		Assert.assertEquals(s, "2017-01-01");
	}

	@Test
	public void testGetPreviousMonthEnd() {
		String s = DateUtil.getPreviousMonthEnd(1, "yyyy-MM-dd");
		Assert.assertEquals(s, "2017-01-31");
	}

	@Test
	public void testGetSysYear() {
		int y = DateUtil.getSysYear();
		Assert.assertNotNull(y);
		int m = DateUtil.getSysMonth();
		Assert.assertNotNull(m);
		int d = DateUtil.getSysDay();
		Assert.assertNotNull(d);
	}


	@Test
	public void testGetDateSub() throws ParseException {
		long l = DateUtil.getDateSub(DateUtil.parse("2016-01-01", "yyyy-MM-dd"),
				DateUtil.parse("2016-01-02", "yyyy-MM-dd"));
		Assert.assertEquals(l, 1);
	}

	@Test
	public void testGetTimeSub() throws ParseException {
		long l = DateUtil.getTimeSub(DateUtil.parse("2016-01-01", "yyyy-MM-dd"),
				DateUtil.parse("2016-01-02", "yyyy-MM-dd"));
		Assert.assertEquals(l, 86400000);
	}

	@Test
	public void testGetMonthAfter() throws ParseException {
		DateUtil.getMonthAfter(date, 1);
		DateUtil.getHourAfter(date, 1);
		DateUtil.getWeekAfter(date, 1);
		DateUtil.getYearAfter(date, 1);
	}


	@Test
	public void testToChinese() {
		String s = DateUtil.toChinese("2016-12-12");
		Assert.assertEquals(s, "二〇一六年十二月十二日");
	}

	@Test
	public void testGetSplitDateStr() {
		String s = DateUtil.getSplitDateStr("2016-12-12",4);
		Assert.assertEquals(s, "二〇一六");
		
		String s1 = DateUtil.getSplitDateStr("2016-12-12",1);
		Assert.assertEquals(s1, "十二");
		
		String s2 = DateUtil.getSplitDateStr("2016-12-12",2);
		Assert.assertEquals(s2, "十二");
	}

	@Test
	public void testIsNumeric() {
		boolean b = DateUtil.isNumeric("0");
		Assert.assertTrue(b);
		
		boolean b1 = DateUtil.isNumeric("-1");
		Assert.assertFalse(b1);
	}


	@Test
	public void testGetNextMonth() {
		String month = DateUtil.getNextMonth("2016-12");
		Assert.assertEquals(month, "2017-01");
		
		String month1 = DateUtil.getNextMonth("2016-10");
		Assert.assertEquals(month1, "2016-11");
		
		String month2 = DateUtil.getNextMonth("2016-05");
		Assert.assertEquals(month2, "2016-06");
	}

	@Test
	public void testGetLastDay() {
		String month = DateUtil.getLastDay("2016-12");
		Assert.assertEquals(month, "2016-12-31");
		
		String month1 = DateUtil.getLastDay("2016-04");
		Assert.assertEquals(month1, "2016-04-30");
		
		String month2 = DateUtil.getLastDay("2016-02");
		Assert.assertEquals(month2, "2016-02-29");
		
		String month3 = DateUtil.getLastDay("2015-02");
		Assert.assertEquals(month3, "2015-02-28");
		
		String month4 = DateUtil.getLastDay("2000-02");
		Assert.assertEquals(month4, "2000-02-29");
		
		String month5 = DateUtil.getLastDay("1900-02");
		Assert.assertEquals(month5, "1900-02-28");
		
	}

	@Test
	public void testFormDate() {
		String s = DateUtil.formDate("2016-01-01");
		Assert.assertEquals(s, "2016年 01月 01日 ");
	}

	@Test
	public void testParseEnToDate() throws ParseException {
		Date d = DateUtil.parse("01/01/2016", "MM/dd/yyyy");
		Date d1 = DateUtil.parseEnToDate("01/01/2016");
		Assert.assertEquals(d, d1);
	}

	@Test
	public void testFormatDateToEnStr() throws ParseException {
		Date d = DateUtil.parse("01/01/2016", "MM/dd/yyyy");
		String s = DateUtil.formatDateToEnStr(d);
		Assert.assertEquals(s, "01/01/2016");
	}

	@Test
	public void testConvertEnToCnStr() throws ParseException {
		String s = DateUtil.convertEnToCnStr("01/01/2016");
		Assert.assertEquals(s, "2016-01-01");
	}

	@Test
	public void testFormatDateRemoveCon() {
		String s = DateUtil.formatDateRemoveCon(null);
		Assert.assertEquals("", s);
		
		String s1 = DateUtil.formatDateRemoveCon("2016-12-01");
		Assert.assertEquals("20161201", s1);

	}

}
