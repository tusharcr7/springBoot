package com.dev.desigRest.SPRINGrestf.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4214142576338861189L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
