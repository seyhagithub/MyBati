package com.kshrd.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kshrd.model.User;
import com.kshrd.repositories.UserRepository;
import com.kshrd.services.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.insertUser(user);
	}

	@Override
	public ArrayList<User> listUser() {
		// TODO Auto-generated method stub
		return userRepo.listUser();
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.updateUser(user);
	}

	@Override
	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return userRepo.deleteUser(userId);
	}

}
