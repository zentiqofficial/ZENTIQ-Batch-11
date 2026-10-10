package com.zentiq.Error;

public class StackOverflowErrorHandled {

	static void test() {

		System.out.println("test() method called");

		test(); // method calls itself again
	}

	public static void main(String[] args) {

		System.out.println("Program started");

		try {

			test();

		} catch (StackOverflowError e) {

			System.out.println("StackOverflowError handled");
			System.out.println("Error: " + e);

		}

		System.out.println("Program completed");
	}
}

//Error can be handled using catch,
//but developers normally do not handle it
//because it is usually not a normal coding problem.
//It can occur because of JVM or system resource problems.
//Error can be handled, but developers normally do not handle it because it indicates a serious JVM or system-level problem.