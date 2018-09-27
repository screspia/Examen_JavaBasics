package com.privalia.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CSVFileReader {


private CSVFileReader() {
	
}

public static synchronized String[] loadCSV(String fileName) throws IOException {
	   BufferedReader br = null;
	   String line = "";
	   String[] data = null;
	   String cvsSplitBy = ",";
	   
	   try {
	       br = new BufferedReader(new FileReader(fileName));
	       while ((line = br.readLine()) != null) {                
	           data = line.split(cvsSplitBy);
	           //Imprime datos.
	          System.out.println(data[0]);
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

    return data;
	}

}