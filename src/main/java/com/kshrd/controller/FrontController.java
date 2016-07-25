package com.kshrd.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kshrd.model.User;
import com.kshrd.services.UserService;

@Controller
public class FrontController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/get")
	@ResponseBody
	public ArrayList<User> listUser(){
		return userService.listUser();
	}
	
	@RequestMapping("/add/{name}/{room}")
	@ResponseBody
	public boolean insertUser(@PathVariable("name") String username, @PathVariable("room") String classRoom){
		User u = new User();
		u.setUsername(username);
		u.setClassRoom(classRoom);
		return userService.insertUser(u);
	}
	
	@RequestMapping("/update/{id}/{name}/{room}")
	@ResponseBody
	public boolean updateUser(@PathVariable int id,@PathVariable("name") String username, @PathVariable("room") String classRoom){
		User u = new User();
		u.setId(id);
		u.setUsername(username);
		u.setClassRoom(classRoom);
		return userService.updateUser(u);
	}
	
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public boolean deleteUser(@PathVariable int id){
		return userService.deleteUser(id);
	}

}
