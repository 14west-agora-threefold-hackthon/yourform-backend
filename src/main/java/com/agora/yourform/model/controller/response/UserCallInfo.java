package com.agora.yourform.model.controller.response;

public class UserCallInfo {

	private UserCallInfoField[] fields;

	public UserCallInfo() {
		super();
	}

	public UserCallInfo(UserCallInfoField[] fields) {
		super();
		this.fields = fields;
	}

	public UserCallInfoField[] getFields() {
		return fields;
	}

	public void setFields(UserCallInfoField[] fields) {
		this.fields = fields;
	}
}
