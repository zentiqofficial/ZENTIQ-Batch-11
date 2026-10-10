package com.zentiq.Error;

public class StackOverflowErrorTest {
	
	static void test() {

		System.out.println("test() method called");

		test(); // method calls itself again
	}

	public static void main(String[] args) {

		System.out.println("Program started");

		test();

		System.out.println("Program completed");
	}
}