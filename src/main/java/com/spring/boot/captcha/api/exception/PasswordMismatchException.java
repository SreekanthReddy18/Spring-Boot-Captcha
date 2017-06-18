package com.spring.boot.captcha.api.exception;

public class PasswordMismatchException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4616872540319908333L;

	public PasswordMismatchException(String message) {
		super(message);
	}

}
