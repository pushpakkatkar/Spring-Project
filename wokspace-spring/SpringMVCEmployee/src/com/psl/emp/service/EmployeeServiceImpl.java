package com.psl.emp.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.psl.emp.bean.Employee;
import com.psl.emp.dao.EmployeeDao;

public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return dao.getEmployeeById(empId);
	}

	@Override
	public HashMap<Integer, Employee> getAllEmployees() {
		return dao.getAllEmployees();
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	@Override
	public Employee removeEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.removeEmployee(empId);
	}

}
