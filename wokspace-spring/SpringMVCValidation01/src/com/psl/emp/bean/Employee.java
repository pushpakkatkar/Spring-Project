package com.psl.emp.bean;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Employee {

	//@NotNull(message="Employee Id is must")
	private int empId;
	@NotEmpty(message="Employee name is required")
	private String empName;
	@Min(value=10000)
	@Max(value=30000)
	private int empSal;
	
	
//	public Employee(int empId, String empName, int empSal) {
//		this.empId = empId;
//		this.empName = empName;
//		this.empSal = empSal;
//	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	
}
