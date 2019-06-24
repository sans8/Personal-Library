package com.yash.plm.exception;

public class UserException extends Exception {
	private static final long serialVersionUID = 1L;

	public UserException() {
		
	}
	
	public UserException(String errMsg) {
		super(errMsg);
	}
}
