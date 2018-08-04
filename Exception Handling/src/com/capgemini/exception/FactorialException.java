package com.capgemini.exception;

//factorial exception class
public class FactorialException extends Exception {

	private static final long serialVersionUID = 3103645374813404345L;

	public FactorialException(String message) {
		super(message);
	}
}