package com.dev.desigRest.SPRINGrestf.exception;

import java.util.Date;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionResponse extends ResponseEntityExceptionHandler {

	private Date ts;
	private String message;
	private String details;

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public ExceptionResponse(Date ts, String message, String details) {
		super();
		this.ts = ts;
		this.message = message;
		this.details = details;
	}

}
