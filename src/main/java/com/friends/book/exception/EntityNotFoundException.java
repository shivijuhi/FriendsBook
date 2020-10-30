package com.friends.book.exception;

public class EntityNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 8510896340223495099L;
	private final String errorMessage;

	public EntityNotFoundException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
