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

import com.chisomanuforom.jazs_reviewer.entity.Exam;
import com.chisomanuforom.jazs_reviewer.service.ExamService;


@RestController
@RequestMapping("/Exam")
public class ExamController {
	
	private final ExamService examService;

	@Autowired
	public ExamController(ExamService examService) {
		super();
		this.examService = examService;
	}
	
	
	@GetMapping
	public List<Exam> getExams(){
		
		return examService.getExams();
		
	}
	
	

	
	@GetMapping("/{examId}")
	public Optional<Exam> getExamByExamId(@PathVariable short examId)
	{
		return examService.getExamById(examId);
		
	}
	
	
	
	@GetMapping("getByExamName/{examName}")
	public Optional<Exam> getExamByExamName(@PathVariable String examName)
	{
		return examService.getExamByExamName(examName);
		
	}
	
	
	
	@PostMapping
	public void registerExam(@RequestBody Exam exam) {
		
		examService.addExam(exam);
		
	}
	
	
	
	@PostMapping("/{examId}")
	public String deleteExam(@PathVariable short examId) {
		
		examService.deleteExam(examId);
		
		return "Exam has been deleted with id ="+examId;
		
	}

}
