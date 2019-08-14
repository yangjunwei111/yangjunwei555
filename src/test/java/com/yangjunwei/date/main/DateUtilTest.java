package com.yangjunwei.date.main;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test() {
		
		DateUtil.getAge(0);
	}
	@Test
	public void test2() {
		
		DateUtil.getDateByMonthInit(null);
	}
	@Test
	public void test3() {
		
		DateUtil.getDaysByFuture(null);
	}

}
