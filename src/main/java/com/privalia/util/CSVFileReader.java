package com.privalia.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.privalia.model.SharesInfo;


public class CSVFileReader {


private CSVFileReader() {
	
}

public static synchronized ArrayList<SharesInfo> loadCSV(String fileName) throws IOException {
	   BufferedReader br = null;
	   String[] data = null;
	   String cvsSplitBy = ";";
	   SharesInfo stockObj = null;
	   ArrayList<SharesInfo> stockDates = new ArrayList<SharesInfo>();
	   
	   try {
	       br = new BufferedReader(new FileReader(fileName));
		   String line = br.readLine();
	       while (null != line) {  
	    	   	    	   
	          data = line.split(cvsSplitBy, 3);
	          
	          if (!data[0].equals("Fecha")) {
	        	  stockObj = new SharesInfo(data[0], data[1], data[2]);
	        	  
	        	  stockDates.add(stockObj);
	          }
	          line = br.readLine();
	          System.out.println(stockObj);
	       }
	   } catch (FileNotFoundException e) {
	       e.printStackTrace();
	   } catch (IOException e) {
	       e.printStackTrace();
	   } finally {
	       if (br != null) {
	           try {
	               br.close();
	           } catch (IOException e) {
	               e.printStackTrace();
	           }
	       }
	   }

    return stockDates;
	}

}