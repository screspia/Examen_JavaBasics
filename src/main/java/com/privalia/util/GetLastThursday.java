package com.privalia.util;

import java.util.Date;
import java.util.Calendar;

public class GetLastThursday {

	public static Date getLastThursday( int month, int year ) {
		   Calendar cal = Calendar.getInstance();
		   cal.set(year, month , 1);
		   cal.add(Calendar.DAY_OF_MONTH, - (cal.get(Calendar.DAY_OF_WEEK) % 7 + 2));
		   System.out.println(cal.getTime());
		   return cal.getTime();
		}

}
