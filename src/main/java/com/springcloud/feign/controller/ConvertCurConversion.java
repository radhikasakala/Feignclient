package com.springcloud.feign.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springcloud.feign.model.Currency;

@FeignClient(name= "m1-service")
//added on 17-05-2020
@RibbonClient(name = "m1-service")
public interface ConvertCurConversion {
	
	@GetMapping("/currency/getcur/{country}")	
	//public CurrencyExc getCurrencyConv(@PathVariable(value = "country") String country);
	Currency getCurrencyConv(@PathVariable(value = "country") String country);

}