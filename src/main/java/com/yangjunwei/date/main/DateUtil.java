package com.yangjunwei.date.main;

import java.util.Date;

public class DateUtil {

	public static int getAge(int src) {
		Date date = new Date();
		int a=98;
		int year = date.getYear();
		int b=year-a;
		System.out.println(b);
		return src;
		
		
		
	}
	public static Date getDateByMonthInit (Date src) {
		
		String a="2019-09-19 19:29:39";
		String substring = a.substring(0, 4);
		int i = a.length();
		if(a.substring(8, 19) != null) {
			System.out.println("2019-09-01 00:00:00");
		}
		System.out.println(i);
		System.out.println(substring);
		
		return src;
		
		
	}
	public static int getDaysByFuture (Date future) {
		Date date = new Date();
		int a=26;
		int year = date.getDay();
		int b=year-a;
		System.out.println(year);
		return b;
		
	}
	
}
