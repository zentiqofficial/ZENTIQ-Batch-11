package com.zentiq.Exception;

public class ArithmeticExceptionHandled {

	public static void main(String[] args) {

		System.out.println("Program started");

		int a = 10;
		int b = 0;

		try {

			int result = a / b;

			System.out.println("Result = " + result);

		} catch (Exception e) {

			System.out.println("Exception handled");
			System.out.println("Cannot divide by zero");

		}
	}
}
