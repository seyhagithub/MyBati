package com.kshrd.services;

import java.util.ArrayList;

import com.kshrd.model.User;

public interface UserService {

	public boolean insertUser(User user);
	public ArrayList<User> listUser();
	public boolean updateUser(User user);
	public boolean deleteUser(int userId);
	
}
