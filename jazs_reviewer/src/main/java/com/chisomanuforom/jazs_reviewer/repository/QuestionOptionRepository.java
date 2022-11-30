package com.chisomanuforom.jazs_reviewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.jazs_reviewer.entity.QuestionOption;

@Repository
public interface QuestionOptionRepository extends JpaRepository<QuestionOption, Long> {
	
	Optional<QuestionOption> findQuestionOptionByQuestionId(Long questionId);
	Optional<QuestionOption> findQuestionOptionByQuestionIdAndOptionName(Long questionId, String optionName);

}
