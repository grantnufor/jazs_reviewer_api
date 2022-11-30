package com.chisomanuforom.jazs_reviewer.entity;

public class UserCategory {
	
	private short userCategoryId;
	private String categoryName;
	
	
	
	
	@Override
	public String toString() {
		return "UserCategory [userCategoryId=" + userCategoryId + ", categoryName=" + categoryName + "]";
	}




	public UserCategory() {
		super();
		// TODO Auto-generated constructor stub
	}




	public UserCategory(short userCategoryId, String categoryName) {
		super();
		this.userCategoryId = userCategoryId;
		this.categoryName = categoryName;
	}




	public short getUserCategoryId() {
		return userCategoryId;
	}




	public void setUserCategoryId(short userCategoryId) {
		this.userCategoryId = userCategoryId;
	}




	public String getCategoryName() {
		return categoryName;
	}




	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	

	
	
}
