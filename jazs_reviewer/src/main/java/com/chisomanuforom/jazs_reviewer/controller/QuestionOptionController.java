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

import com.chisomanuforom.jazs_reviewer.entity.QuestionOption;
import com.chisomanuforom.jazs_reviewer.service.QuestionOptionService;


@RestController
@RequestMapping("/QuestionOption")
public class QuestionOptionController {
	

	private final QuestionOptionService questionOptionService;

	@Autowired
	public QuestionOptionController(QuestionOptionService questionOptionService) {
		super();
		this.questionOptionService = questionOptionService;
	}
	
	
	@GetMapping
	public List<QuestionOption> getQuestionOptions(){
		
		return questionOptionService.getQuestionOptions();
		
	}
	
	
	@GetMapping("/{questionOptionId}")
	public Optional<QuestionOption> getQuestionoptionByQuestionOptionId(@PathVariable long questionOptionId)
	{
		return questionOptionService.getQuestionOptionById(questionOptionId);
		
	}
	
	
	
	@GetMapping("/{questionId}")
	public Optional<QuestionOption> getQuestionOptionByQuestionId(@PathVariable long questionId)
	{
		return questionOptionService.findQuestionOptionByQuestionId(questionId);
		
	}
	
	
	@GetMapping("/{examId}")
	public Optional<QuestionOption> getQuestionOptionByQuestionIdAndOptionName(@PathVariable long questionId, String optionName)
	{
		return questionOptionService.findQuestionOptionByQuestionIdAndOptionName(questionId, optionName);
		
	}
	
	
	
	@PostMapping
	public void registerQuestionOption(@RequestBody QuestionOption questionOption) {
		
		questionOptionService.addQuestionOption(questionOption);
		
	}
	
	
	@PostMapping
	public void updateQuestionOption(@RequestBody QuestionOption questionOption) {
		
		questionOptionService.updateQuestionOption(questionOption);
		
	}
	
	
	
	@PostMapping("/{questionOptionId}")
	public String deleteQuestionOption(@PathVariable long questionOptionId) {
		
		questionOptionService.deleteQuestionOption(questionOptionId);
		
		return "Question Option has been deleted with id ="+questionOptionId;
		
	}

}
