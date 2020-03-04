package com.agora.yourform.service;

import org.springframework.stereotype.Service;

import com.agora.yourform.model.controller.response.UserInfo;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserInfo getUserInfoById(Integer id) {
		UserInfo userInfo = new UserInfo();

		if (Integer.valueOf(1).equals(id)) {
			// Short content preferred
			userInfo.setDevice("desktop");
			userInfo.setLocation("New York, USA");
			userInfo.setShortContentPastViewTimeSeconds(2);
			userInfo.setLongContentPastViewTimeSeconds(0);
			userInfo.setShortAudioPastViewTimeSeconds(3);
			userInfo.setLongAudioPastViewTimeSeconds(0);
			userInfo.setShortVideoPastViewTimeSeconds(4);
			userInfo.setLongVideoPastViewTimeSeconds(0);
		} else if (Integer.valueOf(2).equals(id)) {
			// Long content preferred
			userInfo.setDevice("desktop");
			userInfo.setLocation("New York, USA");
			userInfo.setShortContentPastViewTimeSeconds(0);
			userInfo.setLongContentPastViewTimeSeconds(2);
			userInfo.setShortAudioPastViewTimeSeconds(0);
			userInfo.setLongAudioPastViewTimeSeconds(3);
			userInfo.setShortVideoPastViewTimeSeconds(0);
			userInfo.setLongVideoPastViewTimeSeconds(4);
		}

		return userInfo;
	}
}
