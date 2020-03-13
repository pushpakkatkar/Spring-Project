package com.psl.emp.service;

import java.util.HashMap;

import com.psl.emp.bean.Employee;

public interface EmployeeService {
	public Employee getEmployeeById(int empId);
	public HashMap<Integer,Employee> getAllEmployees();
	public Employee addEmployee(Employee emp);
	public Employee removeEmployee(int empId);
}
