package com.chisomanuforom.jazs_reviewer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.jazs_reviewer.entity.QuestionOption;
import com.chisomanuforom.jazs_reviewer.repository.QuestionOptionRepository;

@Service
public class QuestionOptionService {
	
	
	private final QuestionOptionRepository questionOptionRepository;

	public QuestionOptionService(QuestionOptionRepository questionOptionRepository) {
		super();
		this.questionOptionRepository = questionOptionRepository;
	}
	
	public List<QuestionOption> getQuestionOptions(){
		
		return questionOptionRepository.findAll();
	}
	
	
	
	public Optional<QuestionOption> getQuestionOptionById(Long questionOptionId){
		
		return questionOptionRepository.findById(questionOptionId);
		
	}
	
	
	
	public Optional<QuestionOption> findQuestionOptionByQuestionId(Long questionId) {
		
		return questionOptionRepository.findQuestionOptionByQuestionId(questionId);
		
	}
	
	
	public Optional<QuestionOption> findQuestionOptionByQuestionIdAndOptionName(long questionId, String optionName) {
		
		return questionOptionRepository.findQuestionOptionByQuestionIdAndOptionName(questionId, optionName);
	}
	


	public void addQuestionOption(QuestionOption questionOption) {
		
		Optional<QuestionOption> questionOptionByQuestionOptionId = questionOptionRepository.findById(questionOption.getQuestionOptionId());
		
		if(!questionOptionByQuestionOptionId.isPresent()) {
			
			questionOptionRepository.save(questionOption);
			
		}
		else {
			
			throw new IllegalStateException("Question Option with Question Option Id "+questionOption.getQuestionOptionId()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateQuestionOption(QuestionOption questionOption) {
		// TODO Auto-generated method stub
		Optional<QuestionOption> questionOptionByQuestionOptionId = questionOptionRepository.findById(questionOption.getQuestionOptionId());
		
		if(questionOptionByQuestionOptionId.isPresent()) {
			
			questionOptionRepository.save(questionOption);
			
		}
		else {
			
			throw new IllegalStateException("Question Option with Question Option Id "+questionOption.getQuestionOptionId()+" does not exists.");
			
		}
		
		
	}
	
	
	public void deleteQuestionOption(Long questionOptionId) {
		// TODO Auto-generated method stub
		Optional<QuestionOption> questionOption = questionOptionRepository.findById(questionOptionId);
		
		if(questionOption.isPresent()) {
			
			questionOptionRepository.deleteById(questionOption.get().getQuestionOptionId());
			
		}
		else {
			
			throw new IllegalStateException("Question Option with Question Option Id "+questionOption.get().getQuestionOptionId()+" does not exists.");
			
		}
		
		
	}
	

}
