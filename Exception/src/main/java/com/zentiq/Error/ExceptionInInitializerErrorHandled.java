package com.zentiq.Error;

public class ExceptionInInitializerErrorHandled {

	static int value;

	static void initialize() {

		// Static initialization logic is inside a method.
		// Now the exception can be caught by the caller.

		value = 10 / 0;
	}

	public static void main(String[] args) {

		try {

			initialize();

		} catch (ArithmeticException e) {

			System.out.println("Exception handled");
			System.out.println("Cannot divide by zero");

		}

		System.out.println("Program completed");
	}
}

//Note:
//We cannot directly handle `static int value = 10 / 0;`
//using try-catch inside main(), because static initialization
//happens before the main() method starts.