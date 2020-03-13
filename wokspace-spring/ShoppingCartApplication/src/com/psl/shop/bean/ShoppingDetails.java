package com.psl.shop.bean;

public class ShoppingDetails {

	private int itemId;
	private String itemName;
	private int itemCost;
	
	public ShoppingDetails(){}
	
	
	@Override
	public String toString() {
		return "ShoppingDetails [itemId=" + itemId + ", itemName=" + itemName
				+ ", itemCost=" + itemCost + "]";
	}


	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCost() {
		return itemCost;
	}
	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}
	
	
}
