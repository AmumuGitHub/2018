package com.amumu.user.service;

import com.amumu.user.model.User;

public interface IUserService {
	
	public void add(User user);

	public User loadByUserName(String userName);
}
