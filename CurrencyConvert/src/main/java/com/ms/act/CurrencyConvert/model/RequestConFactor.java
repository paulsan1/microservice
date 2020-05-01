package com.ms.act.CurrencyConvert.model;

public class RequestConFactor {

	private String CURRENCY;
	private String COUNTRY;
	private String CONVERSIONFACTOR;

	
	public RequestConFactor( String cURRENCY, String cOUNTRY, String cONVERSIONFACTOR) {
		super();
		CURRENCY = cURRENCY;
		COUNTRY = cOUNTRY;
		CONVERSIONFACTOR = cONVERSIONFACTOR;
	}

	public String getCURRENCY() {
		return CURRENCY;
	}

	public void setCURRENCY(String cURRENCY) {
		CURRENCY = cURRENCY;
	}

	public String getCOUNTRY() {
		return COUNTRY;
	}

	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}

	public String getCONVERSIONFACTOR() {
		return CONVERSIONFACTOR;
	}

	public void setCONVERSIONFACTOR(String cONVERSIONFACTOR) {
		CONVERSIONFACTOR = cONVERSIONFACTOR;
	}
	
}
