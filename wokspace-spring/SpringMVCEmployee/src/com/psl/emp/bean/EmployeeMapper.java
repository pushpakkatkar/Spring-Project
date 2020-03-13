package com.psl.emp.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Employee empObj = new Employee();
		empObj.setEmpId(rs.getInt(1));
		empObj.setEmpName(rs.getString(2));
		empObj.setEmpSal(rs.getInt(3));
		return null;
	}

}
