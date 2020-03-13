package com.psl.client;

import java.io.ObjectInputStream.GetField;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.psl.pojo.Address;
import com.psl.pojo.Person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* BeanFactory factory = new XmlBeanFactory(new ClassPathResource("config.xml"));*/
		//Person obj = (Person)factory.getBean("person");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Person obj = (Person)context.getBean("person");		
		System.out.println("name = "+obj.getName()+"\taddress city = "+obj.getAddress().getCity()+"\tpincode = "+obj.getAddress().getPincode());
		System.out.println("Age: "+obj.getAge());
		
		
		Address obj1 = (Address)context.getBean("address");
		//System.out.println("\ncity = "+obj1.getCity()+"\t"+"pincode = "+obj1.getPincode());
	}

}
