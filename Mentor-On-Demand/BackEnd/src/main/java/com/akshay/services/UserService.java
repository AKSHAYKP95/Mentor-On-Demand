package com.akshay.services;

import java.util.List;

import com.akshay.pojo.User;

public interface UserService {
	  User create(User user);
	  User delete(int id);
	  List<User> findAll();
	  User findById(int id);
	  User update (User user);
	User findUser(String email, String password);
	String check(String userName);

}
