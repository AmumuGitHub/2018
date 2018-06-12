package com.amumu.user.service;

import com.amumu.user.dao.IUserDao;
import com.amumu.user.model.User;

public class UserService implements IUserService {

	private IUserDao userDao;
	
	public UserService(IUserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public void add(User user) {
		userDao.add(user);

	}

	public User loadByUserName(String userName) {
		return userDao.loadByUserName(userName);
	}

}
