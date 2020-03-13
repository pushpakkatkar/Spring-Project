package com.psl.emp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;

import com.psl.emp.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	//private PlatformTransactionManager transactionManager;

	static HashMap< Integer, Employee> empMap = new HashMap<Integer,Employee>();
	
	static{
		Employee emp1 = new Employee(110,"Nisha",30000);
		Employee emp2 = new Employee(111,"Rohan",40000);
		Employee emp3 = new Employee(112,"Ganesh",50000);
		Employee emp4 = new Employee(113,"Anant",40000);
		empMap.put(emp1.getEmpId(),emp1);
		empMap.put(emp2.getEmpId(),emp2);
		empMap.put(emp3.getEmpId(),emp3);
		empMap.put(emp4.getEmpId(),emp4);
		
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return empMap.get(empId);
	}

	@Override
	public HashMap<Integer, Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		HashMap<Integer,Employee> emap = new HashMap<Integer, Employee>();
		String sql = "select * from employee_new";
		List<Employee> employee = jdbcTemplateObject.query(sql, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int arg1)
					throws SQLException {
				// TODO Auto-generated method stub
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmpSal(rs.getInt(3));
				return emp;
			}
			
		});
		for(Employee emp : employee)
		{
			emap.put(emp.getEmpId(),emp);
		}
		return emap;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empMap.put(emp.getEmpId(), emp);		
		return emp;
	}

	@Override
	public Employee removeEmployee(int empId) {
		// TODO Auto-generated method stub
		return empMap.remove(empId);
	}

}
