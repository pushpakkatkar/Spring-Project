package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.Employee;
import com.psl.pojo.Person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Person person = (Person)context.getBean("person");
		System.out.println("name    : "+person.getName());
		System.out.println("city    : "+person.getAddress().getCity());
		System.out.println("pincode : "+person.getAddress().getPincode());
		System.out.println("------- Employee Data --------");
//		Employee empObj = (Employee)context.getBean("employee");
//		System.out.println("empId : "+empObj.getEmpId());
//		System.out.println("name : "+empObj.getName());
//		System.out.println("city    : "+empObj.getAddress().getCity());
//		System.out.println("pincode : "+empObj.getAddress().getPincode());
	}

}
