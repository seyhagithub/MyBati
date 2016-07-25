package com.kshrd.repositories;

import java.util.ArrayList;
import java.util.Properties;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.kshrd.model.User;

@Repository
public interface UserRepository {
	
	/*
	 * C 	= CREATE
	 * R	=READ
	 * U	=UPDATE
	 * D	=DELETE
	 */
	
	final String C_USER = "INSERT INTO TBLUSER ( username , class_room) VALUES(#{username} ,#{classRoom} )";
	final String R_USER = "SELECT id, username, class_room FROM TBLUSER WHERE id=#{id};";
	final String U_USER="UPDATE TBLUSER SET username=#{username} , class_room=#{classRoom} WHERE id=#{id}";
	final String D_USER="DELETE FROM TBLUSER WHERE id=#{userId}";
	
	@Insert(C_USER)
	public boolean insertUser(User user);
	
	@Select(R_USER)
	@Results(value={
		  @Result(property="id" , column="id"),
		  @Result(property="username" , column="username"),
		  @Result(property="classRoom" , column="class_room")
	})
	public ArrayList<User> listUser();
	
	@Update(U_USER)
	public boolean updateUser(User user);
	
	@Delete(D_USER)
	public boolean deleteUser(int userId);

}
