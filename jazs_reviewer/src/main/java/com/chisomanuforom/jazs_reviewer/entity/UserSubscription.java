package com.chisomanuforom.jazs_reviewer.entity;

public class UserSubscription {
	
	private long userSubscriptionId;
	private String dateOfSubscription;
	private String dateOfExpiration;
	private short periodInMonths;
	private double amountPaid;
	private long userId;
	
	
	
	
	
	
	public UserSubscription() {
		super();
		// TODO Auto-generated constructor stub
	}






	@Override
	public String toString() {
		return "UserSubscription [userSubscriptionId=" + userSubscriptionId + ", dateOfSubscription="
				+ dateOfSubscription + ", dateOfExpiration=" + dateOfExpiration + ", periodInMonths=" + periodInMonths
				+ ", amountPaid=" + amountPaid + ", userId=" + userId + "]";
	}






	public UserSubscription(long userSubscriptionId, String dateOfSubscription, String dateOfExpiration,
			short periodInMonths, double amountPaid, long userId) {
		super();
		this.userSubscriptionId = userSubscriptionId;
		this.dateOfSubscription = dateOfSubscription;
		this.dateOfExpiration = dateOfExpiration;
		this.periodInMonths = periodInMonths;
		this.amountPaid = amountPaid;
		this.userId = userId;
	}






	public long getUserSubscriptionId() {
		return userSubscriptionId;
	}






	public void setUserSubscriptionId(long userSubscriptionId) {
		this.userSubscriptionId = userSubscriptionId;
	}






	public String getDateOfSubscription() {
		return dateOfSubscription;
	}






	public void setDateOfSubscription(String dateOfSubscription) {
		this.dateOfSubscription = dateOfSubscription;
	}






	public String getDateOfExpiration() {
		return dateOfExpiration;
	}






	public void setDateOfExpiration(String dateOfExpiration) {
		this.dateOfExpiration = dateOfExpiration;
	}






	public short getPeriodInMonths() {
		return periodInMonths;
	}






	public void setPeriodInMonths(short periodInMonths) {
		this.periodInMonths = periodInMonths;
	}






	public double getAmountPaid() {
		return amountPaid;
	}






	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}






	public long getUserId() {
		return userId;
	}






	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
	
	
	

}
