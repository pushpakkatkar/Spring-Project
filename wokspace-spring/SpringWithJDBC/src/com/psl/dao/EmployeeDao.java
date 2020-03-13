package com.psl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.psl.bean.Employee;
import com.psl.util.DBUtil;

public class EmployeeDao {
	//DataSource dataSource;
	public EmployeeDao() {
		// TODO Auto-generated constructor stub
		//con = DBUtil.getConnect();
	}
	JdbcTemplate jdbcTemplate;
	/*public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	*/
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	/*
	public boolean insert(Employee bean)
	{
		String sql = "INSERT INTO Employee_new VALUES(?,?,?,?)";
		boolean flag = false;
		try{
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bean.getEmpId());
			pstmt.setString(2, bean.getEmpName());
			pstmt.setInt(3, bean.getEmpSal());
			pstmt.setString(4, bean.getDesignation());
			int row = pstmt.executeUpdate();
			if(row>0)
				flag = true;
			
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return flag;
	}
	
	public ArrayList<Employee> getAllEmployees()
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		String sql = "SELECT * FROM Employee_new";
		try{
			Connection con = dataSource.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmpSal(rs.getInt(3));
				emp.setDesignation(rs.getString(4));
				list.add(emp);
			}
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return list;
	}
	*/
	public Boolean insert(final Employee bean)
	{
		String sql = "INSERT INTO employee_new VALUES(?,?,?,?)";
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt)
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, bean.getEmpId());
				pstmt.setString(2, bean.getEmpName());
				pstmt.setInt(3,bean.getEmpSal());
				pstmt.setString(4, bean.getDesignation());
				int row =  pstmt.executeUpdate();
				if(row>0)
					return true;
				else
					return false;
			}
			
		});
	}
	public List<Employee> getAllEmployees()
	{
		String sql = "SELECT * from employee_new";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Employee>>() {
			List<Employee> list = new ArrayList<Employee>();
			@Override
			public List<Employee> extractData(ResultSet rs)
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				while(rs.next())
				{
					Employee emp = new Employee();
					emp.setEmpId(rs.getInt(1));
					emp.setEmpName(rs.getString(2));
					emp.setEmpSal(rs.getInt(3));
					emp.setDesignation(rs.getString(4));
					list.add(emp);
				}
				return list;
			}
		});
	}
	public List<Employee> getAllUsingRowMapper()
	{
		String sql = "SELECT * FROM employee_new";
		return jdbcTemplate.query(sql, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int row)
					throws SQLException {
				// TODO Auto-generated method stub				
					Employee emp = new Employee();
					emp.setEmpId(rs.getInt(1));
					emp.setEmpName(rs.getString(2));
					emp.setEmpSal(rs.getInt(3));
					emp.setDesignation(rs.getString(4));
				return emp;
			}
		});
	}
	
	public int updateEmployee(Employee bean)
	{
		String sql = "UPDATE employee_new SET empSal = ? WHERE empId = ?";
		return jdbcTemplate.update(sql,new Object[]{bean.getEmpSal(),bean.getEmpId()});
	}
	public int deleteEmployee(Employee bean)
	{
		String sql = "DELETE FROM employee_new WHERE empId = ?";
		return jdbcTemplate.update(sql,new Object[]{bean.getEmpId()});
	}
}
