package com.chisomanuforom.jazs_reviewer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.chisomanuforom.jazs_reviewer.entity.UserSubscription;
import com.chisomanuforom.jazs_reviewer.repository.UserSubscriptionRepository;

@Service
public class UserSubscriptionService {
	
	private final UserSubscriptionRepository UserSubscriptionRepository;

	public UserSubscriptionService(UserSubscriptionRepository UserSubscriptionRepository) {
		super();
		this.UserSubscriptionRepository = UserSubscriptionRepository;
	}
	
	public List<UserSubscription> getUserSubscriptions(){
		
		return UserSubscriptionRepository.findAll();
	}
	
	
	
	public Optional<UserSubscription> getUserSubscriptionById(long UserSubscriptionId){
		
		return UserSubscriptionRepository.findById(UserSubscriptionId);
		
	}
	
	
	
	public Optional<UserSubscription> findUserSubscriptionByUserId(long userId) {
		
		return UserSubscriptionRepository.findUserSubscriptionByUserId(userId);
		
	}
	


	public void addUserSubscription(UserSubscription UserSubscription) {
		
		Optional<UserSubscription> UserSubscriptionByUserSubscriptionId = UserSubscriptionRepository.findById(UserSubscription.getUserSubscriptionId());
		
		if(!UserSubscriptionByUserSubscriptionId.isPresent()) {
			
			UserSubscriptionRepository.save(UserSubscription);
			
		}
		else {
			
			throw new IllegalStateException("User Subscription with User Subscription Id "+UserSubscriptionByUserSubscriptionId.get().getUserSubscriptionId()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateUserSubscription(UserSubscription UserSubscription) {
		// TODO Auto-generated method stub
		Optional<UserSubscription> UserSubscriptionByUserSubscriptionId = UserSubscriptionRepository.findById(UserSubscription.getUserSubscriptionId());
		
		if(UserSubscriptionByUserSubscriptionId.isPresent()) {
			
			UserSubscriptionRepository.save(UserSubscription);
			
		}
		else {
			
			throw new IllegalStateException("User Subscription with User Subscription Id "+UserSubscriptionByUserSubscriptionId.get().getUserSubscriptionId()+" does not exists.");
			
		}

		
	}
	
	
	public void deleteUserSubscription(long UserSubscriptionId) {
		// TODO Auto-generated method stub
		Optional<UserSubscription> UserSubscriptionByUserSubscriptionId = UserSubscriptionRepository.findById(UserSubscriptionId);
		
		if(UserSubscriptionByUserSubscriptionId.isPresent()) {
			
			UserSubscriptionRepository.deleteById(UserSubscriptionByUserSubscriptionId.get().getUserSubscriptionId());
			
		}
		else {
			
			throw new IllegalStateException("User Subscription with User Subscription Id "+UserSubscriptionByUserSubscriptionId.get().getUserSubscriptionId()+" does not exists.");
			
		}

		
		
	}

}
