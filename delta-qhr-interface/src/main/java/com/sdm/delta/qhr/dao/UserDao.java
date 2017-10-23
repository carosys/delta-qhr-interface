package com.sdm.delta.qhr.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sdm.delta.qhr.model.User;

public interface UserDao {

	List<User> findAll();

	User findUserById(int id);

	User create(User user);

	boolean isUserExist(User user);

	void saveUser(User user);
	
	void updateUser(User user);

	void deleteUserById(int id);

	void deleteAllUsers();

}