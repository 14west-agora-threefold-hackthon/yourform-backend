package com.agora.yourform.dao;

import com.agora.yourform.model.controller.response.UserInfo;

public interface UserDao {

	UserInfo getUserInfoById(Integer id);

	void createUser(UserInfo userInfo);

}
