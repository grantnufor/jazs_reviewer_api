package com.chisomanuforom.jazs_reviewer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.jazs_reviewer.entity.UserAnswer;
import com.chisomanuforom.jazs_reviewer.entity.UserCategory;
import com.chisomanuforom.jazs_reviewer.repository.UserAnswerRepository;
import com.chisomanuforom.jazs_reviewer.repository.UserCategoryRepository;


@Service
public class UserCategoryService {
	
	

	private final UserCategoryRepository userCategoryRepository;

	public UserCategoryService(UserCategoryRepository userCategoryRepository) {
		super();
		this.userCategoryRepository = userCategoryRepository;
	}
	
	public List<UserCategory> getUserCategories(){
		
		return userCategoryRepository.findAll();
	}
	
	
	
	public Optional<UserCategory> getUserCategoryById(short userCategoryId){
		
		return userCategoryRepository.findById(userCategoryId);
		
	}
	
	
	
	public Optional<UserCategory> findUserCategoryByCategoryName(String categoryName) {
		
		return userCategoryRepository.findUserCategoryByCategoryName(categoryName);
		
	}
	


	public void addUserCategory(UserCategory userCategory) {
		
		Optional<UserCategory> userCategoryByUserCategoryId = userCategoryRepository.findById(userCategory.getUserCategoryId());
		
		if(!userCategoryByUserCategoryId.isPresent()) {
			
			userCategoryRepository.save(userCategory);
			
		}
		else {
			
			throw new IllegalStateException("User Category with User Category Id "+userCategoryByUserCategoryId.get().getUserCategoryId()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateUserCategory(UserCategory userCategory) {
		// TODO Auto-generated method stub
		
		Optional<UserCategory> userCategoryByUserCategoryId = userCategoryRepository.findById(userCategory.getUserCategoryId());
		
		if(userCategoryByUserCategoryId.isPresent()) {
			
			userCategoryRepository.save(userCategory);
			
		}
		else {
			
			throw new IllegalStateException("User Category with User Category Id "+userCategoryByUserCategoryId.get().getUserCategoryId()+" does not exists.");
			
		}

		
	}
	
	
	public void deleteUserCategory(short userCategoryId) {
		
		Optional<UserCategory> userCategoryByUserCategoryId = userCategoryRepository.findById(userCategoryId);
		
		if(userCategoryByUserCategoryId.isPresent()) {
			
			userCategoryRepository.deleteById(userCategoryByUserCategoryId.get().getUserCategoryId());
			
		}
		else {
			
			throw new IllegalStateException("User Category with User Category Id "+userCategoryByUserCategoryId.get().getUserCategoryId()+" does not exists.");
			
		}


		
		
	}

}
