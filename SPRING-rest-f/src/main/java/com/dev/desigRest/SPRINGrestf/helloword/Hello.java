package com.dev.desigRest.SPRINGrestf.helloword;

public class Hello {
	
	private String message;

	public Hello(String message) {
		super();
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Hello [message=" + message + "]";
	}
	
	

}
