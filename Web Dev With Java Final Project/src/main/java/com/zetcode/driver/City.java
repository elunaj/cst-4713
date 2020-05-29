package com.zetcode.driver;

import com.zetcode.bean.Car;

public class City extends Car {

	private String cityId;
	private String regionName;
	private float income;

	public City(String cityId, String regionName, float income) {
		this.cityId = cityId;
		this.regionName = regionName;
		this.income = income;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public float getIncome() {
		return income;
	}

	public void setIncome(float income) {
		this.income = income;
	}
	
	
}
