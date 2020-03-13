package com.psl.shop.service;

import java.util.HashMap;
import java.util.List;

import com.psl.shop.bean.ShoppingDetails;
import com.psl.shop.bean.UserDetails;

public interface ShoppingService {
	public Boolean isValidUser(UserDetails user);
	public List<ShoppingDetails> getShoppingDetails();
	public HashMap<String,List<ShoppingDetails>> getCartDetails();
	public List<ShoppingDetails> getItemById(int itemId);
}
