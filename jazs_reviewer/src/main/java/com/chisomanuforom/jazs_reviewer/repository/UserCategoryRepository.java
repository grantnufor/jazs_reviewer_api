package com.chisomanuforom.jazs_reviewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.jazs_reviewer.entity.UserCategory;

@Repository
public interface UserCategoryRepository extends JpaRepository<UserCategory, Short>{

	
	Optional<UserCategory> findUserCategoryByCategoryName(String categoryName);
	
	
}
