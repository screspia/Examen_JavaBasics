package com.privalia.util;

import java.util.Calendar;
import java.util.Date;

public class GetNextDay {
	
	public static Date getNextDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();
	}
	
	public static Date getNextDayFromThursday(int month, int year) {
		Date lastThursday = GetLastThursday.getLastThursday(month, year);
		return getNextDay(lastThursday);
	}
}
