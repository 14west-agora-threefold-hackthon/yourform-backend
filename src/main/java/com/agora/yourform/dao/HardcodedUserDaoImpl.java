package com.agora.yourform.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.agora.yourform.YourFormApplication;
import com.agora.yourform.model.controller.response.UserInfo;

@Repository
@Profile(YourFormApplication.HARDCODED_LOOKUP_PROFILE)
public class HardcodedUserDaoImpl implements UserDao {

	@Override
	public UserInfo getUserInfoById(Integer id) {
		UserInfo userInfo = new UserInfo();

		if (Integer.valueOf(1).equals(id)) {
			// Long content preferred
			userInfo.setDevice("mobile");
			userInfo.setLocation("New York City, NY");
			userInfo.setShortContentPastViewTimeSeconds(0);
			userInfo.setLongContentPastViewTimeSeconds(2);
			userInfo.setShortAudioPastViewTimeSeconds(0);
			userInfo.setLongAudioPastViewTimeSeconds(3);
			userInfo.setShortVideoPastViewTimeSeconds(0);
			userInfo.setLongVideoPastViewTimeSeconds(4);
		} else if (Integer.valueOf(2).equals(id)) {
			// Short content preferred
			userInfo.setDevice("mobile");
			userInfo.setLocation("Baltimore, MD");
			userInfo.setShortContentPastViewTimeSeconds(2);
			userInfo.setLongContentPastViewTimeSeconds(0);
			userInfo.setShortAudioPastViewTimeSeconds(3);
			userInfo.setLongAudioPastViewTimeSeconds(0);
			userInfo.setShortVideoPastViewTimeSeconds(4);
			userInfo.setLongVideoPastViewTimeSeconds(0);
		} else if (Integer.valueOf(3).equals(id)) {
			// Short video only
			userInfo.setDevice("mobile");
			userInfo.setLocation("Sacramento, CA");
			userInfo.setShortVideoPastViewTimeSeconds(5);
			userInfo.setLongVideoPastViewTimeSeconds(0);
		} else if (Integer.valueOf(4).equals(id)) {
			// Audio only
			userInfo.setDevice("mobile");
			userInfo.setLocation("Austin, TX");
			userInfo.setShortAudioPastViewTimeSeconds(5);
			userInfo.setLongAudioPastViewTimeSeconds(1);
		}

		return userInfo;
	}
}
