package com.ms.act.CurrencyConvert.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.act.CurrencyConvert.service.CurrencyConvertService;

@RestController
@RequestMapping("/currency")
public class CurrencyConvertController {
	
	@Autowired
	private CurrencyConvertService currencyConvertService;
	
	@GetMapping("/conversion/{amount}/{fromCurrency}/{toCurrency}")
	public String convertAmount(@PathVariable Integer amount , @PathVariable String fromCurrency , @PathVariable String toCurrency) {
		return "Converted value : "+currencyConvertService.calculateConvertAmount(amount, fromCurrency, toCurrency);
	}

}
