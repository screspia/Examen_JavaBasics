package com.privalia.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.privalia.model.SharesInfo;
import com.privalia.util.CSVFileReader;

public class StocksDao {
	static Properties prop = new Properties();
	
	static String fileName;
	
	static {
		try {
			prop.load(new FileInputStream("config.properties"));
			fileName = prop.getProperty("filename");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<SharesInfo> CalculateShares() throws IOException {
		return CSVFileReader.loadCSV(fileName);
		
	}
}
