package com.psl.tx.dao;

import java.util.List;

import javax.sql.DataSource;

import com.psl.tx.bean.StudentMarks;

public interface StudentDao {

	public void setDataSource(DataSource ds);
	public List<StudentMarks> listStudent();
	public void create(Integer stuId,String name,Integer age,Integer marks,Integer year);
}
