package com.psl.shop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;

import com.psl.shop.bean.ShoppingDetails;
import com.psl.shop.bean.UserDetails;

@Repository("dao")
public class ShoppingDaoImpl implements ShoppingDao{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	
	@Autowired
	DataSource datasource;
	
	@PostConstruct
	public void init()
	{
		this.setDataSource(datasource);
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
	public Boolean isValidUser(UserDetails user) {
		// TODO Auto-generated method stub
		HashMap<String, String> userMap = new HashMap<String, String>();
		Boolean flag = false;
		String sql = "select * from userDetailsShopping";
		List<UserDetails> userList = this.getJdbcTemplateObject().query(sql, new RowMapper<UserDetails>(){

			@Override
			public UserDetails mapRow(ResultSet rs, int row)
					throws SQLException {
				// TODO Auto-generated method stub
				UserDetails userObj = new UserDetails();
				userObj.setUsername(rs.getString(1));
				userObj.setPassword(rs.getString(2));
				return userObj;
			}
			
		});
		for(UserDetails i : userList)
		{
			if(i.getUsername().equals(user.getUsername()) && i.getPassword().equals(user.getPassword()))
			{
				flag = true;
				break;
			}
		}
		return flag;
				
	}

	@Override
	public List<ShoppingDetails> getShoppingDetails() {
		// TODO Auto-generated method stub
		
		String sql = "select * from itemDetails";
		List<ShoppingDetails> userList = this.getJdbcTemplateObject().query(sql, new RowMapper<ShoppingDetails>(){

			@Override
			public ShoppingDetails mapRow(ResultSet rs, int row)
					throws SQLException {
				// TODO Auto-generated method stub
				ShoppingDetails shoppingObj = new ShoppingDetails();
				shoppingObj.setItemId(rs.getInt(1));
				shoppingObj.setItemName(rs.getString(2));
				shoppingObj.setItemCost(rs.getInt(3));
				return shoppingObj;
			}			
		});
		return userList;
	}

	@Override
	public HashMap<String, List<ShoppingDetails>> getCartDetails() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<ShoppingDetails> getItemById(int itemId) {
		// TODO Auto-generated method stub
		List<ShoppingDetails> itemList = new ArrayList<ShoppingDetails>();
		ShoppingDetails shoppingObj = new ShoppingDetails();
		if(shoppingObj.getItemId() == itemId)
		{
			itemList.add(shoppingObj);
		}
		return itemList;
	}

}
