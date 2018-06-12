package com.amumu.user.dao;

import com.amumu.user.model.User;

public interface IUserDao {
	
	public void add(User user);
	
	public User loadByUserName(String userName);
	
}
