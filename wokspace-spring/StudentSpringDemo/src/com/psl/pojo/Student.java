package com.psl.pojo;

public class Student {
	String name;
	int age,studId;
	public Student() {
		// TODO Auto-generated constructor stub
		studId = 101;
		name = "Pushpak";
		age = 22;		
	}
	public Student(int studId,String name,int age)
	{
		this.studId = studId;
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	
}
