package com.chisomanuforom.jazs_reviewer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.jazs_reviewer.entity.UserAnswer;
import com.chisomanuforom.jazs_reviewer.repository.UserAnswerRepository;


@Service
public class UserAnswerService {
	
	
	private final UserAnswerRepository userAnswerRepository;

	public UserAnswerService(UserAnswerRepository userAnswerRepository) {
		super();
		this.userAnswerRepository = userAnswerRepository;
	}
	
	public List<UserAnswer> getUserAnswers(){
		
		return userAnswerRepository.findAll();
	}
	
	
	
	public Optional<UserAnswer> getUserAnswerById(long userAnswerId){
		
		return userAnswerRepository.findById(userAnswerId);
		
	}
	
	
	
	public Optional<UserAnswer> findUserAnswerByUserIdAndQuestionId(long userId, long questionId) {
		
		return userAnswerRepository.findUserAnswerByUserIdAndQuestionId(userId, questionId);
		
	}
	


	public void addUserAnswer(UserAnswer userAnswer) {
		
		Optional<UserAnswer> userAnswerByUserAnswerId = userAnswerRepository.findById(userAnswer.getUserAnswerId());
		
		if(!userAnswerByUserAnswerId.isPresent()) {
			
			userAnswerRepository.save(userAnswer);
			
		}
		else {
			
			throw new IllegalStateException("User Answer with User Answer Id "+userAnswerByUserAnswerId.get().getUserAnswerId()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateUserAnswer(UserAnswer userAnswer) {
		// TODO Auto-generated method stub
		Optional<UserAnswer> userAnswerByUserAnswerId = userAnswerRepository.findById(userAnswer.getUserAnswerId());
		
		if(userAnswerByUserAnswerId.isPresent()) {
			
			userAnswerRepository.save(userAnswer);
			
		}
		else {
			
			throw new IllegalStateException("User Answer with User Answer Id "+userAnswerByUserAnswerId.get().getUserAnswerId()+" does not exists.");
			
		}

		
	}
	
	
	public void deleteUserAnswer(long userAnswerId) {
		// TODO Auto-generated method stub
		Optional<UserAnswer> userAnswerByUserAnswerId = userAnswerRepository.findById(userAnswerId);
		
		if(userAnswerByUserAnswerId.isPresent()) {
			
			userAnswerRepository.deleteById(userAnswerByUserAnswerId.get().getUserAnswerId());
			
		}
		else {
			
			throw new IllegalStateException("User Answer with User Answer Id "+userAnswerByUserAnswerId.get().getUserAnswerId()+" does not exists.");
			
		}

		
		
	}
	

}
