
package com.privalia.principal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.privalia.util.CSVFileReader;
import com.privalia.util.GetLastThursday;

public class Main {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));
		
		String csvFile = prop.getProperty("filename");
		CSVFileReader.loadCSV(csvFile);
		
		GetLastThursday.getLastThursday(9,2018);
	   }
}