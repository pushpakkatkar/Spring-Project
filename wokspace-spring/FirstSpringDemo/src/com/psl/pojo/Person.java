package com.psl.pojo;

public class Person {
	String name;
	Address address;
	int age;
	public Person()
	{
		System.out.println("default constr");
		name = "Saara";
	}
	
	public Person(String name,Address address,int age)
	{
		System.out.println("Parameterized constr");
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
