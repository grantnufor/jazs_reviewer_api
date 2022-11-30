package com.chisomanuforom.jazs_reviewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.jazs_reviewer.entity.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Short> {
	
	
	Optional<Exam> findExamByExamName(String examName);
	
	

}
