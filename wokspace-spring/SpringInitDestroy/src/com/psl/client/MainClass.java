package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.HelloWorld;
import com.psl.pojo.Person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		HelloWorld obj = (HelloWorld)context.getBean("helloworld");
		System.out.println(obj.sayHello());
		
		Person person = (Person)context.getBean("person");
		person.setName("Riya");
		/*System.out.println("hashcode first = "+person.hashCode());
		System.out.println("name= "+person.getName());
		System.out.println("Home city= "+person.getHomeAddress().getCity());
		System.out.println("Home pincode= "+person.getHomeAddress().getPincode());
		System.out.println("Office city= "+person.getOfficeAddress().getCity());
		System.out.println("Office pincode= "+person.getOfficeAddress().getPincode());
		*/
		Person ref1 = (Person)context.getBean("person");
		System.out.println("hashcode 2nd : "+ref1.getName());
	}

}
