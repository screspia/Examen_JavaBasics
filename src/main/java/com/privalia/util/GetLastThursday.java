package com.privalia.util;

import java.util.Calendar;
import java.util.Date;

public class GetLastThursday {

	public static int getLastThursday( int month, int year ) {
		   Calendar cal = Calendar.getInstance();
		   cal.set( year, month + 1, 1 );
		   cal.add( Calendar.DAY_OF_MONTH, -( cal.get( Calendar.DAY_OF_WEEK ) % 7 + 2 ) );
		   System.out.println(cal.getTime());
		   return cal.get(Calendar.DAY_OF_MONTH);
		}

}
