package com.test.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.privalia.model.SharesInfo;
import com.privalia.util.CSVFileReader;

public class CSVFileReaderTest {
	
	private Date firstDate;
	private Date secondDate;
	private Date thirdDate;
	
	private BigDecimal firstClose;
	private BigDecimal secondClose;
	private BigDecimal thirdClose;
	
	private BigDecimal firstOpen;
	private BigDecimal secondOpen;
	private BigDecimal thirdOpen;
	
	@Test
	public void setTest() throws ParseException {
		SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
		
		firstDate = dt.parse("28-12-2017");
		secondDate = dt.parse("27-12-2017");
		thirdDate = dt.parse("22-12-2017");
		
		firstClose = new BigDecimal("29.17");
		secondClose = new BigDecimal("29.58");
		thirdClose = new BigDecimal("29.615");
		
		firstOpen = new BigDecimal("29.6");
		secondOpen = new BigDecimal("29.705");
		thirdOpen = new BigDecimal("29.66");
		
		
		
	}

	public void readCSVStocks() throws ParseException, IOException {
		List<SharesInfo>  sharesInfoList = CSVFileReader.loadCSV("C:\\Users\\SergiGeneral\\eclipse-workspace\\Exam_JavaBasics\\stocks-ITX.csv");
		
		setTest();
		
		assertEquals(sharesInfoList.get(0).getDate().toString(), firstDate.toString());
		assertEquals(sharesInfoList.get(1).getDate().toString(), secondDate.toString());
		assertEquals(sharesInfoList.get(2).getDate().toString(), thirdDate.toString());
		
		assertEquals(sharesInfoList.get(0).getClosure().toString(), firstClose.toString());
		assertEquals(sharesInfoList.get(1).getClosure().toString(), secondClose.toString());
		assertEquals(sharesInfoList.get(2).getClosure().toString(), thirdClose.toString());
		
		assertEquals(sharesInfoList.get(0).getOpenning().toString(), firstOpen.toString());
		assertEquals(sharesInfoList.get(1).getOpenning().toString(), secondOpen.toString());
		assertEquals(sharesInfoList.get(2).getOpenning().toString(), thirdOpen.toString());
		
		
		System.out.println(" Example of date from file and hard coded date comparison");
		System.out.println(sharesInfoList.get(0).getDate().toString());
		System.out.println(firstDate);
		
		System.out.println(" Example of closure from file and hard coded closure comparison");
		System.out.println(sharesInfoList.get(0).getClosure().toString());
		System.out.println(firstClose);
		
		System.out.println(" Example of closure from file and hard coded openning comparison");
		System.out.println(sharesInfoList.get(0).getOpenning().toString());
		System.out.println(firstOpen);
	}
}
