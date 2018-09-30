package com.privalia.model;

import java.math.BigDecimal;

public class SharesInfo {

	String date;
	BigDecimal closure;
	BigDecimal openning;
	
	public void SharesInfo() {
		
	}
	
	public SharesInfo(String date, String closePrice, String openPrice) {
		this.date = date;
		this.closure = new BigDecimal(closePrice);
		this.openning = new BigDecimal(openPrice);
	}

    @Override
    public String toString() {
        return "Information: " + date + " " + closure + " " + openning;
    }
	
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the closure
	 */
	public BigDecimal getClosure() {
		return closure;
	}

	/**
	 * @param closure the closure to set
	 */
	public void setClosure(BigDecimal closure) {
		this.closure = closure;
	}

	/**
	 * @return the openning
	 */
	public BigDecimal getOpenning() {
		return openning;
	}

	/**
	 * @param openning the openning to set
	 */
	public void setOpenning(BigDecimal openning) {
		this.openning = openning;
	}

}
