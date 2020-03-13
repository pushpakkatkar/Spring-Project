package com.psl.tx;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class MyClass2 extends JdbcDaoSupport implements MyInterface{

	static int id = 0;
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void method2() {
		// TODO Auto-generated method stub
		String sql = "insert into table1(id,name) values(?,?)";
		this.getJdbcTemplate().update(sql,new Object[]{++id,"name"});
		System.out.println("record added with id = "+id);
		
	}

}
