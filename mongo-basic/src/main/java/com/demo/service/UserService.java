package com.demo.service;

import java.util.List;

import com.demo.entities.User;

public interface UserService {
	public List<User> findAll();

	public User findUserById(String id);
	
	public void addUser(User user);
	
	public void updateUser(User user);
}
