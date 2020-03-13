package com.psl.tx.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.psl.tx.bean.StudentMarks;
import com.psl.tx.bean.StudentMarksMapper;

public class StudentJDBCTemplate implements StudentDao{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	private PlatformTransactionManager transactionManager;
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		
	}
	@Override
	public List<StudentMarks> listStudent() {
		// TODO Auto-generated method stub
		String SQL = "select *  from Student,Marks where Student.stuId = Marks.sId";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL, new StudentMarksMapper());
		return studentMarks;
	}
	
	public PlatformTransactionManager getTransactionManager() {
		return transactionManager;
	}
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	@Override
	public void create(Integer studId ,String name, Integer age, Integer marks, Integer year) {
		// TODO Auto-generated method stub
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		
		try{
			String SQL1 = "insert into student1(stuName,age) values(?,?)";
			jdbcTemplateObject.update(SQL1,name,age);
			
			String SQL2 = "select max(stuId) from Student";
			int sid = jdbcTemplateObject.queryForInt(SQL2);
			
			String SQL3 = "insert into Marks(sid,marks,year)"+"values(?,?,?)";
			jdbcTemplateObject.update(SQL3,sid,marks,year);
			
			System.out.println("Created Name = "+name+", Age = "+age);
			transactionManager.commit(status);
		}catch(DataAccessException e)
		{
			System.out.println("Error in creatin record, rolling back");
			transactionManager.rollback(status);
			throw e;
		}
		return;
	}
}
