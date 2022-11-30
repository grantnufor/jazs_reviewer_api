package com.chisomanuforom.jazs_reviewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.jazs_reviewer.entity.UserSubscription;

@Repository
public interface UserSubscriptionRepository extends JpaRepository<UserSubscription, Long> {

	
	Optional<UserSubscription> findUserSubscriptionByUserId(Long userId);
	
	
}
