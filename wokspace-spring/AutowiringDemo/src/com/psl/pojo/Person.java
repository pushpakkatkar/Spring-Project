package com.psl.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("person")
public class Person {
	
	String name;
	@Autowired
	//@Qualifier("addr")
	Address address;
	public Person() {
		// TODO Auto-generated constructor stub
		name="Riya";
	}
	public Person(String name,Address address)
	{
		this.name =name;
		this.address = address;
	}
	public Person(Address address)
	{
		
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
//	@Autowired
//	public void setName(@Value("Preeti")String name) {
//		this.name = name;
//	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
