package com.agora.yourform.model.controller.response.error;

public abstract class NestedApiError {

	private String message;

	public NestedApiError() {
		super();
	}

	public NestedApiError(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
