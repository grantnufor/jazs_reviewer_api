package com.chisomanuforom.jazs_reviewer.entity;

import java.util.Arrays;

public class QuestionOption {
	
	private long questionOptionId;
	private String optionName;
	private String detail;
	private byte[] image;
	private long questionId;
	
	
	
	
	
	
	public QuestionOption() {
		super();
		// TODO Auto-generated constructor stub
	}






	@Override
	public String toString() {
		return "QuestionOption [questionOptionId=" + questionOptionId + ", optionName=" + optionName + ", detail="
				+ detail + ", image=" + Arrays.toString(image) + ", questionId=" + questionId + "]";
	}






	public QuestionOption(long questionOptionId, String optionName, String detail, byte[] image, long questionId) {
		super();
		this.questionOptionId = questionOptionId;
		this.optionName = optionName;
		this.detail = detail;
		this.image = image;
		this.questionId = questionId;
	}






	public long getQuestionOptionId() {
		return questionOptionId;
	}






	public void setQuestionOptionId(long questionOptionId) {
		this.questionOptionId = questionOptionId;
	}






	public String getOptionName() {
		return optionName;
	}






	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}






	public String getDetail() {
		return detail;
	}






	public void setDetail(String detail) {
		this.detail = detail;
	}






	public byte[] getImage() {
		return image;
	}






	public void setImage(byte[] image) {
		this.image = image;
	}






	public long getQuestionId() {
		return questionId;
	}






	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	
	
	
	

}
