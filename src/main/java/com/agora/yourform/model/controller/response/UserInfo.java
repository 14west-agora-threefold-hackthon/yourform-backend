package com.agora.yourform.model.controller.response;

public class UserInfo {

	private String location;

	private String device;

	private Integer shortVideoPastViewTimeSeconds = Integer.valueOf(0);

	private Integer longVideoPastViewTimeSeconds = Integer.valueOf(0);

	private Integer shortContentPastViewTimeSeconds = Integer.valueOf(0);

	private Integer longContentPastViewTimeSeconds = Integer.valueOf(0);

	private Integer shortAudioPastViewTimeSeconds = Integer.valueOf(0);

	private Integer longAudioPastViewTimeSeconds = Integer.valueOf(0);

	public UserInfo() {
		super();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public Integer getShortVideoPastViewTimeSeconds() {
		return shortVideoPastViewTimeSeconds;
	}

	public void setShortVideoPastViewTimeSeconds(Integer shortVideoPastViewTimeSeconds) {
		this.shortVideoPastViewTimeSeconds = shortVideoPastViewTimeSeconds;
	}

	public Integer getLongVideoPastViewTimeSeconds() {
		return longVideoPastViewTimeSeconds;
	}

	public void setLongVideoPastViewTimeSeconds(Integer longVideoPastViewTimeSeconds) {
		this.longVideoPastViewTimeSeconds = longVideoPastViewTimeSeconds;
	}

	public Integer getShortContentPastViewTimeSeconds() {
		return shortContentPastViewTimeSeconds;
	}

	public void setShortContentPastViewTimeSeconds(Integer shortContentPastViewTimeSeconds) {
		this.shortContentPastViewTimeSeconds = shortContentPastViewTimeSeconds;
	}

	public Integer getLongContentPastViewTimeSeconds() {
		return longContentPastViewTimeSeconds;
	}

	public void setLongContentPastViewTimeSeconds(Integer longContentPastViewTimeSeconds) {
		this.longContentPastViewTimeSeconds = longContentPastViewTimeSeconds;
	}

	public Integer getShortAudioPastViewTimeSeconds() {
		return shortAudioPastViewTimeSeconds;
	}

	public void setShortAudioPastViewTimeSeconds(Integer shortAudioPastViewTimeSeconds) {
		this.shortAudioPastViewTimeSeconds = shortAudioPastViewTimeSeconds;
	}

	public Integer getLongAudioPastViewTimeSeconds() {
		return longAudioPastViewTimeSeconds;
	}

	public void setLongAudioPastViewTimeSeconds(Integer longAudioPastViewTimeSeconds) {
		this.longAudioPastViewTimeSeconds = longAudioPastViewTimeSeconds;
	}
}
