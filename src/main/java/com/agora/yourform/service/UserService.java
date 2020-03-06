package com.agora.yourform.service;

import com.agora.yourform.model.controller.response.UserInfo;

public interface UserService {

	UserInfo getUserInfoById(Integer id);

	void createUser(UserInfo userInfo);

}
