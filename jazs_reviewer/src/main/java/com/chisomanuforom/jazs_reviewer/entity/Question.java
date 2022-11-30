package com.chisomanuforom.jazs_reviewer.entity;

import java.util.Arrays;

public class Question {
	
	private long questionId;
	private short questionNumber;
	private String questionDetail;
	private byte[] image;
	private String answer;
	private String explanation;
	private short examId;
	private String dateCreated;
	private String dateLastUpdated;
	private int createdBy;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionNumber=" + questionNumber + ", questionDetail="
				+ questionDetail + ", image=" + Arrays.toString(image) + ", answer=" + answer + ", explanation="
				+ explanation + ", examId=" + examId + ", dateCreated=" + dateCreated + ", dateLastUpdated="
				+ dateLastUpdated + ", createdBy=" + createdBy + "]";
	}





	public Question(long questionId, short questionNumber, String questionDetail, byte[] image, String answer,
			String explanation, short examId, String dateCreated, String dateLastUpdated, int createdBy) {
		super();
		this.questionId = questionId;
		this.questionNumber = questionNumber;
		this.questionDetail = questionDetail;
		this.image = image;
		this.answer = answer;
		this.explanation = explanation;
		this.examId = examId;
		this.dateCreated = dateCreated;
		this.dateLastUpdated = dateLastUpdated;
		this.createdBy = createdBy;
	}





	public long getQuestionId() {
		return questionId;
	}





	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}





	public short getQuestionNumber() {
		return questionNumber;
	}





	public void setQuestionNumber(short questionNumber) {
		this.questionNumber = questionNumber;
	}





	public String getQuestionDetail() {
		return questionDetail;
	}





	public void setQuestionDetail(String questionDetail) {
		this.questionDetail = questionDetail;
	}





	public byte[] getImage() {
		return image;
	}





	public void setImage(byte[] image) {
		this.image = image;
	}





	public String getAnswer() {
		return answer;
	}





	public void setAnswer(String answer) {
		this.answer = answer;
	}





	public String getExplanation() {
		return explanation;
	}





	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}





	public short getExamId() {
		return examId;
	}





	public void setExamId(short examId) {
		this.examId = examId;
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





	public int getCreatedBy() {
		return createdBy;
	}





	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	
	
	


	
	
	
	
	
	

}
