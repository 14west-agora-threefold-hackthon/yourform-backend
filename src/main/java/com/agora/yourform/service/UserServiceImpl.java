package com.agora.yourform.service;

import org.springframework.stereotype.Service;

import com.agora.yourform.dao.UserDao;
import com.agora.yourform.model.controller.response.UserInfo;

@Service
public class UserServiceImpl implements UserService {

	private final UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public UserInfo getUserInfoById(Integer id) {
		return userDao.getUserInfoById(id);
	}

	@Override
	public void createUser(UserInfo userInfo) {
		userDao.createUser(userInfo);
	}
}
