package com.chisomanuforom.jazs_reviewer.entity;

public class User {
	
	private long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	private short userCategoryId;
	private String dateCreated;
	private String dateLastUpdated;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(long userId, String firstName, String lastName, String email, String phoneNumber, String password,
			short userCategoryId, String dateCreated, String dateLastUpdated) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.userCategoryId = userCategoryId;
		this.dateCreated = dateCreated;
		this.dateLastUpdated = dateLastUpdated;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + ", userCategoryId=" + userCategoryId
				+ ", dateCreated=" + dateCreated + ", dateLastUpdated=" + dateLastUpdated + "]";
	}



	public long getUserId() {
		return userId;
	}



	public void setUserId(long userId) {
		this.userId = userId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public short getUserCategoryId() {
		return userCategoryId;
	}



	public void setUserCategoryId(short userCategoryId) {
		this.userCategoryId = userCategoryId;
	}



	public String getDateCreated() {
		return dateCreated;
	}



	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}



	public String getDateLastUpdated() {
		return dateLastUpdated;
	}



	public void setDateLastUpdated(String dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	
	
	
	
	

}
