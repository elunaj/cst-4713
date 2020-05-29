package com.zetcode.bean;

import java.util.Objects;

public class Group {
    
    private String group;
    private String name;
    private String city;
    private String month;
    private float pricePaid;
    private float vendorPrice;
    private float income;
    
    
	public Group(String group, String name, String city, String month, 
			float pricePaid, float vendorPrice, float income) {
		super();
		this.group = group;
		this.name = name;
		this.city = city;
		this.month = month;
		this.pricePaid = pricePaid;
		this.vendorPrice = vendorPrice;
		this.income = income;
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public float getPricePaid() {
		return pricePaid;
	}

	public void setPricePaid(float pricePaid) {
		this.pricePaid = pricePaid;
	}

	public float getVendorPrice() {
		return vendorPrice;
	}

	public void setVendorPrice(float vendorPrice) {
		this.vendorPrice = vendorPrice;
	}

	public float getIncome() {
		return income;
	}

	public void setIncome(float income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Group [group=" + group + ", name=" + name + ", city=" + city + ", month=" + month
				+ ", pricePaid=" + pricePaid + ", vendorPrice=" + vendorPrice + ", income=" + income + "]";
	}

	
    
}

