package com.petsshop.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="User not found")
public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
