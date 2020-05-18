package com.springcloud.feign.model;

public class CurrencyExc {
	private String country;    
	private String conversionfactor;
	private double convertedAmt;

	public String getConversionfactor() {
		return conversionfactor;
	}

	public double getConvertedAmt() {
		return convertedAmt;
	}

	public void setConvertedAmt(double convertedAmt) {
		this.convertedAmt = convertedAmt;
	}

	public void setConversionfactor(String conversionfactor) {
		this.conversionfactor = conversionfactor;
	}

	public CurrencyExc() {

	}

	public CurrencyExc(String firstName, String lastName) {
		this.country = country;
		this.conversionfactor = conversionfactor;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "CurrencyExc [country=" + country + ", conversionfactor=" + conversionfactor + ", convertedAmt="
				+ convertedAmt +  "]";
	}



}
