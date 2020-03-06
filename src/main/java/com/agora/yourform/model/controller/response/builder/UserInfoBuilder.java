package com.agora.yourform.model.controller.response.builder;

import com.agora.yourform.model.controller.response.UserCallInfo;
import com.agora.yourform.model.controller.response.UserInfo;

public class UserInfoBuilder {

	private final UserInfo userInfo = new UserInfo();

	public UserInfoBuilder() {
		super();
	}

	public UserInfoBuilder setLocation(String location) {
		userInfo.setLocation(location);
		return this;
	}

	public UserInfoBuilder setDevice(String device) {
		userInfo.setDevice(device);
		return this;
	}

	public UserInfoBuilder setShortVideoPastViewTimeSeconds(Integer shortVideoPastViewTimeSeconds) {
		userInfo.setShortVideoPastViewTimeSeconds(shortVideoPastViewTimeSeconds);
		return this;
	}

	public UserInfoBuilder setLongVideoPastViewTimeSeconds(Integer longVideoPastViewTimeSeconds) {
		userInfo.setLongVideoPastViewTimeSeconds(longVideoPastViewTimeSeconds);
		return this;
	}

	public UserInfoBuilder setShortContentPastViewTimeSeconds(Integer shortContentPastViewTimeSeconds) {
		userInfo.setShortContentPastViewTimeSeconds(shortContentPastViewTimeSeconds);
		return this;
	}

	public UserInfoBuilder setLongContentPastViewTimeSeconds(Integer longContentPastViewTimeSeconds) {
		userInfo.setLongContentPastViewTimeSeconds(longContentPastViewTimeSeconds);
		return this;
	}

	public UserInfoBuilder setShortAudioPastViewTimeSeconds(Integer shortAudioPastViewTimeSeconds) {
		userInfo.setShortAudioPastViewTimeSeconds(shortAudioPastViewTimeSeconds);
		return this;
	}

	public UserInfoBuilder setLongAudioPastViewTimeSeconds(Integer longAudioPastViewTimeSeconds) {
		userInfo.setLongAudioPastViewTimeSeconds(longAudioPastViewTimeSeconds);
		return this;
	}

	public UserInfoBuilder setRows(Object[][] rows) {
		userInfo.setRows(rows);
		return this;
	}

	public UserInfoBuilder setSchema(UserCallInfo schema) {
		userInfo.setSchema(schema);
		return this;
	}

	public UserInfo build() {
		return userInfo;
	}
}
