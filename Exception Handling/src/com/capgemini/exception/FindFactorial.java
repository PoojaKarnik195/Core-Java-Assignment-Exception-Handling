package com.capgemini.exception;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;

//finding factorial of a number and throwing an exception if it is less than 2 or greater than maximum value of integer
public class FindFactorial {

	public int getFactorial(int num) throws Exception {

		int i, fact = 1;

		if (num < 2) {
			throw new InvalidInputException("Number cannot be less than two");
		} else {
			for (i = 1; i <= num; i++) {
				fact = fact * i;
				if (fact > 0 && ((fact / i) <= 2_147_483_647)) {
					continue;
				} else {
					throw new FactorialException("Factorial value exceeded");
				}
			}
		}
		return fact;
	}
}
