package com.psl.client;

import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.Address;
import com.psl.pojo.Person;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collect.xml");
		Person obj = (Person)context.getBean("person");
		System.out.println(obj.getName());
		//System.out.println(obj.getAddress());
//		Map<String,Address> map = obj.getAddressmap();
//		Set<String> keys = map.keySet();
//		for(String key : keys)
//		{
//			System.out.println("key = "+key);
//			System.out.println("value = ");
//			System.out.println(map.get(key).getCity());
//			System.out.println(map.get(key).getPincode());
//		}
		Set<Address> set = obj.getAddressset();
		for(Address a : set){
			System.out.println(a.getCity()+" "+a.getPincode());
		}
	}

}
