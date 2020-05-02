package com.ms.act.CurrencyConvert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.act.CurrencyConvert.model.ResponseConFactor;

@Service
public class CurrencyConvertService {

	@Autowired
	ConvertFactorServiceproxy convertFactorServiceproxy;

	public String calculateConvertAmount(Integer amount, String fromCurrency, String toCurrency) {

		float fromFactor = 1 , toFactor = 1, finalAmount , usdAmount ;
		ResponseConFactor responseFromFactor = convertFactorServiceproxy.getConversionFactor(fromCurrency);
		if(responseFromFactor !=null) {
			fromFactor = Float.parseFloat(responseFromFactor.getCONVERSIONFACTOR());
		}

		responseFromFactor = convertFactorServiceproxy.getConversionFactor(toCurrency);
		if(responseFromFactor !=null) {
			toFactor = Float.parseFloat(responseFromFactor.getCONVERSIONFACTOR());
		}

		System.out.println("From " + fromFactor + " to " + toFactor);
		
		usdAmount = amount * fromFactor;
		System.out.println("us dollar "+usdAmount);

		finalAmount = usdAmount / toFactor ;
		System.out.println("final amount "+finalAmount);
		
		return ""+finalAmount;
	}

}
