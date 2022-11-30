package com.chisomanuforom.jazs_reviewer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chisomanuforom.jazs_reviewer.entity.UserAnswer;
import com.chisomanuforom.jazs_reviewer.service.UserAnswerService;



@RestController
@RequestMapping("/UserAnswer")
public class UserAnswerController {
	
	
	private final UserAnswerService userAnswerService;

	@Autowired
	public UserAnswerController(UserAnswerService userAnswerService) {
		super();
		this.userAnswerService = userAnswerService;
	}
	
	
	@GetMapping
	public List<UserAnswer> getUserAnswers(){
		
		return userAnswerService.getUserAnswers();
		
	}
	
	

	
	@GetMapping("/{userId}")
	public Optional<UserAnswer> getUserAnswerByUserAnswerId(@PathVariable long userAnswerId)
	{
		return userAnswerService.getUserAnswerById(userAnswerId);	
		
	}
	
	
	
	@GetMapping("/{userId}/{questionId}")
	public Optional<UserAnswer> getUserAnswerByUserIdAndQuestionId(@PathVariable long userId, @PathVariable long questionId)
	{
		return userAnswerService.findUserAnswerByUserIdAndQuestionId(userId, questionId);	
		
	}
	

	
	
	@PostMapping
	public void registerUserAnswer(@RequestBody UserAnswer userAnswer) {
		
		userAnswerService.addUserAnswer(userAnswer);
		
	}
	
	
	@PostMapping
	public void updateUserAnswer(@RequestBody UserAnswer userAnswer) {
		
		userAnswerService.updateUserAnswer(userAnswer);
		
	}
	
	
	
	@PostMapping("/{userAnswerId}")
	public String deleteUserAnswer(@PathVariable long userAnswerId) {
		
		userAnswerService.deleteUserAnswer(userAnswerId);
		
		return "User Answer has been deleted with id ="+userAnswerId;
		
	}


}
