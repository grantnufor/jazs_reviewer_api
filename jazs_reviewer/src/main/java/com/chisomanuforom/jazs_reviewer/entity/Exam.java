package com.chisomanuforom.jazs_reviewer.entity;

public class Exam {
	
	private short examId;
	private String examName;
	
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Exam(short examId, String examName) {
		super();
		this.examId = examId;
		this.examName = examName;
	}





	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + "]";
	}


	public short getExamId() {
		return examId;
	}


	public void setExamId(short examId) {
		this.examId = examId;
	}


	public String getExamName() {
		return examName;
	}


	public void setExamName(String examName) {
		this.examName = examName;
	}
	
	
	
	
	
	

}
