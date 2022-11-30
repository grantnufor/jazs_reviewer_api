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

import com.chisomanuforom.jazs_reviewer.entity.UserCategory;
import com.chisomanuforom.jazs_reviewer.service.UserCategoryService;



@RestController
@RequestMapping("/UserCategory")
public class UserCategoryController {
	
	
	private final UserCategoryService userCategoryService;

	@Autowired
	public UserCategoryController(UserCategoryService userCategoryService) {
		super();
		this.userCategoryService = userCategoryService;
	}
	
	
	@GetMapping
	public List<UserCategory> getUserCategories(){
		
		return userCategoryService.getUserCategories();
		
	}
	
	

	
	@GetMapping("/{userCategoryId}")
	public Optional<UserCategory> getUserCategoryByUserCategoryId(@PathVariable short userCategoryId)
	{
		return userCategoryService.getUserCategoryById(userCategoryId);	
		
	}
	
	
	
	@GetMapping("/{categoryName}")
	public Optional<UserCategory>  findUserCategoryByCategoryName(@PathVariable String categoryName)
	{
		return userCategoryService.findUserCategoryByCategoryName(categoryName);	
		
	}
	
	

	
	@PostMapping
	public void registerUserCategory(@RequestBody UserCategory userCategory) {
		
		userCategoryService.addUserCategory(userCategory);
		
	}
	
	
	@PostMapping
	public void updateUserCategory(@RequestBody UserCategory userCategory) {
		
		userCategoryService.addUserCategory(userCategory);
		
	}
	
	
	
	@PostMapping("/{userCategoryId}")
	public String deleteUserCategory(@PathVariable short userCategoryId) {
		
		userCategoryService.deleteUserCategory(userCategoryId);
		
		return "User Category has been deleted with id ="+userCategoryId;
		
	}


}
