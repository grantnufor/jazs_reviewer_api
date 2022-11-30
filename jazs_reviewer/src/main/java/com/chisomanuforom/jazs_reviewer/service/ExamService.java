package com.chisomanuforom.jazs_reviewer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.jazs_reviewer.entity.Exam;
import com.chisomanuforom.jazs_reviewer.repository.ExamRepository;

@Service
public class ExamService {
	
	
	private final ExamRepository examRepository;

	public ExamService(ExamRepository examRepository) {
		super();
		this.examRepository = examRepository;
	}
	
	public List<Exam> getExams(){
		
		return examRepository.findAll();
	}
	
	
	
	public Optional<Exam> getExamById(short examId){
		
		return examRepository.findById(examId);
		
	}
	
	
	
	public Optional<Exam> getExamByExamName(String examName) {
		
		return examRepository.findExamByExamName(examName);
		
	}
	


	public void addExam(Exam exam) {
		
		Optional<Exam> examByExamName = examRepository.findExamByExamName(exam.getExamName());
		
		if(!examByExamName.isPresent()) {
			
			examRepository.save(exam);
			
		}
		else {
			
			throw new IllegalStateException("Exam with Exam Name "+exam.getExamName()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateExam(Exam exam) {
		// TODO Auto-generated method stub
		Optional<Exam> examByExamName = examRepository.findExamByExamName(exam.getExamName());
		if(examByExamName.isPresent()) {
			
			examRepository.save(exam);
			
		}
		else {
			

			throw new IllegalStateException("Exam with Exam Name "+exam.getExamName()+" does not exists.");
			
		}
		
		
	}
	
	
	public void deleteExam(short examId) {
		// TODO Auto-generated method stub
		Optional<Exam> exam = examRepository.findById(examId);
		
		if(exam.isPresent()) {
			
			examRepository.deleteById(exam.get().getExamId());
			
		}
		else {
			
			throw new IllegalStateException("Exam with Exam Name "+exam.get().getExamName()+" does not exists.");
			
		}
		
		
	}
	

}
