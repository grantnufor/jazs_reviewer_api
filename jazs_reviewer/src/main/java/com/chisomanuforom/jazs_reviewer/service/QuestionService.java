package com.chisomanuforom.jazs_reviewer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.jazs_reviewer.entity.Question;
import com.chisomanuforom.jazs_reviewer.repository.QuestionRepository;

@Service
public class QuestionService {
	
	
	private final QuestionRepository questionRepository;

	public QuestionService(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}
	
	public List<Question> getQuestions(){
		
		return questionRepository.findAll();
	}
	
	
	
	public Optional<Question> getQuestionById(Long questionId){
		
		return questionRepository.findById(questionId);
		
	}
	
	
	
	public Optional<Question> findQuestionByExamId(short examId) {
		
		return questionRepository.findQuestionByExamId(examId);
		
	}
	
	
	public Optional<Question> findQuestionByQuestionIdAndQuestionNumber(long questionId, short questionNumber) {
		
		return questionRepository.findQuestionByQuestionIdAndQuestionNumber(questionId, questionNumber);
	}
	


	public void addQuestion(Question question) {
		
		Optional<Question> questionByQuestionId = questionRepository.findById(question.getQuestionId());
		
		if(!questionByQuestionId.isPresent()) {
			
			questionRepository.save(question);
			
		}
		else {
			
			throw new IllegalStateException("Question with Question Id "+question.getQuestionId()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateQuestion(Question question) {
		// TODO Auto-generated method stub
		Optional<Question> questionByQuestionId = questionRepository.findById(question.getQuestionId());
		
		if(questionByQuestionId.isPresent()) {
			
			questionRepository.save(question);
			
		}
		else {
			
			throw new IllegalStateException("Question with Question Id "+question.getQuestionId()+" does not exists.");
			
		}
		
		
	}
	
	
	public void deleteQuestion(Long questionId) {
		// TODO Auto-generated method stub
		Optional<Question> question = questionRepository.findById(questionId);
		
		if(question.isPresent()) {
			
			questionRepository.deleteById(question.get().getQuestionId());
			
		}
		else {
			
			throw new IllegalStateException("Question with Question Id "+question.get().getQuestionId()+" does not exists.");
			
		}
		
		
	}
	

}
