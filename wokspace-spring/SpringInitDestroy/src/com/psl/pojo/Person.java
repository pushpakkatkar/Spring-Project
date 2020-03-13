package com.psl.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	String name;
	//List<Address>address;
	//Address officeAddress;
	//Address homeAddress;
	//Map<String,Address>addressmap;
	Set<Address>addressset;
	public Person() {
		// TODO Auto-generated constructor stub
		name = "abc";
		//this.officeAddress = null;
		//this.homeAddress = null;
	}

	/*public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	*/
	
	public Set<Address> getAddressset() {
		return addressset;
	}

	public void setAddressset(Set<Address> addressset) {
		this.addressset = addressset;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/*public Map<String, Address> getAddressmap() {
		return addressmap;
	}

	public void setAddressmap(Map<String, Address> addressmap) {
		this.addressmap = addressmap;
	}
	*/
	/*public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}*/
	
}
