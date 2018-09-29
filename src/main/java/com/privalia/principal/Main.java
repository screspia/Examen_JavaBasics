
package com.privalia.principal;

import java.io.IOException;
import java.util.ArrayList;
import com.privalia.dao.StocksDao;
import com.privalia.model.SharesInfo;

public class Main {
	
	public static void main(String[] args) throws IOException {

		StocksDao stockObj = new StocksDao();
		
		try {
			ArrayList<SharesInfo> stockList = null;
			
			stockList = stockObj.CalculateShares();
			
			for (SharesInfo num : stockList) { 		      
		           System.out.println(num); 		
		      }
			//System.out.println(stockList);
		} catch (IOException e) {
			System.out.println(" Unable to calculate share values ");
		}
	}
}