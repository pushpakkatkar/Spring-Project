package com.psl.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;
import com.psl.dao.EmployeeDao;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao dao = (EmployeeDao)context.getBean("dao");
//		if(dao.insert((Employee)context.getBean("emp1")))
//		{
//			if(dao.insert((Employee)context.getBean("emp2")))
//			{
//				if(dao.insert((Employee)context.getBean("emp3")))
//				{
//					System.out.println("inserted emep1,emp2 & emp3");
//				}
//			}
//		}
//		List<Employee> list = dao.getAllEmployees();
//		for(Employee s : list)
//		{
//			System.out.println(s.getEmpId()+"--"+s.getEmpName()+"--"+s.getEmpSal()+"--"+s.getDesignation());
//		}
		List<Employee> list1 = dao.getAllUsingRowMapper();
		for(Employee s : list1)
		{
			System.out.println(s.getEmpId()+"--"+s.getEmpName()+"--"+s.getEmpSal()+"--"+s.getDesignation());
		}
		int row = dao.updateEmployee((Employee)context.getBean("emp4"));
		System.out.println(row);
		
		dao.updateEmployee((Employee)context.getBean("emp5"));
	}

}
