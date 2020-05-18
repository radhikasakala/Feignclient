package com.springcloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.feign.model.Currency;
import com.springcloud.feign.model.CurrencyExc;

// Application url - localhost:9191/feign/getGreetings/en

@RestController
@RequestMapping(value= "/feign")
public class Feignclientcontroller {

	
	@Autowired
	private ConvertCurConversion convertConversion;

		@GetMapping("/convert/{country}/{amount}")
	@HystrixCommand(fallbackMethod= "defaultResponse")
	public CurrencyExc  getCurrencyConv(@PathVariable(value = "country") String country,
			@PathVariable(value = "amount") double amount) {
		System.out.println("country fiegnclient name.."+country);
		double convertedAmount=0;
		Currency currency = convertConversion.getCurrencyConv(country);
		System.out.println("convertion factor"+currency.getConversionfactor());
		if(country.equals("INR"))
			convertedAmount = amount;
		if(country.equals("US"))
			convertedAmount = amount * 76;
		if(country.equals("UK"))
			convertedAmount = amount * 94;
		System.out.println("convertedAmount..."+convertedAmount);
		CurrencyExc curex = new CurrencyExc();
		curex.setCountry("India");
		curex.setConversionfactor("INR");
		curex.setConvertedAmt(convertedAmount);

		//return new ResponseEntity<String>(response, HttpStatus.OK)
		//System.out.println("response ..."+.getBody());;
		return curex;
	}
	/*public ResponseEntity<String> defaultResponse(String err,double dd) {
		System.out.println("You are seeing this fallback response because the underlying microservice is down.");
		err = "Fallback error as the microservice is down.";
		return new ResponseEntity<String>(err, HttpStatus.INTERNAL_SERVER_ERROR);
	}*/
	
	
	public CurrencyExc defaultResponse(String err,double dd) {
		System.out.println("You are seeing this fallback response because the underlying microservice is down.");
		err = "Fallback error as the microservice is down.";
		return null;
	}
}