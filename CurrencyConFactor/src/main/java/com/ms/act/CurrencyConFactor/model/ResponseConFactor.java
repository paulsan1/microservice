package com.ms.act.CurrencyConFactor.model;

public class ResponseConFactor extends RequestConFactor{

	private Integer id;
	
	public ResponseConFactor(Integer id ,String cURRENCY, String cOUNTRY, String cONVERSIONFACTOR) {
		super(cURRENCY, cOUNTRY, cONVERSIONFACTOR);
		this.id = id ;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
