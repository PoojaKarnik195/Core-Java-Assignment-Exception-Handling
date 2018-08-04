
package com.capgemini.exception.test;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.FindFactorial;
import com.capgemini.exception.InvalidInputException;

/**
 * @author Pooja Karnik This program is to find the factorial of a number and
 *         throw an exception if it does not match the criteria
 */
public class Factorial {

	public static void main(String[] args) {

		FindFactorial factorial = new FindFactorial();
		int answer1, answer2, answer3;

		try {

			// prints factorial of 5
			answer1 = factorial.getFactorial(5);
			System.out.println(answer1);

			// gives FactorialException
			answer2 = factorial.getFactorial(566666);
			System.out.println(answer2);

			/*
			 * gives InvalidInputException answer3=factorial.getFactorial(1);
			 * System.out.println(answer3);
			 */
		} catch (InvalidInputException e) {
			e.printStackTrace();
		} catch (FactorialException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
