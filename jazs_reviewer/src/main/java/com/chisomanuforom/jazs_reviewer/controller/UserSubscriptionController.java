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

import com.chisomanuforom.jazs_reviewer.entity.UserSubscription;
import com.chisomanuforom.jazs_reviewer.service.UserSubscriptionService;



@RestController
@RequestMapping("/UserSubscription")
public class UserSubscriptionController {

	
	private final UserSubscriptionService userSubscriptionService;

	@Autowired
	public UserSubscriptionController(UserSubscriptionService userSubscriptionService) {
		super();
		this.userSubscriptionService = userSubscriptionService;
	}
	
	
	@GetMapping
	public List<UserSubscription> getUserSubscriptions(){
		
		return userSubscriptionService.getUserSubscriptions();
		
	}
	
	

	
	@GetMapping("/{userSubscriptionId}")
	public Optional<UserSubscription> getUserAnswerByUserSubscriptionId(@PathVariable long userSubscriptionId)
	{
		return userSubscriptionService.getUserSubscriptionById(userSubscriptionId);	
		
	}
	
	
	
	@GetMapping("/{userId}")
	public Optional<UserSubscription> getUserSubscriptionByUserId(@PathVariable long userId)
	{
		return userSubscriptionService.findUserSubscriptionByUserId(userId);	
		
	}
	

	
	
	@PostMapping
	public void registerUserSubscription(@RequestBody UserSubscription userSubscription) {
		
		userSubscriptionService.addUserSubscription(userSubscription);
		
	}
	
	
	@PostMapping
	public void updateUserSubscription(@RequestBody UserSubscription userSubscription) {
		
		userSubscriptionService.updateUserSubscription(userSubscription);
		
	}
	
	
	
	@PostMapping("/{userSubscriptionId}")
	public String deleteUserSubscription(@PathVariable long userSubscriptionId) {
		
		userSubscriptionService.deleteUserSubscription(userSubscriptionId);
		
		return "User Subscription has been deleted with id ="+userSubscriptionId;
		
	}

	
}
