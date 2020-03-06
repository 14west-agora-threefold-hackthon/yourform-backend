package com.agora.yourform.exception;

public class EntityExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EntityExistsException() {
		super();
	}

	public EntityExistsException(String message) {
		super(message);
	}

	public EntityExistsException(Throwable ex) {
		super(ex);
	}

	public EntityExistsException(String message, Throwable ex) {
		super(message, ex);
	}
}
