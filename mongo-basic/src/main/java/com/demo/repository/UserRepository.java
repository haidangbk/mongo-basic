package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.demo.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
	@Query("{'_id': ?0}")
	User findUserById(String id);
	
	void updateUser(User user);
}
