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

import com.chisomanuforom.jazs_reviewer.entity.Question;
import com.chisomanuforom.jazs_reviewer.service.QuestionService;



@RestController
@RequestMapping("/Question")
public class QuestionController {
	
	private final QuestionService questionService;

	@Autowired
	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}
	
	
	@GetMapping
	public List<Question> getQuestions(){
		
		return questionService.getQuestions();
		
	}
	
	
	@GetMapping("/{questionId}")
	public Optional<Question> getQuestionByQuestionId(@PathVariable long questionId)
	{
		return questionService.getQuestionById(questionId);
		
	}
	
	
	
	@GetMapping("/{examId}")
	public Optional<Question> getQuestionByExamId(@PathVariable Short examId)
	{
		return questionService.findQuestionByExamId(examId);
		
	}
	
	
	@GetMapping("/{examId}")
	public Optional<Question> findQuestionByQuestionIdAndQuestionNumber(@PathVariable long questionId, short questionNumber)
	{
		return questionService.findQuestionByQuestionIdAndQuestionNumber(questionId, questionNumber);
		
	}
	
	
	
	@PostMapping
	public void registerQuestion(@RequestBody Question question) {
		
		questionService.addQuestion(question);
		
	}
	
	
	@PostMapping
	public void updateQuestion(@RequestBody Question question) {
		
		questionService.updateQuestion(question);
		
	}
	
	
	
	@PostMapping("/{questionId}")
	public String deleteQuestion(@PathVariable long questionId) {
		
		questionService.deleteQuestion(questionId);
		
		return "Question has been deleted with id ="+questionId;
		
	}

}
