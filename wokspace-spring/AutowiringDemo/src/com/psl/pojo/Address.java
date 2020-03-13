package com.psl.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("address")
public class Address {
	String city,pincode;
	public Address() {
		// TODO Auto-generated constructor stub
		city = "Pune";
		pincode = "411034";
	}
	public Address(String city, String pincode) {
		
		this.city = city;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	@Autowired
	public void setCity(@Value("Goa")String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	@Autowired
	public void setPincode(@Value("758911")String pincode) {
		this.pincode = pincode;
	}
	
}
