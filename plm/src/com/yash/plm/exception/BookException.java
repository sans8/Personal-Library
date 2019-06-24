package com.yash.plm.exception;

/**
 * This class handles book related exception.
 */
public class BookException extends Exception{
	public BookException()	{
		super();
	}
	
	public BookException(String errMsg) {
		super(errMsg);
	}
}
