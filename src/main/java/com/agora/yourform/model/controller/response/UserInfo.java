package com.agora.yourform.model.controller.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "location", "device", "shortVideoPastViewTimeSeconds", "longVideoPastViewTimeSeconds",
		"shortContentPastViewTimeSeconds", "longContentPastViewTimeSeconds", "shortAudioPastViewTimeSeconds",
		"longAudioPastViewTimeSeconds", "rows", "schema" })
public class UserInfo {

	private Integer id;

	private String location;

	private String device;

	private Integer shortVideoPastViewTimeSeconds = Integer.valueOf(0);

	private Integer longVideoPastViewTimeSeconds = Integer.valueOf(0);

	private Integer shortContentPastViewTimeSeconds = Integer.valueOf(0);

	private Integer longContentPastViewTimeSeconds = Integer.valueOf(0);

	private Integer shortAudioPastViewTimeSeconds = Integer.valueOf(0);

	private Integer longAudioPastViewTimeSeconds = Integer.valueOf(0);

	private Object[][] rows;

	private UserCallInfo schema;

	public UserInfo() {
		super();
	}

	@JsonIgnore
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Object[][] getRows() {
		return rows;
	}

	public void setRows(Object[][] rows) {
		this.rows = rows;
	}

	public UserCallInfo getSchema() {
		return schema;
	}

	public void setSchema(UserCallInfo schema) {
		this.schema = schema;
	}
}
