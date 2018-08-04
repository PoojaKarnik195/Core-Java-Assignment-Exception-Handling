
package com.capgemini.exception;

//invalid input exception class
public class InvalidInputException extends Exception {

	private static final long serialVersionUID = 809672876402342390L;

	public InvalidInputException(String message) {
		super(message);
	}
}
