package com.springcloud.feign.model;




public class Currency {

	private long id;
	private String country;    
	private String conversionfactor;
	private double convfactamt;


	public double getConvfactamt() {
		return convfactamt;
	}

	public void setConvfactamt(double convfactamt) {
		this.convfactamt = convfactamt;
	}

	public Currency() {

	}

	public Currency(String firstName, String lastName) {
		this.country = country;
		this.conversionfactor = conversionfactor;

	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String getConversionfactor() {
		return conversionfactor;
	}

	public void setConversionfactor(String conversionfactor) {
		this.conversionfactor = conversionfactor;
	}
	 @Override
		public String toString() {
			return "Currency [id=" + id + ", country=" + country + ", conversionfactor=" + conversionfactor + "]";
		}

}