package com.chisomanuforom.jazs_reviewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.jazs_reviewer.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
	
   Optional<Question> findQuestionByExamId(short examId);
   Optional<Question> findQuestionByQuestionIdAndQuestionNumber(long questionId, short questionNumber);

}
