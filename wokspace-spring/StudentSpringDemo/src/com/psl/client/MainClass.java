package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student obj = (Student)context.getBean("student");
		System.out.println("Id: "+obj.getStudId()+"\tname: "+obj.getName()+"\tage: "+obj.getAge());
	}

}
