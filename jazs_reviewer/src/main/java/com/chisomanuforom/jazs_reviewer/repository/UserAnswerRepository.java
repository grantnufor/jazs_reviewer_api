package com.chisomanuforom.jazs_reviewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.jazs_reviewer.entity.UserAnswer;

@Repository
public interface UserAnswerRepository  extends JpaRepository<UserAnswer, Long>{
	
	Optional<UserAnswer> findUserAnswerByUserIdAndQuestionId(Long userId, Long questionId);

}
