package com.ms.act.CurrencyConvert.service;

import org.springframework.stereotype.Component;

import com.ms.act.CurrencyConvert.model.RequestConFactor;
import com.ms.act.CurrencyConvert.model.ResponseConFactor;

@Component
public class ConvertFactorServiceFallback implements ConvertFactorServiceproxy {

	@Override
	public ResponseConFactor calculateConvertedAmount(RequestConFactor dRequest) {

		return null;
	}

}
