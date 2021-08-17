package com.garvit.testapp.mmdemo.service;

import java.util.Collection;

import com.garvit.testapp.mmdemo.user.User;

public interface UserService {
	User createUser(User user);

	Collection<User> getUsers();
	
	User getUser(String userId);
	
	User updateUser(String userId, User user);
	
	void deleteUser(String userId);
}
