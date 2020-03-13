package com.psl.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("employee")
public class Employee {
	String empId;
	String name;
	@Autowired
	//@Qualifier("addr")
	Address address;
	public Employee() {
		// TODO Auto-generated constructor stub
		empId = "A11500";
		name = "Pushpak";
	}
	public Employee(String empId, String name, Address address) {
	
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
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
