package com.chisomanuforom.jazs_reviewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.jazs_reviewer.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
Optional<User> findUserByPhoneNumber(String phoneNumber);
	
	Optional<User> findUserByPhoneNumberAndPassword(String phoneNumber, String password);
	
	Optional<User> findUserByEmailAddressAndPassword(String emailAddress, String password);

}
