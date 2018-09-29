package com.test.utils;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.privalia.util.GetLastThursday;

public class GetLastThursdayTest {

	private Date lastThursday;
	
	SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
	
	public void setTest() throws ParseException {
		
		
		lastThursday = dt.parse("27-09-2018");	
	}
	
	
	
	@Test
	public void compareThursdays() throws ParseException {
		
		setTest();
		
		
		
		assertEquals(dt.parse(GetLastThursday.getLastThursday(9,2018).toString()), lastThursday);
		
		//System.out.println(lastThursday);
	}
}
