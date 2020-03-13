package com.psl.tx;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.tx.bean.StudentMarks;
import com.psl.tx.dao.StudentJDBCTemplate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		
		System.out.println("----------Record creation----------");
		studentJDBCTemplate.create(1,"priya",11,99,2010);
		studentJDBCTemplate.create(2,"Nina",20,97,2010);
		studentJDBCTemplate.create(3,"Anay",25,100,2011);
		
		System.out.println("--------Listing all the records-------");
		List<StudentMarks> studentMarks = studentJDBCTemplate.listStudent();
		
		for(StudentMarks record : studentMarks)
		{
			System.out.print("ID : "+record.getId());
			System.out.print(", Name : "+record.getName());
			System.out.println(", Marks : "+record.getMarks());
			System.out.println(", Year : "+record.getYear());
			System.out.println(", Age: "+record.getAge());
		}
	
	}

}
