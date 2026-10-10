package com.zentiq.HandledExceptionUsingThrow;

public class ArithmeticExceptionHandler {

	public static void main(String[] args) {

		try {
			int age = 15;

			if (age < 18) {
				throw new ArithmeticException("Age is less than 18");
			}

			System.out.println("Eligible");

		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		}

		System.out.println("Program completed");
	}
}
