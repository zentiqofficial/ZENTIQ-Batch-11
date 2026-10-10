package com.zentiq.Error;

public class ExceptionInInitializerErrorTest {

	    // Static variable is initialized when the class is initialized.
	    // JVM tries to execute: 10 / 0
	    // Division by zero causes ArithmeticException.
	    //
	    // Because the exception occurs during static initialization,
	    // JVM throws ExceptionInInitializerError.

	    static int value = 10 / 0;

	    public static void main(String[] args) {

	        // main() is not reached successfully because
	        // the class initialization already failed.
	        System.out.println(value);
	    }
	}