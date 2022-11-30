package com.chisomanuforom.jazs_reviewer.entity;

public class UserAnswer {
	
	private long userAnswerId;
	private long questionOptionId;
	private long questionId;
	private int userId;
	
	
	
	
	
	public UserAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}





	@Override
	public String toString() {
		return "UserAnswer [userAnswerId=" + userAnswerId + ", questionOptionId=" + questionOptionId + ", questionId="
				+ questionId + ", userId=" + userId + "]";
	}





	public UserAnswer(long userAnswerId, long questionOptionId, long questionId, int userId) {
		super();
		this.userAnswerId = userAnswerId;
		this.questionOptionId = questionOptionId;
		this.questionId = questionId;
		this.userId = userId;
	}





	public long getUserAnswerId() {
		return userAnswerId;
	}





	public void setUserAnswerId(long userAnswerId) {
		this.userAnswerId = userAnswerId;
	}





	public long getQuestionOptionId() {
		return questionOptionId;
	}





	public void setQuestionOptionId(long questionOptionId) {
		this.questionOptionId = questionOptionId;
	}





	public long getQuestionId() {
		return questionId;
	}





	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}





	public int getUserId() {
		return userId;
	}





	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	

}
